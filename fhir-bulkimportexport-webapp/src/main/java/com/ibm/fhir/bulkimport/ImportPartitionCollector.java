/*
 * (C) Copyright IBM Corp. 2020
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.fhir.bulkimport;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.batch.api.BatchProperty;
import javax.batch.api.partition.PartitionCollector;
import javax.batch.runtime.BatchStatus;
import javax.batch.runtime.context.StepContext;
import javax.inject.Inject;

import com.ibm.cloud.objectstorage.services.s3.AmazonS3;
import com.ibm.fhir.bulkcommon.BulkDataUtils;
import com.ibm.fhir.bulkcommon.Constants;

public class ImportPartitionCollector implements PartitionCollector {
    private static final Logger logger = Logger.getLogger(ImportPartitionCollector.class.getName());
    AmazonS3 cosClient = null;
    @Inject
    StepContext stepCtx;

    /**
     * The IBM COS API key or S3 access key.
     */
    @Inject
    @BatchProperty(name = Constants.COS_API_KEY)
    String cosApiKeyProperty;

    /**
     * The IBM COS service instance id or S3 secret key.
     */
    @Inject
    @BatchProperty(name = Constants.COS_SRVINST_ID)
    String cosSrvinstId;

    /**
     * The IBM COS or S3 End point URL.
     */
    @Inject
    @BatchProperty(name = Constants.COS_ENDPOINT_URL)
    String cosEndpintUrl;

    /**
     * The IBM COS or S3 location.
     */
    @Inject
    @BatchProperty(name = Constants.COS_LOCATION)
    String cosLocation;

    /**
     * The IBM COS or S3 bucket name for import OperationOutcomes.
     */
    @Inject
    @BatchProperty(name = Constants.COS_OPERATIONOUTCOMES_BUCKET_NAME)
    String cosOperationOutcomesBucketName;

    /**
     * If use IBM credential or S3 secret keys.
     */
    @Inject
    @BatchProperty(name = Constants.COS_IS_IBM_CREDENTIAL)
    String cosCredentialIbm;

    public ImportPartitionCollector() {
    }

    @Override
    public Serializable collectPartitionData() throws Exception{
        ImportTransientUserData partitionSummaryData  = (ImportTransientUserData)stepCtx.getTransientUserData();
        BatchStatus batchStatus = stepCtx.getBatchStatus();

        // If the job is being stopped or in other status except for "started", then do cleanup for the partition.
        if (!batchStatus.equals(BatchStatus.STARTED)) {
            BulkDataUtils.cleanupTransientUserData(partitionSummaryData, true);
            return null;
        }

        // This function is called at partition chunk check points and also at the end of partition processing.
        // So, check the NumOfToBeImported to make sure collect the statistic data for the partition only at the end,
        // also upload the remaining OperationComes to COS/S3 if any and finish the multiple-parts uploads.
        if (partitionSummaryData.getNumOfToBeImported() == 0) {
            if (Constants.IMPORT_IS_COLLECT_OPERATIONOUTCOMES) {
                // Create a COS/S3 client if it's not created yet.
                if (cosClient == null) {
                    cosClient = BulkDataUtils.getCosClient(cosCredentialIbm, cosApiKeyProperty, cosSrvinstId, cosEndpintUrl, cosLocation);

                    if (cosClient == null) {
                        logger.warning("collectPartitionData: Failed to get CosClient!");
                        throw new Exception("Failed to get CosClient!!");
                    } else {
                        logger.finer("collectPartitionData: Succeed get CosClient!");
                    }
                }
                // Upload remaining OperationOutcomes.
                if (partitionSummaryData.getBufferStreamForImport().size() > 0) {
                    if (partitionSummaryData.getUploadId4OperationOutcomes()  == null) {
                        partitionSummaryData.setUploadId4OperationOutcomes(BulkDataUtils.startPartUpload(cosClient,
                                cosOperationOutcomesBucketName, partitionSummaryData.getUniqueID4ImportOperationOutcomes(), true));
                    }

                    partitionSummaryData.getDataPacks4OperationOutcomes().add(BulkDataUtils.multiPartUpload(cosClient,
                            cosOperationOutcomesBucketName, partitionSummaryData.getUniqueID4ImportOperationOutcomes(),
                            partitionSummaryData.getUploadId4OperationOutcomes(), new ByteArrayInputStream(partitionSummaryData.getBufferStreamForImport().toByteArray()),
                            partitionSummaryData.getBufferStreamForImport().size(), partitionSummaryData.getPartNum4OperationOutcomes()));
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine("pushImportOperationOutcomes2COS: " + partitionSummaryData.getBufferStreamForImport().size()
                            + " bytes were successfully appended to COS object - " + partitionSummaryData.getUniqueID4ImportOperationOutcomes());
                    }
                    partitionSummaryData.setPartNum4OperationOutcomes(partitionSummaryData.getPartNum4OperationOutcomes() + 1);
                    partitionSummaryData.getBufferStreamForImport().reset();
                }
                // Finish uploading OperationOutcomes.
                if (partitionSummaryData.getUploadId4OperationOutcomes() != null) {
                    BulkDataUtils.finishMultiPartUpload(cosClient, cosOperationOutcomesBucketName, partitionSummaryData.getUniqueID4ImportOperationOutcomes(),
                            partitionSummaryData.getUploadId4OperationOutcomes(), partitionSummaryData.getDataPacks4OperationOutcomes());
                }

                // Upload remaining failure OperationOutcomes.
                if (partitionSummaryData.getBufferStreamForImportError().size() > 0) {
                    if (partitionSummaryData.getUploadId4FailureOperationOutcomes()  == null) {
                        partitionSummaryData.setUploadId4FailureOperationOutcomes(BulkDataUtils.startPartUpload(cosClient,
                                cosOperationOutcomesBucketName, partitionSummaryData.getUniqueID4ImportFailureOperationOutcomes(), true));
                    }

                    partitionSummaryData.getDataPacks4FailureOperationOutcomes().add(BulkDataUtils.multiPartUpload(cosClient,
                            cosOperationOutcomesBucketName, partitionSummaryData.getUniqueID4ImportFailureOperationOutcomes(),
                            partitionSummaryData.getUploadId4FailureOperationOutcomes(), new ByteArrayInputStream(partitionSummaryData.getBufferStreamForImportError().toByteArray()),
                            partitionSummaryData.getBufferStreamForImportError().size(), partitionSummaryData.getPartNum4FailureOperationOutcomes()));
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine("pushImportOperationOutcomes2COS: " + partitionSummaryData.getBufferStreamForImportError().size()
                            + " bytes were successfully appended to COS object - " + partitionSummaryData.getUniqueID4ImportFailureOperationOutcomes());
                    }
                    partitionSummaryData.setPartNum4FailureOperationOutcomes(partitionSummaryData.getPartNum4FailureOperationOutcomes() + 1);
                    partitionSummaryData.getBufferStreamForImportError().reset();
                }
                // Finish uploading failure OperationOutcomes.
                if (partitionSummaryData.getUploadId4FailureOperationOutcomes() != null) {
                    BulkDataUtils.finishMultiPartUpload(cosClient, cosOperationOutcomesBucketName, partitionSummaryData.getUniqueID4ImportFailureOperationOutcomes(),
                            partitionSummaryData.getUploadId4FailureOperationOutcomes(), partitionSummaryData.getDataPacks4FailureOperationOutcomes());
                }
            }

            // Clean up.
            BulkDataUtils.cleanupTransientUserData(partitionSummaryData, false);

            return ImportCheckPointData.fromImportTransientUserData(partitionSummaryData);
        } else {
            return null;
        }
    }

}

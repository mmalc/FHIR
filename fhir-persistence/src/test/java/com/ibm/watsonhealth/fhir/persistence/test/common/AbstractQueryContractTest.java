/**
 * (C) Copyright IBM Corp. 2016,2017,2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.persistence.test.common;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertTrue;

import java.util.List;

import org.testng.annotations.Test;

import com.ibm.watsonhealth.fhir.model.Contract;
import com.ibm.watsonhealth.fhir.model.Resource;

/**
 *  This class contains a collection of tests that will be run against
 *  each of the various persistence layer implementations.
 *  There will be a subclass in each persistence project.
 */
public abstract class AbstractQueryContractTest extends AbstractPersistenceTest {
	
    /**
     * Tests the FHIRPersistenceCloudantImpl create API for a Contract.
     * 
     * @throws Exception
     */
    @Test(groups = { "cloudant", "jpa" })
    public void testCreateContract() throws Exception {
    	Contract contract = readResource(Contract.class, "contract-example.canonical.json");

    	persistence.create(contract);
        assertNotNull(contract);
        assertNotNull(contract.getId());
        assertNotNull(contract.getId().getValue());
        assertNotNull(contract.getMeta());
        assertNotNull(contract.getMeta().getVersionId().getValue());
        assertEquals("1", contract.getMeta().getVersionId().getValue());
    } 
	
	/**
	 * Tests a query with a resource type but without any query parameters. This should yield all the resources created so far.
	 * @throws Exception
	 */
	@Test(groups = { "cloudant", "jpa" }, dependsOnMethods = { "testCreateContract" })
	public void testContractQuery_noParams() throws Exception {
		List<Resource> resources = runQueryTest(Contract.class, persistence, null, null);
		assertNotNull(resources);
		assertTrue(resources.size() != 0);
	}	
	
	/**
	 * Tests a query for a Contract with patient = 'Patient/example' which should yield correct results
	 * @throws Exception
	 */
	@Test(groups = { "cloudant", "jpa" }, dependsOnMethods = { "testCreateContract" })
	public void testContractQuery_patient() throws Exception {
		List<Resource> resources = runQueryTest(Contract.class, persistence, "patient", "Patient/example");
		assertNotNull(resources);
		assertTrue(resources.size() != 0);
		assertEquals(((Contract)resources.get(0)).getSubject().get(0).getReference().getValue(),"Patient/example");
	}
	
	/**
	 * Tests a query for a Contract with subject = 'Patient/example' which should yield correct results
	 * @throws Exception
	 */
	@Test(groups = { "cloudant", "jpa" }, dependsOnMethods = { "testCreateContract" })
	public void testContractQuery_subject() throws Exception {
		List<Resource> resources = runQueryTest(Contract.class, persistence, "subject", "Patient/example");
		assertNotNull(resources);
		assertTrue(resources.size() != 0);
		assertEquals(((Contract)resources.get(0)).getSubject().get(0).getReference().getValue(),"Patient/example");
	}
}

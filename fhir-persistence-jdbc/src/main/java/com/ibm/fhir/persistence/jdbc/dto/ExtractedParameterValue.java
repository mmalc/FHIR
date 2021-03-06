/*
 * (C) Copyright IBM Corp. 2017,2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.fhir.persistence.jdbc.dto;

import com.ibm.fhir.persistence.exception.FHIRPersistenceException;

/**
 * A search parameter value extracted from a resource and ready to store / index for search
 */
public interface ExtractedParameterValue {

    public void setName(String name);

    public String getName();

    public String getResourceType();
    public void setResourceType(String resourceType);

    /**
     * We know our type, so we can call the correct method on the visitor
     */
    public void accept(ExtractedParameterValueVisitor visitor) throws FHIRPersistenceException;

    /**
     * @return the base
     */
    public String getBase();

    /**
     * @param base the base to set
     */
    public void setBase(String base);
}

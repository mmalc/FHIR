/*
 * (C) Copyright IBM Corp. 2016, 2020
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.fhir.notification;

import com.ibm.fhir.model.resource.Resource;

public class FHIRNotificationEvent {
    private String lastUpdated = null;
    private String location = null;
    private String operationType = null;
    private String resourceId = null;
    private Resource resource = null;

    public FHIRNotificationEvent() {
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FHIRNotificationEvent["
                + "operation=" + getOperationType()
                + ", resourceId=" + getResourceId()
                + ", location=" + getLocation()
                + ", lastUpdated=" + getLastUpdated()
                + "]");
        return sb.toString();
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }
}

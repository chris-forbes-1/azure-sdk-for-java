// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PrivateLinkConnectionState model. */
@Fluent
public final class PrivateLinkConnectionState {
    /*
     * Status of a private link connection
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * Description of a private link connection
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * ActionsRequired for a private link connection
     */
    @JsonProperty(value = "actionsRequired")
    private String actionsRequired;

    /**
     * Get the status property: Status of a private link connection.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Status of a private link connection.
     *
     * @param status the status value to set.
     * @return the PrivateLinkConnectionState object itself.
     */
    public PrivateLinkConnectionState withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the description property: Description of a private link connection.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of a private link connection.
     *
     * @param description the description value to set.
     * @return the PrivateLinkConnectionState object itself.
     */
    public PrivateLinkConnectionState withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionsRequired property: ActionsRequired for a private link connection.
     *
     * @return the actionsRequired value.
     */
    public String actionsRequired() {
        return this.actionsRequired;
    }

    /**
     * Set the actionsRequired property: ActionsRequired for a private link connection.
     *
     * @param actionsRequired the actionsRequired value to set.
     * @return the PrivateLinkConnectionState object itself.
     */
    public PrivateLinkConnectionState withActionsRequired(String actionsRequired) {
        this.actionsRequired = actionsRequired;
        return this;
    }
}

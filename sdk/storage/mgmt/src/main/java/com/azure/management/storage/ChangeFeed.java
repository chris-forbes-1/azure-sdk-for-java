// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ChangeFeed model. */
@Fluent
public final class ChangeFeed {
    /*
     * Indicates whether change feed event logging is enabled for the Blob
     * service.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Get the enabled property: Indicates whether change feed event logging is enabled for the Blob service.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether change feed event logging is enabled for the Blob service.
     *
     * @param enabled the enabled value to set.
     * @return the ChangeFeed object itself.
     */
    public ChangeFeed withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}

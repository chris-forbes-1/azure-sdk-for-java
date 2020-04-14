// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PrivateLinkServiceListResult model. */
@Fluent
public final class PrivateLinkServiceListResultInner {
    /*
     * Gets a list of PrivateLinkService resources in a resource group.
     */
    @JsonProperty(value = "value")
    private List<PrivateLinkServiceInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: Gets a list of PrivateLinkService resources in a resource group.
     *
     * @return the value value.
     */
    public List<PrivateLinkServiceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets a list of PrivateLinkService resources in a resource group.
     *
     * @param value the value value to set.
     * @return the PrivateLinkServiceListResultInner object itself.
     */
    public PrivateLinkServiceListResultInner withValue(List<PrivateLinkServiceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }
}

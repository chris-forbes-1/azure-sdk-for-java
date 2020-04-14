// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.appservice.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The StaticSiteCustomDomainOverviewARMResource model. */
@JsonFlatten
@Immutable
public class StaticSiteCustomDomainOverviewARMResourceInner extends ProxyOnlyResource {
    /*
     * The domain name for the static site custom domain.
     */
    @JsonProperty(value = "properties.domainName", access = JsonProperty.Access.WRITE_ONLY)
    private String domainName;

    /*
     * The date and time on which the custom domain was created for the static
     * site.
     */
    @JsonProperty(value = "properties.createdOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdOn;

    /**
     * Get the domainName property: The domain name for the static site custom domain.
     *
     * @return the domainName value.
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Get the createdOn property: The date and time on which the custom domain was created for the static site.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.createdOn;
    }
}

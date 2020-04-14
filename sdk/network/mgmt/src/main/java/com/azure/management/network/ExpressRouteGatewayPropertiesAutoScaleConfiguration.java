// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ExpressRouteGatewayPropertiesAutoScaleConfiguration model. */
@Fluent
public final class ExpressRouteGatewayPropertiesAutoScaleConfiguration {
    /*
     * Minimum and maximum number of scale units to deploy.
     */
    @JsonProperty(value = "bounds")
    private ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds bounds;

    /**
     * Get the bounds property: Minimum and maximum number of scale units to deploy.
     *
     * @return the bounds value.
     */
    public ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds bounds() {
        return this.bounds;
    }

    /**
     * Set the bounds property: Minimum and maximum number of scale units to deploy.
     *
     * @param bounds the bounds value to set.
     * @return the ExpressRouteGatewayPropertiesAutoScaleConfiguration object itself.
     */
    public ExpressRouteGatewayPropertiesAutoScaleConfiguration withBounds(
        ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds bounds) {
        this.bounds = bounds;
        return this;
    }
}

/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Connection draining allows open connections to a backend server to be active
 * for a specified time after the backend server got removed from the
 * configuration.
 */
public class ApplicationGatewayConnectionDraining {
    /**
     * Whether connection draining is enabled or not.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /**
     * The number of seconds connection draining is active. Acceptable values
     * are from 1 second to 3600 seconds.
     */
    @JsonProperty(value = "drainTimeoutInSec", required = true)
    private int drainTimeoutInSec;

    /**
     * Get whether connection draining is enabled or not.
     *
     * @return the enabled value
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set whether connection draining is enabled or not.
     *
     * @param enabled the enabled value to set
     * @return the ApplicationGatewayConnectionDraining object itself.
     */
    public ApplicationGatewayConnectionDraining withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the number of seconds connection draining is active. Acceptable values are from 1 second to 3600 seconds.
     *
     * @return the drainTimeoutInSec value
     */
    public int drainTimeoutInSec() {
        return this.drainTimeoutInSec;
    }

    /**
     * Set the number of seconds connection draining is active. Acceptable values are from 1 second to 3600 seconds.
     *
     * @param drainTimeoutInSec the drainTimeoutInSec value to set
     * @return the ApplicationGatewayConnectionDraining object itself.
     */
    public ApplicationGatewayConnectionDraining withDrainTimeoutInSec(int drainTimeoutInSec) {
        this.drainTimeoutInSec = drainTimeoutInSec;
        return this;
    }

}

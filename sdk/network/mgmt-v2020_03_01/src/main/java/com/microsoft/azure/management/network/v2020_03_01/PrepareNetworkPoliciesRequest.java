/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of PrepareNetworkPolicies for Subnet.
 */
public class PrepareNetworkPoliciesRequest {
    /**
     * The name of the service for which subnet is being prepared for.
     */
    @JsonProperty(value = "serviceName")
    private String serviceName;

    /**
     * A list of NetworkIntentPolicyConfiguration.
     */
    @JsonProperty(value = "networkIntentPolicyConfigurations")
    private List<NetworkIntentPolicyConfiguration> networkIntentPolicyConfigurations;

    /**
     * Get the name of the service for which subnet is being prepared for.
     *
     * @return the serviceName value
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the name of the service for which subnet is being prepared for.
     *
     * @param serviceName the serviceName value to set
     * @return the PrepareNetworkPoliciesRequest object itself.
     */
    public PrepareNetworkPoliciesRequest withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get a list of NetworkIntentPolicyConfiguration.
     *
     * @return the networkIntentPolicyConfigurations value
     */
    public List<NetworkIntentPolicyConfiguration> networkIntentPolicyConfigurations() {
        return this.networkIntentPolicyConfigurations;
    }

    /**
     * Set a list of NetworkIntentPolicyConfiguration.
     *
     * @param networkIntentPolicyConfigurations the networkIntentPolicyConfigurations value to set
     * @return the PrepareNetworkPoliciesRequest object itself.
     */
    public PrepareNetworkPoliciesRequest withNetworkIntentPolicyConfigurations(List<NetworkIntentPolicyConfiguration> networkIntentPolicyConfigurations) {
        this.networkIntentPolicyConfigurations = networkIntentPolicyConfigurations;
        return this;
    }

}

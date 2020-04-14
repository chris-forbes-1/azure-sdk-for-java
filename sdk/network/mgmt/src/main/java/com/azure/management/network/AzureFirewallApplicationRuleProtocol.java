// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AzureFirewallApplicationRuleProtocol model. */
@Fluent
public final class AzureFirewallApplicationRuleProtocol {
    /*
     * Protocol type.
     */
    @JsonProperty(value = "protocolType")
    private AzureFirewallApplicationRuleProtocolType protocolType;

    /*
     * Port number for the protocol, cannot be greater than 64000. This field
     * is optional.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * Get the protocolType property: Protocol type.
     *
     * @return the protocolType value.
     */
    public AzureFirewallApplicationRuleProtocolType protocolType() {
        return this.protocolType;
    }

    /**
     * Set the protocolType property: Protocol type.
     *
     * @param protocolType the protocolType value to set.
     * @return the AzureFirewallApplicationRuleProtocol object itself.
     */
    public AzureFirewallApplicationRuleProtocol withProtocolType(
        AzureFirewallApplicationRuleProtocolType protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * Get the port property: Port number for the protocol, cannot be greater than 64000. This field is optional.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: Port number for the protocol, cannot be greater than 64000. This field is optional.
     *
     * @param port the port value to set.
     * @return the AzureFirewallApplicationRuleProtocol object itself.
     */
    public AzureFirewallApplicationRuleProtocol withPort(Integer port) {
        this.port = port;
        return this;
    }
}

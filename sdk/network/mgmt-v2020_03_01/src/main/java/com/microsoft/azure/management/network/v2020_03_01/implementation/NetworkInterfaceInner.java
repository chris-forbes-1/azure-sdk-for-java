/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.network.v2020_03_01.NetworkInterfaceDnsSettings;
import com.microsoft.azure.management.network.v2020_03_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * A network interface in a resource group.
 */
@JsonFlatten
@SkipParentValidation
public class NetworkInterfaceInner extends Resource {
    /**
     * The reference to a virtual machine.
     */
    @JsonProperty(value = "properties.virtualMachine", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource virtualMachine;

    /**
     * The reference to the NetworkSecurityGroup resource.
     */
    @JsonProperty(value = "properties.networkSecurityGroup")
    private NetworkSecurityGroupInner networkSecurityGroup;

    /**
     * A reference to the private endpoint to which the network interface is
     * linked.
     */
    @JsonProperty(value = "properties.privateEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateEndpointInner privateEndpoint;

    /**
     * A list of IPConfigurations of the network interface.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<NetworkInterfaceIPConfigurationInner> ipConfigurations;

    /**
     * A list of TapConfigurations of the network interface.
     */
    @JsonProperty(value = "properties.tapConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterfaceTapConfigurationInner> tapConfigurations;

    /**
     * The DNS settings in network interface.
     */
    @JsonProperty(value = "properties.dnsSettings")
    private NetworkInterfaceDnsSettings dnsSettings;

    /**
     * The MAC address of the network interface.
     */
    @JsonProperty(value = "properties.macAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String macAddress;

    /**
     * Whether this is a primary network interface on a virtual machine.
     */
    @JsonProperty(value = "properties.primary", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean primary;

    /**
     * If the network interface is accelerated networking enabled.
     */
    @JsonProperty(value = "properties.enableAcceleratedNetworking")
    private Boolean enableAcceleratedNetworking;

    /**
     * Indicates whether IP forwarding is enabled on this network interface.
     */
    @JsonProperty(value = "properties.enableIPForwarding")
    private Boolean enableIPForwarding;

    /**
     * A list of references to linked BareMetal resources.
     */
    @JsonProperty(value = "properties.hostedWorkloads", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> hostedWorkloads;

    /**
     * The resource GUID property of the network interface resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /**
     * The provisioning state of the network interface resource. Possible
     * values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the reference to a virtual machine.
     *
     * @return the virtualMachine value
     */
    public SubResource virtualMachine() {
        return this.virtualMachine;
    }

    /**
     * Get the reference to the NetworkSecurityGroup resource.
     *
     * @return the networkSecurityGroup value
     */
    public NetworkSecurityGroupInner networkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the reference to the NetworkSecurityGroup resource.
     *
     * @param networkSecurityGroup the networkSecurityGroup value to set
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
        return this;
    }

    /**
     * Get a reference to the private endpoint to which the network interface is linked.
     *
     * @return the privateEndpoint value
     */
    public PrivateEndpointInner privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Get a list of IPConfigurations of the network interface.
     *
     * @return the ipConfigurations value
     */
    public List<NetworkInterfaceIPConfigurationInner> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set a list of IPConfigurations of the network interface.
     *
     * @param ipConfigurations the ipConfigurations value to set
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withIpConfigurations(List<NetworkInterfaceIPConfigurationInner> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get a list of TapConfigurations of the network interface.
     *
     * @return the tapConfigurations value
     */
    public List<NetworkInterfaceTapConfigurationInner> tapConfigurations() {
        return this.tapConfigurations;
    }

    /**
     * Get the DNS settings in network interface.
     *
     * @return the dnsSettings value
     */
    public NetworkInterfaceDnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the DNS settings in network interface.
     *
     * @param dnsSettings the dnsSettings value to set
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withDnsSettings(NetworkInterfaceDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the MAC address of the network interface.
     *
     * @return the macAddress value
     */
    public String macAddress() {
        return this.macAddress;
    }

    /**
     * Get whether this is a primary network interface on a virtual machine.
     *
     * @return the primary value
     */
    public Boolean primary() {
        return this.primary;
    }

    /**
     * Get if the network interface is accelerated networking enabled.
     *
     * @return the enableAcceleratedNetworking value
     */
    public Boolean enableAcceleratedNetworking() {
        return this.enableAcceleratedNetworking;
    }

    /**
     * Set if the network interface is accelerated networking enabled.
     *
     * @param enableAcceleratedNetworking the enableAcceleratedNetworking value to set
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withEnableAcceleratedNetworking(Boolean enableAcceleratedNetworking) {
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        return this;
    }

    /**
     * Get indicates whether IP forwarding is enabled on this network interface.
     *
     * @return the enableIPForwarding value
     */
    public Boolean enableIPForwarding() {
        return this.enableIPForwarding;
    }

    /**
     * Set indicates whether IP forwarding is enabled on this network interface.
     *
     * @param enableIPForwarding the enableIPForwarding value to set
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withEnableIPForwarding(Boolean enableIPForwarding) {
        this.enableIPForwarding = enableIPForwarding;
        return this;
    }

    /**
     * Get a list of references to linked BareMetal resources.
     *
     * @return the hostedWorkloads value
     */
    public List<String> hostedWorkloads() {
        return this.hostedWorkloads;
    }

    /**
     * Get the resource GUID property of the network interface resource.
     *
     * @return the resourceGuid value
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioning state of the network interface resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withId(String id) {
        this.id = id;
        return this;
    }

}

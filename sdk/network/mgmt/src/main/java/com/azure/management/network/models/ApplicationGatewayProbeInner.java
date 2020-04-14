// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.management.network.ApplicationGatewayProbeHealthResponseMatch;
import com.azure.management.network.ApplicationGatewayProtocol;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ApplicationGatewayProbe model. */
@JsonFlatten
@Fluent
public class ApplicationGatewayProbeInner extends SubResource {
    /*
     * Name of the probe that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The protocol used for the probe.
     */
    @JsonProperty(value = "properties.protocol")
    private ApplicationGatewayProtocol protocol;

    /*
     * Host name to send the probe to.
     */
    @JsonProperty(value = "properties.host")
    private String host;

    /*
     * Relative path of probe. Valid path starts from '/'. Probe is sent to
     * <Protocol>://<host>:<port><path>.
     */
    @JsonProperty(value = "properties.path")
    private String path;

    /*
     * The probing interval in seconds. This is the time interval between two
     * consecutive probes. Acceptable values are from 1 second to 86400
     * seconds.
     */
    @JsonProperty(value = "properties.interval")
    private Integer interval;

    /*
     * The probe timeout in seconds. Probe marked as failed if valid response
     * is not received with this timeout period. Acceptable values are from 1
     * second to 86400 seconds.
     */
    @JsonProperty(value = "properties.timeout")
    private Integer timeout;

    /*
     * The probe retry count. Backend server is marked down after consecutive
     * probe failure count reaches UnhealthyThreshold. Acceptable values are
     * from 1 second to 20.
     */
    @JsonProperty(value = "properties.unhealthyThreshold")
    private Integer unhealthyThreshold;

    /*
     * Whether the host header should be picked from the backend http settings.
     * Default value is false.
     */
    @JsonProperty(value = "properties.pickHostNameFromBackendHttpSettings")
    private Boolean pickHostNameFromBackendHttpSettings;

    /*
     * Minimum number of servers that are always marked healthy. Default value
     * is 0.
     */
    @JsonProperty(value = "properties.minServers")
    private Integer minServers;

    /*
     * Criterion for classifying a healthy probe response.
     */
    @JsonProperty(value = "properties.match")
    private ApplicationGatewayProbeHealthResponseMatch match;

    /*
     * Provisioning state of the backend http settings resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /*
     * Custom port which will be used for probing the backend servers. The
     * valid value ranges from 1 to 65535. In case not set, port from http
     * settings will be used. This property is valid for Standard_v2 and WAF_v2
     * only.
     */
    @JsonProperty(value = "properties.port")
    private Integer port;

    /**
     * Get the name property: Name of the probe that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the probe that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the resource.
     *
     * @param type the type value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the protocol property: The protocol used for the probe.
     *
     * @return the protocol value.
     */
    public ApplicationGatewayProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The protocol used for the probe.
     *
     * @param protocol the protocol value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withProtocol(ApplicationGatewayProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the host property: Host name to send the probe to.
     *
     * @return the host value.
     */
    public String host() {
        return this.host;
    }

    /**
     * Set the host property: Host name to send the probe to.
     *
     * @param host the host value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * Get the path property: Relative path of probe. Valid path starts from '/'. Probe is sent to
     * &lt;Protocol&gt;://&lt;host&gt;:&lt;port&gt;&lt;path&gt;.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Relative path of probe. Valid path starts from '/'. Probe is sent to
     * &lt;Protocol&gt;://&lt;host&gt;:&lt;port&gt;&lt;path&gt;.
     *
     * @param path the path value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the interval property: The probing interval in seconds. This is the time interval between two consecutive
     * probes. Acceptable values are from 1 second to 86400 seconds.
     *
     * @return the interval value.
     */
    public Integer interval() {
        return this.interval;
    }

    /**
     * Set the interval property: The probing interval in seconds. This is the time interval between two consecutive
     * probes. Acceptable values are from 1 second to 86400 seconds.
     *
     * @param interval the interval value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the timeout property: The probe timeout in seconds. Probe marked as failed if valid response is not received
     * with this timeout period. Acceptable values are from 1 second to 86400 seconds.
     *
     * @return the timeout value.
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: The probe timeout in seconds. Probe marked as failed if valid response is not received
     * with this timeout period. Acceptable values are from 1 second to 86400 seconds.
     *
     * @param timeout the timeout value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the unhealthyThreshold property: The probe retry count. Backend server is marked down after consecutive probe
     * failure count reaches UnhealthyThreshold. Acceptable values are from 1 second to 20.
     *
     * @return the unhealthyThreshold value.
     */
    public Integer unhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    /**
     * Set the unhealthyThreshold property: The probe retry count. Backend server is marked down after consecutive probe
     * failure count reaches UnhealthyThreshold. Acceptable values are from 1 second to 20.
     *
     * @param unhealthyThreshold the unhealthyThreshold value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }

    /**
     * Get the pickHostNameFromBackendHttpSettings property: Whether the host header should be picked from the backend
     * http settings. Default value is false.
     *
     * @return the pickHostNameFromBackendHttpSettings value.
     */
    public Boolean pickHostNameFromBackendHttpSettings() {
        return this.pickHostNameFromBackendHttpSettings;
    }

    /**
     * Set the pickHostNameFromBackendHttpSettings property: Whether the host header should be picked from the backend
     * http settings. Default value is false.
     *
     * @param pickHostNameFromBackendHttpSettings the pickHostNameFromBackendHttpSettings value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withPickHostNameFromBackendHttpSettings(
        Boolean pickHostNameFromBackendHttpSettings) {
        this.pickHostNameFromBackendHttpSettings = pickHostNameFromBackendHttpSettings;
        return this;
    }

    /**
     * Get the minServers property: Minimum number of servers that are always marked healthy. Default value is 0.
     *
     * @return the minServers value.
     */
    public Integer minServers() {
        return this.minServers;
    }

    /**
     * Set the minServers property: Minimum number of servers that are always marked healthy. Default value is 0.
     *
     * @param minServers the minServers value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withMinServers(Integer minServers) {
        this.minServers = minServers;
        return this;
    }

    /**
     * Get the match property: Criterion for classifying a healthy probe response.
     *
     * @return the match value.
     */
    public ApplicationGatewayProbeHealthResponseMatch match() {
        return this.match;
    }

    /**
     * Set the match property: Criterion for classifying a healthy probe response.
     *
     * @param match the match value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withMatch(ApplicationGatewayProbeHealthResponseMatch match) {
        this.match = match;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the backend http settings resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the backend http settings resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the port property: Custom port which will be used for probing the backend servers. The valid value ranges
     * from 1 to 65535. In case not set, port from http settings will be used. This property is valid for Standard_v2
     * and WAF_v2 only.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: Custom port which will be used for probing the backend servers. The valid value ranges
     * from 1 to 65535. In case not set, port from http settings will be used. This property is valid for Standard_v2
     * and WAF_v2 only.
     *
     * @param port the port value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withPort(Integer port) {
        this.port = port;
        return this;
    }
}

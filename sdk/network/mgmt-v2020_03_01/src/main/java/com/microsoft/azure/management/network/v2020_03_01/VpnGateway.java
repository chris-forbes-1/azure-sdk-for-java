/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_03_01.implementation.NetworkManager;
import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.network.v2020_03_01.implementation.VpnConnectionInner;
import com.microsoft.azure.management.network.v2020_03_01.implementation.VpnGatewayInner;

/**
 * Type representing VpnGateway.
 */
public interface VpnGateway extends HasInner<VpnGatewayInner>, Resource, GroupableResourceCore<NetworkManager, VpnGatewayInner>, HasResourceGroup, Refreshable<VpnGateway>, Updatable<VpnGateway.Update>, HasManager<NetworkManager> {
    /**
     * @return the bgpSettings value.
     */
    BgpSettings bgpSettings();

    /**
     * @return the connections value.
     */
    List<VpnConnection> connections();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the virtualHub value.
     */
    SubResource virtualHub();

    /**
     * @return the vpnGatewayScaleUnit value.
     */
    Integer vpnGatewayScaleUnit();

    /**
     * The entirety of the VpnGateway definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VpnGateway definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VpnGateway definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the VpnGateway definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the vpngateway definition allowing to specify BgpSettings.
         */
        interface WithBgpSettings {
            /**
             * Specifies bgpSettings.
             * @param bgpSettings Local network gateway's BGP speaker settings
             * @return the next definition stage
             */
            WithCreate withBgpSettings(BgpSettings bgpSettings);
        }

        /**
         * The stage of the vpngateway definition allowing to specify Connections.
         */
        interface WithConnections {
            /**
             * Specifies connections.
             * @param connections List of all vpn connections to the gateway
             * @return the next definition stage
             */
            WithCreate withConnections(List<VpnConnectionInner> connections);
        }

        /**
         * The stage of the vpngateway definition allowing to specify VirtualHub.
         */
        interface WithVirtualHub {
            /**
             * Specifies virtualHub.
             * @param virtualHub The VirtualHub to which the gateway belongs
             * @return the next definition stage
             */
            WithCreate withVirtualHub(SubResource virtualHub);
        }

        /**
         * The stage of the vpngateway definition allowing to specify VpnGatewayScaleUnit.
         */
        interface WithVpnGatewayScaleUnit {
            /**
             * Specifies vpnGatewayScaleUnit.
             * @param vpnGatewayScaleUnit The scale unit for this vpn gateway
             * @return the next definition stage
             */
            WithCreate withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VpnGateway>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithBgpSettings, DefinitionStages.WithConnections, DefinitionStages.WithVirtualHub, DefinitionStages.WithVpnGatewayScaleUnit {
        }
    }
    /**
     * The template for a VpnGateway update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VpnGateway>, Resource.UpdateWithTags<Update>, UpdateStages.WithBgpSettings, UpdateStages.WithConnections, UpdateStages.WithVirtualHub, UpdateStages.WithVpnGatewayScaleUnit {
    }

    /**
     * Grouping of VpnGateway update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the vpngateway update allowing to specify BgpSettings.
         */
        interface WithBgpSettings {
            /**
             * Specifies bgpSettings.
             * @param bgpSettings Local network gateway's BGP speaker settings
             * @return the next update stage
             */
            Update withBgpSettings(BgpSettings bgpSettings);
        }

        /**
         * The stage of the vpngateway update allowing to specify Connections.
         */
        interface WithConnections {
            /**
             * Specifies connections.
             * @param connections List of all vpn connections to the gateway
             * @return the next update stage
             */
            Update withConnections(List<VpnConnectionInner> connections);
        }

        /**
         * The stage of the vpngateway update allowing to specify VirtualHub.
         */
        interface WithVirtualHub {
            /**
             * Specifies virtualHub.
             * @param virtualHub The VirtualHub to which the gateway belongs
             * @return the next update stage
             */
            Update withVirtualHub(SubResource virtualHub);
        }

        /**
         * The stage of the vpngateway update allowing to specify VpnGatewayScaleUnit.
         */
        interface WithVpnGatewayScaleUnit {
            /**
             * Specifies vpnGatewayScaleUnit.
             * @param vpnGatewayScaleUnit The scale unit for this vpn gateway
             * @return the next update stage
             */
            Update withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit);
        }

    }
}

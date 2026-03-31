// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ResourceStats resource stats
// swagger:model ResourceStats
type ResourceStats struct {

	// Count of BGP peers down SEs. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumBgpPeersDown *uint32 `json:"num_bgp_peers_down,omitempty"`

	// Count of SEs which have reached the max_vs_per_se limit. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumCapacityReached *uint32 `json:"num_capacity_reached,omitempty"`

	// Count of creation pending SEs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumCreatePending *uint32 `json:"num_create_pending,omitempty"`

	// Count of disabled SEs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDisabled *uint32 `json:"num_disabled,omitempty"`

	// Count of disconnected SEs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDisconnected *uint32 `json:"num_disconnected,omitempty"`

	// Count of gateway down SEs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGatewayDown *uint32 `json:"num_gateway_down,omitempty"`

	// Count of offline SEs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumOffline *uint32 `json:"num_offline,omitempty"`

	// Count of placement eligible SEs (VSs can be placed on SE). Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumPlacementEligible *uint32 `json:"num_placement_eligible,omitempty"`

	// Count of SEs which are pending reboot. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumRebootPending *uint32 `json:"num_reboot_pending,omitempty"`

	// Total SE count. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumTotal *uint32 `json:"num_total,omitempty"`

	// Count of SEs which have reached the max vNIC limit. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVnicCapacityReached *uint32 `json:"num_vnic_capacity_reached,omitempty"`
}

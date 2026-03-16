// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeGroupPlacementDetail se group placement detail
// swagger:model SeGroupPlacementDetail
type SeGroupPlacementDetail struct {

	// Active standby. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActiveStandby *bool `json:"active_standby,omitempty"`

	// Placement algorithm. Enum options - PLACEMENT_ALGO_PACKED, PLACEMENT_ALGO_DISTRIBUTED. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Algo *string `json:"algo,omitempty"`

	// Buffer SE. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BufferSe *uint32 `json:"buffer_se,omitempty"`

	// List of VSs for each placement ineligible reason. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConsumersIneligibleReasons []*PlacementIneligibleReasonConsumers `json:"consumers_ineligible_reasons,omitempty"`

	// Creation pending SEs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CreatePendingSes []string `json:"create_pending_ses,omitempty"`

	// Image ready. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ImageReady *bool `json:"image_ready,omitempty"`

	// Instance flavor. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InstanceFlavor *string `json:"instance_flavor,omitempty"`

	// Max SE. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxSe *uint32 `json:"max_se,omitempty"`

	// Max vs per SE. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxVsPerSe *uint32 `json:"max_vs_per_se,omitempty"`

	// List of SEs for each placement ineligible reason. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResourcesIneligibleReasons []*PlacementIneligibleReasonResources `json:"resources_ineligible_reasons,omitempty"`

	// Upgrade in progress. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UpgradeInProgress *bool `json:"upgrade_in_progress,omitempty"`

	// SE group UUID. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// SEs which have reached the max vNIC limit. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VnicCapacityReachedSes []string `json:"vnic_capacity_reached_ses,omitempty"`

	// SEs for which there is at least one set of vNIC(s) (corresponding to the same network) which are all at the max vNIC IP limit. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VnicIPLimitReachedSes []string `json:"vnic_ip_limit_reached_ses,omitempty"`

	// VS host redundancy. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsHostRedundancy *bool `json:"vs_host_redundancy,omitempty"`
}

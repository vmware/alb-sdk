// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeGroupPlacementSummary se group placement summary
// swagger:model SeGroupPlacementSummary
type SeGroupPlacementSummary struct {

	// Active standby. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActiveStandby *bool `json:"active_standby,omitempty"`

	// Placement algorithm. Enum options - PLACEMENT_ALGO_PACKED, PLACEMENT_ALGO_DISTRIBUTED. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Algo *string `json:"algo,omitempty"`

	// Buffer SE. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BufferSe *uint32 `json:"buffer_se,omitempty"`

	// VS counts. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConsumerStats *ConsumerStats `json:"consumer_stats,omitempty"`

	// Image ready. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ImageReady *bool `json:"image_ready,omitempty"`

	// Instance flavor. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InstanceFlavor *string `json:"instance_flavor,omitempty"`

	// Max SE. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxSe *uint32 `json:"max_se,omitempty"`

	// Max VS per SE. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxVsPerSe *uint32 `json:"max_vs_per_se,omitempty"`

	// SE counts. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResourceStats *ResourceStats `json:"resource_stats,omitempty"`

	// Upgrade in progress. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UpgradeInProgress *bool `json:"upgrade_in_progress,omitempty"`

	// SE group UUID. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// VS host redundancy. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsHostRedundancy *bool `json:"vs_host_redundancy,omitempty"`
}

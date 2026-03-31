// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeGroupPlacementIneligible se group placement ineligible
// swagger:model SeGroupPlacementIneligible
type SeGroupPlacementIneligible struct {

	// List of VSs for each placement ineligible reason. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConsumersIneligibleReasons []*PlacementIneligibleReasonConsumers `json:"consumers_ineligible_reasons,omitempty"`

	// Image ready. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ImageReady *bool `json:"image_ready,omitempty"`

	// Max VS per SE. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxVsPerSe *uint32 `json:"max_vs_per_se,omitempty"`

	// List of SEs for each placement ineligible reason. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResourcesIneligibleReasons []*PlacementIneligibleReasonResources `json:"resources_ineligible_reasons,omitempty"`

	// Upgrade in progress. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UpgradeInProgress *bool `json:"upgrade_in_progress,omitempty"`

	// SE group UUID. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}

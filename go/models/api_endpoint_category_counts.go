// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIEndpointCategoryCounts Api endpoint category counts
// swagger:model ApiEndpointCategoryCounts
type APIEndpointCategoryCounts struct {

	// Number of API endpoints configured as active. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfiguredActiveCount *uint32 `json:"configured_active_count,omitempty"`

	// Number of API endpoints configured as orphan — defined but not seen in traffic for a while. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfiguredOrphanCount *uint32 `json:"configured_orphan_count,omitempty"`

	// Number of API endpoints configured as zombie — seeing only occasional, trickle traffic. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfiguredZombieCount *uint32 `json:"configured_zombie_count,omitempty"`

	// Number of API endpoints currently seeing active traffic, based on live traffic analysis. This can differ from the configured count if traffic patterns have changed. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ObservedActiveCount *uint32 `json:"observed_active_count,omitempty"`

	// False if live traffic data isn't available yet — for example, because Application Insights isn't set up. Distinguishes 'not available' from a genuine zero. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ObservedCountsAvailable *bool `json:"observed_counts_available,omitempty"`

	// Number of requests seen that aren't API traffic. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ObservedNonAPICount *uint32 `json:"observed_non_api_count,omitempty"`

	// Number of API endpoints currently classified as orphan, based on live traffic analysis. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ObservedOrphanCount *uint32 `json:"observed_orphan_count,omitempty"`

	// Number of requests seen for API paths that aren't configured at all. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ObservedShadowCount *uint32 `json:"observed_shadow_count,omitempty"`

	// Number of API endpoints currently classified as zombie, based on live traffic analysis. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ObservedZombieCount *uint32 `json:"observed_zombie_count,omitempty"`
}

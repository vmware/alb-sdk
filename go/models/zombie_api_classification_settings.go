// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ZombieAPIClassificationSettings Classification settings that define when an API endpoint is marked as zombie based on a minimum throughput threshold and duration.
// swagger:model ZombieApiClassificationSettings
type ZombieAPIClassificationSettings struct {

	// Enables zombie API classification. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// Time unit for the zombie inspection interval. Enum options - INTERVAL_MINUTES, INTERVAL_HOURS, INTERVAL_DAYS. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InspectionIntervalUnit *string `json:"inspection_interval_unit,omitempty"`

	// Duration of the zombie inspection interval in the specified time unit. An endpoint whose traffic falls below the zombie threshold for this duration is classified as zombie. Allowed values are 1-365. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InspectionIntervalValue *uint32 `json:"inspection_interval_value,omitempty"`

	// Per-API throughput percentage threshold relative to the aggregated throughput below which APIs are designated as Zombie. Allowed values are 0-100. Field introduced in 32.2.1. Unit is PERCENT. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MinPercent *float64 `json:"min_percent,omitempty"`
}

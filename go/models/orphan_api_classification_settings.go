// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// OrphanAPIClassificationSettings orphan Api classification settings
// swagger:model OrphanApiClassificationSettings
type OrphanAPIClassificationSettings struct {

	// Enables orphan API classification. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// Time unit for the orphan inspection interval. Enum options - INTERVAL_MINUTES, INTERVAL_HOURS, INTERVAL_DAYS. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InspectionIntervalUnit *string `json:"inspection_interval_unit,omitempty"`

	// Duration of the orphan inspection interval in the specified time unit. An endpoint not seen in traffic for this duration is classified as orphan. Allowed values are 1-365. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InspectionIntervalValue *uint32 `json:"inspection_interval_value,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WaapModeConfig waap mode config
// swagger:model WaapModeConfig
type WaapModeConfig struct {

	// WAAP sizing tier for this SE Group. Enum options - SE_SIZE_SMALL, SE_SIZE_MEDIUM, SE_SIZE_LARGE. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeSize *string `json:"se_size,omitempty"`
}

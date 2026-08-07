// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServiceEngineSizingWaapLimits service engine sizing waap limits
// swagger:model ServiceEngineSizingWaapLimits
type ServiceEngineSizingWaapLimits struct {

	// Maximum number of VirtualServices allowed per SE for this tier. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxVsPerSe *int32 `json:"max_vs_per_se,omitempty"`

	// Minimum memory per SE (MiB) for this tier. SEs in a WAAP-mode SE Group of this size must have at least this much memory. Field introduced in 32.2.1. Unit is MB. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MinMemory *int32 `json:"min_memory,omitempty"`

	// Minimum vCPUs per SE for this tier. SEs in a WAAP-mode SE Group of this size must have at least this many vCPUs. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MinVcpus *int32 `json:"min_vcpus,omitempty"`

	// Size tier this entry describes (SMALL, MEDIUM, or LARGE). Enum options - SE_SIZE_SMALL, SE_SIZE_MEDIUM, SE_SIZE_LARGE. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WaapSeSize *string `json:"waap_se_size,omitempty"`
}

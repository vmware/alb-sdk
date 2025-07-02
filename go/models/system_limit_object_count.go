// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SystemLimitObjectCount system limit object count
// swagger:model SystemLimitObjectCount
type SystemLimitObjectCount struct {

	// Current value for the system limit. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	CurrentCount *int32 `json:"current_count,omitempty"`

	// Enum of the system limit. Enum options - NUM_VIRTUALSERVICES, NUM_VIRTUALSERVICES_RT_METRICS, NUM_EW_VIRTUALSERVICES, NUM_SERVERS, NUM_SERVICEENGINES, NUM_VRFS, NUM_CLOUDS, NUM_TENANTS, POOLS_PER_VS, POOLGROUPS_PER_VS, CERTIFICATES_PER_VS, POOLS_PER_POOLGROUP, RULES_PER_HTTPPOLICY, RULES_PER_NSP, SERVERS_PER_POOL, ROUTES_PER_VRF, DEF_ROUTES_PER_VRF, SNI_CHILD_PER_PARENT_VS, IPS_PER_IPADDRGROUP, STRINGS_PER_STRINGGROUP.... Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Limit *string `json:"limit,omitempty"`

	// Description of the system limit. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LimitDescription *string `json:"limit_description,omitempty"`

	// Name of the system limit. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LimitName *string `json:"limit_name,omitempty"`

	// Name of the system limit object. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Recommended max limit value for the system limit. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	RecommendedMaxLimit *int32 `json:"recommended_max_limit,omitempty"`

	// UUID of the system limit object. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}

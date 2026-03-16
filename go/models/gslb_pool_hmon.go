// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbPoolHmon gslb pool hmon
// swagger:model GslbPoolHmon
type GslbPoolHmon struct {

	// GSLB Pool type. Enum options - GSLB_POOL_TYPE_GENERIC, GSLB_POOL_TYPE_PRIVATE, GSLB_POOL_TYPE_PUBLIC. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GslbPoolType *string `json:"gslb_pool_type,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hmon []*HealthMonitorStatRuntime `json:"hmon,omitempty"`

	// Name for the GSLB pool. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`
}

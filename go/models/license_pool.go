// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LicensePool license pool
// swagger:model LicensePool
type LicensePool struct {

	// Available service units in the pool. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AvailableServiceUnits *float64 `json:"available_service_units,omitempty"`

	// Pool ID. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	PoolID *string `json:"pool_id,omitempty"`

	// Pool name. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	PoolName *string `json:"pool_name,omitempty"`

	// Used service units in the pool. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UsedServiceUnits *float64 `json:"used_service_units,omitempty"`
}

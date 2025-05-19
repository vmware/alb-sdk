// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SaasLicensingInfo saas licensing info
// swagger:model SaasLicensingInfo
type SaasLicensingInfo struct {

	// Enable relaxed reservation norm allowing up to 2x free units( normally constrained to free license units ) to be reserved by upcoming SE’s. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EnableNotionalReserve *bool `json:"enable_notional_reserve,omitempty"`

	// Maximum service units limit for controller. Allowed values are 0-100000. Special values are 0 - infinite. Field introduced in 21.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxServiceUnits *float64 `json:"max_service_units,omitempty"`

	// Minimum service units that always remain reserved on controller. Allowed values are 0-1000. Field introduced in 21.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ReserveServiceUnits *float64 `json:"reserve_service_units,omitempty"`
}

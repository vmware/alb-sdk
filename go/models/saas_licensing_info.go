// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SaasLicensingInfo saas licensing info
// swagger:model SaasLicensingInfo
type SaasLicensingInfo struct {

	// Minimum service units that always remain checked out on controller. Field introduced in 21.1.3.
	CacheServiceUnits *float64 `json:"cache_service_units,omitempty"`

	// Service category. Enum options - ALB_THREAT_INTELLIGENCE_CATEGORY, ALB_SUPPORT_CATEGORY, ALB_LICENSE_CATEGORY. Field introduced in 21.1.3.
	Category *string `json:"category,omitempty"`

	// Maximum service units that controller can check out. Field introduced in 21.1.3.
	MaxServiceUnits *float64 `json:"max_service_units,omitempty"`
}

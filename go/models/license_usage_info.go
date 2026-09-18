// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LicenseUsageInfo license usage info
// swagger:model LicenseUsageInfo
type LicenseUsageInfo struct {

	// Service cores actively consumed across all tenants for the default tier. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConsumedServiceCores *float64 `json:"consumed_service_cores,omitempty"`

	// Alias of licensed_service_cores. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LicensedCores *float64 `json:"licensed_cores,omitempty"`

	// Service cores licensed for the controller's default license tier. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LicensedServiceCores *float64 `json:"licensed_service_cores,omitempty"`

	// Alias of used_service_cores. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSeVcpus *float64 `json:"num_se_vcpus,omitempty"`

	// Per-tier breakdown, keyed by LicenseTierType name (e.g. ENTERPRISE, ENTERPRISE_WITH_CLOUD_SERVICES). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Pertier map[string]LicenseTierUsageInfo `json:"pertier,omitempty"`

	// Service cores held in escrow but not yet consumed, for the default tier. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReservedServiceCores *float64 `json:"reserved_service_cores,omitempty"`

	// consumed_service_cores + reserved_service_cores. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UsedServiceCores *float64 `json:"used_service_cores,omitempty"`
}

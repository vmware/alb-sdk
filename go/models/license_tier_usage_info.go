// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LicenseTierUsageInfo license tier usage info
// swagger:model LicenseTierUsageInfo
type LicenseTierUsageInfo struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConsumedServiceCores *float64 `json:"consumed_service_cores,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LicensedCores *float64 `json:"licensed_cores,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LicensedServiceCores *float64 `json:"licensed_service_cores,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSeVcpus *float64 `json:"num_se_vcpus,omitempty"`

	// Per-tenant breakdown keyed by tenant UUID; omitted entirely when the filter_pertenant query param is true. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Pertenant map[string]LicenseTenantUsageInfo `json:"pertenant,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReservedServiceCores *float64 `json:"reserved_service_cores,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UsedServiceCores *float64 `json:"used_service_cores,omitempty"`
}

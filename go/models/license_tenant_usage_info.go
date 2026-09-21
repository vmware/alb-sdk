// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LicenseTenantUsageInfo license tenant usage info
// swagger:model LicenseTenantUsageInfo
type LicenseTenantUsageInfo struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConsumedServiceCores *float64 `json:"consumed_service_cores,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSeVcpus *float64 `json:"num_se_vcpus,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReservedServiceCores *float64 `json:"reserved_service_cores,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UsedServiceCores *float64 `json:"used_service_cores,omitempty"`
}

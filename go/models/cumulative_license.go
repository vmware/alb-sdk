// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CumulativeLicense cumulative license
// swagger:model CumulativeLicense
type CumulativeLicense struct {

	// Total number of Service Engine cores for burst core based licenses. Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BurstCores *uint32 `json:"burst_cores,omitempty"`

	// Total number of Service Engine cores for core based licenses. Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Cores *uint32 `json:"cores,omitempty"`

	// Total number of Service Engines for host based licenses. Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxSes *uint32 `json:"max_ses,omitempty"`

	// Service Engine bandwidth limits for bandwidth based licenses. Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeBandwidthLimits []*SEBandwidthLimit `json:"se_bandwidth_limits,omitempty"`

	// Total number of Service Engine cores.. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServiceCores *float64 `json:"service_cores,omitempty"`

	// Total number of Service Engine sockets for socket based licenses. Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Sockets *uint32 `json:"sockets,omitempty"`

	// Specifies the licensed tier. Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC, ESSENTIALS, ENTERPRISE_WITH_CLOUD_SERVICES. Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TierType *string `json:"tier_type,omitempty"`
}

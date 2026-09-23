// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ControllerLicense controller license
// swagger:model ControllerLicense
type ControllerLicense struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// List of active burst core license in use. Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActiveBurstResources []*BurstResource `json:"active_burst_resources,omitempty"`

	// Total number of Service Engine cores for burst core based licenses. Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BurstCores *uint32 `json:"burst_cores,omitempty"`

	// Number of Service Engine cores in non-container clouds. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Cores *uint32 `json:"cores,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CustomerName *string `json:"customer_name,omitempty"`

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DisableEnforcement *bool `json:"disable_enforcement,omitempty"`

	// List of used or expired burst core licenses. Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ExpiredBurstResources []*BurstResource `json:"expired_burst_resources,omitempty"`

	// Flag used to track initialization. Field introduced in 20.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Initialized *bool `json:"initialized,omitempty"`

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LicenseID *string `json:"license_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LicenseTier []string `json:"license_tier,omitempty"`

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LicenseTiers []*CumulativeLicense `json:"license_tiers,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Licenses []*SingleLicense `json:"licenses,omitempty"`

	// Number of Service Engines hosts in container clouds. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxSes *uint32 `json:"max_ses,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Service Engine bandwidth limits for bandwidth based licenses. Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeBandwidthLimits []*SEBandwidthLimit `json:"se_bandwidth_limits,omitempty"`

	// Number of vmware service cores after aggregating all other license types. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServiceCores *float64 `json:"service_cores,omitempty"`

	// Number of physical cpu sockets across Service Engines in no access and linux server clouds. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Sockets *uint32 `json:"sockets,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StartOn *string `json:"start_on,omitempty"`

	// Tenant uuid. Field introduced in 30.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantUUID *string `json:"tenant_uuid,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidUntil *string `json:"valid_until,omitempty"`
}

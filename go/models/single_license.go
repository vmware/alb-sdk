// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SingleLicense single license
// swagger:model SingleLicense
type SingleLicense struct {

	// Features supported by the add-on license. Enum options - LICENSE_UNKNOWN_ADDON, LICENSE_LEGACY_ADDON. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Addons []string `json:"addons,omitempty"`

	// Total number of Service Engine burst cores for core based licenses. Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BurstCores *uint32 `json:"burst_cores,omitempty"`

	// Total licensing capacity available for all the resoures available in a single license. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Capacity *float64 `json:"capacity,omitempty"`

	// Number of concurrent VMware Horizon users. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ccu *uint32 `json:"ccu,omitempty"`

	// Central license service id. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClsID *string `json:"cls_id,omitempty"`

	// Number of Service Engine cores in non-container clouds. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Cores *float64 `json:"cores,omitempty"`

	// Total number of cpu cores. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CPUCores *float64 `json:"cpu_cores,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CreatedOn *string `json:"created_on,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	CustomerName *string `json:"customer_name"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnforcedParams []string `json:"enforced_params,omitempty"`

	// Flag to track license expiry. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Expired *bool `json:"expired,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastUpdate *string `json:"last_update,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LicenseID *string `json:"license_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	LicenseName *string `json:"license_name"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LicenseString *string `json:"license_string,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LicenseTier []string `json:"license_tier,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LicenseType *string `json:"license_type,omitempty"`

	// Number of Service Engines hosts in container clouds. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxSes *uint32 `json:"max_ses,omitempty"`

	// License policy details. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Policy *LicensePolicy `json:"policy,omitempty"`

	// Service Engine bandwidth limits for bandwidth based licenses. Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeBandwidthLimits []*SEBandwidthLimit `json:"se_bandwidth_limits,omitempty"`

	// Serial key (Hyphen separated 25 char wide alphanumeric key Ex  AA123-23BAS-383AS-383UD-FHSFG). Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SerialKey *string `json:"serial_key,omitempty"`

	// Total number of service cores equivalent to all the resoures available in the single license. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServiceCores *float64 `json:"service_cores,omitempty"`

	// Number of physical cpu sockets across Service Engines in no access and linux server clouds. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Sockets *uint32 `json:"sockets,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StartOn *string `json:"start_on,omitempty"`

	// Tenant uuid. Field introduced in 30.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantUUID *string `json:"tenant_uuid,omitempty"`

	// Specifies the licensed tier. Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC, ESSENTIALS, ENTERPRISE_WITH_CLOUD_SERVICES. Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TierType *string `json:"tier_type,omitempty"`

	// Units in which resources will be licensed. Enum options - UNNOWN_UNIT, SERVICE_UNIT, LEGACY_ADDON_UNIT. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Unit *string `json:"unit,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ValidUntil *string `json:"valid_until"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Version *string `json:"version,omitempty"`
}

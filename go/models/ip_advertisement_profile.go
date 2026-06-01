// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPAdvertisementProfile Ip advertisement profile
// swagger:model IpAdvertisementProfile
type IPAdvertisementProfile struct {

	// Default periodicity for periodic IP advertisement (GratARP/NA) in minutes. Used when a per-type periodicity is not specified. Allowed values are 1-30. Field introduced in 32.1.3. Unit is MIN. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	DefaultPeriodicity *uint32 `json:"default_periodicity,omitempty"`

	// List of IP address types for which periodic IP advertisement (GratARP/NA) is enabled. Supported ip_type values are VIP_IP, SNAT_IP, FLOATING_INTF_IP, and PRIMARY_INTF_IP. Applied uniformly to all VRFs in this ServiceEngineGroup. Field introduced in 32.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	IPTypes []*IPAddrTypeConfig `json:"ip_types,omitempty"`
}

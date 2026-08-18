// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPAddrTypeConfig Ip addr type config
// swagger:model IpAddrTypeConfig
type IPAddrTypeConfig struct {

	// IP address type for which periodic IP advertisement (GratARP/NA) is enabled. Supported values are VIP_IP, SNAT_IP, FLOATING_INTF_IP, and PRIMARY_INTF_IP. Enum options - NAT_IP, VIP_IP, SNAT_IP, FLOATING_INTF_IP, PRIMARY_INTF_IP. Field introduced in 32.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IPType *string `json:"ip_type"`

	// Periodicity override for this IP type in minutes. If not set, uses ip_advertisement_profile.default_periodicity. Allowed values are 1-30. Field introduced in 32.1.3. Unit is MIN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Periodicity *uint32 `json:"periodicity,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VISeVMIPConfParams v i se Vm Ip conf params
// swagger:model VISeVmIpConfParams
type VISeVMIPConfParams struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DefaultGw *string `json:"default_gw,omitempty"`

	// Default Gateway for IP6 Address of the SE. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DefaultGw6 *string `json:"default_gw6,omitempty"`

	// Mgmt vNic IP6 address if static. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MgmtIp6Addr *string `json:"mgmt_ip6_addr,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MgmtIPAddr *string `json:"mgmt_ip_addr,omitempty"`

	//  Enum options - VNIC_IP_TYPE_DHCP, VNIC_IP_TYPE_STATIC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MgmtIPType *string `json:"mgmt_ip_type"`

	// Management vNIC is configured with IPv4 address. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MgmtIPV4Enable *bool `json:"mgmt_ip_v4_enable,omitempty"`

	// Management vNIC is configured with IPv6 address. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MgmtIPV6Enable *bool `json:"mgmt_ip_v6_enable,omitempty"`

	// Mgmt vNic IP6 address mask if static. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MgmtNet6Mask *string `json:"mgmt_net6_mask,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MgmtNetMask *string `json:"mgmt_net_mask,omitempty"`
}

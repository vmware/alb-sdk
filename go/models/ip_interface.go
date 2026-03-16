// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPInterface Ip interface
// swagger:model IpInterface
type IPInterface struct {

	// Arp flag of the interface address. Field introduced in 18.2.8. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ArpEnabled *bool `json:"arp_enabled,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IPAddr *string `json:"ip_addr"`

	// IP address is a Floating Intf IP. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IsFloatingIntfIP *bool `json:"is_floating_intf_ip"`

	// IP address is a NAT IP. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IsNatIP *bool `json:"is_nat_ip"`

	// IP address is a SNAT IP. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IsSnatIP *bool `json:"is_snat_ip"`

	// IP address is a VIP IP. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IsVipIP *bool `json:"is_vip_ip"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NetMask *string `json:"net_mask"`
}

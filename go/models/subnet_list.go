// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SubnetList subnet list
// swagger:model SubnetList
type SubnetList struct {

	// If true, capable of floating/elastic IP association. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FipAvailable *bool `json:"fip_available,omitempty"`

	// If fip_available is True, the list of associated FloatingIP subnets, possibly empty if unsupported or implictly defined by the Cloud. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FloatingipSubnets []*FloatingIPSubnet `json:"floatingip_subnets,omitempty"`

	// Subnet name. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Prefix *IPAddrPrefix `json:"prefix,omitempty"`

	// reserved ranges of IPs for VirtualService IP allocation with Infoblox as the IPAM provider. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ranges []*IPAddrRange `json:"ranges,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}

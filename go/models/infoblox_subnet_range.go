// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// InfobloxSubnetRange infoblox subnet range
// swagger:model InfobloxSubnetRange
type InfobloxSubnetRange struct {

	// IPv6 reserved range to use for Infoblox allocation. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPv6Ranges []*IPAddrRange `json:"ipv6_ranges,omitempty"`

	// IPv4 reserved range to use for Infoblox allocation. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ranges []*IPAddrRange `json:"ranges,omitempty"`

	// IPv4 subnet to use for Infoblox allocation. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Subnet *IPAddrPrefix `json:"subnet,omitempty"`

	// IPv6 subnet to use for Infoblox allocation. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Subnet6 *IPAddrPrefix `json:"subnet6,omitempty"`
}

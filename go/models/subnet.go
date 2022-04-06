// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Subnet subnet
// swagger:model Subnet
type Subnet struct {

	// Specify an IP subnet prefix for this Network. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Prefix *IPAddrPrefix `json:"prefix"`

	// Static IP ranges for this subnet. Field introduced in 20.1.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	StaticIPRanges []*StaticIPRange `json:"static_ip_ranges,omitempty"`

	// Use static_ip_ranges. Field deprecated in 20.1.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	StaticIps []*IPAddr `json:"static_ips,omitempty"`

	// Use static_ip_ranges. Field deprecated in 20.1.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	StaticRanges []*IPAddrRange `json:"static_ranges,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Subnet subnet
// swagger:model Subnet
type Subnet struct {

	// Specify an IP subnet prefix for this Network. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Prefix *IPAddrPrefix `json:"prefix"`

	// Static IP ranges for this subnet. Field introduced in 20.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	StaticIPRanges []*StaticIPRange `json:"static_ip_ranges,omitempty"`
}

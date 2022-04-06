// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SubnetRuntime subnet runtime
// swagger:model SubnetRuntime
type SubnetRuntime struct {

	// Moved to StaticIpRangeRuntime. Field deprecated in 20.1.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	FreeIPCount *int32 `json:"free_ip_count,omitempty"`

	// Use allocated_ips in StaticIpRangeRuntime. Field deprecated in 20.1.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	IPAlloced []*IPAllocInfo `json:"ip_alloced,omitempty"`

	// Static IP range runtime. Field introduced in 20.1.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	IPRangeRuntimes []*StaticIPRangeRuntime `json:"ip_range_runtimes,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Prefix *IPAddrPrefix `json:"prefix"`

	// Moved to StaticIpRangeRuntime. Field deprecated in 20.1.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	TotalIPCount *int32 `json:"total_ip_count,omitempty"`

	// Can be derived from total - free in StaticIpRangeRuntime. Field deprecated in 20.1.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UsedIPCount *int32 `json:"used_ip_count,omitempty"`
}

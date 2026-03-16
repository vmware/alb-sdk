// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LbServer lb server
// swagger:model LbServer
type LbServer struct {

	//  Field introduced in 17.1.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AffinityCoreOpenConns *uint64 `json:"affinity_core_open_conns,omitempty"`

	//  Field introduced in 17.1.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AffinityCoreTotalConns *uint64 `json:"affinity_core_total_conns,omitempty"`

	//  Field introduced in 17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IPAddr *IPAddr `json:"ip_addr"`

	//  Field introduced in 17.1.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonAffinityCoreOpenConns *uint64 `json:"non_affinity_core_open_conns,omitempty"`

	//  Field introduced in 17.1.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonAffinityCoreTotalConns *uint64 `json:"non_affinity_core_total_conns,omitempty"`

	//  Field introduced in 17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Port *uint32 `json:"port"`
}

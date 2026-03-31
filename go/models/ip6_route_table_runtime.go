// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Ip6RouteTableRuntime ip6 route table runtime
// swagger:model Ip6RouteTableRuntime
type Ip6RouteTableRuntime struct {

	// IPV6 Route. Field introduced in 18.1.5, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ip6RouteEntries []*RouteEntry `json:"ip6_route_entries,omitempty"`

	// Processor Id. Field introduced in 18.1.5, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	// UUID of Service Engine. Field introduced in 18.1.5, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`
}

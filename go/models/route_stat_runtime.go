// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RouteStatRuntime route stat runtime
// swagger:model RouteStatRuntime
type RouteStatRuntime struct {

	// ICMP Routing stats. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Icmpstats *RouteProtoStats `json:"icmpstats,omitempty"`

	// Core id. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	// SE uuid. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// TCP Routing stats. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Tcpstats *RouteProtoStats `json:"tcpstats,omitempty"`

	// UDP Route stats. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Udpstats *RouteProtoStats `json:"udpstats,omitempty"`
}

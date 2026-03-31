// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NatStatRuntime nat stat runtime
// swagger:model NatStatRuntime
type NatStatRuntime struct {

	// ICMP NAT stats. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Icmpstats *NatProtoStats `json:"icmpstats,omitempty"`

	// Core id. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	// SE uuid. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// TCP NAT stats. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Tcpstats *NatProtoStats `json:"tcpstats,omitempty"`

	// UDP NAT stats. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Udpstats *NatProtoStats `json:"udpstats,omitempty"`
}

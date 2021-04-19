// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NatMatchTarget nat match target
// swagger:model NatMatchTarget
type NatMatchTarget struct {

	// Destination IP of the packet. Field introduced in 18.2.3.
	DestinationIP *IPAddrMatch `json:"destination_ip,omitempty"`

	// Services like port-matching and protocol. Field introduced in 18.2.5.
	Services *ServiceMatch `json:"services,omitempty"`

	// Source IP of the packet. Field introduced in 18.2.3.
	SourceIP *IPAddrMatch `json:"source_ip,omitempty"`
}

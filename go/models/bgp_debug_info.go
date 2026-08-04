// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BgpDebugInfo bgp debug info
// swagger:model BgpDebugInfo
type BgpDebugInfo struct {

	//  Field introduced in 17.2.8,18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPv4RouteInfo *string `json:"ipv4_route_info,omitempty"`

	//  Field introduced in 17.2.8,18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPv4Summary *string `json:"ipv4_summary,omitempty"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPv6RouteInfo *string `json:"ipv6_route_info,omitempty"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPv6Summary *string `json:"ipv6_summary,omitempty"`

	//  Field introduced in 17.2.8,18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NeighborInfo *string `json:"neighbor_info,omitempty"`

	//  Field introduced in 17.2.8,18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QuaggaConfig *string `json:"quagga_config,omitempty"`

	//  Field introduced in 17.2.8,18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vrf *string `json:"vrf,omitempty"`
}

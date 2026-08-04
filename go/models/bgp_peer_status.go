// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BgpPeerStatus bgp peer status
// swagger:model BgpPeerStatus
type BgpPeerStatus struct {

	// IPv4 adrress-family status of all peers in vrf. Dump of CMD = show ip bgp summary. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPv4Status *string `json:"ipv4_status,omitempty"`

	// IPv6 adrress-family status of all peers in vrf. Dump of CMD = show bgp summary. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPv6Status *string `json:"ipv6_status,omitempty"`

	// Namespace correspnding to vrf. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Namespace *string `json:"namespace,omitempty"`

	// VRF in which peers are configured. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vrf *string `json:"vrf,omitempty"`
}

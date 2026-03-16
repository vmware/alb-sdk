// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BgpPeerInfo bgp peer info
// swagger:model BgpPeerInfo
type BgpPeerInfo struct {

	// Namespace correspnding to vrf. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Namespace *string `json:"namespace,omitempty"`

	// Info of all the Peers in vrf. Dump of CMD = show ip bgp neighbors. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PeerInfo *string `json:"peer_info,omitempty"`

	// VRF in which peers are configured. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vrf *string `json:"vrf,omitempty"`
}

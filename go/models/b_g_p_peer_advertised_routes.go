// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BGPPeerAdvertisedRoutes b g p peer advertised routes
// swagger:model BGPPeerAdvertisedRoutes
type BGPPeerAdvertisedRoutes struct {

	// IPv4 Routes advertised to this BGP Peer. Dump of CMD = show ip bgp neighbors <> advertised-routes. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPV4Routes *string `json:"ipv4_routes,omitempty"`

	// IPv6 Routes advertised to this BGP Peer. Dump of CMD = show bgp neighbors <> advertised-routes. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPV6Routes *string `json:"ipv6_routes,omitempty"`

	// BGP Peer IP. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PeerIP *IPAddr `json:"peer_ip,omitempty"`
}

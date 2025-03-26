// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NetworkSecurityMatchTarget network security match target
// swagger:model NetworkSecurityMatchTarget
type NetworkSecurityMatchTarget struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientIP *IPAddrMatch `json:"client_ip,omitempty"`

	// Matches the source port of incoming packets in the client side traffic. Field introduced in 20.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ClientPort *PortMatchGeneric `json:"client_port,omitempty"`

	// Matches the geo information of incoming packets in the client side traffic. Field introduced in 21.1.1. Maximum of 1 items allowed. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	GeoMatches []*GeoMatch `json:"geo_matches,omitempty"`

	//  Field introduced in 20.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	IPReputationType *IPReputationTypeMatch `json:"ip_reputation_type,omitempty"`

	//  Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Microservice *MicroServiceMatch `json:"microservice,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsPort *PortMatch `json:"vs_port,omitempty"`
}

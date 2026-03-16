// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsProtocol vs protocol
// swagger:model VsProtocol
type VsProtocol struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MacAddr *string `json:"mac_addr,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ServicePort *int32 `json:"service_port"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServicePortEnd *int32 `json:"service_port_end,omitempty"`

	//  Enum options - PROTOCOL_TYPE_TCP_PROXY, PROTOCOL_TYPE_TCP_FAST_PATH, PROTOCOL_TYPE_UDP_FAST_PATH, PROTOCOL_TYPE_UDP_PROXY, PROTOCOL_TYPE_SCTP_PROXY, PROTOCOL_TYPE_SCTP_FAST_PATH. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Type *string `json:"type"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vip *IPAddrPrefix `json:"vip,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vip6 *IPAddrPrefix `json:"vip6,omitempty"`
}

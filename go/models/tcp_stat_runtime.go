// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TCPStatRuntime Tcp stat runtime
// swagger:model TcpStatRuntime
type TCPStatRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionStats *ConnectionStats `json:"connection_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionsDropped *ConnectionDropStats `json:"connections_dropped,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSStats *TCPDNSStats `json:"dns_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EcnStats *EcnStats `json:"ecn_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MiscStats *MiscStats `json:"misc_stats,omitempty"`

	// ISO 8583 MsgLB client-side stats; present only when type != BACKEND and the VS is an L4 MsgLB virtual service. These counters are incremented from the client-facing side (message committed, transaction/connpool lookup outcome), so there is no separate backend-only variant to report under type=BACKEND. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MsgLbStats *MsgLbTCPStats `json:"msg_lb_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PacketsDropped *PacketDropStats `json:"packets_dropped,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RetransmitStats *RetransmitStats `json:"retransmit_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxStats *RxStats `json:"rx_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SackStats *SackStats `json:"sack_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// SIP-over-TCP stats. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SipStats *TCPSipStats `json:"sip_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SyncacheStats *SyncacheStats `json:"syncache_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Timeout *TimeoutStats `json:"timeout,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxStats *TxStats `json:"tx_stats,omitempty"`
}

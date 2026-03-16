// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TxStats tx stats
// swagger:model TxStats
type TxStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	AckOnlyPacket *uint64 `json:"ack_only_packet"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	DataBytesRetransmitted *uint64 `json:"data_bytes_retransmitted"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	DataBytesSent *uint64 `json:"data_bytes_sent"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	DataPacketsRetransmitted *uint64 `json:"data_packets_retransmitted"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	DataPacketsSent *uint64 `json:"data_packets_sent"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	DelayedAcksSent *uint64 `json:"delayed_acks_sent"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	KeepaliveProbesSent *uint64 `json:"keepalive_probes_sent"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TotalPacketsSent *uint64 `json:"total_packets_sent"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UnnecessaryPacketRetransmit *uint64 `json:"unnecessary_packet_retransmit"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UrgOnlyPacketsSent *uint64 `json:"urg_only_packets_sent"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	WindowProbesSent *uint64 `json:"window_probes_sent"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	WindowUpdateOnlyPacketsSent *uint64 `json:"window_update_only_packets_sent"`
}

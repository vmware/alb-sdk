// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RxStats rx stats
// swagger:model RxStats
type RxStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	AckByteReceived *uint64 `json:"ack_byte_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	AckPacketsReceived *uint64 `json:"ack_packets_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	AckTooMuchPacketsReceived *uint64 `json:"ack_too_much_packets_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	AfterWindowDataBytesReceived *uint64 `json:"after_window_data_bytes_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	AfterWindowDataPacketsReceived *uint64 `json:"after_window_data_packets_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	BytesReceivedInSequence *uint64 `json:"bytes_received_in_sequence"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IgnoredRstPacketInWindow *uint64 `json:"ignored_rst_packet_in_window"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	PacketsReceivedInSequence *uint64 `json:"packets_received_in_sequence"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TotalPacketsReceived *uint64 `json:"total_packets_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	WindowProbePacketsReceived *uint64 `json:"window_probe_packets_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	WindowUpdatePacketReceived *uint64 `json:"window_update_packet_received"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RetransmitStats retransmit stats
// swagger:model RetransmitStats
type RetransmitStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	CompleteDuplicateBytesReceived *uint64 `json:"complete_duplicate_bytes_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	CompleteDuplicatePacketsReceived *uint64 `json:"complete_duplicate_packets_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	DupAckPacketsReceived *uint64 `json:"dup_ack_packets_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	OutOfOrderBytesReceived *uint64 `json:"out_of_order_bytes_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	OutOfOrderPacketsReceived *uint64 `json:"out_of_order_packets_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	PartialDuplicateBytesReceived *uint64 `json:"partial_duplicate_bytes_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	PartialDuplicatePacketsReceived *uint64 `json:"partial_duplicate_packets_received"`
}

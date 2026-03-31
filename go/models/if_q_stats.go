// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IfQStats if q stats
// swagger:model IfQStats
type IfQStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	GroMbufsCoalesced *uint64 `json:"gro_mbufs_coalesced"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Ibytes *uint64 `json:"ibytes"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Ipackets *uint64 `json:"ipackets"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Obytes *uint64 `json:"obytes"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Oerrors *uint64 `json:"oerrors"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Opackets *uint64 `json:"opackets"`

	// Queue ID. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QueueIdx *uint32 `json:"queue_idx,omitempty"`

	// Core which owns the queue. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QueueOwner *uint32 `json:"queue_owner,omitempty"`

	// Number of LRO'ed packets received by the VNIC queue. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxLroPackets *uint64 `json:"rx_lro_packets,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RxMaxSingleBurst *uint64 `json:"rx_max_single_burst"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RxPktIterations *uint64 `json:"rx_pkt_iterations"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RxQueueFull *uint64 `json:"rx_queue_full"`
}

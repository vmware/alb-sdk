// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConnectionDropStats connection drop stats
// swagger:model ConnectionDropStats
type ConnectionDropStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnectionsDroppedAfterEstablished *uint64 `json:"connections_dropped_after_established"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnectionsDroppedBeforeEstablished *uint64 `json:"connections_dropped_before_established"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FinWait2TimeoutDrops *uint64 `json:"fin_wait_2_timeout_drops"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	KeepaliveTimeoutDrops *uint64 `json:"keepalive_timeout_drops"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ListenQueueOverflowDrops *uint64 `json:"listen_queue_overflow_drops"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumResetsReceived *uint64 `json:"num_resets_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumResetsSent *uint64 `json:"num_resets_sent"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	PersistTimeoutDrops *uint64 `json:"persist_timeout_drops"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RetransmitTimeoutDrops *uint64 `json:"retransmit_timeout_drops"`
}

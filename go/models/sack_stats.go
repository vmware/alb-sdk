// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SackStats sack stats
// swagger:model SackStats
type SackStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SackBlocksReceived *uint64 `json:"sack_blocks_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SackBlocksSent *uint64 `json:"sack_blocks_sent"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SackRecoveryEpisodes *uint64 `json:"sack_recovery_episodes"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SackRetransmitBytes *uint64 `json:"sack_retransmit_bytes"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SackRetransmitSegments *uint64 `json:"sack_retransmit_segments"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ScoreboardOverflows *uint64 `json:"scoreboard_overflows"`
}

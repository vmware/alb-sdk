// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BotUACacheSegmentStats bot u a cache segment stats
// swagger:model BotUACacheSegmentStats
type BotUACacheSegmentStats struct {

	// Total number of entries in this segment. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumEntries *uint64 `json:"num_entries,omitempty"`

	// Total number of evictions from this segment. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumEvictions *uint64 `json:"num_evictions,omitempty"`

	// Number of hits for all entries in this segment. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumHits *uint64 `json:"num_hits,omitempty"`

	// Number of entries reserved for this segment. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumReserved *uint64 `json:"num_reserved,omitempty"`

	// Segment name. Enum options - BROWSER_SEGMENT, GOOD_BOT_SEGMENT, BAD_BOT_SEGMENT, PENDING_SEGMENT. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Segment *string `json:"segment,omitempty"`
}

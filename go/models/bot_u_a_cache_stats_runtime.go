// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BotUACacheStatsRuntime bot u a cache stats runtime
// swagger:model BotUACacheStatsRuntime
type BotUACacheStatsRuntime struct {

	// Total number of entries in the user-agent cache. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumEntries *uint64 `json:"num_entries,omitempty"`

	// Total number of evictions. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumEvictions *uint64 `json:"num_evictions,omitempty"`

	// Total number of hits. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumHits *uint64 `json:"num_hits,omitempty"`

	// Total number of lookups. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumLookups *uint64 `json:"num_lookups,omitempty"`

	// Total number of misses. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumMisses *uint64 `json:"num_misses,omitempty"`

	// Maximum number of entries in the user-agent cache. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumReserved *uint64 `json:"num_reserved,omitempty"`

	// Segment Stats. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Stats []*BotUACacheSegmentStats `json:"stats,omitempty"`
}

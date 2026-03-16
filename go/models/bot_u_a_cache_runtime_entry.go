// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BotUACacheRuntimeEntry bot u a cache runtime entry
// swagger:model BotUACacheRuntimeEntry
type BotUACacheRuntimeEntry struct {

	// Entry info that was received from controller. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Info *BotUACacheInfo `json:"info,omitempty"`

	// Flag indicating whether the entry's rank is marked as stale. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsStale *bool `json:"is_stale,omitempty"`

	// JA3 values for this entry. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ja3s []string `json:"ja3s,omitempty"`

	// When details about this entry were last queried from the controller. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastQueried *TimeStamp `json:"last_queried,omitempty"`

	// Normalized JA3 values for this entry. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NormalizedJa3s []string `json:"normalized_ja3s,omitempty"`

	// Entry rank in cache on SE. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Rank *int64 `json:"rank,omitempty"`

	// Segment of cache that entry is located in. Enum options - BROWSER_SEGMENT, GOOD_BOT_SEGMENT, BAD_BOT_SEGMENT, PENDING_SEGMENT. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Segment *string `json:"segment,omitempty"`

	// How often details about this entry have been queried from the controller. Only valid for entries in 'pending' segment. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TimesQueried *uint32 `json:"times_queried,omitempty"`
}

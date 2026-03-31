// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BotUACacheRuntime bot u a cache runtime
// swagger:model BotUACacheRuntime
type BotUACacheRuntime struct {

	// Total number of entries in the user-agent cache. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumEntries *uint64 `json:"num_entries,omitempty"`

	// Total number of user-agent cache entries that were not checked with the filter before result limit was reached. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumUncheckedEntries *uint64 `json:"num_unchecked_entries,omitempty"`

	// Entries currently loaded in Service Engine user-agent cache. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UaCacheEntries []*BotUACacheRuntimeEntry `json:"ua_cache_entries,omitempty"`
}

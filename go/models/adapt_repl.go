// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AdaptRepl adapt repl
// swagger:model AdaptRepl
type AdaptRepl struct {

	// Detailed view of Adaptive replication cache. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CacheDetail []*ConfigVersion `json:"cache_detail,omitempty"`

	// Summary of Adaptive replication cache. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CacheSummary []*AdaptReplWindowSummary `json:"cache_summary,omitempty"`

	// Adaptive Replication Faults. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FaultSummary []*AdaptReplWindowSummary `json:"fault_summary,omitempty"`

	// Summary of fixes of Adaptive Replication Faults. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FixSummary []*AdaptReplFixSummary `json:"fix_summary,omitempty"`

	// Summary of replication of Adaptive replication. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReplSummary *AdaptReplSummary `json:"repl_summary,omitempty"`

	// Config version for a given UUID object. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WindowDetail *AdaptReplDetail `json:"window_detail,omitempty"`

	// Summary of config versions for all objects. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WindowSummary []*AdaptReplWindowSummary `json:"window_summary,omitempty"`
}

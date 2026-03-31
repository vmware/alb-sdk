// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// QatHugepageStats qat hugepage stats
// swagger:model QatHugepageStats
type QatHugepageStats struct {

	// Number of allocation failures. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Failcount *uint64 `json:"failcount,omitempty"`

	// Hugepage limit in bytes. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HugepageLimitBytes *uint64 `json:"hugepage_limit_bytes,omitempty"`

	// Maximum hugepage usage in bytes. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxUsageBytes *uint64 `json:"max_usage_bytes,omitempty"`

	// NUMA statistics total value. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Numastat *uint64 `json:"numastat,omitempty"`

	// Reserved hugepage limit in bytes. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RsvdHugepageLimitBytes *uint64 `json:"rsvd_hugepage_limit_bytes,omitempty"`

	// Current hugepage usage in bytes. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UsageBytes *uint64 `json:"usage_bytes,omitempty"`
}

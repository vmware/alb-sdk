// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ProcHugepageInfo proc hugepage info
// swagger:model ProcHugepageInfo
type ProcHugepageInfo struct {

	// QAT hugepages used by process (from hugetlb cgroup). Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumHpagesQat *uint32 `json:"num_hpages_qat,omitempty"`

	// Total hugepages used by process (from numastat). Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumHpagesTotal *uint32 `json:"num_hpages_total,omitempty"`
}

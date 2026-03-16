// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SystemHugepageInfo system hugepage info
// swagger:model SystemHugepageInfo
type SystemHugepageInfo struct {

	// Maximum number of NUMA nodes. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxNumNumaNodes *uint32 `json:"max_num_numa_nodes,omitempty"`

	// Hugepages allocated for QAT acceleration. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QatHugepages *uint32 `json:"qat_hugepages,omitempty"`

	// Hugepages allocated for SE DPDK. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeHugepages *uint32 `json:"se_hugepages,omitempty"`

	// Number of free hugepages in the system. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SystemFreeHugepages *uint32 `json:"system_free_hugepages,omitempty"`

	// Size of each hugepage in MB. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SystemHpageSizeMb *uint32 `json:"system_hpage_size_mb,omitempty"`

	// Number of reserved hugepages. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SystemReservedHugepages *uint32 `json:"system_reserved_hugepages,omitempty"`

	// Total hugepages allocated by the system. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SystemTotalHugepages *uint32 `json:"system_total_hugepages,omitempty"`
}

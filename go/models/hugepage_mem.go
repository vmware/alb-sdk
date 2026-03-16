// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HugepageMem hugepage mem
// swagger:model HugepageMem
type HugepageMem struct {

	// Size of hugepages in MB. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HugepageSizeMb *uint32 `json:"hugepage_size_mb,omitempty"`

	// Number of hugepages reserved for the non-QAT SE subsystem. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeHugepagesReserved *uint32 `json:"se_hugepages_reserved,omitempty"`

	// Number of hugepages allocated for QAT Engine hardware acceleration. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeQatHugepagesAllocated *uint32 `json:"se_qat_hugepages_allocated,omitempty"`

	// Number of hugepages reserved for the QAT SE subsystem. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeQatHugepagesReserved *uint32 `json:"se_qat_hugepages_reserved,omitempty"`

	//  Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SocketUsage []*SocketUsage `json:"socket_usage,omitempty"`

	// Total number of hugepages allocated by the system. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SystemHugepagesAllocated *uint32 `json:"system_hugepages_allocated,omitempty"`

	// Number of free hugepages available in the system. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SystemHugepagesFree *uint32 `json:"system_hugepages_free,omitempty"`
}

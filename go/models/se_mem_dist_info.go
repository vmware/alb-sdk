// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeMemDistInfo se mem dist info
// swagger:model SeMemDistInfo
type SeMemDistInfo struct {

	// Memory allocated in the SE for the HTTP App Cache. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AppCacheMb *uint32 `json:"app_cache_mb,omitempty"`

	// App Learning Memory in MB. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AppLearningMemoryMb *uint32 `json:"app_learning_memory_mb,omitempty"`

	// Num of Clusters. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Clusters *uint64 `json:"clusters"`

	// Config Memory in MB. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigMemoryMb *uint32 `json:"config_memory_mb,omitempty"`

	// Connection Memory in MB. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnMemoryMb *uint32 `json:"conn_memory_mb"`

	// Connection Memory Per Core in MB. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnMemoryMbPerCore *uint32 `json:"conn_memory_mb_per_core"`

	// Num of Huge pages carved. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	HugePages *uint32 `json:"huge_pages"`

	// OS Reserved Memory in MB. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	OsReservedMemoryMb *uint32 `json:"os_reserved_memory_mb"`

	// QAT reserved hugepage memory in MB. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QatHpageMemMb *uint32 `json:"qat_hpage_mem_mb,omitempty"`

	// Shared Config Memory in MB. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShmConfigMemoryMb *uint32 `json:"shm_config_memory_mb,omitempty"`

	// Shared Connection Memory in MB. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ShmConnMemoryMb *uint32 `json:"shm_conn_memory_mb"`

	// Shared Memory in MB. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ShmMemoryMb *uint32 `json:"shm_memory_mb"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeMemDistRuntime se mem dist runtime
// swagger:model SeMemDistRuntime
type SeMemDistRuntime struct {

	// Memory allocated in the SE for the HTTP App Cache. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AppCacheMb *uint32 `json:"app_cache_mb,omitempty"`

	//  Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AppLearningMemoryMb *uint32 `json:"app_learning_memory_mb,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Clusters *uint64 `json:"clusters"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigMemoryMb *uint32 `json:"config_memory_mb,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnMemoryMb *uint32 `json:"conn_memory_mb"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnMemoryMbPerCore *uint32 `json:"conn_memory_mb_per_core"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	HugePages *uint32 `json:"huge_pages"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	HypervisorType *uint32 `json:"hypervisor_type"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumQueues *uint32 `json:"num_queues"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumRxd *uint32 `json:"num_rxd"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumTxd *uint32 `json:"num_txd"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	OsReservedMemoryMb *uint32 `json:"os_reserved_memory_mb"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	// QAT reserved hugepage memory in MB. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QatHpageMemMb *uint32 `json:"qat_hpage_mem_mb,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShmConfigMemoryMb *uint32 `json:"shm_config_memory_mb,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ShmConnMemoryMb *uint32 `json:"shm_conn_memory_mb"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ShmMemoryMb *uint32 `json:"shm_memory_mb"`
}

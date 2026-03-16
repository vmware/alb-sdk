// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MemUsage mem usage
// swagger:model MemUsage
type MemUsage struct {

	// Indicates whether config memory is below soft limit or not. Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigBelowSoftLimit *bool `json:"config_below_soft_limit,omitempty"`

	// Portion of connection memory in heap memory used for configuration. Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeapAdditionalConfigMem *uint32 `json:"heap_additional_config_mem,omitempty"`

	// Current heap config memory hard limit. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeapConfigHardLimit *uint32 `json:"heap_config_hard_limit,omitempty"`

	// Status of heap config memory. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeapConfigMemoryStatus *string `json:"heap_config_memory_status,omitempty"`

	// Current heap config memory soft limit. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeapConfigSoftLimit *uint32 `json:"heap_config_soft_limit,omitempty"`

	// config memory usage in heap memory. Field introduced in 17.2.12, 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeapConfigUsage *uint32 `json:"heap_config_usage,omitempty"`

	// connection memory usage in heap memory. Field introduced in 17.2.12, 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeapConnUsage *uint32 `json:"heap_conn_usage,omitempty"`

	// Summary of current heap memory status and its limits. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeapMemorySummary *string `json:"heap_memory_summary,omitempty"`

	// Minimum heap conn memory guaranteed for connections. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeapMinConnMem *uint32 `json:"heap_min_conn_mem,omitempty"`

	// Required minimum available config memory in heap memory to apply any config. Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeapMinReqConfig *uint32 `json:"heap_min_req_config,omitempty"`

	// Summary of current heap memory status and its limits. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SharedMemorySummary *string `json:"shared_memory_summary,omitempty"`

	// Portion of connection memory in shared memory used for configuration. Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShmAdditionalConfigMem *uint32 `json:"shm_additional_config_mem,omitempty"`

	// Current shm config memory hard limit. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShmConfigHardLimit *uint32 `json:"shm_config_hard_limit,omitempty"`

	// Status of shm config memory. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShmConfigMemoryStatus *string `json:"shm_config_memory_status,omitempty"`

	// Current shm config memory soft limit. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShmConfigSoftLimit *uint32 `json:"shm_config_soft_limit,omitempty"`

	// config memory usage in shared memory. Field introduced in 17.2.12, 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShmConfigUsage *uint32 `json:"shm_config_usage,omitempty"`

	// connection memory usage in shared memory. Field introduced in 17.2.12, 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShmConnUsage *uint32 `json:"shm_conn_usage,omitempty"`

	// Minimum shm conn memory guaranteed for connections. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShmMinConnMem *uint32 `json:"shm_min_conn_mem,omitempty"`

	// Required minimum available config memory in shared memory to apply any config. Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShmMinReqConfig *uint32 `json:"shm_min_req_config,omitempty"`

	// Total shared memory usage including fragmentation. Field introduced in 17.2.12, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShmTotalMemoryUsage *uint32 `json:"shm_total_memory_usage,omitempty"`
}

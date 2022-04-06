// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeMemoryLimitEventDetails se memory limit event details
// swagger:model SeMemoryLimitEventDetails
type SeMemoryLimitEventDetails struct {

	// Current status of config memory. Field introduced in 18.2.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ConfigMemoryStatus *string `json:"config_memory_status,omitempty"`

	// Heap config memory hard limit. Field introduced in 18.2.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	HeapConfigHardLimit *int32 `json:"heap_config_hard_limit,omitempty"`

	// Heap config memory soft limit. Field introduced in 18.2.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	HeapConfigSoftLimit *int32 `json:"heap_config_soft_limit,omitempty"`

	// Config memory usage in heap memory. Field introduced in 18.2.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	HeapConfigUsage *int32 `json:"heap_config_usage,omitempty"`

	// Connection memory usage in heap memory. Field introduced in 18.2.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	HeapConnUsage *int32 `json:"heap_conn_usage,omitempty"`

	// UUID of the SE responsible for this event. It is a reference to an object of type ServiceEngine. Field introduced in 18.2.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeRef *string `json:"se_ref,omitempty"`

	// Current shm config memory hard limit. Field introduced in 18.2.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ShmConfigHardLimit *int32 `json:"shm_config_hard_limit,omitempty"`

	// Current shm config memory soft limit. Field introduced in 18.2.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ShmConfigSoftLimit *int32 `json:"shm_config_soft_limit,omitempty"`

	// Config memory usage in shared memory. Field introduced in 18.2.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ShmConfigUsage *int32 `json:"shm_config_usage,omitempty"`

	// Connection memory usage in shared memory. Field introduced in 18.2.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ShmConnUsage *int32 `json:"shm_conn_usage,omitempty"`
}

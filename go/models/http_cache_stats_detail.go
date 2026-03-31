// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HTTPCacheStatsDetail Http cache stats detail
// swagger:model HttpCacheStatsDetail
type HTTPCacheStatsDetail struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	AvailableSize *uint64 `json:"available_size"`

	// Header body split and copy failed. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ChainCopyFail *uint32 `json:"chain_copy_fail,omitempty"`

	// Header body split failed. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ChainSplitFail *uint32 `json:"chain_split_fail,omitempty"`

	// Shared memory allocations for cached data. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DataAllocations *uint64 `json:"data_allocations,omitempty"`

	// Shared memory freed from cached data. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DataFreed *uint64 `json:"data_freed,omitempty"`

	// Total Shared memory in use for cached data. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DataMemory *uint64 `json:"data_memory,omitempty"`

	// Packet data buffer allocation Failed. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DataShmFail *uint32 `json:"data_shm_fail,omitempty"`

	// Entry allocation Failed. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EntryShmFail *uint32 `json:"entry_shm_fail,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EtypeAdds []*HTTPCacheETypeStats `json:"etype_adds,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EtypeObjects []*HTTPCacheETypeStats `json:"etype_objects,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Fetch []*HTTPCacheStat `json:"fetch,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	GlobalEvicts *uint32 `json:"global_evicts"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Incoming *HTTPCacheStatsObj `json:"incoming"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	LocalEvicts *uint32 `json:"local_evicts"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Lookups *uint64 `json:"lookups"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MetaSize *uint64 `json:"meta_size"`

	// Shared memory allocations for cached objects. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ObjAllocations *uint64 `json:"obj_allocations,omitempty"`

	// Shared memory free from cached objects. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ObjFreed *uint64 `json:"obj_freed,omitempty"`

	// Total Shared memory in use for cached objects. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ObjMemory *uint64 `json:"obj_memory,omitempty"`

	// Object allocation Failed. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ObjectShmFail *uint32 `json:"object_shm_fail,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Outgoing *HTTPCacheStatsObj `json:"outgoing"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ProcID *string `json:"proc_id"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Reval []*HTTPCacheStat `json:"reval,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SeUUID *string `json:"se_uuid"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Store []*HTTPCacheStat `json:"store,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StoreOut []*HTTPCacheStat `json:"store_out,omitempty"`
}

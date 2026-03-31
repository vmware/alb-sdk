// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MallocStatEntry malloc stat entry
// swagger:model MallocStatEntry
type MallocStatEntry struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MallocTypeCnt *int32 `json:"malloc_type_cnt"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MallocTypeFail *int32 `json:"malloc_type_fail"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MallocTypeFreelist *uint64 `json:"malloc_type_freelist"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MallocTypeFreelistSize *uint64 `json:"malloc_type_freelist_size"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MallocTypeName *string `json:"malloc_type_name"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MallocTypeSize *uint64 `json:"malloc_type_size"`

	// Total number of heap allocations done. This counter is never decremented. Field introduced in 20.1.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MallocTypeTotalAllocs *uint32 `json:"malloc_type_total_allocs,omitempty"`

	// Total bytes of heap allocations done. This counter is never decremented. Field introduced in 20.1.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MallocTypeTotalBytes *uint32 `json:"malloc_type_total_bytes,omitempty"`
}

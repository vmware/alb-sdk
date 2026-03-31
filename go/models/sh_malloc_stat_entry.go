// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ShMallocStatEntry sh malloc stat entry
// swagger:model ShMallocStatEntry
type ShMallocStatEntry struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ShMallocTypeCnt *int32 `json:"sh_malloc_type_cnt"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ShMallocTypeFail *int32 `json:"sh_malloc_type_fail"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ShMallocTypeName *string `json:"sh_malloc_type_name"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ShMallocTypeSize *uint64 `json:"sh_malloc_type_size"`

	// Total number of shared memory allocations done. This counter is never decremented. Field introduced in 20.1.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShMallocTypeTotalAllocs *uint32 `json:"sh_malloc_type_total_allocs,omitempty"`

	// Total bytes of shared memory allocations done. This counter is never decremented. Field introduced in 20.1.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShMallocTypeTotalBytes *uint32 `json:"sh_malloc_type_total_bytes,omitempty"`
}

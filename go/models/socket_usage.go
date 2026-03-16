// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SocketUsage socket usage
// swagger:model SocketUsage
type SocketUsage struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AllocCount *uint32 `json:"alloc_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FreeCount *uint32 `json:"free_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GreatestFreeSize *uint64 `json:"greatest_free_size,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeapAllocBytes *uint64 `json:"heap_alloc_bytes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeapFreeBytes *uint64 `json:"heap_free_bytes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeapMbufsAllocBytes *uint64 `json:"heap_mbufs_alloc_bytes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeapTotalBytes *uint64 `json:"heap_total_bytes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SocketID *uint32 `json:"socket_id,omitempty"`
}

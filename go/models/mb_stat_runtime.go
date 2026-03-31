// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MbStatRuntime mb stat runtime
// swagger:model MbStatRuntime
type MbStatRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DrvCompacts *uint32 `json:"drv_compacts,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DrvCompactsFailed *uint32 `json:"drv_compacts_failed,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MbufAllocationFailures *uint64 `json:"mbuf_allocation_failures"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MbufAllocations *uint64 `json:"mbuf_allocations"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MbufAvailable *uint64 `json:"mbuf_available"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MbufCacheEmpty *uint64 `json:"mbuf_cache_empty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MbufCacheMax *uint64 `json:"mbuf_cache_max"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MbufCachedAllocations *uint64 `json:"mbuf_cached_allocations"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MbufCachedFrees *uint64 `json:"mbuf_cached_frees"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MbufFrees *uint64 `json:"mbuf_frees"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MbufTotal *uint64 `json:"mbuf_total"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	McopyFail *uint64 `json:"mcopy_fail"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MpullupFail *uint64 `json:"mpullup_fail"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MpullupSlow *uint64 `json:"mpullup_slow"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumLroPkts *uint64 `json:"num_lro_pkts,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumTsoBytes *uint64 `json:"num_tso_bytes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumTsoChains *uint32 `json:"num_tso_chains,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	PktbufAllocationFailures *uint64 `json:"pktbuf_allocation_failures"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	PktbufAllocations *uint64 `json:"pktbuf_allocations"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	PktbufAvailable *uint64 `json:"pktbuf_available"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	PktbufCacheEmpty *uint64 `json:"pktbuf_cache_empty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	PktbufCacheMax *uint64 `json:"pktbuf_cache_max"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	PktbufCachedAllocations *uint64 `json:"pktbuf_cached_allocations"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	PktbufCachedFrees *uint64 `json:"pktbuf_cached_frees"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	PktbufFrees *uint64 `json:"pktbuf_frees"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	PktbufTotal *uint64 `json:"pktbuf_total"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SmallPktbufAllocationFailures *uint64 `json:"small_pktbuf_allocation_failures"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SmallPktbufAllocations *uint64 `json:"small_pktbuf_allocations"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SmallPktbufAvailable *uint64 `json:"small_pktbuf_available"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SmallPktbufCacheEmpty *uint64 `json:"small_pktbuf_cache_empty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SmallPktbufCacheMax *uint64 `json:"small_pktbuf_cache_max"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SmallPktbufCachedAllocations *uint64 `json:"small_pktbuf_cached_allocations"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SmallPktbufCachedFrees *uint64 `json:"small_pktbuf_cached_frees"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SmallPktbufFrees *uint64 `json:"small_pktbuf_frees"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SmallPktbufTotal *uint64 `json:"small_pktbuf_total"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ZeroLenMbufs *uint32 `json:"zero_len_mbufs,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HTTPCacheObj Http cache obj
// swagger:model HttpCacheObj
type HTTPCacheObj struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AeTypeBm *int32 `json:"ae_type_bm,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	BodySize *int32 `json:"body_size"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CeTop *int32 `json:"ce_top,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CeTypeBm *int32 `json:"ce_type_bm,omitempty"`

	// content type. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ctype *string `json:"ctype,omitempty"`

	// Object data (headers + body) size. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	DataSize *int32 `json:"data_size"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	DateTime *int32 `json:"date_time"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Etag *string `json:"etag,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ExpAge *int32 `json:"exp_age"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ExpAgeHrt *bool `json:"exp_age_hrt"`

	// UUID of the cached object. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Handle *string `json:"handle"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	HasVary *bool `json:"has_vary"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	HdrSize *int32 `json:"hdr_size"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	InTime *int32 `json:"in_time"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	InitAge *int32 `json:"init_age"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IsChunked *bool `json:"is_chunked"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IsExpired *bool `json:"is_expired"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IsPurged *bool `json:"is_purged"`

	// MD5 representation of the cached object key. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Key *string `json:"key"`

	// MD5 representation of the cached object key extension. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KeyExtn *string `json:"key_extn,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	LastModTime *int32 `json:"last_mod_time"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	LastUsed *int32 `json:"last_used"`

	// Object data head pointer. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MbufHead *string `json:"mbuf_head"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	McacheOut *bool `json:"mcache_out"`

	// Object metadata size. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MetaSize *int32 `json:"meta_size"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MustReval *bool `json:"must_reval"`

	// objects cacheable, but no expiry info. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NoExpInfo *bool `json:"no_exp_info"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NoTxm *bool `json:"no_txm"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ProcID *string `json:"proc_id"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ProxyReval *bool `json:"proxy_reval"`

	// Raw representation of the cached object key extension. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RawExtn *string `json:"raw_extn,omitempty"`

	// Raw representation of the cached object key. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RawKey *string `json:"raw_key"`

	// Object ref count. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Refcnt *int32 `json:"refcnt"`

	// Object reuse count. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ReuseCnt *int32 `json:"reuse_cnt"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Reval *int32 `json:"reval"`
}

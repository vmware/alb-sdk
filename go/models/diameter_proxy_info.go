// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DiameterProxyInfo diameter proxy info
// swagger:model DiameterProxyInfo
type DiameterProxyInfo struct {

	// Cumulative count of diameter ctx created. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDmmGetCtx *uint64 `json:"num_dmm_get_ctx,omitempty"`

	// Cumulative count of diameter messages get. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDmmGetMsg *uint64 `json:"num_dmm_get_msg,omitempty"`

	// Cumulative count of diameter messages parsed. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDmmParseMsg *uint64 `json:"num_dmm_parse_msg,omitempty"`

	// Cumulative count of diameter ctx freed. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDmmPutCtx *uint64 `json:"num_dmm_put_ctx,omitempty"`

	// Cumulative count of diameter messages put. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDmmPutMsg *uint64 `json:"num_dmm_put_msg,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConnpoolConfig connpool config
// swagger:model ConnpoolConfig
type ConnpoolConfig struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IDLETimeout *int32 `json:"idle_timeout"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	LifeTimeout *int32 `json:"life_timeout"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	LoThresh *int32 `json:"lo_thresh"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MaxCache *int32 `json:"max_cache"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MaxReuse *int32 `json:"max_reuse"`

	//  Enum options - CP_STRATEGY_NONE, CP_STRATEGY_SWITCH_REQ, CP_STRATEGY_SWITCH_CONN, CP_STRATEGY_SWITCH_SESS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Strategy *string `json:"strategy"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ThreshTimeout *int32 `json:"thresh_timeout"`
}

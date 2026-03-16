// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeLogStatsRuntime se log stats runtime
// swagger:model SeLogStatsRuntime
type SeLogStatsRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ApplAdfHit *uint64 `json:"appl_adf_hit"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ApplAdfLimit *uint64 `json:"appl_adf_limit"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ApplAdfMiss *uint64 `json:"appl_adf_miss"`

	//  Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ApplAdfMissLogAgentDown *uint64 `json:"appl_adf_miss_log_agent_down"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ApplNfHit *uint64 `json:"appl_nf_hit"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ApplNfLimit *uint64 `json:"appl_nf_limit"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ApplNfMiss *uint64 `json:"appl_nf_miss"`

	//  Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ApplNfMissLogAgentDown *uint64 `json:"appl_nf_miss_log_agent_down"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ApplUdfHit *uint64 `json:"appl_udf_hit"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ApplUdfLimit *uint64 `json:"appl_udf_limit"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ApplUdfMiss *uint64 `json:"appl_udf_miss"`

	//  Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ApplUdfMissLogAgentDown *uint64 `json:"appl_udf_miss_log_agent_down"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnAdfHit *uint64 `json:"conn_adf_hit"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnAdfLimit *uint64 `json:"conn_adf_limit"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnAdfMiss *uint64 `json:"conn_adf_miss"`

	//  Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnAdfMissLogAgentDown *uint64 `json:"conn_adf_miss_log_agent_down"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnNfHit *uint64 `json:"conn_nf_hit"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnNfLimit *uint64 `json:"conn_nf_limit"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnNfMiss *uint64 `json:"conn_nf_miss"`

	//  Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnNfMissLogAgentDown *uint64 `json:"conn_nf_miss_log_agent_down"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnUdfHit *uint64 `json:"conn_udf_hit"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnUdfLimit *uint64 `json:"conn_udf_limit"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnUdfMiss *uint64 `json:"conn_udf_miss"`

	//  Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnUdfMissLogAgentDown *uint64 `json:"conn_udf_miss_log_agent_down"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Count *uint64 `json:"count"`

	//  Field introduced in 18.2.8, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DebugDropCount *uint64 `json:"debug_drop_count,omitempty"`

	//  Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DebugDropLogAgentDownCount *uint64 `json:"debug_drop_log_agent_down_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	EventHit *uint64 `json:"event_hit"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	EventMiss *uint64 `json:"event_miss"`

	//  Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	EventMissLogAgentDown *uint64 `json:"event_miss_log_agent_down"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	EventMissSzExceed *uint64 `json:"event_miss_sz_exceed"`

	//  Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ExtSrvrResponseCounter *uint64 `json:"ext_srvr_response_counter"`
}

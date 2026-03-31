// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServerStats server stats
// swagger:model ServerStats
type ServerStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BadConnections *uint64 `json:"bad_connections,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CapestRandMaxConnSkipped *uint64 `json:"capest_rand_max_conn_skipped,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CurrentConnections *uint64 `json:"current_connections,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CurrentLoad *uint64 `json:"current_load,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CurrentTasks *uint64 `json:"current_tasks,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CurrentTasksFb *uint64 `json:"current_tasks_fb,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FsLoadThresh *int64 `json:"fs_load_thresh,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InlhmBadEwma *uint64 `json:"inlhm_bad_ewma,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InlhmDownDuration *uint64 `json:"inlhm_down_duration,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InlhmGoodEwma *uint64 `json:"inlhm_good_ewma,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InlhmLetthrough *uint64 `json:"inlhm_letthrough,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InlhmSkipBypassed *uint64 `json:"inlhm_skip_bypassed,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InlhmSkipped *uint64 `json:"inlhm_skipped,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbPerSeAggCurrConn *uint64 `json:"lb_per_se_agg_curr_conn,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NoLport *uint64 `json:"no_lport,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PreClosedConnections *uint64 `json:"pre_closed_connections,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PreferenceOrder *uint64 `json:"preference_order,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResponseTime *int64 `json:"response_time,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResponseTimeVar *int64 `json:"response_time_var,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RlBadFb *uint64 `json:"rl_bad_fb,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RlGoodFb *uint64 `json:"rl_good_fb,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SkippedCount *uint64 `json:"skipped_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SkippedGetNextCount *uint64 `json:"skipped_get_next_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalConnections *uint64 `json:"total_connections,omitempty"`
}

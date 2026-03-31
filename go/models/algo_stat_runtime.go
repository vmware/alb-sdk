// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AlgoStatRuntime algo stat runtime
// swagger:model AlgoStatRuntime
type AlgoStatRuntime struct {

	//  Field introduced in 17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CaStats *CoreAffinityStat `json:"ca_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbAlgorithm *string `json:"lb_algorithm,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LcStats *LeastConnectionStat `json:"lc_stats,omitempty"`

	//  Field introduced in 17.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NsStats *NsStat `json:"ns_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WrrStats *WrrStat `json:"wrr_stats,omitempty"`
}

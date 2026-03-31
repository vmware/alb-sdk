// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CoreAffinityStat core affinity stat
// swagger:model CoreAffinityStat
type CoreAffinityStat struct {

	//  Field introduced in 17.1.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CompactCoreNums []int64 `json:"compact_core_nums,omitempty,omitempty"`

	//  Field introduced in 17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CoreNonaffinity *uint32 `json:"core_nonaffinity,omitempty"`

	//  Field introduced in 17.1.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowCores *uint32 `json:"num_flow_cores,omitempty"`

	//  Field introduced in 17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Servers []*LbServer `json:"servers,omitempty"`

	//  Field introduced in 17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StretchFactor *uint32 `json:"stretch_factor,omitempty"`

	//  Field introduced in 17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWeights *uint32 `json:"sum_weights,omitempty"`

	//  Field introduced in 17.1.7,17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WeightedCoreSIndices []*RepeatedSrvIdxWeights `json:"weighted_core_s_indices,omitempty"`
}

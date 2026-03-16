// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeVssPlacement se vss placement
// swagger:model SeVssPlacement
type SeVssPlacement struct {

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Core *uint32 `json:"core,omitempty"`

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CoreNonaffinity *uint32 `json:"core_nonaffinity,omitempty"`

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DedicatedDispatcher *uint32 `json:"dedicated_dispatcher,omitempty"`

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowCores *uint32 `json:"num_flow_cores,omitempty"`

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSubcores *uint32 `json:"num_subcores,omitempty"`

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeVssPlacementEntry []*SeVssPlacementEntry `json:"se_vss_placement_entry,omitempty"`

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StretchFactor *uint32 `json:"stretch_factor,omitempty"`

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWeights *uint32 `json:"sum_weights,omitempty"`
}

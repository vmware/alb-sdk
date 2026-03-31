// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeVssPlacementEntry se vss placement entry
// swagger:model SeVssPlacementEntry
type SeVssPlacementEntry struct {

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Core *uint32 `json:"core,omitempty"`

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeVsPlacementEntry []*SeVsPlacementEntry `json:"se_vs_placement_entry,omitempty"`
}

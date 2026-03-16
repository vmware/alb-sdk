// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeVsPlacementEntry se vs placement entry
// swagger:model SeVsPlacementEntry
type SeVsPlacementEntry struct {

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PlacedWeight *uint32 `json:"placed_weight,omitempty"`

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsUUID *string `json:"vs_uuid,omitempty"`
}

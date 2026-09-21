// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// InventoryMapPoolGroupMember inventory map pool group member
// swagger:model InventoryMapPoolGroupMember
type InventoryMapPoolGroupMember struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolRef *string `json:"pool_ref,omitempty"`

	// Resolved detail of the referenced pool, same shape as an item in the VS's pools list; {} if the pool no longer exists. Additional PoolGroupSerializer member fields (e.g. priority_label, ratio) are passed through but not enumerated here. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolRefData *InventoryMapPool `json:"pool_ref_data,omitempty"`
}

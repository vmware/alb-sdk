// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ImageInventory image inventory
// swagger:model ImageInventory
type ImageInventory struct {

	// Count of total entries in Image Inventory. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Count *int32 `json:"count,omitempty"`

	// Information of all the images for inventory. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Results []*ImageInventoryVersion `json:"results,omitempty"`
}

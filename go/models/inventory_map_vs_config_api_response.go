// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// InventoryMapVsConfigAPIResponse inventory map vs config Api response
// swagger:model InventoryMapVsConfigApiResponse
type InventoryMapVsConfigAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*InventoryMapVsConfig `json:"results,omitempty"`
}

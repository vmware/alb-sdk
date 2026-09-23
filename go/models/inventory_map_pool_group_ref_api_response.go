// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// InventoryMapPoolGroupRefAPIResponse inventory map pool group ref Api response
// swagger:model InventoryMapPoolGroupRefApiResponse
type InventoryMapPoolGroupRefAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*InventoryMapPoolGroupRef `json:"results,omitempty"`
}

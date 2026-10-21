// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AkoAmkoClusterInventoryResponse ako amko cluster inventory response
// swagger:model AkoAmkoClusterInventoryResponse
type AkoAmkoClusterInventoryResponse struct {

	// Total number of AKO/AMKO clusters matching the query. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Count *uint32 `json:"count"`

	// URL of the next page of results, present only when more results remain. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Next *string `json:"next,omitempty"`

	// Page of AKO/AMKO cluster inventory entries. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Results []*AkoAmkoClusterInventory `json:"results,omitempty"`
}

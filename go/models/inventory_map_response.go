// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// InventoryMapResponse inventory map response
// swagger:model InventoryMapResponse
type InventoryMapResponse struct {

	// Total number of Virtual Services. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Count *uint32 `json:"count,omitempty"`

	// URL of the next page of results, if any. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Next *string `json:"next,omitempty"`

	// Per-VS inventory-map entries. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Results []*InventoryMapVsEntry `json:"results,omitempty"`

	// Flat de-duplicated list of ServiceEngines referenced by any VS in results, each entry only populates uuid/name/url/cloud_ref. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Serviceengines []*ServiceEngineInventory `json:"serviceengines,omitempty"`
}

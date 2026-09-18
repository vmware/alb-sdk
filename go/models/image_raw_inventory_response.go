// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ImageRawInventoryResponse image raw inventory response
// swagger:model ImageRawInventoryResponse
type ImageRawInventoryResponse struct {

	// Total number of image entries across all pages. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Count *uint32 `json:"count"`

	// URL of the next page, present only when more results remain. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Next *string `json:"next,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Results []*ImageRawInventoryEntry `json:"results,omitempty"`
}

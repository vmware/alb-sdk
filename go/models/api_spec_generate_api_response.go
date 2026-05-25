// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APISpecGenerateAPIResponse Api spec generate Api response
// swagger:model ApiSpecGenerateApiResponse
type APISpecGenerateAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*APISpecGenerate `json:"results,omitempty"`
}

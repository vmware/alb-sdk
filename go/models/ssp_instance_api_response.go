// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SspInstanceAPIResponse ssp instance Api response
// swagger:model SspInstanceApiResponse
type SspInstanceAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*SspInstance `json:"results,omitempty"`
}

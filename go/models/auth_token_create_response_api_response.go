// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AuthTokenCreateResponseAPIResponse auth token create response Api response
// swagger:model AuthTokenCreateResponseApiResponse
type AuthTokenCreateResponseAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*AuthTokenCreateResponse `json:"results,omitempty"`
}

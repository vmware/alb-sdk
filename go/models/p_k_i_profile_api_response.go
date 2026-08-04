// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PKIProfileAPIResponse p k i profile Api response
// swagger:model PKIProfileApiResponse
type PKIProfileAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*PKIProfile `json:"results,omitempty"`
}

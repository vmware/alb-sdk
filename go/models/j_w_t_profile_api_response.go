// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// JWTProfileAPIResponse j w t profile Api response
// swagger:model JWTProfileApiResponse
type JWTProfileAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*JWTProfile `json:"results,omitempty"`
}

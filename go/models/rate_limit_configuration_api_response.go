// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RateLimitConfigurationAPIResponse rate limit configuration Api response
// swagger:model RateLimitConfigurationApiResponse
type RateLimitConfigurationAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*RateLimitConfiguration `json:"results,omitempty"`
}

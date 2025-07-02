// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIRateLimitProfileAPIResponse Api rate limit profile Api response
// swagger:model ApiRateLimitProfileApiResponse
type APIRateLimitProfileAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*APIRateLimitProfile `json:"results,omitempty"`
}

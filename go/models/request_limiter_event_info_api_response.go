// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RequestLimiterEventInfoAPIResponse request limiter event info Api response
// swagger:model RequestLimiterEventInfoApiResponse
type RequestLimiterEventInfoAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*RequestLimiterEventInfo `json:"results,omitempty"`
}

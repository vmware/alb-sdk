// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ApplicationInsightsStateAPIResponse application insights state Api response
// swagger:model ApplicationInsightsStateApiResponse
type ApplicationInsightsStateAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*ApplicationInsightsState `json:"results,omitempty"`
}

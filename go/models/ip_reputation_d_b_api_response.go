// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPReputationDBAPIResponse IP reputation d b Api response
// swagger:model IPReputationDBApiResponse
type IPReputationDBAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*IPReputationDB `json:"results,omitempty"`
}

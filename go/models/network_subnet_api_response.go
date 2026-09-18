// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NetworkSubnetAPIResponse network subnet Api response
// swagger:model NetworkSubnetApiResponse
type NetworkSubnetAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*NetworkSubnet `json:"results,omitempty"`
}

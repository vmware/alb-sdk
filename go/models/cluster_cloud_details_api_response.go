// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClusterCloudDetailsAPIResponse cluster cloud details Api response
// swagger:model ClusterCloudDetailsApiResponse
type ClusterCloudDetailsAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*ClusterCloudDetails `json:"results,omitempty"`
}

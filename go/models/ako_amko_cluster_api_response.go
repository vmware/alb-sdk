// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AkoAmkoClusterAPIResponse ako amko cluster Api response
// swagger:model AkoAmkoClusterApiResponse
type AkoAmkoClusterAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*AkoAmkoCluster `json:"results,omitempty"`
}

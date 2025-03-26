// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RetentionPolicyAPIResponse retention policy Api response
// swagger:model RetentionPolicyApiResponse
type RetentionPolicyAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*RetentionPolicy `json:"results,omitempty"`
}

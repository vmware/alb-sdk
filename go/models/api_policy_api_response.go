// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIPolicyAPIResponse Api policy Api response
// swagger:model ApiPolicyApiResponse
type APIPolicyAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*APIPolicy `json:"results,omitempty"`
}

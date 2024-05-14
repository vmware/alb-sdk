// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TrustedHostProfileAPIResponse trusted host profile Api response
// swagger:model TrustedHostProfileApiResponse
type TrustedHostProfileAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*TrustedHostProfile `json:"results,omitempty"`
}

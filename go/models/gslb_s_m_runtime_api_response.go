// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbSMRuntimeAPIResponse gslb s m runtime Api response
// swagger:model GslbSMRuntimeApiResponse
type GslbSMRuntimeAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*GslbSMRuntime `json:"results,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbHSMRuntimeAPIResponse gslb h s m runtime Api response
// swagger:model GslbHSMRuntimeApiResponse
type GslbHSMRuntimeAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*GslbHSMRuntime `json:"results,omitempty"`
}

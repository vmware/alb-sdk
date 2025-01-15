// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbCRMRuntimeAPIResponse gslb c r m runtime Api response
// swagger:model GslbCRMRuntimeApiResponse
type GslbCRMRuntimeAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*GslbCRMRuntime `json:"results,omitempty"`
}

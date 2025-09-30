// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TenantBindingAPIResponse tenant binding Api response
// swagger:model TenantBindingApiResponse
type TenantBindingAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*TenantBinding `json:"results,omitempty"`
}

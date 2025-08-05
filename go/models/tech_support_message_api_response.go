// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TechSupportMessageAPIResponse tech support message Api response
// swagger:model TechSupportMessageApiResponse
type TechSupportMessageAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*TechSupportMessage `json:"results,omitempty"`
}

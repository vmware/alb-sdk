// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ALBServicesStatusAPIResponse a l b services status Api response
// swagger:model ALBServicesStatusApiResponse
type ALBServicesStatusAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*ALBServicesStatus `json:"results,omitempty"`
}

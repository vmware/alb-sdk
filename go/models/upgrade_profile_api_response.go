// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UpgradeProfileAPIResponse upgrade profile Api response
// swagger:model UpgradeProfileApiResponse
type UpgradeProfileAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*UpgradeProfile `json:"results,omitempty"`
}

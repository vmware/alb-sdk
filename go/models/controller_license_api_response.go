// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ControllerLicenseAPIResponse controller license Api response
// swagger:model ControllerLicenseApiResponse
type ControllerLicenseAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*ControllerLicense `json:"results,omitempty"`
}

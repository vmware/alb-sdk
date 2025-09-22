// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CertJwtStoreAPIResponse cert jwt store Api response
// swagger:model CertJwtStoreApiResponse
type CertJwtStoreAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*CertJwtStore `json:"results,omitempty"`
}

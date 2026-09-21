// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// FileServiceEntryAPIResponse file service entry Api response
// swagger:model FileServiceEntryApiResponse
type FileServiceEntryAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*FileServiceEntry `json:"results,omitempty"`
}

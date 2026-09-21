// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// FileServiceListing file service listing
// swagger:model FileServiceListing
type FileServiceListing struct {

	// Number of entries in results. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Count *uint32 `json:"count"`

	// Directory listing entries for the requested controller // sub-directory. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Results []*FileServiceEntry `json:"results,omitempty"`
}

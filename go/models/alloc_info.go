// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AllocInfo alloc info
// swagger:model AllocInfo
type AllocInfo struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	BytesAllocated *uint64 `json:"bytes_allocated"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumberOfDallocs *uint64 `json:"number_of_dallocs"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumberOfMallocs *uint64 `json:"number_of_mallocs"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumberOfRequests *uint64 `json:"number_of_requests"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Mallstats mallstats
// swagger:model Mallstats
type Mallstats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	BytesAllocated *uint64 `json:"bytes_allocated"`

	// Free queue size in bytes. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BytesFree *uint64 `json:"bytes_free,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	BytesMapped *uint64 `json:"bytes_mapped"`
}

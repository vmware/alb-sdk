// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HTTPCacheETypeStats Http cache e type stats
// swagger:model HttpCacheETypeStats
type HTTPCacheETypeStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Count *int32 `json:"count"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Encoding *string `json:"encoding"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CacheLocalStats cache local stats
// swagger:model CacheLocalStats
type CacheLocalStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumEvicts *uint32 `json:"num_evicts"`
}

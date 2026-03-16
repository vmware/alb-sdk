// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CacheGlobalStats cache global stats
// swagger:model CacheGlobalStats
type CacheGlobalStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	CurrSize *uint64 `json:"curr_size"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MaxSize *uint64 `json:"max_size"`
}

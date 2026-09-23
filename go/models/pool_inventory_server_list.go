// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PoolInventoryServerList pool inventory server list
// swagger:model PoolInventoryServerList
type PoolInventoryServerList struct {

	// Total number of servers matching the query. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Count *uint32 `json:"count"`

	// URL of the next page of results, if any. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Next *string `json:"next,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Results []*PoolInventoryServer `json:"results,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConnectionItem connection item
// swagger:model ConnectionItem
type ConnectionItem struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Connection *ConnectionEntry `json:"connection"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReuseCnt *int32 `json:"reuse_cnt,omitempty"`
}

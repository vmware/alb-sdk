// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeCreateStats se create stats
// swagger:model SeCreateStats
type SeCreateStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSeCreate *int32 `json:"num_se_create,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSeCreateFail *int32 `json:"num_se_create_fail,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSeCreateSuccess *int32 `json:"num_se_create_success,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSeCreateTimeout *int32 `json:"num_se_create_timeout,omitempty"`
}

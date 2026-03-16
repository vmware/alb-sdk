// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentGraphDBNodeStats se agent graph d b node stats
// swagger:model SeAgentGraphDBNodeStats
type SeAgentGraphDBNodeStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DeleteStats *SeAgentGraphDBNodeTxnStats `json:"delete_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumCreate *int32 `json:"num_create,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDelete *int32 `json:"num_delete,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumRead *int32 `json:"num_read,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumUpdate *int32 `json:"num_update,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReadStats *SeAgentGraphDBNodeTxnStats `json:"read_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UpdateStats *SeAgentGraphDBNodeTxnStats `json:"update_stats,omitempty"`
}

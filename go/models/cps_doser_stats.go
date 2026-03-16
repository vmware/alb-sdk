// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CpsDoserStats cps doser stats
// swagger:model CpsDoserStats
type CpsDoserStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CpsDoserEntry []*CpsDoserEntry `json:"cps_doser_entry,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumCpsDosers *uint32 `json:"num_cps_dosers,omitempty"`
}

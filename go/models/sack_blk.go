// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SackBlk sack blk
// swagger:model SackBlk
type SackBlk struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EndSeq *uint32 `json:"end_seq,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StartSeq *uint32 `json:"start_seq,omitempty"`
}

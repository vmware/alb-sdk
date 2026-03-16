// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SocketBufferInfo socket buffer info
// swagger:model SocketBufferInfo
type SocketBufferInfo struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SbCc *uint32 `json:"sb_cc,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SbCredit *uint32 `json:"sb_credit,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SbFlags *uint32 `json:"sb_flags,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SbHiwat *uint32 `json:"sb_hiwat,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SbLowat *uint32 `json:"sb_lowat,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SbMcnt *uint32 `json:"sb_mcnt,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SbSndptroff *uint32 `json:"sb_sndptroff,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SbState *uint32 `json:"sb_state,omitempty"`
}

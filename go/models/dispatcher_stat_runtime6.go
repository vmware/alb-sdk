// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DispatcherStatRuntime6 dispatcher stat runtime6
// swagger:model DispatcherStatRuntime6
type DispatcherStatRuntime6 struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Dispatch []*IndivdispatcherRuntime `json:"dispatch,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InitseenSctpNumEntries *uint32 `json:"initseen_sctp_num_entries,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SynAttackMode *bool `json:"syn_attack_mode,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SynAttackModeNum *uint32 `json:"syn_attack_mode_num,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SynseenNumEntries *uint32 `json:"synseen_num_entries,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DispatcherStatRuntime dispatcher stat runtime
// swagger:model DispatcherStatRuntime
type DispatcherStatRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Dispatch []*IndivdispatcherRuntime `json:"dispatch,omitempty"`

	// The number of embryonic connections to VIP with sctp flow table entries. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InitseenSctpNumEntries *uint32 `json:"initseen_sctp_num_entries,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// Whether the dispatcher is in syn attack mode. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SynAttackMode *bool `json:"syn_attack_mode,omitempty"`

	// Number of times dispatcher went into syn attack mode. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SynAttackModeNum *uint32 `json:"syn_attack_mode_num,omitempty"`

	// The number of embryonic connections to VIP with flow table entries. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SynseenNumEntries *uint32 `json:"synseen_num_entries,omitempty"`
}

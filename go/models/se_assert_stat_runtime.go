// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAssertStatRuntime se assert stat runtime
// swagger:model SeAssertStatRuntime
type SeAssertStatRuntime struct {

	// Processor ID. Field introduced in 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	// SE UUID. Field introduced in 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// Assert Stats Entries. Field introduced in 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeassertstatEntries []*SeAssertStatEntry `json:"seassertstat_entries,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ShMallocStatRuntime sh malloc stat runtime
// swagger:model ShMallocStatRuntime
type ShMallocStatRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShMallocstatEntry []*ShMallocStatEntry `json:"sh_mallocstat_entry,omitempty"`
}

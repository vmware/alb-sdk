// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentAssertStatRuntime se agent assert stat runtime
// swagger:model SeAgentAssertStatRuntime
type SeAgentAssertStatRuntime struct {

	// SE UUID. Field introduced in 18.1.5, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// Show the assert statistics. Field introduced in 18.1.5, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeassertstatEntries []*SeAssertStatEntry `json:"seassertstat_entries,omitempty"`
}

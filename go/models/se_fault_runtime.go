// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeFaultRuntime se fault runtime
// swagger:model SeFaultRuntime
type SeFaultRuntime struct {

	// ID of the process executing the fault. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	// Runtime stats of each fault that has been or is configured to be executed. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeFaultRuntimeEntries []*SeFaultRuntimeEntry `json:"se_fault_runtime_entries,omitempty"`

	// UUID of the SE executing the fault. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`
}

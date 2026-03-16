// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeFaultRuntimeEntry se fault runtime entry
// swagger:model SeFaultRuntimeEntry
type SeFaultRuntimeEntry struct {

	// Number of times the fault will be executed. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ExecutionsRemaining *uint32 `json:"executions_remaining,omitempty"`

	// Name of the fault. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FaultName *string `json:"fault_name,omitempty"`

	// Name of the function containing the fault. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FunctionName *string `json:"function_name,omitempty"`

	// Number of times the fault will be skipped before executing. Field introduced in 18.2.9. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SkipsRemaining *uint32 `json:"skips_remaining,omitempty"`

	// Number of times the fault has been executed. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalExecutions *uint32 `json:"total_executions,omitempty"`
}

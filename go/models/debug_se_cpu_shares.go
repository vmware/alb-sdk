// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DebugSeCPUShares debug se Cpu shares
// swagger:model DebugSeCpuShares
type DebugSeCPUShares struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	CPU *uint32 `json:"cpu"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Shares *int32 `json:"shares"`
}

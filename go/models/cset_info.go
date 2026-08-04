// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CsetInfo cset info
// swagger:model CsetInfo
type CsetInfo struct {

	// cpu  CPUs in the cpuset; x  CPUs exclusivity indicated as y|n (yes|no). Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CPUx *string `json:"cpu_x,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CsetName *string `json:"cset_name,omitempty"`

	// Number of processes in the cpuset. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Tasks *uint32 `json:"tasks,omitempty"`
}

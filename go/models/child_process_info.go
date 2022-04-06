// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ChildProcessInfo child process info
// swagger:model ChildProcessInfo
type ChildProcessInfo struct {

	// Amount of memory (in MB) used by the sub process. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Memory *int32 `json:"memory,omitempty"`

	// Process Id of the sub process. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Pid *int32 `json:"pid,omitempty"`
}

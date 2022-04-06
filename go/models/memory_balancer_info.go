// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MemoryBalancerInfo memory balancer info
// swagger:model MemoryBalancerInfo
type MemoryBalancerInfo struct {

	// Child process information. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Child []*ChildProcessInfo `json:"child,omitempty"`

	// Current controller memory (in GB) usage. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ControllerMemory *int32 `json:"controller_memory,omitempty"`

	// Percent usage of total controller memory. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	ControllerMemoryUsagePercent *float64 `json:"controller_memory_usage_percent,omitempty"`

	// Holder for debug message. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	DebugMessage *string `json:"debug_message,omitempty"`

	// Limit on the memory (in KB) for the Process. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Limit *int32 `json:"limit,omitempty"`

	// Amount of memory (in KB) used by the Process. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	MemoryUsed *int32 `json:"memory_used,omitempty"`

	// PID of the Process. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Pid *int32 `json:"pid,omitempty"`

	// Name of the Process. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Process *string `json:"process,omitempty"`

	// Current mode of the process. Enum options - REGULAR, DEBUG, DEGRADED, STOP. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	ProcessMode *string `json:"process_mode,omitempty"`

	// Current usage trend of the process. Enum options - UPWARD, DOWNWARD, NEUTRAL. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	ProcessTrend *string `json:"process_trend,omitempty"`

	// Percent usage of the process limit. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	ThresholdPercent *float64 `json:"threshold_percent,omitempty"`
}

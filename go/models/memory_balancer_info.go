// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MemoryBalancerInfo memory balancer info
// swagger:model MemoryBalancerInfo
type MemoryBalancerInfo struct {

	// Child process information.
	Child []*ChildProcessInfo `json:"child,omitempty"`

	// Current controller memory (in GB) usage.
	ControllerMemory *int32 `json:"controller_memory,omitempty"`

	// Percent usage of total controller memory. Field introduced in 21.1.1.
	ControllerMemoryUsagePercent *float64 `json:"controller_memory_usage_percent,omitempty"`

	// Holder for debug message. Field introduced in 21.1.1.
	DebugMessage *string `json:"debug_message,omitempty"`

	// Limit on the memory (in KB) for the Process.
	Limit *int32 `json:"limit,omitempty"`

	// Amount of memory (in KB) used by the Process.
	MemoryUsed *int32 `json:"memory_used,omitempty"`

	// PID of the Process.
	Pid *int32 `json:"pid,omitempty"`

	// Name of the Process.
	Process *string `json:"process,omitempty"`

	// Current mode of the process. Enum options - REGULAR, DEBUG, DEGRADED, STOP. Field introduced in 21.1.1.
	ProcessMode *string `json:"process_mode,omitempty"`

	// Current usage trend of the process. Enum options - UPWARD, DOWNWARD, NEUTRAL. Field introduced in 21.1.1.
	ProcessTrend *string `json:"process_trend,omitempty"`

	// Percent usage of the process limit. Field introduced in 21.1.1.
	ThresholdPercent *float64 `json:"threshold_percent,omitempty"`
}

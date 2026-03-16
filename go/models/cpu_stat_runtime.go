// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CPUStatRuntime Cpu stat runtime
// swagger:model CpuStatRuntime
type CPUStatRuntime struct {

	// Available memory of SE in Kilo Bytes. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvailableMemory *uint32 `json:"available_memory,omitempty"`

	// Average CPU utilization due to the threads spawned by the datapath. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgDpThreadUsage *float64 `json:"avg_dp_thread_usage,omitempty"`

	// CPU sets created for SE DP isolation. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Cset []*CsetInfo `json:"cset,omitempty"`

	// Average CPU Utilisation for dispatcher operation,. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DispatcherDpCPUUtilization *float64 `json:"dispatcher_dp_cpu_utilization,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FreeMemory *uint32 `json:"free_memory,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IDLECPU *float64 `json:"idle_cpu,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcessCPUUtilization []*ProcCPUStat `json:"process_cpu_utilization,omitempty"`

	// Average CPU Utilisation for non-dispatcher operation. This includes proxy and miscellaneous work. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProxyDpCPUUtilization *float64 `json:"proxy_dp_cpu_utilization,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// Deprecated. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SystemCPUUtilization *float64 `json:"system_cpu_utilization,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalCPUUtilization *float64 `json:"total_cpu_utilization,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalLinuxCPUUtilization *float64 `json:"total_linux_cpu_utilization,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalMemory *uint32 `json:"total_memory,omitempty"`
}

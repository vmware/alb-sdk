// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ProcCPUStat proc Cpu stat
// swagger:model ProcCpuStat
type ProcCPUStat struct {

	// CPU Utilisation for dispatcher operation. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DispCPUUtil *float64 `json:"disp_cpu_util,omitempty"`

	// CPU utilization due to the threads spawned by the datapath. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpThreadUsage *float64 `json:"dp_thread_usage,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcessCPUEwma *float64 `json:"process_cpu_ewma,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcessCPUUsage *float64 `json:"process_cpu_usage,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcessMemoryUsage *float64 `json:"process_memory_usage,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcessName *string `json:"process_name,omitempty"`

	// CPU Utilisation for non-dispatcher operation. This includes proxy and miscellaneous work. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProxyCPUUtil *float64 `json:"proxy_cpu_util,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CPUStatRuntimeDetail Cpu stat runtime detail
// swagger:model CpuStatRuntimeDetail
type CPUStatRuntimeDetail struct {

	// Average CPU utilization due to the threads spawned by the datapath. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgDpThreadUsage *float64 `json:"avg_dp_thread_usage,omitempty"`

	// CPU utilization value reported to controller. Field introduced in 17.2.10, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CPUUtilization *float64 `json:"cpu_utilization,omitempty"`

	// Average CPU utilization due to dispatching (non-proxy) work. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DispatcherDpCPUUtilization *float64 `json:"dispatcher_dp_cpu_utilization,omitempty"`

	// Total CPU utilization of all process from linux. Field introduced in 17.2.10, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LinuxCPUUtilization *float64 `json:"linux_cpu_utilization,omitempty"`

	// CPU utilization of se_dp process from linux. Field introduced in 17.2.10, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LinuxDpCPUUtilization *float64 `json:"linux_dp_cpu_utilization,omitempty"`

	// Average CPU utilization due to proxy work. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProxyDpCPUUtilization *float64 `json:"proxy_dp_cpu_utilization,omitempty"`

	// CPU utilization of se_dp process calculated in userspace. Field introduced in 17.2.10, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RealDpCPUUtilization *float64 `json:"real_dp_cpu_utilization,omitempty"`

	// Deprecated. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SystemCPUUtilization *float64 `json:"system_cpu_utilization,omitempty"`

	// Time at which CPU utilization is calculated. Field introduced in 17.2.10, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Timestamp *string `json:"timestamp,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DebugServiceEngineSustainedCPUSpike debug service engine sustained Cpu spike
// swagger:model DebugServiceEngineSustainedCpuSpike
type DebugServiceEngineSustainedCPUSpike struct {

	// cpu(s) filter for which high load will trigger debug data collection. Should be comma seperated with no space ( eg  0,1,4 ). Ranges can be given ( eg  2,4-6 ). Field introduced in 31.1.2. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	CPUFilter *string `json:"cpu_filter,omitempty"`

	// Average Percent usage of CPU ( either total and/or percpu ) to be considered for CPU to be under high load. Allowed values are 0-100. Field introduced in 31.1.2. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	CPUSpikePercent *uint32 `json:"cpu_spike_percent,omitempty"`

	// Toggle High CPU Trigger action. Set to true, to dis-enable High CPU Data Collection Script invocation. Field introduced in 31.1.2. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	DisEnable *bool `json:"dis_enable,omitempty"`

	// Invokes High CPU Data Collection on SE for duration of an hour. Alert  Operator will have to manually dis-enable this and manage SE disk-space!. Field introduced in 31.1.2. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ManualStart *bool `json:"manual_start,omitempty"`

	// List of process' pid(s) for which debug data should be recorded. Field introduced in 31.1.2. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Pids []int64 `json:"pids,omitempty,omitempty"`

	// List of process' name(s) for which debug data should be recorded. Field introduced in 31.1.2. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ProcessNames []string `json:"process_names,omitempty"`

	// Interval between each such script invocation. Should be >= 60. Allowed values are 60-864000. Field introduced in 31.1.2. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SampleCooldown *uint32 `json:"sample_cooldown,omitempty"`

	// Duration of debug data to be collected. Should be >= 11. Allowed values are 11-864000. Field introduced in 31.1.2. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SampleDuration *uint32 `json:"sample_duration,omitempty"`

	// Time Duration ( in seconds ) to be considered for CPU to be consistently under high load. Should be >= 60s. CPU usage data is collected every 5s. Allowed values are 60-864000. Field introduced in 31.1.2. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SpikeDuration *uint32 `json:"spike_duration,omitempty"`
}

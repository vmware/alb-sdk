// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SEFaultInjectSeParam s e fault inject se param
// swagger:model SEFaultInjectSeParam
type SEFaultInjectSeParam struct {

	// Internal  Duration in seconds to wait before terminating hung se_agent process. Field introduced in 32.1.1. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AgentTerminateOnHungDuration *uint32 `json:"agent_terminate_on_hung_duration,omitempty"`

	// Inject fault in specific core. Field introduced in 18.1.5,18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Core *uint32 `json:"core,omitempty"`

	// Internal  Terminate se_agent upon detecting of > 20s or below configured hung_duration. Set 0 to dis-able, 1 to enable. Allowed values are 0-1. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnableAgentTerminateOnHung *uint32 `json:"enable_agent_terminate_on_hung,omitempty"`

	// Inject Fault on Objects. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ObjNames []string `json:"obj_names,omitempty"`

	// Inject fault in random no of cores. Field introduced in 18.1.5,18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RandomCore *bool `json:"random_core,omitempty"`

	// Set se-agent fault type. Enum options - SE_AGENT_FAULT_DISABLED, SE_AGENT_PRE_PROCESS_FAULT, SE_AGENT_POST_PROCESS_FAULT, SE_AGENT_DP_RESPONSE_FAULT, SE_AGENT_RANDOM_PROCESS_FAULT. Field introduced in 18.1.5,18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeAgentFault *string `json:"se_agent_fault,omitempty"`

	// Set se-dp fault type. Enum options - SE_DP_FAULT_DISABLED. Field introduced in 18.1.5,18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeDpFault *string `json:"se_dp_fault,omitempty"`
}

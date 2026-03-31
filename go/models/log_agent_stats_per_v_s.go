// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LogAgentStatsPerVS log agent stats per v s
// swagger:model LogAgentStatsPerVS
type LogAgentStatsPerVS struct {

	// SE UUID for the hosted Virtual Service. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// Virtual Service Log Agent Stats. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsLogAgentStats []*LogAgentStatsKeyVal `json:"vs_log_agent_stats,omitempty"`
}

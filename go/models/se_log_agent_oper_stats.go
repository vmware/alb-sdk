// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeLogAgentOperStats se log agent oper stats
// swagger:model SeLogAgentOperStats
type SeLogAgentOperStats struct {

	// Last timestamp at which stats were updated. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastUpdatedTimestamp *string `json:"last_updated_timestamp,omitempty"`

	// Various operational statistics for the log agent. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LogAgentOperStats []*LogAgentStatsKeyVal `json:"log_agent_oper_stats,omitempty"`

	// SE UUID. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SeUUID *string `json:"se_uuid"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeLogAgentStats se log agent stats
// swagger:model SeLogAgentStats
type SeLogAgentStats struct {

	// Last timestamp at which stats were cleared and reset. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastClearedTimestamp *string `json:"last_cleared_timestamp,omitempty"`

	// Last timestamp at which stats were updated. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastUpdatedTimestamp *string `json:"last_updated_timestamp,omitempty"`

	// Various log processing related statistics for the log agent. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LogAgentStats []*LogAgentStatsKeyVal `json:"log_agent_stats,omitempty"`

	// SE UUID. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SeUUID *string `json:"se_uuid"`
}

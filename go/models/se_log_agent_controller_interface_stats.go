// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeLogAgentControllerInterfaceStats se log agent controller interface stats
// swagger:model SeLogAgentControllerInterfaceStats
type SeLogAgentControllerInterfaceStats struct {

	// Last timestamp at which stats were cleared and reset. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastClearedTimestamp *string `json:"last_cleared_timestamp,omitempty"`

	// Last timestamp at which stats were updated. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastUpdatedTimestamp *string `json:"last_updated_timestamp,omitempty"`

	// Various controller rysnc related statistics for the log agent. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LogAgentControllerRsyncStats []*LogAgentStatsKeyVal `json:"log_agent_controller_rsync_stats,omitempty"`

	// SE UUID. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SeUUID *string `json:"se_uuid"`
}

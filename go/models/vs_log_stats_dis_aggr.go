// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsLogStatsDisAggr vs log stats dis aggr
// swagger:model VsLogStatsDisAggr
type VsLogStatsDisAggr struct {

	// Last timestamp at which stats were cleared and reset. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastClearedTimestamp *string `json:"last_cleared_timestamp,omitempty"`

	// Last timestamp at which stats were updated. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastUpdatedTimestamp *string `json:"last_updated_timestamp,omitempty"`

	// SE UUID for the hosted Virtual Service. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// Various VS log stats per SE. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsLogAgentStats []*LogAgentStatsKeyVal `json:"vs_log_agent_stats,omitempty"`
}

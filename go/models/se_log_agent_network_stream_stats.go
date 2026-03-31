// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeLogAgentNetworkStreamStats se log agent network stream stats
// swagger:model SeLogAgentNetworkStreamStats
type SeLogAgentNetworkStreamStats struct {

	// Last timestamp at which stats were cleared and reset. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastClearedTimestamp *string `json:"last_cleared_timestamp,omitempty"`

	// Last timestamp at which stats were updated. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastUpdatedTimestamp *string `json:"last_updated_timestamp,omitempty"`

	// Statistics on log streaming to each configured network destination. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LogAgentNetworkStreamStats []*NetworkDestinationStats `json:"log_agent_network_stream_stats,omitempty"`

	// SE UUID. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SeUUID *string `json:"se_uuid"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NetworkDestinationStats network destination stats
// swagger:model NetworkDestinationStats
type NetworkDestinationStats struct {

	// Streaming endpoint maintained as a candidate key consisting of ip + port + format. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NetworkDestination *string `json:"network_destination"`

	// Various stream related stats for a given destination. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NetworkStreamStats []*LogAgentStatsKeyVal `json:"network_stream_stats,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIRoutingRule A named rule that matches requests based on header values to route specific API traffic. All conditions defined within the rule must be satisfied for the rule to be applied.
// swagger:model ApiRoutingRule
type APIRoutingRule struct {

	// Match criteria containing only header matches for routing. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Matches *MatchTarget `json:"matches"`

	// Name for the routing rule. Must be unique within api_routing_info. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`
}

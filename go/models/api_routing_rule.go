// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIRoutingRule Api routing rule
// swagger:model ApiRoutingRule
type APIRoutingRule struct {

	// Match criteria containing only header matches for routing. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Matches *MatchTarget `json:"matches"`

	// Name for the routing rule. Must be unique within api_routing_info. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`
}

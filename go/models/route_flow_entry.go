// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RouteFlowEntry route flow entry
// swagger:model RouteFlowEntry
type RouteFlowEntry struct {

	// Entry age in seconds. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Age *uint32 `json:"age,omitempty"`

	// Cached mac of client used for auto gateway. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AutoGwMac *string `json:"auto_gw_mac,omitempty"`

	// Entry last used seconds ago. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastUsed *uint32 `json:"last_used,omitempty"`

	// Source and Destination IP/Port before Routing. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MappedFlow *SimpleconnEntry `json:"mapped_flow,omitempty"`

	// Source and Destination IP/Port before Routing. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OriginalFlow *SimpleconnEntry `json:"original_flow,omitempty"`

	// IP Protocol type. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Protocol *uint32 `json:"protocol,omitempty"`

	// State of the Route flow. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StateName *string `json:"state_name,omitempty"`

	// Vrf name. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VrfName *string `json:"vrf_name,omitempty"`
}

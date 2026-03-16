// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NatFlowEntry nat flow entry
// swagger:model NatFlowEntry
type NatFlowEntry struct {

	// Entry age in seconds. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Age *uint32 `json:"age,omitempty"`

	// Entry last used seconds ago. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastUsed *uint32 `json:"last_used,omitempty"`

	// Source and Destination IP/Port before NAT. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MappedFlow *SimpleconnEntry `json:"mapped_flow,omitempty"`

	// Source and Destination IP/Port before NAT. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OriginalFlow *SimpleconnEntry `json:"original_flow,omitempty"`

	// IP Protocol type. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Protocol *uint32 `json:"protocol,omitempty"`

	// State of the NAT flow. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StateName *string `json:"state_name,omitempty"`

	// Vrf name. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VrfName *string `json:"vrf_name,omitempty"`
}

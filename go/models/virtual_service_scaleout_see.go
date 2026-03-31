// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceScaleoutSee virtual service scaleout see
// swagger:model VirtualServiceScaleoutSee
type VirtualServiceScaleoutSee struct {

	// Number of VS flows terminated on local SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CurrNumLocalFlows *uint64 `json:"curr_num_local_flows,omitempty"`

	// Number of VS flows punted to remote SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CurrNumRemoteFlows *uint64 `json:"curr_num_remote_flows,omitempty"`

	// If True, indicates Heartbeat messaging to this SE is currently not operational. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HasHbIssues *bool `json:"has_hb_issues,omitempty"`

	// IP Address of interface on which HeartBeat messaging is done. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPAddress *IPAddr `json:"ip_address,omitempty"`

	// Set to True if SE is primary for the VS. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsPrimary *bool `json:"is_primary,omitempty"`

	// Cumulative number of VS flows that were punted to this SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsFlows *uint64 `json:"num_vs_flows,omitempty"`

	// UUID of the SE to which VS is scaled out to. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`
}

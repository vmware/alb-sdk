// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ApicAgentBridgeDomainVrfChange apic agent bridge domain vrf change
// swagger:model ApicAgentBridgeDomainVrfChange
type ApicAgentBridgeDomainVrfChange struct {

	//  Field deprecated in 21.1.1.
	BridgeDomain *string `json:"bridge_domain,omitempty"`

	//  Field deprecated in 21.1.1.
	NewVrf *string `json:"new_vrf,omitempty"`

	//  Field deprecated in 21.1.1.
	OldVrf *string `json:"old_vrf,omitempty"`

	//  Field deprecated in 21.1.1.
	PoolList []string `json:"pool_list,omitempty"`

	//  Field deprecated in 21.1.1.
	VsList []string `json:"vs_list,omitempty"`
}

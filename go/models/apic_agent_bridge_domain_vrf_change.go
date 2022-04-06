// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ApicAgentBridgeDomainVrfChange apic agent bridge domain vrf change
// swagger:model ApicAgentBridgeDomainVrfChange
type ApicAgentBridgeDomainVrfChange struct {

	//  Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	BridgeDomain *string `json:"bridge_domain,omitempty"`

	//  Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NewVrf *string `json:"new_vrf,omitempty"`

	//  Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	OldVrf *string `json:"old_vrf,omitempty"`

	//  Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	PoolList []string `json:"pool_list,omitempty"`

	//  Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	VsList []string `json:"vs_list,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ApicAgentGenericEventDetails apic agent generic event details
// swagger:model ApicAgentGenericEventDetails
type ApicAgentGenericEventDetails struct {

	//  Field deprecated in 21.1.1.
	ContractGraphs []string `json:"contract_graphs,omitempty"`

	//  Field deprecated in 21.1.1.
	LifCifAttachment []string `json:"lif_cif_attachment,omitempty"`

	//  Field deprecated in 21.1.1.
	Lifs []string `json:"lifs,omitempty"`

	//  Field deprecated in 21.1.1.
	Networks []string `json:"networks,omitempty"`

	//  Field deprecated in 21.1.1.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Field deprecated in 21.1.1.
	ServiceEngineVnics []string `json:"service_engine_vnics,omitempty"`

	//  Field deprecated in 21.1.1.
	TenantName *string `json:"tenant_name,omitempty"`

	//  Field deprecated in 21.1.1.
	TenantUUID *string `json:"tenant_uuid,omitempty"`

	//  Field deprecated in 21.1.1.
	VnicNetworkAttachment []string `json:"vnic_network_attachment,omitempty"`

	//  Field deprecated in 21.1.1.
	VsName *string `json:"vs_name,omitempty"`

	//  Field deprecated in 21.1.1.
	VsUUID *string `json:"vs_uuid,omitempty"`
}

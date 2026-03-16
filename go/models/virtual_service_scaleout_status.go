// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceScaleoutStatus virtual service scaleout status
// swagger:model VirtualServiceScaleoutStatus
type VirtualServiceScaleoutStatus struct {

	// Algorithm used by Primary SE of l2-scaleout VS to distribute flows to secondary SE's. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowDistributionAlgo *string `json:"flow_distribution_algo,omitempty"`

	// Encapsulation used for IPC messages between primary and secondary SE's. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IpcEncapType *string `json:"ipc_encap_type,omitempty"`

	// Number of VS packets punted to remote SE's. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsPktsPunted *uint64 `json:"num_vs_pkts_punted,omitempty"`

	// Type of VS Scaleout - L2 or ECMP. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ScaleoutType *string `json:"scaleout_type,omitempty"`

	// Scaleout SE entries. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoSeEntries []*VirtualServiceScaleoutSee `json:"so_se_entries,omitempty"`

	// Cumulative number of VS flows that arrived for VS on the primary SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalNumVsFlows *uint64 `json:"total_num_vs_flows,omitempty"`

	// Set to True if return traffic is tunnelled back from secondary SE to primary SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TunnelMode *bool `json:"tunnel_mode,omitempty"`

	// UUID of the Virtual Service. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsUUID *string `json:"vs_uuid,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceScaleoutStatusDetail virtual service scaleout status detail
// swagger:model VirtualServiceScaleoutStatusDetail
type VirtualServiceScaleoutStatusDetail struct {

	// Algorithm used by Primary SE of l2-scaleout VS to distribute flows to secondary SE's. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlowDistributionAlgo *string `json:"flow_distribution_algo,omitempty"`

	// IP Address of the interface on which this SE is running HeartBeat messaging. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HbIPAddress *IPAddr `json:"hb_ip_address,omitempty"`

	// vnic on which this SE is running HeartBeat messaging. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HbVnicName *string `json:"hb_vnic_name,omitempty"`

	// Encapsulation used for IPC messages between primary and secondary SE's. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IpcEncapType *string `json:"ipc_encap_type,omitempty"`

	// Set to True if SE is primary for the VS. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsPrimary *bool `json:"is_primary,omitempty"`

	// Number of VS packets punted to remote SE's. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsPktsPunted *uint64 `json:"num_vs_pkts_punted,omitempty"`

	// Number of VS packets tunneled back to all remote SE's. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsPktsTunneledBack *uint64 `json:"num_vs_pkts_tunneled_back,omitempty"`

	// Process Id on the primary SE which is reporting SE scaleout status. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	// Name of the SE reporting scaleout data. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReportingSeName *string `json:"reporting_se_name,omitempty"`

	// Type of VS Scaleout - L2 or ECMP. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ScaleoutType *string `json:"scaleout_type,omitempty"`

	// SE load balancing entries for flow distribution using Consistent Hash. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SelbChentries []*SeLbChEntry `json:"selb_chentries,omitempty"`

	// SE load balancing entries for flow distribution using load-aware flow distribution. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SelbEntries []*SeLbTokens `json:"selb_entries,omitempty"`

	// Version of SE-load binheap used for flow-distribution by RSS cores when RSS is enabled. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SelbVersion *uint32 `json:"selb_version,omitempty"`

	// Scaleout SE entries. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoSeeDetails []*VirtualServiceScaleoutSeeDetail `json:"so_see_details,omitempty"`

	// Cumulative number of VS flows that arrived for VS on the primary SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalNumVsFlows *uint64 `json:"total_num_vs_flows,omitempty"`

	// Set to True if return traffic is tunnelled back from secondary SE to primary SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TunnelMode *bool `json:"tunnel_mode,omitempty"`

	// UUID of the Virtual Service. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsUUID *string `json:"vs_uuid,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceSeScaleoutStatus virtual service se scaleout status
// swagger:model VirtualServiceSeScaleoutStatus
type VirtualServiceSeScaleoutStatus struct {

	// IP Address of the interface on which primary SE is running HeartBeat messaging. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HbIPAddress *IPAddr `json:"hb_ip_address,omitempty"`

	// Number of times primary SE did not find HB state for the secondary SE. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HbStateMissing *uint64 `json:"hb_state_missing,omitempty"`

	// vnic on which primary SE is running HeartBeat messaging. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HbVnicName *string `json:"hb_vnic_name,omitempty"`

	// Encapsulation used for IPC messages between primary and secondary SE's. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IpcEncapType *string `json:"ipc_encap_type,omitempty"`

	// Process Id on the primary SE which is reporting SE scaleout status. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	// Type of VS Scaleout - L2 or ECMP. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ScaleoutType *string `json:"scaleout_type,omitempty"`

	// UUID of the SE reporting VS data. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// SE load balancing entries for flow distribution using load-aware flow distribution. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SelbEntries []*SeLbTokens `json:"selb_entries,omitempty"`

	// Version of SE-load binheap used for flow-distribution by RSS cores when RSS is enabled. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SelbVersion *uint32 `json:"selb_version,omitempty"`

	// SE load balancing entries for flow distribution using Consistent Hash. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Selbchentries []*SeLbChEntry `json:"selbchentries,omitempty"`

	// Scaleout SE status entries. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SoSeStatusEntries []*ScaleoutSeStatusInternal `json:"so_se_status_entries,omitempty"`

	// Cumulative number of VS flows that arrived for VS on the primary SE. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalNumVsFlows *uint64 `json:"total_num_vs_flows,omitempty"`

	// Set to 1 if return traffic is tunnelled back from secondary SE to primary SE. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TunnelMode *bool `json:"tunnel_mode,omitempty"`
}

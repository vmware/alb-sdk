// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentVnicDBRuntime se agent vnic d b runtime
// swagger:model SeAgentVnicDBRuntime
type SeAgentVnicDBRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpReplayPending *bool `json:"dp_replay_pending,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InitialSyncWithDataplaneDone *bool `json:"initial_sync_with_dataplane_done,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InitialVnicDiscoveryDone *bool `json:"initial_vnic_discovery_done,omitempty"`

	// Total number of VLAN interfaces on the SE. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVlanIntfs *int32 `json:"num_vlan_intfs,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVnics *int32 `json:"num_vnics,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vnic []*SeAgentVnicRuntime `json:"vnic,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vrf []*SeAgentVrfRuntime `json:"vrf,omitempty"`
}

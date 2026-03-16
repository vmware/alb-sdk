// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServiceEngineInternal service engine internal
// swagger:model ServiceEngineInternal
type ServiceEngineInternal struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AtCurrVer *bool `json:"at_curr_ver,omitempty"`

	// Indicates if at least 1 BGP peer with advertise_vip is UP and at least 1 BGP peer with advertise_snat_ip is UP if there are such peers configured. Flag will be set to false if the condition above is not true for any of the VRFs configured on the SE. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BgpPeersUp *bool `json:"bgp_peers_up,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CloudUUID *string `json:"cloud_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ControllerCreated *bool `json:"controller_created,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ControllerIP *string `json:"controller_ip,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DataVnics []*VNIC `json:"data_vnics,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DefaultGws []*DefaultGateway `json:"default_gws,omitempty"`

	// Event history of this SE. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ev []string `json:"ev,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GatewayUp *bool `json:"gateway_up,omitempty"`

	//  It is a reference to an object of type VIMgrHostRuntime. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HostRef *string `json:"host_ref,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InbandMgmt *bool `json:"inband_mgmt,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MgmtVnic *VNIC `json:"mgmt_vnic,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resources *SeResources `json:"resources,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeGroupUUID *string `json:"se_group_uuid,omitempty"`

	//  Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SufficientMemory *bool `json:"sufficient_memory,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantUUID *string `json:"tenant_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Version *string `json:"version,omitempty"`
}

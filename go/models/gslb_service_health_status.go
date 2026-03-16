// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbServiceHealthStatus gslb service health status
// swagger:model GslbServiceHealthStatus
type GslbServiceHealthStatus struct {

	// UUID of site controller cluster whose view of GS healthstatus is stored. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClusterUUID *string `json:"cluster_uuid,omitempty"`

	// Controlpath health status information of the GS. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CtrlGsInfo []*GslbPoolMemberRuntimeInfo `json:"ctrl_gs_info,omitempty"`

	// Datapath ealth status information of the GS both controlpath and datapath. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpGsInfo []*GslbPoolMemberRuntimeInfo `json:"dp_gs_info,omitempty"`

	// UUID of GslbService for which the healthstatus is stored. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GsUUID *string `json:"gs_uuid,omitempty"`

	// Timestamp when the healthstatus is last updated. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastChangedTime *TimeStamp `json:"last_changed_time,omitempty"`

	// Name of GslbService for which the healthstatus is stored. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Ccontroller cluster node that processes the GS healthstatus.Since GS(es) are sharded on all nodes. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NodeUUID *string `json:"node_uuid,omitempty"`

	// The unique identifier of the tenant to which the gslbservice belongs. It is a reference to an object of type Tenant. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// The uuid of DB entry. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}

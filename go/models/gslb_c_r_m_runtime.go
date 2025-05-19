// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbCRMRuntime gslb c r m runtime
// swagger:model GslbCRMRuntime
type GslbCRMRuntime struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// This field tracks the site_uuid for local/remote site. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ClusterUUID *string `json:"cluster_uuid,omitempty"`

	// Events Captured wrt to config replication. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Events []*EventInfo `json:"events,omitempty"`

	// Federated data store related info. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	FdsInfo *FdsInfo `json:"fds_info,omitempty"`

	// Represents Local Info for the site. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LocalInfo *LocalInfo `json:"local_info,omitempty"`

	// The name of DB entry. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// GSLB CRM Runtime object uuid. Points to the GSLB to which this belongs. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ObjUUID *string `json:"obj_uuid,omitempty"`

	// Respresents Remote Site's info wrt to replication. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	RemoteInfo *RemoteInfo `json:"remote_info,omitempty"`

	// Policy for replicating configuration to the active follower sites. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ReplicationPolicy *ReplicationPolicy `json:"replication_policy,omitempty"`

	// This field tracks the site name. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SiteName *string `json:"site_name,omitempty"`

	// CRM operational status. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	StatusInfo *OperationalStatus `json:"status_info,omitempty"`

	// Uuid of the tenant. It is a reference to an object of type Tenant. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// The uuid of DB entry. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}

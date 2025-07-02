// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbHSMRuntime gslb h s m runtime
// swagger:model GslbHSMRuntime
type GslbHSMRuntime struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// The site controller cluster UUID. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ClusterUUID *string `json:"cluster_uuid,omitempty"`

	// Represents whether HSM is Enabled/disabled. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// Events Captured wrt to config replication. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Events []*EventInfo `json:"events,omitempty"`

	// Represents Local Info for the site. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LocalInfo *LocalInfo `json:"local_info,omitempty"`

	// The name of DB entry. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// GSLB HSM Runtime object uuid. Points to the GSLB to which this belongs. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ObjUUID *string `json:"obj_uuid,omitempty"`

	// Gslb site operational status, represents whether site is UP or DOWN. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	OperStatus *OperationalStatus `json:"oper_status,omitempty"`

	// Remote info is basically updated by GRW. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	RemoteInfo *RemoteInfo `json:"remote_info,omitempty"`

	// Frequency with which group members communicate. This field shadows glb_cfg.send_interval. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SendInterval *uint32 `json:"send_interval,omitempty"`

	// The Gslb site name. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SiteName *string `json:"site_name,omitempty"`

	// Uuid of the tenant. It is a reference to an object of type Tenant. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// The uuid of DB entry. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}

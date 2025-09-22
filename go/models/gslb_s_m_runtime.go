// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbSMRuntime gslb s m runtime
// swagger:model GslbSMRuntime
type GslbSMRuntime struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// The controller cluster leader node UUID. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ClusterLeader *string `json:"cluster_leader,omitempty"`

	// The site controller cluster UUID. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ClusterUUID *string `json:"cluster_uuid,omitempty"`

	// Controller flavor of the peer site controller. Enum options - CONTROLLER_ESSENTIALS, CONTROLLER_SMALL, CONTROLLER_MEDIUM, CONTROLLER_LARGE, CONTROLLER_EXTRA_LARGE. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ControllerFlavor *string `json:"controller_flavor,omitempty"`

	// Sub domain configuration for the GSLB.  GSLB service's FQDN must be a match one of these subdomains. . Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	DNSConfigs []*DNSConfig `json:"dns_configs,omitempty"`

	// DNS info at the site. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	DNSInfo *GslbDNSInfo `json:"dns_info,omitempty"`

	// Activate/de-activate state retrieved from the cfg. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// Captures SM related events. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Events []*EventInfo `json:"events,omitempty"`

	// This field will provide information on origin(site name) of the health monitoring information. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	HealthMonitorInfo *string `json:"health_monitor_info,omitempty"`

	// Mark this Site as leader of GSLB configuration. This site is the one among the Avi sites. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	LeaderClusterUUID *string `json:"leader_cluster_uuid"`

	// The site's member type  A leader is set to ACTIVE while all members are set to passive. . Enum options - GSLB_ACTIVE_MEMBER, GSLB_PASSIVE_MEMBER. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MemberType *string `json:"member_type,omitempty"`

	// The name of DB entry. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// The controller cluster node UUID that processes the site.Sites are sharded across the cluster nodes. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	NodeUUID *string `json:"node_uuid,omitempty"`

	// Number of retry attempts to reach the remote site. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	NumOfRetries *int32 `json:"num_of_retries,omitempty"`

	// GSLB SM Runtime object uuid. Points to the GSLB to which this belongs. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ObjUUID *string `json:"obj_uuid,omitempty"`

	// Gslb site operational status, represents whether site is UP or DOWN. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	OperStatus *OperationalStatus `json:"oper_status,omitempty"`

	// Remote info is basically updated by GRW. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	RemoteInfo *RemoteInfo `json:"remote_info,omitempty"`

	// Site Role  Leader or Follower. Enum options - GSLB_LEADER, GSLB_MEMBER, GSLB_NOT_A_MEMBER. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Role *string `json:"role,omitempty"`

	// The Gslb site name. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SiteName *string `json:"site_name,omitempty"`

	// Indicates if it is Avi Site or third-party. Enum options - GSLB_AVI_SITE, GSLB_THIRD_PARTY_SITE. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SiteType *string `json:"site_type,omitempty"`

	// Represents the state of the site. Enum options - SITE_STATE_NULL, SITE_STATE_JOIN_IN_PROGRESS, SITE_STATE_LEAVE_IN_PROGRESS, SITE_STATE_INIT, SITE_STATE_UNREACHABLE, SITE_STATE_MMODE, SITE_STATE_DISABLE_IN_PROGRESS, SITE_STATE_DISABLED, SITE_STATE_HS_IN_PROGRESS. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`

	// Current Software version of the site. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SwVersion *string `json:"sw_version,omitempty"`

	// Uuid of the tenant. It is a reference to an object of type Tenant. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// The uuid of DB entry. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// The view-id is used in change-leader mode to differentiate partitioned groups while they have the same GSLB namespace. Each partitioned group will be able to operate independently by using the view-id. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ViewID *uint64 `json:"view_id,omitempty"`
}

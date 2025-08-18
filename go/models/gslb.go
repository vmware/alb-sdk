// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Gslb gslb
// swagger:model Gslb
type Gslb struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Frequency with which messages are propagated to Vs Mgr. Value of 0 disables async behavior and RPC are sent inline. Allowed values are 0-5. Field introduced in 18.2.3. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AsyncInterval *uint32 `json:"async_interval,omitempty"`

	// Automatically set the send interval value based on the load. Field introduced in 30.2.5, 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AutoTuneSendInterval *AutoTuneSendInterval `json:"auto_tune_send_interval,omitempty"`

	// Max retries after which the remote site is treated as a fresh start. In fresh start all the configs are downloaded. Allowed values are 1-1024. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClearOnMaxRetries *uint32 `json:"clear_on_max_retries,omitempty"`

	// Group to specify if the client ip addresses are public or private. Field introduced in 17.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientIPAddrGroup *GslbClientIPAddrGroup `json:"client_ip_addr_group,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Sub domain configuration for the GSLB.  GSLB service's FQDN must be a match one of these subdomains. . Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSConfigs []*DNSConfig `json:"dns_configs,omitempty"`

	// Allows enable/disable of GslbService pool groups and pool members from the gslb follower members. Field introduced in 20.1.5. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EnableConfigByMembers *bool `json:"enable_config_by_members,omitempty"`

	// Frequency with which errored messages are resynced to follower sites. Value of 0 disables resync behavior. Allowed values are 60-3600. Special values are 0 - Disable. Field introduced in 18.2.3. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErrorResyncInterval *uint32 `json:"error_resync_interval,omitempty"`

	// This is the max number of file versions that will be retained for a file referenced by the federated FileObject. Subsequent uploads of file will result in the file rotation of the older version and the latest version retained. Example  When a file Upload is done for the first time, there will be a v1 version. Subsequent uploads will get mapped to v1, v2 and v3 versions. On the fourth upload of the file, the v1 will be file rotated and v2, v3 and v4 will be retained. Allowed values are 1-5. Field introduced in 30.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	FileobjectMaxFileVersions *uint32 `json:"fileobject_max_file_versions,omitempty"`

	// If this knob is enabled, GSLB Service member FQDN will be resolved by the service engines hosting the GSLB service. Each service engine will resolve and consume the resolved IP addresses locally. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	GsMemberFqdnResolutionOnSe *bool `json:"gs_member_fqdn_resolution_on_se,omitempty"`

	// This field indicates that this object is replicated across GSLB federation. Field introduced in 17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsFederated *bool `json:"is_federated,omitempty"`

	// This field has leader change configuration info including mode, leader designate sites and other configurations for auto leader change like max short probe failures. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LeaderChangeInfo *LeaderChangeInfo `json:"leader_change_info,omitempty"`

	// Mark this Site as leader of GSLB configuration. This site is the one among the Avi sites. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	LeaderClusterUUID *string `json:"leader_cluster_uuid"`

	// This field disables the configuration operations on the leader for all federated objects.  CUD operations on Gslb, GslbService, GslbGeoDbProfile and other federated objects will be rejected. The rest-api disabling helps in upgrade scenarios where we don't want configuration sync operations to the Gslb member when the member is being upgraded.  This configuration programmatically blocks the leader from accepting new Gslb configuration when member sites are undergoing upgrade. . Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaintenanceMode *bool `json:"maintenance_mode,omitempty"`

	// Name for the GSLB object. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// Policy for replicating configuration to the active follower sites. Field deprecated in 31.2.1. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReplicationPolicy *ReplicationPolicy `json:"replication_policy,omitempty"`

	// Frequency with which group members communicate. Allowed values are 1-3600. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SendInterval *uint32 `json:"send_interval,omitempty"`

	// The user can specify a send-interval while entering maintenance mode. The validity of this 'maintenance send-interval' is only during maintenance mode. When the user leaves maintenance mode, the original send-interval is reinstated. This internal variable is used to store the original send-interval. . Field introduced in 18.2.3. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SendIntervalPriorToMaintenanceMode *uint32 `json:"send_interval_prior_to_maintenance_mode,omitempty"`

	// Wait time between two consecutive short probe health checks. Allowed values are 1-3600. Field introduced in 31.1.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ShortProbeInterval *uint32 `json:"short_probe_interval,omitempty"`

	// Select Avi site member belonging to this Gslb. Minimum of 1 items required. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Sites []*GslbSite `json:"sites,omitempty"`

	//  It is a reference to an object of type Tenant. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// This field indicates tenant visibility for GS pool member selection across the Gslb federated objects.Tenant scope can be set only during the Gslb create and cannot be changed once it is set. Field introduced in 18.2.12,20.1.4. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TenantScoped *bool `json:"tenant_scoped,omitempty"`

	// Third party site member belonging to this Gslb. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ThirdPartySites []*GslbThirdPartySite `json:"third_party_sites,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID of the GSLB object. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// The view-id is used in change-leader mode to differentiate partitioned groups while they have the same GSLB namespace. Each partitioned group will be able to operate independently by using the view-id. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViewID *uint64 `json:"view_id,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Server server
// swagger:model Server
type Server struct {

	// Name of autoscaling group this server belongs to. Field introduced in 17.1.2. Allowed with any value in Enterprise, Basic, Enterprise with Cloud Services edition.
	AutoscalingGroupName *string `json:"autoscaling_group_name,omitempty"`

	// Availability-zone of the server VM. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvailabilityZone *string `json:"availability_zone,omitempty"`

	// A description of the Server. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// (internal-use) Discovered networks providing reachability for server IP. This field is used internally by Avi, not editable by the user. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DiscoveredNetworks []*DiscoveredNetwork `json:"discovered_networks,omitempty"`

	// Enable, Disable or Graceful Disable determine if new or existing connections to the server are allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// UID of server in external orchestration systems. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ExternalOrchestrationID *string `json:"external_orchestration_id,omitempty"`

	// UUID identifying VM in OpenStack and other external compute. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ExternalUUID *string `json:"external_uuid,omitempty"`

	// Verify server health by applying one or more health monitors.  Active monitors generate synthetic traffic from each Service Engine and mark a server up or down based on the response. . It is a reference to an object of type HealthMonitor. Field introduced in 31.1.1. Maximum of 10 items allowed. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	HealthMonitorRefs []string `json:"health_monitor_refs,omitempty"`

	// DNS resolvable name of the server.  May be used in place of the IP address. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hostname *string `json:"hostname,omitempty"`

	// IP Address of the server.  Required if there is no resolvable host name. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP *IPAddr `json:"ip"`

	// (internal-use) Geographic location of the server.Currently only for internal usage. Field introduced in 17.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Location *GeoLocation `json:"location,omitempty"`

	// MAC address of server. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MacAddress *string `json:"mac_address,omitempty"`

	// (internal-use) This field is used internally by Avi, not editable by the user. It is a reference to an object of type VIMgrNWRuntime. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NwRef *string `json:"nw_ref,omitempty"`

	// Optionally specify the servers port number.  This will override the pool's default server port attribute. Allowed values are 1-65535. Special values are 0- use backend port in pool. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Port *int32 `json:"port,omitempty"`

	// Preference order of this member in the group. The DNS Service chooses the member with the lowest preference that is operationally up. Allowed values are 1-128. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PreferenceOrder *uint32 `json:"preference_order,omitempty"`

	// Header value for custom header persistence. . Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	PrstHdrVal *string `json:"prst_hdr_val,omitempty"`

	// Ratio of selecting eligible servers in the pool. Allowed values are 1-20. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ratio *int32 `json:"ratio,omitempty"`

	// Auto resolve server's IP using DNS name. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- false), Basic (Allowed values- false) edition.
	ResolveServerByDNS *bool `json:"resolve_server_by_dns,omitempty"`

	// Rewrite incoming Host Header to server name. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RewriteHostHeader *bool `json:"rewrite_host_header,omitempty"`

	// Hostname of the node where the server VM or container resides. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerNode *string `json:"server_node,omitempty"`

	// SRV record parameters for GSLB Service member. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SrvRdata *GslbServiceSrvRdata `json:"srv_rdata,omitempty"`

	// If statically learned. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Static *bool `json:"static,omitempty"`

	// Verify server belongs to a discovered network or reachable via a discovered network. Verify reachable network isn't the OpenStack management network. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VerifyNetwork *bool `json:"verify_network,omitempty"`

	// (internal-use) This field is used internally by Avi, not editable by the user. It is a reference to an object of type VIMgrVMRuntime. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VMRef *string `json:"vm_ref,omitempty"`
}

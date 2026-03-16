// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeResourceProto se resource proto
// swagger:model SeResourceProto
type SeResourceProto struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	//  Enum options - ACTIVE_STANDBY_SE_1, ACTIVE_STANDBY_SE_2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActiveTags []string `json:"active_tags,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AtCurrVer *bool `json:"at_curr_ver,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Az *string `json:"az,omitempty"`

	// Azure cloud info for this SE instance. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AzureInfo *AzureInfo `json:"azure_info,omitempty"`

	// Indicates if at least 1 BGP peer with advertise_vip is UP and at least 1 BGP peer with advertise_snat_ip is UP if there are such peers configured. Flag will be set to false if the condition above is not true for any of the VRFs configured on the SE. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BgpPeersUp *bool `json:"bgp_peers_up,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BootupConsumers []string `json:"bootup_consumers,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BootupFailed *bool `json:"bootup_failed,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CameOnlineAt *uint64 `json:"came_online_at,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ContainerMode *bool `json:"container_mode,omitempty"`

	//  Enum options - CONTAINER_TYPE_BRIDGE, CONTAINER_TYPE_HOST, CONTAINER_TYPE_HOST_DPDK. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ContainerType *string `json:"container_type,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ControllerCreated *bool `json:"controller_created,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CreateCookie *string `json:"create_cookie,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CreatedAt *uint64 `json:"created_at,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DelPending *bool `json:"del_pending,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DelStartTicks *int32 `json:"del_start_ticks,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Disconnected *bool `json:"disconnected,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	DiskGb *uint32 `json:"disk_gb"`

	// SE went down during warmstart. Field introduced in 18.2.8. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DownDuringWarmstart *bool `json:"down_during_warmstart,omitempty"`

	//  Enum options - SE_STATE_ENABLED, SE_STATE_DISABLED_FOR_PLACEMENT, SE_STATE_DISABLED, SE_STATE_DISABLED_FORCE, SE_STATE_DISABLED_WITH_SCALEIN, SE_STATE_DISABLED_NO_TRAFFIC, SE_STATE_DISABLED_FORCE_WITH_MIGRATE. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnableState *string `json:"enable_state,omitempty"`

	// List of consumers attempting failover to this SE. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FailoverConsumerUuids []string `json:"failover_consumer_uuids,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Flavor *string `json:"flavor,omitempty"`

	// Indicates if SE is able to connect to gateway. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GatewayUp *bool `json:"gateway_up,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HostUUID *string `json:"host_uuid,omitempty"`

	//  Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hypervisor *string `json:"hypervisor,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InUse *bool `json:"in_use,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPMacAddr []string `json:"ip_mac_addr,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPMasks []int64 `json:"ip_masks,omitempty,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ips []*IPAddr `json:"ips,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastRebootTicks *uint64 `json:"last_reboot_ticks,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaskedIps []*IPAddr `json:"masked_ips,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxIpsPerVnic *uint32 `json:"max_ips_per_vnic,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxVnics *uint32 `json:"max_vnics,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Memory *int32 `json:"memory"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MemoryFree *int32 `json:"memory_free"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MemoryInuse *int32 `json:"memory_inuse"`

	// Management IPv4 address of SE. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MgmtIP *IPAddr `json:"mgmt_ip,omitempty"`

	// Management IPv6 address of SE. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MgmtIp6 *IPAddr `json:"mgmt_ip6,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MgmtNetUUID *string `json:"mgmt_net_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Ticks after which the next SE vnic garbage collection operation can be executed. Field introduced in 17.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NextVnicGcTicks *uint64 `json:"next_vnic_gc_ticks,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NextVnicOpTicks *uint64 `json:"next_vnic_op_ticks,omitempty"`

	// If set to true for NSXT cloud, controller should not hotplug the vNICs. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NsxtNoHotplug *bool `json:"nsxt_no_hotplug,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Online *bool `json:"online,omitempty"`

	//  Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PendingConsumers []*PendingConsumer `json:"pending_consumers,omitempty"`

	// Cookie of the ping request to the SE. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PingCookie *string `json:"ping_cookie,omitempty"`

	// Reason code for why SE is not a placement candidate for any VSs. Enum options - PLACEMENT_INELIGIBLE_UPGRADE_IN_PROGRESS, PLACEMENT_INELIGIBLE_SE_GRP_UPGRADE_IN_PROGRESS, PLACEMENT_INELIGIBLE_CLOUD_NOT_READY, PLACEMENT_INELIGIBLE_CLOUD_API_NOT_READY, PLACEMENT_INELIGIBLE_VS_ELIGIBLE, PLACEMENT_INELIGIBLE_MULTIPLE_SE_CRASHES, PLACEMENT_INELIGIBLE_SPAWN_FAIL_MAX_LIMIT, PLACEMENT_INELIGIBLE_SPAWN_FAIL_UNRECOVERABLE, PLACEMENT_INELIGIBLE_BOOTUP_FAIL, PLACEMENT_INELIGIBLE_VNIC_FAIL, PLACEMENT_INELIGIBLE_VNIC_FAIL_MAX_LIMIT, PLACEMENT_INELIGIBLE_VNIC_IP_FAIL, PLACEMENT_INELIGIBLE_ATTACH_IP_FAIL_MAX_LIMIT, PLACEMENT_INELIGIBLE_ATTACH_IP_FAIL_UNRECOVERABLE, PLACEMENT_INELIGIBLE_VIP_MULTIPLE_NETWORKS, PLACEMENT_INELIGIBLE_SRVR_MULTIPLE_NETWORKS, PLACEMENT_INELIGIBLE_NO_VIP_NETWORK, PLACEMENT_INELIGIBLE_NO_SRVR_NETWORK, PLACEMENT_INELIGIBLE_VIP_NETWORK_DOES_NOT_EXIST, PLACEMENT_INELIGIBLE_SRVR_NETWORK_DOES_NOT_EXIST.... Field introduced in 20.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PlacementIneligibleReason *string `json:"placement_ineligible_reason,omitempty"`

	// Reason *string for why SE is not a placement candidate for any VSs. Field introduced in 20.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PlacementIneligibleReasonStr *string `json:"placement_ineligible_reason_str,omitempty"`

	// Timestamp at which this SE was determined to be ineligible. Field introduced in 20.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PlacementIneligibleTimestamp *TimeStamp `json:"placement_ineligible_timestamp,omitempty"`

	//  Enum options - SE_DEREG_HB_FAILURE, SE_DEREG_POWERED_OFF, SE_DEREG_SUSPENDED, SE_DEREG_FATAL_ERROR, SE_DEREG_UNREACHABLE, SE_DEREG_VM_DELETED, SE_DEREG_REBOOTED, SE_DEREG_PURGE, SE_DEREG_HEALTH_CHECK, SE_DEREG_VINFRA_POWERED_OFF, SE_DEREG_UPGRADING, SE_DEREG_DP_HB_FAIL, SE_DEREG_DISABLED_FORCE, SE_DEREG_SWITCHOVER_FORCE, SE_DEREG_NEWLY_DISCOVERED, SE_DEREG_SE_GRP_CHANGE, SE_DEREG_UPGRADING_UNREACHABLE, SE_DEREG_VSPHERE_HA_HOST_FAILURE. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReasonCode *string `json:"reason_code,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RebootAttempts *int32 `json:"reboot_attempts,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResourcesConsumed []*SeResourceConsumedProto `json:"resources_consumed,omitempty"`

	//  It is a reference to an object of type ServiceEngineGroup. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeGroupRef *string `json:"se_group_ref,omitempty"`

	// Indicates SE reboot following SE group change is pending. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeGrpRebootPending *bool `json:"se_grp_reboot_pending,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StaticIP *IPAddr `json:"static_ip,omitempty"`

	// Indicates if SE has sufficient memory. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SufficientMemory *bool `json:"sufficient_memory,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UnusedSince *uint64 `json:"unused_since,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Upgrading *bool `json:"upgrading,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	//  It is a reference to an object of type ServiceEngine. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Vcpus *int32 `json:"vcpus"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VcpusFree *int32 `json:"vcpus_free"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VcpusInuse *int32 `json:"vcpus_inuse"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Version *string `json:"version,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VinfraDiscovered *bool `json:"vinfra_discovered,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VnicOp *SeVnicOpProto `json:"vnic_op,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VnicOpConsumers []string `json:"vnic_op_consumers,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vnics []*SeResourceVnic `json:"vnics,omitempty"`

	// If vSphere HA is enabled, this flag is set while CC is checking for ESX host failure (before the timeout of 120 secs), or when ESX host failure has been detected. When this flag is set, new VSs will not be placed on this SE, but no corrective actions (make before break, removing VSs, reboot) will occur in Resource Manager even while the SE is disconnected or down. Field introduced in 20.1.7, 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsphereHaActive *bool `json:"vsphere_ha_active,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WarmStarting *bool `json:"warm_starting,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WentHeadlessAt *uint64 `json:"went_headless_at,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WentOfflineAt *uint64 `json:"went_offline_at,omitempty"`
}

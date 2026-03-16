// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceSe virtual service se
// swagger:model VirtualServiceSe
type VirtualServiceSe struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClusterUUID *string `json:"cluster_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ControllerIP *string `json:"controller_ip,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DatapathDebug *DebugVirtualService `json:"datapath_debug,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FirstSeAssignedTime *TimeStamp `json:"first_se_assigned_time,omitempty"`

	// This field is not used in 21.1.3 and above. Deprecated_in=21.1.3is not added to support the use case of controller in 21.1.3 and Segroupsin pre-21.1.3 version. Field introduced in 18.1.5, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GslbDNSUpdate *GslbDNSUpdate `json:"gslb_dns_update,omitempty"`

	// List of IPAM DNS records applied to this Virtual Service. These are static entries and no health monitoring is performed against the IP addresses. Maximum of 1000 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPAMDNSRecords []*DNSRecord `json:"ipam_dns_records,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MarkedForDelete *bool `json:"marked_for_delete,omitempty"`

	//  Enum options - METRICS_MGR_PORT_0, METRICS_MGR_PORT_1, METRICS_MGR_PORT_2, METRICS_MGR_PORT_3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetricsMgrPort *string `json:"metrics_mgr_port,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PrevControllerIP *string `json:"prev_controller_ip,omitempty"`

	//  Enum options - METRICS_MGR_PORT_0, METRICS_MGR_PORT_1, METRICS_MGR_PORT_2, METRICS_MGR_PORT_3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PrevMetricsMgrPort *string `json:"prev_metrics_mgr_port,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RedisDb *int32 `json:"redis_db,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RedisPort *int32 `json:"redis_port,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeList []*SeList `json:"se_list,omitempty"`

	// Runtime info from security_manager. Field introduced in 18.2.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SecMgrInfo *SecurityMgrRuntime `json:"sec_mgr_info,omitempty"`

	// Enable SEs to elect a primary amongst themselves in the absence of a connectivity to controller. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SelfSeElection *bool `json:"self_se_election,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TLSTicketKey []*TLSTicket `json:"tls_ticket_key,omitempty"`

	// Total number of Child VS referring this Parent VS. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalChildVs *uint32 `json:"total_child_vs,omitempty"`

	// Total number of GSLBservices bound to a DNS VS. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalGsCount *uint32 `json:"total_gs_count,omitempty"`

	// total number of SEs on which this VS is placed. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalSes *uint32 `json:"total_ses,omitempty"`

	// total number of vcpus across active SEs on which this VS is placed. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalVcpus *uint32 `json:"total_vcpus,omitempty"`

	// total number of VIPs associated with VS. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalVips *uint32 `json:"total_vips,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// Version number of the SE List update. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Version *uint64 `json:"version,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VirtualService *VirtualService `json:"virtual_service,omitempty"`

	// List of SEs and their Mgmt IP for each Vip of this VS. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsVipSeInfoList []*VsVipSeInfo `json:"vs_vip_se_info_list,omitempty"`
}

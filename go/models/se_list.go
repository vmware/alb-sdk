// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeList se list
// swagger:model SeList
type SeList struct {

	// Vip is Active on Cloud. Field introduced in 21.1.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	ActiveOnCloud *bool `json:"active_on_cloud,omitempty"`

	// Vip is Active on this ServiceEngine. Field introduced in 21.1.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	ActiveOnSe *bool `json:"active_on_se,omitempty"`

	// This flag is set when scaling in an SE in admin down mode. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AdminDownRequested *bool `json:"admin_down_requested,omitempty"`

	// Indicates if an SE is at the current version. This state will now be derived from SE Group runtime. Field deprecated in 18.1.5, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AtCurrVer *bool `json:"at_curr_ver,omitempty"`

	// Attach IP is in progress. Field introduced in 21.1.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	AttachIPInProgress *bool `json:"attach_ip_in_progress,omitempty"`

	// This field indicates the status of programming network reachability to the Virtual Service IP in the cloud. Field deprecated in 21.1.3. Field introduced in 17.2.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AttachIPStatus *string `json:"attach_ip_status,omitempty"`

	// This flag indicates if network reachability to the Virtual Service IP in the cloud has been successfully programmed. Field deprecated in 21.1.3. Field introduced in 17.2.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AttachIPSuccess *bool `json:"attach_ip_success,omitempty"`

	// All attempts to program the Vip on Cloud have been made. Field introduced in 21.1.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	CloudProgrammingDone *bool `json:"cloud_programming_done,omitempty"`

	// Status of Vip on the Cloud. Field introduced in 21.1.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	CloudProgrammingStatus *string `json:"cloud_programming_status,omitempty"`

	// This flag is set when an SE is admin down or scaling in. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DeleteInProgress *bool `json:"delete_in_progress,omitempty"`

	// Detach IP is in progress. Field introduced in 21.1.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	DetachIPInProgress *bool `json:"detach_ip_in_progress,omitempty"`

	// This field is not needed with the current implementation of Update RPCs to SEs. Field deprecated in 18.1.5, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DownloadSelistOnly *bool `json:"download_selist_only,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	FloatingIntfIP []*IPAddr `json:"floating_intf_ip,omitempty"`

	// This flag indicates whether the geo-files have been pushed to the DNS-VS's SE. No longer used, replaced by SE DataStore. Field deprecated in 18.1.5, 18.2.1. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	GeoDownload *bool `json:"geo_download,omitempty"`

	// This flag indicates whether the geodb object has been pushed to the DNS-VS's SE. No longer used, replaced by SE DataStore. Field deprecated in 18.1.5, 18.2.1. Field introduced in 17.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	GeodbDownload *bool `json:"geodb_download,omitempty"`

	// This flag indicates whether the gslb, ghm, gs objects have been pushed to the DNS-VS's SE. No longer used, replaced by SE DataStore. Field deprecated in 18.1.5, 18.2.1. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	GslbDownload *bool `json:"gslb_download,omitempty"`

	// Updated whenever this entry is created. When the sees this has changed, it means that the SE should disrupt, since there was a delete then create, not an update. Field introduced in 18.1.5,18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Incarnation *string `json:"incarnation,omitempty"`

	// This flag was used to display the SE connected state. This state will now be derived from SE Group runtime. Field deprecated in 18.1.5, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	IsConnected *bool `json:"is_connected,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	IsPortchannel *bool `json:"is_portchannel,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	IsPrimary *bool `json:"is_primary,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	IsStandby *bool `json:"is_standby,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Memory *int32 `json:"memory,omitempty"`

	// Management IPv4 address of SE. Field introduced in 20.1.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	MgmtIP *IPAddr `json:"mgmt_ip,omitempty"`

	// Management IPv6 address of SE. Field introduced in 20.1.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	MgmtIp6 *IPAddr `json:"mgmt_ip6,omitempty"`

	// This field is not needed with the current implementation of Update RPCs to SEs. Field deprecated in 18.1.5, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	PendingDownload *bool `json:"pending_download,omitempty"`

	// SE scaling in status is determined by delete_in_progress. Field deprecated in 18.1.5, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ScaleinInProgress *bool `json:"scalein_in_progress,omitempty"`

	// This flag is set when a VS is actively scaling out to this SE. Field introduced in 18.1.5, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ScaleoutInProgress *bool `json:"scaleout_in_progress,omitempty"`

	// All attempts to program the Vip on this ServiceEngine have been made. Field introduced in 21.1.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	SeProgrammingDone *bool `json:"se_programming_done,omitempty"`

	// Vip is awaiting response from this ServiceEngine. Field introduced in 21.1.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	SeReadyInProgress *bool `json:"se_ready_in_progress,omitempty"`

	//  It is a reference to an object of type ServiceEngine. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	SeRef *string `json:"se_ref"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SecIdx *int32 `json:"sec_idx,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SnatIP *IPAddr `json:"snat_ip,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Vcpus *int32 `json:"vcpus,omitempty"`

	// Version of the SE. This state will now be derived from SE Group runtime. Field deprecated in 18.1.5, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Version *string `json:"version,omitempty"`

	//  Field introduced in 18.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Vip6SubnetMask *int32 `json:"vip6_subnet_mask,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	VipIntfIP *IPAddr `json:"vip_intf_ip,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	VipIntfList []*SeVipInterfaceList `json:"vip_intf_list,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	VipIntfMac *string `json:"vip_intf_mac,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	VipSubnetMask *int32 `json:"vip_subnet_mask,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	VlanID *int32 `json:"vlan_id,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Vnic []*VsSeVnic `json:"vnic,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VIMgrVcenterRuntime v i mgr vcenter runtime
// swagger:model VIMgrVcenterRuntime
type VIMgrVcenterRuntime struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	APIVersion *string `json:"api_version,omitempty"`

	//  Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ApicMode *bool `json:"apic_mode,omitempty"`

	//  It is a reference to an object of type Cloud. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	CloudRef *string `json:"cloud_ref,omitempty"`

	//  It is a reference to an object of type VIMgrDCRuntime. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DatacenterRefs []string `json:"datacenter_refs,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DiscEndTime *string `json:"disc_end_time,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DiscStartTime *string `json:"disc_start_time,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DiscoveredDatacenter *string `json:"discovered_datacenter,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	InventoryProgress *string `json:"inventory_progress,omitempty"`

	//  Enum options - VCENTER_DISCOVERY_BAD_CREDENTIALS, VCENTER_DISCOVERY_RETRIEVING_DC, VCENTER_DISCOVERY_WAITING_DC, VCENTER_DISCOVERY_RETRIEVING_NW, VCENTER_DISCOVERY_ONGOING, VCENTER_DISCOVERY_RESYNCING, VCENTER_DISCOVERY_COMPLETE, VCENTER_DISCOVERY_DELETING_VCENTER, VCENTER_DISCOVERY_FAILURE, VCENTER_DISCOVERY_COMPLETE_NO_MGMT_NW, VCENTER_DISCOVERY_COMPLETE_PER_TENANT_IP_ROUTE, VCENTER_DISCOVERY_MAKING_SE_OVA, VCENTER_DISCOVERY_RESYNC_FAILED, VCENTER_DISCOVERY_OBJECT_LIMIT_REACHED. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	InventoryState *string `json:"inventory_state,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ManagementNetwork *string `json:"management_network,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NumClusters *int64 `json:"num_clusters,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NumDcs *int64 `json:"num_dcs,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NumHosts *int64 `json:"num_hosts,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NumNws *int64 `json:"num_nws,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NumVcenterReqPending *int64 `json:"num_vcenter_req_pending,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NumVms *int64 `json:"num_vms,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Password *string `json:"password"`

	//  Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Privilege *string `json:"privilege,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Progress *int64 `json:"progress,omitempty"`

	//  It is a reference to an object of type Tenant. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	//  Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP, CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Type *string `json:"type"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Username *string `json:"username"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	VcenterConnected *bool `json:"vcenter_connected,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	VcenterFullname *string `json:"vcenter_fullname,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	VcenterTemplateSeLocation *string `json:"vcenter_template_se_location,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	VcenterURL *string `json:"vcenter_url"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServiceEngine service engine
// swagger:model ServiceEngine
type ServiceEngine struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvailabilityZone *string `json:"availability_zone,omitempty"`

	//  It is a reference to an object of type Cloud. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CloudRef *string `json:"cloud_ref,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ContainerMode *bool `json:"container_mode,omitempty"`

	//  Enum options - CONTAINER_TYPE_BRIDGE, CONTAINER_TYPE_HOST, CONTAINER_TYPE_HOST_DPDK. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ContainerType *string `json:"container_type,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ControllerCreated *bool `json:"controller_created,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ControllerIP *string `json:"controller_ip,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DataVnics []*VNIC `json:"data_vnics,omitempty"`

	// inorder to disable SE set this field appropriately. Enum options - SE_STATE_ENABLED, SE_STATE_DISABLED_FOR_PLACEMENT, SE_STATE_DISABLED, SE_STATE_DISABLED_FORCE, SE_STATE_DISABLED_WITH_SCALEIN, SE_STATE_DISABLED_NO_TRAFFIC, SE_STATE_DISABLED_FORCE_WITH_MIGRATE. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnableState *string `json:"enable_state,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Flavor *string `json:"flavor,omitempty"`

	//  It is a reference to an object of type VIMgrHostRuntime. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HostRef *string `json:"host_ref,omitempty"`

	//  Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hypervisor *string `json:"hypervisor,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MgmtVnic *VNIC `json:"mgmt_vnic,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// If set to true, controller does not hotplugg the vNICs. Field introduced in 30.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	NsxtNoHotplug *bool `json:"nsxt_no_hotplug,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resources *SeResources `json:"resources,omitempty"`

	//  It is a reference to an object of type ServiceEngineGroup. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeGroupRef *string `json:"se_group_ref,omitempty"`

	//  It is a reference to an object of type Tenant. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}

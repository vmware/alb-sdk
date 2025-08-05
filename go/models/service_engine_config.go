// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServiceEngineConfig service engine config
// swagger:model ServiceEngineConfig
type ServiceEngineConfig struct {

	//  It is a reference to an object of type Cloud. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CloudRef *string `json:"cloud_ref,omitempty"`

	// inorder to disable SE set this field appropriately. Enum options - SE_STATE_ENABLED, SE_STATE_DISABLED_FOR_PLACEMENT, SE_STATE_DISABLED, SE_STATE_DISABLED_FORCE, SE_STATE_DISABLED_WITH_SCALEIN, SE_STATE_DISABLED_NO_TRAFFIC, SE_STATE_DISABLED_FORCE_WITH_MIGRATE. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnableState *string `json:"enable_state,omitempty"`

	//  It is a reference to an object of type VIMgrHostRuntime. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HostRef *string `json:"host_ref,omitempty"`

	// Management IPv6 Address of the service engine. Field introduced in 22.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MgmtIp6Address *IPAddr `json:"mgmt_ip6_address,omitempty"`

	// Management IP Address of the service engine. Field introduced in 22.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MgmtIPAddress *IPAddr `json:"mgmt_ip_address,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	//  It is a reference to an object of type ServiceEngineGroup. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeGroupRef *string `json:"se_group_ref,omitempty"`

	//  It is a reference to an object of type Tenant. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// URL of the Service Engine. Field introduced in 22.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	URL *string `json:"url,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	//  Field introduced in 22.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	VirtualserviceRefs []string `json:"virtualservice_refs,omitempty"`

	//  Field introduced in 22.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	VsPerSeRefs []string `json:"vs_per_se_refs,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MemoryBalancerRequest memory balancer request
// swagger:model MemoryBalancerRequest
type MemoryBalancerRequest struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.1.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Current details regarding controller. Field introduced in 21.1.1.
	ControllerInfo *ControllerInfo `json:"controller_info,omitempty"`

	// Name of controller process. Field introduced in 21.1.1.
	// Required: true
	Name *string `json:"name"`

	// UUID of Node. Field introduced in 21.1.1.
	NodeUUID *string `json:"node_uuid,omitempty"`

	// Current process information of the controller process. Field introduced in 21.1.1.
	ProcessInfo *ProcessInfo `json:"process_info,omitempty"`

	// Instance of the controller process. Field introduced in 21.1.1.
	ProcessInstance *string `json:"process_instance,omitempty"`

	// UUID of Tenant Object. It is a reference to an object of type Tenant. Field introduced in 21.1.1.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// Time at which Memory Balancer Request was created/updated. Field introduced in 21.1.1.
	Timestamp *string `json:"timestamp,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID of Memory Balancer Request object. Field introduced in 21.1.1.
	UUID *string `json:"uuid,omitempty"`
}

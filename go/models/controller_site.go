// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ControllerSite controller site
// swagger:model ControllerSite
type ControllerSite struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// IP Address or a DNS resolvable, fully qualified domain name of the Site Controller Cluster. Field introduced in 18.2.5.
	// Required: true
	Address *string `json:"address"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.1.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Name for the Site Controller Cluster. Field introduced in 18.2.5.
	// Required: true
	Name *string `json:"name"`

	// The Controller Site Cluster's REST API port number. Allowed values are 1-65535. Field introduced in 18.2.5.
	Port *int32 `json:"port,omitempty"`

	// Reference for the Tenant. It is a reference to an object of type Tenant. Field introduced in 18.2.5.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// Reference for the Site Controller Cluster. Field introduced in 18.2.5.
	UUID *string `json:"uuid,omitempty"`
}

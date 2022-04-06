// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ErrorPageProfile error page profile
// swagger:model ErrorPageProfile
type ErrorPageProfile struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Name of the Virtual Service which generated the error page. Field deprecated in 18.1.1. Field introduced in 17.2.4. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AppName *string `json:"app_name,omitempty"`

	// Name of the company to show in error page. Field deprecated in 18.1.1. Field introduced in 17.2.4. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	CompanyName *string `json:"company_name,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Essentials with any value edition, Basic with any value edition, Enterprise with Cloud Services edition.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Defined Error Pages for HTTP status codes. Field introduced in 17.2.4. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ErrorPages []*ErrorPage `json:"error_pages,omitempty"`

	// Fully qualified domain name for which the error page is generated. Field deprecated in 18.1.1. Field introduced in 17.2.4. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	HostName *string `json:"host_name,omitempty"`

	// Key value pairs for granular object access control. Also allows for classification and tagging of similar objects. Field deprecated in 20.1.5. Field introduced in 20.1.3. Maximum of 4 items allowed. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	Labels []*KeyValue `json:"labels,omitempty"`

	// List of labels to be used for granular RBAC. Field introduced in 20.1.5. Allowed in Enterprise with any value edition, Essentials with any value edition, Basic with any value edition, Enterprise with Cloud Services edition.
	Markers []*RoleFilterMatchLabel `json:"markers,omitempty"`

	//  Field introduced in 17.2.4. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	//  It is a reference to an object of type Tenant. Field introduced in 17.2.4. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	//  Field introduced in 17.2.4. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}

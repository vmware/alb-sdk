// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Tenant tenant
// swagger:model Tenant
type Tenant struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ConfigSettings *TenantConfiguration `json:"config_settings,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Essentials with any value edition, Basic with any value edition, Enterprise with Cloud Services edition.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Creator of this tenant. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	CreatedBy *string `json:"created_by,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// The referred label groups are enforced on the tenant if this is set to true.If this is set to false, the label groups are suggested for the tenant. Field introduced in 20.1.5. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	EnforceLabelGroup *bool `json:"enforce_label_group,omitempty"`

	// The label_groups to be enforced on the tenant. This is strictly enforced only if enforce_label_group is set to True. It is a reference to an object of type LabelGroup. Field introduced in 20.1.5. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	LabelGroupRefs []string `json:"label_group_refs,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Local *bool `json:"local,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// Suggestive pool of key value pairs for recommending assignment of labels to objects in the User Interface. Every entry is unique in both key and value. Field deprecated in 20.1.5. Field introduced in 20.1.2. Maximum of 256 items allowed. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	SuggestedObjectLabels []*TenantLabel `json:"suggested_object_labels,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}

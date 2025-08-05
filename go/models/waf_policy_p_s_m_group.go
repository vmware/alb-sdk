// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WafPolicyPSMGroup waf policy p s m group
// swagger:model WafPolicyPSMGroup
type WafPolicyPSMGroup struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// A list of all match element collections which are completely described in the PSM Group. Every input value which matches one of the elements in this list but is not handled by a WAF PSM rule, will run the match_element miss_action. Allowed values are WAF_VARIABLE_ARGS. Enum options - WAF_VARIABLE_ARGS, WAF_VARIABLE_ARGS_GET, WAF_VARIABLE_ARGS_POST, WAF_VARIABLE_ARGS_NAMES, WAF_VARIABLE_REQUEST_COOKIES, WAF_VARIABLE_QUERY_STRING, WAF_VARIABLE_REQUEST_BASENAME, WAF_VARIABLE_REQUEST_URI, WAF_VARIABLE_PATH_INFO, WAF_VARIABLE_REQUEST_HEADERS. Field introduced in 31.2.1. Maximum of 1 items allowed. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	CompletelyDescribedMatchElements []string `json:"completely_described_match_elements,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Free-text comment about this group. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Enable or disable this WAF rule group. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Enable *bool `json:"enable,omitempty"`

	// If a rule in this group matches the match_value pattern, this action will be executed. Allowed actions are WAF_ACTION_NO_OP and WAF_ACTION_ALLOW_PARAMETER. Enum options - WAF_ACTION_NO_OP, WAF_ACTION_BLOCK, WAF_ACTION_ALLOW_PARAMETER. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HitAction *string `json:"hit_action,omitempty"`

	// This field indicates that this group is used for learning. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsLearningGroup *bool `json:"is_learning_group,omitempty"`

	// If there is no location matching the request, this action will be executed. Allowed actions are WAF_ACTION_NO_OP and WAF_ACTION_BLOCK. Enum options - WAF_ACTION_NO_OP, WAF_ACTION_BLOCK, WAF_ACTION_ALLOW_PARAMETER. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LocationMatchMissAction *string `json:"location_match_miss_action,omitempty"`

	// Positive Security Model locations. These are used to partition the application name space. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Locations []*WafPSMLocation `json:"locations,omitempty"`

	// List of labels to be used for granular RBAC. Field introduced in 20.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Markers []*RoleFilterMatchLabel `json:"markers,omitempty"`

	// If a rule in this group does not match the match_value pattern, this action will be executed. Allowed actions are WAF_ACTION_NO_OP and WAF_ACTION_BLOCK. Enum options - WAF_ACTION_NO_OP, WAF_ACTION_BLOCK, WAF_ACTION_ALLOW_PARAMETER. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MissAction *string `json:"miss_action,omitempty"`

	// User defined name of the group. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// Tenant that this object belongs to. It is a reference to an object of type Tenant. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID of this object. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}

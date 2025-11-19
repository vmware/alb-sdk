// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AuthMappingProfile auth mapping profile
// swagger:model AuthMappingProfile
type AuthMappingProfile struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Allow access to unlabelled objects. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AllowUnlabelledAccess *bool `json:"allow_unlabelled_access,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Description for the AuthMappingProfile. Field introduced in 22.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Filters for granular object access control based on object labels. Multiple filters are merged using the AND operator. If empty, all objects according to the privileges will be accessible to the user. Field introduced in 32.1.1. Maximum of 4 items allowed. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	DynamicRoleFilters []*RoleFilter `json:"dynamic_role_filters,omitempty"`

	// Rules list for tenant or role mapping. Field introduced in 22.1.1. Minimum of 1 items required. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MappingRules []*AuthMappingRule `json:"mapping_rules,omitempty"`

	// Name of the AuthMappingProfile. Field introduced in 22.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// Tenant ref for the auth mapping profile. It is a reference to an object of type Tenant. Field introduced in 22.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// Type of the Auth Profile for which these rules can be linked. Enum options - AUTH_PROFILE_LDAP, AUTH_PROFILE_TACACS_PLUS, AUTH_PROFILE_SAML, AUTH_PROFILE_PINGACCESS, AUTH_PROFILE_JWT, AUTH_PROFILE_OAUTH, AUTH_PROFILE_CLIENT_CERT. Field introduced in 22.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Type *string `json:"type"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID of the AuthMappingProfile. Field introduced in 22.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}

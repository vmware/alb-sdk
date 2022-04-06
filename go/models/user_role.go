// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UserRole user role
// swagger:model UserRole
type UserRole struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AllTenants *bool `json:"all_tenants,omitempty"`

	// Reference to the Object Access Policy that defines a User's access in the corresponding Tenant. It is a reference to an object of type ObjectAccessPolicy. Field deprecated in 20.1.2. Field introduced in 18.2.7, 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ObjectAccessPolicyRef *string `json:"object_access_policy_ref,omitempty"`

	//  It is a reference to an object of type Role. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	RoleRef *string `json:"role_ref,omitempty"`

	//  It is a reference to an object of type Tenant. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`
}

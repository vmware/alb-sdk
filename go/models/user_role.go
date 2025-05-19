// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UserRole user role
// swagger:model UserRole
type UserRole struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AllTenants *bool `json:"all_tenants,omitempty"`

	//  It is a reference to an object of type Role. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RoleRef *string `json:"role_ref,omitempty"`

	//  It is a reference to an object of type Tenant. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`
}

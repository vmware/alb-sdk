// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UserTenantListResponse user tenant list response
// swagger:model UserTenantListResponse
type UserTenantListResponse struct {

	// Every tenant the caller has access to. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Tenants []*Tenant `json:"tenants,omitempty"`

	// Subset of the caller's own user profile fields. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	User *UserTenantListUserInfo `json:"user,omitempty"`
}

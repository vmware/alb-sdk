// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceAuthServerStats virtual service auth server stats
// swagger:model VirtualServiceAuthServerStats
type VirtualServiceAuthServerStats struct {

	// Name of the LDAP Server. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Alias *string `json:"alias,omitempty"`

	// Number of requests allowed through the LDAP server cache. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthCachedAllow *uint64 `json:"auth_cached_allow,omitempty"`

	// Number of requests denied through the LDAP server cache. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthCachedDeny *uint64 `json:"auth_cached_deny,omitempty"`

	// Number of group searches in the LDAP server that failed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthGroupSearchFailed *uint64 `json:"auth_group_search_failed,omitempty"`

	// Number of group searches in the LDAP server that succeeded. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthGroupSearchSuccess *uint64 `json:"auth_group_search_success,omitempty"`

	// Number of internal server errors detected in the LDAP servers. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthInternalError *uint64 `json:"auth_internal_error,omitempty"`

	// Number of login requests that failed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthLoginFailed *uint64 `json:"auth_login_failed,omitempty"`

	// Number of login requests that succeeded. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthLoginSuccess *uint64 `json:"auth_login_success,omitempty"`

	// Number of times this LDAP server was skipped during login. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthServerSkipped *uint64 `json:"auth_server_skipped,omitempty"`

	// Number of user searches in the LDAP server that failed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthUserSearchFailed *uint64 `json:"auth_user_search_failed,omitempty"`

	// Number of user searches in the LDAP server that succeeded. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthUserSearchSuccess *uint64 `json:"auth_user_search_success,omitempty"`

	// Number of authorization requests left waiting due to connection drop. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthWaiting *uint64 `json:"auth_waiting,omitempty"`
}

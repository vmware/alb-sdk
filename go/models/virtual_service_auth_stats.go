// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceAuthStats virtual service auth stats
// swagger:model VirtualServiceAuthStats
type VirtualServiceAuthStats struct {

	// Number of authorization requests handled. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthCounter *uint64 `json:"auth_counter,omitempty"`

	// Number of invalid passwords detected from authorization requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthCredentialsUnauthorized *uint64 `json:"auth_credentials_unauthorized,omitempty"`

	// Number of times the authorization request was ignored because of non-matching URI. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthIgnoredConfig *uint64 `json:"auth_ignored_config,omitempty"`

	// Number of internal server errors detected. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthInternalError *uint64 `json:"auth_internal_error,omitempty"`

	// Number of invalid usernames detected from authorization requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthPromptUnauthorized *uint64 `json:"auth_prompt_unauthorized,omitempty"`

	// Number of authorization requests that timed out. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthTimedOut *uint64 `json:"auth_timed_out,omitempty"`

	// Statistics about the LDAP Server. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerStats []*VirtualServiceAuthServerStats `json:"server_stats,omitempty"`
}

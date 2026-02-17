// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// JWTProtectedResourceConfig j w t protected resource config
// swagger:model JWTProtectedResourceConfig
type JWTProtectedResourceConfig struct {

	// List of authorization server issuer URLs that can issue tokens for this protected resource. Field introduced in 32.1.1. Maximum of 1 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthorizationServers []string `json:"authorization_servers,omitempty"`

	// Enable OAuth 2.0 Protected Resource Metadata (RFC 9728) support. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnableProtectedResourceMetadata *bool `json:"enable_protected_resource_metadata,omitempty"`

	// URL path where OAuth 2.0 protected resource metadata is published. This is relative to the Virtual Service. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MetadataURLPath *string `json:"metadata_url_path"`

	// URL of documentation for this protected resource. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResourceDocumentation *string `json:"resource_documentation,omitempty"`

	// List of OAuth 2.0 scopes supported by this protected resource. Field introduced in 32.1.1. Maximum of 20 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SupportedScopes []string `json:"supported_scopes,omitempty"`
}

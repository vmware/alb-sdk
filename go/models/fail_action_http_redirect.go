// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// FailActionHTTPRedirect fail action HTTP redirect
// swagger:model FailActionHTTPRedirect
type FailActionHTTPRedirect struct {

	// The host to which the redirect request is sent.
	// Required: true
	Host *string `json:"host"`

	// Path configuration for the redirect request. If not set the path from the original request's URI is preserved in the redirect on pool failure.
	Path *string `json:"path,omitempty"`

	//  Enum options - HTTP, HTTPS. Allowed in Basic(Allowed values- HTTP) edition, Enterprise edition. Special default for Basic edition is HTTP, Enterprise is HTTPS.
	Protocol *string `json:"protocol,omitempty"`

	// Query configuration for the redirect request URI. If not set, the query from the original request's URI is preserved in the redirect on pool failure.
	Query *string `json:"query,omitempty"`

	//  Enum options - HTTP_REDIRECT_STATUS_CODE_301, HTTP_REDIRECT_STATUS_CODE_302, HTTP_REDIRECT_STATUS_CODE_307. Allowed in Basic(Allowed values- HTTP_REDIRECT_STATUS_CODE_302) edition, Enterprise edition.
	StatusCode *string `json:"status_code,omitempty"`
}

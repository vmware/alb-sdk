// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// FailActionHTTPRedirect fail action HTTP redirect
// swagger:model FailActionHTTPRedirect
type FailActionHTTPRedirect struct {

	// The host to which the redirect request is sent. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Host *string `json:"host"`

	// Path configuration for the redirect request. If not set the path from the original request's URI is preserved in the redirect on pool failure. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Path *string `json:"path,omitempty"`

	//  Enum options - HTTP, HTTPS. Allowed with any value in Enterprise, Essentials, Enterprise with Cloud Services edition. Allowed in Basic (Allowed values- HTTP) edition. Special default for Basic edition is HTTP, Enterprise edition is HTTPS.
	Protocol *string `json:"protocol,omitempty"`

	// Query configuration for the redirect request URI. If not set, the query from the original request's URI is preserved in the redirect on pool failure. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Query *string `json:"query,omitempty"`

	//  Enum options - HTTP_REDIRECT_STATUS_CODE_301, HTTP_REDIRECT_STATUS_CODE_302, HTTP_REDIRECT_STATUS_CODE_307. Allowed with any value in Enterprise, Essentials, Enterprise with Cloud Services edition. Allowed in Basic (Allowed values- HTTP_REDIRECT_STATUS_CODE_302) edition.
	StatusCode *string `json:"status_code,omitempty"`
}

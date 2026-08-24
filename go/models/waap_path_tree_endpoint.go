// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WaapPathTreeEndpoint waap path tree endpoint
// swagger:model WaapPathTreeEndpoint
type WaapPathTreeEndpoint struct {

	// Config-time classification of this endpoint (ACTIVE, ORPHAN, or ZOMBIE). Enum options - API, API_WITH_VIOLATIONS, NON_API, API_ACTIVE, API_SHADOW, API_ORPHAN, API_ZOMBIE. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Classification *string `json:"classification,omitempty"`

	// Effective labels for this endpoint. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Labels []*WaapPathTreeLabel `json:"labels,omitempty"`

	// HTTP method for this endpoint. Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE, HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE, HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Method *string `json:"method,omitempty"`

	// True if this endpoint has a compiled path/query parameter schema. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SchemaCompiled *bool `json:"schema_compiled,omitempty"`
}

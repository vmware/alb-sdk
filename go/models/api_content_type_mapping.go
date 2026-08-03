// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIContentTypeMapping Association between a MIME content type (e.g., application/json) and the schema enforced for request or response payloads.
// swagger:model ApiContentTypeMapping
type APIContentTypeMapping struct {

	// The content type of the request/response. This can be a pattern like application/json* for request. For response, it is the content type of the response. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ContentType *string `json:"content_type"`

	// The schema for the request/response body. Type must be SCHEMA_TYPE_UNDEFINED (no validation) or SCHEMA_TYPE_REFERENCE pointing to an ApiSchema (object and array bodies are modeled as references). Other ApiSchemaDataType values are not allowed for content type mappings. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Schema *APISimpleSchemaDescription `json:"schema"`
}

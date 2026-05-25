// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APISpecInfo Api spec info
// swagger:model ApiSpecInfo
type APISpecInfo struct {

	// Number of schemas defined in the components/schemas section of the OpenAPI document. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	ComponentSchemaCount *uint32 `json:"component_schema_count,omitempty"`

	// Description of the OpenAPI document from the info object. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	Description *string `json:"description,omitempty"`

	// Number of complex inline schemas promoted to top-level ApiSchema objects during import. Schemas are promoted when they contain object properties, array constraints, or composite types (oneOf/anyOf/allOf). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	InlineSchemaCount *uint32 `json:"inline_schema_count,omitempty"`

	// OpenAPI Specification version. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	OasVersion *string `json:"oas_version,omitempty"`

	// Number of paths in the OpenAPI document. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	PathCount *uint32 `json:"path_count,omitempty"`

	// List of server URLs extracted from the OpenAPI document's servers section. Field introduced in 32.2.1. Maximum of 100 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	Servers []*APISpecServer `json:"servers,omitempty"`

	// Title of the OpenAPI document. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	Title *string `json:"title,omitempty"`

	// Version of the OpenAPI document, which is distinct from the OpenAPI Specification version (oas_version). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	Version *string `json:"version,omitempty"`
}

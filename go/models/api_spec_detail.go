// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APISpecDetail Api spec detail
// swagger:model ApiSpecDetail
type APISpecDetail struct {

	// References to ApiPath objects created from this specification. It is a reference to an object of type ApiPath. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	PathRefs []string `json:"path_refs,omitempty"`

	// References to ApiSchema objects created from this specification. It is a reference to an object of type ApiSchema. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	SchemaRefs []string `json:"schema_refs,omitempty"`

	// Metadata extracted from the OpenAPI specification. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	SpecInfo *APISpecInfo `json:"spec_info,omitempty"`
}

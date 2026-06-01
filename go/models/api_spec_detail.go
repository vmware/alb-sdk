// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APISpecDetail Api spec detail
// swagger:model ApiSpecDetail
type APISpecDetail struct {

	// API path UUIDs. It is a reference to an object of type ApiPath. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	PathRefs []string `json:"path_refs,omitempty"`

	// API schema UUIDs. It is a reference to an object of type ApiSchema. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	SchemaRefs []string `json:"schema_refs,omitempty"`

	// API specification information. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	SpecInfo *APISpecInfo `json:"spec_info,omitempty"`
}

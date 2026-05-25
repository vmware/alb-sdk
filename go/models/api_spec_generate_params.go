// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APISpecGenerateParams Api spec generate params
// swagger:model ApiSpecGenerateParams
type APISpecGenerateParams struct {

	// API policy to generate api spec from. It is a reference to an object of type ApiPolicy. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	APIPolicyRef *string `json:"api_policy_ref,omitempty"`

	// File object to generate api spec from. It is a reference to an object of type FileObject. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FileObjectRef *string `json:"file_object_ref,omitempty"`

	// Output format  json (default) or yaml. Enum options - API_SPEC_GENERATE_FORMAT_JSON, API_SPEC_GENERATE_FORMAT_YAML. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Format *string `json:"format,omitempty"`

	// Name for the spec generation object. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`
}

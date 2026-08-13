// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIPolicyDetail Api policy detail
// swagger:model ApiPolicyDetail
type APIPolicyDetail struct {

	// The API policy associated with this Virtual Service. Unset if none is configured. It is a reference to an object of type ApiPolicy. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	APIPolicyRef *string `json:"api_policy_ref,omitempty"`

	// How this Virtual Service's API endpoints are classified, both by configuration and by observed traffic. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EndpointCategories *APIEndpointCategoryCounts `json:"endpoint_categories,omitempty"`

	// The uploaded OpenAPI specification file associated with this API policy, and its processing status. Unset if no file is associated. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FileObject *APIPolicyFileObjectDetail `json:"file_object,omitempty"`

	// Number of labels configured to turn off specific validation checks on this API policy. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LabelMappingCount *uint32 `json:"label_mapping_count,omitempty"`
}

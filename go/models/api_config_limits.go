// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIConfigLimits Api config limits
// swagger:model ApiConfigLimits
type APIConfigLimits struct {

	// Maximum number of API path definitions (unique URL path patterns) that can be configured for a single API policy. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumAPIPathsPerPolicy *int32 `json:"num_api_paths_per_policy,omitempty"`

	// Maximum number of API schema objects that can be associated with a single API policy. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumAPISchemasPerPolicy *int32 `json:"num_api_schemas_per_policy,omitempty"`

	// Maximum total number of API endpoints allowed across the system. Each ApiPath can have up to 7 ApiEndpoints. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumApis *int32 `json:"num_apis,omitempty"`

	// Maximum allowed nesting depth of JSON schema definitions within an API policy. Schema structures that exceed this depth will be rejected at config time. In the datapath, JSON payloads with greater nesting depth will not be parsed. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSchemaNesting *int32 `json:"num_schema_nesting,omitempty"`
}

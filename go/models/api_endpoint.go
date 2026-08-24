// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIEndpoint A single API operation identified by an HTTP method on a path template. Defines validation parameters, request/response body schemas, and endpoint-level label overrides.
// swagger:model ApiEndpoint
type APIEndpoint struct {

	// Additional labels for this endpoint, applicable when the endpoint is an active API. By default, this is applied in conjunction with the global active_api_labels defined in ApiPolicy. Set override_global_active_api_labels to true to use only the endpoint-level labels. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActiveAPILabels *APILabels `json:"active_api_labels,omitempty"`

	// Endpoint definition is deactivated. When true, this endpoint will not be validated, learned, or labeled. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Deactivated *bool `json:"deactivated,omitempty"`

	// Describes the functionality of the API endpoint. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Action on header parameter schema validation failures. Overrides the policy-level failed_validation_header_parameter_action when not INHERIT. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FailedValidationHeaderParameterAction *string `json:"failed_validation_header_parameter_action,omitempty"`

	// Action on path parameter value validation failures (e.g., type mismatch). Path parameters are value-only (key is defined by the path template), so this covers schema violations, not unknown keys. Overrides the policy-level failed_validation_path_parameter_action when not INHERIT. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FailedValidationPathParameterAction *string `json:"failed_validation_path_parameter_action,omitempty"`

	// Action on query parameter schema validation failures. Overrides the policy-level failed_validation_query_argument_action when not INHERIT. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FailedValidationQueryParameterAction *string `json:"failed_validation_query_parameter_action,omitempty"`

	// Request header parameter definitions for this endpoint, used to validate incoming request headers. Field introduced in 32.1.4. Maximum of 64 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeaderParameters []*ParameterDescription `json:"header_parameters,omitempty"`

	// HTTP method for this API endpoint. Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE, HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE, HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	HTTPMethod *string `json:"http_method"`

	// When true, only the endpoint-level active_api_labels are applied to this endpoint, ignoring the global active_api_labels defined in ApiPolicy. When false (default), endpoint-level and global active_api_labels are applied in conjunction. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OverrideGlobalActiveAPILabels *bool `json:"override_global_active_api_labels,omitempty"`

	// Path parameter definitions for this endpoint, used for schema validation. Names must match the placeholders in the path template. Example  for path /pets/{petId}, a path parameter named 'petId' would be listed here. Field introduced in 32.1.4. Maximum of 32 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PathParameters []*ParameterDescription `json:"path_parameters,omitempty"`

	// Query *string parameter definitions for this endpoint, used to validate query arguments. Example  for GET /pets?limit=10, a query parameter named 'limit' would be listed here. Field introduced in 32.1.4. Maximum of 128 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QueryParameters []*ParameterDescription `json:"query_parameters,omitempty"`

	// Expected format and schema of the request body, including content-type to schema mappings. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestBody *APIRequestBodyDescription `json:"request_body,omitempty"`

	// Expected response definitions for this endpoint, each associated with an HTTP status code or status code range. Field introduced in 32.1.4. Maximum of 32 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses []*APIResponse `json:"responses,omitempty"`

	// Configured lifecycle type of this endpoint. Active endpoints are expected to receive traffic; orphan endpoints have not been seen for a predefined duration; zombie endpoints receive only drip-traffic from legacy clients. Defaults to active. Enum options - API_TYPE_ACTIVE, API_TYPE_ORPHAN, API_TYPE_ZOMBIE. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Type *string `json:"type,omitempty"`

	// Action to take on an unknown status code. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UnknownStatusCodeAction *string `json:"unknown_status_code_action,omitempty"`
}

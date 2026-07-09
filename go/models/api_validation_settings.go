// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIValidationSettings Api validation settings
// swagger:model ApiValidationSettings
type APIValidationSettings struct {

	// Action to take when a header parameter fails schema validation. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FailedValidationHeaderParameterAction *string `json:"failed_validation_header_parameter_action,omitempty"`

	// Action to take when a path parameter fails schema validation. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FailedValidationPathParameterAction *string `json:"failed_validation_path_parameter_action,omitempty"`

	// Action to take when a query argument fails schema validation. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FailedValidationQueryArgumentAction *string `json:"failed_validation_query_argument_action,omitempty"`

	// Action to take when the request body fails schema validation. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FailedValidationRequestBodyParameterAction *string `json:"failed_validation_request_body_parameter_action,omitempty"`

	// Action to take when a mandatory header parameter is missing. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MissingMandatoryHeaderParameterAction *string `json:"missing_mandatory_header_parameter_action,omitempty"`

	// Action to take when a mandatory query argument is missing. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MissingMandatoryQueryArgumentAction *string `json:"missing_mandatory_query_argument_action,omitempty"`

	// Action to take when a mandatory request body parameter is missing. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MissingMandatoryRequestBodyParameterAction *string `json:"missing_mandatory_request_body_parameter_action,omitempty"`

	// Action to take when a request does not match any server URL defined in this policy. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestOutsidePathPrefixAction *string `json:"request_outside_path_prefix_action,omitempty"`

	// Action to take when a header parameter is present but not defined in the schema. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UnexpectedHeaderParameterAction *string `json:"unexpected_header_parameter_action,omitempty"`

	// Action to take when a query argument is present but not defined in the schema. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UnexpectedQueryArgumentAction *string `json:"unexpected_query_argument_action,omitempty"`

	// Action to take when a request body parameter is present but not defined in the schema. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UnexpectedRequestBodyParameterAction *string `json:"unexpected_request_body_parameter_action,omitempty"`

	// Action to take on an unknown request content type, can be overridden per path. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UnknownContentTypeAction *string `json:"unknown_content_type_action,omitempty"`

	// Action to take when a request matches a defined path but uses an HTTP method not defined for that path. Can be overridden per path. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UnknownHTTPMethodAction *string `json:"unknown_http_method_action,omitempty"`

	// Action to take when a request matches a server URL but does not match any defined API path. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UnknownPathAction *string `json:"unknown_path_action,omitempty"`

	// Action to take on unknown response content type, can be overridden per path. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UnknownResponseContentTypeAction *string `json:"unknown_response_content_type_action,omitempty"`

	// Action to take on unknown response status code, can be overridden per path. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UnknownResponseStatusCodeAction *string `json:"unknown_response_status_code_action,omitempty"`
}

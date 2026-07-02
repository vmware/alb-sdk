// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIRequestBodyDescription Api request body description
// swagger:model ApiRequestBodyDescription
type APIRequestBodyDescription struct {

	// Description of the request body from the OpenAPI specification. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Action on request body schema validation failures. Overrides the policy-level failed_validation_request_body_parameter_action when not INHERIT. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FailedValidationRequestBodyAction *string `json:"failed_validation_request_body_action,omitempty"`

	// Mapping of the content type to the request body schema. Field introduced in 32.2.1. Maximum of 128 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Mappings []*APIContentTypeMapping `json:"mappings,omitempty"`

	// Marks the request body as required. A missing body is treated as a violation; enforcement depends on the configured body validation actions. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Required *bool `json:"required,omitempty"`

	// Action to take when the request body's content type is not defined for this endpoint. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UnknownContentTypeAction *string `json:"unknown_content_type_action,omitempty"`
}

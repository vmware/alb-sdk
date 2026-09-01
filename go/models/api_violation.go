// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIViolation Api violation
// swagger:model ApiViolation
type APIViolation struct {

	// Action performed based on this violation, such as flag or reject. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Action *string `json:"action,omitempty"`

	// Location where the API violation was detected, such as path, query args, or request body. Enum options - API_LOG_VIOLATION_LOCATION_UNSPECIFIED, API_LOG_VIOLATION_LOCATION_PATH, API_LOG_VIOLATION_LOCATION_METHOD, API_LOG_VIOLATION_LOCATION_QUERY_ARGS, API_LOG_VIOLATION_LOCATION_REQUEST_HEADER, API_LOG_VIOLATION_LOCATION_REQUEST_CONTENT_TYPE, API_LOG_VIOLATION_LOCATION_REQUEST_BODY, API_LOG_VIOLATION_LOCATION_RESPONSE_STATUS_CODE, API_LOG_VIOLATION_LOCATION_REPONSE_HEADER, API_LOG_VIOLATION_LOCATION_RESPONSE_CONTENT_TYPE, API_LOG_VIOLATION_LOCATION_RESPONSE_BODY. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MatchElementLocation *string `json:"match_element_location,omitempty"`

	// Name of the element that caused the violation, for example 'id'. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MatchElementName *string `json:"match_element_name,omitempty"`

	// Value of the element that caused the violation, for example '42'. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MatchElementValue *string `json:"match_element_value,omitempty"`

	// List of parameters to be substituted into the message format string. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MessageParameters []string `json:"message_parameters,omitempty"`

	// The type of violation (e.g. invalid type, missing required property). Enum options - API_VIOLATION_TYPE_NONE, API_VIOLATION_TYPE_INVALID_TYPE, API_VIOLATION_TYPE_VALUE_OUT_OF_RANGE, API_VIOLATION_TYPE_FORMAT_MISMATCH, API_VIOLATION_TYPE_UNEXPECTED_ADDITIONAL_PROPERTY, API_VIOLATION_TYPE_MISSING_REQUIRED_PROPERTY, API_VIOLATION_TYPE_NON_API_REQUEST, API_VIOLATION_TYPE_SHADOW_ENDPOINT. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationType *string `json:"violation_type,omitempty"`
}

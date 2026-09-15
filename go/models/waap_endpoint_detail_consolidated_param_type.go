// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WaapEndpointDetailConsolidatedParamType waap endpoint detail consolidated param type
// swagger:model WaapEndpointDetailConsolidatedParamType
type WaapEndpointDetailConsolidatedParamType struct {

	// Confidence percentage for this param type as percentage (0.0-100.0). Calculated as (hits_for_param_type / total_hits_for_parameter) * 100. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfidenceFactor *float32 `json:"confidence_factor,omitempty"`

	// Number of times this specific parameter type was observed. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hits *int64 `json:"hits,omitempty"`

	// Unix timestamp (seconds) of when this parameter type was last updated. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastUpdated *int64 `json:"last_updated,omitempty"`

	// Size category of the parameter (e.g., SMALL, MEDIUM, LARGE) as inferred from observed values. Enum options - EMPTY, SMALL, MEDIUM, LARGE, UNLIMITED. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ParamSize *string `json:"param_size,omitempty"`

	// Proto enum name for the param type. String because it can be either a ParamType (WAF params) or ApiParamType (API params) depending on param_location. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ParamType *string `json:"param_type,omitempty"`

	// Parameter type transition violation from learning, if any. Enum options - API_VIOLATION_TYPE_NONE, API_VIOLATION_TYPE_INVALID_TYPE, API_VIOLATION_TYPE_VALUE_OUT_OF_RANGE, API_VIOLATION_TYPE_FORMAT_MISMATCH, API_VIOLATION_TYPE_UNEXPECTED_ADDITIONAL_PROPERTY, API_VIOLATION_TYPE_MISSING_REQUIRED_PROPERTY, API_VIOLATION_TYPE_NON_API_REQUEST, API_VIOLATION_TYPE_SHADOW_ENDPOINT. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ParamTypeViolation *string `json:"param_type_violation,omitempty"`

	// True if this is the recommended param type based on highest confidence factor meeting threshold. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RecommendedType *bool `json:"recommended_type,omitempty"`

	// Additional format information for *string parameters (e.g., UUID, email, date). Only applicable when param_type is string. Enum options - API_STRING_FORMAT_NONE, API_STRING_FORMAT_ENUM, API_STRING_FORMAT_PATTERN, API_STRING_FORMAT_UUID, API_STRING_FORMAT_IPV4, API_STRING_FORMAT_IPV6, API_STRING_FORMAT_URI, API_STRING_FORMAT_URL, API_STRING_FORMAT_DATE, API_STRING_FORMAT_DATE_TIME, API_STRING_FORMAT_EMAIL, API_STRING_FORMAT_HOSTNAME, API_STRING_FORMAT_PASSWORD, API_STRING_FORMAT_BINARY, API_STRING_FORMAT_BYTE, API_STRING_FORMAT_TIME, API_STRING_FORMAT_DURATION, API_STRING_FORMAT_URI_REFERENCE, API_STRING_FORMAT_URI_TEMPLATE, API_STRING_FORMAT_JSON_POINTER.... Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StringFormat *string `json:"string_format,omitempty"`
}

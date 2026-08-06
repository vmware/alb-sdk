// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIPathStats Api path stats
// swagger:model ApiPathStats
type APIPathStats struct {

	// Requests flagged (but not rejected) by API Policy for this endpoint (counted once per request). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlagCount *uint64 `json:"flag_count,omitempty"`

	// Total number of requests received for this API endpoint. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hits *uint64 `json:"hits,omitempty"`

	//  Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NodeObjID *string `json:"node_obj_id"`

	// Name of the ApiPath object for this API endpoint. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PathName *string `json:"path_name,omitempty"`

	// Path template for this API endpoint. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PathTemplate *string `json:"path_template,omitempty"`

	// Requests rejected by API Policy for this endpoint (counted once per request). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RejectCount *uint64 `json:"reject_count,omitempty"`

	// Total number of 1XX responses for this API endpoint. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses1xx *uint64 `json:"responses_1xx,omitempty"`

	// Total number of 2XX responses for this API endpoint. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses2xx *uint64 `json:"responses_2xx,omitempty"`

	// Total number of 3XX responses for this API endpoint. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses3xx *uint64 `json:"responses_3xx,omitempty"`

	// Total number of 400 Bad Request responses for this API endpoint. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses400 *uint64 `json:"responses_400,omitempty"`

	// Total number of 401 Unauthorized responses for this API endpoint. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses401 *uint64 `json:"responses_401,omitempty"`

	// Total number of 403 Forbidden responses for this API endpoint. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses403 *uint64 `json:"responses_403,omitempty"`

	// Total number of 4XX responses for this API endpoint. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses4xx *uint64 `json:"responses_4xx,omitempty"`

	// Total number of 5XX responses for this API endpoint. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses5xx *uint64 `json:"responses_5xx,omitempty"`

	// Total number of violations for this API endpoint. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCount *uint64 `json:"violation_count,omitempty"`

	// Total number of violations for this API endpoint with violation type location_path. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationPath *uint64 `json:"violation_count_location_path,omitempty"`

	// Violations at path parameter location with type Failed Validation (INVALID_TYPE, VALUE_OUT_OF_RANGE, or FORMAT_MISMATCH). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationPathFailedValidation *uint64 `json:"violation_count_location_path_failed_validation,omitempty"`

	// Total number of violations for this API endpoint with violation type location_query_args. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationQueryArgs *uint64 `json:"violation_count_location_query_args,omitempty"`

	// Violations at query args location with type Failed Validation (INVALID_TYPE, VALUE_OUT_OF_RANGE, or FORMAT_MISMATCH). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationQueryArgsFailedValidation *uint64 `json:"violation_count_location_query_args_failed_validation,omitempty"`

	// Violations at query args location with type Missing Mandatory Query Argument (MISSING_REQUIRED_PROPERTY). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationQueryArgsMissing *uint64 `json:"violation_count_location_query_args_missing,omitempty"`

	// Violations at query args location with type Unexpected Query Argument (UNEXPECTED_ADDITIONAL_PROPERTY). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationQueryArgsUnexpected *uint64 `json:"violation_count_location_query_args_unexpected,omitempty"`

	// Total number of violations for this API endpoint with violation type location_request_body. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationRequestBody *uint64 `json:"violation_count_location_request_body,omitempty"`

	// Violations at request body location with type Failed Validation (INVALID_TYPE, VALUE_OUT_OF_RANGE, or FORMAT_MISMATCH). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationRequestBodyFailedValidation *uint64 `json:"violation_count_location_request_body_failed_validation,omitempty"`

	// Violations at request body location with type Missing Mandatory Request Body Parameter (MISSING_REQUIRED_PROPERTY). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationRequestBodyMissing *uint64 `json:"violation_count_location_request_body_missing,omitempty"`

	// Violations at request body location with type Unexpected Request Body Parameter (UNEXPECTED_ADDITIONAL_PROPERTY). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationRequestBodyUnexpected *uint64 `json:"violation_count_location_request_body_unexpected,omitempty"`

	// Total number of violations for this API endpoint with violation type location_request_content_type. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationRequestContentType *uint64 `json:"violation_count_location_request_content_type,omitempty"`

	// Total number of violations for this API endpoint with violation type location_request_header. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationRequestHeader *uint64 `json:"violation_count_location_request_header,omitempty"`

	// Violations at request header location with type Failed Validation (INVALID_TYPE, VALUE_OUT_OF_RANGE, or FORMAT_MISMATCH). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationRequestHeaderFailedValidation *uint64 `json:"violation_count_location_request_header_failed_validation,omitempty"`

	// Violations at request header location with type Missing Mandatory Header Parameter (MISSING_REQUIRED_PROPERTY). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationRequestHeaderMissing *uint64 `json:"violation_count_location_request_header_missing,omitempty"`

	// Violations at request header location with type Unexpected Header Parameter (UNEXPECTED_ADDITIONAL_PROPERTY). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationRequestHeaderUnexpected *uint64 `json:"violation_count_location_request_header_unexpected,omitempty"`

	// Total number of violations for this API endpoint with violation type location_response_content_type. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationResponseContentType *uint64 `json:"violation_count_location_response_content_type,omitempty"`

	// Total number of violations for this API endpoint with violation type location_response_status_code. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationResponseStatusCode *uint64 `json:"violation_count_location_response_status_code,omitempty"`

	// Total number of violations for this API endpoint with violation type V01. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountUnspecified *uint64 `json:"violation_count_unspecified,omitempty"`
}

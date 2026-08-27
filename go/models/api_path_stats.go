// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIPathStats Api path stats
// swagger:model ApiPathStats
type APIPathStats struct {

	// Requests flagged (but not rejected) by API Policy for this endpoint (counted once per request). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlagCount *uint64 `json:"flag_count,omitempty"`

	// Total number of requests received for this API endpoint. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hits *uint64 `json:"hits,omitempty"`

	//  Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NodeObjID *string `json:"node_obj_id"`

	// Name of the ApiPath object for this API endpoint. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PathName *string `json:"path_name,omitempty"`

	// Path template for this API endpoint. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PathTemplate *string `json:"path_template,omitempty"`

	// Requests rejected by API Policy for this endpoint (counted once per request). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RejectCount *uint64 `json:"reject_count,omitempty"`

	// Total number of 1XX responses for this API endpoint. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses1xx *uint64 `json:"responses_1xx,omitempty"`

	// Total number of 2XX responses for this API endpoint. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses2xx *uint64 `json:"responses_2xx,omitempty"`

	// Total number of 3XX responses for this API endpoint. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses3xx *uint64 `json:"responses_3xx,omitempty"`

	// Total number of 400 Bad Request responses for this API endpoint. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses400 *uint64 `json:"responses_400,omitempty"`

	// Total number of 401 Unauthorized responses for this API endpoint. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses401 *uint64 `json:"responses_401,omitempty"`

	// Total number of 403 Forbidden responses for this API endpoint. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses403 *uint64 `json:"responses_403,omitempty"`

	// Total number of 4XX responses for this API endpoint. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses4xx *uint64 `json:"responses_4xx,omitempty"`

	// Total number of 5XX responses for this API endpoint. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses5xx *uint64 `json:"responses_5xx,omitempty"`

	// Total number of validation failures for this API endpoint. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCount *uint64 `json:"validation_fail_count,omitempty"`

	// Total number of validation failures for this API endpoint with validation failure type location_path. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationPath *uint64 `json:"validation_fail_count_location_path,omitempty"`

	// Validation failures at path parameter location with type Failed Validation (INVALID_TYPE, VALUE_OUT_OF_RANGE, or FORMAT_MISMATCH). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationPathFailedValidation *uint64 `json:"validation_fail_count_location_path_failed_validation,omitempty"`

	// Total number of validation failures for this API endpoint with validation failure type location_query_args. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationQueryArgs *uint64 `json:"validation_fail_count_location_query_args,omitempty"`

	// Validation failures at query args location with type Failed Validation (INVALID_TYPE, VALUE_OUT_OF_RANGE, or FORMAT_MISMATCH). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationQueryArgsFailedValidation *uint64 `json:"validation_fail_count_location_query_args_failed_validation,omitempty"`

	// Validation failures at query args location with type Missing Mandatory Query Argument (MISSING_REQUIRED_PROPERTY). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationQueryArgsMissing *uint64 `json:"validation_fail_count_location_query_args_missing,omitempty"`

	// Validation failures at query args location with type Unexpected Query Argument (UNEXPECTED_ADDITIONAL_PROPERTY). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationQueryArgsUnexpected *uint64 `json:"validation_fail_count_location_query_args_unexpected,omitempty"`

	// Total number of validation failures for this API endpoint with validation failure type location_request_body. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationRequestBody *uint64 `json:"validation_fail_count_location_request_body,omitempty"`

	// Validation failures at request body location with type Failed Validation (INVALID_TYPE, VALUE_OUT_OF_RANGE, or FORMAT_MISMATCH). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationRequestBodyFailedValidation *uint64 `json:"validation_fail_count_location_request_body_failed_validation,omitempty"`

	// Validation failures at request body location with type Missing Mandatory Request Body Parameter (MISSING_REQUIRED_PROPERTY). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationRequestBodyMissing *uint64 `json:"validation_fail_count_location_request_body_missing,omitempty"`

	// Validation failures at request body location with type Unexpected Request Body Parameter (UNEXPECTED_ADDITIONAL_PROPERTY). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationRequestBodyUnexpected *uint64 `json:"validation_fail_count_location_request_body_unexpected,omitempty"`

	// Total number of validation failures for this API endpoint with validation failure type location_request_content_type. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationRequestContentType *uint64 `json:"validation_fail_count_location_request_content_type,omitempty"`

	// Total number of validation failures for this API endpoint with validation failure type location_request_header. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationRequestHeader *uint64 `json:"validation_fail_count_location_request_header,omitempty"`

	// Validation failures at request header location with type Failed Validation (INVALID_TYPE, VALUE_OUT_OF_RANGE, or FORMAT_MISMATCH). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationRequestHeaderFailedValidation *uint64 `json:"validation_fail_count_location_request_header_failed_validation,omitempty"`

	// Validation failures at request header location with type Missing Mandatory Header Parameter (MISSING_REQUIRED_PROPERTY). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationRequestHeaderMissing *uint64 `json:"validation_fail_count_location_request_header_missing,omitempty"`

	// Validation failures at request header location with type Unexpected Header Parameter (UNEXPECTED_ADDITIONAL_PROPERTY). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationRequestHeaderUnexpected *uint64 `json:"validation_fail_count_location_request_header_unexpected,omitempty"`

	// Total number of validation failures for this API endpoint with validation failure type location_response_content_type. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationResponseContentType *uint64 `json:"validation_fail_count_location_response_content_type,omitempty"`

	// Total number of validation failures for this API endpoint with validation failure type location_response_status_code. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationResponseStatusCode *uint64 `json:"validation_fail_count_location_response_status_code,omitempty"`

	// Total number of validation failures for this API endpoint with validation failure type V01. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountUnspecified *uint64 `json:"validation_fail_count_unspecified,omitempty"`
}

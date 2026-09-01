// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WaapStats waap stats
// swagger:model WaapStats
type WaapStats struct {

	// Total number of active API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActiveAPICount *uint64 `json:"active_api_count,omitempty"`

	// Cumulative client transaction latency in ms for active API requests. Field introduced in 32.1.4. Unit is MILLISECONDS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActiveAPILatency *uint64 `json:"active_api_latency,omitempty"`

	// Total number of requests flagged (but not rejected) by API Policy validation. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlagCount *uint64 `json:"flag_count,omitempty"`

	// Total number of requests received for all API endpoints. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hits *uint64 `json:"hits,omitempty"`

	// Total number of DELETE requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MethodDeleteRequests *uint64 `json:"method_delete_requests,omitempty"`

	// Total number of GET requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MethodGetRequests *uint64 `json:"method_get_requests,omitempty"`

	// Total number of other method requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MethodOtherRequests *uint64 `json:"method_other_requests,omitempty"`

	// Total number of PATCH requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MethodPatchRequests *uint64 `json:"method_patch_requests,omitempty"`

	// Total number of POST requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MethodPostRequests *uint64 `json:"method_post_requests,omitempty"`

	// Total number of PUT requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MethodPutRequests *uint64 `json:"method_put_requests,omitempty"`

	// Total number of non-API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonAPICount *uint64 `json:"non_api_count,omitempty"`

	// Total number of 1XX responses for non-API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonapiResponses1xx *uint64 `json:"nonapi_responses_1xx,omitempty"`

	// Total number of 3XX responses for non-API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonapiResponses3xx *uint64 `json:"nonapi_responses_3xx,omitempty"`

	// Total number of 4XX responses for non-API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonapiResponses4xx *uint64 `json:"nonapi_responses_4xx,omitempty"`

	// Total number of 5XX responses for non-API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonapiResponses5xx *uint64 `json:"nonapi_responses_5xx,omitempty"`

	// Total number of orphan API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OrphanAPICount *uint64 `json:"orphan_api_count,omitempty"`

	// Total number of 1XX responses for orphan API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OrphanResponses1xx *uint64 `json:"orphan_responses_1xx,omitempty"`

	// Total number of 2XX responses for orphan API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OrphanResponses2xx *uint64 `json:"orphan_responses_2xx,omitempty"`

	// Total number of 3XX responses for orphan API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OrphanResponses3xx *uint64 `json:"orphan_responses_3xx,omitempty"`

	// Total number of 4XX responses for orphan API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OrphanResponses4xx *uint64 `json:"orphan_responses_4xx,omitempty"`

	// Total number of 5XX responses for orphan API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OrphanResponses5xx *uint64 `json:"orphan_responses_5xx,omitempty"`

	// Total number of requests rejected by API Policy validation. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RejectCount *uint64 `json:"reject_count,omitempty"`

	// Total number of 1XX responses for active API endpoints. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses1xx *uint64 `json:"responses_1xx,omitempty"`

	// Total number of 2XX responses for active API endpoints. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses2xx *uint64 `json:"responses_2xx,omitempty"`

	// Sum of 2XX responses across all API types (Active + Shadow + Orphan + Zombie). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses2xxAPI *uint64 `json:"responses_2xx_api,omitempty"`

	// Total 2XX responses for non-API requests to this VirtualService. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses2xxNonapi *uint64 `json:"responses_2xx_nonapi,omitempty"`

	// Total 301 Moved Permanently responses for all API endpoints (Active+Shadow+Orphan+Zombie). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses301 *uint64 `json:"responses_301,omitempty"`

	// Total 302 Found responses for all API endpoints (Active+Shadow+Orphan+Zombie). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses302 *uint64 `json:"responses_302,omitempty"`

	// Total 303 See Other responses for all API endpoints (Active+Shadow+Orphan+Zombie). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses303 *uint64 `json:"responses_303,omitempty"`

	// Total 307 Temporary Redirect responses for all API endpoints (Active+Shadow+Orphan+Zombie). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses307 *uint64 `json:"responses_307,omitempty"`

	// Total 308 Permanent Redirect responses for all API endpoints (Active+Shadow+Orphan+Zombie). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses308 *uint64 `json:"responses_308,omitempty"`

	// Total number of 3XX responses for active API endpoints. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses3xx *uint64 `json:"responses_3xx,omitempty"`

	// Total 400 Bad Request responses for all API endpoints (Active+Shadow+Orphan+Zombie). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses400 *uint64 `json:"responses_400,omitempty"`

	// Total 401 Unauthorized responses for all API endpoints (Active+Shadow+Orphan+Zombie). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses401 *uint64 `json:"responses_401,omitempty"`

	// Total 403 Forbidden responses for all API endpoints (Active+Shadow+Orphan+Zombie). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses403 *uint64 `json:"responses_403,omitempty"`

	// Total 407 Proxy Authentication Required responses for all API endpoints (Active+Shadow+Orphan+Zombie). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses407 *uint64 `json:"responses_407,omitempty"`

	// Total 429 Too Many Requests responses for all API endpoints (Active+Shadow+Orphan+Zombie). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses429 *uint64 `json:"responses_429,omitempty"`

	// Total number of 4XX responses for active API endpoints. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses4xx *uint64 `json:"responses_4xx,omitempty"`

	// Total number of 5XX responses for active API endpoints. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses5xx *uint64 `json:"responses_5xx,omitempty"`

	// Total number of shadow API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShadowAPICount *uint64 `json:"shadow_api_count,omitempty"`

	// Cumulative client transaction latency in ms for shadow API requests. Field introduced in 32.1.4. Unit is MILLISECONDS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShadowAPILatency *uint64 `json:"shadow_api_latency,omitempty"`

	// Total number of 1XX responses for shadow API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShadowResponses1xx *uint64 `json:"shadow_responses_1xx,omitempty"`

	// Total number of 2XX responses for shadow API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShadowResponses2xx *uint64 `json:"shadow_responses_2xx,omitempty"`

	// Total number of 3XX responses for shadow API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShadowResponses3xx *uint64 `json:"shadow_responses_3xx,omitempty"`

	// Total number of 4XX responses for shadow API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShadowResponses4xx *uint64 `json:"shadow_responses_4xx,omitempty"`

	// Total number of 5XX responses for shadow API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShadowResponses5xx *uint64 `json:"shadow_responses_5xx,omitempty"`

	// Total number of validation failures for all API endpoints. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCount *uint64 `json:"validation_fail_count,omitempty"`

	// Total number of validation failures for all API endpoints with validation failure type location_method. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationMethod *uint64 `json:"validation_fail_count_location_method,omitempty"`

	// Total number of validation failures for all API endpoints with validation failure type location_path. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationPath *uint64 `json:"validation_fail_count_location_path,omitempty"`

	// VS-level validation failures at path parameter location with type Failed Validation (INVALID_TYPE, VALUE_OUT_OF_RANGE, or FORMAT_MISMATCH). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationPathFailedValidation *uint64 `json:"validation_fail_count_location_path_failed_validation,omitempty"`

	// Total number of validation failures for all API endpoints with validation failure type location_query_args. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationQueryArgs *uint64 `json:"validation_fail_count_location_query_args,omitempty"`

	// VS-level validation failures at query args location with type Failed Validation (INVALID_TYPE, VALUE_OUT_OF_RANGE, or FORMAT_MISMATCH). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationQueryArgsFailedValidation *uint64 `json:"validation_fail_count_location_query_args_failed_validation,omitempty"`

	// VS-level validation failures at query args location with type Missing Mandatory Query Argument (MISSING_REQUIRED_PROPERTY). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationQueryArgsMissing *uint64 `json:"validation_fail_count_location_query_args_missing,omitempty"`

	// VS-level validation failures at query args location with type Unexpected Query Argument (UNEXPECTED_ADDITIONAL_PROPERTY). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationQueryArgsUnexpected *uint64 `json:"validation_fail_count_location_query_args_unexpected,omitempty"`

	// Total number of validation failures for all API endpoints with validation failure type location_request_body. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationRequestBody *uint64 `json:"validation_fail_count_location_request_body,omitempty"`

	// VS-level validation failures at request body location with type Failed Validation (INVALID_TYPE, VALUE_OUT_OF_RANGE, or FORMAT_MISMATCH). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationRequestBodyFailedValidation *uint64 `json:"validation_fail_count_location_request_body_failed_validation,omitempty"`

	// VS-level validation failures at request body location with type Missing Mandatory Request Body Parameter (MISSING_REQUIRED_PROPERTY). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationRequestBodyMissing *uint64 `json:"validation_fail_count_location_request_body_missing,omitempty"`

	// VS-level validation failures at request body location with type Unexpected Request Body Parameter (UNEXPECTED_ADDITIONAL_PROPERTY). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationRequestBodyUnexpected *uint64 `json:"validation_fail_count_location_request_body_unexpected,omitempty"`

	// Total number of validation failures for all API endpoints with validation failure type location_request_content_type. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationRequestContentType *uint64 `json:"validation_fail_count_location_request_content_type,omitempty"`

	// Total number of validation failures for all API endpoints with validation failure type location_request_header. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationRequestHeader *uint64 `json:"validation_fail_count_location_request_header,omitempty"`

	// VS-level validation failures at request header location with type Failed Validation (INVALID_TYPE, VALUE_OUT_OF_RANGE, or FORMAT_MISMATCH). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationRequestHeaderFailedValidation *uint64 `json:"validation_fail_count_location_request_header_failed_validation,omitempty"`

	// VS-level validation failures at request header location with type Missing Mandatory Header Parameter (MISSING_REQUIRED_PROPERTY). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationRequestHeaderMissing *uint64 `json:"validation_fail_count_location_request_header_missing,omitempty"`

	// VS-level validation failures at request header location with type Unexpected Header Parameter (UNEXPECTED_ADDITIONAL_PROPERTY). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationRequestHeaderUnexpected *uint64 `json:"validation_fail_count_location_request_header_unexpected,omitempty"`

	// Total number of validation failures for all API endpoints with validation failure type location_response_content_type. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationResponseContentType *uint64 `json:"validation_fail_count_location_response_content_type,omitempty"`

	// Total number of validation failures for all API endpoints with validation failure type location_response_status_code. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountLocationResponseStatusCode *uint64 `json:"validation_fail_count_location_response_status_code,omitempty"`

	// Total number of validation failures for all API endpoints with validation failure type V01. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationFailCountUnspecified *uint64 `json:"validation_fail_count_unspecified,omitempty"`

	// Total number of zombie API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ZombieAPICount *uint64 `json:"zombie_api_count,omitempty"`

	// Total number of 1XX responses for zombie API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ZombieResponses1xx *uint64 `json:"zombie_responses_1xx,omitempty"`

	// Total number of 2XX responses for zombie API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ZombieResponses2xx *uint64 `json:"zombie_responses_2xx,omitempty"`

	// Total number of 3XX responses for zombie API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ZombieResponses3xx *uint64 `json:"zombie_responses_3xx,omitempty"`

	// Total number of 4XX responses for zombie API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ZombieResponses4xx *uint64 `json:"zombie_responses_4xx,omitempty"`

	// Total number of 5XX responses for zombie API requests. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ZombieResponses5xx *uint64 `json:"zombie_responses_5xx,omitempty"`
}

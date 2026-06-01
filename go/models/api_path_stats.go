// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIPathStats Api path stats
// swagger:model ApiPathStats
type APIPathStats struct {

	// Total number of requests received for this API endpoint. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hits *uint64 `json:"hits,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NodeObjID *string `json:"node_obj_id"`

	// Total number of 1XX responses for this API endpoint. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses1xx *uint64 `json:"responses_1xx,omitempty"`

	// Total number of 2XX responses for this API endpoint. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses2xx *uint64 `json:"responses_2xx,omitempty"`

	// Total number of 3XX responses for this API endpoint. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses3xx *uint64 `json:"responses_3xx,omitempty"`

	// Total number of 400 Bad Request responses for this API endpoint. Field introduced in 32.3.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses400 *uint64 `json:"responses_400,omitempty"`

	// Total number of 401 Unauthorized responses for this API endpoint. Field introduced in 32.3.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses401 *uint64 `json:"responses_401,omitempty"`

	// Total number of 403 Forbidden responses for this API endpoint. Field introduced in 32.3.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses403 *uint64 `json:"responses_403,omitempty"`

	// Total number of 4XX responses for this API endpoint. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses4xx *uint64 `json:"responses_4xx,omitempty"`

	// Total number of 5XX responses for this API endpoint. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses5xx *uint64 `json:"responses_5xx,omitempty"`

	// Total number of violations for this API endpoint. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCount *uint64 `json:"violation_count,omitempty"`

	// Total number of violations for this API endpoint with violation type location_path. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationPath *uint64 `json:"violation_count_location_path,omitempty"`

	// Total number of violations for this API endpoint with violation type location_query_args. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationQueryArgs *uint64 `json:"violation_count_location_query_args,omitempty"`

	// Total number of violations for this API endpoint with violation type location_request_body. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationRequestBody *uint64 `json:"violation_count_location_request_body,omitempty"`

	// Total number of violations for this API endpoint with violation type location_request_content_type. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationRequestContentType *uint64 `json:"violation_count_location_request_content_type,omitempty"`

	// Total number of violations for this API endpoint with violation type location_request_header. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationRequestHeader *uint64 `json:"violation_count_location_request_header,omitempty"`

	// Total number of violations for this API endpoint with violation type location_response_status_code. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationResponseStatusCode *uint64 `json:"violation_count_location_response_status_code,omitempty"`

	// Total number of violations for this API endpoint with violation type V01. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountUnspecified *uint64 `json:"violation_count_unspecified,omitempty"`
}

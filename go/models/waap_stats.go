// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WaapStats waap stats
// swagger:model WaapStats
type WaapStats struct {

	// Total number of active API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActiveAPICount *uint64 `json:"active_api_count,omitempty"`

	// Cumulative client transaction latency in ms for active API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActiveAPILatency *uint64 `json:"active_api_latency,omitempty"`

	// Total number of requests received for all API endpoints. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hits *uint64 `json:"hits,omitempty"`

	// Total number of DELETE requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MethodDeleteRequests *uint64 `json:"method_delete_requests,omitempty"`

	// Total number of GET requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MethodGetRequests *uint64 `json:"method_get_requests,omitempty"`

	// Total number of other method requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MethodOtherRequests *uint64 `json:"method_other_requests,omitempty"`

	// Total number of PATCH requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MethodPatchRequests *uint64 `json:"method_patch_requests,omitempty"`

	// Total number of POST requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MethodPostRequests *uint64 `json:"method_post_requests,omitempty"`

	// Total number of PUT requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MethodPutRequests *uint64 `json:"method_put_requests,omitempty"`

	// Total number of non-API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonAPICount *uint64 `json:"non_api_count,omitempty"`

	// Total number of 1XX responses for non-API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonapiResponses1xx *uint64 `json:"nonapi_responses_1xx,omitempty"`

	// Total number of 3XX responses for non-API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonapiResponses3xx *uint64 `json:"nonapi_responses_3xx,omitempty"`

	// Total number of 4XX responses for non-API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonapiResponses4xx *uint64 `json:"nonapi_responses_4xx,omitempty"`

	// Total number of 5XX responses for non-API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonapiResponses5xx *uint64 `json:"nonapi_responses_5xx,omitempty"`

	// Total number of orphan API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OrphanAPICount *uint64 `json:"orphan_api_count,omitempty"`

	// Total number of 1XX responses for orphan API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OrphanResponses1xx *uint64 `json:"orphan_responses_1xx,omitempty"`

	// Total number of 2XX responses for orphan API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OrphanResponses2xx *uint64 `json:"orphan_responses_2xx,omitempty"`

	// Total number of 3XX responses for orphan API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OrphanResponses3xx *uint64 `json:"orphan_responses_3xx,omitempty"`

	// Total number of 4XX responses for orphan API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OrphanResponses4xx *uint64 `json:"orphan_responses_4xx,omitempty"`

	// Total number of 5XX responses for orphan API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OrphanResponses5xx *uint64 `json:"orphan_responses_5xx,omitempty"`

	// Total number of 1XX responses for active API endpoints. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses1xx *uint64 `json:"responses_1xx,omitempty"`

	// Total number of 2XX responses for active API endpoints. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses2xx *uint64 `json:"responses_2xx,omitempty"`

	// Sum of 2XX responses across all API types (Active + Shadow + Orphan + Zombie). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses2xxAPI *uint64 `json:"responses_2xx_api,omitempty"`

	// Total 2XX responses for non-API requests to this VirtualService. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses2xxNonapi *uint64 `json:"responses_2xx_nonapi,omitempty"`

	// Total 301 Moved Permanently responses for all API endpoints (Active+Shadow+Orphan+Zombie). Field introduced in 32.3.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses301 *uint64 `json:"responses_301,omitempty"`

	// Total 302 Found responses for all API endpoints (Active+Shadow+Orphan+Zombie). Field introduced in 32.3.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses302 *uint64 `json:"responses_302,omitempty"`

	// Total 303 See Other responses for all API endpoints (Active+Shadow+Orphan+Zombie). Field introduced in 32.3.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses303 *uint64 `json:"responses_303,omitempty"`

	// Total 307 Temporary Redirect responses for all API endpoints (Active+Shadow+Orphan+Zombie). Field introduced in 32.3.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses307 *uint64 `json:"responses_307,omitempty"`

	// Total 308 Permanent Redirect responses for all API endpoints (Active+Shadow+Orphan+Zombie). Field introduced in 32.3.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses308 *uint64 `json:"responses_308,omitempty"`

	// Total number of 3XX responses for active API endpoints. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses3xx *uint64 `json:"responses_3xx,omitempty"`

	// Total 400 Bad Request responses for all API endpoints (Active+Shadow+Orphan+Zombie). Field introduced in 32.3.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses400 *uint64 `json:"responses_400,omitempty"`

	// Total 401 Unauthorized responses for all API endpoints (Active+Shadow+Orphan+Zombie). Field introduced in 32.3.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses401 *uint64 `json:"responses_401,omitempty"`

	// Total 403 Forbidden responses for all API endpoints (Active+Shadow+Orphan+Zombie). Field introduced in 32.3.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses403 *uint64 `json:"responses_403,omitempty"`

	// Total 407 Proxy Authentication Required responses for all API endpoints (Active+Shadow+Orphan+Zombie). Field introduced in 32.3.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses407 *uint64 `json:"responses_407,omitempty"`

	// Total 429 Too Many Requests responses for all API endpoints (Active+Shadow+Orphan+Zombie). Field introduced in 32.3.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses429 *uint64 `json:"responses_429,omitempty"`

	// Total number of 4XX responses for active API endpoints. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses4xx *uint64 `json:"responses_4xx,omitempty"`

	// Total number of 5XX responses for active API endpoints. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Responses5xx *uint64 `json:"responses_5xx,omitempty"`

	// Total number of shadow API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShadowAPICount *uint64 `json:"shadow_api_count,omitempty"`

	// Cumulative client transaction latency in ms for shadow API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShadowAPILatency *uint64 `json:"shadow_api_latency,omitempty"`

	// Total number of 1XX responses for shadow API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShadowResponses1xx *uint64 `json:"shadow_responses_1xx,omitempty"`

	// Total number of 2XX responses for shadow API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShadowResponses2xx *uint64 `json:"shadow_responses_2xx,omitempty"`

	// Total number of 3XX responses for shadow API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShadowResponses3xx *uint64 `json:"shadow_responses_3xx,omitempty"`

	// Total number of 4XX responses for shadow API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShadowResponses4xx *uint64 `json:"shadow_responses_4xx,omitempty"`

	// Total number of 5XX responses for shadow API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShadowResponses5xx *uint64 `json:"shadow_responses_5xx,omitempty"`

	// Total number of violations for all API endpoints. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCount *uint64 `json:"violation_count,omitempty"`

	// Total number of violations for all API endpoints with violation type location_method. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationMethod *uint64 `json:"violation_count_location_method,omitempty"`

	// Total number of violations for all API endpoints with violation type location_path. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationPath *uint64 `json:"violation_count_location_path,omitempty"`

	// Total number of violations for all API endpoints with violation type location_query_args. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationQueryArgs *uint64 `json:"violation_count_location_query_args,omitempty"`

	// Total number of violations for all API endpoints with violation type location_request_body. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationRequestBody *uint64 `json:"violation_count_location_request_body,omitempty"`

	// Total number of violations for all API endpoints with violation type location_request_content_type. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationRequestContentType *uint64 `json:"violation_count_location_request_content_type,omitempty"`

	// Total number of violations for all API endpoints with violation type location_request_header. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationRequestHeader *uint64 `json:"violation_count_location_request_header,omitempty"`

	// Total number of violations for all API endpoints with violation type location_response_status_code. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountLocationResponseStatusCode *uint64 `json:"violation_count_location_response_status_code,omitempty"`

	// Total number of violations for all API endpoints with violation type V01. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViolationCountUnspecified *uint64 `json:"violation_count_unspecified,omitempty"`

	// Total number of zombie API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ZombieAPICount *uint64 `json:"zombie_api_count,omitempty"`

	// Total number of 1XX responses for zombie API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ZombieResponses1xx *uint64 `json:"zombie_responses_1xx,omitempty"`

	// Total number of 2XX responses for zombie API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ZombieResponses2xx *uint64 `json:"zombie_responses_2xx,omitempty"`

	// Total number of 3XX responses for zombie API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ZombieResponses3xx *uint64 `json:"zombie_responses_3xx,omitempty"`

	// Total number of 4XX responses for zombie API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ZombieResponses4xx *uint64 `json:"zombie_responses_4xx,omitempty"`

	// Total number of 5XX responses for zombie API requests. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ZombieResponses5xx *uint64 `json:"zombie_responses_5xx,omitempty"`
}

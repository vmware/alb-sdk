// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VserverL7Http2Stats vserver l7 http2 stats
// swagger:model VserverL7Http2Stats
type VserverL7Http2Stats struct {

	// Total number of HTTP/2 completed responses. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CompleteResponses *uint64 `json:"complete_responses,omitempty"`

	// Total number of HTTP/2 error responses. It does not include errors excluded in analytics profile. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErrorResponses *uint64 `json:"error_responses,omitempty"`

	// Total number of HTTP/2 GET requests. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GetReqs *uint64 `json:"get_reqs,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NodeObjID *string `json:"node_obj_id"`

	// Total number of HTTP/2 requests that are not GET or POST requests. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OtherReqs *uint64 `json:"other_reqs,omitempty"`

	// Total number of HTTP/2 POST requests. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PostReqs *uint64 `json:"post_reqs,omitempty"`

	// Total number of HTTP/2 2XX responses. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp1xx *uint64 `json:"resp_1xx,omitempty"`

	// Total number of HTTP/2 2XX responses. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp2xx *uint64 `json:"resp_2xx,omitempty"`

	// Total number of HTTP/2 3XX responses. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp3xx *uint64 `json:"resp_3xx,omitempty"`

	// Total number of HTTP/2 4XX error responses. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp4xx *uint64 `json:"resp_4xx,omitempty"`

	// Total number of HTTP/2 4xx responses as errors sent by Avi Vantage. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp4xxAviErrors *uint64 `json:"resp_4xx_avi_errors,omitempty"`

	// Total number of HTTP/2 5XX error responses. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp5xx *uint64 `json:"resp_5xx,omitempty"`

	// Total number of HTTP/2 5xx responses as errors sent by Avi Vantage. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp5xxAviErrors *uint64 `json:"resp_5xx_avi_errors,omitempty"`

	// Total number of HTTP/2 requests. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalRequests *uint64 `json:"total_requests,omitempty"`
}

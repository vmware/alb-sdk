// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServerL7Stats server l7 stats
// swagger:model ServerL7Stats
type ServerL7Stats struct {

	// Total response time taken by the application in ms. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ApplicationResponseTime *uint64 `json:"application_response_time,omitempty"`

	// Total number of HTTP completed responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CompleteResponses *uint64 `json:"complete_responses,omitempty"`

	// Total number of sessions active concurrently. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConcurrentSessions *uint64 `json:"concurrent_sessions,omitempty"`

	// Total number of HTTP error responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErrorResponses *uint64 `json:"error_responses,omitempty"`

	// Total number of HTTP POST requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FinishedSessions *uint64 `json:"finished_sessions,omitempty"`

	// Total number of HTTP GET requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GetReqs *uint64 `json:"get_reqs,omitempty"`

	// Latency of a response to a GET request in ms. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GetRespLatency *uint64 `json:"get_resp_latency,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GetRespLatencyBucket1 *uint64 `json:"get_resp_latency_bucket1,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GetRespLatencyBucket2 *uint64 `json:"get_resp_latency_bucket2,omitempty"`

	// Number of times load balancing failed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailCount *uint64 `json:"lb_fail_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NodeObjID *string `json:"node_obj_id"`

	// Total number of HTTP requests that are not POST or GET requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OtherReqs *uint64 `json:"other_reqs,omitempty"`

	// Latency of a response to a request other than GET or POST in ms. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OtherRespLatency *uint64 `json:"other_resp_latency,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OtherRespLatencyBucket1 *uint64 `json:"other_resp_latency_bucket1,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OtherRespLatencyBucket2 *uint64 `json:"other_resp_latency_bucket2,omitempty"`

	// Total number of HTTP POST requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PostReqs *uint64 `json:"post_reqs,omitempty"`

	// Latency of a response to a POST request in ms. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PostRespLatency *uint64 `json:"post_resp_latency,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PostRespLatencyBucket1 *uint64 `json:"post_resp_latency_bucket1,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PostRespLatencyBucket2 *uint64 `json:"post_resp_latency_bucket2,omitempty"`

	// Total number of requests for all finished sessions. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReqsFinishedSessions *uint64 `json:"reqs_finished_sessions,omitempty"`

	// Total number of 1XX responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp1xx *uint64 `json:"resp_1xx,omitempty"`

	// Total number of 2XX responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp2xx *uint64 `json:"resp_2xx,omitempty"`

	// Total number of 3XX responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp3xx *uint64 `json:"resp_3xx,omitempty"`

	// Total number of 4XX responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp4xx *uint64 `json:"resp_4xx,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp4xxErrors *uint64 `json:"resp_4xx_errors,omitempty"`

	// Total number of 5XX responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp5xx *uint64 `json:"resp_5xx,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp5xxErrors *uint64 `json:"resp_5xx_errors,omitempty"`

	// Number of servers in the pool. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerCount *uint64 `json:"server_count,omitempty"`

	//  Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerUptime *uint64 `json:"server_uptime,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Timeouts *uint64 `json:"timeouts,omitempty"`

	// Total number of HTTP requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalRequests *uint64 `json:"total_requests,omitempty"`

	// Total number of HTTP responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalResponses *uint64 `json:"total_responses,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceOutOfBandRequestStats virtual service out of band request stats
// swagger:model VirtualServiceOutOfBandRequestStats
type VirtualServiceOutOfBandRequestStats struct {

	// Total number of completed responses for Out-of-band requests. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CompleteResponses *uint64 `json:"complete_responses,omitempty"`

	// Total number of error responses for Out-of-band requests. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErrorResponses *uint64 `json:"error_responses,omitempty"`

	// Total number of Out-of-band GET requests. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GetReqs *uint64 `json:"get_reqs,omitempty"`

	// Total number of Out-of-band requests that are not GET or POST requests. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OtherReqs *uint64 `json:"other_reqs,omitempty"`

	// Total number of Out-of-band POST requests. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PostReqs *uint64 `json:"post_reqs,omitempty"`

	// Total number of 2XX responses for Out-of-band requests. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp1xx *uint64 `json:"resp_1xx,omitempty"`

	// Total number of 2XX responses for Out-of-band requests. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp2xx *uint64 `json:"resp_2xx,omitempty"`

	// Total number of 3XX responses for Out-of-band requests. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp3xx *uint64 `json:"resp_3xx,omitempty"`

	// Total number of 4XX error responses for Out-of-band requests. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp4xx *uint64 `json:"resp_4xx,omitempty"`

	// Total number of 5XX error responses for Out-of-band requests. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp5xx *uint64 `json:"resp_5xx,omitempty"`

	// Total number of Out-of-band requests. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalRequests *uint64 `json:"total_requests,omitempty"`
}

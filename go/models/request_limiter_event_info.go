// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RequestLimiterEventInfo request limiter event info
// swagger:model RequestLimiterEventInfo
type RequestLimiterEventInfo struct {

	// Ip of the client from which request has been received. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ClientIP *string `json:"client_ip,omitempty"`

	// Http error response code for the throttled request. Allowed values are 200-504. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ErrorStatusCode *uint32 `json:"error_status_code,omitempty"`

	// Error/Warning/alert message describing the event. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Message *string `json:"message"`

	// Http request method. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Method *string `json:"method"`

	// Whether the request has been processed(true) or not(false). Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Processed *bool `json:"processed,omitempty"`

	// Http request url. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	URL *string `json:"url"`

	// User agent of the client from which request has been received. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UserAgent *string `json:"user_agent,omitempty"`
}

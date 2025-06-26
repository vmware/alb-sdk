// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServerHealthMonitor server health monitor
// swagger:model ServerHealthMonitor
type ServerHealthMonitor struct {

	// Average health monitor response time from server in milli-seconds. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgResponseTime *uint64 `json:"avg_response_time,omitempty"`

	//  Enum options - ARP_UNRESOLVED, CONNECTION_REFUSED, CONNECTION_TIMEOUT, RESPONSE_CODE_MISMATCH, PAYLOAD_CONTENT_MISMATCH, SERVER_UNREACHABLE, CONNECTION_RESET, CONNECTION_ERROR, HOST_ERROR, ADDRESS_ERROR, NO_PORT, PAYLOAD_TIMEOUT, NO_RESPONSE, NO_RESOURCES, SSL_ERROR, SSL_CERT_ERROR, PORT_UNREACHABLE, SCRIPT_ERROR, OTHER_ERROR, SERVER_DISABLED, REMOTE_STATE, MAINTENANCE_RESPONSE_CODE_MATCH, MAINTENANCE_PAYLOAD_CONTENT_MATCH, CHUNKED_RESPONSE_PAYLOAD_NOT_FOUND, GSLB_POOL_MEMBER_DOWN, GSLB_POOL_MEMBER_DISABLED, GSLB_POOL_MEMBER_STATE_UNKNOWN, INSUFFICIENT_HEALTH_MONITORS_UP, GSLB_POOL_MEMBER_REMOTE_STATE_UNKNOWN, RESPONSE_BUFFER_OVERFLOW, REQUEST_BUFFER_OVERFLOW, SERVER_AUTHENTICATION_ERR, INITIALIZATION_ERR, EXT_HM_ERROR, HTTP2_NOT_SUPPORTED. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FailureCode *string `json:"failure_code,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	// Average health monitor response time from server in milli-seconds in the last few health monitor instances. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RecentResponseTime *uint64 `json:"recent_response_time,omitempty"`

	//  Enum options - OPER_UP, OPER_DOWN, OPER_CREATING, OPER_RESOURCES, OPER_INACTIVE, OPER_DISABLED, OPER_UNUSED, OPER_UNKNOWN, OPER_PROCESSING, OPER_INITIALIZING, OPER_ERROR_DISABLED, OPER_AWAIT_MANUAL_PLACEMENT, OPER_UPGRADING, OPER_SE_PROCESSING, OPER_PARTITIONED, OPER_DISABLING, OPER_FAILED, OPER_UNAVAIL, OPER_AGGREGATE_DOWN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	State *string `json:"state"`
}

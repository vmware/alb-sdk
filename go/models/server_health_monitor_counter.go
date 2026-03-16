// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServerHealthMonitorCounter server health monitor counter
// swagger:model ServerHealthMonitorCounter
type ServerHealthMonitorCounter struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Count *uint32 `json:"count"`

	//  Enum options - ARP_UNRESOLVED, CONNECTION_REFUSED, CONNECTION_TIMEOUT, RESPONSE_CODE_MISMATCH, PAYLOAD_CONTENT_MISMATCH, SERVER_UNREACHABLE, CONNECTION_RESET, CONNECTION_ERROR, HOST_ERROR, ADDRESS_ERROR, NO_PORT, PAYLOAD_TIMEOUT, NO_RESPONSE, NO_RESOURCES, SSL_ERROR, SSL_CERT_ERROR, PORT_UNREACHABLE, SCRIPT_ERROR, OTHER_ERROR, SERVER_DISABLED, REMOTE_STATE, MAINTENANCE_RESPONSE_CODE_MATCH, MAINTENANCE_PAYLOAD_CONTENT_MATCH, CHUNKED_RESPONSE_PAYLOAD_NOT_FOUND, GSLB_POOL_MEMBER_DOWN, GSLB_POOL_MEMBER_DISABLED, GSLB_POOL_MEMBER_STATE_UNKNOWN, INSUFFICIENT_HEALTH_MONITORS_UP, GSLB_POOL_MEMBER_REMOTE_STATE_UNKNOWN, RESPONSE_BUFFER_OVERFLOW, REQUEST_BUFFER_OVERFLOW, SERVER_AUTHENTICATION_ERR, INITIALIZATION_ERR, EXT_HM_ERROR, HTTP2_NOT_SUPPORTED. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Type *string `json:"type"`
}

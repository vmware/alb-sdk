// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HTTPRequestEntry Http request entry
// swagger:model HttpRequestEntry
type HTTPRequestEntry struct {

	// HTTP Headers list. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Headers []string `json:"headers,omitempty"`

	// HTTP Request Id. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ID *uint64 `json:"id"`

	// HTTP Request Method. Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE, HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE, HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Method *string `json:"method"`

	// Start time of the Request. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestStarttime *uint32 `json:"request_starttime,omitempty"`

	// Server Connection Destination IP. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerDstIP *string `json:"server_dst_ip,omitempty"`

	// Server Connection Destination Port. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerDstPort *uint32 `json:"server_dst_port,omitempty"`

	// Server Connection Source IP. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerSrcIP *string `json:"server_src_ip,omitempty"`

	// Server Connection Source Port. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerSrcPort *uint32 `json:"server_src_port,omitempty"`

	// State of the Request. Enum options - AVI_HTTP_REQUEST_STATE_CONN_ACCEPT, AVI_HTTP_REQUEST_STATE_WAITING_FOR_REQUEST, AVI_HTTP_REQUEST_STATE_SSL_HANDSHAKING, AVI_HTTP_REQUEST_STATE_PROCESSING_SPDY, AVI_HTTP_REQUEST_STATE_READ_CLIENT_REQ_LINE, AVI_HTTP_REQUEST_STATE_READ_CLIENT_REQ_HDR, AVI_HTTP_REQUEST_STATE_CONNECT_TO_UPSTREAM, AVI_HTTP_REQUEST_STATE_SEND_REQ_TO_UPSTREAM, AVI_HTTP_REQUEST_STATE_READ_RESP_HDR_FROM_UPSTREAM, AVI_HTTP_REQUEST_STATE_SEND_TO_CLIENT, AVI_HTTP_REQUEST_STATE_KEEPALIVE, AVI_HTTP_REQUEST_STATE_PROXY_UPGRADED_CONN, AVI_HTTP_REQUEST_STATE_CLOSING_REQUEST, AVI_HTTP_REQUEST_STATE_READ_FROM_UPSTREAM, AVI_HTTP_REQUEST_STATE_READ_PROXY_PROTOCOL, AVI_HTTP_REQUEST_STATE_READ_CLIENT_PIPELINE_REQ_LINE, AVI_HTTP_REQUEST_STATE_SSL_HANDSHAKE_TO_UPSTREAM, AVI_HTTP_REQUEST_STATE_WAITING_IN_CONNPOOL_CACHE, AVI_HTTP_REQUEST_STATE_SEND_RESPONSE_HEADER_TO_CLIENT, AVI_HTTP_REQUEST_STATE_SEND_RESPONSE_BODY_TO_CLIENT. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`

	// Stream Id for HTTP/2 Requests. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StreamID *uint64 `json:"stream_id,omitempty"`

	// HTTP Request URL. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	URL *string `json:"url"`
}

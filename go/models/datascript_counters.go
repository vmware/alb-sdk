// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DatascriptCounters datascript counters
// swagger:model DatascriptCounters
type DatascriptCounters struct {

	// This is incremented when datascript attached at ssl client hello event encounters error. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientSslHelloErrors *uint64 `json:"client_ssl_hello_errors,omitempty"`

	// This is incremented when datascript attached at client ssl preconnect event encounters error. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientSslPreconnectErrors *uint64 `json:"client_ssl_preconnect_errors,omitempty"`

	// This is incremented when datascript attached at L4 Loadbalancing events encounters error. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L4LbEventErrors *uint64 `json:"l4_lb_event_errors,omitempty"`

	// This is incremented when datascript attached at L4 Request event encounters error. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestEventErrors *uint64 `json:"request_event_errors,omitempty"`

	// This is incremented when datascript attached at L4 Response event encounters error. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResponseEventErrors *uint64 `json:"response_event_errors,omitempty"`

	// This is incremented when datascript attached at Server-side SSL Handshake events encounters error. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerSslEventErrors *uint64 `json:"server_ssl_event_errors,omitempty"`

	// This is incremented when datascript attached at SSL handshake done event encounters error. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslDoneEventErrors *uint64 `json:"ssl_done_event_errors,omitempty"`

	// This is incremented when datascript attached at client accept event encounters error. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TCPClientAcceptedEventErrors *uint64 `json:"tcp_client_accepted_event_errors,omitempty"`

	// This is incremented when datascript attached at TCP Client Closed event encounters error. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TCPClientClosedErrors *uint64 `json:"tcp_client_closed_errors,omitempty"`

	// This is incremented when datascript attached at TCP Server Closed event encounters error. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TCPServerClosedErrors *uint64 `json:"tcp_server_closed_errors,omitempty"`

	// This is incremented when datascript attached at server connected event encounters error. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TCPServerConnectedEventErrors *uint64 `json:"tcp_server_connected_event_errors,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VserverL4SSLDSStats vserver l4 s s l d s stats
// swagger:model VserverL4SSLDSStats
type VserverL4SSLDSStats struct {

	// Bytes added by DS to downstream. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BytesAddedToDownstream *uint64 `json:"bytes_added_to_downstream,omitempty"`

	// Bytes added by DS to upstream. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BytesAddedToUpstream *uint64 `json:"bytes_added_to_upstream,omitempty"`

	// Bytes discarded by DS from downstream. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BytesDiscardedFromDownstream *uint64 `json:"bytes_discarded_from_downstream,omitempty"`

	// Bytes discarded by DS from upstream. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BytesDiscardedFromUpstream *uint64 `json:"bytes_discarded_from_upstream,omitempty"`

	// Number of times the collect API yields. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CollectYield *uint64 `json:"collect_yield,omitempty"`

	// Number of DS errors in the L4 Loadbalancing events. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L4LbEventErrors *uint64 `json:"l4_lb_event_errors,omitempty"`

	// Skip reading data from socket whenpeer is under back-pressure. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumReadsSkippedFromSocket *uint64 `json:"num_reads_skipped_from_socket,omitempty"`

	// Skip writing data to peer socket when ds is in progress. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumWritesSkippedToPeerSocket *uint64 `json:"num_writes_skipped_to_peer_socket,omitempty"`

	// Number of DS errors in the request event. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestEventErrors *uint64 `json:"request_event_errors,omitempty"`

	// Number of DS errors in the response event. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResponseEventErrors *uint64 `json:"response_event_errors,omitempty"`

	// Number of times the send API yields. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SendYield *uint64 `json:"send_yield,omitempty"`

	// Number of DS errors in the Server SSL Hello and Handshake-done events. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerSslEventErrors *uint64 `json:"server_ssl_event_errors,omitempty"`

	// Number of DS errors in the SSL handshake done event. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslDoneEventErrors *uint64 `json:"ssl_done_event_errors,omitempty"`
}

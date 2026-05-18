// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SSLStatsInternal s s l stats internal
// swagger:model SSLStatsInternal
type SSLStatsInternal struct {

	//  Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IssuerRevokedOcspResponses *uint64 `json:"issuer_revoked_ocsp_responses,omitempty"`

	// Number of TLS 1.2 keylogs sent. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KeylogSentTLS12 *uint64 `json:"keylog_sent_tls12,omitempty"`

	// Number of TLS 1.3 keylogs sent. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KeylogSentTLS13 *uint64 `json:"keylog_sent_tls13,omitempty"`

	//  Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OcspStatusRequests *uint64 `json:"ocsp_status_requests,omitempty"`

	//  Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RevokedOcspResponses *uint64 `json:"revoked_ocsp_responses,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ssl0rttAttempts *uint64 `json:"ssl_0rtt_attempts,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ssl0rttSuccess *uint64 `json:"ssl_0rtt_success,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakeNewAsync *uint64 `json:"ssl_handshake_new_async,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakeNewMain *uint64 `json:"ssl_handshake_new_main,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakeOffloadFromAsync *uint64 `json:"ssl_handshake_offload_from_async,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakeOffloadFromMain *uint64 `json:"ssl_handshake_offload_from_main,omitempty"`

	// SSL handshakes renegotiated. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakeReneg *uint64 `json:"ssl_handshake_reneg,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakeReusedAsync *uint64 `json:"ssl_handshake_reused_async,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakeReusedMain *uint64 `json:"ssl_handshake_reused_main,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslProfileSelectorSwitch *uint64 `json:"ssl_profile_selector_switch,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslSessionsCorrupt *uint64 `json:"ssl_sessions_corrupt,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SslSessionsCreated *uint64 `json:"ssl_sessions_created"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SslSessionsDeleted *uint64 `json:"ssl_sessions_deleted"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SslSessionsHits *uint64 `json:"ssl_sessions_hits"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SslSessionsMisses *uint64 `json:"ssl_sessions_misses"`

	//  Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StaleOcspResponses *uint64 `json:"stale_ocsp_responses,omitempty"`

	//  Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SuccessfulOcspResponses *uint64 `json:"successful_ocsp_responses,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TLSTicketsIssued *uint64 `json:"tls_tickets_issued"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TLSTicketsMissing *uint64 `json:"tls_tickets_missing,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TLSTicketsReceived *uint64 `json:"tls_tickets_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TLSTicketsRenewed *uint64 `json:"tls_tickets_renewed,omitempty"`

	//  Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UnavailableOcspResponses *uint64 `json:"unavailable_ocsp_responses,omitempty"`
}

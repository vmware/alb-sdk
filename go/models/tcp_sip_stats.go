// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TCPSipStats Tcp sip stats
// swagger:model TcpSipStats
type TCPSipStats struct {

	// Number of active call ids for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipActiveCallids *uint64 `json:"tcps_sip_active_callids,omitempty"`

	// Number of call ids hit for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipCallidHits *uint64 `json:"tcps_sip_callid_hits,omitempty"`

	// Number of call ids shifted to a different connection for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipCallidMigrates *uint64 `json:"tcps_sip_callid_migrates,omitempty"`

	// Number of call ids missed for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipCallidMiss *uint64 `json:"tcps_sip_callid_miss,omitempty"`

	// Number of times the configured SIP log depth is reached. Field introduced in 17.2.13, 18.1.5, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipLogDepthHits *uint64 `json:"tcps_sip_log_depth_hits,omitempty"`

	// Number of memory allocation failures for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipMallocFailures *uint64 `json:"tcps_sip_malloc_failures,omitempty"`

	// Number of messages with size more than maximum supported size for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipMsgSizeExceeds *uint64 `json:"tcps_sip_msg_size_exceeds,omitempty"`

	// Number of bytes dropped due to lack of credit for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipNoCreditDropBytes *uint64 `json:"tcps_sip_no_credit_drop_bytes,omitempty"`

	// Number of drops due to lack of credit for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipNoCreditDrops *uint64 `json:"tcps_sip_no_credit_drops,omitempty"`

	// Number of parse attempts for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipParseAttempts *uint64 `json:"tcps_sip_parse_attempts,omitempty"`

	// Number of parse errors for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipParseErrors *uint64 `json:"tcps_sip_parse_errors,omitempty"`

	// Number of parse successes for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipParseSuccesses *uint64 `json:"tcps_sip_parse_successes,omitempty"`

	// Number of acknowledgment requests for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipRequestAcks *uint64 `json:"tcps_sip_request_acks,omitempty"`

	// Number of bye requests for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipRequestByes *uint64 `json:"tcps_sip_request_byes,omitempty"`

	// Number of cancel requests for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipRequestCancels *uint64 `json:"tcps_sip_request_cancels,omitempty"`

	// Number of invite requests for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipRequestInvites *uint64 `json:"tcps_sip_request_invites,omitempty"`

	// Number of options requests for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipRequestOptions *uint64 `json:"tcps_sip_request_options,omitempty"`

	// Number of request messages which are not specifically accounted for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipRequestOthers *uint64 `json:"tcps_sip_request_others,omitempty"`

	// Number of publish requests for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipRequestPublishes *uint64 `json:"tcps_sip_request_publishes,omitempty"`

	// Number of register requests for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipRequestRegisters *uint64 `json:"tcps_sip_request_registers,omitempty"`

	// Number of subscribe requests for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipRequestSubscribes *uint64 `json:"tcps_sip_request_subscribes,omitempty"`

	// Number of 1xx responses for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipResponse1xxs *uint64 `json:"tcps_sip_response_1xxs,omitempty"`

	// Number of 2xx responses for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipResponse2xxs *uint64 `json:"tcps_sip_response_2xxs,omitempty"`

	// Number of 3xx responses for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipResponse3xxs *uint64 `json:"tcps_sip_response_3xxs,omitempty"`

	// Number of 4xx responses for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipResponse4xxs *uint64 `json:"tcps_sip_response_4xxs,omitempty"`

	// Number of 5xx responses for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipResponse5xxs *uint64 `json:"tcps_sip_response_5xxs,omitempty"`

	// Number of 6xx responses for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipResponse6xxs *uint64 `json:"tcps_sip_response_6xxs,omitempty"`

	// Number of receive buffer slides for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipRxBufSlides *uint64 `json:"tcps_sip_rx_buf_slides,omitempty"`

	// Number of timed out connections for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipTimedoutConns *uint64 `json:"tcps_sip_timedout_conns,omitempty"`

	// Number of total messages dropped for SIP-over-TCP. Field introduced in 17.2.10, 18.1.3, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TcpsSipTotalDrops *uint64 `json:"tcps_sip_total_drops,omitempty"`
}

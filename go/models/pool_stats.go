// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PoolStats pool stats
// swagger:model PoolStats
type PoolStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BadConnections *uint64 `json:"bad_connections,omitempty"`

	// Average connection establishment time on the server leg. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionEstbTimeBe *float64 `json:"connection_estb_time_be,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CurrentConnections *uint64 `json:"current_connections,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FailedRequests *uint64 `json:"failed_requests,omitempty"`

	// HTTP2 compression errors. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2CompressionErrors *uint64 `json:"http2_compression_errors,omitempty"`

	// HTTP2 enhance your calm errors. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2EnhanceYourCalm *uint64 `json:"http2_enhance_your_calm,omitempty"`

	// HTTP2 flow control errors. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2FlowControlErrors *uint64 `json:"http2_flow_control_errors,omitempty"`

	// HTTP2 frame size errors. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2FrameSizeErrors *uint64 `json:"http2_frame_size_errors,omitempty"`

	// HTTP2 miscellaneous errors. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2MiscErrors *uint64 `json:"http2_misc_errors,omitempty"`

	// HTTP2 header related protocol errors. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2ProtocolHeaderErrors *uint64 `json:"http2_protocol_header_errors,omitempty"`

	// HTTP2 non-header related protocol errors. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2ProtocolOtherErrors *uint64 `json:"http2_protocol_other_errors,omitempty"`

	// HTTP2 refused stream errors. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2RefusedStreamErrors *uint64 `json:"http2_refused_stream_errors,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InlhmSkipBypassed *uint32 `json:"inlhm_skip_bypassed,omitempty"`

	// HTTP/1.x invalid reponses. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InvalidHttpv1Responses *uint64 `json:"invalid_httpv1_responses,omitempty"`

	// HTTP/2 invalid responses. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InvalidHttpv2Responses *uint64 `json:"invalid_httpv2_responses,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailAddPending *uint32 `json:"lb_fail_add_pending,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailCapestRandMaxConn *uint32 `json:"lb_fail_capest_rand_max_conn,omitempty"`

	//  Field introduced in 17.1.14, 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailCookieDecodeFailed *uint32 `json:"lb_fail_cookie_decode_failed,omitempty"`

	//  Field introduced in 17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailCookieDecryptFailed *uint32 `json:"lb_fail_cookie_decrypt_failed,omitempty"`

	//  Field introduced in 17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailCookieKeyNotFound *uint32 `json:"lb_fail_cookie_key_not_found,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailGetNext *uint32 `json:"lb_fail_get_next,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailMaxConn *uint32 `json:"lb_fail_max_conn,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailMaxConnRate *uint32 `json:"lb_fail_max_conn_rate,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailNoLport *uint32 `json:"lb_fail_no_lport,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailPersistentServerDown *uint32 `json:"lb_fail_persistent_server_down,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailPersistentServerInvalid *uint32 `json:"lb_fail_persistent_server_invalid,omitempty"`

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailRemoteSiteDown *uint32 `json:"lb_fail_remote_site_down,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailServerDown *uint32 `json:"lb_fail_server_down,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailSlowStartMaxConn *uint32 `json:"lb_fail_slow_start_max_conn,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailSuspectState *uint32 `json:"lb_fail_suspect_state,omitempty"`

	// Number of times fallback algorithm was used for load balancing. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFallbackAlgoUsed *uint64 `json:"num_fallback_algo_used,omitempty"`

	// Number of requests that have triggered a server reselect. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSvrReselectReq *uint64 `json:"num_svr_reselect_req,omitempty"`

	// Number of all server reselects completed. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSvrReselects *uint64 `json:"num_svr_reselects,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PersistAllocFails *uint64 `json:"persist_alloc_fails,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PersistenceObjs *uint64 `json:"persistence_objs,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolLoad *int32 `json:"pool_load,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PreClosedConnections *uint64 `json:"pre_closed_connections,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestQueueNumAdds *uint64 `json:"request_queue_num_adds,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestQueueNumDels *uint64 `json:"request_queue_num_dels,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestQueueNumDispatched *uint64 `json:"request_queue_num_dispatched,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestQueueNumEvicted *uint64 `json:"request_queue_num_evicted,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestQueueNumFlushes *uint64 `json:"request_queue_num_flushes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestQueueNumFreedRequests *uint64 `json:"request_queue_num_freed_requests,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestQueueNumFull *uint64 `json:"request_queue_num_full,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslAuthDsa *uint64 `json:"ssl_auth_dsa,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslAuthEcdsa *uint64 `json:"ssl_auth_ecdsa,omitempty"`

	//  Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslAuthMldsa44 *uint64 `json:"ssl_auth_mldsa44,omitempty"`

	//  Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslAuthMldsa65 *uint64 `json:"ssl_auth_mldsa65,omitempty"`

	//  Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslAuthMldsa87 *uint64 `json:"ssl_auth_mldsa87,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslAuthRsa *uint64 `json:"ssl_auth_rsa,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslEcdsaPfs *uint64 `json:"ssl_ecdsa_pfs,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslEnc3des *uint64 `json:"ssl_enc_3des,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslEncAes128 *uint64 `json:"ssl_enc_aes128,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslEncAes256 *uint64 `json:"ssl_enc_aes256,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslEncRc4 *uint64 `json:"ssl_enc_rc4,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakesErrors *uint64 `json:"ssl_handshakes_errors,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakesFailed *uint64 `json:"ssl_handshakes_failed,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakesFull *uint64 `json:"ssl_handshakes_full,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakesReused *uint64 `json:"ssl_handshakes_reused,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakesTimedout *uint64 `json:"ssl_handshakes_timedout,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslKxDh *uint64 `json:"ssl_kx_dh,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslKxEcdh *uint64 `json:"ssl_kx_ecdh,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslKxRsa *uint64 `json:"ssl_kx_rsa,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslMacAead *uint64 `json:"ssl_mac_aead,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslMacMd5 *uint64 `json:"ssl_mac_md5,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslMacSha1 *uint64 `json:"ssl_mac_sha1,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslMacSha256 *uint64 `json:"ssl_mac_sha256,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslMacSha384 *uint64 `json:"ssl_mac_sha384,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslOpenSessions *uint64 `json:"ssl_open_sessions,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslRsaPfs *uint64 `json:"ssl_rsa_pfs,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslVerSsl30 *uint64 `json:"ssl_ver_ssl30,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslVerTls10 *uint64 `json:"ssl_ver_tls10,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslVerTls11 *uint64 `json:"ssl_ver_tls11,omitempty"`

	//  Field introduced in 16.4.8,17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslVerTls12 *uint64 `json:"ssl_ver_tls12,omitempty"`

	// Upstream TLS1.3 connections. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslVerTls13 *uint64 `json:"ssl_ver_tls13,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalConnections *uint64 `json:"total_connections,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VserverL7Stats vserver l7 stats
// swagger:model VserverL7Stats
type VserverL7Stats struct {

	// Number of errors from the upstream connection or a 4XX/5XX response returned by the server. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ApplicationError *uint64 `json:"application_error,omitempty"`

	// Number of bytes served from the cache during cache hit. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CacheBytes *uint64 `json:"cache_bytes,omitempty"`

	// Number of cache hits i.e. a request was served by the cache and not the servers. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CacheHits *uint64 `json:"cache_hits,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CacheableBytes *uint64 `json:"cacheable_bytes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CacheableHits *uint64 `json:"cacheable_hits,omitempty"`

	// Number of times the client closed the connection prematurely. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientCloseError *uint64 `json:"client_close_error,omitempty"`

	// Latency of data transfer to the client in ms. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientDataTransferTime *uint64 `json:"client_data_transfer_time,omitempty"`

	// Total number of HTTP completed responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CompleteResponses *uint64 `json:"complete_responses,omitempty"`

	// Number of requests whose responses were already compressed at origin. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CompressedAtOriginReqs *uint64 `json:"compressed_at_origin_reqs,omitempty"`

	// Number of requests whose responses were compressed on the proxy. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CompressedReqs *uint64 `json:"compressed_reqs,omitempty"`

	// Number of request whose responses are eligible for compression. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CompressibleReqs *uint64 `json:"compressible_reqs,omitempty"`

	// Number of requests whose responses were not compressed due to reasons like content-type list mismatch, auto or custom compression filtering etc. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CompressionSkippedReqs *uint64 `json:"compression_skipped_reqs,omitempty"`

	// Total number of sessions active concurrently. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConcurrentSessions *uint64 `json:"concurrent_sessions,omitempty"`

	// Number of errors due to a failure in accepting the connection. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnAcceptError *uint64 `json:"conn_accept_error,omitempty"`

	// Total number of HTTP error responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErrorResponses *uint64 `json:"error_responses,omitempty"`

	// Total number of finished sessions. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FinishedSessions *uint64 `json:"finished_sessions,omitempty"`

	// Latency of a response to a GET request in ms. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GetClientTxnLatency *uint64 `json:"get_client_txn_latency,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GetClientTxnLatencyBucket1 *uint64 `json:"get_client_txn_latency_bucket1,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GetClientTxnLatencyBucket2 *uint64 `json:"get_client_txn_latency_bucket2,omitempty"`

	// Total number of HTTP GET requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GetReqs *uint64 `json:"get_reqs,omitempty"`

	// Size of the HTTP request headers (in bytes). Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPHeadersBytes *uint64 `json:"http_headers_bytes,omitempty"`

	// Number of HTTP headers. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPHeadersCount *uint64 `json:"http_headers_count,omitempty"`

	// Number of HTTP request parameters. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPParamsCount *uint64 `json:"http_params_count,omitempty"`

	// Number of Avi internal errors. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InternalError *uint64 `json:"internal_error,omitempty"`

	// Number of load balancing errors. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbFailureError *uint64 `json:"lb_failure_error,omitempty"`

	// Number of errors due to the request not finding an available pool. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NoAvailablePoolError *uint64 `json:"no_available_pool_error,omitempty"`

	// Backend server ID. Of the form node_id/obj_id where  'node_id = <UUID of SE/controller node>' and'obj_id = <service - VIP port>'. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NodeObjID *string `json:"node_obj_id"`

	// Number of requests admitted to optional processing. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumOptionalProcessingAdmitted *uint64 `json:"num_optional_processing_admitted,omitempty"`

	// Number of requests refused from optional processing. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumOptionalProcessingRefused *uint64 `json:"num_optional_processing_refused,omitempty"`

	// CPU usage in microseconds for optional processing. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OptionalCPUUsage *uint64 `json:"optional_cpu_usage,omitempty"`

	// Latency of a response to a request other than GET or POST in ms. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OtherClientTxnLatency *uint64 `json:"other_client_txn_latency,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OtherClientTxnLatencyBucket1 *uint64 `json:"other_client_txn_latency_bucket1,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OtherClientTxnLatencyBucket2 *uint64 `json:"other_client_txn_latency_bucket2,omitempty"`

	// Total number of HTTP requests that are not POST or GET requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OtherReqs *uint64 `json:"other_reqs,omitempty"`

	// Number of persistent servers that changed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PersistChange *uint64 `json:"persist_change,omitempty"`

	// HTTP POST request body size in bytes. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PostBytes *uint64 `json:"post_bytes,omitempty"`

	// Latency of a response to a POST request in ms. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PostClientTxnLatency *uint64 `json:"post_client_txn_latency,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PostClientTxnLatencyBucket1 *uint64 `json:"post_client_txn_latency_bucket1,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PostClientTxnLatencyBucket2 *uint64 `json:"post_client_txn_latency_bucket2,omitempty"`

	// Size of the response after compression(in bytes). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PostCompressionBytes *uint64 `json:"post_compression_bytes,omitempty"`

	// Total number of HTTP POST requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PostReqs *uint64 `json:"post_reqs,omitempty"`

	// Size of the response before compression(in bytes). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PreCompressionBytes *uint64 `json:"pre_compression_bytes,omitempty"`

	// Total number of requests for all finished sessions. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReqsFinishedSessions *uint64 `json:"reqs_finished_sessions,omitempty"`

	// Number of HTTP requests containing at least one parameter. Field introduced in 17.2.12, 18.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReqsWithParams *uint64 `json:"reqs_with_params,omitempty"`

	// Total number of 1XX responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp1xx *uint64 `json:"resp_1xx,omitempty"`

	// Total number of 2XX responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp2xx *uint64 `json:"resp_2xx,omitempty"`

	// Total number of 3XX responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp3xx *uint64 `json:"resp_3xx,omitempty"`

	// Total number of 4XX responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp4xx *uint64 `json:"resp_4xx,omitempty"`

	// Total number of 4XX responses sent by Avi Vantage. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp4xxAviErrors *uint64 `json:"resp_4xx_avi_errors,omitempty"`

	// Total number of 5XX responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp5xx *uint64 `json:"resp_5xx,omitempty"`

	// Total number of 5XX responses sent by Avi Vantage. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resp5xxAviErrors *uint64 `json:"resp_5xx_avi_errors,omitempty"`

	// Number of requests that are actively sampled for Real User Monitoring. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RumActiveSampledReqs *uint64 `json:"rum_active_sampled_reqs,omitempty"`

	// Number of requests whose responses were compressed after they were uncompressed to insert rum response. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RumCompressedReqs *uint64 `json:"rum_compressed_reqs,omitempty"`

	// Number of requests that failed to be sampled for Real User Monitoring. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RumFailedSampledReqs *uint64 `json:"rum_failed_sampled_reqs,omitempty"`

	// Number of requests that are not sampled for Real User Monitoring. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RumNotSampledReqs *uint64 `json:"rum_not_sampled_reqs,omitempty"`

	// Number of requests that are passively sampled for Real User Monitoring. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RumPassiveSampledReqs *uint64 `json:"rum_passive_sampled_reqs,omitempty"`

	// Difference between pre and post compression bytes. This is the amount of memory saved (in bytes) after compressing the response. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SavedCompressionBytes *uint64 `json:"saved_compression_bytes,omitempty"`

	// Number of server connection setup errors. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerConnectError *uint64 `json:"server_connect_error,omitempty"`

	// Number of server connections that timed out. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerTimeoutError *uint64 `json:"server_timeout_error,omitempty"`

	// Total number of times DSA was used for a certificate in a SSL handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslAuthDsa *uint64 `json:"ssl_auth_dsa,omitempty"`

	// Total number of times ECDSA was used for a certificate in a SSL handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslAuthEcdsa *uint64 `json:"ssl_auth_ecdsa,omitempty"`

	// Total number of times MLDSA44 was used for a certificate in a SSL handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslAuthMldsa44 *uint64 `json:"ssl_auth_mldsa44,omitempty"`

	// Total number of times MLDSA44 was used for a certificate in a SSL handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslAuthMldsa65 *uint64 `json:"ssl_auth_mldsa65,omitempty"`

	// Total number of times MLDSA87 was used for a certificate in a SSL handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslAuthMldsa87 *uint64 `json:"ssl_auth_mldsa87,omitempty"`

	// Total number of times RSA was used for a certificate in a SSL handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslAuthRsa *uint64 `json:"ssl_auth_rsa,omitempty"`

	// Number of PFS transactions using Elliptic Curve certificates. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslEcdsaPfs *uint64 `json:"ssl_ecdsa_pfs,omitempty"`

	// Total number of times 3DES was used as the Symmetric Exchange algorithm in an SSL handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslEnc3des *uint64 `json:"ssl_enc_3des,omitempty"`

	// Total number of times AES128 was used as the Symmetric Encryption algorithm in an SSL handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslEncAes128 *uint64 `json:"ssl_enc_aes128,omitempty"`

	// Total number of times AES256 was used as the Symmetric Encryption algorithm in an SSL handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslEncAes256 *uint64 `json:"ssl_enc_aes256,omitempty"`

	// Total number of times RC4 was used as the Symmetric Encryption algorithm in an SSL handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslEncRc4 *uint64 `json:"ssl_enc_rc4,omitempty"`

	// Number of client aborted errors in a SSL handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakeNetworkErrors *uint64 `json:"ssl_handshake_network_errors,omitempty"`

	// Number of protocol or configuration errors in a SSL handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakeProtocolErrors *uint64 `json:"ssl_handshake_protocol_errors,omitempty"`

	// Number of successful full SSL handshakes to start a new session. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakesNew *uint64 `json:"ssl_handshakes_new,omitempty"`

	// Number of PFS transactions. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakesPfs *uint64 `json:"ssl_handshakes_pfs,omitempty"`

	// Number of successful abbreviated SSL handshakes to resume a session. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakesReused *uint64 `json:"ssl_handshakes_reused,omitempty"`

	// Number of SSL handshakes that timed out. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslHandshakesTimedout *uint64 `json:"ssl_handshakes_timedout,omitempty"`

	// Total number of times DH was used as the Key Exchange algorithm in an SSL handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslKxDh *uint64 `json:"ssl_kx_dh,omitempty"`

	// Total number of times ECDH was used as the Key Exchange algorithm in an SSL handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslKxEcdh *uint64 `json:"ssl_kx_ecdh,omitempty"`

	// Total number of times RSA was used as the Key Exchange algorithm in an SSL handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslKxRsa *uint64 `json:"ssl_kx_rsa,omitempty"`

	// Total number of times AEAD was used as the MAC Exchange algorithm in an SSL handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslMacAead *uint64 `json:"ssl_mac_aead,omitempty"`

	// Total number of times MD5 was used as the MAC algorithm in an SSL handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslMacMd5 *uint64 `json:"ssl_mac_md5,omitempty"`

	// Total number of times SHA1 was used as the MAC algorithm in an SSL handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslMacSha1 *uint64 `json:"ssl_mac_sha1,omitempty"`

	// Total number of times SHA256 was used as the MAC algorithm in an SSL handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslMacSha256 *uint64 `json:"ssl_mac_sha256,omitempty"`

	// Total number of times SHA384 was used as the MAC algorithm in an SSL handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslMacSha384 *uint64 `json:"ssl_mac_sha384,omitempty"`

	// Number of open SSL sessions. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslOpenSessions *uint64 `json:"ssl_open_sessions,omitempty"`

	// Number of PFS transactions using RSA certificates. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslRsaPfs *uint64 `json:"ssl_rsa_pfs,omitempty"`

	// Total number of SSL v3.0 handshakes served. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslVerSsl30 *uint64 `json:"ssl_ver_ssl30,omitempty"`

	// Total number of TLS v1.0 handshakes served. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslVerTLS10 *uint64 `json:"ssl_ver_tls10,omitempty"`

	// Total number of TLS v1.1 handshakes served. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslVerTLS11 *uint64 `json:"ssl_ver_tls11,omitempty"`

	// Total number of TLS v1.2 handshakes served. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslVerTLS12 *uint64 `json:"ssl_ver_tls12,omitempty"`

	// Total number of TLS v1.3 connections. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslVerTLS13 *uint64 `json:"ssl_ver_tls13,omitempty"`

	// Number of client connections that timed out. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TimeoutError *uint64 `json:"timeout_error,omitempty"`

	// Total number of HTTP/2 requests. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalHttp2Requests *uint64 `json:"total_http2_requests,omitempty"`

	// Total number of HTTP requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalRequests *uint64 `json:"total_requests,omitempty"`

	// Total number of HTTP responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalResponses *uint64 `json:"total_responses,omitempty"`

	// HTTP request URI length in bytes. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	URILength *uint64 `json:"uri_length,omitempty"`

	// Number of requests bypassing WAF. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafDisabled *uint64 `json:"waf_disabled,omitempty"`

	// Number of transactions evaluated by WAF Policy in any phase. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafEvaluated *uint64 `json:"waf_evaluated,omitempty"`

	// Number of transactions processed (irrespective of hit or not) by WAF Policy in Request Body Phase. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafEvaluatedRequestBodyPhase *uint64 `json:"waf_evaluated_request_body_phase,omitempty"`

	// Number of transactions processed (irrespective of hit or not) by WAF Policy in Request Header Phase. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafEvaluatedRequestHeaderPhase *uint64 `json:"waf_evaluated_request_header_phase,omitempty"`

	// Number of transactions processed (irrespective of hit or not) by WAF Policy in Response Body Phase. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafEvaluatedResponseBodyPhase *uint64 `json:"waf_evaluated_response_body_phase,omitempty"`

	// Number of transactions processed (irrespective of hit or not) by WAF Policy in Response Header Phase. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafEvaluatedResponseHeaderPhase *uint64 `json:"waf_evaluated_response_header_phase,omitempty"`

	// Number of transactions flagged as attacks by WAF Policy in any phase. This is applicable only for detection mode. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafFlagged *uint64 `json:"waf_flagged,omitempty"`

	// Number of transactions flagged as attacks by WAF Policy in Request Body Phase. This is applicable only for detection mode. Field introduced in 17.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafFlaggedRequestBodyPhase *uint64 `json:"waf_flagged_request_body_phase,omitempty"`

	// Number of transactions flagged as attacks by WAF Policy in Request Header Phase. This is applicable only for detection mode. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafFlaggedRequestHeaderPhase *uint64 `json:"waf_flagged_request_header_phase,omitempty"`

	// Number of transactions rejected by WAF Policy in Response Body Phase. This is applicable only for detection mode. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafFlaggedResponseBodyPhase *uint64 `json:"waf_flagged_response_body_phase,omitempty"`

	// Number of transactions flagged as attacks by WAF Policy in Response Header Phase. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafFlaggedResponseHeaderPhase *uint64 `json:"waf_flagged_response_header_phase,omitempty"`

	// Sum of latency (in microseconds) seen by transactions (irrespective of hit on not) in WAF Request Body Phase. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafLatencyRequestBodyPhase *uint64 `json:"waf_latency_request_body_phase,omitempty"`

	// Sum of latency (in microseconds) seen by transactions (irrespective of hit on not) in WAF Request Header Phase. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafLatencyRequestHeaderPhase *uint64 `json:"waf_latency_request_header_phase,omitempty"`

	// Sum of latency (in microseconds) seen by transactions (irrespective of hit on not) in WAF Request Body Phase. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafLatencyResponseBodyPhase *uint64 `json:"waf_latency_response_body_phase,omitempty"`

	// Sum of latency (in microseconds) seen by transactions (irrespective of hit on not) in WAF Response Header Phase. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafLatencyResponseHeaderPhase *uint64 `json:"waf_latency_response_header_phase,omitempty"`

	// Number of transactions matched WAF Policy in any phase. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafMatched *uint64 `json:"waf_matched,omitempty"`

	// Number of transactions matched by WAF Policy in Request Body Phase. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafMatchedRequestBodyPhase *uint64 `json:"waf_matched_request_body_phase,omitempty"`

	// Number of transactions matched by WAF Policy in Request Header Phase. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafMatchedRequestHeaderPhase *uint64 `json:"waf_matched_request_header_phase,omitempty"`

	// Number of transactions matched by WAF Policy in Response Body Phase. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafMatchedResponseBodyPhase *uint64 `json:"waf_matched_response_body_phase,omitempty"`

	// Number of transactions matched by WAF Policy in Response Header Phase. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafMatchedResponseHeaderPhase *uint64 `json:"waf_matched_response_header_phase,omitempty"`

	// Number of transactions rejected by WAF Policy in any phase. This is applicable only for enforcement mode. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafRejected *uint64 `json:"waf_rejected,omitempty"`

	// Number of transactions rejected by WAF Policy in Request Body Phase. This is applicable only for enforcement mode. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafRejectedRequestBodyPhase *uint64 `json:"waf_rejected_request_body_phase,omitempty"`

	// Number of transactions rejected by WAF Policy in Request Header Phase. This is applicable only for enforcement mode. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafRejectedRequestHeaderPhase *uint64 `json:"waf_rejected_request_header_phase,omitempty"`

	// Number of transactions rejected by WAF Policy in Response Body Phase. This is applicable only for enforcement mode. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafRejectedResponseBodyPhase *uint64 `json:"waf_rejected_response_body_phase,omitempty"`

	// Number of transactions rejected by WAF Policy in Response Header Phase. Field introduced in 17.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WafRejectedResponseHeaderPhase *uint64 `json:"waf_rejected_response_header_phase,omitempty"`
}

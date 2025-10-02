// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VserverL7MetricsObj vserver l7 metrics obj
// swagger:model VserverL7MetricsObj
type VserverL7MetricsObj struct {

	// Client Apdex measures quality of server response based on latency. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Apdexr *float64 `json:"apdexr,omitempty"`

	// Average server/application response latency. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgApplicationResponseTime *float64 `json:"avg_application_response_time,omitempty"`

	// Average time client was blocked as reported by client. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgBlockingTime *float64 `json:"avg_blocking_time,omitempty"`

	// Average browser rendering latency. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgBrowserRenderingTime *float64 `json:"avg_browser_rendering_time,omitempty"`

	// Average cache bytes. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgCacheBytes *float64 `json:"avg_cache_bytes,omitempty"`

	// Average cache hit of requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgCacheHits *float64 `json:"avg_cache_hits,omitempty"`

	// Average cacheable bytes. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgCacheableBytes *float64 `json:"avg_cacheable_bytes,omitempty"`

	// Average cacheable hit of requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgCacheableHits *float64 `json:"avg_cacheable_hits,omitempty"`

	// Average client data transfer time that represents latency of sending response to the client excluding the RTT time . Higher client data transfer time signifies lower bandwidth  between client and Avi Service Engine. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgClientDataTransferTime *float64 `json:"avg_client_data_transfer_time,omitempty"`

	// Average client Round Trip Time. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgClientRtt *float64 `json:"avg_client_rtt,omitempty"`

	// Average client transaction latency computed by adding response latencies across all HTTP requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgClientTxnLatency *float64 `json:"avg_client_txn_latency,omitempty"`

	// Rate of HTTP responses sent per second. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgCompleteResponses *float64 `json:"avg_complete_responses,omitempty"`

	// Average client connection latency reported by client. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgConnectionTime *float64 `json:"avg_connection_time,omitempty"`

	// Average domain lookup latency reported by client. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgDNSLookupTime *float64 `json:"avg_dns_lookup_time,omitempty"`

	// Average Dom content Load Time reported by clients. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgDomContentLoadTime *float64 `json:"avg_dom_content_load_time,omitempty"`

	// Rate of HTTP error responses sent per second. It does not include errors excluded in analytics profile. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgErrorResponses *float64 `json:"avg_error_responses,omitempty"`

	// Rate of HTTP responses excluded as errors based on analytics profile. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgErrorsExcluded *float64 `json:"avg_errors_excluded,omitempty"`

	// Avg number of HTTP requests that completed within frustrated latency. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgFrustratedResponses *float64 `json:"avg_frustrated_responses,omitempty"`

	// Average size of HTTP headers per request. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgHTTPHeadersBytes *float64 `json:"avg_http_headers_bytes,omitempty"`

	// Average number of HTTP headers per request. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgHTTPHeadersCount *float64 `json:"avg_http_headers_count,omitempty"`

	// Average number of HTTP request parameters per request. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgHTTPParamsCount *float64 `json:"avg_http_params_count,omitempty"`

	// Average Page Load time reported by clients. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgPageDownloadTime *float64 `json:"avg_page_download_time,omitempty"`

	// Average Page Load Time reported by client. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgPageLoadTime *float64 `json:"avg_page_load_time,omitempty"`

	// Average number of HTTP request parameters per request, taking into account only requests with parameters. Field introduced in 17.2.12, 18.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgParamsPerReq *float64 `json:"avg_params_per_req,omitempty"`

	// Average size of HTTP POST request. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgPostBytes *float64 `json:"avg_post_bytes,omitempty"`

	// Average post compression bytes. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgPostCompressionBytes *float64 `json:"avg_post_compression_bytes,omitempty"`

	// Average pre compression bytes. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgPreCompressionBytes *float64 `json:"avg_pre_compression_bytes,omitempty"`

	// Average redirect latency reported by client. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgRedirectionTime *float64 `json:"avg_redirection_time,omitempty"`

	// Average requests per session measured for closed sessions. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgReqsPerSession *float64 `json:"avg_reqs_per_session,omitempty"`

	// Rate of 1xx HTTP responses sent per second. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgResp1xx *float64 `json:"avg_resp_1xx,omitempty"`

	// Rate of 2xx HTTP responses sent per second. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgResp2xx *float64 `json:"avg_resp_2xx,omitempty"`

	// Rate of 3xx HTTP responses sent per second. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgResp3xx *float64 `json:"avg_resp_3xx,omitempty"`

	// Rate of 4xx HTTP responses sent per second. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgResp4xx *float64 `json:"avg_resp_4xx,omitempty"`

	// Rate of 4xx HTTP responses as errors sent by avi. It does not include any error codes excluded in the analytics profile and pool server errors. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgResp4xxAviErrors *float64 `json:"avg_resp_4xx_avi_errors,omitempty"`

	// Rate of 5xx HTTP responses sent per second. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgResp5xx *float64 `json:"avg_resp_5xx,omitempty"`

	// Rate of 5xx HTTP responses as errors sent by avi. It does not include any error codes excluded in the analytics profile and pool server errors. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgResp5xxAviErrors *float64 `json:"avg_resp_5xx_avi_errors,omitempty"`

	// Total client data transfer time by client. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgRumClientDataTransferTime *float64 `json:"avg_rum_client_data_transfer_time,omitempty"`

	// Avg number of HTTP requests that completed within satisfactory latency. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSatisfactoryResponses *float64 `json:"avg_satisfactory_responses,omitempty"`

	// Average server Round Trip Time. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgServerRtt *float64 `json:"avg_server_rtt,omitempty"`

	// Average latency from receipt of request to start of response. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgServiceTime *float64 `json:"avg_service_time,omitempty"`

	// Average SSL Sessions using DSA certificate. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslAuthDsa *float64 `json:"avg_ssl_auth_dsa,omitempty"`

	// Average SSL Sessions using Elliptic Curve DSA (ECDSA) certificates. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslAuthEcdsa *float64 `json:"avg_ssl_auth_ecdsa,omitempty"`

	// Average SSL Sessions using mldsa44 certificate. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AvgSslAuthMldsa44 *float64 `json:"avg_ssl_auth_mldsa44,omitempty"`

	// Average SSL Sessions using mldsa65 certificate. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AvgSslAuthMldsa65 *float64 `json:"avg_ssl_auth_mldsa65,omitempty"`

	// Average SSL Sessions using mldsa87 certificate. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AvgSslAuthMldsa87 *float64 `json:"avg_ssl_auth_mldsa87,omitempty"`

	// Average SSL Sessions using RSA certificate. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslAuthRsa *float64 `json:"avg_ssl_auth_rsa,omitempty"`

	// Average SSL Sessions. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslConnections *float64 `json:"avg_ssl_connections,omitempty"`

	// Average SSL Exchanges using EC Cerificates without PFS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslEcdsaNonPfs *float64 `json:"avg_ssl_ecdsa_non_pfs,omitempty"`

	// Average SSL Exchanges using EC Cerificates and PFS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslEcdsaPfs *float64 `json:"avg_ssl_ecdsa_pfs,omitempty"`

	// Average SSL errors due to clients, protocol errors,network errors and handshake timeouts. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslErrors *float64 `json:"avg_ssl_errors,omitempty"`

	// Average SSL connections failed due to protocol , network or timeout reasons. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslFailedConnections *float64 `json:"avg_ssl_failed_connections,omitempty"`

	// Average SSL handshakes failed due to network errors. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslHandshakeNetworkErrors *float64 `json:"avg_ssl_handshake_network_errors,omitempty"`

	// Average SSL handshake failed due to clients or protocol errors. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslHandshakeProtocolErrors *float64 `json:"avg_ssl_handshake_protocol_errors,omitempty"`

	// Average new successful SSL sessions. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslHandshakesNew *float64 `json:"avg_ssl_handshakes_new,omitempty"`

	// Average SSL Exchanges using Non-PFS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslHandshakesNonPfs *float64 `json:"avg_ssl_handshakes_non_pfs,omitempty"`

	// Average SSL Exchanges using PFS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslHandshakesPfs *float64 `json:"avg_ssl_handshakes_pfs,omitempty"`

	// Average new successful resumed SSL sessions. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslHandshakesReused *float64 `json:"avg_ssl_handshakes_reused,omitempty"`

	// Average SSL handshakes timed out. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslHandshakesTimedout *float64 `json:"avg_ssl_handshakes_timedout,omitempty"`

	// Average SSL Exchanges using Diffie-Hellman. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslKxDh *float64 `json:"avg_ssl_kx_dh,omitempty"`

	// Average SSL Exchanges using RSA. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslKxEcdh *float64 `json:"avg_ssl_kx_ecdh,omitempty"`

	// Average SSL Exchanges using RSA. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslKxRsa *float64 `json:"avg_ssl_kx_rsa,omitempty"`

	// Average SSL Exchanges using RSA Cerificates without PFS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslRsaNonPfs *float64 `json:"avg_ssl_rsa_non_pfs,omitempty"`

	// Average SSL Exchanges using RSA Cerificates and PFS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslRsaPfs *float64 `json:"avg_ssl_rsa_pfs,omitempty"`

	// Average SSL Sessions with version 3.0. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslVerSsl30 *float64 `json:"avg_ssl_ver_ssl30,omitempty"`

	// Average SSL Sessions with TLS version 1.0. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslVerTLS10 *float64 `json:"avg_ssl_ver_tls10,omitempty"`

	// Average SSL Sessions with TLS version 1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslVerTLS11 *float64 `json:"avg_ssl_ver_tls11,omitempty"`

	// Average SSL Sessions with TLS version 1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslVerTLS12 *float64 `json:"avg_ssl_ver_tls12,omitempty"`

	// Average SSL Sessions with TLS version 1.3. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgSslVerTLS13 *float64 `json:"avg_ssl_ver_tls13,omitempty"`

	// Avg number of HTTP requests that completed within tolerated latency. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgToleratedResponses *float64 `json:"avg_tolerated_responses,omitempty"`

	// Average number of client HTTP2 requests received by the Virtual Service per second. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgTotalHttp2Requests *float64 `json:"avg_total_http2_requests,omitempty"`

	// Average rate of client HTTP requests received by the virtual service per second. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgTotalRequests *float64 `json:"avg_total_requests,omitempty"`

	// Average length of HTTP URI per request. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgURILength *float64 `json:"avg_uri_length,omitempty"`

	// Average number of transactions per second identified by WAF as attacks. Field introduced in 17.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafAttacks *float64 `json:"avg_waf_attacks,omitempty"`

	// Average number of transactions per second bypassing WAF. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafDisabled *float64 `json:"avg_waf_disabled,omitempty"`

	// Average number of transactions per second evaluated by WAF. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafEvaluated *float64 `json:"avg_waf_evaluated,omitempty"`

	// Average number of requests per second evaluated by WAF in Request Body Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafEvaluatedRequestBodyPhase *float64 `json:"avg_waf_evaluated_request_body_phase,omitempty"`

	// Average number of requests per second evaluated by WAF in Request Header Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafEvaluatedRequestHeaderPhase *float64 `json:"avg_waf_evaluated_request_header_phase,omitempty"`

	// Average number of responses per second evaluated by WAF in Response Body Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafEvaluatedResponseBodyPhase *float64 `json:"avg_waf_evaluated_response_body_phase,omitempty"`

	// Average number of responsess per second evaluated by WAF in Response Header Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafEvaluatedResponseHeaderPhase *float64 `json:"avg_waf_evaluated_response_header_phase,omitempty"`

	// Average number of transactions per second flagged by WAF. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafFlagged *float64 `json:"avg_waf_flagged,omitempty"`

	// Average number of requests per second flagged (but not rejected) by WAF in Request Body Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafFlaggedRequestBodyPhase *float64 `json:"avg_waf_flagged_request_body_phase,omitempty"`

	// Average number of requests per second flagged (but not rejected) by WAF in Request Header Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafFlaggedRequestHeaderPhase *float64 `json:"avg_waf_flagged_request_header_phase,omitempty"`

	// Average number of responses per second flagged (but not rejected) by WAF in Response Body Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafFlaggedResponseBodyPhase *float64 `json:"avg_waf_flagged_response_body_phase,omitempty"`

	// Average number of responses per second flagged (but not rejected) by WAF in Response Header Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafFlaggedResponseHeaderPhase *float64 `json:"avg_waf_flagged_response_header_phase,omitempty"`

	// Average waf latency seen due to WAF Request Body processing. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafLatencyRequestBodyPhase *float64 `json:"avg_waf_latency_request_body_phase,omitempty"`

	// Average waf latency seen due to WAF Request Header processing. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafLatencyRequestHeaderPhase *float64 `json:"avg_waf_latency_request_header_phase,omitempty"`

	// Average waf latency seen due to WAF Response Body processing. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafLatencyResponseBodyPhase *float64 `json:"avg_waf_latency_response_body_phase,omitempty"`

	// Average waf latency seen due to WAF Response Header processing. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafLatencyResponseHeaderPhase *float64 `json:"avg_waf_latency_response_header_phase,omitempty"`

	// Average number of transactions per second matched by WAF rule/rules. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafMatched *float64 `json:"avg_waf_matched,omitempty"`

	// Average number of requests per second matched by WAF in Request Body Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafMatchedRequestBodyPhase *float64 `json:"avg_waf_matched_request_body_phase,omitempty"`

	// Average number of requests per second matched by WAF in Request Header Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafMatchedRequestHeaderPhase *float64 `json:"avg_waf_matched_request_header_phase,omitempty"`

	// Average number of responses per second matched by WAF in Response Body Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafMatchedResponseBodyPhase *float64 `json:"avg_waf_matched_response_body_phase,omitempty"`

	// Average number of responses per second matched by WAF in Response Header Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafMatchedResponseHeaderPhase *float64 `json:"avg_waf_matched_response_header_phase,omitempty"`

	// Average number of transactions per second rejected by WAF. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafRejected *float64 `json:"avg_waf_rejected,omitempty"`

	// Average number of requests per second rejected by WAF in Request Body Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafRejectedRequestBodyPhase *float64 `json:"avg_waf_rejected_request_body_phase,omitempty"`

	// Average number of requests per second rejected by WAF in Request Header Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafRejectedRequestHeaderPhase *float64 `json:"avg_waf_rejected_request_header_phase,omitempty"`

	// Average number of responses per second rejected by WAF in Response Body Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafRejectedResponseBodyPhase *float64 `json:"avg_waf_rejected_response_body_phase,omitempty"`

	// Average number of responses per second rejected by WAF in Response Header Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWafRejectedResponseHeaderPhase *float64 `json:"avg_waf_rejected_response_header_phase,omitempty"`

	// Average Waiting Time reported by client. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AvgWaitingTime *float64 `json:"avg_waiting_time,omitempty"`

	// The effective sampling rate, i.e., the percentage of optional requests admitted. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EffectiveSamplingRate *float64 `json:"effective_sampling_rate,omitempty"`

	// Maximum number of concurrent HTTP sessions. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxConcurrentSessions *float64 `json:"max_concurrent_sessions,omitempty"`

	// Maximum number of open SSL sessions. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxSslOpenSessions *float64 `json:"max_ssl_open_sessions,omitempty"`

	// Max rate of client HTTP requests received by the virtual service per second. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxTotalRequests *float64 `json:"max_total_requests,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NodeObjID *string `json:"node_obj_id"`

	// Percentage cache hit of requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PctCacheHits *float64 `json:"pct_cache_hits,omitempty"`

	// Percentage cacheable hit of requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PctCacheableHits *float64 `json:"pct_cacheable_hits,omitempty"`

	// Number of HTTP GET requests as a percentage of total requests received. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PctGetReqs *float64 `json:"pct_get_reqs,omitempty"`

	// Number of HTTP POST requests as a percentage of total requests received. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PctPostReqs *float64 `json:"pct_post_reqs,omitempty"`

	// Percent of 4xx and 5xx responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PctResponseErrors *float64 `json:"pct_response_errors,omitempty"`

	// Percent of SSL connections failured due to protocol , network or timeout reasons. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PctSslFailedConnections *float64 `json:"pct_ssl_failed_connections,omitempty"`

	// Malicious transactions (Attacks) identified by WAF as the pecentage  of total requests received. Field introduced in 17.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PctWafAttacks *float64 `json:"pct_waf_attacks,omitempty"`

	// Transactions bypassing WAF as the percentage of total requests received. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PctWafDisabled *float64 `json:"pct_waf_disabled,omitempty"`

	// WAF evaluated transactions as the pecentage of total requests received. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PctWafEvaluated *float64 `json:"pct_waf_evaluated,omitempty"`

	// WAF flagged transactions as the percentage of total WAF evaluated transactions. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PctWafFlagged *float64 `json:"pct_waf_flagged,omitempty"`

	// WAF matched requests as the percentage of total WAF evaluated requests. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PctWafMatched *float64 `json:"pct_waf_matched,omitempty"`

	// WAF rejected transactions as the percentage of total WAF evaluated transactions. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PctWafRejected *float64 `json:"pct_waf_rejected,omitempty"`

	// Apdex measures quality of server response based on Real User Metric. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RumApdexr *float64 `json:"rum_apdexr,omitempty"`

	// Protocol strength of SSL ciphers used. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslProtocolStrength *float64 `json:"ssl_protocol_strength,omitempty"`

	// Total time taken by server to respond to requesti. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumApplicationResponseTime *float64 `json:"sum_application_response_time,omitempty"`

	// Total time client was blocked. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumBlockingTime *float64 `json:"sum_blocking_time,omitempty"`

	// Total browser rendering latency reported by client. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumBrowserRenderingTime *float64 `json:"sum_browser_rendering_time,omitempty"`

	// Average client data transfer time computed by adding response latencies across all HTTP requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumClientDataTransferTime *float64 `json:"sum_client_data_transfer_time,omitempty"`

	// Sum of all client Round Trip Times for all samples. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumClientRtt *float64 `json:"sum_client_rtt,omitempty"`

	// Total client connection latency reported by client. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumConnectionTime *float64 `json:"sum_connection_time,omitempty"`

	// Total domain lookup latency reported by client. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumDNSLookupTime *float64 `json:"sum_dns_lookup_time,omitempty"`

	// Total dom content latency reported by client. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumDomContentLoadTime *float64 `json:"sum_dom_content_load_time,omitempty"`

	// Count of HTTP 400 and 500 errors for a virtual service in a time interval. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumErrors *float64 `json:"sum_errors,omitempty"`

	// Number of server sessions closed in this interval. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumFinishedSessions *float64 `json:"sum_finished_sessions,omitempty"`

	// Total latency from responses to all the GET requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumGetClientTxnLatency *float64 `json:"sum_get_client_txn_latency,omitempty"`

	// Total number of HTTP GET requests that were responded satisfactorily within latency threshold. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumGetClientTxnLatencyBucket1 *float64 `json:"sum_get_client_txn_latency_bucket1,omitempty"`

	// Total number of HTTP GET requests that were responded beyond latency threshold but within tolerated limits. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumGetClientTxnLatencyBucket2 *float64 `json:"sum_get_client_txn_latency_bucket2,omitempty"`

	// Total number of HTTP GET requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumGetReqs *float64 `json:"sum_get_reqs,omitempty"`

	// Total size of HTTP request headers. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumHTTPHeadersBytes *float64 `json:"sum_http_headers_bytes,omitempty"`

	// Total number of HTTP headers across all requests in a given metrics interval. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumHTTPHeadersCount *float64 `json:"sum_http_headers_count,omitempty"`

	// Total number of HTTP request parameters. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumHTTPParamsCount *float64 `json:"sum_http_params_count,omitempty"`

	// The number of requests admitted for optional processing. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SumNumOptionalProcessingAdmitted *float64 `json:"sum_num_optional_processing_admitted,omitempty"`

	// The number of requests refused for optional processing. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SumNumOptionalProcessingRefused *float64 `json:"sum_num_optional_processing_refused,omitempty"`

	// Total samples that had satisfactory page load time. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumNumPageLoadTimeBucket1 *float64 `json:"sum_num_page_load_time_bucket1,omitempty"`

	// Total samples that had tolerated page load time. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumNumPageLoadTimeBucket2 *float64 `json:"sum_num_page_load_time_bucket2,omitempty"`

	// Total samples used for rum metrics. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumNumRumSamples *float64 `json:"sum_num_rum_samples,omitempty"`

	// Total CPU in microseconds used for optional processing. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SumOptionalCPUUsage *float64 `json:"sum_optional_cpu_usage,omitempty"`

	// Total latency from responses to all the requests other than GET or POST. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumOtherClientTxnLatency *float64 `json:"sum_other_client_txn_latency,omitempty"`

	// Total number of HTTP requests other than GET or POST that were responded satisfactorily within latency threshold. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumOtherClientTxnLatencyBucket1 *float64 `json:"sum_other_client_txn_latency_bucket1,omitempty"`

	// Total number of HTTP requests other than GET or POST that were responded beyond latency threshold but within tolerated limits. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumOtherClientTxnLatencyBucket2 *float64 `json:"sum_other_client_txn_latency_bucket2,omitempty"`

	// Total number of HTTP requests that are not GET or POST requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumOtherReqs *float64 `json:"sum_other_reqs,omitempty"`

	// Total time to transfer response to client. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumPageDownloadTime *float64 `json:"sum_page_download_time,omitempty"`

	// Total Page Load Time reported by client. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumPageLoadTime *float64 `json:"sum_page_load_time,omitempty"`

	// Total size of HTTP POST requests. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumPostBytes *float64 `json:"sum_post_bytes,omitempty"`

	// Total latency from responses to all the POST requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumPostClientTxnLatency *float64 `json:"sum_post_client_txn_latency,omitempty"`

	// Total number of HTTP POST requests that were responded satisfactorily within latency threshold. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumPostClientTxnLatencyBucket1 *float64 `json:"sum_post_client_txn_latency_bucket1,omitempty"`

	// Total number of HTTP POST requests that were responded beyond latency threshold but within tolerated limits. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumPostClientTxnLatencyBucket2 *float64 `json:"sum_post_client_txn_latency_bucket2,omitempty"`

	// Total number of HTTP POST requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumPostReqs *float64 `json:"sum_post_reqs,omitempty"`

	// Total redirect latency reported by client. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumRedirectionTime *float64 `json:"sum_redirection_time,omitempty"`

	// Total number of requests served across server sessions closed in the interval. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumReqsFinishedSessions *float64 `json:"sum_reqs_finished_sessions,omitempty"`

	// Total number of HTTP requests containing at least one parameter. Field introduced in 17.2.12, 18.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumReqsWithParams *float64 `json:"sum_reqs_with_params,omitempty"`

	// Total number of HTTP 1XX responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumResp1xx *float64 `json:"sum_resp_1xx,omitempty"`

	// Total number of HTTP 2XX responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumResp2xx *float64 `json:"sum_resp_2xx,omitempty"`

	// Total number of HTTP 3XX responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumResp3xx *float64 `json:"sum_resp_3xx,omitempty"`

	// Total number of HTTP 4XX error responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumResp4xx *float64 `json:"sum_resp_4xx,omitempty"`

	// Total number of HTTP 5XX error responses. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumResp5xx *float64 `json:"sum_resp_5xx,omitempty"`

	// Total client data transfer time by client. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumRumClientDataTransferTime *float64 `json:"sum_rum_client_data_transfer_time,omitempty"`

	// Sum of all server Round Trip Times for all samples. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumServerRtt *float64 `json:"sum_server_rtt,omitempty"`

	// Total time from receipt of request to start of response. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumServiceTime *float64 `json:"sum_service_time,omitempty"`

	// Total number of HTTP responses sent. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumTotalResponses *float64 `json:"sum_total_responses,omitempty"`

	// Total length of HTTP request URIs. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumURILength *float64 `json:"sum_uri_length,omitempty"`

	// Total number of transactions identified by WAF as attacks. Field introduced in 17.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafAttacks *float64 `json:"sum_waf_attacks,omitempty"`

	// Total number of requests bypassing WAF. Field introduced in 17.2.12, 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafDisabled *float64 `json:"sum_waf_disabled,omitempty"`

	// Total number of requests evaluated by WAF in Request Body Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafEvaluatedRequestBodyPhase *float64 `json:"sum_waf_evaluated_request_body_phase,omitempty"`

	// Total number of requests evaluated by WAF in Request Header Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafEvaluatedRequestHeaderPhase *float64 `json:"sum_waf_evaluated_request_header_phase,omitempty"`

	// Total number of responses evaluated by WAF in Response Body Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafEvaluatedResponseBodyPhase *float64 `json:"sum_waf_evaluated_response_body_phase,omitempty"`

	// Total number of responses evaluated by WAF in Response Header Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafEvaluatedResponseHeaderPhase *float64 `json:"sum_waf_evaluated_response_header_phase,omitempty"`

	// Total number of transactions (requests or responses) flagged as attack by WAF. Field introduced in 17.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafFlagged *float64 `json:"sum_waf_flagged,omitempty"`

	// Total number of requests flagged (but not rejected) by WAF in Request Body Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafFlaggedRequestBodyPhase *float64 `json:"sum_waf_flagged_request_body_phase,omitempty"`

	// Total number of requests flagged (but not rejected) by WAF in Request Header Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafFlaggedRequestHeaderPhase *float64 `json:"sum_waf_flagged_request_header_phase,omitempty"`

	// Total number of responses flagged (but not rejected) by WAF in Response Body Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafFlaggedResponseBodyPhase *float64 `json:"sum_waf_flagged_response_body_phase,omitempty"`

	// Total number of responses flagged (but not rejected) by WAF in Response Header Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafFlaggedResponseHeaderPhase *float64 `json:"sum_waf_flagged_response_header_phase,omitempty"`

	// Total latency seen by all evaluated requests in Request Body Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafLatencyRequestBodyPhase *float64 `json:"sum_waf_latency_request_body_phase,omitempty"`

	// Total latency seen by all transactions evaluated by WAF in Request Header Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafLatencyRequestHeaderPhase *float64 `json:"sum_waf_latency_request_header_phase,omitempty"`

	// Total latency seen by all evaluated responses in Response Body Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafLatencyResponseBodyPhase *float64 `json:"sum_waf_latency_response_body_phase,omitempty"`

	// Total latency seen by all evaluated responsess in WAF Response Header Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafLatencyResponseHeaderPhase *float64 `json:"sum_waf_latency_response_header_phase,omitempty"`

	// Total number of requests matched by WAF in Request Body Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafMatchedRequestBodyPhase *float64 `json:"sum_waf_matched_request_body_phase,omitempty"`

	// Total number of requests matched by WAF in Request Header Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafMatchedRequestHeaderPhase *float64 `json:"sum_waf_matched_request_header_phase,omitempty"`

	// Total number of responses matched by WAF in Response Body Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafMatchedResponseBodyPhase *float64 `json:"sum_waf_matched_response_body_phase,omitempty"`

	// Total number of responses matched by WAF in Response Header Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafMatchedResponseHeaderPhase *float64 `json:"sum_waf_matched_response_header_phase,omitempty"`

	// Total number of transactions (requests or responses) rejected by WAF. Field introduced in 17.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafRejected *float64 `json:"sum_waf_rejected,omitempty"`

	// Total number of requests rejected by WAF in Request Body Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafRejectedRequestBodyPhase *float64 `json:"sum_waf_rejected_request_body_phase,omitempty"`

	// Total number of requests rejected by WAF in Request Header Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafRejectedRequestHeaderPhase *float64 `json:"sum_waf_rejected_request_header_phase,omitempty"`

	// Total number of responses rejected by WAF in Response Body Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafRejectedResponseBodyPhase *float64 `json:"sum_waf_rejected_response_body_phase,omitempty"`

	// Total number of responses rejected by WAF in Response Header Phase. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWafRejectedResponseHeaderPhase *float64 `json:"sum_waf_rejected_response_header_phase,omitempty"`

	// Total waiting reported by client. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumWaitingTime *float64 `json:"sum_waiting_time,omitempty"`
}

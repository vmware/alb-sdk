// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// L7VirtualServiceStatsRuntime l7 virtual service stats runtime
// swagger:model L7VirtualServiceStatsRuntime
type L7VirtualServiceStatsRuntime struct {

	// Number of significant logs which get pushed to the log agent. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ApplAdfHit *uint64 `json:"appl_adf_hit,omitempty"`

	// Number of significant logs dropped because of throttling. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ApplAdfLimit *uint64 `json:"appl_adf_limit,omitempty"`

	// Number of significant logs which are not pushed to the log agent. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ApplAdfMiss *uint64 `json:"appl_adf_miss,omitempty"`

	// Number of full client logs which get pushed to the log agent. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ApplNfHit *uint64 `json:"appl_nf_hit,omitempty"`

	// Number of full client logs dropped because of throttling. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ApplNfLimit *uint64 `json:"appl_nf_limit,omitempty"`

	// Number of full client logs which is not pushed to the log agent. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ApplNfMiss *uint64 `json:"appl_nf_miss,omitempty"`

	// Number of user defined logs which get pushed to the log agent. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ApplUdfHit *uint64 `json:"appl_udf_hit,omitempty"`

	// Number of user defined logs dropped because of throttling. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ApplUdfLimit *uint64 `json:"appl_udf_limit,omitempty"`

	// Number of user defined logs which are not pushed to the log agent. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ApplUdfMiss *uint64 `json:"appl_udf_miss,omitempty"`

	// Number of bytes received from the server(s). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BeBytesRxd *uint64 `json:"be_bytes_rxd,omitempty"`

	// Number of bytes sent to the server(s). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BeBytesSent *uint64 `json:"be_bytes_sent,omitempty"`

	// Number of bytes served from the cache on each cache hit. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	CacheBytes *uint64 `json:"cache_bytes"`

	// Number of cache hits, i.e. number of requests where objects were served from the Avi cache instead of the backend. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	CacheHits *uint64 `json:"cache_hits"`

	// Number of connections handled. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnectionsHandled *uint64 `json:"connections_handled"`

	// Number of dropped requests due to connection being closed or reset. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DroppedRequests *uint64 `json:"dropped_requests,omitempty"`

	// Number of bytes received from the client(s). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FeBytesRxd *uint64 `json:"fe_bytes_rxd,omitempty"`

	// Number of bytes sent to the client(s). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FeBytesSent *uint64 `json:"fe_bytes_sent,omitempty"`

	// Number of HTTP/2 compression errors detected. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2CompressionErrors *uint64 `json:"http2_compression_errors,omitempty"`

	// Number of HTTP/2 control frame floods detected. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2ControlFrameFloodErrors *uint64 `json:"http2_control_frame_flood_errors,omitempty"`

	// Number of HTTP/2 emtpy frame floods detected. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2EmptyFrameFloodErrors *uint64 `json:"http2_empty_frame_flood_errors,omitempty"`

	// Number of HTTP/2 'Enhance your calm' (processing capacity has exceeded) errors detected. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2EnhanceYourCalm *uint64 `json:"http2_enhance_your_calm,omitempty"`

	// Number of HTTP/2 flow control errors detected. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2FlowControlErrors *uint64 `json:"http2_flow_control_errors,omitempty"`

	// Number of HTTP/2 invalid frame size errors detected. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2FrameSizeErrors *uint64 `json:"http2_frame_size_errors,omitempty"`

	// Number of HTTP/2 miscellaneous errors detected. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2MiscellaneousErrors *uint64 `json:"http2_miscellaneous_errors,omitempty"`

	// Number of HTTP/2 protocol errors detected. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2ProtocolErrors *uint64 `json:"http2_protocol_errors,omitempty"`

	// Number of HTTP/2 data frame floods detected. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2QueuedFramesFloodErrors *uint64 `json:"http2_queued_frames_flood_errors,omitempty"`

	// Number of HTTP/2 refused frame floods detected. Field introduced in 30.1.2, 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2RefusedFrameFloodErrors *uint64 `json:"http2_refused_frame_flood_errors,omitempty"`

	// Number of HTTP/2 refused stream errors detected. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2RefusedStreamErrors *uint64 `json:"http2_refused_stream_errors,omitempty"`

	// Number of HTTP/2 requests handled. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2RequestsHandled *uint64 `json:"http2_requests_handled,omitempty"`

	// Number of HTTP/2 reset frame floods detected. Field introduced in 30.1.2, 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2ResetFrameFloodErrors *uint64 `json:"http2_reset_frame_flood_errors,omitempty"`

	// Number of responses with a status code of 2XX (Success) received over HTTP/2. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2Response2xx *uint64 `json:"http2_response_2xx,omitempty"`

	// Number of responses with a status code of 3XX (Redirection) received over HTTP/2. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2Response3xx *uint64 `json:"http2_response_3xx,omitempty"`

	// Number of responses with a status code of 4XX (Client error) received over HTTP/2. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2Response4xx *uint64 `json:"http2_response_4xx,omitempty"`

	// Number of responses with a status code of 5XX (Server error) received over HTTP/2. Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2Response5xx *uint64 `json:"http2_response_5xx,omitempty"`

	// Number of HTTP/2 trailers received. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2TrailersReceived *uint64 `json:"http2_trailers_received,omitempty"`

	// Number of invalid HTTP/1.x requests received on this Virtual Service. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InvalidHttpv1Requests *uint64 `json:"invalid_httpv1_requests,omitempty"`

	// Number of invalid HTTP/2 requests received on this Virtual Service. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InvalidHttpv2Requests *uint64 `json:"invalid_httpv2_requests,omitempty"`

	// Number of requests with algorithm mismatch. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	JwtAlgMismatch *uint64 `json:"jwt_alg_mismatch,omitempty"`

	// Number of requests with audience mismatch. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	JwtAudMismatch *uint64 `json:"jwt_aud_mismatch,omitempty"`

	// Number of requests for which JWT verification failed. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	JwtAuthFailure *uint64 `json:"jwt_auth_failure,omitempty"`

	// Number of requests with an invalid token. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	JwtAuthInvalidToken *uint64 `json:"jwt_auth_invalid_token,omitempty"`

	// Number of JWT validation requests. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	JwtAuthRequests *uint64 `json:"jwt_auth_requests,omitempty"`

	// Number of requests with successfully verified JWT. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	JwtAuthSuccess *uint64 `json:"jwt_auth_success,omitempty"`

	// Number of requests failed due to absence of mandatory claims. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	JwtClaimAbsent *uint64 `json:"jwt_claim_absent,omitempty"`

	// Number of requests failed while importing token into a json object. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	JwtImportJSONFailure *uint64 `json:"jwt_import_json_failure,omitempty"`

	// Number of requests with an invalid JWT header. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	JwtInvalidHeader *uint64 `json:"jwt_invalid_header,omitempty"`

	// Number of requests with an invalid KID. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	JwtInvalidKid *uint64 `json:"jwt_invalid_kid,omitempty"`

	// Number of requests with an invalid JWT payload. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	JwtInvalidPayload *uint64 `json:"jwt_invalid_payload,omitempty"`

	// Number of requests with signature verification failure. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	JwtInvalidSignature *uint64 `json:"jwt_invalid_signature,omitempty"`

	// Number of requests with issuer mismatch. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	JwtIssMismatch *uint64 `json:"jwt_iss_mismatch,omitempty"`

	// Number of Oauth requests with sub claim not present in the access token. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	JwtSubUnavailable *uint64 `json:"jwt_sub_unavailable,omitempty"`

	// Number of requests without a JWT. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	JwtUnavailable *uint64 `json:"jwt_unavailable,omitempty"`

	// Number of OAuth Introspection responses. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthAccessTokenInactive *uint64 `json:"oauth_access_token_inactive,omitempty"`

	// Number of Authenticated OAuth requests. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthAuthRequests *uint64 `json:"oauth_auth_requests,omitempty"`

	// Number of OAuth Client - IDP redirects for three way handshake. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthClientIdpRedirects *uint64 `json:"oauth_client_idp_redirects,omitempty"`

	// Number of OAuth code token exchange responses. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthCodeTokenExchangeFailures *uint64 `json:"oauth_code_token_exchange_failures,omitempty"`

	// Number of OAuth code token exchange requests. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthCodeTokenExchangeRequests *uint64 `json:"oauth_code_token_exchange_requests,omitempty"`

	// Number of OAuth code token exchange responses. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthCodeTokenExchangeResponses *uint64 `json:"oauth_code_token_exchange_responses,omitempty"`

	// Number of OAuth requests with cookie decode errors. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthCookieDecodeError *uint64 `json:"oauth_cookie_decode_error,omitempty"`

	// Number of OAuth requests with cookie decrypt errors. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthCookieDecryptError *uint64 `json:"oauth_cookie_decrypt_error,omitempty"`

	// Number of OAuth requests where the key to decode the cookie is not found. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthCookieKeyNotFound *uint64 `json:"oauth_cookie_key_not_found,omitempty"`

	// Number of OAuth requests with corrupted cookie. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthCorruptedCookie *uint64 `json:"oauth_corrupted_cookie,omitempty"`

	// Number of OAuth introspection data cache hits. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthIntrospectionCacheHits *uint64 `json:"oauth_introspection_cache_hits,omitempty"`

	// Number of OAuth introspection data save operations. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthIntrospectionDataSave *uint64 `json:"oauth_introspection_data_save,omitempty"`

	// Number of OAuth Introspection requests. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthIntrospectionRequests *uint64 `json:"oauth_introspection_requests,omitempty"`

	// Number of OAuth Introspection response failures. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthIntrospectionRespFailures *uint64 `json:"oauth_introspection_resp_failures,omitempty"`

	// Number of OAuth Introspection responses. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthIntrospectionResponses *uint64 `json:"oauth_introspection_responses,omitempty"`

	// Number of OAuth requests with invalid handshake cookie. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthInvalidHandshakeCookie *uint64 `json:"oauth_invalid_handshake_cookie,omitempty"`

	// Number of OAuth requests with invalid handshake cookie with missing state information. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthInvalidHandshakeCookieMissingState *uint64 `json:"oauth_invalid_handshake_cookie_missing_state,omitempty"`

	// Number of OAuth requests with invalid handshake cookie with missing uri. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthInvalidHandshakeCookieMissingURI *uint64 `json:"oauth_invalid_handshake_cookie_missing_uri,omitempty"`

	// Number of invalid OAuth redirect responses. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthInvalidRedirectResponses *uint64 `json:"oauth_invalid_redirect_responses,omitempty"`

	// Number of OAuth requests with invalid/expired sessions. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthInvalidSessions *uint64 `json:"oauth_invalid_sessions,omitempty"`

	// Number of JWKS fetch requests. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthJwksURIRequests *uint64 `json:"oauth_jwks_uri_requests,omitempty"`

	// Number of JWKS fetch response failures. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthJwksURIRespFailures *uint64 `json:"oauth_jwks_uri_resp_failures,omitempty"`

	// Number of JWKS fetch responses. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthJwksURIResponses *uint64 `json:"oauth_jwks_uri_responses,omitempty"`

	// Number of OAuth JWT access token audience mismatch. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthJwtAudMismatch *uint64 `json:"oauth_jwt_aud_mismatch,omitempty"`

	// Number of OAuth logout request failures. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthLogoutFailures *uint64 `json:"oauth_logout_failures,omitempty"`

	// Number of Oauth requests with at_hash verification failures of ID Token. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthOidcAtHashVerificationFailures *uint64 `json:"oauth_oidc_at_hash_verification_failures,omitempty"`

	// Number of OAuth oidc token validation failures. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthOidcValidationFailures *uint64 `json:"oauth_oidc_validation_failures,omitempty"`

	// Number of OAuth redirect responses where code is not availble. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthRedirectRespCodeUnavailable *uint64 `json:"oauth_redirect_resp_code_unavailable,omitempty"`

	// Number of OAuth redirect responses with state mismatch. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthRedirectRespStateMismatch *uint64 `json:"oauth_redirect_resp_state_mismatch,omitempty"`

	// Number of OAuth redirect responses where state is not available. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthRedirectRespStateUnavailable *uint64 `json:"oauth_redirect_resp_state_unavailable,omitempty"`

	// Number of OAuth redirect response with code. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthRedirectRespWithCode *uint64 `json:"oauth_redirect_resp_with_code,omitempty"`

	// Number of OAuth requests. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthRequests *uint64 `json:"oauth_requests,omitempty"`

	// Number of OAuth Objsync session creation failures. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthSessionCreateFailures *uint64 `json:"oauth_session_create_failures,omitempty"`

	// Number of OAuth Objsync sessions created. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthSessionsCreated *uint64 `json:"oauth_sessions_created,omitempty"`

	// Number of OAuth token refresh requests. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthTokenRefreshRequests *uint64 `json:"oauth_token_refresh_requests,omitempty"`

	// Number of OAuth token refresh response failures. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthTokenRefreshRespFailures *uint64 `json:"oauth_token_refresh_resp_failures,omitempty"`

	// Number of OAuth token refresh responses. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthTokenRefreshResponses *uint64 `json:"oauth_token_refresh_responses,omitempty"`

	// Number of OAuth unauthenticated requests. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthUnauthRequests *uint64 `json:"oauth_unauth_requests,omitempty"`

	// Number of OAuth userinfo requests. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthUserinfoRequests *uint64 `json:"oauth_userinfo_requests,omitempty"`

	// Number of OAuth userinfo failures. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthUserinfoRespFailures *uint64 `json:"oauth_userinfo_resp_failures,omitempty"`

	// Number of OAuth userinfo responses. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OauthUserinfoResponses *uint64 `json:"oauth_userinfo_responses,omitempty"`

	// Number of open requests on this Virtual Service. Field introduced in 18.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OpenRequests *uint64 `json:"open_requests,omitempty"`

	// Number of requests that were rejected with 403 while authenticating through PA server. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PaaAuthenticationForbidden *uint64 `json:"paa_authentication_forbidden,omitempty"`

	// Number of requests successfully authenticated through PA server. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PaaAuthenticationSuccess *uint64 `json:"paa_authentication_success,omitempty"`

	// Number of requests allowed through PingAccess Agent cache. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PaaCacheHitAllowed *uint64 `json:"paa_cache_hit_allowed,omitempty"`

	// Number of requests denied through PingAccess Agent cache. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PaaCacheHitDenied *uint64 `json:"paa_cache_hit_denied,omitempty"`

	// Number of requests that were flagged as unauthenticated by the PA server. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PaaUnauthenticatedRequest *uint64 `json:"paa_unauthenticated_request,omitempty"`

	// Number of requests for which request body is buffered. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReqBodyBufferedReqs *uint64 `json:"req_body_buffered_reqs,omitempty"`

	// Number of requests hit an error during content rewrite. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReqBodyRewriteErrors *uint64 `json:"req_body_rewrite_errors,omitempty"`

	// Number of requests for which body was rewritten. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReqBodyRewritten *uint64 `json:"req_body_rewritten,omitempty"`

	// Number of requests for which content rewrite was skipped due to compression. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReqRewriteSkippedCompression *uint64 `json:"req_rewrite_skipped_compression,omitempty"`

	// Number of requests for which content rewrite was skipped due to no content type match. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReqRewriteSkippedNoTypeMatch *uint64 `json:"req_rewrite_skipped_no_type_match,omitempty"`

	// Number of requests handled. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RequestsHandled *uint64 `json:"requests_handled"`

	// Number of requests for which response body is buffered. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RespBodyBufferedReqs *uint64 `json:"resp_body_buffered_reqs,omitempty"`

	// Number of responses hit an error during content rewrite. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RespBodyRewriteErrors *uint64 `json:"resp_body_rewrite_errors,omitempty"`

	// Number of responses for which body was rewritten. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RespBodyRewritten *uint64 `json:"resp_body_rewritten,omitempty"`

	// Number of reponses for which content rewrite was skipped due to no content type match. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RespRewriteSkippedNoTypeMatch *uint64 `json:"resp_rewrite_skipped_no_type_match,omitempty"`

	// Number of responses with status code 2XX (Successful). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Response2xx *uint64 `json:"response_2xx"`

	// Number of responses with status code 3XX (Redirection). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Response3xx *uint64 `json:"response_3xx"`

	// Number of responses with status code 4XX (Client error). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Response4xx *uint64 `json:"response_4xx"`

	// Number of responses with status code 5XX (Server error). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Response5xx *uint64 `json:"response_5xx"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RlBadCipDrop *uint64 `json:"rl_bad_cip_drop,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RlBadURIDrop *uint64 `json:"rl_bad_uri_drop,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RlCipDrop *uint64 `json:"rl_cip_drop,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RlCipDropBad *uint64 `json:"rl_cip_drop_bad,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RlCipURIDrop *uint64 `json:"rl_cip_uri_drop,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RlCipURIDropBad *uint64 `json:"rl_cip_uri_drop_bad,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RlUnknownCipDrop *uint64 `json:"rl_unknown_cip_drop,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RlUnknownURIDrop *uint64 `json:"rl_unknown_uri_drop,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RlURIDrop *uint64 `json:"rl_uri_drop,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RlURIDropBad *uint64 `json:"rl_uri_drop_bad,omitempty"`

	// Number of SAML authentication generated requests. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SamlAuthRequestGenerated *uint64 `json:"saml_auth_request_generated,omitempty"`

	// Number of SAML authentication errors due to cookie-encryption keys having been rotated out. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SamlAuthenticationCookieKeyNotFound *uint64 `json:"saml_authentication_cookie_key_not_found,omitempty"`

	// Number of received corrupted SAML cookies. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SamlAuthenticationCorruptedCookie *uint64 `json:"saml_authentication_corrupted_cookie,omitempty"`

	// Number of SAML authentication decode errors. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SamlAuthenticationDecodeError *uint64 `json:"saml_authentication_decode_error,omitempty"`

	// Number of SAML authentication decryption errors. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SamlAuthenticationDecryptError *uint64 `json:"saml_authentication_decrypt_error,omitempty"`

	// Number of SAML authentication errors. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SamlAuthenticationError *uint64 `json:"saml_authentication_error,omitempty"`

	// Number of SAML cookies which are over maximum cookie size. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SamlAuthenticationLargeCookie *uint64 `json:"saml_authentication_large_cookie,omitempty"`

	// Number of successful SAML authentications. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SamlAuthenticationSuccess *uint64 `json:"saml_authentication_success,omitempty"`

	// Number of SAML session cookies which have partialattribute values. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SamlCookieWithPartialAttributes *uint64 `json:"saml_cookie_with_partial_attributes,omitempty"`

	// Number of unauthenticated SAML GET requests. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SamlUnauthenticatedGetRequest *uint64 `json:"saml_unauthenticated_get_request,omitempty"`

	// Number of unauthenticated SAML other requests. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SamlUnauthenticatedOtherRequest *uint64 `json:"saml_unauthenticated_other_request,omitempty"`

	// Number of push requests initiated through Server Push. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerPushRequestsHandled *uint64 `json:"server_push_requests_handled,omitempty"`

	// Number of responses with a status code of 2XX (Success) received for a push request. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerPushResponse2xx *uint64 `json:"server_push_response_2xx,omitempty"`

	// Number of responses with a status code of 3XX (Redirection) received for a push request. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerPushResponse3xx *uint64 `json:"server_push_response_3xx,omitempty"`

	// Number of responses with a status code of 4XX (Client error) received for a push request. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerPushResponse4xx *uint64 `json:"server_push_response_4xx,omitempty"`

	// Number of responses with a status code of 5XX (Server error) received for a push request. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerPushResponse5xx *uint64 `json:"server_push_response_5xx,omitempty"`

	// Number of errors detected while establishing connection. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionConnectErrors *uint64 `json:"session_connect_errors,omitempty"`

	// Number of memory allocation errors on session initialization. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionInitAllocErrors *uint64 `json:"session_init_alloc_errors,omitempty"`

	// Number of network configuration errors on session initialization. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionInitConfErrors *uint64 `json:"session_init_conf_errors,omitempty"`

	// Number of memory allocation errors after establishing connection. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionPostConnectAllocErrors *uint64 `json:"session_post_connect_alloc_errors,omitempty"`

	// Number of server errors after establishing connection. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionPostConnectClientErrors *uint64 `json:"session_post_connect_client_errors,omitempty"`

	// Number of client errors after establishing connection. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionPostConnectServerErrors *uint64 `json:"session_post_connect_server_errors,omitempty"`

	// Number of network configuration errors after establishing connection. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionPostConnectSocketErrors *uint64 `json:"session_post_connect_socket_errors,omitempty"`

	// Number of memory allocation errors before establishing connection. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionPreConnectAllocErrors *uint64 `json:"session_pre_connect_alloc_errors,omitempty"`

	// Number of network configuration errors before establishing connection. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionPreConnectSocketErrors *uint64 `json:"session_pre_connect_socket_errors,omitempty"`

	// Number of logs skipped by analytics policy. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SkippedLogs *uint64 `json:"skipped_logs,omitempty"`

	// Number of times connections were closed when a VS update happened. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsUpdateConnClose *uint64 `json:"vs_update_conn_close,omitempty"`
}

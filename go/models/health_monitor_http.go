// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HealthMonitorHTTP health monitor Http
// swagger:model HealthMonitorHttp
type HealthMonitorHTTP struct {

	// Type of the authentication method. Enum options - AUTH_BASIC, AUTH_NTLM. Field introduced in 20.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AuthType *string `json:"auth_type,omitempty"`

	// Use the exact http_request *string as specified by user, without any automatic insert of headers like Host header. Field introduced in 17.1.6,17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ExactHTTPRequest *bool `json:"exact_http_request,omitempty"`

	// For HTTP2 and HTTP2S health monitor, send an HTTP request to the server. Extended with additional headers or information when exact request is marked false. For instance Host  www.site.com Connection  Close. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	HTTPHeaders []string `json:"http_headers,omitempty"`

	// HTTP method for HTTP2 and HTTP2S health monitor. Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE, HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE, HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- HTTP_METHOD_GET,HTTP_METHOD_POST,HTTP_METHOD_HEAD), Basic (Allowed values- HTTP_METHOD_GET,HTTP_METHOD_POST,HTTP_METHOD_HEAD) edition.
	HTTPMethod *string `json:"http_method,omitempty"`

	// Send an HTTP request to the server.  The default GET / HTTP/1.0 may be extended with additional headers or information.  For instance, GET /index.htm HTTP/1.1 Host  www.site.com Connection  Close. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPRequest *string `json:"http_request,omitempty"`

	// HTTP request body. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPRequestBody *string `json:"http_request_body,omitempty"`

	// HTTP client request header path for HTTP2 and HTTP2S health monitor. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	HTTPRequestHeaderPath *string `json:"http_request_header_path,omitempty"`

	// Match for a keyword in the first 2Kb of the server header and body response. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPResponse *string `json:"http_response,omitempty"`

	// List of HTTP response codes to match as successful.  Default is 2xx. Enum options - HTTP_ANY, HTTP_1XX, HTTP_2XX, HTTP_3XX, HTTP_4XX, HTTP_5XX. Minimum of 1 items required. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPResponseCode []string `json:"http_response_code,omitempty"`

	// Match or look for this HTTP response code indicating server maintenance.  A successful match results in the server being marked down. Allowed values are 101-599. Maximum of 4 items allowed. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaintenanceCode []int64 `json:"maintenance_code,omitempty,omitempty"`

	// Match or look for this keyword in the first 2KB of server header and body response indicating server maintenance.  A successful match results in the server being marked down. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaintenanceResponse *string `json:"maintenance_response,omitempty"`

	// Expected http/https response page size. Allowed values are 2048-16384. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResponseSize *uint32 `json:"response_size,omitempty"`

	// SSL attributes for HTTPS health monitor. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslAttributes *HealthMonitorSSlattributes `json:"ssl_attributes,omitempty"`
}

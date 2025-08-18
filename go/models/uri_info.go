// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// URIInfo URI info
// swagger:model URIInfo
type URIInfo struct {

	// The HTTP method. Together with name and parser it describes the HTTP endpoint. Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE, HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE, HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Method *string `json:"method,omitempty"`

	// Information about various params under a URI. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ParamInfo []*ParamInfo `json:"param_info,omitempty"`

	// The Parser used to parse the request body. Together with name and method it describes the HTTP endpoint. If there was no parser, for example on a GET request, this is set to WAF_REQUEST_PARSER_DO_NOT_PARSE. Enum options - WAF_REQUEST_PARSER_URLENCODED, WAF_REQUEST_PARSER_MULTIPART, WAF_REQUEST_PARSER_JSON, WAF_REQUEST_PARSER_XML, WAF_REQUEST_PARSER_HANDLE_AS_STRING, WAF_REQUEST_PARSER_DO_NOT_PARSE, WAF_REQUEST_PARSER_AUTO_DETECT. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Parser *string `json:"parser,omitempty"`

	// Total number of URI hits. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	URIHits *uint64 `json:"uri_hits,omitempty"`

	// URI name. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	URIKey *string `json:"uri_key,omitempty"`
}

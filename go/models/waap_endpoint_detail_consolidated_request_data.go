// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WaapEndpointDetailConsolidatedRequestData waap endpoint detail consolidated request data
// swagger:model WaapEndpointDetailConsolidatedRequestData
type WaapEndpointDetailConsolidatedRequestData struct {

	// Request content type as a WafRequestParser enum value. Enum options - WAF_REQUEST_PARSER_URLENCODED, WAF_REQUEST_PARSER_MULTIPART, WAF_REQUEST_PARSER_JSON, WAF_REQUEST_PARSER_XML, WAF_REQUEST_PARSER_HANDLE_AS_STRING, WAF_REQUEST_PARSER_DO_NOT_PARSE, WAF_REQUEST_PARSER_AUTO_DETECT. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ContentType *string `json:"content_type,omitempty"`

	// Extended request content type as a ContentType enum value with more granular types. Enum options - CONTENT_TYPE_UNKNOWN, CONTENT_TYPE_APPLICATION_JSON, CONTENT_TYPE_APPLICATION_XML, CONTENT_TYPE_APPLICATION_FORM_URLENCODED, CONTENT_TYPE_APPLICATION_OCTET_STREAM, CONTENT_TYPE_APPLICATION_PDF, CONTENT_TYPE_APPLICATION_JAVASCRIPT, CONTENT_TYPE_APPLICATION_ZIP, CONTENT_TYPE_APPLICATION_GZIP, CONTENT_TYPE_APPLICATION_PROTOBUF, CONTENT_TYPE_APPLICATION_MSGPACK, CONTENT_TYPE_MULTIPART_FORM_DATA, CONTENT_TYPE_MULTIPART_MIXED, CONTENT_TYPE_MULTIPART_ALTERNATIVE, CONTENT_TYPE_TEXT_PLAIN, CONTENT_TYPE_TEXT_HTML, CONTENT_TYPE_TEXT_CSS, CONTENT_TYPE_TEXT_CSV, CONTENT_TYPE_TEXT_XML, CONTENT_TYPE_IMAGE_JPEG.... Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ExtendedContentType *string `json:"extended_content_type,omitempty"`

	// Unix timestamp (seconds) of when this content type was last updated. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastUpdated *int64 `json:"last_updated,omitempty"`

	// Request parameters observed for this content type. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Params []*WaapEndpointDetailConsolidatedParam `json:"params,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WafMatchElementSubParser waf match element sub parser
// swagger:model WafMatchElementSubParser
type WafMatchElementSubParser struct {

	// Determine the order of the rules. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Index *uint32 `json:"index"`

	// Case sensitivity to use for the matching. Enum options - SENSITIVE, INSENSITIVE. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MatchCase *string `json:"match_case,omitempty"`

	// The match element for which a subparser can be specified. Allowed values are of the form 'ARGS name' where name can be any *string or a regular expression. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	MatchElement *string `json:"match_element"`

	// String Operation to use for matching the match element name. Allowed values are EQUALS and REGEX_MATCH. Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH, REGEX_DOES_NOT_MATCH. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MatchOp *string `json:"match_op,omitempty"`

	// Select the parser for this element. Allowed values are JSON, XML and AUTO_DETECT. Enum options - WAF_REQUEST_PARSER_URLENCODED, WAF_REQUEST_PARSER_MULTIPART, WAF_REQUEST_PARSER_JSON, WAF_REQUEST_PARSER_XML, WAF_REQUEST_PARSER_HANDLE_AS_STRING, WAF_REQUEST_PARSER_DO_NOT_PARSE, WAF_REQUEST_PARSER_AUTO_DETECT. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SubParser *string `json:"sub_parser,omitempty"`
}

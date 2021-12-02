// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RspContentRewriteRule rsp content rewrite rule
// swagger:model RspContentRewriteRule
type RspContentRewriteRule struct {

	// Enable rewrite rule on response body. Field introduced in 21.1.3.
	Enable *bool `json:"enable,omitempty"`

	// Index of the response rewrite rule. Field introduced in 21.1.3.
	Index *int32 `json:"index,omitempty"`

	// Name of the response rewrite rule. Field introduced in 21.1.3.
	Name *string `json:"name,omitempty"`

	// List of search-and-replace *string pairs for the response body. For eg. Strings 'foo' and 'bar', where all searches of 'foo' in the response body will be replaced with 'bar'. Field introduced in 21.1.3.
	Pairs []*SearchReplacePair `json:"pairs,omitempty"`
}

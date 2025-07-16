// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ReqContentRewriteRule req content rewrite rule
// swagger:model ReqContentRewriteRule
type ReqContentRewriteRule struct {

	// Enable rewrite rule on request body. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Enable *bool `json:"enable,omitempty"`

	// Index of the request rewrite rule. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Index *int32 `json:"index,omitempty"`

	// Name of the request rewrite rule. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// List of search-and-replace *string pairs for the request body. For eg. Strings 'foo' and 'bar', where all searches of 'foo' in the request body will be replaced with 'bar'. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Pairs []*SearchReplacePair `json:"pairs,omitempty"`

	// Rewrite only content types listed in this *string group. Content types not present in this list are not rewritten. It is a reference to an object of type StringGroup. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	RewritableContentRef *string `json:"rewritable_content_ref,omitempty"`
}

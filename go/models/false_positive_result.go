// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// FalsePositiveResult false positive result
// swagger:model FalsePositiveResult
type FalsePositiveResult struct {

	// Whether this URI is always fail. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	AlwaysFail *bool `json:"always_fail,omitempty"`

	// This flag indicates whether this result is identifying an attack. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	Attack *bool `json:"attack,omitempty"`

	// Confidence on false positive detection. Allowed values are 0-100. Field introduced in 21.1.1. Unit is PERCENT. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	Confidence *float32 `json:"confidence,omitempty"`

	// This flag indicates whether this result is identifying a false positive. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	FalsePositive *bool `json:"false_positive,omitempty"`

	// Header info if URI hit signature rule and match element is REQUEST_HEADERS. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	HeaderInfo *HeaderInfoInURI `json:"header_info,omitempty"`

	// HTTP method for URIs did false positive detection. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	HTTPMethod *string `json:"http_method,omitempty"`

	// This flag indicates that system is not confident about this result. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	NotSure *bool `json:"not_sure,omitempty"`

	// Params info if URI hit signature rule and match element is ARGS. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	ParamsInfo *ParamsInURI `json:"params_info,omitempty"`

	// Signature rule info hitted by URI. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	RuleInfo *RuleInfo `json:"rule_info,omitempty"`

	// Whether this URI is sometimes fail. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	SometimesFail *bool `json:"sometimes_fail,omitempty"`

	// URIs did false positive detection. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	URI *string `json:"uri,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// FalsePositiveResult false positive result
// swagger:model FalsePositiveResult
type FalsePositiveResult struct {

	// Whether this URI is always fail. Field introduced in 21.1.1.
	AlwaysFail *bool `json:"always_fail,omitempty"`

	// This flag indicates whether this result is identifying an attack. Field introduced in 21.1.1.
	Attack *bool `json:"attack,omitempty"`

	// Confidence on false positive detection. Allowed values are 0-100. Field introduced in 21.1.1. Unit is PERCENT.
	Confidence *float32 `json:"confidence,omitempty"`

	// This flag indicates whether this result is identifying a false positive. Field introduced in 21.1.1.
	FalsePositive *bool `json:"false_positive,omitempty"`

	// Header info if URI hit signature rule and match element is REQUEST_HEADERS. Field introduced in 21.1.1.
	HeaderInfo *HeaderInfoInURI `json:"header_info,omitempty"`

	// HTTP method for URIs did false positive detection. Field introduced in 21.1.1.
	HTTPMethod *string `json:"http_method,omitempty"`

	// This flag indicates that system is not confident about this result. Field introduced in 21.1.1.
	NotSure *bool `json:"not_sure,omitempty"`

	// Params info if URI hit signature rule and match element is ARGS. Field introduced in 21.1.1.
	ParamsInfo *ParamsInURI `json:"params_info,omitempty"`

	// Signature rule info hitted by URI. Field introduced in 21.1.1.
	RuleInfo *RuleInfo `json:"rule_info,omitempty"`

	// Whether this URI is sometimes fail. Field introduced in 21.1.1.
	SometimesFail *bool `json:"sometimes_fail,omitempty"`

	// URIs did false positive detection. Field introduced in 21.1.1.
	URI *string `json:"uri,omitempty"`
}

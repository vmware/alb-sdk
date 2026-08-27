// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CsrfMetrics csrf metrics
// swagger:model CsrfMetrics
type CsrfMetrics struct {

	// Number of requests for which VERIFY_CSRF_TOKEN (or VERIFY_ORIGIN_AND_CSRF_TOKEN) action was executed. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActionVerifyExecuted *uint64 `json:"action_verify_executed,omitempty"`

	// Number of requests for which CSRF protection was bypassed. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Bypassed *uint64 `json:"bypassed,omitempty"`

	// Number of requests for which a CSRF rule matched on label. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LabelMatchedRequests *uint64 `json:"label_matched_requests,omitempty"`

	// Number of requests for which csrf check passed. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Passed *uint64 `json:"passed,omitempty"`

	// Number of requests for which the CSRF policy was run. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Requests *uint64 `json:"requests,omitempty"`

	// Number of requests for which the cookie validation failed. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VerifyCookieFailed *uint64 `json:"verify_cookie_failed,omitempty"`

	// Number of requests for which the origin validation failed. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VerifyOriginFailed *uint64 `json:"verify_origin_failed,omitempty"`

	// Number of requests for which the token validation failed. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VerifyTokenFailed *uint64 `json:"verify_token_failed,omitempty"`
}

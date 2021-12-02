// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// OauthSubRequestLog oauth sub request log
// swagger:model OauthSubRequestLog
type OauthSubRequestLog struct {

	// Error code. Field introduced in 21.1.3.
	ErrorCode *string `json:"error_code,omitempty"`

	// Error description. Field introduced in 21.1.3.
	ErrorDescription *string `json:"error_description,omitempty"`

	// Subrequest info related to the Oauth flow. Field introduced in 21.1.3.
	SubRequestLog *SubRequestLog `json:"sub_request_log,omitempty"`
}

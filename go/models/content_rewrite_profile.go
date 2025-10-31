// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ContentRewriteProfile content rewrite profile
// swagger:model ContentRewriteProfile
type ContentRewriteProfile struct {

	// Content Rewrite rules to be enabled on therequest body. Field introduced in 31.2.1. Maximum of 1 items allowed. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ReqRewriteRules []*ReqContentRewriteRule `json:"req_rewrite_rules,omitempty"`

	// Content Rewrite rules to be enabled on theresponse body. Field introduced in 21.1.3. Maximum of 1 items allowed. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	RspRewriteRules []*RspContentRewriteRule `json:"rsp_rewrite_rules,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WafPolicyAllowlist waf policy allowlist
// swagger:model WafPolicyAllowlist
type WafPolicyAllowlist struct {

	// Rules to bypass WAF. Field introduced in 20.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Rules []*WafPolicyAllowlistRule `json:"rules,omitempty"`
}

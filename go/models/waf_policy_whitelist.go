// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WafPolicyWhitelist waf policy whitelist
// swagger:model WafPolicyWhitelist
type WafPolicyWhitelist struct {

	// Rules to bypass WAF. Field deprecated in 20.1.3. Field introduced in 18.2.3. Maximum of 1024 items allowed. Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	Rules []*WafPolicyWhitelistRule `json:"rules,omitempty"`
}
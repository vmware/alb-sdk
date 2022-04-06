// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AuthorizationPolicy authorization policy
// swagger:model AuthorizationPolicy
type AuthorizationPolicy struct {

	// Authorization Policy Rules. Field introduced in 18.2.5. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AuthzRules []*AuthorizationRule `json:"authz_rules,omitempty"`
}

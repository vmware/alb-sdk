// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HTTPSecurityPolicy HTTP security policy
// swagger:model HTTPSecurityPolicy
type HTTPSecurityPolicy struct {

	// Add rules to the HTTP security policy. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Rules []*HTTPSecurityRule `json:"rules,omitempty"`
}

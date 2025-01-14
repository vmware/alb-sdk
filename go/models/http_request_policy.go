// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HTTPRequestPolicy HTTP request policy
// swagger:model HTTPRequestPolicy
type HTTPRequestPolicy struct {

	// Add rules to the HTTP request policy. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Rules []*HTTPRequestRule `json:"rules,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HttpsecurityPolicy httpsecurity policy
// swagger:model HTTPSecurityPolicy
type HttpsecurityPolicy struct {

	// Add rules to the HTTP security policy. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Rules []*HttpsecurityRule `json:"rules,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SSOPolicyStats s s o policy stats
// swagger:model SSOPolicyStats
type SSOPolicyStats struct {

	//  Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthnPolicyStats *AuthNPolicyStats `json:"authn_policy_stats,omitempty"`

	// SSO Authorization Policy related stats. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthzPolicyStats *AuthZPolicyStats `json:"authz_policy_stats,omitempty"`

	//  Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`
}

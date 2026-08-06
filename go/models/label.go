// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Label A single tag applied to an API endpoint. User-defined labels can be created to organize endpoints, while built-in labels can be used to enable specific protections such as bot blocking or check deactivation.
// swagger:model Label
type Label struct {

	// Description of this label. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Defines the policy scope where this label can be used. When specified, the label is restricted to configuration within that policy type only. For example, if set to 'WafPolicy', this label can only be configured and referenced within WAF policies. Enum options - MATCH_ACTION_SCOPE_GENERIC, MATCH_ACTION_SCOPE_APIPOLICY, MATCH_ACTION_SCOPE_WAFPOLICY, MATCH_ACTION_SCOPE_HTTPSECURITYPOLICY, MATCH_ACTION_SCOPE_HTTPREQUESTPOLICY, MATCH_ACTION_SCOPE_HTTPRESPONSEPOLICY, MATCH_ACTION_SCOPE_CSRFPOLICY, MATCH_ACTION_SCOPE_AUTHPROFILE, MATCH_ACTION_SCOPE_VSDATASCRIPTSET, MATCH_ACTION_SCOPE_BOTDETECTIONPOLICY. Field introduced in 32.2.1. Minimum of 1 items required. Maximum of 1 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MatchActionScopes []string `json:"match_action_scopes,omitempty"`

	// Label name used as a match condition in policies. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// The type of this label (system-defined or user-defined). Enum options - LABEL_SYSTEM_DEFINED, LABEL_USER_DEFINED. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Type *string `json:"type,omitempty"`
}

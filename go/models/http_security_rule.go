// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HTTPSecurityRule HTTP security rule
// swagger:model HTTPSecurityRule
type HTTPSecurityRule struct {

	// Action to be performed upon successful matching. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Action *HTTPSecurityAction `json:"action,omitempty"`

	// Enable or disable the rule. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Enable *bool `json:"enable"`

	// Index of the rule. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Index *int32 `json:"index"`

	// Log HTTP request upon rule match. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Log *bool `json:"log,omitempty"`

	// Add match criteria to the rule. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Match *MatchTarget `json:"match,omitempty"`

	// Name of the rule. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`
}

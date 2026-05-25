// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIRoutingInfo Api routing info
// swagger:model ApiRoutingInfo
type APIRoutingInfo struct {

	// Header-based routing rules for API policy selection. Rules are ORed  a request matches if any rule matches. Header conditions within a rule are ANDed  all must match. Example  a rule named 'v1-route' with an HDR_EQUALS match on X-API-Version='v1' matches only requests carrying that header. Field introduced in 32.2.1. Maximum of 32 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Rules []*APIRoutingRule `json:"rules,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WaapPathTreeLabel waap path tree label
// swagger:model WaapPathTreeLabel
type WaapPathTreeLabel struct {

	// True if this label is attached directly on this endpoint (override_global_labels), overriding the ApiPolicy/label-profile-wide label set. False if inherited from that global set. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalOverride *bool `json:"local_override,omitempty"`

	// Label name. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Policy scope this label is valid for (APIPOLICY, WAFPOLICY, etc). Enum options - MATCH_ACTION_SCOPE_GENERIC, MATCH_ACTION_SCOPE_APIPOLICY, MATCH_ACTION_SCOPE_WAFPOLICY, MATCH_ACTION_SCOPE_HTTPSECURITYPOLICY, MATCH_ACTION_SCOPE_HTTPREQUESTPOLICY, MATCH_ACTION_SCOPE_HTTPRESPONSEPOLICY, MATCH_ACTION_SCOPE_CSRFPOLICY, MATCH_ACTION_SCOPE_AUTHPROFILE, MATCH_ACTION_SCOPE_VSDATASCRIPTSET, MATCH_ACTION_SCOPE_BOTDETECTIONPOLICY. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Scope *string `json:"scope,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIPolicyLabelActionMapping Api policy label action mapping
// swagger:model ApiPolicyLabelActionMapping
type APIPolicyLabelActionMapping struct {

	// List of API policy actions to run on this label. Enum options - API_POLICY_DEACTIVATE_PATH_PARAM_CHECK, API_POLICY_DEACTIVATE_QUERY_PARAM_CHECK, API_POLICY_ACTION_DEACTIVATE_HEADER_CHECK, API_POLICY_ACTION_DEACTIVATE_REQUEST_BODY_CHECK, API_POLICY_ACTION_UNKNOWN_QUERY_PARAM_PASS, API_POLICY_ACTION_UNKNOWN_QUERY_PARAM_LEARN, API_POLICY_ACTION_UNKNOWN_QUERY_PARAM_FLAG, API_POLICY_ACTION_UNKNOWN_QUERY_PARAM_REJECT, API_POLICY_ACTION_UNKNOWN_REQUEST_CONTENT_TYPE_PASS, API_POLICY_ACTION_UNKNOWN_REQUEST_CONTENT_TYPE_FLAG, API_POLICY_ACTION_UNKNOWN_REQUEST_CONTENT_TYPE_REJECT. Field introduced in 32.2.1. Maximum of 16 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	APIPolicyActions []string `json:"api_policy_actions,omitempty"`

	// Enables this label-to-action mapping. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// The name of the label. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Label *string `json:"label"`
}

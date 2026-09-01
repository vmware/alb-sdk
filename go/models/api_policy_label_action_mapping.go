// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIPolicyLabelActionMapping Mapping of a label to specific validation checks that are deactivated for matching requests, allowing selective relaxation of policy enforcement.
// swagger:model ApiPolicyLabelActionMapping
type APIPolicyLabelActionMapping struct {

	// Check-disable toggle actions for this label. Each entry turns off an entire validation check category for requests carrying this label. Enum options - API_POLICY_LABEL_ACTION_DEACTIVATE_PATH_PARAM_CHECK, API_POLICY_LABEL_ACTION_DEACTIVATE_QUERY_PARAM_CHECK, API_POLICY_LABEL_ACTION_DEACTIVATE_HEADER_CHECK, API_POLICY_LABEL_ACTION_DEACTIVATE_REQUEST_BODY_CHECK. Field introduced in 32.1.4. Maximum of 16 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	APIPolicyActions []string `json:"api_policy_actions,omitempty"`

	// Enables this label-to-action mapping. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// The name of the label. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Label *string `json:"label"`
}

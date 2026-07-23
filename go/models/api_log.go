// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APILog Api log
// swagger:model ApiLog
type APILog struct {

	// Overall action taken based on the API violations. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Action *string `json:"action,omitempty"`

	// Comma-separated WAAP label names effective for this request. Populated only when the request's ApiPolicy has log_labels enabled. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EffectiveLabels *string `json:"effective_labels,omitempty"`

	// List of API validation checks that were performed on this request. Enum options - API_LOG_CHECK_UNSPECIFIED, API_LOG_CHECK_PATH_PARAMETER, API_LOG_CHECK_QUERY_PARAMETER, API_LOG_CHECK_REQUEST_CONTENT_TYPE, API_LOG_CHECK_REQUEST_BODY, API_LOG_CHECK_RESPONSE_STATUS_CODE, API_LOG_CHECK_RESPONSE_CONTENT_TYPE, API_LOG_CHECK_REQUEST_HEADER. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnabledAPIChecks []string `json:"enabled_api_checks,omitempty"`

	// Comma-separated list of API policy labels that were executed for this request. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ExecutedAPILabelsStr *string `json:"executed_api_labels_str,omitempty"`

	// Number of API violations that were not logged due to space constraints. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OmittedAPIViolations *uint32 `json:"omitted_api_violations,omitempty"`

	// The type of the API request. Enum options - API_LOG_TYPE_OTHER, API_LOG_TYPE_ACTIVE, API_LOG_TYPE_SHADOW, API_LOG_TYPE_ZOMBIE, API_LOG_TYPE_ORPHAN. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestType *string `json:"request_type,omitempty"`

	// List of API violations detected during validation. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Violations []*APIViolation `json:"violations,omitempty"`
}

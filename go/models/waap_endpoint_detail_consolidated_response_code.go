// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WaapEndpointDetailConsolidatedResponseCode waap endpoint detail consolidated response code
// swagger:model WaapEndpointDetailConsolidatedResponseCode
type WaapEndpointDetailConsolidatedResponseCode struct {

	// Number of times this response code was observed. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hits *int64 `json:"hits,omitempty"`

	// Unix timestamp (seconds) of when this response code was last updated. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastUpdated *int64 `json:"last_updated,omitempty"`

	// Response violation from learning for this status code, if any. Enum options - API_VIOLATION_TYPE_NONE, API_VIOLATION_TYPE_INVALID_TYPE, API_VIOLATION_TYPE_VALUE_OUT_OF_RANGE, API_VIOLATION_TYPE_FORMAT_MISMATCH, API_VIOLATION_TYPE_UNEXPECTED_ADDITIONAL_PROPERTY, API_VIOLATION_TYPE_MISSING_REQUIRED_PROPERTY, API_VIOLATION_TYPE_NON_API_REQUEST, API_VIOLATION_TYPE_SHADOW_ENDPOINT. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResponseContentTypeViolation *string `json:"response_content_type_violation,omitempty"`

	// HTTP response status code. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RspCode *int32 `json:"rsp_code,omitempty"`
}

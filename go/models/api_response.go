// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIResponse is the response to an API call.
type APIResponse struct {

	// Mapping of response content types to their corresponding schemas. Field introduced in 32.2.1. Maximum of 128 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ContentTypeMappings []*APIContentTypeMapping `json:"content_type_mappings,omitempty"`

	// Description of the response from the OpenAPI specification. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Response header parameter definitions for this status code. Field introduced in 32.2.1. Maximum of 64 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResponseHeaderParameters []*ParameterDescription `json:"response_header_parameters,omitempty"`

	// HTTP status code or status code range. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	StatusCode *HttpstatusMatch `json:"status_code"`

	// Action to take when the response body's content type is not defined for this status code. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UnknownContentTypeAction *string `json:"unknown_content_type_action,omitempty"`
}

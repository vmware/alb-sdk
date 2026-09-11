// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WaapEndpointDetailConsolidatedParam waap endpoint detail consolidated param
// swagger:model WaapEndpointDetailConsolidatedParam
type WaapEndpointDetailConsolidatedParam struct {

	// Total number of times this parameter was observed across all param types. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hits *int64 `json:"hits,omitempty"`

	// Unix timestamp (seconds) of when this parameter was last updated. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastUpdated *int64 `json:"last_updated,omitempty"`

	// Parameter location as an ApiLocation enum value (e.g. API_LOCATION_PATH, API_LOCATION_QUERY_ARGS, API_LOCATION_REQUEST_BODY, API_LOCATION_WAF). Enum options - API_LOCATION_UNSPECIFIED, API_LOCATION_PATH, API_LOCATION_METHOD, API_LOCATION_QUERY_ARGS, API_LOCATION_REQUEST_HEADER, API_LOCATION_REQUEST_CONTENT_TYPE, API_LOCATION_REQUEST_BODY, API_LOCATION_RESPONSE_STATUS_CODE, API_LOCATION_RESPONSE_HEADER, API_LOCATION_RESPONSE_CONTENT_TYPE, API_LOCATION_RESPONSE_BODY, API_LOCATION_WAF. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ParamLocation *string `json:"param_location,omitempty"`

	// Name of the request parameter. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ParamName *string `json:"param_name,omitempty"`

	// Learned pattern for this parameter (e.g. [0-9]{1,6}). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ParamPattern *string `json:"param_pattern,omitempty"`

	// All observed parameter types with their individual statistics and confidence factors. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ParamTypes []*WaapEndpointDetailConsolidatedParamType `json:"param_types,omitempty"`
}

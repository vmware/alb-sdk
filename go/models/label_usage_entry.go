// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LabelUsageEntry label usage entry
// swagger:model LabelUsageEntry
type LabelUsageEntry struct {

	// UUID of the ApiPath. Set when location is LOCATION_API_ENDPOINT. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ApipathUUID *string `json:"apipath_uuid,omitempty"`

	// This entry's own enabled/disabled toggle  the endpoint, container, mapping, or rule's own enabled state. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// Number of endpoints this container currently reaches. Omitted for shadow_api_labels/non_api_url_labels. Set when location is LOCATION_API_POLICY. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EndpointCount *uint32 `json:"endpoint_count,omitempty"`

	// OZA classification of the endpoint. Set when location is LOCATION_API_ENDPOINT. Enum options - API_TYPE_ACTIVE, API_TYPE_ORPHAN, API_TYPE_ZOMBIE. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EndpointType *string `json:"endpoint_type,omitempty"`

	// HTTP method of the endpoint. Set when location is LOCATION_API_ENDPOINT. Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE, HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE, HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPMethod *string `json:"http_method,omitempty"`

	// false when the label is set directly on the endpoint, true when inherited from the parent ApiPolicy. Set when location is LOCATION_API_ENDPOINT. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Inherited *bool `json:"inherited,omitempty"`

	// ApiPolicyLabelMappingAction values this mapping enables. Set when location is LOCATION_API_POLICY_MAPPING. Enum options - API_POLICY_LABEL_ACTION_DEACTIVATE_PATH_PARAM_CHECK, API_POLICY_LABEL_ACTION_DEACTIVATE_QUERY_PARAM_CHECK, API_POLICY_LABEL_ACTION_DEACTIVATE_HEADER_CHECK, API_POLICY_LABEL_ACTION_DEACTIVATE_REQUEST_BODY_CHECK. Field introduced in 32.1.4. Maximum of 16 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LabelMappingActions []string `json:"label_mapping_actions,omitempty"`

	// Which of the four locations this entry represents. Enum options - LOCATION_API_ENDPOINT, LOCATION_API_POLICY, LOCATION_API_POLICY_MAPPING, LOCATION_POLICY_RULE. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Location *string `json:"location,omitempty"`

	// URI path template, for readability only. Set when location is LOCATION_API_ENDPOINT. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PathTemplate *string `json:"path_template,omitempty"`

	// The ApiPolicy label container this entry is from  active_api_labels, shadow_api_labels, orphan_api_labels, zombie_api_labels, or non_api_url_labels. Set when location is LOCATION_API_POLICY. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PolicyField *string `json:"policy_field,omitempty"`

	// UUID of the owning top-level policy object. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PolicyUUID *string `json:"policy_uuid,omitempty"`

	// The complete rule whose LabelMatch references this label — including its own name, match criteria, and action. Set when location is LOCATION_POLICY_RULE. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Rule *LabelL7PolicyRule `json:"rule,omitempty"`

	// The policy scope this entry belongs to  MATCH_ACTION_SCOPE_APIPOLICY for every location except policy_rule, which reports the specific scope of the matched rule's own policy. Enum options - MATCH_ACTION_SCOPE_GENERIC, MATCH_ACTION_SCOPE_APIPOLICY, MATCH_ACTION_SCOPE_WAFPOLICY, MATCH_ACTION_SCOPE_HTTPSECURITYPOLICY, MATCH_ACTION_SCOPE_HTTPREQUESTPOLICY, MATCH_ACTION_SCOPE_HTTPRESPONSEPOLICY, MATCH_ACTION_SCOPE_CSRFPOLICY, MATCH_ACTION_SCOPE_AUTHPROFILE, MATCH_ACTION_SCOPE_VSDATASCRIPTSET, MATCH_ACTION_SCOPE_BOTDETECTIONPOLICY. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Scope *string `json:"scope,omitempty"`
}

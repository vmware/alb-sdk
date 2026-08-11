// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceLearningStats virtual service learning stats
// swagger:model VirtualServiceLearningStats
type VirtualServiceLearningStats struct {

	// Number of attempts to queue a request-learning message to the controller for this VS. Incremented when the message is queued in the SE_DP, not when it is actually sent to the SE_AGENT/Controller. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MessagesSend *uint64 `json:"messages_send,omitempty"`

	// Number of request-learning messages for this VS that could not be queued in the SE_DP. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MessagesSendFailed *uint64 `json:"messages_send_failed,omitempty"`

	// Number of learned API path params sent to the controller. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestAPIPathParamCount *uint64 `json:"request_api_path_param_count,omitempty"`

	// Number of learned API query params sent to the controller. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestAPIQueryParamCount *uint64 `json:"request_api_query_param_count,omitempty"`

	// Number of learned API request body params sent to the controller. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestAPIRequestBodyParamCount *uint64 `json:"request_api_request_body_param_count,omitempty"`

	// Number of RequestUriInfo entries generated with endpoint_classification API_WITH_VIOLATIONS. API learning only. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestEndpointClassificationAPIWithViolations *uint64 `json:"request_endpoint_classification_api_with_violations,omitempty"`

	// Number of RequestUriInfo entries generated with endpoint_classification NON_API. Includes both WAF and API learning. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestEndpointClassificationNonAPI *uint64 `json:"request_endpoint_classification_non_api,omitempty"`

	// Number of RequestUriInfo entries generated with endpoint_classification API_SHADOW. API learning only. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestEndpointClassificationShadow *uint64 `json:"request_endpoint_classification_shadow,omitempty"`

	// Number of RequestUriInfo entries generated with learning_data_format API. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestFormatAPI *uint64 `json:"request_format_api,omitempty"`

	// Number of RequestUriInfo entries generated with learning_data_format WAF. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestFormatWaf *uint64 `json:"request_format_waf,omitempty"`

	// Number of RequestUriInfo entries generated for this VS and sent to the controller. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestURIInfoLearned *uint64 `json:"request_uri_info_learned,omitempty"`

	// Number of learned WAF request params sent to the controller. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RequestWafRequestParamCount *uint64 `json:"request_waf_request_param_count,omitempty"`
}

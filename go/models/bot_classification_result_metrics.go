// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BotClassificationResultMetrics bot classification result metrics
// swagger:model BotClassificationResultMetrics
type BotClassificationResultMetrics struct {

	// Number of requests that resulted in a bot classification of type BAD_BOT. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BadBot *uint64 `json:"bad_bot,omitempty"`

	// Number of requests for which bot detection was bypassed via allow_list. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Bypassed *uint64 `json:"bypassed,omitempty"`

	// Number of requests that resulted in a bot classification of type DANGEROUS_BOT. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DangerousBot *uint64 `json:"dangerous_bot,omitempty"`

	// Number of requests for which the IP network location was evaluated. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EvaluateIPLocation *uint64 `json:"evaluate_ip_location,omitempty"`

	// Number of requests for which the IP repuatation was evaluated. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EvaluateIPReputation *uint64 `json:"evaluate_ip_reputation,omitempty"`

	// Number of requests for which the user agent was evaluated. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EvaluateUserAgent *uint64 `json:"evaluate_user_agent,omitempty"`

	// Number of requests that resulted in a bot classification of type GOOD_BOT. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GoodBot *uint64 `json:"good_bot,omitempty"`

	// Number of requests that resulted in a bot classification of type HUMAN. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Human *uint64 `json:"human,omitempty"`

	// <se-uuid>/AGGREGATED. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NodeObjID *string `json:"node_obj_id"`

	// Number of requests for which the BotPolicy was executed. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Requests *uint64 `json:"requests,omitempty"`

	// Number of requests that resulted in a bot classification of type UNKNOWN_CLIENT. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Unknown *uint64 `json:"unknown,omitempty"`

	// Number of requests that resulted in a bot classification of type USER_DEFINED. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UserDefinedBot *uint64 `json:"user_defined_bot,omitempty"`
}

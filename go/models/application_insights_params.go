// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ApplicationInsightsParams application insights params
// swagger:model ApplicationInsightsParams
type ApplicationInsightsParams struct {

	// If set to true, limit application learning only from clients which match the learn_from_bots specification. The settings learn_from_authenticated_clients_only and trusted_ip_groups always take precedence. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EnableLearnFromBots *bool `json:"enable_learn_from_bots,omitempty"`

	// If true, learns the params per URI path. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EnablePerURILearning *bool `json:"enable_per_uri_learning,omitempty"`

	// Limit Application Learning only from Authenticated clients. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LearnFromAuthenticatedClientsOnly *bool `json:"learn_from_authenticated_clients_only,omitempty"`

	// If Bot detection is active for this Virtual Service, learning will only be performed on application data from clients within the configured bot classification types. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LearnFromBots *BotDetectionMatch `json:"learn_from_bots,omitempty"`

	// When true, the WAF includes argument-less URIs in its learning process. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LearnFromUrlsWithoutArgs *bool `json:"learn_from_urls_without_args,omitempty"`

	// Maximum number of parameters per URI programmed for Application Insights. Allowed values are 10-1000. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxParams *uint32 `json:"max_params,omitempty"`

	// Maximum number of URIs for Application Insights. Allowed values are 10-10000. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxUris *uint32 `json:"max_uris,omitempty"`

	// Limits Application Learning from client IPs within the configured IP Address Group. It is a reference to an object of type IpAddrGroup. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TrustedIpgroupRef *string `json:"trusted_ipgroup_ref,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AnalyticsPolicy analytics policy
// swagger:model AnalyticsPolicy
type AnalyticsPolicy struct {

	// Log all headers. Field introduced in 18.1.4, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AllHeaders *bool `json:"all_headers,omitempty"`

	// Gain insights from sampled client to server HTTP requests and responses. Enum options - NO_INSIGHTS, PASSIVE, ACTIVE. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ClientInsights *string `json:"client_insights,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ClientInsightsSampling *ClientInsightsSampling `json:"client_insights_sampling,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ClientLogFilters []*ClientLogFilter `json:"client_log_filters,omitempty"`

	// [DEPRECATED] Disable Analytics on this VirtualService. This will disable the collection of both metrics and logs. Please use following fields in AnalytcsProfile to control this behavior instead. disable_vs_analytics (for VirtualServices metrics), disable_server_analytics (for Pool metrics) and client_log_config (for logs). Field deprecated in 18.2.1. Field introduced in 17.2.4. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	FullClientLogs *FullClientLogs `json:"full_client_logs,omitempty"`

	// Configuration for learning logging determining whether it's enabled and where is the destination. Field introduced in 20.1.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	LearningLogPolicy *LearningLogPolicy `json:"learning_log_policy,omitempty"`

	// Settings to turn on realtime metrics and set duration for realtime updates. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	MetricsRealtimeUpdate *MetricsRealTimeUpdate `json:"metrics_realtime_update,omitempty"`

	// This setting limits the number of significant logs generated per second for this VS on each SE. Default is 10 logs per second. Set it to zero (0) to deactivate throttling. Field introduced in 17.1.3. Unit is PER_SECOND. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SignificantLogThrottle *int32 `json:"significant_log_throttle,omitempty"`

	// This setting limits the total number of UDF logs generated per second for this VS on each SE. UDF logs are generated due to the configured client log filters or the rules with logging enabled. Default is 10 logs per second. Set it to zero (0) to deactivate throttling. Field introduced in 17.1.3. Unit is PER_SECOND. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UdfLogThrottle *int32 `json:"udf_log_throttle,omitempty"`
}

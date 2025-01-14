// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AlertRuleMetric alert rule metric
// swagger:model AlertRuleMetric
type AlertRuleMetric struct {

	// Evaluation window for the Metrics. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Duration *uint32 `json:"duration,omitempty"`

	// Metric Id for the Alert. Eg. l4_client.avg_complete_conns. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetricID *string `json:"metric_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MetricThreshold *AlertMetricThreshold `json:"metric_threshold"`
}

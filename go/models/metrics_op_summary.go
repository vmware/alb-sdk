// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MetricsOpSummary metrics op summary
// swagger:model MetricsOpSummary
type MetricsOpSummary struct {

	// Number of non-rt metrics objects processed in one metrics timer interval. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonRtMetBatchSize *uint32 `json:"non_rt_met_batch_size,omitempty"`

	// Flag to indicate if metrics update timer is running on se_dp. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonRtMetUpdateTimerRunning *bool `json:"non_rt_met_update_timer_running,omitempty"`

	// Total number of non-real-time metrics objects. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonRtMetricsEntities *uint32 `json:"non_rt_metrics_entities,omitempty"`

	// Period in milliseconds at which non-real-time metrics is collected. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonRtMetricsTimerInterval *uint32 `json:"non_rt_metrics_timer_interval,omitempty"`

	// Cumulative count of dos messages sent to metrics-mgr across all targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDosMsgsSent *uint64 `json:"num_dos_msgs_sent,omitempty"`

	// Cumulative count of metrics messages sent to metrics-mgr across all targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumMetricsMsgsSent *uint64 `json:"num_metrics_msgs_sent,omitempty"`

	// Number of rt-metrics objects processed in one rt_metrics timer interval. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RtMetBatchSize *uint32 `json:"rt_met_batch_size,omitempty"`

	// Flag to indicate if rt-metrics update timer is running on se_dp. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RtMetUpdateTimerRunning *bool `json:"rt_met_update_timer_running,omitempty"`

	// Total number of real-time metrics objects. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RtMetricsEntities *uint32 `json:"rt_metrics_entities,omitempty"`

	// Period in milliseconds at which real-time metrics is collected. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RtMetricsTimerInterval *uint32 `json:"rt_metrics_timer_interval,omitempty"`

	// Total number of metrics objects. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalEntities *uint32 `json:"total_entities,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MetricsObj metrics obj
// swagger:model MetricsObj
type MetricsObj struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectInProgress *bool `json:"connect_in_progress,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Connected *bool `json:"connected,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ControllerIP *string `json:"controller_ip,omitempty"`

	// Max time difference in secs between 2 consecutive update to controller. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CtlrSendIntervalMaxTime *uint32 `json:"ctlr_send_interval_max_time,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DelayedMetricsResponse *uint32 `json:"delayed_metrics_response,omitempty"`

	//  Field introduced in 18.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DisableServerAnalytics *bool `json:"disable_server_analytics,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Eastwest *bool `json:"eastwest,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EffectiveControllerIP *string `json:"effective_controller_ip,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastClearedTimestamp *uint32 `json:"last_cleared_timestamp,omitempty"`

	// Metrics-Message version of the last read MetricsAgentMessage. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastReadVersion *uint32 `json:"last_read_version,omitempty"`

	// State of reading metrics-update from se_dp. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetReadState *string `json:"met_read_state,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetricsMgrPort *string `json:"metrics_mgr_port,omitempty"`

	// Total number of dos messages sent to metrics-mgr for this object. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDosMsgsSent *uint64 `json:"num_dos_msgs_sent,omitempty"`

	// Total number of drops of metrics request to dp due to rpc queue full. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDrops *uint64 `json:"num_drops,omitempty"`

	// Total number of metrics messages sent to metrics-mgr for this object. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumMetricsMsgsSent *uint64 `json:"num_metrics_msgs_sent,omitempty"`

	// Total number of misses of metrics update from SE to Controller. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumMisses *uint64 `json:"num_misses,omitempty"`

	// Number of times agent asked se_dp to reset metrics update state. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumResets *uint32 `json:"num_resets,omitempty"`

	// Number of times se_dp could not post a metrics update. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumUpdateErrors *uint32 `json:"num_update_errors,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RtMetrics *bool `json:"rt_metrics,omitempty"`

	//  Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Status *string `json:"status,omitempty"`

	// in seconds. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TimerInterval *uint32 `json:"timer_interval,omitempty"`

	//  Enum options - VSERVER_METRICS_ENTITY, VM_METRICS_ENTITY, SE_METRICS_ENTITY, CONTROLLER_METRICS_ENTITY, APPLICATION_METRICS_ENTITY, TENANT_METRICS_ENTITY, POOL_METRICS_ENTITY. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Type *string `json:"type,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}

// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DpMetricsUpdateSummary dp metrics update summary
// swagger:model DpMetricsUpdateSummary
type DpMetricsUpdateSummary struct {

	// Maximum interval in seconds between consecutive runs of non-real-time metrics timer. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetTimerIntvlMaxSec *uint32 `json:"met_timer_intvl_max_sec,omitempty"`

	// Cumulative count of errors encounterd when posting a metrics update to se_agent. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetUpdateErrors *uint32 `json:"met_update_errors,omitempty"`

	// Cumulative count of metrics message serialization errors when posting a metrics update to se_agent. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetUpdateMsgSerErrors *uint32 `json:"met_update_msg_ser_errors,omitempty"`

	// Cumulative count of metrics object errors when posting a metrics update to se_agent. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetUpdateObjErrors *uint32 `json:"met_update_obj_errors,omitempty"`

	// Cumulative count of shm alloc failures when posting a metrics update to se_agent. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetUpdateShmAllocErrors *uint32 `json:"met_update_shm_alloc_errors,omitempty"`

	// Cumulative count of shm lock failures when posting a metrics update to se_agent. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetUpdateShmLockErrors *uint32 `json:"met_update_shm_lock_errors,omitempty"`

	// Cumulative count of updates posted to se_agent across all objects. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetUpdatesPosted *uint32 `json:"met_updates_posted,omitempty"`

	// Number of non-rt metrics objects processed by se_dp in one timer interval. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonRtMetBatchSize *uint32 `json:"non_rt_met_batch_size,omitempty"`

	// Flag to indicate if metrics update timer is running on se_dp. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonRtMetUpdateTimerRunning *bool `json:"non_rt_met_update_timer_running,omitempty"`

	// Total number of non-real-time metrics objects. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonRtMetricsEntities *uint32 `json:"non_rt_metrics_entities,omitempty"`

	// Period in milliseconds at which non-real-time metrics is collected. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonRtMetricsTimerIntvlMs *uint32 `json:"non_rt_metrics_timer_intvl_ms,omitempty"`

	// Number of rt-metrics objects processed by se_dp in one timer interval. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RtMetBatchSize *uint32 `json:"rt_met_batch_size,omitempty"`

	// Maximum interval in seconds between consecutive runs of real-time metrics timer. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RtMetTimerIntvlMaxSec *uint32 `json:"rt_met_timer_intvl_max_sec,omitempty"`

	// Flag to indicate if rt-metrics update timer is running on se_dp. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RtMetUpdateTimerRunning *bool `json:"rt_met_update_timer_running,omitempty"`

	// Total number of real-time metrics objects. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RtMetricsEntities *uint32 `json:"rt_metrics_entities,omitempty"`

	// Period in milliseconds at which real-time metrics is collected. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RtMetricsTimerIntvlMs *uint32 `json:"rt_metrics_timer_intvl_ms,omitempty"`
}

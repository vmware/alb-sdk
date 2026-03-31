// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DpMetricsObj dp metrics obj
// swagger:model DpMetricsObj
type DpMetricsObj struct {

	// Cumulative count of metrics message serialization errors when posting a metrics update to se_agent. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetObjMsgSerErrors *uint32 `json:"met_obj_msg_ser_errors,omitempty"`

	// Cumulative count of metrics object errors when posting a metrics update to se_agent. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetObjObjErrors *uint32 `json:"met_obj_obj_errors,omitempty"`

	// Cumulative count of shm alloc failures when posting a metrics update to se_agent. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetObjShmAllocErrors *uint32 `json:"met_obj_shm_alloc_errors,omitempty"`

	// Cumulative count of shm lock failures when posting a metrics update to se_agent. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetObjShmLockErrors *uint32 `json:"met_obj_shm_lock_errors,omitempty"`

	// Number of times se_dp encountered error when posting an L4 update to se_agent. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumL4UpdateErrors *uint64 `json:"num_l4_update_errors,omitempty"`

	// Number of times se_dp posted an l4-metrics update to se_agent. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumL4Updates *uint64 `json:"num_l4_updates,omitempty"`

	// Number of times se_dp encountered error when posting an L7 update to se_agent. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumL7UpdateErrors *uint64 `json:"num_l7_update_errors,omitempty"`

	// Number of times se_dp posted an l7-metrics update to se_agent. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumL7Updates *uint64 `json:"num_l7_updates,omitempty"`

	// Number of times object inspected by timer for periodic metric update. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumTimerInsp *uint32 `json:"num_timer_insp,omitempty"`

	// Number of times se_dp could not post a metrics update because update was paused by se_agent. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumUpdatePaused *uint32 `json:"num_update_paused,omitempty"`

	// Number of times se_agent asked se_dp to reset metrics message version number. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVerResets *uint32 `json:"num_ver_resets,omitempty"`

	// set to true if metrics object is reporting real-time metrics. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RtMetrics *bool `json:"rt_metrics,omitempty"`

	// uuid of the metrics object. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}

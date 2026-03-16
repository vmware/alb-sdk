// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MetricsRuntimeDebug metrics runtime debug
// swagger:model MetricsRuntimeDebug
type MetricsRuntimeDebug struct {

	// Number of milisec grpc thread took sleep last time. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GrpcThreadLastSleepTime *uint32 `json:"grpc_thread_last_sleep_time,omitempty"`

	// Per metrics-target stats.  Metrics-Target is metrics-mgr-ip + metrics-port. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetGrpcTargetStats []*MetricsGrpcTargetStats `json:"met_grpc_target_stats,omitempty"`

	// Stats for metrics grpc channel maintenance messaging. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetGrpcThreadStats []*MetricsGrpcThreadStats `json:"met_grpc_thread_stats,omitempty"`

	// Number of milisec metrics thread took sleep last time. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetricsThreadLastSleepTime *uint32 `json:"metrics_thread_last_sleep_time,omitempty"`
}

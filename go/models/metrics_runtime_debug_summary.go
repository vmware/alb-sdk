// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MetricsRuntimeDebugSummary metrics runtime debug summary
// swagger:model MetricsRuntimeDebugSummary
type MetricsRuntimeDebugSummary struct {

	// Per metrics-target summary stats.  Metrics-Target is metrics-mgr-ip + metrics-port. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetGrpcTargetStats []*MetricsGrpcTargetStats `json:"met_grpc_target_stats,omitempty"`

	// Stats for metrics grpc channel maintenance messaging. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetGrpcThreadStats []*MetricsGrpcThreadStats `json:"met_grpc_thread_stats,omitempty"`

	// Summary stats of metrics objects and metrics collection. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetOperSummary []*MetricsOpSummary `json:"met_oper_summary,omitempty"`
}

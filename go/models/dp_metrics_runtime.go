// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DpMetricsRuntime dp metrics runtime
// swagger:model DpMetricsRuntime
type DpMetricsRuntime struct {

	// Summary of metrics update parameters. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpMetUpdateSummary *DpMetricsUpdateSummary `json:"dp_met_update_summary,omitempty"`

	// Metrics update stats and status. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpMetricsObjs []*DpMetricsObj `json:"dp_metrics_objs,omitempty"`

	// Process Id which is reporting metrics stats. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`
}

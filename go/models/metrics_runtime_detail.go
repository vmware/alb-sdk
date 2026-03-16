// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MetricsRuntimeDetail metrics runtime detail
// swagger:model MetricsRuntimeDetail
type MetricsRuntimeDetail struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BaseVsStats *VsStats `json:"base_vs_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CurrVsStats *VsStats `json:"curr_vs_stats,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeIfStats []*MetricsSeIfStats `json:"se_if_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeStats *SeStats `json:"se_stats,omitempty"`

	//  Enum options - VSERVER_METRICS_ENTITY, VM_METRICS_ENTITY, SE_METRICS_ENTITY, CONTROLLER_METRICS_ENTITY, APPLICATION_METRICS_ENTITY, TENANT_METRICS_ENTITY, POOL_METRICS_ENTITY. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Type *string `json:"type,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UserMetrics []*MetricsUserMetrics `json:"user_metrics,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}

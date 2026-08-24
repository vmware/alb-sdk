// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HSMgrDebugFilter h s mgr debug filter
// swagger:model HSMgrDebugFilter
type HSMgrDebugFilter struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Entity *string `json:"entity,omitempty"`

	//  Enum options - VSERVER_METRICS_ENTITY, VM_METRICS_ENTITY, SE_METRICS_ENTITY, CONTROLLER_METRICS_ENTITY, APPLICATION_METRICS_ENTITY, TENANT_METRICS_ENTITY, POOL_METRICS_ENTITY. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetricEntity *string `json:"metric_entity,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Period *int32 `json:"period,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Pool *string `json:"pool,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Server *string `json:"server,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SkipHsDbWrites *bool `json:"skip_hs_db_writes,omitempty"`

	// Batch size for vs security metrics query. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsSecurityMetricsBatchSize *uint32 `json:"vs_security_metrics_batch_size,omitempty"`

	// Sigmoid midpoint for weighted ungoverned ratio. Allowed values are 0.01-1.0. Field introduced in 32.1.4. Unit is RATIO. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WaapAppCompThreshold *float64 `json:"waap_app_comp_threshold,omitempty"`

	// Relative weight for app composition sub-score. Allowed values are 0-10.0. Field introduced in 32.1.4. Unit is RATIO. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WaapAppCompWeight *float64 `json:"waap_app_comp_weight,omitempty"`

	// Relative weight for WAAP config sub-score. Allowed values are 0-10.0. Field introduced in 32.1.4. Unit is RATIO. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WaapConfigWeight *float64 `json:"waap_config_weight,omitempty"`

	// Relative risk weight for orphan API traffic in app composition. Allowed values are 0-5.0. Field introduced in 32.1.4. Unit is RATIO. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WaapOrphanAPIWeight *float64 `json:"waap_orphan_api_weight,omitempty"`

	// Relative risk weight for shadow API traffic in app composition. Allowed values are 0-5.0. Field introduced in 32.1.4. Unit is RATIO. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WaapShadowAPIWeight *float64 `json:"waap_shadow_api_weight,omitempty"`

	// Sigmoid midpoint for WAAP violation ratio (violation_count/total_hits at which sub-score is ~50). Allowed values are 0.001-1.0. Field introduced in 32.1.4. Unit is RATIO. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WaapViolationRatioThreshold *float64 `json:"waap_violation_ratio_threshold,omitempty"`

	// Relative weight for violation ratio in combined WAAP penalty. Allowed values are 0-10.0. Field introduced in 32.1.4. Unit is RATIO. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WaapViolationRatioWeight *float64 `json:"waap_violation_ratio_weight,omitempty"`

	// Relative risk weight for zombie API traffic in app composition. Allowed values are 0-5.0. Field introduced in 32.1.4. Unit is RATIO. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WaapZombieAPIWeight *float64 `json:"waap_zombie_api_weight,omitempty"`
}

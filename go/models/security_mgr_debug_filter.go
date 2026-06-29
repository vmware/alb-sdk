// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SecurityMgrDebugFilter security mgr debug filter
// swagger:model SecurityMgrDebugFilter
type SecurityMgrDebugFilter struct {

	// HTTP methods to accumulate for consolidated learning (e.g., GET, POST, PUT). If empty, all methods are accumulated. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AccumulateHTTPMethods []string `json:"accumulate_http_methods,omitempty"`

	// Cooldown period between adaptive sampling configuration sends to prevent excessive updates. Allowed values are 1-600. Field introduced in 32.2.1. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AdaptiveSamplerConfigCooldown *uint32 `json:"adaptive_sampler_config_cooldown,omitempty"`

	// Adaptive sampler tick interval for periodic sampling adjustments. Allowed values are 1-3600. Field introduced in 32.2.1. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AdaptiveSamplerTickInterval *uint32 `json:"adaptive_sampler_tick_interval,omitempty"`

	// Custom API path markers for endpoint classification (e.g., /api/, /v1/, /graphql). If not configured, uses default markers. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	APIPathMarkers []string `json:"api_path_markers,omitempty"`

	// Dynamically adapt configuration parameters for Application Learning feature. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnableAdaptiveConfig *bool `json:"enable_adaptive_config,omitempty"`

	// [Internal] Toggle API endpoint consolidation - applies to Application Insights, API Protection, Positive Security. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnableSecmgrAPIEndpointConsolidation *bool `json:"enable_secmgr_api_endpoint_consolidation,omitempty"`

	// uuid of the entity. It is a reference to an object of type Virtualservice. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EntityRef *string `json:"entity_ref,omitempty"`

	// Lookback period for learning database cleanup. Allowed values are 1-365. Field introduced in 32.2.1. Unit is DAYS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LearningDbCleanupLookbackPeriod *uint32 `json:"learning_db_cleanup_lookback_period,omitempty"`

	// Dynamically update the interval for rule generation in PSM programming. Allowed values are 1-60. Field introduced in 31.2.1. Unit is MIN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PsmProgrammingInterval *uint32 `json:"psm_programming_interval,omitempty"`

	// Dynamically update the multiplier for rule ID generation in PSM programming for Learning feature. Allowed values are 10-100000. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PsmRuleIDMultiplier *uint32 `json:"psm_rule_id_multiplier,omitempty"`

	// [Internal] Periodicity at which Orphan/Zombie/Active API determination routine runs. Allowed values are 1-10080. Field introduced in 32.2.1. Unit is MIN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SecmgrAPIClassificationTaskPeriodicity *uint32 `json:"secmgr_api_classification_task_periodicity,omitempty"`

	// [Internal] Periodicity at which Orphan/Zombie/Active API hits population routine runs. Allowed values are 5-1440. Field introduced in 32.2.1. Unit is MIN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SecmgrAPIHitsPopulationInterval *uint32 `json:"secmgr_api_hits_population_interval,omitempty"`

	// Trigger full sync of API specification changes to learning database for all eligible VSes. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SecmgrWaapFullSync *bool `json:"secmgr_waap_full_sync,omitempty"`

	// Trigger full sync for a specific VS UUID. If set, only this VS will be processed. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SecmgrWaapFullSyncVsUUID *string `json:"secmgr_waap_full_sync_vs_uuid,omitempty"`

	// File extensions considered as static non-API content (e.g., .html, .css, .js, .png). If not configured, uses default extensions. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StaticFileExtensions []string `json:"static_file_extensions,omitempty"`
}

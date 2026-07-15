// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MetricsAPISrvDebugFilter metrics Api srv debug filter
// swagger:model MetricsApiSrvDebugFilter
type MetricsAPISrvDebugFilter struct {

	// Number of last-N metrics DB query stats snapshots to save. Allowed values are 4-24. Special values are 0- Stop taking metrics DB query stats snapshots. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DbStatsNumSnapshots *uint32 `json:"db_stats_num_snapshots,omitempty"`

	// Periodicity in hours of taking snapshots of metrics DB query stats. Allowed values are 1-48. Field introduced in 32.1.1. Unit is HOURS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DbStatsSnapshotPeriodHours *uint32 `json:"db_stats_snapshot_period_hours,omitempty"`

	// uuid of the entity. It is a reference to an object of type Virtualservice. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EntityRef *string `json:"entity_ref,omitempty"`

	// Single knob to enable collection of metrics API server stats. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MapiPerfStatsEnabled *bool `json:"mapi_perf_stats_enabled,omitempty"`

	// Maintain query history only for the specified entity type - POOL_METRICS_ENTITY etc. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MapiReqHistoryEntityTypeFilters []string `json:"mapi_req_history_entity_type_filters,omitempty"`

	// Maintain query history only for the specified entity uuid. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MapiReqHistoryEntityUUIDFilters []string `json:"mapi_req_history_entity_uuid_filters,omitempty"`

	// Maintain query history only for the specified metric id. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MapiReqHistoryMetricIDFilters []string `json:"mapi_req_history_metric_id_filters,omitempty"`

	// Number of last-N metrics API server queries to save. Allowed values are 1-32. Special values are 0- Stop saving of last-N metrics API server queries.. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MapiReqHistoryNumRecords *uint32 `json:"mapi_req_history_num_records,omitempty"`

	// Maintain query history only for the specified serviceengine uuid. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MapiReqHistorySeUUIDFilters []string `json:"mapi_req_history_se_uuid_filters,omitempty"`

	// Periodicity in hours of saving operational stats of metrics API server to a log file. Allowed values are 1-12. Special values are 0- Stop periodic saving of last-N metrics API server queries.. Field introduced in 32.1.1. Unit is HOURS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MapiStatsLogPeriodHours *uint32 `json:"mapi_stats_log_period_hours,omitempty"`

	// First N minutes of each hour treated as the rollup window (BALANCED mode bypasses the freshness gate here). 0 disables the bypass. Allowed values are 0-30. Field introduced in 32.2.1. Unit is MIN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetricsDbRdBoundaryWindowMin *uint32 `json:"metrics_db_rd_boundary_window_min,omitempty"`

	// Follower health-probe cadence. Allowed values are 10-600. Field introduced in 32.2.1. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetricsDbRdCheckIntervalSec *uint32 `json:"metrics_db_rd_check_interval_sec,omitempty"`

	// Probe-recency gate  distrust the cached follower probe if older than this. Must be >= metrics_db_rd_check_interval_sec. Allowed values are 30-1800. Field introduced in 32.2.1. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetricsDbRdLagStaleAfterSec *uint32 `json:"metrics_db_rd_lag_stale_after_sec,omitempty"`

	// Max now - last_replay_ts (worst-case follower staleness) for the freshness gate. Allowed values are 5-3600. Field introduced in 32.2.1. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetricsDbRdLagThresholdSec *uint32 `json:"metrics_db_rd_lag_threshold_sec,omitempty"`

	// Follower-routing mode for metrics reads  BALANCED (default), DISABLED (always leader), FRESHNESS_ONLY, or FORCE_FOLLOWER_NON_RT. Enum options - METRICS_DB_ROUTING_BALANCED, METRICS_DB_ROUTING_DISABLED, METRICS_DB_ROUTING_FRESHNESS_ONLY, METRICS_DB_ROUTING_FORCE_FOLLOWER_NON_RT. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetricsDbRdRoutingMode *string `json:"metrics_db_rd_routing_mode,omitempty"`
}

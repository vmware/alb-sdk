// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LogManagerDebugFilter log manager debug filter
// swagger:model LogManagerDebugFilter
type LogManagerDebugFilter struct {

	// Delete protection time for ADF indices in minutes. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AdfProtectionTimeMinutes *uint32 `json:"adf_protection_time_minutes,omitempty"`

	// Buffer size for batch queues. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	BatchQueueBufferSize *uint32 `json:"batch_queue_buffer_size,omitempty"`

	// Number of workers for batch processing. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	BatchWorkerCount *uint32 `json:"batch_worker_count,omitempty"`

	// Size of bulk payload buffer. This is the max bulk payload size. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	BulkPayloadStringSize *uint32 `json:"bulk_payload_string_size,omitempty"`

	// Cache cleanup delay in milliseconds. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	CacheCleanupDelayMs *uint32 `json:"cache_cleanup_delay_ms,omitempty"`

	// Timeout for the client to create an index in seconds. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ClientIndexOpTimeoutSeconds *uint32 `json:"client_index_op_timeout_seconds,omitempty"`

	// Database notification channel capacity. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	DbNotifnChanCapacity *uint32 `json:"db_notifn_chan_capacity,omitempty"`

	// UUID of the entity. It is a reference to an object of type Virtualservice. Field introduced in 21.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EntityRef *string `json:"entity_ref,omitempty"`

	// Go garbage collection percentage. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	GoGcPercent *uint32 `json:"go_gc_percent,omitempty"`

	// Incremental timeout buffer in milliseconds. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	IncrementalTimeoutBufferMs *uint32 `json:"incremental_timeout_buffer_ms,omitempty"`

	// Index cleaner interval in minutes. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	IndexCleanerIntervalMinutes *uint32 `json:"index_cleaner_interval_minutes,omitempty"`

	// Base path for Search Engine Mappings and Settings. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	IndexConfigPath *string `json:"index_config_path,omitempty"`

	// Index retention period in minutes. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	IndexRetentionPeriodMinutes *uint32 `json:"index_retention_period_minutes,omitempty"`

	// Buffer size for index status queue. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	IndexStatusQueueBufferSize *uint32 `json:"index_status_queue_buffer_size,omitempty"`

	// Renderer configuration - JSON all *string builder size. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	JSONAllStrBuilderSize *uint32 `json:"json_all_str_builder_size,omitempty"`

	// Renderer configuration - JSON everything *string builder size. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	JSONEverythingStrBuilderSize *uint32 `json:"json_everything_str_builder_size,omitempty"`

	// Renderer configuration - JSON *string builder size. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	JSONStrBuilderSize *uint32 `json:"json_str_builder_size,omitempty"`

	// Log indexer task timeout in milliseconds. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LogIndexerTaskTimeoutMs *uint32 `json:"log_indexer_task_timeout_ms,omitempty"`

	// Log records incremental timeout in milliseconds. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LogRecordsIncrementalTimeoutMs *uint32 `json:"log_records_incremental_timeout_ms,omitempty"`

	// Log records task timeout in milliseconds. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LogRecordsTaskTimeoutMs *uint32 `json:"log_records_task_timeout_ms,omitempty"`

	// Maximum duration to wait for batching files to indexer. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxBatchDurationMs *uint32 `json:"max_batch_duration_ms,omitempty"`

	// Maximum number of files in a batch to indexer. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxBatchSize *uint32 `json:"max_batch_size,omitempty"`

	// Maximum number of files per index. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxFilesPerIndex *uint32 `json:"max_files_per_index,omitempty"`

	// Maximum number of indices for events. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxIndicesEvents *uint32 `json:"max_indices_events,omitempty"`

	// Maximum number of indices per VS. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxIndicesPerVs *uint32 `json:"max_indices_per_vs,omitempty"`

	// Maximum number of indices for system. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxIndicesSystem *uint32 `json:"max_indices_system,omitempty"`

	// Maximum number of logs per index. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxLogsPerIndex *uint32 `json:"max_logs_per_index,omitempty"`

	// Number of goroutines for indexer_worker. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxNumWorkers *uint32 `json:"max_num_workers,omitempty"`

	// Max number of index task requests taken by indexer. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxQueueSize *uint32 `json:"max_queue_size,omitempty"`

	// Maximum size per index in MB. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxSizePerIndexMb *uint32 `json:"max_size_per_index_mb,omitempty"`

	// Delete protection time for NF indices in minutes. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	NfProtectionTimeMinutes *uint32 `json:"nf_protection_time_minutes,omitempty"`

	// OpenSearch host. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	OpensearchHost *string `json:"opensearch_host,omitempty"`

	// Number of replicas for OpenSearch. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	OpensearchNumReplicas *uint32 `json:"opensearch_num_replicas,omitempty"`

	// Number of shards for OpenSearch. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	OpensearchNumShards *uint32 `json:"opensearch_num_shards,omitempty"`

	// OpenSearch port. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	OpensearchPort *string `json:"opensearch_port,omitempty"`

	// Buffer size for query queues. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	QueryQueueBufferSize *uint32 `json:"query_queue_buffer_size,omitempty"`

	// Number of workers for query processing. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	QueryWorkerCount *uint32 `json:"query_worker_count,omitempty"`

	// Buffer size for records status queue. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	RecordsStatusQueueBufferSize *uint32 `json:"records_status_queue_buffer_size,omitempty"`

	// Number of workers for records status processing. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	RecordsStatusWorkerCount *uint32 `json:"records_status_worker_count,omitempty"`

	// Reserved field for future use. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Reserved1 *string `json:"reserved_1,omitempty"`

	// Reserved field for future use. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Reserved2 *string `json:"reserved_2,omitempty"`

	// Reserved field for future use. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Reserved3 *uint32 `json:"reserved_3,omitempty"`

	// Reserved field for future use. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Reserved4 *uint32 `json:"reserved_4,omitempty"`

	// Search query timeout in milliseconds. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SearchQueryTimeoutMs *uint32 `json:"search_query_timeout_ms,omitempty"`

	// Wait time before re-enqueueing failed tasks in seconds. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TaskReEnqueueWaitTimeSeconds *uint32 `json:"task_re_enqueue_wait_time_seconds,omitempty"`

	// Set the log level for telemetry trace logs. Enum options - LOG_LEVEL_DISABLED, LOG_LEVEL_INFO, LOG_LEVEL_WARNING, LOG_LEVEL_ERROR, LOG_LEVEL_DEBUG. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TelemetryTraceLogLevel *string `json:"telemetry_trace_log_level,omitempty"`

	// Telemetry trace percentage. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TelemetryTracePercentage *uint32 `json:"telemetry_trace_percentage,omitempty"`

	// Delete protection time for UDF indices in minutes. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UdfProtectionTimeMinutes *uint32 `json:"udf_protection_time_minutes,omitempty"`
}

/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */

package com.vmware.avi.sdk.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The LogManagerDebugFilter is a POJO class extends AviRestResource that used for creating
 * LogManagerDebugFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogManagerDebugFilter  {
    @JsonProperty("adf_protection_time_minutes")
    private Integer adfProtectionTimeMinutes = 1380;

    @JsonProperty("batch_queue_buffer_size")
    private Integer batchQueueBufferSize = 100;

    @JsonProperty("batch_worker_count")
    private Integer batchWorkerCount = 8;

    @JsonProperty("bulk_payload_string_size")
    private Integer bulkPayloadStringSize = 11000000;

    @JsonProperty("cache_cleanup_delay_ms")
    private Integer cacheCleanupDelayMs = 300000;

    @JsonProperty("client_index_op_timeout_seconds")
    private Integer clientIndexOpTimeoutSeconds = 5;

    @JsonProperty("db_notifn_chan_capacity")
    private Integer dbNotifnChanCapacity = 1000;

    @JsonProperty("entity_ref")
    private String entityRef;

    @JsonProperty("go_gc_percent")
    private Integer goGcPercent = 50;

    @JsonProperty("incremental_timeout_buffer_ms")
    private Integer incrementalTimeoutBufferMs = 1000;

    @JsonProperty("index_cleaner_interval_minutes")
    private Integer indexCleanerIntervalMinutes = 30;

    @JsonProperty("index_config_path")
    private String indexConfigPath = "/var/lib/avi/indexer_configs";

    @JsonProperty("index_retention_period_minutes")
    private Integer indexRetentionPeriodMinutes = 1440;

    @JsonProperty("index_status_queue_buffer_size")
    private Integer indexStatusQueueBufferSize = 100;

    @JsonProperty("json_all_str_builder_size")
    private Integer jsonAllStrBuilderSize = 2048;

    @JsonProperty("json_everything_str_builder_size")
    private Integer jsonEverythingStrBuilderSize = 512;

    @JsonProperty("json_str_builder_size")
    private Integer jsonStrBuilderSize = 16384;

    @JsonProperty("log_indexer_task_timeout_ms")
    private Integer logIndexerTaskTimeoutMs = 60000;

    @JsonProperty("log_records_incremental_timeout_ms")
    private Integer logRecordsIncrementalTimeoutMs = 2000;

    @JsonProperty("log_records_task_timeout_ms")
    private Integer logRecordsTaskTimeoutMs = 1000;

    @JsonProperty("max_batch_duration_ms")
    private Integer maxBatchDurationMs = 500;

    @JsonProperty("max_batch_size")
    private Integer maxBatchSize = 10;

    @JsonProperty("max_files_per_index")
    private Integer maxFilesPerIndex = 2000;

    @JsonProperty("max_indices_events")
    private Integer maxIndicesEvents = 8;

    @JsonProperty("max_indices_per_vs")
    private Integer maxIndicesPerVs = 5;

    @JsonProperty("max_indices_system")
    private Integer maxIndicesSystem = 20;

    @JsonProperty("max_logs_per_index")
    private Integer maxLogsPerIndex = 2000000;

    @JsonProperty("max_num_workers")
    private Integer maxNumWorkers = 10;

    @JsonProperty("max_queue_size")
    private Integer maxQueueSize = 20;

    @JsonProperty("max_size_per_index_mb")
    private Integer maxSizePerIndexMb = 400;

    @JsonProperty("nf_protection_time_minutes")
    private Integer nfProtectionTimeMinutes = 30;

    @JsonProperty("opensearch_host")
    private String opensearchHost = "localhost";

    @JsonProperty("opensearch_num_replicas")
    private Integer opensearchNumReplicas = 0;

    @JsonProperty("opensearch_num_shards")
    private Integer opensearchNumShards = 1;

    @JsonProperty("opensearch_port")
    private String opensearchPort = "9200";

    @JsonProperty("query_queue_buffer_size")
    private Integer queryQueueBufferSize = 100;

    @JsonProperty("query_worker_count")
    private Integer queryWorkerCount = 8;

    @JsonProperty("records_status_queue_buffer_size")
    private Integer recordsStatusQueueBufferSize = 100;

    @JsonProperty("records_status_worker_count")
    private Integer recordsStatusWorkerCount = 8;

    @JsonProperty("reserved_1")
    private String reserved1;

    @JsonProperty("reserved_2")
    private String reserved2;

    @JsonProperty("reserved_3")
    private Integer reserved3;

    @JsonProperty("reserved_4")
    private Integer reserved4;

    @JsonProperty("search_query_timeout_ms")
    private Integer searchQueryTimeoutMs = 15000;

    @JsonProperty("task_re_enqueue_wait_time_seconds")
    private Integer taskReEnqueueWaitTimeSeconds = 1;

    @JsonProperty("telemetry_trace_log_level")
    private String telemetryTraceLogLevel;

    @JsonProperty("telemetry_trace_percentage")
    private Integer telemetryTracePercentage = 100;

    @JsonProperty("udf_protection_time_minutes")
    private Integer udfProtectionTimeMinutes = 60;



    /**
     * This is the getter method this will return the attribute value.
     * Delete protection time for adf indices in minutes.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1380.
     * @return adfProtectionTimeMinutes
     */
    public Integer getAdfProtectionTimeMinutes() {
        return adfProtectionTimeMinutes;
    }

    /**
     * This is the setter method to the attribute.
     * Delete protection time for adf indices in minutes.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1380.
     * @param adfProtectionTimeMinutes set the adfProtectionTimeMinutes.
     */
    public void setAdfProtectionTimeMinutes(Integer  adfProtectionTimeMinutes) {
        this.adfProtectionTimeMinutes = adfProtectionTimeMinutes;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Buffer size for batch queues.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @return batchQueueBufferSize
     */
    public Integer getBatchQueueBufferSize() {
        return batchQueueBufferSize;
    }

    /**
     * This is the setter method to the attribute.
     * Buffer size for batch queues.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @param batchQueueBufferSize set the batchQueueBufferSize.
     */
    public void setBatchQueueBufferSize(Integer  batchQueueBufferSize) {
        this.batchQueueBufferSize = batchQueueBufferSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of workers for batch processing.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @return batchWorkerCount
     */
    public Integer getBatchWorkerCount() {
        return batchWorkerCount;
    }

    /**
     * This is the setter method to the attribute.
     * Number of workers for batch processing.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @param batchWorkerCount set the batchWorkerCount.
     */
    public void setBatchWorkerCount(Integer  batchWorkerCount) {
        this.batchWorkerCount = batchWorkerCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Size of bulk payload buffer.
     * This is the max bulk payload size.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 11000000.
     * @return bulkPayloadStringSize
     */
    public Integer getBulkPayloadStringSize() {
        return bulkPayloadStringSize;
    }

    /**
     * This is the setter method to the attribute.
     * Size of bulk payload buffer.
     * This is the max bulk payload size.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 11000000.
     * @param bulkPayloadStringSize set the bulkPayloadStringSize.
     */
    public void setBulkPayloadStringSize(Integer  bulkPayloadStringSize) {
        this.bulkPayloadStringSize = bulkPayloadStringSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Cache cleanup delay in milliseconds.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 300000.
     * @return cacheCleanupDelayMs
     */
    public Integer getCacheCleanupDelayMs() {
        return cacheCleanupDelayMs;
    }

    /**
     * This is the setter method to the attribute.
     * Cache cleanup delay in milliseconds.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 300000.
     * @param cacheCleanupDelayMs set the cacheCleanupDelayMs.
     */
    public void setCacheCleanupDelayMs(Integer  cacheCleanupDelayMs) {
        this.cacheCleanupDelayMs = cacheCleanupDelayMs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timeout for the client to create an index in seconds.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @return clientIndexOpTimeoutSeconds
     */
    public Integer getClientIndexOpTimeoutSeconds() {
        return clientIndexOpTimeoutSeconds;
    }

    /**
     * This is the setter method to the attribute.
     * Timeout for the client to create an index in seconds.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @param clientIndexOpTimeoutSeconds set the clientIndexOpTimeoutSeconds.
     */
    public void setClientIndexOpTimeoutSeconds(Integer  clientIndexOpTimeoutSeconds) {
        this.clientIndexOpTimeoutSeconds = clientIndexOpTimeoutSeconds;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Database notification channel capacity.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
     * @return dbNotifnChanCapacity
     */
    public Integer getDbNotifnChanCapacity() {
        return dbNotifnChanCapacity;
    }

    /**
     * This is the setter method to the attribute.
     * Database notification channel capacity.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
     * @param dbNotifnChanCapacity set the dbNotifnChanCapacity.
     */
    public void setDbNotifnChanCapacity(Integer  dbNotifnChanCapacity) {
        this.dbNotifnChanCapacity = dbNotifnChanCapacity;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the entity.
     * It is a reference to an object of type virtualservice.
     * Field introduced in 21.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return entityRef
     */
    public String getEntityRef() {
        return entityRef;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the entity.
     * It is a reference to an object of type virtualservice.
     * Field introduced in 21.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param entityRef set the entityRef.
     */
    public void setEntityRef(String  entityRef) {
        this.entityRef = entityRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Go garbage collection percentage.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 50.
     * @return goGcPercent
     */
    public Integer getGoGcPercent() {
        return goGcPercent;
    }

    /**
     * This is the setter method to the attribute.
     * Go garbage collection percentage.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 50.
     * @param goGcPercent set the goGcPercent.
     */
    public void setGoGcPercent(Integer  goGcPercent) {
        this.goGcPercent = goGcPercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Incremental timeout buffer in milliseconds.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
     * @return incrementalTimeoutBufferMs
     */
    public Integer getIncrementalTimeoutBufferMs() {
        return incrementalTimeoutBufferMs;
    }

    /**
     * This is the setter method to the attribute.
     * Incremental timeout buffer in milliseconds.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
     * @param incrementalTimeoutBufferMs set the incrementalTimeoutBufferMs.
     */
    public void setIncrementalTimeoutBufferMs(Integer  incrementalTimeoutBufferMs) {
        this.incrementalTimeoutBufferMs = incrementalTimeoutBufferMs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Index cleaner interval in minutes.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @return indexCleanerIntervalMinutes
     */
    public Integer getIndexCleanerIntervalMinutes() {
        return indexCleanerIntervalMinutes;
    }

    /**
     * This is the setter method to the attribute.
     * Index cleaner interval in minutes.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @param indexCleanerIntervalMinutes set the indexCleanerIntervalMinutes.
     */
    public void setIndexCleanerIntervalMinutes(Integer  indexCleanerIntervalMinutes) {
        this.indexCleanerIntervalMinutes = indexCleanerIntervalMinutes;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Base path for search engine mappings and settings.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "/var/lib/avi/indexer_configs".
     * @return indexConfigPath
     */
    public String getIndexConfigPath() {
        return indexConfigPath;
    }

    /**
     * This is the setter method to the attribute.
     * Base path for search engine mappings and settings.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "/var/lib/avi/indexer_configs".
     * @param indexConfigPath set the indexConfigPath.
     */
    public void setIndexConfigPath(String  indexConfigPath) {
        this.indexConfigPath = indexConfigPath;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Index retention period in minutes.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1440.
     * @return indexRetentionPeriodMinutes
     */
    public Integer getIndexRetentionPeriodMinutes() {
        return indexRetentionPeriodMinutes;
    }

    /**
     * This is the setter method to the attribute.
     * Index retention period in minutes.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1440.
     * @param indexRetentionPeriodMinutes set the indexRetentionPeriodMinutes.
     */
    public void setIndexRetentionPeriodMinutes(Integer  indexRetentionPeriodMinutes) {
        this.indexRetentionPeriodMinutes = indexRetentionPeriodMinutes;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Buffer size for index status queue.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @return indexStatusQueueBufferSize
     */
    public Integer getIndexStatusQueueBufferSize() {
        return indexStatusQueueBufferSize;
    }

    /**
     * This is the setter method to the attribute.
     * Buffer size for index status queue.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @param indexStatusQueueBufferSize set the indexStatusQueueBufferSize.
     */
    public void setIndexStatusQueueBufferSize(Integer  indexStatusQueueBufferSize) {
        this.indexStatusQueueBufferSize = indexStatusQueueBufferSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Renderer configuration - json all string builder size.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2048.
     * @return jsonAllStrBuilderSize
     */
    public Integer getJsonAllStrBuilderSize() {
        return jsonAllStrBuilderSize;
    }

    /**
     * This is the setter method to the attribute.
     * Renderer configuration - json all string builder size.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2048.
     * @param jsonAllStrBuilderSize set the jsonAllStrBuilderSize.
     */
    public void setJsonAllStrBuilderSize(Integer  jsonAllStrBuilderSize) {
        this.jsonAllStrBuilderSize = jsonAllStrBuilderSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Renderer configuration - json everything string builder size.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 512.
     * @return jsonEverythingStrBuilderSize
     */
    public Integer getJsonEverythingStrBuilderSize() {
        return jsonEverythingStrBuilderSize;
    }

    /**
     * This is the setter method to the attribute.
     * Renderer configuration - json everything string builder size.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 512.
     * @param jsonEverythingStrBuilderSize set the jsonEverythingStrBuilderSize.
     */
    public void setJsonEverythingStrBuilderSize(Integer  jsonEverythingStrBuilderSize) {
        this.jsonEverythingStrBuilderSize = jsonEverythingStrBuilderSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Renderer configuration - json string builder size.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 16384.
     * @return jsonStrBuilderSize
     */
    public Integer getJsonStrBuilderSize() {
        return jsonStrBuilderSize;
    }

    /**
     * This is the setter method to the attribute.
     * Renderer configuration - json string builder size.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 16384.
     * @param jsonStrBuilderSize set the jsonStrBuilderSize.
     */
    public void setJsonStrBuilderSize(Integer  jsonStrBuilderSize) {
        this.jsonStrBuilderSize = jsonStrBuilderSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Log indexer task timeout in milliseconds.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60000.
     * @return logIndexerTaskTimeoutMs
     */
    public Integer getLogIndexerTaskTimeoutMs() {
        return logIndexerTaskTimeoutMs;
    }

    /**
     * This is the setter method to the attribute.
     * Log indexer task timeout in milliseconds.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60000.
     * @param logIndexerTaskTimeoutMs set the logIndexerTaskTimeoutMs.
     */
    public void setLogIndexerTaskTimeoutMs(Integer  logIndexerTaskTimeoutMs) {
        this.logIndexerTaskTimeoutMs = logIndexerTaskTimeoutMs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Log records incremental timeout in milliseconds.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
     * @return logRecordsIncrementalTimeoutMs
     */
    public Integer getLogRecordsIncrementalTimeoutMs() {
        return logRecordsIncrementalTimeoutMs;
    }

    /**
     * This is the setter method to the attribute.
     * Log records incremental timeout in milliseconds.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
     * @param logRecordsIncrementalTimeoutMs set the logRecordsIncrementalTimeoutMs.
     */
    public void setLogRecordsIncrementalTimeoutMs(Integer  logRecordsIncrementalTimeoutMs) {
        this.logRecordsIncrementalTimeoutMs = logRecordsIncrementalTimeoutMs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Log records task timeout in milliseconds.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
     * @return logRecordsTaskTimeoutMs
     */
    public Integer getLogRecordsTaskTimeoutMs() {
        return logRecordsTaskTimeoutMs;
    }

    /**
     * This is the setter method to the attribute.
     * Log records task timeout in milliseconds.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
     * @param logRecordsTaskTimeoutMs set the logRecordsTaskTimeoutMs.
     */
    public void setLogRecordsTaskTimeoutMs(Integer  logRecordsTaskTimeoutMs) {
        this.logRecordsTaskTimeoutMs = logRecordsTaskTimeoutMs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum duration to wait for batching files to indexer.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 500.
     * @return maxBatchDurationMs
     */
    public Integer getMaxBatchDurationMs() {
        return maxBatchDurationMs;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum duration to wait for batching files to indexer.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 500.
     * @param maxBatchDurationMs set the maxBatchDurationMs.
     */
    public void setMaxBatchDurationMs(Integer  maxBatchDurationMs) {
        this.maxBatchDurationMs = maxBatchDurationMs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of files in a batch to indexer.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return maxBatchSize
     */
    public Integer getMaxBatchSize() {
        return maxBatchSize;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of files in a batch to indexer.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param maxBatchSize set the maxBatchSize.
     */
    public void setMaxBatchSize(Integer  maxBatchSize) {
        this.maxBatchSize = maxBatchSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of files per index.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
     * @return maxFilesPerIndex
     */
    public Integer getMaxFilesPerIndex() {
        return maxFilesPerIndex;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of files per index.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
     * @param maxFilesPerIndex set the maxFilesPerIndex.
     */
    public void setMaxFilesPerIndex(Integer  maxFilesPerIndex) {
        this.maxFilesPerIndex = maxFilesPerIndex;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of indices for events.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @return maxIndicesEvents
     */
    public Integer getMaxIndicesEvents() {
        return maxIndicesEvents;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of indices for events.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @param maxIndicesEvents set the maxIndicesEvents.
     */
    public void setMaxIndicesEvents(Integer  maxIndicesEvents) {
        this.maxIndicesEvents = maxIndicesEvents;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of indices per vs.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @return maxIndicesPerVs
     */
    public Integer getMaxIndicesPerVs() {
        return maxIndicesPerVs;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of indices per vs.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @param maxIndicesPerVs set the maxIndicesPerVs.
     */
    public void setMaxIndicesPerVs(Integer  maxIndicesPerVs) {
        this.maxIndicesPerVs = maxIndicesPerVs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of indices for system.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.
     * @return maxIndicesSystem
     */
    public Integer getMaxIndicesSystem() {
        return maxIndicesSystem;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of indices for system.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.
     * @param maxIndicesSystem set the maxIndicesSystem.
     */
    public void setMaxIndicesSystem(Integer  maxIndicesSystem) {
        this.maxIndicesSystem = maxIndicesSystem;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of logs per index.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2000000.
     * @return maxLogsPerIndex
     */
    public Integer getMaxLogsPerIndex() {
        return maxLogsPerIndex;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of logs per index.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2000000.
     * @param maxLogsPerIndex set the maxLogsPerIndex.
     */
    public void setMaxLogsPerIndex(Integer  maxLogsPerIndex) {
        this.maxLogsPerIndex = maxLogsPerIndex;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of goroutines for indexer_worker.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return maxNumWorkers
     */
    public Integer getMaxNumWorkers() {
        return maxNumWorkers;
    }

    /**
     * This is the setter method to the attribute.
     * Number of goroutines for indexer_worker.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param maxNumWorkers set the maxNumWorkers.
     */
    public void setMaxNumWorkers(Integer  maxNumWorkers) {
        this.maxNumWorkers = maxNumWorkers;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Max number of index task requests taken by indexer.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.
     * @return maxQueueSize
     */
    public Integer getMaxQueueSize() {
        return maxQueueSize;
    }

    /**
     * This is the setter method to the attribute.
     * Max number of index task requests taken by indexer.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.
     * @param maxQueueSize set the maxQueueSize.
     */
    public void setMaxQueueSize(Integer  maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum size per index in mb.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 400.
     * @return maxSizePerIndexMb
     */
    public Integer getMaxSizePerIndexMb() {
        return maxSizePerIndexMb;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum size per index in mb.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 400.
     * @param maxSizePerIndexMb set the maxSizePerIndexMb.
     */
    public void setMaxSizePerIndexMb(Integer  maxSizePerIndexMb) {
        this.maxSizePerIndexMb = maxSizePerIndexMb;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Delete protection time for nf indices in minutes.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @return nfProtectionTimeMinutes
     */
    public Integer getNfProtectionTimeMinutes() {
        return nfProtectionTimeMinutes;
    }

    /**
     * This is the setter method to the attribute.
     * Delete protection time for nf indices in minutes.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @param nfProtectionTimeMinutes set the nfProtectionTimeMinutes.
     */
    public void setNfProtectionTimeMinutes(Integer  nfProtectionTimeMinutes) {
        this.nfProtectionTimeMinutes = nfProtectionTimeMinutes;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Opensearch host.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "localhost".
     * @return opensearchHost
     */
    public String getOpensearchHost() {
        return opensearchHost;
    }

    /**
     * This is the setter method to the attribute.
     * Opensearch host.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "localhost".
     * @param opensearchHost set the opensearchHost.
     */
    public void setOpensearchHost(String  opensearchHost) {
        this.opensearchHost = opensearchHost;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of replicas for opensearch.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return opensearchNumReplicas
     */
    public Integer getOpensearchNumReplicas() {
        return opensearchNumReplicas;
    }

    /**
     * This is the setter method to the attribute.
     * Number of replicas for opensearch.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param opensearchNumReplicas set the opensearchNumReplicas.
     */
    public void setOpensearchNumReplicas(Integer  opensearchNumReplicas) {
        this.opensearchNumReplicas = opensearchNumReplicas;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of shards for opensearch.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return opensearchNumShards
     */
    public Integer getOpensearchNumShards() {
        return opensearchNumShards;
    }

    /**
     * This is the setter method to the attribute.
     * Number of shards for opensearch.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param opensearchNumShards set the opensearchNumShards.
     */
    public void setOpensearchNumShards(Integer  opensearchNumShards) {
        this.opensearchNumShards = opensearchNumShards;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Opensearch port.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "9200".
     * @return opensearchPort
     */
    public String getOpensearchPort() {
        return opensearchPort;
    }

    /**
     * This is the setter method to the attribute.
     * Opensearch port.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "9200".
     * @param opensearchPort set the opensearchPort.
     */
    public void setOpensearchPort(String  opensearchPort) {
        this.opensearchPort = opensearchPort;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Buffer size for query queues.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @return queryQueueBufferSize
     */
    public Integer getQueryQueueBufferSize() {
        return queryQueueBufferSize;
    }

    /**
     * This is the setter method to the attribute.
     * Buffer size for query queues.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @param queryQueueBufferSize set the queryQueueBufferSize.
     */
    public void setQueryQueueBufferSize(Integer  queryQueueBufferSize) {
        this.queryQueueBufferSize = queryQueueBufferSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of workers for query processing.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @return queryWorkerCount
     */
    public Integer getQueryWorkerCount() {
        return queryWorkerCount;
    }

    /**
     * This is the setter method to the attribute.
     * Number of workers for query processing.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @param queryWorkerCount set the queryWorkerCount.
     */
    public void setQueryWorkerCount(Integer  queryWorkerCount) {
        this.queryWorkerCount = queryWorkerCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Buffer size for records status queue.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @return recordsStatusQueueBufferSize
     */
    public Integer getRecordsStatusQueueBufferSize() {
        return recordsStatusQueueBufferSize;
    }

    /**
     * This is the setter method to the attribute.
     * Buffer size for records status queue.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @param recordsStatusQueueBufferSize set the recordsStatusQueueBufferSize.
     */
    public void setRecordsStatusQueueBufferSize(Integer  recordsStatusQueueBufferSize) {
        this.recordsStatusQueueBufferSize = recordsStatusQueueBufferSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of workers for records status processing.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @return recordsStatusWorkerCount
     */
    public Integer getRecordsStatusWorkerCount() {
        return recordsStatusWorkerCount;
    }

    /**
     * This is the setter method to the attribute.
     * Number of workers for records status processing.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @param recordsStatusWorkerCount set the recordsStatusWorkerCount.
     */
    public void setRecordsStatusWorkerCount(Integer  recordsStatusWorkerCount) {
        this.recordsStatusWorkerCount = recordsStatusWorkerCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reserved field for future use.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reserved1
     */
    public String getReserved1() {
        return reserved1;
    }

    /**
     * This is the setter method to the attribute.
     * Reserved field for future use.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reserved1 set the reserved1.
     */
    public void setReserved1(String  reserved1) {
        this.reserved1 = reserved1;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reserved field for future use.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reserved2
     */
    public String getReserved2() {
        return reserved2;
    }

    /**
     * This is the setter method to the attribute.
     * Reserved field for future use.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reserved2 set the reserved2.
     */
    public void setReserved2(String  reserved2) {
        this.reserved2 = reserved2;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reserved field for future use.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reserved3
     */
    public Integer getReserved3() {
        return reserved3;
    }

    /**
     * This is the setter method to the attribute.
     * Reserved field for future use.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reserved3 set the reserved3.
     */
    public void setReserved3(Integer  reserved3) {
        this.reserved3 = reserved3;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reserved field for future use.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reserved4
     */
    public Integer getReserved4() {
        return reserved4;
    }

    /**
     * This is the setter method to the attribute.
     * Reserved field for future use.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reserved4 set the reserved4.
     */
    public void setReserved4(Integer  reserved4) {
        this.reserved4 = reserved4;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Search query timeout in milliseconds.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 15000.
     * @return searchQueryTimeoutMs
     */
    public Integer getSearchQueryTimeoutMs() {
        return searchQueryTimeoutMs;
    }

    /**
     * This is the setter method to the attribute.
     * Search query timeout in milliseconds.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 15000.
     * @param searchQueryTimeoutMs set the searchQueryTimeoutMs.
     */
    public void setSearchQueryTimeoutMs(Integer  searchQueryTimeoutMs) {
        this.searchQueryTimeoutMs = searchQueryTimeoutMs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Wait time before re-enqueueing failed tasks in seconds.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return taskReEnqueueWaitTimeSeconds
     */
    public Integer getTaskReEnqueueWaitTimeSeconds() {
        return taskReEnqueueWaitTimeSeconds;
    }

    /**
     * This is the setter method to the attribute.
     * Wait time before re-enqueueing failed tasks in seconds.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param taskReEnqueueWaitTimeSeconds set the taskReEnqueueWaitTimeSeconds.
     */
    public void setTaskReEnqueueWaitTimeSeconds(Integer  taskReEnqueueWaitTimeSeconds) {
        this.taskReEnqueueWaitTimeSeconds = taskReEnqueueWaitTimeSeconds;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Set the log level for telemetry trace logs.
     * Enum options - LOG_LEVEL_DISABLED, LOG_LEVEL_INFO, LOG_LEVEL_WARNING, LOG_LEVEL_ERROR, LOG_LEVEL_DEBUG.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return telemetryTraceLogLevel
     */
    public String getTelemetryTraceLogLevel() {
        return telemetryTraceLogLevel;
    }

    /**
     * This is the setter method to the attribute.
     * Set the log level for telemetry trace logs.
     * Enum options - LOG_LEVEL_DISABLED, LOG_LEVEL_INFO, LOG_LEVEL_WARNING, LOG_LEVEL_ERROR, LOG_LEVEL_DEBUG.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param telemetryTraceLogLevel set the telemetryTraceLogLevel.
     */
    public void setTelemetryTraceLogLevel(String  telemetryTraceLogLevel) {
        this.telemetryTraceLogLevel = telemetryTraceLogLevel;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Telemetry trace percentage.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @return telemetryTracePercentage
     */
    public Integer getTelemetryTracePercentage() {
        return telemetryTracePercentage;
    }

    /**
     * This is the setter method to the attribute.
     * Telemetry trace percentage.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @param telemetryTracePercentage set the telemetryTracePercentage.
     */
    public void setTelemetryTracePercentage(Integer  telemetryTracePercentage) {
        this.telemetryTracePercentage = telemetryTracePercentage;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Delete protection time for udf indices in minutes.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @return udfProtectionTimeMinutes
     */
    public Integer getUdfProtectionTimeMinutes() {
        return udfProtectionTimeMinutes;
    }

    /**
     * This is the setter method to the attribute.
     * Delete protection time for udf indices in minutes.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @param udfProtectionTimeMinutes set the udfProtectionTimeMinutes.
     */
    public void setUdfProtectionTimeMinutes(Integer  udfProtectionTimeMinutes) {
        this.udfProtectionTimeMinutes = udfProtectionTimeMinutes;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      LogManagerDebugFilter objLogManagerDebugFilter = (LogManagerDebugFilter) o;
      return   Objects.equals(this.entityRef, objLogManagerDebugFilter.entityRef)&&
  Objects.equals(this.telemetryTraceLogLevel, objLogManagerDebugFilter.telemetryTraceLogLevel)&&
  Objects.equals(this.bulkPayloadStringSize, objLogManagerDebugFilter.bulkPayloadStringSize)&&
  Objects.equals(this.maxNumWorkers, objLogManagerDebugFilter.maxNumWorkers)&&
  Objects.equals(this.maxQueueSize, objLogManagerDebugFilter.maxQueueSize)&&
  Objects.equals(this.taskReEnqueueWaitTimeSeconds, objLogManagerDebugFilter.taskReEnqueueWaitTimeSeconds)&&
  Objects.equals(this.jsonStrBuilderSize, objLogManagerDebugFilter.jsonStrBuilderSize)&&
  Objects.equals(this.jsonAllStrBuilderSize, objLogManagerDebugFilter.jsonAllStrBuilderSize)&&
  Objects.equals(this.jsonEverythingStrBuilderSize, objLogManagerDebugFilter.jsonEverythingStrBuilderSize)&&
  Objects.equals(this.indexConfigPath, objLogManagerDebugFilter.indexConfigPath)&&
  Objects.equals(this.maxFilesPerIndex, objLogManagerDebugFilter.maxFilesPerIndex)&&
  Objects.equals(this.clientIndexOpTimeoutSeconds, objLogManagerDebugFilter.clientIndexOpTimeoutSeconds)&&
  Objects.equals(this.maxIndicesPerVs, objLogManagerDebugFilter.maxIndicesPerVs)&&
  Objects.equals(this.maxLogsPerIndex, objLogManagerDebugFilter.maxLogsPerIndex)&&
  Objects.equals(this.maxSizePerIndexMb, objLogManagerDebugFilter.maxSizePerIndexMb)&&
  Objects.equals(this.indexRetentionPeriodMinutes, objLogManagerDebugFilter.indexRetentionPeriodMinutes)&&
  Objects.equals(this.indexCleanerIntervalMinutes, objLogManagerDebugFilter.indexCleanerIntervalMinutes)&&
  Objects.equals(this.maxIndicesEvents, objLogManagerDebugFilter.maxIndicesEvents)&&
  Objects.equals(this.maxIndicesSystem, objLogManagerDebugFilter.maxIndicesSystem)&&
  Objects.equals(this.adfProtectionTimeMinutes, objLogManagerDebugFilter.adfProtectionTimeMinutes)&&
  Objects.equals(this.udfProtectionTimeMinutes, objLogManagerDebugFilter.udfProtectionTimeMinutes)&&
  Objects.equals(this.nfProtectionTimeMinutes, objLogManagerDebugFilter.nfProtectionTimeMinutes)&&
  Objects.equals(this.opensearchHost, objLogManagerDebugFilter.opensearchHost)&&
  Objects.equals(this.opensearchPort, objLogManagerDebugFilter.opensearchPort)&&
  Objects.equals(this.opensearchNumShards, objLogManagerDebugFilter.opensearchNumShards)&&
  Objects.equals(this.opensearchNumReplicas, objLogManagerDebugFilter.opensearchNumReplicas)&&
  Objects.equals(this.reserved1, objLogManagerDebugFilter.reserved1)&&
  Objects.equals(this.reserved2, objLogManagerDebugFilter.reserved2)&&
  Objects.equals(this.reserved3, objLogManagerDebugFilter.reserved3)&&
  Objects.equals(this.reserved4, objLogManagerDebugFilter.reserved4)&&
  Objects.equals(this.dbNotifnChanCapacity, objLogManagerDebugFilter.dbNotifnChanCapacity)&&
  Objects.equals(this.maxBatchSize, objLogManagerDebugFilter.maxBatchSize)&&
  Objects.equals(this.maxBatchDurationMs, objLogManagerDebugFilter.maxBatchDurationMs)&&
  Objects.equals(this.telemetryTracePercentage, objLogManagerDebugFilter.telemetryTracePercentage)&&
  Objects.equals(this.logRecordsTaskTimeoutMs, objLogManagerDebugFilter.logRecordsTaskTimeoutMs)&&
  Objects.equals(this.logIndexerTaskTimeoutMs, objLogManagerDebugFilter.logIndexerTaskTimeoutMs)&&
  Objects.equals(this.searchQueryTimeoutMs, objLogManagerDebugFilter.searchQueryTimeoutMs)&&
  Objects.equals(this.goGcPercent, objLogManagerDebugFilter.goGcPercent)&&
  Objects.equals(this.queryWorkerCount, objLogManagerDebugFilter.queryWorkerCount)&&
  Objects.equals(this.recordsStatusWorkerCount, objLogManagerDebugFilter.recordsStatusWorkerCount)&&
  Objects.equals(this.batchWorkerCount, objLogManagerDebugFilter.batchWorkerCount)&&
  Objects.equals(this.queryQueueBufferSize, objLogManagerDebugFilter.queryQueueBufferSize)&&
  Objects.equals(this.recordsStatusQueueBufferSize, objLogManagerDebugFilter.recordsStatusQueueBufferSize)&&
  Objects.equals(this.batchQueueBufferSize, objLogManagerDebugFilter.batchQueueBufferSize)&&
  Objects.equals(this.indexStatusQueueBufferSize, objLogManagerDebugFilter.indexStatusQueueBufferSize)&&
  Objects.equals(this.cacheCleanupDelayMs, objLogManagerDebugFilter.cacheCleanupDelayMs)&&
  Objects.equals(this.logRecordsIncrementalTimeoutMs, objLogManagerDebugFilter.logRecordsIncrementalTimeoutMs)&&
  Objects.equals(this.incrementalTimeoutBufferMs, objLogManagerDebugFilter.incrementalTimeoutBufferMs);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LogManagerDebugFilter {\n");
                  sb.append("    adfProtectionTimeMinutes: ").append(toIndentedString(adfProtectionTimeMinutes)).append("\n");
                        sb.append("    batchQueueBufferSize: ").append(toIndentedString(batchQueueBufferSize)).append("\n");
                        sb.append("    batchWorkerCount: ").append(toIndentedString(batchWorkerCount)).append("\n");
                        sb.append("    bulkPayloadStringSize: ").append(toIndentedString(bulkPayloadStringSize)).append("\n");
                        sb.append("    cacheCleanupDelayMs: ").append(toIndentedString(cacheCleanupDelayMs)).append("\n");
                        sb.append("    clientIndexOpTimeoutSeconds: ").append(toIndentedString(clientIndexOpTimeoutSeconds)).append("\n");
                        sb.append("    dbNotifnChanCapacity: ").append(toIndentedString(dbNotifnChanCapacity)).append("\n");
                        sb.append("    entityRef: ").append(toIndentedString(entityRef)).append("\n");
                        sb.append("    goGcPercent: ").append(toIndentedString(goGcPercent)).append("\n");
                        sb.append("    incrementalTimeoutBufferMs: ").append(toIndentedString(incrementalTimeoutBufferMs)).append("\n");
                        sb.append("    indexCleanerIntervalMinutes: ").append(toIndentedString(indexCleanerIntervalMinutes)).append("\n");
                        sb.append("    indexConfigPath: ").append(toIndentedString(indexConfigPath)).append("\n");
                        sb.append("    indexRetentionPeriodMinutes: ").append(toIndentedString(indexRetentionPeriodMinutes)).append("\n");
                        sb.append("    indexStatusQueueBufferSize: ").append(toIndentedString(indexStatusQueueBufferSize)).append("\n");
                        sb.append("    jsonAllStrBuilderSize: ").append(toIndentedString(jsonAllStrBuilderSize)).append("\n");
                        sb.append("    jsonEverythingStrBuilderSize: ").append(toIndentedString(jsonEverythingStrBuilderSize)).append("\n");
                        sb.append("    jsonStrBuilderSize: ").append(toIndentedString(jsonStrBuilderSize)).append("\n");
                        sb.append("    logIndexerTaskTimeoutMs: ").append(toIndentedString(logIndexerTaskTimeoutMs)).append("\n");
                        sb.append("    logRecordsIncrementalTimeoutMs: ").append(toIndentedString(logRecordsIncrementalTimeoutMs)).append("\n");
                        sb.append("    logRecordsTaskTimeoutMs: ").append(toIndentedString(logRecordsTaskTimeoutMs)).append("\n");
                        sb.append("    maxBatchDurationMs: ").append(toIndentedString(maxBatchDurationMs)).append("\n");
                        sb.append("    maxBatchSize: ").append(toIndentedString(maxBatchSize)).append("\n");
                        sb.append("    maxFilesPerIndex: ").append(toIndentedString(maxFilesPerIndex)).append("\n");
                        sb.append("    maxIndicesEvents: ").append(toIndentedString(maxIndicesEvents)).append("\n");
                        sb.append("    maxIndicesPerVs: ").append(toIndentedString(maxIndicesPerVs)).append("\n");
                        sb.append("    maxIndicesSystem: ").append(toIndentedString(maxIndicesSystem)).append("\n");
                        sb.append("    maxLogsPerIndex: ").append(toIndentedString(maxLogsPerIndex)).append("\n");
                        sb.append("    maxNumWorkers: ").append(toIndentedString(maxNumWorkers)).append("\n");
                        sb.append("    maxQueueSize: ").append(toIndentedString(maxQueueSize)).append("\n");
                        sb.append("    maxSizePerIndexMb: ").append(toIndentedString(maxSizePerIndexMb)).append("\n");
                        sb.append("    nfProtectionTimeMinutes: ").append(toIndentedString(nfProtectionTimeMinutes)).append("\n");
                        sb.append("    opensearchHost: ").append(toIndentedString(opensearchHost)).append("\n");
                        sb.append("    opensearchNumReplicas: ").append(toIndentedString(opensearchNumReplicas)).append("\n");
                        sb.append("    opensearchNumShards: ").append(toIndentedString(opensearchNumShards)).append("\n");
                        sb.append("    opensearchPort: ").append(toIndentedString(opensearchPort)).append("\n");
                        sb.append("    queryQueueBufferSize: ").append(toIndentedString(queryQueueBufferSize)).append("\n");
                        sb.append("    queryWorkerCount: ").append(toIndentedString(queryWorkerCount)).append("\n");
                        sb.append("    recordsStatusQueueBufferSize: ").append(toIndentedString(recordsStatusQueueBufferSize)).append("\n");
                        sb.append("    recordsStatusWorkerCount: ").append(toIndentedString(recordsStatusWorkerCount)).append("\n");
                        sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
                        sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
                        sb.append("    reserved3: ").append(toIndentedString(reserved3)).append("\n");
                        sb.append("    reserved4: ").append(toIndentedString(reserved4)).append("\n");
                        sb.append("    searchQueryTimeoutMs: ").append(toIndentedString(searchQueryTimeoutMs)).append("\n");
                        sb.append("    taskReEnqueueWaitTimeSeconds: ").append(toIndentedString(taskReEnqueueWaitTimeSeconds)).append("\n");
                        sb.append("    telemetryTraceLogLevel: ").append(toIndentedString(telemetryTraceLogLevel)).append("\n");
                        sb.append("    telemetryTracePercentage: ").append(toIndentedString(telemetryTracePercentage)).append("\n");
                        sb.append("    udfProtectionTimeMinutes: ").append(toIndentedString(udfProtectionTimeMinutes)).append("\n");
                  sb.append("}");
      return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
      if (o == null) {
          return "null";
      }
      return o.toString().replace("\n", "\n    ");
    }
}

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
 * The MetricsApiSrvDebugFilter is a POJO class extends AviRestResource that used for creating
 * MetricsApiSrvDebugFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetricsApiSrvDebugFilter  {
    @JsonProperty("db_stats_num_snapshots")
    private Integer dbStatsNumSnapshots;

    @JsonProperty("db_stats_snapshot_period_hours")
    private Integer dbStatsSnapshotPeriodHours;

    @JsonProperty("entity_ref")
    private String entityRef;

    @JsonProperty("mapi_perf_stats_enabled")
    private Boolean mapiPerfStatsEnabled;

    @JsonProperty("mapi_req_history_entity_type_filters")
    private List<String> mapiReqHistoryEntityTypeFilters;

    @JsonProperty("mapi_req_history_entity_uuid_filters")
    private List<String> mapiReqHistoryEntityUuidFilters;

    @JsonProperty("mapi_req_history_metric_id_filters")
    private List<String> mapiReqHistoryMetricIdFilters;

    @JsonProperty("mapi_req_history_num_records")
    private Integer mapiReqHistoryNumRecords;

    @JsonProperty("mapi_req_history_se_uuid_filters")
    private List<String> mapiReqHistorySeUuidFilters;

    @JsonProperty("mapi_stats_log_period_hours")
    private Integer mapiStatsLogPeriodHours;

    @JsonProperty("metrics_db_rd_boundary_window_min")
    private Integer metricsDbRdBoundaryWindowMin;

    @JsonProperty("metrics_db_rd_check_interval_sec")
    private Integer metricsDbRdCheckIntervalSec;

    @JsonProperty("metrics_db_rd_lag_stale_after_sec")
    private Integer metricsDbRdLagStaleAfterSec;

    @JsonProperty("metrics_db_rd_lag_threshold_sec")
    private Integer metricsDbRdLagThresholdSec;

    @JsonProperty("metrics_db_rd_routing_mode")
    private String metricsDbRdRoutingMode;



    /**
     * This is the getter method this will return the attribute value.
     * Number of last-n metrics db query stats snapshots to save.
     * Allowed values are 4-24.
     * Special values are 0- stop taking metrics db query stats snapshots.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dbStatsNumSnapshots
     */
    public Integer getDbStatsNumSnapshots() {
        return dbStatsNumSnapshots;
    }

    /**
     * This is the setter method to the attribute.
     * Number of last-n metrics db query stats snapshots to save.
     * Allowed values are 4-24.
     * Special values are 0- stop taking metrics db query stats snapshots.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dbStatsNumSnapshots set the dbStatsNumSnapshots.
     */
    public void setDbStatsNumSnapshots(Integer  dbStatsNumSnapshots) {
        this.dbStatsNumSnapshots = dbStatsNumSnapshots;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Periodicity in hours of taking snapshots of metrics db query stats.
     * Allowed values are 1-48.
     * Field introduced in 32.1.1.
     * Unit is hours.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dbStatsSnapshotPeriodHours
     */
    public Integer getDbStatsSnapshotPeriodHours() {
        return dbStatsSnapshotPeriodHours;
    }

    /**
     * This is the setter method to the attribute.
     * Periodicity in hours of taking snapshots of metrics db query stats.
     * Allowed values are 1-48.
     * Field introduced in 32.1.1.
     * Unit is hours.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dbStatsSnapshotPeriodHours set the dbStatsSnapshotPeriodHours.
     */
    public void setDbStatsSnapshotPeriodHours(Integer  dbStatsSnapshotPeriodHours) {
        this.dbStatsSnapshotPeriodHours = dbStatsSnapshotPeriodHours;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the entity.
     * It is a reference to an object of type virtualservice.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param entityRef set the entityRef.
     */
    public void setEntityRef(String  entityRef) {
        this.entityRef = entityRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Single knob to enable collection of metrics api server stats.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mapiPerfStatsEnabled
     */
    public Boolean getMapiPerfStatsEnabled() {
        return mapiPerfStatsEnabled;
    }

    /**
     * This is the setter method to the attribute.
     * Single knob to enable collection of metrics api server stats.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mapiPerfStatsEnabled set the mapiPerfStatsEnabled.
     */
    public void setMapiPerfStatsEnabled(Boolean  mapiPerfStatsEnabled) {
        this.mapiPerfStatsEnabled = mapiPerfStatsEnabled;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Maintain query history only for the specified entity type - pool_metrics_entity etc.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mapiReqHistoryEntityTypeFilters
     */
    public List<String> getMapiReqHistoryEntityTypeFilters() {
        return mapiReqHistoryEntityTypeFilters;
    }

    /**
     * This is the setter method. this will set the mapiReqHistoryEntityTypeFilters
     * Maintain query history only for the specified entity type - pool_metrics_entity etc.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mapiReqHistoryEntityTypeFilters
     */
    public void setMapiReqHistoryEntityTypeFilters(List<String>  mapiReqHistoryEntityTypeFilters) {
        this.mapiReqHistoryEntityTypeFilters = mapiReqHistoryEntityTypeFilters;
    }

    /**
     * This is the setter method this will set the mapiReqHistoryEntityTypeFilters
     * Maintain query history only for the specified entity type - pool_metrics_entity etc.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mapiReqHistoryEntityTypeFilters
     */
    public MetricsApiSrvDebugFilter addMapiReqHistoryEntityTypeFiltersItem(String mapiReqHistoryEntityTypeFiltersItem) {
      if (this.mapiReqHistoryEntityTypeFilters == null) {
        this.mapiReqHistoryEntityTypeFilters = new ArrayList<String>();
      }
      this.mapiReqHistoryEntityTypeFilters.add(mapiReqHistoryEntityTypeFiltersItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Maintain query history only for the specified entity uuid.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mapiReqHistoryEntityUuidFilters
     */
    public List<String> getMapiReqHistoryEntityUuidFilters() {
        return mapiReqHistoryEntityUuidFilters;
    }

    /**
     * This is the setter method. this will set the mapiReqHistoryEntityUuidFilters
     * Maintain query history only for the specified entity uuid.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mapiReqHistoryEntityUuidFilters
     */
    public void setMapiReqHistoryEntityUuidFilters(List<String>  mapiReqHistoryEntityUuidFilters) {
        this.mapiReqHistoryEntityUuidFilters = mapiReqHistoryEntityUuidFilters;
    }

    /**
     * This is the setter method this will set the mapiReqHistoryEntityUuidFilters
     * Maintain query history only for the specified entity uuid.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mapiReqHistoryEntityUuidFilters
     */
    public MetricsApiSrvDebugFilter addMapiReqHistoryEntityUuidFiltersItem(String mapiReqHistoryEntityUuidFiltersItem) {
      if (this.mapiReqHistoryEntityUuidFilters == null) {
        this.mapiReqHistoryEntityUuidFilters = new ArrayList<String>();
      }
      this.mapiReqHistoryEntityUuidFilters.add(mapiReqHistoryEntityUuidFiltersItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Maintain query history only for the specified metric id.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mapiReqHistoryMetricIdFilters
     */
    public List<String> getMapiReqHistoryMetricIdFilters() {
        return mapiReqHistoryMetricIdFilters;
    }

    /**
     * This is the setter method. this will set the mapiReqHistoryMetricIdFilters
     * Maintain query history only for the specified metric id.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mapiReqHistoryMetricIdFilters
     */
    public void setMapiReqHistoryMetricIdFilters(List<String>  mapiReqHistoryMetricIdFilters) {
        this.mapiReqHistoryMetricIdFilters = mapiReqHistoryMetricIdFilters;
    }

    /**
     * This is the setter method this will set the mapiReqHistoryMetricIdFilters
     * Maintain query history only for the specified metric id.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mapiReqHistoryMetricIdFilters
     */
    public MetricsApiSrvDebugFilter addMapiReqHistoryMetricIdFiltersItem(String mapiReqHistoryMetricIdFiltersItem) {
      if (this.mapiReqHistoryMetricIdFilters == null) {
        this.mapiReqHistoryMetricIdFilters = new ArrayList<String>();
      }
      this.mapiReqHistoryMetricIdFilters.add(mapiReqHistoryMetricIdFiltersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of last-n metrics api server queries to save.
     * Allowed values are 1-32.
     * Special values are 0- stop saving of last-n metrics api server queries.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mapiReqHistoryNumRecords
     */
    public Integer getMapiReqHistoryNumRecords() {
        return mapiReqHistoryNumRecords;
    }

    /**
     * This is the setter method to the attribute.
     * Number of last-n metrics api server queries to save.
     * Allowed values are 1-32.
     * Special values are 0- stop saving of last-n metrics api server queries.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mapiReqHistoryNumRecords set the mapiReqHistoryNumRecords.
     */
    public void setMapiReqHistoryNumRecords(Integer  mapiReqHistoryNumRecords) {
        this.mapiReqHistoryNumRecords = mapiReqHistoryNumRecords;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Maintain query history only for the specified serviceengine uuid.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mapiReqHistorySeUuidFilters
     */
    public List<String> getMapiReqHistorySeUuidFilters() {
        return mapiReqHistorySeUuidFilters;
    }

    /**
     * This is the setter method. this will set the mapiReqHistorySeUuidFilters
     * Maintain query history only for the specified serviceengine uuid.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mapiReqHistorySeUuidFilters
     */
    public void setMapiReqHistorySeUuidFilters(List<String>  mapiReqHistorySeUuidFilters) {
        this.mapiReqHistorySeUuidFilters = mapiReqHistorySeUuidFilters;
    }

    /**
     * This is the setter method this will set the mapiReqHistorySeUuidFilters
     * Maintain query history only for the specified serviceengine uuid.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mapiReqHistorySeUuidFilters
     */
    public MetricsApiSrvDebugFilter addMapiReqHistorySeUuidFiltersItem(String mapiReqHistorySeUuidFiltersItem) {
      if (this.mapiReqHistorySeUuidFilters == null) {
        this.mapiReqHistorySeUuidFilters = new ArrayList<String>();
      }
      this.mapiReqHistorySeUuidFilters.add(mapiReqHistorySeUuidFiltersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Periodicity in hours of saving operational stats of metrics api server to a log file.
     * Allowed values are 1-12.
     * Special values are 0- stop periodic saving of last-n metrics api server queries.
     * Field introduced in 32.1.1.
     * Unit is hours.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mapiStatsLogPeriodHours
     */
    public Integer getMapiStatsLogPeriodHours() {
        return mapiStatsLogPeriodHours;
    }

    /**
     * This is the setter method to the attribute.
     * Periodicity in hours of saving operational stats of metrics api server to a log file.
     * Allowed values are 1-12.
     * Special values are 0- stop periodic saving of last-n metrics api server queries.
     * Field introduced in 32.1.1.
     * Unit is hours.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mapiStatsLogPeriodHours set the mapiStatsLogPeriodHours.
     */
    public void setMapiStatsLogPeriodHours(Integer  mapiStatsLogPeriodHours) {
        this.mapiStatsLogPeriodHours = mapiStatsLogPeriodHours;
    }

    /**
     * This is the getter method this will return the attribute value.
     * First n minutes of each hour treated as the rollup window (balanced mode bypasses the freshness gate here).
     * 0 disables the bypass.
     * Allowed values are 0-30.
     * Field introduced in 32.1.4.
     * Unit is min.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metricsDbRdBoundaryWindowMin
     */
    public Integer getMetricsDbRdBoundaryWindowMin() {
        return metricsDbRdBoundaryWindowMin;
    }

    /**
     * This is the setter method to the attribute.
     * First n minutes of each hour treated as the rollup window (balanced mode bypasses the freshness gate here).
     * 0 disables the bypass.
     * Allowed values are 0-30.
     * Field introduced in 32.1.4.
     * Unit is min.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metricsDbRdBoundaryWindowMin set the metricsDbRdBoundaryWindowMin.
     */
    public void setMetricsDbRdBoundaryWindowMin(Integer  metricsDbRdBoundaryWindowMin) {
        this.metricsDbRdBoundaryWindowMin = metricsDbRdBoundaryWindowMin;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Follower health-probe cadence.
     * Allowed values are 10-600.
     * Field introduced in 32.1.4.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metricsDbRdCheckIntervalSec
     */
    public Integer getMetricsDbRdCheckIntervalSec() {
        return metricsDbRdCheckIntervalSec;
    }

    /**
     * This is the setter method to the attribute.
     * Follower health-probe cadence.
     * Allowed values are 10-600.
     * Field introduced in 32.1.4.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metricsDbRdCheckIntervalSec set the metricsDbRdCheckIntervalSec.
     */
    public void setMetricsDbRdCheckIntervalSec(Integer  metricsDbRdCheckIntervalSec) {
        this.metricsDbRdCheckIntervalSec = metricsDbRdCheckIntervalSec;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Probe-recency gate  distrust the cached follower probe if older than this.
     * Must be >= metrics_db_rd_check_interval_sec.
     * Allowed values are 30-1800.
     * Field introduced in 32.1.4.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metricsDbRdLagStaleAfterSec
     */
    public Integer getMetricsDbRdLagStaleAfterSec() {
        return metricsDbRdLagStaleAfterSec;
    }

    /**
     * This is the setter method to the attribute.
     * Probe-recency gate  distrust the cached follower probe if older than this.
     * Must be >= metrics_db_rd_check_interval_sec.
     * Allowed values are 30-1800.
     * Field introduced in 32.1.4.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metricsDbRdLagStaleAfterSec set the metricsDbRdLagStaleAfterSec.
     */
    public void setMetricsDbRdLagStaleAfterSec(Integer  metricsDbRdLagStaleAfterSec) {
        this.metricsDbRdLagStaleAfterSec = metricsDbRdLagStaleAfterSec;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Max now - last_replay_ts (worst-case follower staleness) for the freshness gate.
     * Allowed values are 5-3600.
     * Field introduced in 32.1.4.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metricsDbRdLagThresholdSec
     */
    public Integer getMetricsDbRdLagThresholdSec() {
        return metricsDbRdLagThresholdSec;
    }

    /**
     * This is the setter method to the attribute.
     * Max now - last_replay_ts (worst-case follower staleness) for the freshness gate.
     * Allowed values are 5-3600.
     * Field introduced in 32.1.4.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metricsDbRdLagThresholdSec set the metricsDbRdLagThresholdSec.
     */
    public void setMetricsDbRdLagThresholdSec(Integer  metricsDbRdLagThresholdSec) {
        this.metricsDbRdLagThresholdSec = metricsDbRdLagThresholdSec;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Follower-routing mode for metrics reads  balanced (default), disabled (always leader), freshness_only, or force_follower_non_rt.
     * Enum options - METRICS_DB_ROUTING_BALANCED, METRICS_DB_ROUTING_DISABLED, METRICS_DB_ROUTING_FRESHNESS_ONLY,
     * METRICS_DB_ROUTING_FORCE_FOLLOWER_NON_RT.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metricsDbRdRoutingMode
     */
    public String getMetricsDbRdRoutingMode() {
        return metricsDbRdRoutingMode;
    }

    /**
     * This is the setter method to the attribute.
     * Follower-routing mode for metrics reads  balanced (default), disabled (always leader), freshness_only, or force_follower_non_rt.
     * Enum options - METRICS_DB_ROUTING_BALANCED, METRICS_DB_ROUTING_DISABLED, METRICS_DB_ROUTING_FRESHNESS_ONLY,
     * METRICS_DB_ROUTING_FORCE_FOLLOWER_NON_RT.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metricsDbRdRoutingMode set the metricsDbRdRoutingMode.
     */
    public void setMetricsDbRdRoutingMode(String  metricsDbRdRoutingMode) {
        this.metricsDbRdRoutingMode = metricsDbRdRoutingMode;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      MetricsApiSrvDebugFilter objMetricsApiSrvDebugFilter = (MetricsApiSrvDebugFilter) o;
      return   Objects.equals(this.entityRef, objMetricsApiSrvDebugFilter.entityRef)&&
  Objects.equals(this.mapiPerfStatsEnabled, objMetricsApiSrvDebugFilter.mapiPerfStatsEnabled)&&
  Objects.equals(this.dbStatsSnapshotPeriodHours, objMetricsApiSrvDebugFilter.dbStatsSnapshotPeriodHours)&&
  Objects.equals(this.dbStatsNumSnapshots, objMetricsApiSrvDebugFilter.dbStatsNumSnapshots)&&
  Objects.equals(this.mapiReqHistoryNumRecords, objMetricsApiSrvDebugFilter.mapiReqHistoryNumRecords)&&
  Objects.equals(this.mapiStatsLogPeriodHours, objMetricsApiSrvDebugFilter.mapiStatsLogPeriodHours)&&
  Objects.equals(this.mapiReqHistoryEntityTypeFilters, objMetricsApiSrvDebugFilter.mapiReqHistoryEntityTypeFilters)&&
  Objects.equals(this.mapiReqHistoryEntityUuidFilters, objMetricsApiSrvDebugFilter.mapiReqHistoryEntityUuidFilters)&&
  Objects.equals(this.mapiReqHistorySeUuidFilters, objMetricsApiSrvDebugFilter.mapiReqHistorySeUuidFilters)&&
  Objects.equals(this.mapiReqHistoryMetricIdFilters, objMetricsApiSrvDebugFilter.mapiReqHistoryMetricIdFilters)&&
  Objects.equals(this.metricsDbRdRoutingMode, objMetricsApiSrvDebugFilter.metricsDbRdRoutingMode)&&
  Objects.equals(this.metricsDbRdLagThresholdSec, objMetricsApiSrvDebugFilter.metricsDbRdLagThresholdSec)&&
  Objects.equals(this.metricsDbRdLagStaleAfterSec, objMetricsApiSrvDebugFilter.metricsDbRdLagStaleAfterSec)&&
  Objects.equals(this.metricsDbRdCheckIntervalSec, objMetricsApiSrvDebugFilter.metricsDbRdCheckIntervalSec)&&
  Objects.equals(this.metricsDbRdBoundaryWindowMin, objMetricsApiSrvDebugFilter.metricsDbRdBoundaryWindowMin);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MetricsApiSrvDebugFilter {\n");
                  sb.append("    dbStatsNumSnapshots: ").append(toIndentedString(dbStatsNumSnapshots)).append("\n");
                        sb.append("    dbStatsSnapshotPeriodHours: ").append(toIndentedString(dbStatsSnapshotPeriodHours)).append("\n");
                        sb.append("    entityRef: ").append(toIndentedString(entityRef)).append("\n");
                        sb.append("    mapiPerfStatsEnabled: ").append(toIndentedString(mapiPerfStatsEnabled)).append("\n");
                        sb.append("    mapiReqHistoryEntityTypeFilters: ").append(toIndentedString(mapiReqHistoryEntityTypeFilters)).append("\n");
                        sb.append("    mapiReqHistoryEntityUuidFilters: ").append(toIndentedString(mapiReqHistoryEntityUuidFilters)).append("\n");
                        sb.append("    mapiReqHistoryMetricIdFilters: ").append(toIndentedString(mapiReqHistoryMetricIdFilters)).append("\n");
                        sb.append("    mapiReqHistoryNumRecords: ").append(toIndentedString(mapiReqHistoryNumRecords)).append("\n");
                        sb.append("    mapiReqHistorySeUuidFilters: ").append(toIndentedString(mapiReqHistorySeUuidFilters)).append("\n");
                        sb.append("    mapiStatsLogPeriodHours: ").append(toIndentedString(mapiStatsLogPeriodHours)).append("\n");
                        sb.append("    metricsDbRdBoundaryWindowMin: ").append(toIndentedString(metricsDbRdBoundaryWindowMin)).append("\n");
                        sb.append("    metricsDbRdCheckIntervalSec: ").append(toIndentedString(metricsDbRdCheckIntervalSec)).append("\n");
                        sb.append("    metricsDbRdLagStaleAfterSec: ").append(toIndentedString(metricsDbRdLagStaleAfterSec)).append("\n");
                        sb.append("    metricsDbRdLagThresholdSec: ").append(toIndentedString(metricsDbRdLagThresholdSec)).append("\n");
                        sb.append("    metricsDbRdRoutingMode: ").append(toIndentedString(metricsDbRdRoutingMode)).append("\n");
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

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
 * The MetricsMgrDebugFilter is a POJO class extends AviRestResource that used for creating
 * MetricsMgrDebugFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetricsMgrDebugFilter  {
    @JsonProperty("debug_skip_eval_period")
    private String debugSkipEvalPeriod;

    @JsonProperty("disable_hw_training")
    private String disableHwTraining;

    @JsonProperty("entity")
    private String entity;

    @JsonProperty("license_grace_period")
    private String licenseGracePeriod;

    @JsonProperty("log_first_n")
    private String logFirstN;

    @JsonProperty("logging_freq")
    private String loggingFreq;

    @JsonProperty("metric_instance_id")
    private String metricInstanceId;

    @JsonProperty("min_db_queries_each_conn")
    private String minDbQueriesEachConn;

    @JsonProperty("obj")
    private String obj;

    @JsonProperty("skip_cluster_map_check")
    private String skipClusterMapCheck;

    @JsonProperty("skip_metrics_db_writes")
    private String skipMetricsDbWrites;



    /**
     * This is the getter method this will return the attribute value.
     * Set to ignore skip_eval_period field in metrics_anomaly_option.
     * Field introduced in 20.1.4.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return debugSkipEvalPeriod
     */
    public String getDebugSkipEvalPeriod() {
        return debugSkipEvalPeriod;
    }

    /**
     * This is the setter method to the attribute.
     * Set to ignore skip_eval_period field in metrics_anomaly_option.
     * Field introduced in 20.1.4.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param debugSkipEvalPeriod set the debugSkipEvalPeriod.
     */
    public void setDebugSkipEvalPeriod(String  debugSkipEvalPeriod) {
        this.debugSkipEvalPeriod = debugSkipEvalPeriod;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return disableHwTraining
     */
    public String getDisableHwTraining() {
        return disableHwTraining;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param disableHwTraining set the disableHwTraining.
     */
    public void setDisableHwTraining(String  disableHwTraining) {
        this.disableHwTraining = disableHwTraining;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return entity
     */
    public String getEntity() {
        return entity;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param entity set the entity.
     */
    public void setEntity(String  entity) {
        this.entity = entity;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Setting to reduce the grace period for license expiry in hours.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return licenseGracePeriod
     */
    public String getLicenseGracePeriod() {
        return licenseGracePeriod;
    }

    /**
     * This is the setter method to the attribute.
     * Setting to reduce the grace period for license expiry in hours.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param licenseGracePeriod set the licenseGracePeriod.
     */
    public void setLicenseGracePeriod(String  licenseGracePeriod) {
        this.licenseGracePeriod = licenseGracePeriod;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return logFirstN
     */
    public String getLogFirstN() {
        return logFirstN;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param logFirstN set the logFirstN.
     */
    public void setLogFirstN(String  logFirstN) {
        this.logFirstN = logFirstN;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return loggingFreq
     */
    public String getLoggingFreq() {
        return loggingFreq;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param loggingFreq set the loggingFreq.
     */
    public void setLoggingFreq(String  loggingFreq) {
        this.loggingFreq = loggingFreq;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metricInstanceId
     */
    public String getMetricInstanceId() {
        return metricInstanceId;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metricInstanceId set the metricInstanceId.
     */
    public void setMetricInstanceId(String  metricInstanceId) {
        this.metricInstanceId = metricInstanceId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Setting to change the number of queries being processed by per db connection by metrics manager.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return minDbQueriesEachConn
     */
    public String getMinDbQueriesEachConn() {
        return minDbQueriesEachConn;
    }

    /**
     * This is the setter method to the attribute.
     * Setting to change the number of queries being processed by per db connection by metrics manager.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param minDbQueriesEachConn set the minDbQueriesEachConn.
     */
    public void setMinDbQueriesEachConn(String  minDbQueriesEachConn) {
        this.minDbQueriesEachConn = minDbQueriesEachConn;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return obj
     */
    public String getObj() {
        return obj;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param obj set the obj.
     */
    public void setObj(String  obj) {
        this.obj = obj;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return skipClusterMapCheck
     */
    public String getSkipClusterMapCheck() {
        return skipClusterMapCheck;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param skipClusterMapCheck set the skipClusterMapCheck.
     */
    public void setSkipClusterMapCheck(String  skipClusterMapCheck) {
        this.skipClusterMapCheck = skipClusterMapCheck;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return skipMetricsDbWrites
     */
    public String getSkipMetricsDbWrites() {
        return skipMetricsDbWrites;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param skipMetricsDbWrites set the skipMetricsDbWrites.
     */
    public void setSkipMetricsDbWrites(String  skipMetricsDbWrites) {
        this.skipMetricsDbWrites = skipMetricsDbWrites;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      MetricsMgrDebugFilter objMetricsMgrDebugFilter = (MetricsMgrDebugFilter) o;
      return   Objects.equals(this.obj, objMetricsMgrDebugFilter.obj)&&
  Objects.equals(this.entity, objMetricsMgrDebugFilter.entity)&&
  Objects.equals(this.skipMetricsDbWrites, objMetricsMgrDebugFilter.skipMetricsDbWrites)&&
  Objects.equals(this.loggingFreq, objMetricsMgrDebugFilter.loggingFreq)&&
  Objects.equals(this.logFirstN, objMetricsMgrDebugFilter.logFirstN)&&
  Objects.equals(this.metricInstanceId, objMetricsMgrDebugFilter.metricInstanceId)&&
  Objects.equals(this.skipClusterMapCheck, objMetricsMgrDebugFilter.skipClusterMapCheck)&&
  Objects.equals(this.disableHwTraining, objMetricsMgrDebugFilter.disableHwTraining)&&
  Objects.equals(this.licenseGracePeriod, objMetricsMgrDebugFilter.licenseGracePeriod)&&
  Objects.equals(this.debugSkipEvalPeriod, objMetricsMgrDebugFilter.debugSkipEvalPeriod)&&
  Objects.equals(this.minDbQueriesEachConn, objMetricsMgrDebugFilter.minDbQueriesEachConn);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MetricsMgrDebugFilter {\n");
                  sb.append("    debugSkipEvalPeriod: ").append(toIndentedString(debugSkipEvalPeriod)).append("\n");
                        sb.append("    disableHwTraining: ").append(toIndentedString(disableHwTraining)).append("\n");
                        sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
                        sb.append("    licenseGracePeriod: ").append(toIndentedString(licenseGracePeriod)).append("\n");
                        sb.append("    logFirstN: ").append(toIndentedString(logFirstN)).append("\n");
                        sb.append("    loggingFreq: ").append(toIndentedString(loggingFreq)).append("\n");
                        sb.append("    metricInstanceId: ").append(toIndentedString(metricInstanceId)).append("\n");
                        sb.append("    minDbQueriesEachConn: ").append(toIndentedString(minDbQueriesEachConn)).append("\n");
                        sb.append("    obj: ").append(toIndentedString(obj)).append("\n");
                        sb.append("    skipClusterMapCheck: ").append(toIndentedString(skipClusterMapCheck)).append("\n");
                        sb.append("    skipMetricsDbWrites: ").append(toIndentedString(skipMetricsDbWrites)).append("\n");
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

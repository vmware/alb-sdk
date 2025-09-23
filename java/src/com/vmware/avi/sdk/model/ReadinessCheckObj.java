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
 * The ReadinessCheckObj is a POJO class extends AviRestResource that used for creating
 * ReadinessCheckObj.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReadinessCheckObj  {
    @JsonProperty("checks")
    private List<PreChecksInfo> checks;

    @JsonProperty("checks_completed")
    private Integer checksCompleted;

    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("end_time")
    private String endTime;

    @JsonProperty("progress")
    private Integer progress = 0;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("state")
    private PreCheckOpsState state;

    @JsonProperty("total_checks")
    private Integer totalChecks;


    /**
     * This is the getter method this will return the attribute value.
     * List of readiness checks information.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return checks
     */
    public List<PreChecksInfo> getChecks() {
        return checks;
    }

    /**
     * This is the setter method. this will set the checks
     * List of readiness checks information.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return checks
     */
    public void setChecks(List<PreChecksInfo>  checks) {
        this.checks = checks;
    }

    /**
     * This is the setter method this will set the checks
     * List of readiness checks information.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return checks
     */
    public ReadinessCheckObj addChecksItem(PreChecksInfo checksItem) {
      if (this.checks == null) {
        this.checks = new ArrayList<PreChecksInfo>();
      }
      this.checks.add(checksItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * No.
     * Of checks completed.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return checksCompleted
     */
    public Integer getChecksCompleted() {
        return checksCompleted;
    }

    /**
     * This is the setter method to the attribute.
     * No.
     * Of checks completed.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param checksCompleted set the checksCompleted.
     */
    public void setChecksCompleted(Integer  checksCompleted) {
        this.checksCompleted = checksCompleted;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time taken to complete readiness checks in seconds.
     * Field introduced in 31.2.1.
     * Unit is sec.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * This is the setter method to the attribute.
     * Time taken to complete readiness checks in seconds.
     * Field introduced in 31.2.1.
     * Unit is sec.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param duration set the duration.
     */
    public void setDuration(Integer  duration) {
        this.duration = duration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * End time of the readiness check operations.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * This is the setter method to the attribute.
     * End time of the readiness check operations.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param endTime set the endTime.
     */
    public void setEndTime(String  endTime) {
        this.endTime = endTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Checks progress which holds value between 0-100.
     * Allowed values are 0-100.
     * Field introduced in 31.2.1.
     * Unit is percent.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    /**
     * This is the setter method to the attribute.
     * Checks progress which holds value between 0-100.
     * Allowed values are 0-100.
     * Field introduced in 31.2.1.
     * Unit is percent.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param progress set the progress.
     */
    public void setProgress(Integer  progress) {
        this.progress = progress;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Start time of the readiness check operations.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * This is the setter method to the attribute.
     * Start time of the readiness check operations.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param startTime set the startTime.
     */
    public void setStartTime(String  startTime) {
        this.startTime = startTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The readiness check operations current fsm-state.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return state
     */
    public PreCheckOpsState getState() {
        return state;
    }

    /**
     * This is the setter method to the attribute.
     * The readiness check operations current fsm-state.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param state set the state.
     */
    public void setState(PreCheckOpsState state) {
        this.state = state;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Total no.
     * Of checks.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return totalChecks
     */
    public Integer getTotalChecks() {
        return totalChecks;
    }

    /**
     * This is the setter method to the attribute.
     * Total no.
     * Of checks.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param totalChecks set the totalChecks.
     */
    public void setTotalChecks(Integer  totalChecks) {
        this.totalChecks = totalChecks;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ReadinessCheckObj objReadinessCheckObj = (ReadinessCheckObj) o;
      return   Objects.equals(this.state, objReadinessCheckObj.state)&&
  Objects.equals(this.checks, objReadinessCheckObj.checks)&&
  Objects.equals(this.startTime, objReadinessCheckObj.startTime)&&
  Objects.equals(this.endTime, objReadinessCheckObj.endTime)&&
  Objects.equals(this.duration, objReadinessCheckObj.duration)&&
  Objects.equals(this.totalChecks, objReadinessCheckObj.totalChecks)&&
  Objects.equals(this.checksCompleted, objReadinessCheckObj.checksCompleted)&&
  Objects.equals(this.progress, objReadinessCheckObj.progress);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReadinessCheckObj {\n");
                  sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
                        sb.append("    checksCompleted: ").append(toIndentedString(checksCompleted)).append("\n");
                        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
                        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
                        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
                        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
                        sb.append("    state: ").append(toIndentedString(state)).append("\n");
                        sb.append("    totalChecks: ").append(toIndentedString(totalChecks)).append("\n");
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

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
 * The ProcessInfo is a POJO class extends AviRestResource that used for creating
 * ProcessInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProcessInfo  {
    @JsonProperty("current_process_id")
    private Float currentProcessId = null;

    @JsonProperty("current_process_mem_usage")
    private Float currentProcessMemUsage = null;

    @JsonProperty("intimation_count")
    private Float intimationCount = null;

    @JsonProperty("memory_limit")
    private Float memoryLimit = null;

    @JsonProperty("memory_trend_usage")
    private String memoryTrendUsage = null;

    @JsonProperty("process_mode")
    private String processMode = null;

    @JsonProperty("threshold_percent")
    private Float thresholdPercent = null;



    /**
     * This is the getter method this will return the attribute value.
     * Current process id.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return currentProcessId
     */
    public Float getCurrentProcessId() {
        return currentProcessId;
    }

    /**
     * This is the setter method to the attribute.
     * Current process id.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param currentProcessId set the currentProcessId.
     */
    public void setCurrentProcessId(Float  currentProcessId) {
        this.currentProcessId = currentProcessId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Total memory usage of process in kbs.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return currentProcessMemUsage
     */
    public Float getCurrentProcessMemUsage() {
        return currentProcessMemUsage;
    }

    /**
     * This is the setter method to the attribute.
     * Total memory usage of process in kbs.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param currentProcessMemUsage set the currentProcessMemUsage.
     */
    public void setCurrentProcessMemUsage(Float  currentProcessMemUsage) {
        this.currentProcessMemUsage = currentProcessMemUsage;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of times the process has been in current processmode.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return intimationCount
     */
    public Float getIntimationCount() {
        return intimationCount;
    }

    /**
     * This is the setter method to the attribute.
     * Number of times the process has been in current processmode.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param intimationCount set the intimationCount.
     */
    public void setIntimationCount(Float  intimationCount) {
        this.intimationCount = intimationCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Memory limit for process in kbs.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return memoryLimit
     */
    public Float getMemoryLimit() {
        return memoryLimit;
    }

    /**
     * This is the setter method to the attribute.
     * Memory limit for process in kbs.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param memoryLimit set the memoryLimit.
     */
    public void setMemoryLimit(Float  memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Current usage trend of process memory.
     * Enum options - UPWARD, DOWNWARD, NEUTRAL.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return memoryTrendUsage
     */
    public String getMemoryTrendUsage() {
        return memoryTrendUsage;
    }

    /**
     * This is the setter method to the attribute.
     * Current usage trend of process memory.
     * Enum options - UPWARD, DOWNWARD, NEUTRAL.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param memoryTrendUsage set the memoryTrendUsage.
     */
    public void setMemoryTrendUsage(String  memoryTrendUsage) {
        this.memoryTrendUsage = memoryTrendUsage;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Current mode of process.
     * Enum options - REGULAR, DEBUG, DEGRADED, STOP.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return processMode
     */
    public String getProcessMode() {
        return processMode;
    }

    /**
     * This is the setter method to the attribute.
     * Current mode of process.
     * Enum options - REGULAR, DEBUG, DEGRADED, STOP.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param processMode set the processMode.
     */
    public void setProcessMode(String  processMode) {
        this.processMode = processMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Percentage of memory used out of given limits.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return thresholdPercent
     */
    public Float getThresholdPercent() {
        return thresholdPercent;
    }

    /**
     * This is the setter method to the attribute.
     * Percentage of memory used out of given limits.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param thresholdPercent set the thresholdPercent.
     */
    public void setThresholdPercent(Float  thresholdPercent) {
        this.thresholdPercent = thresholdPercent;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ProcessInfo objProcessInfo = (ProcessInfo) o;
      return   Objects.equals(this.currentProcessMemUsage, objProcessInfo.currentProcessMemUsage)&&
  Objects.equals(this.memoryTrendUsage, objProcessInfo.memoryTrendUsage)&&
  Objects.equals(this.processMode, objProcessInfo.processMode)&&
  Objects.equals(this.thresholdPercent, objProcessInfo.thresholdPercent)&&
  Objects.equals(this.memoryLimit, objProcessInfo.memoryLimit)&&
  Objects.equals(this.currentProcessId, objProcessInfo.currentProcessId)&&
  Objects.equals(this.intimationCount, objProcessInfo.intimationCount);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ProcessInfo {\n");
                  sb.append("    currentProcessId: ").append(toIndentedString(currentProcessId)).append("\n");
                        sb.append("    currentProcessMemUsage: ").append(toIndentedString(currentProcessMemUsage)).append("\n");
                        sb.append("    intimationCount: ").append(toIndentedString(intimationCount)).append("\n");
                        sb.append("    memoryLimit: ").append(toIndentedString(memoryLimit)).append("\n");
                        sb.append("    memoryTrendUsage: ").append(toIndentedString(memoryTrendUsage)).append("\n");
                        sb.append("    processMode: ").append(toIndentedString(processMode)).append("\n");
                        sb.append("    thresholdPercent: ").append(toIndentedString(thresholdPercent)).append("\n");
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

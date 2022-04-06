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
 * The MemoryBalancerInfo is a POJO class extends AviRestResource that used for creating
 * MemoryBalancerInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MemoryBalancerInfo  {
    @JsonProperty("child")
    private List<ChildProcessInfo> child = null;

    @JsonProperty("controller_memory")
    private Integer controllerMemory = null;

    @JsonProperty("controller_memory_usage_percent")
    private Float controllerMemoryUsagePercent = null;

    @JsonProperty("debug_message")
    private String debugMessage = null;

    @JsonProperty("limit")
    private Integer limit = null;

    @JsonProperty("memory_used")
    private Integer memoryUsed = null;

    @JsonProperty("pid")
    private Integer pid = null;

    @JsonProperty("process")
    private String process = null;

    @JsonProperty("process_mode")
    private String processMode = null;

    @JsonProperty("process_trend")
    private String processTrend = null;

    @JsonProperty("threshold_percent")
    private Float thresholdPercent = null;


    /**
     * This is the getter method this will return the attribute value.
     * Child process information.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return child
     */
    public List<ChildProcessInfo> getChild() {
        return child;
    }

    /**
     * This is the setter method. this will set the child
     * Child process information.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return child
     */
    public void setChild(List<ChildProcessInfo>  child) {
        this.child = child;
    }

    /**
     * This is the setter method this will set the child
     * Child process information.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return child
     */
    public MemoryBalancerInfo addChildItem(ChildProcessInfo childItem) {
      if (this.child == null) {
        this.child = new ArrayList<ChildProcessInfo>();
      }
      this.child.add(childItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Current controller memory (in gb) usage.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return controllerMemory
     */
    public Integer getControllerMemory() {
        return controllerMemory;
    }

    /**
     * This is the setter method to the attribute.
     * Current controller memory (in gb) usage.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param controllerMemory set the controllerMemory.
     */
    public void setControllerMemory(Integer  controllerMemory) {
        this.controllerMemory = controllerMemory;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Percent usage of total controller memory.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return controllerMemoryUsagePercent
     */
    public Float getControllerMemoryUsagePercent() {
        return controllerMemoryUsagePercent;
    }

    /**
     * This is the setter method to the attribute.
     * Percent usage of total controller memory.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param controllerMemoryUsagePercent set the controllerMemoryUsagePercent.
     */
    public void setControllerMemoryUsagePercent(Float  controllerMemoryUsagePercent) {
        this.controllerMemoryUsagePercent = controllerMemoryUsagePercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Holder for debug message.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return debugMessage
     */
    public String getDebugMessage() {
        return debugMessage;
    }

    /**
     * This is the setter method to the attribute.
     * Holder for debug message.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param debugMessage set the debugMessage.
     */
    public void setDebugMessage(String  debugMessage) {
        this.debugMessage = debugMessage;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Limit on the memory (in kb) for the process.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * This is the setter method to the attribute.
     * Limit on the memory (in kb) for the process.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param limit set the limit.
     */
    public void setLimit(Integer  limit) {
        this.limit = limit;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Amount of memory (in kb) used by the process.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return memoryUsed
     */
    public Integer getMemoryUsed() {
        return memoryUsed;
    }

    /**
     * This is the setter method to the attribute.
     * Amount of memory (in kb) used by the process.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param memoryUsed set the memoryUsed.
     */
    public void setMemoryUsed(Integer  memoryUsed) {
        this.memoryUsed = memoryUsed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Pid of the process.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This is the setter method to the attribute.
     * Pid of the process.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param pid set the pid.
     */
    public void setPid(Integer  pid) {
        this.pid = pid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the process.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return process
     */
    public String getProcess() {
        return process;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the process.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param process set the process.
     */
    public void setProcess(String  process) {
        this.process = process;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Current mode of the process.
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
     * Current mode of the process.
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
     * Current usage trend of the process.
     * Enum options - UPWARD, DOWNWARD, NEUTRAL.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return processTrend
     */
    public String getProcessTrend() {
        return processTrend;
    }

    /**
     * This is the setter method to the attribute.
     * Current usage trend of the process.
     * Enum options - UPWARD, DOWNWARD, NEUTRAL.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param processTrend set the processTrend.
     */
    public void setProcessTrend(String  processTrend) {
        this.processTrend = processTrend;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Percent usage of the process limit.
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
     * Percent usage of the process limit.
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
      MemoryBalancerInfo objMemoryBalancerInfo = (MemoryBalancerInfo) o;
      return   Objects.equals(this.process, objMemoryBalancerInfo.process)&&
  Objects.equals(this.pid, objMemoryBalancerInfo.pid)&&
  Objects.equals(this.memoryUsed, objMemoryBalancerInfo.memoryUsed)&&
  Objects.equals(this.limit, objMemoryBalancerInfo.limit)&&
  Objects.equals(this.child, objMemoryBalancerInfo.child)&&
  Objects.equals(this.controllerMemory, objMemoryBalancerInfo.controllerMemory)&&
  Objects.equals(this.processMode, objMemoryBalancerInfo.processMode)&&
  Objects.equals(this.processTrend, objMemoryBalancerInfo.processTrend)&&
  Objects.equals(this.thresholdPercent, objMemoryBalancerInfo.thresholdPercent)&&
  Objects.equals(this.debugMessage, objMemoryBalancerInfo.debugMessage)&&
  Objects.equals(this.controllerMemoryUsagePercent, objMemoryBalancerInfo.controllerMemoryUsagePercent);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MemoryBalancerInfo {\n");
                  sb.append("    child: ").append(toIndentedString(child)).append("\n");
                        sb.append("    controllerMemory: ").append(toIndentedString(controllerMemory)).append("\n");
                        sb.append("    controllerMemoryUsagePercent: ").append(toIndentedString(controllerMemoryUsagePercent)).append("\n");
                        sb.append("    debugMessage: ").append(toIndentedString(debugMessage)).append("\n");
                        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
                        sb.append("    memoryUsed: ").append(toIndentedString(memoryUsed)).append("\n");
                        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
                        sb.append("    process: ").append(toIndentedString(process)).append("\n");
                        sb.append("    processMode: ").append(toIndentedString(processMode)).append("\n");
                        sb.append("    processTrend: ").append(toIndentedString(processTrend)).append("\n");
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

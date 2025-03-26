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
 * The SeProcessCrashedDetails is a POJO class extends AviRestResource that used for creating
 * SeProcessCrashedDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeProcessCrashedDetails  {
    @JsonProperty("crash_counter")
    private Integer crashCounter;

    @JsonProperty("process_name")
    private String processName;

    @JsonProperty("se_name")
    private String seName;



    /**
     * This is the getter method this will return the attribute value.
     * Number of times the process has crashed.
     * Field introduced in 31.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return crashCounter
     */
    public Integer getCrashCounter() {
        return crashCounter;
    }

    /**
     * This is the setter method to the attribute.
     * Number of times the process has crashed.
     * Field introduced in 31.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param crashCounter set the crashCounter.
     */
    public void setCrashCounter(Integer  crashCounter) {
        this.crashCounter = crashCounter;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the process that crashed.
     * Field introduced in 31.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return processName
     */
    public String getProcessName() {
        return processName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the process that crashed.
     * Field introduced in 31.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param processName set the processName.
     */
    public void setProcessName(String  processName) {
        this.processName = processName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the se reporting this event.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 31.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seName
     */
    public String getSeName() {
        return seName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the se reporting this event.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 31.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seName set the seName.
     */
    public void setSeName(String  seName) {
        this.seName = seName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SeProcessCrashedDetails objSeProcessCrashedDetails = (SeProcessCrashedDetails) o;
      return   Objects.equals(this.seName, objSeProcessCrashedDetails.seName)&&
  Objects.equals(this.processName, objSeProcessCrashedDetails.processName)&&
  Objects.equals(this.crashCounter, objSeProcessCrashedDetails.crashCounter);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeProcessCrashedDetails {\n");
                  sb.append("    crashCounter: ").append(toIndentedString(crashCounter)).append("\n");
                        sb.append("    processName: ").append(toIndentedString(processName)).append("\n");
                        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
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

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
 * The LogMgrCleanupEventDetails is a POJO class extends AviRestResource that used for creating
 * LogMgrCleanupEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogMgrCleanupEventDetails  {
    @JsonProperty("cleanup_count")
    private Integer cleanupCount;

    @JsonProperty("controller")
    private String controller;

    @JsonProperty("curr_size")
    private Integer currSize;

    @JsonProperty("from_time")
    private String fromTime;

    @JsonProperty("size_limit")
    private Integer sizeLimit;



    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cleanupCount
     */
    public Integer getCleanupCount() {
        return cleanupCount;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cleanupCount set the cleanupCount.
     */
    public void setCleanupCount(Integer  cleanupCount) {
        this.cleanupCount = cleanupCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return controller
     */
    public String getController() {
        return controller;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param controller set the controller.
     */
    public void setController(String  controller) {
        this.controller = controller;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return currSize
     */
    public Integer getCurrSize() {
        return currSize;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param currSize set the currSize.
     */
    public void setCurrSize(Integer  currSize) {
        this.currSize = currSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fromTime
     */
    public String getFromTime() {
        return fromTime;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param fromTime set the fromTime.
     */
    public void setFromTime(String  fromTime) {
        this.fromTime = fromTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sizeLimit
     */
    public Integer getSizeLimit() {
        return sizeLimit;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sizeLimit set the sizeLimit.
     */
    public void setSizeLimit(Integer  sizeLimit) {
        this.sizeLimit = sizeLimit;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      LogMgrCleanupEventDetails objLogMgrCleanupEventDetails = (LogMgrCleanupEventDetails) o;
      return   Objects.equals(this.controller, objLogMgrCleanupEventDetails.controller)&&
  Objects.equals(this.sizeLimit, objLogMgrCleanupEventDetails.sizeLimit)&&
  Objects.equals(this.currSize, objLogMgrCleanupEventDetails.currSize)&&
  Objects.equals(this.cleanupCount, objLogMgrCleanupEventDetails.cleanupCount)&&
  Objects.equals(this.fromTime, objLogMgrCleanupEventDetails.fromTime);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LogMgrCleanupEventDetails {\n");
                  sb.append("    cleanupCount: ").append(toIndentedString(cleanupCount)).append("\n");
                        sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
                        sb.append("    currSize: ").append(toIndentedString(currSize)).append("\n");
                        sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
                        sb.append("    sizeLimit: ").append(toIndentedString(sizeLimit)).append("\n");
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

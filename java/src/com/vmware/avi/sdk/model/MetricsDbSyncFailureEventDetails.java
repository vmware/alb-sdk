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
 * The MetricsDbSyncFailureEventDetails is a POJO class extends AviRestResource that used for creating
 * MetricsDbSyncFailureEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetricsDbSyncFailureEventDetails  {
    @JsonProperty("node_name")
    private String nodeName = null;

    @JsonProperty("process_name")
    private String processName = null;

    @JsonProperty("timestamp")
    private String timestamp = null;



    /**
     * This is the getter method this will return the attribute value.
     * Name of the node responsible for this event.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the node responsible for this event.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nodeName set the nodeName.
     */
    public void setNodeName(String  nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the process responsible for this event.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return processName
     */
    public String getProcessName() {
        return processName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the process responsible for this event.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param processName set the processName.
     */
    public void setProcessName(String  processName) {
        this.processName = processName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timestamp at which this event occurred.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * This is the setter method to the attribute.
     * Timestamp at which this event occurred.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param timestamp set the timestamp.
     */
    public void setTimestamp(String  timestamp) {
        this.timestamp = timestamp;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      MetricsDbSyncFailureEventDetails objMetricsDbSyncFailureEventDetails = (MetricsDbSyncFailureEventDetails) o;
      return   Objects.equals(this.nodeName, objMetricsDbSyncFailureEventDetails.nodeName)&&
  Objects.equals(this.processName, objMetricsDbSyncFailureEventDetails.processName)&&
  Objects.equals(this.timestamp, objMetricsDbSyncFailureEventDetails.timestamp);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MetricsDbSyncFailureEventDetails {\n");
                  sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
                        sb.append("    processName: ").append(toIndentedString(processName)).append("\n");
                        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

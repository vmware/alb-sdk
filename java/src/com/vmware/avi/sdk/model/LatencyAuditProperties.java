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
 * The LatencyAuditProperties is a POJO class extends AviRestResource that used for creating
 * LatencyAuditProperties.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LatencyAuditProperties  {
    @JsonProperty("conn_est_audit_mode")
    private String connEstAuditMode = null;

    @JsonProperty("conn_est_threshold")
    private Integer connEstThreshold = null;

    @JsonProperty("latency_audit_mode")
    private String latencyAuditMode = null;

    @JsonProperty("latency_threshold")
    private Integer latencyThreshold = null;



    /**
     * This is the getter method this will return the attribute value.
     * Audit tcp connection establishment time.
     * Enum options - LATENCY_AUDIT_OFF, LATENCY_AUDIT_ON, LATENCY_AUDIT_ON_WITH_SIG.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return connEstAuditMode
     */
    public String getConnEstAuditMode() {
        return connEstAuditMode;
    }

    /**
     * This is the setter method to the attribute.
     * Audit tcp connection establishment time.
     * Enum options - LATENCY_AUDIT_OFF, LATENCY_AUDIT_ON, LATENCY_AUDIT_ON_WITH_SIG.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param connEstAuditMode set the connEstAuditMode.
     */
    public void setConnEstAuditMode(String  connEstAuditMode) {
        this.connEstAuditMode = connEstAuditMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum threshold for connection establishment time.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return connEstThreshold
     */
    public Integer getConnEstThreshold() {
        return connEstThreshold;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum threshold for connection establishment time.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param connEstThreshold set the connEstThreshold.
     */
    public void setConnEstThreshold(Integer  connEstThreshold) {
        this.connEstThreshold = connEstThreshold;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Audit dispatcher to proxy latency.
     * Enum options - LATENCY_AUDIT_OFF, LATENCY_AUDIT_ON, LATENCY_AUDIT_ON_WITH_SIG.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return latencyAuditMode
     */
    public String getLatencyAuditMode() {
        return latencyAuditMode;
    }

    /**
     * This is the setter method to the attribute.
     * Audit dispatcher to proxy latency.
     * Enum options - LATENCY_AUDIT_OFF, LATENCY_AUDIT_ON, LATENCY_AUDIT_ON_WITH_SIG.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param latencyAuditMode set the latencyAuditMode.
     */
    public void setLatencyAuditMode(String  latencyAuditMode) {
        this.latencyAuditMode = latencyAuditMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum latency threshold between dispatcher and proxy.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return latencyThreshold
     */
    public Integer getLatencyThreshold() {
        return latencyThreshold;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum latency threshold between dispatcher and proxy.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param latencyThreshold set the latencyThreshold.
     */
    public void setLatencyThreshold(Integer  latencyThreshold) {
        this.latencyThreshold = latencyThreshold;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      LatencyAuditProperties objLatencyAuditProperties = (LatencyAuditProperties) o;
      return   Objects.equals(this.latencyAuditMode, objLatencyAuditProperties.latencyAuditMode)&&
  Objects.equals(this.latencyThreshold, objLatencyAuditProperties.latencyThreshold)&&
  Objects.equals(this.connEstAuditMode, objLatencyAuditProperties.connEstAuditMode)&&
  Objects.equals(this.connEstThreshold, objLatencyAuditProperties.connEstThreshold);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LatencyAuditProperties {\n");
                  sb.append("    connEstAuditMode: ").append(toIndentedString(connEstAuditMode)).append("\n");
                        sb.append("    connEstThreshold: ").append(toIndentedString(connEstThreshold)).append("\n");
                        sb.append("    latencyAuditMode: ").append(toIndentedString(latencyAuditMode)).append("\n");
                        sb.append("    latencyThreshold: ").append(toIndentedString(latencyThreshold)).append("\n");
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

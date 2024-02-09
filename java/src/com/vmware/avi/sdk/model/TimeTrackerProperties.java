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
 * The TimeTrackerProperties is a POJO class extends AviRestResource that used for creating
 * TimeTrackerProperties.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TimeTrackerProperties  {
    @JsonProperty("be_conn_est_audit_mode")
    private String beConnEstAuditMode;

    @JsonProperty("be_conn_est_threshold")
    private Integer beConnEstThreshold;

    @JsonProperty("fe_conn_est_audit_mode")
    private String feConnEstAuditMode;

    @JsonProperty("fe_conn_est_threshold")
    private Integer feConnEstThreshold;

    @JsonProperty("ingress_sig_log")
    private Boolean ingressSigLog;



    /**
     * This is the getter method this will return the attribute value.
     * Audit tcp connection establishment time on server-side.
     * Enum options - TT_AUDIT_OFF, TT_AUDIT_ON, TT_AUDIT_ON_WITH_SIG.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return beConnEstAuditMode
     */
    public String getBeConnEstAuditMode() {
        return beConnEstAuditMode;
    }

    /**
     * This is the setter method to the attribute.
     * Audit tcp connection establishment time on server-side.
     * Enum options - TT_AUDIT_OFF, TT_AUDIT_ON, TT_AUDIT_ON_WITH_SIG.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param beConnEstAuditMode set the beConnEstAuditMode.
     */
    public void setBeConnEstAuditMode(String  beConnEstAuditMode) {
        this.beConnEstAuditMode = beConnEstAuditMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum threshold for tcp connection establishment time on server-side.
     * Field introduced in 22.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return beConnEstThreshold
     */
    public Integer getBeConnEstThreshold() {
        return beConnEstThreshold;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum threshold for tcp connection establishment time on server-side.
     * Field introduced in 22.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param beConnEstThreshold set the beConnEstThreshold.
     */
    public void setBeConnEstThreshold(Integer  beConnEstThreshold) {
        this.beConnEstThreshold = beConnEstThreshold;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Audit tcp connection establishment time on client-side.
     * Enum options - TT_AUDIT_OFF, TT_AUDIT_ON, TT_AUDIT_ON_WITH_SIG.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return feConnEstAuditMode
     */
    public String getFeConnEstAuditMode() {
        return feConnEstAuditMode;
    }

    /**
     * This is the setter method to the attribute.
     * Audit tcp connection establishment time on client-side.
     * Enum options - TT_AUDIT_OFF, TT_AUDIT_ON, TT_AUDIT_ON_WITH_SIG.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param feConnEstAuditMode set the feConnEstAuditMode.
     */
    public void setFeConnEstAuditMode(String  feConnEstAuditMode) {
        this.feConnEstAuditMode = feConnEstAuditMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum threshold for tcp connection establishment time on client-side.
     * Field introduced in 22.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return feConnEstThreshold
     */
    public Integer getFeConnEstThreshold() {
        return feConnEstThreshold;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum threshold for tcp connection establishment time on client-side.
     * Field introduced in 22.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param feConnEstThreshold set the feConnEstThreshold.
     */
    public void setFeConnEstThreshold(Integer  feConnEstThreshold) {
        this.feConnEstThreshold = feConnEstThreshold;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Add significance if ingress latency from dispatcher to proxy is breached on any flow.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ingressSigLog
     */
    public Boolean getIngressSigLog() {
        return ingressSigLog;
    }

    /**
     * This is the setter method to the attribute.
     * Add significance if ingress latency from dispatcher to proxy is breached on any flow.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ingressSigLog set the ingressSigLog.
     */
    public void setIngressSigLog(Boolean  ingressSigLog) {
        this.ingressSigLog = ingressSigLog;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      TimeTrackerProperties objTimeTrackerProperties = (TimeTrackerProperties) o;
      return   Objects.equals(this.feConnEstAuditMode, objTimeTrackerProperties.feConnEstAuditMode)&&
  Objects.equals(this.feConnEstThreshold, objTimeTrackerProperties.feConnEstThreshold)&&
  Objects.equals(this.beConnEstAuditMode, objTimeTrackerProperties.beConnEstAuditMode)&&
  Objects.equals(this.beConnEstThreshold, objTimeTrackerProperties.beConnEstThreshold)&&
  Objects.equals(this.ingressSigLog, objTimeTrackerProperties.ingressSigLog);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class TimeTrackerProperties {\n");
                  sb.append("    beConnEstAuditMode: ").append(toIndentedString(beConnEstAuditMode)).append("\n");
                        sb.append("    beConnEstThreshold: ").append(toIndentedString(beConnEstThreshold)).append("\n");
                        sb.append("    feConnEstAuditMode: ").append(toIndentedString(feConnEstAuditMode)).append("\n");
                        sb.append("    feConnEstThreshold: ").append(toIndentedString(feConnEstThreshold)).append("\n");
                        sb.append("    ingressSigLog: ").append(toIndentedString(ingressSigLog)).append("\n");
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

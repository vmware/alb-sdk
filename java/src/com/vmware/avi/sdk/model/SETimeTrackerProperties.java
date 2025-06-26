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
 * The SETimeTrackerProperties is a POJO class extends AviRestResource that used for creating
 * SETimeTrackerProperties.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SETimeTrackerProperties  {
    @JsonProperty("egress_audit_mode")
    private String egressAuditMode = "SE_TT_AUDIT_OFF";

    @JsonProperty("egress_threshold")
    private Integer egressThreshold = 20;

    @JsonProperty("event_gen_window")
    private Integer eventGenWindow = 300;

    @JsonProperty("ingress_audit_mode")
    private String ingressAuditMode = "SE_TT_AUDIT_OFF";

    @JsonProperty("ingress_threshold")
    private Integer ingressThreshold = 20;



    /**
     * This is the getter method this will return the attribute value.
     * Audit queueing latency from proxy to dispatcher.
     * Enum options - SE_TT_AUDIT_OFF, SE_TT_AUDIT_ON, SE_TT_AUDIT_ON_WITH_EVENT.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SE_TT_AUDIT_OFF".
     * @return egressAuditMode
     */
    public String getEgressAuditMode() {
        return egressAuditMode;
    }

    /**
     * This is the setter method to the attribute.
     * Audit queueing latency from proxy to dispatcher.
     * Enum options - SE_TT_AUDIT_OFF, SE_TT_AUDIT_ON, SE_TT_AUDIT_ON_WITH_EVENT.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SE_TT_AUDIT_OFF".
     * @param egressAuditMode set the egressAuditMode.
     */
    public void setEgressAuditMode(String  egressAuditMode) {
        this.egressAuditMode = egressAuditMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum egress latency threshold between dispatcher and proxy.
     * Field introduced in 22.1.1.
     * Unit is milliseconds.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.
     * @return egressThreshold
     */
    public Integer getEgressThreshold() {
        return egressThreshold;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum egress latency threshold between dispatcher and proxy.
     * Field introduced in 22.1.1.
     * Unit is milliseconds.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.
     * @param egressThreshold set the egressThreshold.
     */
    public void setEgressThreshold(Integer  egressThreshold) {
        this.egressThreshold = egressThreshold;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Window for cumulative event generation.
     * Field introduced in 22.1.1.
     * Unit is seconds.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 300.
     * @return eventGenWindow
     */
    public Integer getEventGenWindow() {
        return eventGenWindow;
    }

    /**
     * This is the setter method to the attribute.
     * Window for cumulative event generation.
     * Field introduced in 22.1.1.
     * Unit is seconds.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 300.
     * @param eventGenWindow set the eventGenWindow.
     */
    public void setEventGenWindow(Integer  eventGenWindow) {
        this.eventGenWindow = eventGenWindow;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Audit queueing latency from dispatcher to proxy.
     * Enum options - SE_TT_AUDIT_OFF, SE_TT_AUDIT_ON, SE_TT_AUDIT_ON_WITH_EVENT.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SE_TT_AUDIT_OFF".
     * @return ingressAuditMode
     */
    public String getIngressAuditMode() {
        return ingressAuditMode;
    }

    /**
     * This is the setter method to the attribute.
     * Audit queueing latency from dispatcher to proxy.
     * Enum options - SE_TT_AUDIT_OFF, SE_TT_AUDIT_ON, SE_TT_AUDIT_ON_WITH_EVENT.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SE_TT_AUDIT_OFF".
     * @param ingressAuditMode set the ingressAuditMode.
     */
    public void setIngressAuditMode(String  ingressAuditMode) {
        this.ingressAuditMode = ingressAuditMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum ingress latency threshold between dispatcher and proxy.
     * Field introduced in 22.1.1.
     * Unit is milliseconds.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.
     * @return ingressThreshold
     */
    public Integer getIngressThreshold() {
        return ingressThreshold;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum ingress latency threshold between dispatcher and proxy.
     * Field introduced in 22.1.1.
     * Unit is milliseconds.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.
     * @param ingressThreshold set the ingressThreshold.
     */
    public void setIngressThreshold(Integer  ingressThreshold) {
        this.ingressThreshold = ingressThreshold;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SETimeTrackerProperties objSETimeTrackerProperties = (SETimeTrackerProperties) o;
      return   Objects.equals(this.ingressThreshold, objSETimeTrackerProperties.ingressThreshold)&&
  Objects.equals(this.egressThreshold, objSETimeTrackerProperties.egressThreshold)&&
  Objects.equals(this.ingressAuditMode, objSETimeTrackerProperties.ingressAuditMode)&&
  Objects.equals(this.egressAuditMode, objSETimeTrackerProperties.egressAuditMode)&&
  Objects.equals(this.eventGenWindow, objSETimeTrackerProperties.eventGenWindow);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SETimeTrackerProperties {\n");
                  sb.append("    egressAuditMode: ").append(toIndentedString(egressAuditMode)).append("\n");
                        sb.append("    egressThreshold: ").append(toIndentedString(egressThreshold)).append("\n");
                        sb.append("    eventGenWindow: ").append(toIndentedString(eventGenWindow)).append("\n");
                        sb.append("    ingressAuditMode: ").append(toIndentedString(ingressAuditMode)).append("\n");
                        sb.append("    ingressThreshold: ").append(toIndentedString(ingressThreshold)).append("\n");
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

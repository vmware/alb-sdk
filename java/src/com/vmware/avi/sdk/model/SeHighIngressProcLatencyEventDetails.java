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
 * The SeHighIngressProcLatencyEventDetails is a POJO class extends AviRestResource that used for creating
 * SeHighIngressProcLatencyEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeHighIngressProcLatencyEventDetails  {
    @JsonProperty("dispatcher_core")
    private Integer dispatcherCore = null;

    @JsonProperty("dispatcher_latency_ingress")
    private Integer dispatcherLatencyIngress = null;

    @JsonProperty("event_count")
    private Integer eventCount = null;

    @JsonProperty("flow_core")
    private Integer flowCore = null;

    @JsonProperty("proxy_latency_ingress")
    private Integer proxyLatencyIngress = null;

    @JsonProperty("se_name")
    private String seName = null;

    @JsonProperty("se_ref")
    private String seRef = null;

    @JsonProperty("vs_name")
    private String vsName = null;

    @JsonProperty("vs_ref")
    private String vsRef = null;



    /**
     * This is the getter method this will return the attribute value.
     * Dispatcher core which received the packet.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dispatcherCore
     */
    public Integer getDispatcherCore() {
        return dispatcherCore;
    }

    /**
     * This is the setter method to the attribute.
     * Dispatcher core which received the packet.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dispatcherCore set the dispatcherCore.
     */
    public void setDispatcherCore(Integer  dispatcherCore) {
        this.dispatcherCore = dispatcherCore;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Dispatcher processing latency.
     * Unit is milliseconds.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dispatcherLatencyIngress
     */
    public Integer getDispatcherLatencyIngress() {
        return dispatcherLatencyIngress;
    }

    /**
     * This is the setter method to the attribute.
     * Dispatcher processing latency.
     * Unit is milliseconds.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dispatcherLatencyIngress set the dispatcherLatencyIngress.
     */
    public void setDispatcherLatencyIngress(Integer  dispatcherLatencyIngress) {
        this.dispatcherLatencyIngress = dispatcherLatencyIngress;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of events in a 30 second interval.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return eventCount
     */
    public Integer getEventCount() {
        return eventCount;
    }

    /**
     * This is the setter method to the attribute.
     * Number of events in a 30 second interval.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param eventCount set the eventCount.
     */
    public void setEventCount(Integer  eventCount) {
        this.eventCount = eventCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Proxy core which processed the packet.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return flowCore
     */
    public Integer getFlowCore() {
        return flowCore;
    }

    /**
     * This is the setter method to the attribute.
     * Proxy core which processed the packet.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param flowCore set the flowCore.
     */
    public void setFlowCore(Integer  flowCore) {
        this.flowCore = flowCore;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Proxy dequeue latency.
     * Unit is milliseconds.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return proxyLatencyIngress
     */
    public Integer getProxyLatencyIngress() {
        return proxyLatencyIngress;
    }

    /**
     * This is the setter method to the attribute.
     * Proxy dequeue latency.
     * Unit is milliseconds.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param proxyLatencyIngress set the proxyLatencyIngress.
     */
    public void setProxyLatencyIngress(Integer  proxyLatencyIngress) {
        this.proxyLatencyIngress = proxyLatencyIngress;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Se name.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seName
     */
    public String getSeName() {
        return seName;
    }

    /**
     * This is the setter method to the attribute.
     * Se name.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seName set the seName.
     */
    public void setSeName(String  seName) {
        this.seName = seName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Se uuid.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seRef
     */
    public String getSeRef() {
        return seRef;
    }

    /**
     * This is the setter method to the attribute.
     * Se uuid.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seRef set the seRef.
     */
    public void setSeRef(String  seRef) {
        this.seRef = seRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vs name.
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsName
     */
    public String getVsName() {
        return vsName;
    }

    /**
     * This is the setter method to the attribute.
     * Vs name.
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsName set the vsName.
     */
    public void setVsName(String  vsName) {
        this.vsName = vsName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vs uuid.
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsRef
     */
    public String getVsRef() {
        return vsRef;
    }

    /**
     * This is the setter method to the attribute.
     * Vs uuid.
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsRef set the vsRef.
     */
    public void setVsRef(String  vsRef) {
        this.vsRef = vsRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SeHighIngressProcLatencyEventDetails objSeHighIngressProcLatencyEventDetails = (SeHighIngressProcLatencyEventDetails) o;
      return   Objects.equals(this.seName, objSeHighIngressProcLatencyEventDetails.seName)&&
  Objects.equals(this.seRef, objSeHighIngressProcLatencyEventDetails.seRef)&&
  Objects.equals(this.vsName, objSeHighIngressProcLatencyEventDetails.vsName)&&
  Objects.equals(this.vsRef, objSeHighIngressProcLatencyEventDetails.vsRef)&&
  Objects.equals(this.dispatcherLatencyIngress, objSeHighIngressProcLatencyEventDetails.dispatcherLatencyIngress)&&
  Objects.equals(this.proxyLatencyIngress, objSeHighIngressProcLatencyEventDetails.proxyLatencyIngress)&&
  Objects.equals(this.dispatcherCore, objSeHighIngressProcLatencyEventDetails.dispatcherCore)&&
  Objects.equals(this.flowCore, objSeHighIngressProcLatencyEventDetails.flowCore)&&
  Objects.equals(this.eventCount, objSeHighIngressProcLatencyEventDetails.eventCount);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeHighIngressProcLatencyEventDetails {\n");
                  sb.append("    dispatcherCore: ").append(toIndentedString(dispatcherCore)).append("\n");
                        sb.append("    dispatcherLatencyIngress: ").append(toIndentedString(dispatcherLatencyIngress)).append("\n");
                        sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
                        sb.append("    flowCore: ").append(toIndentedString(flowCore)).append("\n");
                        sb.append("    proxyLatencyIngress: ").append(toIndentedString(proxyLatencyIngress)).append("\n");
                        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
                        sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
                        sb.append("    vsName: ").append(toIndentedString(vsName)).append("\n");
                        sb.append("    vsRef: ").append(toIndentedString(vsRef)).append("\n");
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

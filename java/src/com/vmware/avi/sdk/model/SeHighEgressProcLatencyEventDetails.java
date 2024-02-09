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
 * The SeHighEgressProcLatencyEventDetails is a POJO class extends AviRestResource that used for creating
 * SeHighEgressProcLatencyEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeHighEgressProcLatencyEventDetails  {
    @JsonProperty("dispatcher_core")
    private Integer dispatcherCore;

    @JsonProperty("event_count")
    private Integer eventCount;

    @JsonProperty("flow_core")
    private List<Integer> flowCore;

    @JsonProperty("max_proxy_to_disp_queing_delay")
    private Integer maxProxyToDispQueingDelay;

    @JsonProperty("se_name")
    private String seName;

    @JsonProperty("se_ref")
    private String seRef;



    /**
     * This is the getter method this will return the attribute value.
     * Dispatcher core which received the packet.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dispatcherCore
     */
    public Integer getDispatcherCore() {
        return dispatcherCore;
    }

    /**
     * This is the setter method to the attribute.
     * Dispatcher core which received the packet.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dispatcherCore set the dispatcherCore.
     */
    public void setDispatcherCore(Integer  dispatcherCore) {
        this.dispatcherCore = dispatcherCore;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of events in a 30 second interval.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return eventCount
     */
    public Integer getEventCount() {
        return eventCount;
    }

    /**
     * This is the setter method to the attribute.
     * Number of events in a 30 second interval.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param eventCount set the eventCount.
     */
    public void setEventCount(Integer  eventCount) {
        this.eventCount = eventCount;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Proxy core which processed the packet.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return flowCore
     */
    public List<Integer> getFlowCore() {
        return flowCore;
    }

    /**
     * This is the setter method. this will set the flowCore
     * Proxy core which processed the packet.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return flowCore
     */
    public void setFlowCore(List<Integer>  flowCore) {
        this.flowCore = flowCore;
    }

    /**
     * This is the setter method this will set the flowCore
     * Proxy core which processed the packet.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return flowCore
     */
    public SeHighEgressProcLatencyEventDetails addFlowCoreItem(Integer flowCoreItem) {
      if (this.flowCore == null) {
        this.flowCore = new ArrayList<Integer>();
      }
      this.flowCore.add(flowCoreItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Proxy dequeue latency.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return maxProxyToDispQueingDelay
     */
    public Integer getMaxProxyToDispQueingDelay() {
        return maxProxyToDispQueingDelay;
    }

    /**
     * This is the setter method to the attribute.
     * Proxy dequeue latency.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param maxProxyToDispQueingDelay set the maxProxyToDispQueingDelay.
     */
    public void setMaxProxyToDispQueingDelay(Integer  maxProxyToDispQueingDelay) {
        this.maxProxyToDispQueingDelay = maxProxyToDispQueingDelay;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Se name.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seRef set the seRef.
     */
    public void setSeRef(String  seRef) {
        this.seRef = seRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SeHighEgressProcLatencyEventDetails objSeHighEgressProcLatencyEventDetails = (SeHighEgressProcLatencyEventDetails) o;
      return   Objects.equals(this.seName, objSeHighEgressProcLatencyEventDetails.seName)&&
  Objects.equals(this.seRef, objSeHighEgressProcLatencyEventDetails.seRef)&&
  Objects.equals(this.maxProxyToDispQueingDelay, objSeHighEgressProcLatencyEventDetails.maxProxyToDispQueingDelay)&&
  Objects.equals(this.dispatcherCore, objSeHighEgressProcLatencyEventDetails.dispatcherCore)&&
  Objects.equals(this.flowCore, objSeHighEgressProcLatencyEventDetails.flowCore)&&
  Objects.equals(this.eventCount, objSeHighEgressProcLatencyEventDetails.eventCount);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeHighEgressProcLatencyEventDetails {\n");
                  sb.append("    dispatcherCore: ").append(toIndentedString(dispatcherCore)).append("\n");
                        sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
                        sb.append("    flowCore: ").append(toIndentedString(flowCore)).append("\n");
                        sb.append("    maxProxyToDispQueingDelay: ").append(toIndentedString(maxProxyToDispQueingDelay)).append("\n");
                        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
                        sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
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

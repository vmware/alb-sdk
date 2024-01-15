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
 * The CapturePacketFilter is a POJO class extends AviRestResource that used for creating
 * CapturePacketFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CapturePacketFilter  {
    @JsonProperty("capture_tcp_filters")
    private List<CaptureTCPFilter> captureTcpFilters = null;


    /**
     * This is the getter method this will return the attribute value.
     * Tcp params filter.
     * And'ed internally and or'ed amongst each other.
     * Field introduced in 30.2.1.
     * Maximum of 20 items allowed.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return captureTcpFilters
     */
    public List<CaptureTCPFilter> getCaptureTcpFilters() {
        return captureTcpFilters;
    }

    /**
     * This is the setter method. this will set the captureTcpFilters
     * Tcp params filter.
     * And'ed internally and or'ed amongst each other.
     * Field introduced in 30.2.1.
     * Maximum of 20 items allowed.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return captureTcpFilters
     */
    public void setCaptureTcpFilters(List<CaptureTCPFilter>  captureTcpFilters) {
        this.captureTcpFilters = captureTcpFilters;
    }

    /**
     * This is the setter method this will set the captureTcpFilters
     * Tcp params filter.
     * And'ed internally and or'ed amongst each other.
     * Field introduced in 30.2.1.
     * Maximum of 20 items allowed.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return captureTcpFilters
     */
    public CapturePacketFilter addCaptureTcpFiltersItem(CaptureTCPFilter captureTcpFiltersItem) {
      if (this.captureTcpFilters == null) {
        this.captureTcpFilters = new ArrayList<CaptureTCPFilter>();
      }
      this.captureTcpFilters.add(captureTcpFiltersItem);
      return this;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      CapturePacketFilter objCapturePacketFilter = (CapturePacketFilter) o;
      return   Objects.equals(this.captureTcpFilters, objCapturePacketFilter.captureTcpFilters);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CapturePacketFilter {\n");
                  sb.append("    captureTcpFilters: ").append(toIndentedString(captureTcpFilters)).append("\n");
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

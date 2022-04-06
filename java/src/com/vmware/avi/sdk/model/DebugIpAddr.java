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
 * The DebugIpAddr is a POJO class extends AviRestResource that used for creating
 * DebugIpAddr.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DebugIpAddr  {
    @JsonProperty("addrs")
    private List<IpAddr> addrs = null;

    @JsonProperty("prefixes")
    private List<IpAddrPrefix> prefixes = null;

    @JsonProperty("ranges")
    private List<IpAddrRange> ranges = null;


    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return addrs
     */
    public List<IpAddr> getAddrs() {
        return addrs;
    }

    /**
     * This is the setter method. this will set the addrs
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return addrs
     */
    public void setAddrs(List<IpAddr>  addrs) {
        this.addrs = addrs;
    }

    /**
     * This is the setter method this will set the addrs
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return addrs
     */
    public DebugIpAddr addAddrsItem(IpAddr addrsItem) {
      if (this.addrs == null) {
        this.addrs = new ArrayList<IpAddr>();
      }
      this.addrs.add(addrsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return prefixes
     */
    public List<IpAddrPrefix> getPrefixes() {
        return prefixes;
    }

    /**
     * This is the setter method. this will set the prefixes
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return prefixes
     */
    public void setPrefixes(List<IpAddrPrefix>  prefixes) {
        this.prefixes = prefixes;
    }

    /**
     * This is the setter method this will set the prefixes
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return prefixes
     */
    public DebugIpAddr addPrefixesItem(IpAddrPrefix prefixesItem) {
      if (this.prefixes == null) {
        this.prefixes = new ArrayList<IpAddrPrefix>();
      }
      this.prefixes.add(prefixesItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ranges
     */
    public List<IpAddrRange> getRanges() {
        return ranges;
    }

    /**
     * This is the setter method. this will set the ranges
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ranges
     */
    public void setRanges(List<IpAddrRange>  ranges) {
        this.ranges = ranges;
    }

    /**
     * This is the setter method this will set the ranges
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ranges
     */
    public DebugIpAddr addRangesItem(IpAddrRange rangesItem) {
      if (this.ranges == null) {
        this.ranges = new ArrayList<IpAddrRange>();
      }
      this.ranges.add(rangesItem);
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
      DebugIpAddr objDebugIpAddr = (DebugIpAddr) o;
      return   Objects.equals(this.addrs, objDebugIpAddr.addrs)&&
  Objects.equals(this.ranges, objDebugIpAddr.ranges)&&
  Objects.equals(this.prefixes, objDebugIpAddr.prefixes);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DebugIpAddr {\n");
                  sb.append("    addrs: ").append(toIndentedString(addrs)).append("\n");
                        sb.append("    prefixes: ").append(toIndentedString(prefixes)).append("\n");
                        sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
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

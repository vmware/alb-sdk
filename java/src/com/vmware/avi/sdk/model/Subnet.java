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
 * The Subnet is a POJO class extends AviRestResource that used for creating
 * Subnet.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Subnet  {
    @JsonProperty("prefix")
    private IpAddrPrefix prefix;

    @JsonProperty("static_ip_ranges")
    private List<StaticIpRange> staticIpRanges;



    /**
     * This is the getter method this will return the attribute value.
     * Specify an ip subnet prefix for this network.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return prefix
     */
    public IpAddrPrefix getPrefix() {
        return prefix;
    }

    /**
     * This is the setter method to the attribute.
     * Specify an ip subnet prefix for this network.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param prefix set the prefix.
     */
    public void setPrefix(IpAddrPrefix prefix) {
        this.prefix = prefix;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Static ip ranges for this subnet.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return staticIpRanges
     */
    public List<StaticIpRange> getStaticIpRanges() {
        return staticIpRanges;
    }

    /**
     * This is the setter method. this will set the staticIpRanges
     * Static ip ranges for this subnet.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return staticIpRanges
     */
    public void setStaticIpRanges(List<StaticIpRange>  staticIpRanges) {
        this.staticIpRanges = staticIpRanges;
    }

    /**
     * This is the setter method this will set the staticIpRanges
     * Static ip ranges for this subnet.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return staticIpRanges
     */
    public Subnet addStaticIpRangesItem(StaticIpRange staticIpRangesItem) {
      if (this.staticIpRanges == null) {
        this.staticIpRanges = new ArrayList<StaticIpRange>();
      }
      this.staticIpRanges.add(staticIpRangesItem);
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
      Subnet objSubnet = (Subnet) o;
      return   Objects.equals(this.prefix, objSubnet.prefix)&&
  Objects.equals(this.staticIpRanges, objSubnet.staticIpRanges);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class Subnet {\n");
                  sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
                        sb.append("    staticIpRanges: ").append(toIndentedString(staticIpRanges)).append("\n");
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

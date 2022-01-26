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
 * The IPAddrLimits is a POJO class extends AviRestResource that used for creating
 * IPAddrLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IPAddrLimits  {
    @JsonProperty("ip_address_group_per_match_criteria")
    private Integer ipAddressGroupPerMatchCriteria = null;

    @JsonProperty("ip_address_prefix_per_match_criteria")
    private Integer ipAddressPrefixPerMatchCriteria = null;

    @JsonProperty("ip_address_range_per_match_criteria")
    private Integer ipAddressRangePerMatchCriteria = null;

    @JsonProperty("ip_addresses_per_match_criteria")
    private Integer ipAddressesPerMatchCriteria = null;



    /**
     * This is the getter method this will return the attribute value.
     * Number of ip address groups for match criteria.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipAddressGroupPerMatchCriteria
     */
    public Integer getIpAddressGroupPerMatchCriteria() {
        return ipAddressGroupPerMatchCriteria;
    }

    /**
     * This is the setter method to the attribute.
     * Number of ip address groups for match criteria.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipAddressGroupPerMatchCriteria set the ipAddressGroupPerMatchCriteria.
     */
    public void setIpAddressGroupPerMatchCriteria(Integer  ipAddressGroupPerMatchCriteria) {
        this.ipAddressGroupPerMatchCriteria = ipAddressGroupPerMatchCriteria;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of ip address prefixes for match criteria.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipAddressPrefixPerMatchCriteria
     */
    public Integer getIpAddressPrefixPerMatchCriteria() {
        return ipAddressPrefixPerMatchCriteria;
    }

    /**
     * This is the setter method to the attribute.
     * Number of ip address prefixes for match criteria.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipAddressPrefixPerMatchCriteria set the ipAddressPrefixPerMatchCriteria.
     */
    public void setIpAddressPrefixPerMatchCriteria(Integer  ipAddressPrefixPerMatchCriteria) {
        this.ipAddressPrefixPerMatchCriteria = ipAddressPrefixPerMatchCriteria;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of ip address ranges for match criteria.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipAddressRangePerMatchCriteria
     */
    public Integer getIpAddressRangePerMatchCriteria() {
        return ipAddressRangePerMatchCriteria;
    }

    /**
     * This is the setter method to the attribute.
     * Number of ip address ranges for match criteria.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipAddressRangePerMatchCriteria set the ipAddressRangePerMatchCriteria.
     */
    public void setIpAddressRangePerMatchCriteria(Integer  ipAddressRangePerMatchCriteria) {
        this.ipAddressRangePerMatchCriteria = ipAddressRangePerMatchCriteria;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of ip addresses for match criteria.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipAddressesPerMatchCriteria
     */
    public Integer getIpAddressesPerMatchCriteria() {
        return ipAddressesPerMatchCriteria;
    }

    /**
     * This is the setter method to the attribute.
     * Number of ip addresses for match criteria.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipAddressesPerMatchCriteria set the ipAddressesPerMatchCriteria.
     */
    public void setIpAddressesPerMatchCriteria(Integer  ipAddressesPerMatchCriteria) {
        this.ipAddressesPerMatchCriteria = ipAddressesPerMatchCriteria;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      IPAddrLimits objIPAddrLimits = (IPAddrLimits) o;
      return   Objects.equals(this.ipAddressesPerMatchCriteria, objIPAddrLimits.ipAddressesPerMatchCriteria)&&
  Objects.equals(this.ipAddressRangePerMatchCriteria, objIPAddrLimits.ipAddressRangePerMatchCriteria)&&
  Objects.equals(this.ipAddressPrefixPerMatchCriteria, objIPAddrLimits.ipAddressPrefixPerMatchCriteria)&&
  Objects.equals(this.ipAddressGroupPerMatchCriteria, objIPAddrLimits.ipAddressGroupPerMatchCriteria);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class IPAddrLimits {\n");
                  sb.append("    ipAddressGroupPerMatchCriteria: ").append(toIndentedString(ipAddressGroupPerMatchCriteria)).append("\n");
                        sb.append("    ipAddressPrefixPerMatchCriteria: ").append(toIndentedString(ipAddressPrefixPerMatchCriteria)).append("\n");
                        sb.append("    ipAddressRangePerMatchCriteria: ").append(toIndentedString(ipAddressRangePerMatchCriteria)).append("\n");
                        sb.append("    ipAddressesPerMatchCriteria: ").append(toIndentedString(ipAddressesPerMatchCriteria)).append("\n");
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

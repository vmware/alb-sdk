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
 * The IpAddrPrefix is a POJO class extends AviRestResource that used for creating
 * IpAddrPrefix.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IpAddrPrefix  {
    @JsonProperty("ip_addr")
    private IpAddr ipAddr = null;

    @JsonProperty("mask")
    private Integer mask = null;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipAddr
     */
    public IpAddr getIpAddr() {
        return ipAddr;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipAddr set the ipAddr.
     */
    public void setIpAddr(IpAddr ipAddr) {
        this.ipAddr = ipAddr;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mask
     */
    public Integer getMask() {
        return mask;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mask set the mask.
     */
    public void setMask(Integer  mask) {
        this.mask = mask;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      IpAddrPrefix objIpAddrPrefix = (IpAddrPrefix) o;
      return   Objects.equals(this.ipAddr, objIpAddrPrefix.ipAddr)&&
  Objects.equals(this.mask, objIpAddrPrefix.mask);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class IpAddrPrefix {\n");
                  sb.append("    ipAddr: ").append(toIndentedString(ipAddr)).append("\n");
                        sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
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

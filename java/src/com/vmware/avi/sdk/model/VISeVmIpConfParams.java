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
 * The VISeVmIpConfParams is a POJO class extends AviRestResource that used for creating
 * VISeVmIpConfParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VISeVmIpConfParams  {
    @JsonProperty("default_gw")
    private String defaultGw = null;

    @JsonProperty("mgmt_ip_addr")
    private String mgmtIpAddr = null;

    @JsonProperty("mgmt_ip_type")
    private String mgmtIpType = null;

    @JsonProperty("mgmt_net_mask")
    private String mgmtNetMask = null;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return defaultGw
     */
    public String getDefaultGw() {
        return defaultGw;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param defaultGw set the defaultGw.
     */
    public void setDefaultGw(String  defaultGw) {
        this.defaultGw = defaultGw;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mgmtIpAddr
     */
    public String getMgmtIpAddr() {
        return mgmtIpAddr;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mgmtIpAddr set the mgmtIpAddr.
     */
    public void setMgmtIpAddr(String  mgmtIpAddr) {
        this.mgmtIpAddr = mgmtIpAddr;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - VNIC_IP_TYPE_DHCP, VNIC_IP_TYPE_STATIC.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mgmtIpType
     */
    public String getMgmtIpType() {
        return mgmtIpType;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - VNIC_IP_TYPE_DHCP, VNIC_IP_TYPE_STATIC.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mgmtIpType set the mgmtIpType.
     */
    public void setMgmtIpType(String  mgmtIpType) {
        this.mgmtIpType = mgmtIpType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mgmtNetMask
     */
    public String getMgmtNetMask() {
        return mgmtNetMask;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mgmtNetMask set the mgmtNetMask.
     */
    public void setMgmtNetMask(String  mgmtNetMask) {
        this.mgmtNetMask = mgmtNetMask;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VISeVmIpConfParams objVISeVmIpConfParams = (VISeVmIpConfParams) o;
      return   Objects.equals(this.mgmtIpType, objVISeVmIpConfParams.mgmtIpType)&&
  Objects.equals(this.mgmtIpAddr, objVISeVmIpConfParams.mgmtIpAddr)&&
  Objects.equals(this.mgmtNetMask, objVISeVmIpConfParams.mgmtNetMask)&&
  Objects.equals(this.defaultGw, objVISeVmIpConfParams.defaultGw);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VISeVmIpConfParams {\n");
                  sb.append("    defaultGw: ").append(toIndentedString(defaultGw)).append("\n");
                        sb.append("    mgmtIpAddr: ").append(toIndentedString(mgmtIpAddr)).append("\n");
                        sb.append("    mgmtIpType: ").append(toIndentedString(mgmtIpType)).append("\n");
                        sb.append("    mgmtNetMask: ").append(toIndentedString(mgmtNetMask)).append("\n");
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

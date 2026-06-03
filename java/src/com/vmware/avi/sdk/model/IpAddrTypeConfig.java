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
 * The IpAddrTypeConfig is a POJO class extends AviRestResource that used for creating
 * IpAddrTypeConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IpAddrTypeConfig  {
    @JsonProperty("ip_type")
    private String ipType;

    @JsonProperty("periodicity")
    private Integer periodicity;



    /**
     * This is the getter method this will return the attribute value.
     * Ip address type for which periodic ip advertisement (gratarp/na) is enabled.
     * Supported values are vip_ip, snat_ip, floating_intf_ip, and primary_intf_ip.
     * Enum options - NAT_IP, VIP_IP, SNAT_IP, FLOATING_INTF_IP, PRIMARY_INTF_IP.
     * Field introduced in 32.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipType
     */
    public String getIpType() {
        return ipType;
    }

    /**
     * This is the setter method to the attribute.
     * Ip address type for which periodic ip advertisement (gratarp/na) is enabled.
     * Supported values are vip_ip, snat_ip, floating_intf_ip, and primary_intf_ip.
     * Enum options - NAT_IP, VIP_IP, SNAT_IP, FLOATING_INTF_IP, PRIMARY_INTF_IP.
     * Field introduced in 32.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipType set the ipType.
     */
    public void setIpType(String  ipType) {
        this.ipType = ipType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Periodicity override for this ip type in minutes.
     * If not set, uses ip_advertisement_profile.default_periodicity.
     * Allowed values are 1-30.
     * Field introduced in 32.1.3.
     * Unit is min.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return periodicity
     */
    public Integer getPeriodicity() {
        return periodicity;
    }

    /**
     * This is the setter method to the attribute.
     * Periodicity override for this ip type in minutes.
     * If not set, uses ip_advertisement_profile.default_periodicity.
     * Allowed values are 1-30.
     * Field introduced in 32.1.3.
     * Unit is min.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param periodicity set the periodicity.
     */
    public void setPeriodicity(Integer  periodicity) {
        this.periodicity = periodicity;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      IpAddrTypeConfig objIpAddrTypeConfig = (IpAddrTypeConfig) o;
      return   Objects.equals(this.ipType, objIpAddrTypeConfig.ipType)&&
  Objects.equals(this.periodicity, objIpAddrTypeConfig.periodicity);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class IpAddrTypeConfig {\n");
                  sb.append("    ipType: ").append(toIndentedString(ipType)).append("\n");
                        sb.append("    periodicity: ").append(toIndentedString(periodicity)).append("\n");
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

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
 * The CustomIpamSubnet is a POJO class extends AviRestResource that used for creating
 * CustomIpamSubnet.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomIpamSubnet  {
    @JsonProperty("network_id")
    private String networkId = null;

    @JsonProperty("subnet")
    private IpAddrPrefix subnet = null;

    @JsonProperty("subnet6")
    private IpAddrPrefix subnet6 = null;



    /**
     * This is the getter method this will return the attribute value.
     * Network to use for custom ipam ip allocation.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    /**
     * This is the setter method to the attribute.
     * Network to use for custom ipam ip allocation.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param networkId set the networkId.
     */
    public void setNetworkId(String  networkId) {
        this.networkId = networkId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ipv4 subnet to use for custom ipam ip allocation.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return subnet
     */
    public IpAddrPrefix getSubnet() {
        return subnet;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv4 subnet to use for custom ipam ip allocation.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param subnet set the subnet.
     */
    public void setSubnet(IpAddrPrefix subnet) {
        this.subnet = subnet;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ipv6 subnet to use for custom ipam ip allocation.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return subnet6
     */
    public IpAddrPrefix getSubnet6() {
        return subnet6;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv6 subnet to use for custom ipam ip allocation.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param subnet6 set the subnet6.
     */
    public void setSubnet6(IpAddrPrefix subnet6) {
        this.subnet6 = subnet6;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      CustomIpamSubnet objCustomIpamSubnet = (CustomIpamSubnet) o;
      return   Objects.equals(this.networkId, objCustomIpamSubnet.networkId)&&
  Objects.equals(this.subnet, objCustomIpamSubnet.subnet)&&
  Objects.equals(this.subnet6, objCustomIpamSubnet.subnet6);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CustomIpamSubnet {\n");
                  sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
                        sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
                        sb.append("    subnet6: ").append(toIndentedString(subnet6)).append("\n");
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

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
 * The ApicAgentVsNetworkError is a POJO class extends AviRestResource that used for creating
 * ApicAgentVsNetworkError.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApicAgentVsNetworkError  {
    @JsonProperty("pool_name")
    private String poolName;

    @JsonProperty("pool_network")
    private String poolNetwork;

    @JsonProperty("vs_name")
    private String vsName;

    @JsonProperty("vs_network")
    private String vsNetwork;



    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param poolName set the poolName.
     */
    public void setPoolName(String  poolName) {
        this.poolName = poolName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return poolNetwork
     */
    public String getPoolNetwork() {
        return poolNetwork;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param poolNetwork set the poolNetwork.
     */
    public void setPoolNetwork(String  poolNetwork) {
        this.poolNetwork = poolNetwork;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return vsName
     */
    public String getVsName() {
        return vsName;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param vsName set the vsName.
     */
    public void setVsName(String  vsName) {
        this.vsName = vsName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return vsNetwork
     */
    public String getVsNetwork() {
        return vsNetwork;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param vsNetwork set the vsNetwork.
     */
    public void setVsNetwork(String  vsNetwork) {
        this.vsNetwork = vsNetwork;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApicAgentVsNetworkError objApicAgentVsNetworkError = (ApicAgentVsNetworkError) o;
      return   Objects.equals(this.vsName, objApicAgentVsNetworkError.vsName)&&
  Objects.equals(this.vsNetwork, objApicAgentVsNetworkError.vsNetwork)&&
  Objects.equals(this.poolName, objApicAgentVsNetworkError.poolName)&&
  Objects.equals(this.poolNetwork, objApicAgentVsNetworkError.poolNetwork);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApicAgentVsNetworkError {\n");
                  sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
                        sb.append("    poolNetwork: ").append(toIndentedString(poolNetwork)).append("\n");
                        sb.append("    vsName: ").append(toIndentedString(vsName)).append("\n");
                        sb.append("    vsNetwork: ").append(toIndentedString(vsNetwork)).append("\n");
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

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
 * The GCPVIPRoutes is a POJO class extends AviRestResource that used for creating
 * GCPVIPRoutes.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GCPVIPRoutes  {
    @JsonProperty("match_se_group_subnet")
    private Boolean matchSeGroupSubnet = false;

    @JsonProperty("route_priority")
    private Integer routePriority = 2000;



    /**
     * This is the getter method this will return the attribute value.
     * Match se group subnets for vip placement.
     * Default is to not match se group subnets.
     * Field introduced in 18.2.9, 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return matchSeGroupSubnet
     */
    public Boolean getMatchSeGroupSubnet() {
        return matchSeGroupSubnet;
    }

    /**
     * This is the setter method to the attribute.
     * Match se group subnets for vip placement.
     * Default is to not match se group subnets.
     * Field introduced in 18.2.9, 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param matchSeGroupSubnet set the matchSeGroupSubnet.
     */
    public void setMatchSeGroupSubnet(Boolean  matchSeGroupSubnet) {
        this.matchSeGroupSubnet = matchSeGroupSubnet;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Priority of the routes created in gcp.
     * Field introduced in 20.1.7, 21.1.2.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
     * @return routePriority
     */
    public Integer getRoutePriority() {
        return routePriority;
    }

    /**
     * This is the setter method to the attribute.
     * Priority of the routes created in gcp.
     * Field introduced in 20.1.7, 21.1.2.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
     * @param routePriority set the routePriority.
     */
    public void setRoutePriority(Integer  routePriority) {
        this.routePriority = routePriority;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      GCPVIPRoutes objGCPVIPRoutes = (GCPVIPRoutes) o;
      return   Objects.equals(this.matchSeGroupSubnet, objGCPVIPRoutes.matchSeGroupSubnet)&&
  Objects.equals(this.routePriority, objGCPVIPRoutes.routePriority);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GCPVIPRoutes {\n");
                  sb.append("    matchSeGroupSubnet: ").append(toIndentedString(matchSeGroupSubnet)).append("\n");
                        sb.append("    routePriority: ").append(toIndentedString(routePriority)).append("\n");
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

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
 * The SiteInfo is a POJO class extends AviRestResource that used for creating
 * SiteInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SiteInfo  {
    @JsonProperty("cluster_id")
    private String clusterId;



    /**
     * This is the getter method this will return the attribute value.
     * Cluster_uuid of a member configured in gslb federation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * This is the setter method to the attribute.
     * Cluster_uuid of a member configured in gslb federation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clusterId set the clusterId.
     */
    public void setClusterId(String  clusterId) {
        this.clusterId = clusterId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SiteInfo objSiteInfo = (SiteInfo) o;
      return   Objects.equals(this.clusterId, objSiteInfo.clusterId);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SiteInfo {\n");
                  sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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

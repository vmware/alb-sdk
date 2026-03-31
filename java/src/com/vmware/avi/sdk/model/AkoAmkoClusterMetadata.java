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
 * The AkoAmkoClusterMetadata is a POJO class extends AviRestResource that used for creating
 * AkoAmkoClusterMetadata.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AkoAmkoClusterMetadata  {
    @JsonProperty("cni")
    private String cni;

    @JsonProperty("node_count")
    private Integer nodeCount;



    /**
     * This is the getter method this will return the attribute value.
     * Container network interface (cni) type.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cni
     */
    public String getCni() {
        return cni;
    }

    /**
     * This is the setter method to the attribute.
     * Container network interface (cni) type.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cni set the cni.
     */
    public void setCni(String  cni) {
        this.cni = cni;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of nodes in the kubernetes cluster.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    /**
     * This is the setter method to the attribute.
     * Number of nodes in the kubernetes cluster.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nodeCount set the nodeCount.
     */
    public void setNodeCount(Integer  nodeCount) {
        this.nodeCount = nodeCount;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      AkoAmkoClusterMetadata objAkoAmkoClusterMetadata = (AkoAmkoClusterMetadata) o;
      return   Objects.equals(this.cni, objAkoAmkoClusterMetadata.cni)&&
  Objects.equals(this.nodeCount, objAkoAmkoClusterMetadata.nodeCount);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AkoAmkoClusterMetadata {\n");
                  sb.append("    cni: ").append(toIndentedString(cni)).append("\n");
                        sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
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

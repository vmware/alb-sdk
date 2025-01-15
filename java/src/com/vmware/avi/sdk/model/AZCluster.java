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
 * The AZCluster is a POJO class extends AviRestResource that used for creating
 * AZCluster.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AZCluster  {
    @JsonProperty("cluster_ids")
    private List<String> clusterIds;

    @JsonProperty("vcenter_ref")
    private String vcenterRef;


    /**
     * This is the getter method this will return the attribute value.
     * Managed object id of clusters belongs to the az.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterIds
     */
    public List<String> getClusterIds() {
        return clusterIds;
    }

    /**
     * This is the setter method. this will set the clusterIds
     * Managed object id of clusters belongs to the az.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterIds
     */
    public void setClusterIds(List<String>  clusterIds) {
        this.clusterIds = clusterIds;
    }

    /**
     * This is the setter method this will set the clusterIds
     * Managed object id of clusters belongs to the az.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterIds
     */
    public AZCluster addClusterIdsItem(String clusterIdsItem) {
      if (this.clusterIds == null) {
        this.clusterIds = new ArrayList<String>();
      }
      this.clusterIds.add(clusterIdsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vcenter id of the clusters.
     * It is a reference to an object of type vcenterserver.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterRef
     */
    public String getVcenterRef() {
        return vcenterRef;
    }

    /**
     * This is the setter method to the attribute.
     * Vcenter id of the clusters.
     * It is a reference to an object of type vcenterserver.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterRef set the vcenterRef.
     */
    public void setVcenterRef(String  vcenterRef) {
        this.vcenterRef = vcenterRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      AZCluster objAZCluster = (AZCluster) o;
      return   Objects.equals(this.vcenterRef, objAZCluster.vcenterRef)&&
  Objects.equals(this.clusterIds, objAZCluster.clusterIds);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AZCluster {\n");
                  sb.append("    clusterIds: ").append(toIndentedString(clusterIds)).append("\n");
                        sb.append("    vcenterRef: ").append(toIndentedString(vcenterRef)).append("\n");
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

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
 * The VcenterClusters is a POJO class extends AviRestResource that used for creating
 * VcenterClusters.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VcenterClusters  {
    @JsonProperty("cluster_refs")
    private List<String> clusterRefs = null;

    @JsonProperty("include")
    private Boolean include = false;


    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type vimgrclusterruntime.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterRefs
     */
    public List<String> getClusterRefs() {
        return clusterRefs;
    }

    /**
     * This is the setter method. this will set the clusterRefs
     * It is a reference to an object of type vimgrclusterruntime.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterRefs
     */
    public void setClusterRefs(List<String>  clusterRefs) {
        this.clusterRefs = clusterRefs;
    }

    /**
     * This is the setter method this will set the clusterRefs
     * It is a reference to an object of type vimgrclusterruntime.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterRefs
     */
    public VcenterClusters addClusterRefsItem(String clusterRefsItem) {
      if (this.clusterRefs == null) {
        this.clusterRefs = new ArrayList<String>();
      }
      this.clusterRefs.add(clusterRefsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return include
     */
    public Boolean getInclude() {
        return include;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param include set the include.
     */
    public void setInclude(Boolean  include) {
        this.include = include;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VcenterClusters objVcenterClusters = (VcenterClusters) o;
      return   Objects.equals(this.clusterRefs, objVcenterClusters.clusterRefs)&&
  Objects.equals(this.include, objVcenterClusters.include);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VcenterClusters {\n");
                  sb.append("    clusterRefs: ").append(toIndentedString(clusterRefs)).append("\n");
                        sb.append("    include: ").append(toIndentedString(include)).append("\n");
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

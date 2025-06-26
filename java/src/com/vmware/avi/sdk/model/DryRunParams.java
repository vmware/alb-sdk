/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */

package com.vmware.avi.sdk.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The DryRunParams is a POJO class extends AviRestResource that used for creating
 * DryRunParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DryRunParams  {
    @JsonIgnore
    private Boolean allowSingleNode = false;

    @JsonProperty("memory")
    private Float memory = 6.0f;

    @JsonProperty("num_cpu")
    private Integer numCpu = 2;

    @JsonProperty("preferred_worker")
    private String preferredWorker;



    /**
     * This is the getter method this will return the attribute value.
     * Allow dry-run operation on single node controller.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return allowSingleNode
     */
    public Boolean getAllowSingleNode() {
        return allowSingleNode;
    }

    /**
     * This is the setter method to the attribute.
     * Allow dry-run operation on single node controller.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param allowSingleNode set the allowSingleNode.
     */
    public void setAllowSingleNode(Boolean  allowSingleNode) {
        this.allowSingleNode = allowSingleNode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Amount of memory allocated for dry-run.
     * Field introduced in 31.1.1.
     * Unit is gb.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 6.0f.
     * @return memory
     */
    public Float getMemory() {
        return memory;
    }

    /**
     * This is the setter method to the attribute.
     * Amount of memory allocated for dry-run.
     * Field introduced in 31.1.1.
     * Unit is gb.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 6.0f.
     * @param memory set the memory.
     */
    public void setMemory(Float  memory) {
        this.memory = memory;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of cpu(s) allocated for dry-run.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2.
     * @return numCpu
     */
    public Integer getNumCpu() {
        return numCpu;
    }

    /**
     * This is the setter method to the attribute.
     * Number of cpu(s) allocated for dry-run.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2.
     * @param numCpu set the numCpu.
     */
    public void setNumCpu(Integer  numCpu) {
        this.numCpu = numCpu;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vm hostname of the preferred worker node.
     * Example  node2.controller.local.
     * When configured, dry-run is performed on specified node.
     * When not configured, one of the follower node is elected for dry-run.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return preferredWorker
     */
    public String getPreferredWorker() {
        return preferredWorker;
    }

    /**
     * This is the setter method to the attribute.
     * Vm hostname of the preferred worker node.
     * Example  node2.controller.local.
     * When configured, dry-run is performed on specified node.
     * When not configured, one of the follower node is elected for dry-run.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param preferredWorker set the preferredWorker.
     */
    public void setPreferredWorker(String  preferredWorker) {
        this.preferredWorker = preferredWorker;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DryRunParams objDryRunParams = (DryRunParams) o;
      return   Objects.equals(this.preferredWorker, objDryRunParams.preferredWorker)&&
  Objects.equals(this.numCpu, objDryRunParams.numCpu)&&
  Objects.equals(this.memory, objDryRunParams.memory)&&
  Objects.equals(this.allowSingleNode, objDryRunParams.allowSingleNode);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DryRunParams {\n");
                  sb.append("    allowSingleNode: ").append(toIndentedString(allowSingleNode)).append("\n");
                        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
                        sb.append("    numCpu: ").append(toIndentedString(numCpu)).append("\n");
                        sb.append("    preferredWorker: ").append(toIndentedString(preferredWorker)).append("\n");
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

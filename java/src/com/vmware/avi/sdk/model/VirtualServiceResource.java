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
 * The VirtualServiceResource is a POJO class extends AviRestResource that used for creating
 * VirtualServiceResource.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VirtualServiceResource  {
    @JsonProperty("memory")
    private Integer memory;

    @JsonProperty("num_se")
    private Integer numSe;

    @JsonProperty("num_standby_se")
    private Integer numStandbySe;

    @JsonProperty("num_vcpus")
    private Integer numVcpus;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param memory set the memory.
     */
    public void setMemory(Integer  memory) {
        this.memory = memory;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numSe
     */
    public Integer getNumSe() {
        return numSe;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numSe set the numSe.
     */
    public void setNumSe(Integer  numSe) {
        this.numSe = numSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numStandbySe
     */
    public Integer getNumStandbySe() {
        return numStandbySe;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numStandbySe set the numStandbySe.
     */
    public void setNumStandbySe(Integer  numStandbySe) {
        this.numStandbySe = numStandbySe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numVcpus
     */
    public Integer getNumVcpus() {
        return numVcpus;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numVcpus set the numVcpus.
     */
    public void setNumVcpus(Integer  numVcpus) {
        this.numVcpus = numVcpus;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VirtualServiceResource objVirtualServiceResource = (VirtualServiceResource) o;
      return   Objects.equals(this.numVcpus, objVirtualServiceResource.numVcpus)&&
  Objects.equals(this.memory, objVirtualServiceResource.memory)&&
  Objects.equals(this.numSe, objVirtualServiceResource.numSe)&&
  Objects.equals(this.numStandbySe, objVirtualServiceResource.numStandbySe);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VirtualServiceResource {\n");
                  sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
                        sb.append("    numSe: ").append(toIndentedString(numSe)).append("\n");
                        sb.append("    numStandbySe: ").append(toIndentedString(numStandbySe)).append("\n");
                        sb.append("    numVcpus: ").append(toIndentedString(numVcpus)).append("\n");
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

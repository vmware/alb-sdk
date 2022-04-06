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
 * The CPUUsage is a POJO class extends AviRestResource that used for creating
 * CPUUsage.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CPUUsage  {
    @JsonProperty("cpu_percent")
    private Float cpuPercent = null;

    @JsonProperty("num_cores")
    private Integer numCores = null;



    /**
     * This is the getter method this will return the attribute value.
     * Cpu usage in percentage.
     * Field introduced in 21.1.1.
     * Unit is percent.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cpuPercent
     */
    public Float getCpuPercent() {
        return cpuPercent;
    }

    /**
     * This is the setter method to the attribute.
     * Cpu usage in percentage.
     * Field introduced in 21.1.1.
     * Unit is percent.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cpuPercent set the cpuPercent.
     */
    public void setCpuPercent(Float  cpuPercent) {
        this.cpuPercent = cpuPercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numCores
     */
    public Integer getNumCores() {
        return numCores;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numCores set the numCores.
     */
    public void setNumCores(Integer  numCores) {
        this.numCores = numCores;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      CPUUsage objCPUUsage = (CPUUsage) o;
      return   Objects.equals(this.numCores, objCPUUsage.numCores)&&
  Objects.equals(this.cpuPercent, objCPUUsage.cpuPercent);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CPUUsage {\n");
                  sb.append("    cpuPercent: ").append(toIndentedString(cpuPercent)).append("\n");
                        sb.append("    numCores: ").append(toIndentedString(numCores)).append("\n");
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

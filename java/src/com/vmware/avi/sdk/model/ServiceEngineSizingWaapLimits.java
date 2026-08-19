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
 * The ServiceEngineSizingWaapLimits is a POJO class extends AviRestResource that used for creating
 * ServiceEngineSizingWaapLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceEngineSizingWaapLimits  {
    @JsonProperty("max_vs_per_se")
    private Integer maxVsPerSe;

    @JsonProperty("min_memory")
    private Integer minMemory;

    @JsonProperty("min_vcpus")
    private Integer minVcpus;

    @JsonProperty("waap_se_size")
    private String waapSeSize;



    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of virtualservices allowed per se for this tier.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return maxVsPerSe
     */
    public Integer getMaxVsPerSe() {
        return maxVsPerSe;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of virtualservices allowed per se for this tier.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param maxVsPerSe set the maxVsPerSe.
     */
    public void setMaxVsPerSe(Integer  maxVsPerSe) {
        this.maxVsPerSe = maxVsPerSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum memory per se (mib) for this tier.
     * Ses in a waap-mode se group of this size must have at least this much memory.
     * Field introduced in 32.2.1.
     * Unit is mb.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return minMemory
     */
    public Integer getMinMemory() {
        return minMemory;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum memory per se (mib) for this tier.
     * Ses in a waap-mode se group of this size must have at least this much memory.
     * Field introduced in 32.2.1.
     * Unit is mb.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param minMemory set the minMemory.
     */
    public void setMinMemory(Integer  minMemory) {
        this.minMemory = minMemory;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum vcpus per se for this tier.
     * Ses in a waap-mode se group of this size must have at least this many vcpus.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return minVcpus
     */
    public Integer getMinVcpus() {
        return minVcpus;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum vcpus per se for this tier.
     * Ses in a waap-mode se group of this size must have at least this many vcpus.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param minVcpus set the minVcpus.
     */
    public void setMinVcpus(Integer  minVcpus) {
        this.minVcpus = minVcpus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Size tier this entry describes (small, medium, or large).
     * Enum options - SE_SIZE_SMALL, SE_SIZE_MEDIUM, SE_SIZE_LARGE.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return waapSeSize
     */
    public String getWaapSeSize() {
        return waapSeSize;
    }

    /**
     * This is the setter method to the attribute.
     * Size tier this entry describes (small, medium, or large).
     * Enum options - SE_SIZE_SMALL, SE_SIZE_MEDIUM, SE_SIZE_LARGE.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param waapSeSize set the waapSeSize.
     */
    public void setWaapSeSize(String  waapSeSize) {
        this.waapSeSize = waapSeSize;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ServiceEngineSizingWaapLimits objServiceEngineSizingWaapLimits = (ServiceEngineSizingWaapLimits) o;
      return   Objects.equals(this.waapSeSize, objServiceEngineSizingWaapLimits.waapSeSize)&&
  Objects.equals(this.minVcpus, objServiceEngineSizingWaapLimits.minVcpus)&&
  Objects.equals(this.minMemory, objServiceEngineSizingWaapLimits.minMemory)&&
  Objects.equals(this.maxVsPerSe, objServiceEngineSizingWaapLimits.maxVsPerSe);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ServiceEngineSizingWaapLimits {\n");
                  sb.append("    maxVsPerSe: ").append(toIndentedString(maxVsPerSe)).append("\n");
                        sb.append("    minMemory: ").append(toIndentedString(minMemory)).append("\n");
                        sb.append("    minVcpus: ").append(toIndentedString(minVcpus)).append("\n");
                        sb.append("    waapSeSize: ").append(toIndentedString(waapSeSize)).append("\n");
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

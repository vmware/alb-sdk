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
 * The AppQuotaConfig is a POJO class extends AviRestResource that used for creating
 * AppQuotaConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppQuotaConfig  {
    @JsonProperty("vs_limit")
    private Integer vsLimit = -1;



    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of virtual services allowed for this tenant.
     * -1 as default is maximum value, set to 0 to disallow any vs creation.
     * Allowed values are -1-+65535.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as -1.
     * @return vsLimit
     */
    public Integer getVsLimit() {
        return vsLimit;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of virtual services allowed for this tenant.
     * -1 as default is maximum value, set to 0 to disallow any vs creation.
     * Allowed values are -1-+65535.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as -1.
     * @param vsLimit set the vsLimit.
     */
    public void setVsLimit(Integer  vsLimit) {
        this.vsLimit = vsLimit;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      AppQuotaConfig objAppQuotaConfig = (AppQuotaConfig) o;
      return   Objects.equals(this.vsLimit, objAppQuotaConfig.vsLimit);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AppQuotaConfig {\n");
                  sb.append("    vsLimit: ").append(toIndentedString(vsLimit)).append("\n");
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

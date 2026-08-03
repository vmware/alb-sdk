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
 * The ApiMetricsLimits is a POJO class extends AviRestResource that used for creating
 * ApiMetricsLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiMetricsLimits  {
    @JsonProperty("num_apis")
    private Integer numApis;



    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of api endpoints for which metrics are tracked across the system.
     * Associating an apipolicy with a virtual service is rejected at config time if adding its metrics budget would exceed this limit.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numApis
     */
    public Integer getNumApis() {
        return numApis;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of api endpoints for which metrics are tracked across the system.
     * Associating an apipolicy with a virtual service is rejected at config time if adding its metrics budget would exceed this limit.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numApis set the numApis.
     */
    public void setNumApis(Integer  numApis) {
        this.numApis = numApis;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApiMetricsLimits objApiMetricsLimits = (ApiMetricsLimits) o;
      return   Objects.equals(this.numApis, objApiMetricsLimits.numApis);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApiMetricsLimits {\n");
                  sb.append("    numApis: ").append(toIndentedString(numApis)).append("\n");
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

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
 * The ApplicationSamplingConfig is a POJO class extends AviRestResource that used for creating
 * ApplicationSamplingConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationSamplingConfig  {
    @JsonProperty("max_sampling_percent")
    private Integer maxSamplingPercent = 1;

    @JsonProperty("min_update_interval")
    private Integer minUpdateInterval = 30;



    /**
     * This is the getter method this will return the attribute value.
     * Maximum percent of the application data subjected to application learning.
     * Allowed values are 1-100.
     * Field introduced in 31.2.1.
     * Unit is percent.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return maxSamplingPercent
     */
    public Integer getMaxSamplingPercent() {
        return maxSamplingPercent;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum percent of the application data subjected to application learning.
     * Allowed values are 1-100.
     * Field introduced in 31.2.1.
     * Unit is percent.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param maxSamplingPercent set the maxSamplingPercent.
     */
    public void setMaxSamplingPercent(Integer  maxSamplingPercent) {
        this.maxSamplingPercent = maxSamplingPercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum periodicity at which serviceengine sends the application data to the controller.
     * Allowed values are 1-60.
     * Field introduced in 31.2.1.
     * Unit is min.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @return minUpdateInterval
     */
    public Integer getMinUpdateInterval() {
        return minUpdateInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum periodicity at which serviceengine sends the application data to the controller.
     * Allowed values are 1-60.
     * Field introduced in 31.2.1.
     * Unit is min.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @param minUpdateInterval set the minUpdateInterval.
     */
    public void setMinUpdateInterval(Integer  minUpdateInterval) {
        this.minUpdateInterval = minUpdateInterval;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApplicationSamplingConfig objApplicationSamplingConfig = (ApplicationSamplingConfig) o;
      return   Objects.equals(this.maxSamplingPercent, objApplicationSamplingConfig.maxSamplingPercent)&&
  Objects.equals(this.minUpdateInterval, objApplicationSamplingConfig.minUpdateInterval);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApplicationSamplingConfig {\n");
                  sb.append("    maxSamplingPercent: ").append(toIndentedString(maxSamplingPercent)).append("\n");
                        sb.append("    minUpdateInterval: ").append(toIndentedString(minUpdateInterval)).append("\n");
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

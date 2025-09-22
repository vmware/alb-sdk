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
 * The ApplicationSamplingRuntime is a POJO class extends AviRestResource that used for creating
 * ApplicationSamplingRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationSamplingRuntime  {
    @JsonProperty("current_sampling_percent")
    private Integer currentSamplingPercent;

    @JsonProperty("current_update_interval")
    private Integer currentUpdateInterval;



    /**
     * This is the getter method this will return the attribute value.
     * Current sampling percent of the application data subjected to application learning.
     * Allowed values are 1-100.
     * Field introduced in 31.2.1.
     * Unit is percent.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return currentSamplingPercent
     */
    public Integer getCurrentSamplingPercent() {
        return currentSamplingPercent;
    }

    /**
     * This is the setter method to the attribute.
     * Current sampling percent of the application data subjected to application learning.
     * Allowed values are 1-100.
     * Field introduced in 31.2.1.
     * Unit is percent.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param currentSamplingPercent set the currentSamplingPercent.
     */
    public void setCurrentSamplingPercent(Integer  currentSamplingPercent) {
        this.currentSamplingPercent = currentSamplingPercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Current periodicity at which serviceengine sends the application data to the controller.
     * Allowed values are 1-60.
     * Field introduced in 31.2.1.
     * Unit is min.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return currentUpdateInterval
     */
    public Integer getCurrentUpdateInterval() {
        return currentUpdateInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Current periodicity at which serviceengine sends the application data to the controller.
     * Allowed values are 1-60.
     * Field introduced in 31.2.1.
     * Unit is min.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param currentUpdateInterval set the currentUpdateInterval.
     */
    public void setCurrentUpdateInterval(Integer  currentUpdateInterval) {
        this.currentUpdateInterval = currentUpdateInterval;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApplicationSamplingRuntime objApplicationSamplingRuntime = (ApplicationSamplingRuntime) o;
      return   Objects.equals(this.currentSamplingPercent, objApplicationSamplingRuntime.currentSamplingPercent)&&
  Objects.equals(this.currentUpdateInterval, objApplicationSamplingRuntime.currentUpdateInterval);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApplicationSamplingRuntime {\n");
                  sb.append("    currentSamplingPercent: ").append(toIndentedString(currentSamplingPercent)).append("\n");
                        sb.append("    currentUpdateInterval: ").append(toIndentedString(currentUpdateInterval)).append("\n");
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

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
 * The ControllerSizingApiLimits is a POJO class extends AviRestResource that used for creating
 * ControllerSizingApiLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ControllerSizingApiLimits  {
    @JsonProperty("config_limits")
    private ApiConfigLimits configLimits;

    @JsonProperty("learning_limits")
    private ApiLearningLimits learningLimits;

    @JsonProperty("metrics_limits")
    private ApiMetricsLimits metricsLimits;



    /**
     * This is the getter method this will return the attribute value.
     * Api configuration limits for this controller sizing.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return configLimits
     */
    public ApiConfigLimits getConfigLimits() {
        return configLimits;
    }

    /**
     * This is the setter method to the attribute.
     * Api configuration limits for this controller sizing.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param configLimits set the configLimits.
     */
    public void setConfigLimits(ApiConfigLimits configLimits) {
        this.configLimits = configLimits;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Api learning limits for this controller sizing.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return learningLimits
     */
    public ApiLearningLimits getLearningLimits() {
        return learningLimits;
    }

    /**
     * This is the setter method to the attribute.
     * Api learning limits for this controller sizing.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param learningLimits set the learningLimits.
     */
    public void setLearningLimits(ApiLearningLimits learningLimits) {
        this.learningLimits = learningLimits;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Api metrics limits for this controller sizing.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metricsLimits
     */
    public ApiMetricsLimits getMetricsLimits() {
        return metricsLimits;
    }

    /**
     * This is the setter method to the attribute.
     * Api metrics limits for this controller sizing.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metricsLimits set the metricsLimits.
     */
    public void setMetricsLimits(ApiMetricsLimits metricsLimits) {
        this.metricsLimits = metricsLimits;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ControllerSizingApiLimits objControllerSizingApiLimits = (ControllerSizingApiLimits) o;
      return   Objects.equals(this.configLimits, objControllerSizingApiLimits.configLimits)&&
  Objects.equals(this.learningLimits, objControllerSizingApiLimits.learningLimits)&&
  Objects.equals(this.metricsLimits, objControllerSizingApiLimits.metricsLimits);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ControllerSizingApiLimits {\n");
                  sb.append("    configLimits: ").append(toIndentedString(configLimits)).append("\n");
                        sb.append("    learningLimits: ").append(toIndentedString(learningLimits)).append("\n");
                        sb.append("    metricsLimits: ").append(toIndentedString(metricsLimits)).append("\n");
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

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
 * The PositiveSecurityParams is a POJO class extends AviRestResource that used for creating
 * PositiveSecurityParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PositiveSecurityParams  {
    @JsonProperty("confidence_override")
    private AppLearningConfidenceOverride confidenceOverride;

    @JsonProperty("max_params")
    private Integer maxParams = 100;

    @JsonProperty("max_uris")
    private Integer maxUris = 500;

    @JsonProperty("min_confidence")
    private String minConfidence = "CONFIDENCE_VERY_HIGH";

    @JsonProperty("min_hits_to_program")
    private Integer minHitsToProgram = 10000;



    /**
     * This is the getter method this will return the attribute value.
     * Configure thresholds for the confidence labels defined by applearningconfidencelabel.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return confidenceOverride
     */
    public AppLearningConfidenceOverride getConfidenceOverride() {
        return confidenceOverride;
    }

    /**
     * This is the setter method to the attribute.
     * Configure thresholds for the confidence labels defined by applearningconfidencelabel.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param confidenceOverride set the confidenceOverride.
     */
    public void setConfidenceOverride(AppLearningConfidenceOverride confidenceOverride) {
        this.confidenceOverride = confidenceOverride;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of parameters per uri programmed for an application.
     * Allowed values are 10-1000.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @return maxParams
     */
    public Integer getMaxParams() {
        return maxParams;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of parameters per uri programmed for an application.
     * Allowed values are 10-1000.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @param maxParams set the maxParams.
     */
    public void setMaxParams(Integer  maxParams) {
        this.maxParams = maxParams;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of uris programmed for an application.
     * Allowed values are 10-10000.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 500.
     * @return maxUris
     */
    public Integer getMaxUris() {
        return maxUris;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of uris programmed for an application.
     * Allowed values are 10-10000.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 500.
     * @param maxUris set the maxUris.
     */
    public void setMaxUris(Integer  maxUris) {
        this.maxUris = maxUris;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum confidence label required for positive security rule updates.
     * Enum options - CONFIDENCE_VERY_HIGH, CONFIDENCE_HIGH, CONFIDENCE_PROBABLE, CONFIDENCE_LOW, CONFIDENCE_NONE.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "CONFIDENCE_VERY_HIGH".
     * @return minConfidence
     */
    public String getMinConfidence() {
        return minConfidence;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum confidence label required for positive security rule updates.
     * Enum options - CONFIDENCE_VERY_HIGH, CONFIDENCE_HIGH, CONFIDENCE_PROBABLE, CONFIDENCE_LOW, CONFIDENCE_NONE.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "CONFIDENCE_VERY_HIGH".
     * @param minConfidence set the minConfidence.
     */
    public void setMinConfidence(String  minConfidence) {
        this.minConfidence = minConfidence;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum number of occurances required for a param to qualify for programming into a psm rule.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
     * @return minHitsToProgram
     */
    public Integer getMinHitsToProgram() {
        return minHitsToProgram;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum number of occurances required for a param to qualify for programming into a psm rule.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
     * @param minHitsToProgram set the minHitsToProgram.
     */
    public void setMinHitsToProgram(Integer  minHitsToProgram) {
        this.minHitsToProgram = minHitsToProgram;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      PositiveSecurityParams objPositiveSecurityParams = (PositiveSecurityParams) o;
      return   Objects.equals(this.maxUris, objPositiveSecurityParams.maxUris)&&
  Objects.equals(this.maxParams, objPositiveSecurityParams.maxParams)&&
  Objects.equals(this.minHitsToProgram, objPositiveSecurityParams.minHitsToProgram)&&
  Objects.equals(this.minConfidence, objPositiveSecurityParams.minConfidence)&&
  Objects.equals(this.confidenceOverride, objPositiveSecurityParams.confidenceOverride);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PositiveSecurityParams {\n");
                  sb.append("    confidenceOverride: ").append(toIndentedString(confidenceOverride)).append("\n");
                        sb.append("    maxParams: ").append(toIndentedString(maxParams)).append("\n");
                        sb.append("    maxUris: ").append(toIndentedString(maxUris)).append("\n");
                        sb.append("    minConfidence: ").append(toIndentedString(minConfidence)).append("\n");
                        sb.append("    minHitsToProgram: ").append(toIndentedString(minHitsToProgram)).append("\n");
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

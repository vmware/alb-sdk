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
 * The FalsePositiveLearningConfig is a POJO class extends AviRestResource that used for creating
 * FalsePositiveLearningConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FalsePositiveLearningConfig  {
    @JsonProperty("max_apps_supported")
    private Integer maxAppsSupported = 5;

    @JsonProperty("min_monitor_time")
    private Integer minMonitorTime = 10080;

    @JsonProperty("min_trans_per_application")
    private Integer minTransPerApplication = 5000000;

    @JsonProperty("min_trans_per_uri")
    private Integer minTransPerUri = 10000;



    /**
     * This is the getter method this will return the attribute value.
     * Max number of applications supported to detect false positive.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @return maxAppsSupported
     */
    public Integer getMaxAppsSupported() {
        return maxAppsSupported;
    }

    /**
     * This is the setter method to the attribute.
     * Max number of applications supported to detect false positive.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @param maxAppsSupported set the maxAppsSupported.
     */
    public void setMaxAppsSupported(Integer  maxAppsSupported) {
        this.maxAppsSupported = maxAppsSupported;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum monitor time required to automatically detect false positive.
     * Unit is minutes.
     * Field introduced in 22.1.1.
     * Unit is min.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10080.
     * @return minMonitorTime
     */
    public Integer getMinMonitorTime() {
        return minMonitorTime;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum monitor time required to automatically detect false positive.
     * Unit is minutes.
     * Field introduced in 22.1.1.
     * Unit is min.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10080.
     * @param minMonitorTime set the minMonitorTime.
     */
    public void setMinMonitorTime(Integer  minMonitorTime) {
        this.minMonitorTime = minMonitorTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum number of transactions in one application required to automatically detect false positive.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5000000.
     * @return minTransPerApplication
     */
    public Integer getMinTransPerApplication() {
        return minTransPerApplication;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum number of transactions in one application required to automatically detect false positive.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5000000.
     * @param minTransPerApplication set the minTransPerApplication.
     */
    public void setMinTransPerApplication(Integer  minTransPerApplication) {
        this.minTransPerApplication = minTransPerApplication;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum number of transactions in one uri required to automatically detect false positive.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
     * @return minTransPerUri
     */
    public Integer getMinTransPerUri() {
        return minTransPerUri;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum number of transactions in one uri required to automatically detect false positive.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
     * @param minTransPerUri set the minTransPerUri.
     */
    public void setMinTransPerUri(Integer  minTransPerUri) {
        this.minTransPerUri = minTransPerUri;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      FalsePositiveLearningConfig objFalsePositiveLearningConfig = (FalsePositiveLearningConfig) o;
      return   Objects.equals(this.minTransPerApplication, objFalsePositiveLearningConfig.minTransPerApplication)&&
  Objects.equals(this.minTransPerUri, objFalsePositiveLearningConfig.minTransPerUri)&&
  Objects.equals(this.minMonitorTime, objFalsePositiveLearningConfig.minMonitorTime)&&
  Objects.equals(this.maxAppsSupported, objFalsePositiveLearningConfig.maxAppsSupported);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FalsePositiveLearningConfig {\n");
                  sb.append("    maxAppsSupported: ").append(toIndentedString(maxAppsSupported)).append("\n");
                        sb.append("    minMonitorTime: ").append(toIndentedString(minMonitorTime)).append("\n");
                        sb.append("    minTransPerApplication: ").append(toIndentedString(minTransPerApplication)).append("\n");
                        sb.append("    minTransPerUri: ").append(toIndentedString(minTransPerUri)).append("\n");
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

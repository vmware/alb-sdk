/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */

package com.vmware.avi.sdk.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The CollectionRules is a POJO class extends AviRestResource that used for creating
 * CollectionRules.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionRules  {
    @JsonIgnore
    private Integer maxConcurrentWorkers = 1;

    @JsonProperty("min_free_disk_required")
    private Integer minFreeDiskRequired = 5;

    @JsonProperty("timeout")
    private Integer timeout = 1800;



    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of concurrent workers used for data collection during report generation.
     * Allowed values are 1-10.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return maxConcurrentWorkers
     */
    public Integer getMaxConcurrentWorkers() {
        return maxConcurrentWorkers;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of concurrent workers used for data collection during report generation.
     * Allowed values are 1-10.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param maxConcurrentWorkers set the maxConcurrentWorkers.
     */
    public void setMaxConcurrentWorkers(Integer  maxConcurrentWorkers) {
        this.maxConcurrentWorkers = maxConcurrentWorkers;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum free disk required for report generation in gb.
     * Allowed values are 1-100.
     * Field introduced in 31.2.1.
     * Unit is gb.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @return minFreeDiskRequired
     */
    public Integer getMinFreeDiskRequired() {
        return minFreeDiskRequired;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum free disk required for report generation in gb.
     * Allowed values are 1-100.
     * Field introduced in 31.2.1.
     * Unit is gb.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @param minFreeDiskRequired set the minFreeDiskRequired.
     */
    public void setMinFreeDiskRequired(Integer  minFreeDiskRequired) {
        this.minFreeDiskRequired = minFreeDiskRequired;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timeout for report generation in seconds.
     * Allowed values are 300-3600.
     * Field introduced in 31.2.1.
     * Unit is sec.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1800.
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * This is the setter method to the attribute.
     * Timeout for report generation in seconds.
     * Allowed values are 300-3600.
     * Field introduced in 31.2.1.
     * Unit is sec.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1800.
     * @param timeout set the timeout.
     */
    public void setTimeout(Integer  timeout) {
        this.timeout = timeout;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      CollectionRules objCollectionRules = (CollectionRules) o;
      return   Objects.equals(this.timeout, objCollectionRules.timeout)&&
  Objects.equals(this.minFreeDiskRequired, objCollectionRules.minFreeDiskRequired)&&
  Objects.equals(this.maxConcurrentWorkers, objCollectionRules.maxConcurrentWorkers);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CollectionRules {\n");
                  sb.append("    maxConcurrentWorkers: ").append(toIndentedString(maxConcurrentWorkers)).append("\n");
                        sb.append("    minFreeDiskRequired: ").append(toIndentedString(minFreeDiskRequired)).append("\n");
                        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

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
 * The PreChecksParams is a POJO class extends AviRestResource that used for creating
 * PreChecksParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PreChecksParams  {
    @JsonProperty("checks_base_timeout")
    private Integer checksBaseTimeout = 60;

    @JsonProperty("max_alerts")
    private Integer maxAlerts = 200;



    /**
     * This is the getter method this will return the attribute value.
     * Base timeout value for all upgrade pre-checks operations.
     * The timeout value for applicable checks is a multiple of checks_base_timeout.
     * For example, config export timeout = [multiplier] * checks_base_timeout.
     * (the multiplier varies by operation.).
     * Field introduced in 32.1.1.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @return checksBaseTimeout
     */
    public Integer getChecksBaseTimeout() {
        return checksBaseTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Base timeout value for all upgrade pre-checks operations.
     * The timeout value for applicable checks is a multiple of checks_base_timeout.
     * For example, config export timeout = [multiplier] * checks_base_timeout.
     * (the multiplier varies by operation.).
     * Field introduced in 32.1.1.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @param checksBaseTimeout set the checksBaseTimeout.
     */
    public void setChecksBaseTimeout(Integer  checksBaseTimeout) {
        this.checksBaseTimeout = checksBaseTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of alerts allowed for configuration export.
     * Allowed values are 200-500.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 200.
     * @return maxAlerts
     */
    public Integer getMaxAlerts() {
        return maxAlerts;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of alerts allowed for configuration export.
     * Allowed values are 200-500.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 200.
     * @param maxAlerts set the maxAlerts.
     */
    public void setMaxAlerts(Integer  maxAlerts) {
        this.maxAlerts = maxAlerts;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      PreChecksParams objPreChecksParams = (PreChecksParams) o;
      return   Objects.equals(this.maxAlerts, objPreChecksParams.maxAlerts)&&
  Objects.equals(this.checksBaseTimeout, objPreChecksParams.checksBaseTimeout);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PreChecksParams {\n");
                  sb.append("    checksBaseTimeout: ").append(toIndentedString(checksBaseTimeout)).append("\n");
                        sb.append("    maxAlerts: ").append(toIndentedString(maxAlerts)).append("\n");
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

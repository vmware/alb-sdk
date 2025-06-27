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
    @JsonProperty("export_config_timeout")
    private Integer exportConfigTimeout = 3600;

    @JsonProperty("max_alerts")
    private Integer maxAlerts = 200;



    /**
     * This is the getter method this will return the attribute value.
     * Maximum wait time for configuration export to complete.
     * Allowed values are 600-5400.
     * Field introduced in 31.1.1.
     * Unit is sec.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3600.
     * @return exportConfigTimeout
     */
    public Integer getExportConfigTimeout() {
        return exportConfigTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum wait time for configuration export to complete.
     * Allowed values are 600-5400.
     * Field introduced in 31.1.1.
     * Unit is sec.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3600.
     * @param exportConfigTimeout set the exportConfigTimeout.
     */
    public void setExportConfigTimeout(Integer  exportConfigTimeout) {
        this.exportConfigTimeout = exportConfigTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of alerts allowed for configuration export.
     * Allowed values are 200-500.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, enterprise with cloud services edition.
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
      return   Objects.equals(this.exportConfigTimeout, objPreChecksParams.exportConfigTimeout)&&
  Objects.equals(this.maxAlerts, objPreChecksParams.maxAlerts);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PreChecksParams {\n");
                  sb.append("    exportConfigTimeout: ").append(toIndentedString(exportConfigTimeout)).append("\n");
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

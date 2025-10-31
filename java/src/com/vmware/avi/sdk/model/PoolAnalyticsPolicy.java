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
 * The PoolAnalyticsPolicy is a POJO class extends AviRestResource that used for creating
 * PoolAnalyticsPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PoolAnalyticsPolicy  {
    @JsonProperty("metrics_realtime_update")
    private MetricsRealTimeUpdate metricsRealtimeUpdate;



    /**
     * This is the getter method this will return the attribute value.
     * Enable realtime metrics and its duration.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metricsRealtimeUpdate
     */
    public MetricsRealTimeUpdate getMetricsRealtimeUpdate() {
        return metricsRealtimeUpdate;
    }

    /**
     * This is the setter method to the attribute.
     * Enable realtime metrics and its duration.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metricsRealtimeUpdate set the metricsRealtimeUpdate.
     */
    public void setMetricsRealtimeUpdate(MetricsRealTimeUpdate metricsRealtimeUpdate) {
        this.metricsRealtimeUpdate = metricsRealtimeUpdate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      PoolAnalyticsPolicy objPoolAnalyticsPolicy = (PoolAnalyticsPolicy) o;
      return   Objects.equals(this.metricsRealtimeUpdate, objPoolAnalyticsPolicy.metricsRealtimeUpdate);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PoolAnalyticsPolicy {\n");
                  sb.append("    metricsRealtimeUpdate: ").append(toIndentedString(metricsRealtimeUpdate)).append("\n");
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

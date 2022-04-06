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
 * The ControllerInfo is a POJO class extends AviRestResource that used for creating
 * ControllerInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ControllerInfo  {
    @JsonProperty("current_controller_mem_usage")
    private Float currentControllerMemUsage = null;



    /**
     * This is the getter method this will return the attribute value.
     * Total controller memory usage in gbs.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return currentControllerMemUsage
     */
    public Float getCurrentControllerMemUsage() {
        return currentControllerMemUsage;
    }

    /**
     * This is the setter method to the attribute.
     * Total controller memory usage in gbs.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param currentControllerMemUsage set the currentControllerMemUsage.
     */
    public void setCurrentControllerMemUsage(Float  currentControllerMemUsage) {
        this.currentControllerMemUsage = currentControllerMemUsage;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ControllerInfo objControllerInfo = (ControllerInfo) o;
      return   Objects.equals(this.currentControllerMemUsage, objControllerInfo.currentControllerMemUsage);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ControllerInfo {\n");
                  sb.append("    currentControllerMemUsage: ").append(toIndentedString(currentControllerMemUsage)).append("\n");
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

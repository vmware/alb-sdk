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
 * The ControllerParams is a POJO class extends AviRestResource that used for creating
 * ControllerParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ControllerParams  {
    @JsonProperty("task_base_timeout")
    private Integer taskBaseTimeout = 300;



    /**
     * This is the getter method this will return the attribute value.
     * Base timeout value for all controller-specific upgrade operation tasks.
     * The timeout value for each task is a multiple of task_base_timeout.
     * For example, switchandreboot task timeout = [multiplier] * task_base_timeout.
     * (the multiplier varies by task.).
     * Allowed values are 300-3600.
     * Field introduced in 31.1.1.
     * Unit is sec.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 300.
     * @return taskBaseTimeout
     */
    public Integer getTaskBaseTimeout() {
        return taskBaseTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Base timeout value for all controller-specific upgrade operation tasks.
     * The timeout value for each task is a multiple of task_base_timeout.
     * For example, switchandreboot task timeout = [multiplier] * task_base_timeout.
     * (the multiplier varies by task.).
     * Allowed values are 300-3600.
     * Field introduced in 31.1.1.
     * Unit is sec.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 300.
     * @param taskBaseTimeout set the taskBaseTimeout.
     */
    public void setTaskBaseTimeout(Integer  taskBaseTimeout) {
        this.taskBaseTimeout = taskBaseTimeout;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ControllerParams objControllerParams = (ControllerParams) o;
      return   Objects.equals(this.taskBaseTimeout, objControllerParams.taskBaseTimeout);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ControllerParams {\n");
                  sb.append("    taskBaseTimeout: ").append(toIndentedString(taskBaseTimeout)).append("\n");
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

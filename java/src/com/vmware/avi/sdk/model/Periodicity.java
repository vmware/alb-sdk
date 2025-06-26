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
 * The Periodicity is a POJO class extends AviRestResource that used for creating
 * Periodicity.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Periodicity  {
    @JsonProperty("action")
    private RetentionAction action;

    @JsonProperty("interval")
    private Integer interval;



    /**
     * This is the getter method this will return the attribute value.
     * Action to trigger when policy conditions are met.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return action
     */
    public RetentionAction getAction() {
        return action;
    }

    /**
     * This is the setter method to the attribute.
     * Action to trigger when policy conditions are met.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param action set the action.
     */
    public void setAction(RetentionAction action) {
        this.action = action;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time interval in minutes between the action triggers.
     * Allowed values are 1-43200.
     * Field introduced in 31.1.1.
     * Unit is min.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    /**
     * This is the setter method to the attribute.
     * Time interval in minutes between the action triggers.
     * Allowed values are 1-43200.
     * Field introduced in 31.1.1.
     * Unit is min.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param interval set the interval.
     */
    public void setInterval(Integer  interval) {
        this.interval = interval;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      Periodicity objPeriodicity = (Periodicity) o;
      return   Objects.equals(this.action, objPeriodicity.action)&&
  Objects.equals(this.interval, objPeriodicity.interval);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class Periodicity {\n");
                  sb.append("    action: ").append(toIndentedString(action)).append("\n");
                        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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

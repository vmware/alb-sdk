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
 * The AutoScaleMesosSettings is a POJO class extends AviRestResource that used for creating
 * AutoScaleMesosSettings.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoScaleMesosSettings  {
    @JsonProperty("force")
    private Boolean force = true;



    /**
     * This is the getter method this will return the attribute value.
     * Apply scale-out even when there are deployments inprogress.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return force
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * This is the setter method to the attribute.
     * Apply scale-out even when there are deployments inprogress.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param force set the force.
     */
    public void setForce(Boolean  force) {
        this.force = force;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      AutoScaleMesosSettings objAutoScaleMesosSettings = (AutoScaleMesosSettings) o;
      return   Objects.equals(this.force, objAutoScaleMesosSettings.force);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AutoScaleMesosSettings {\n");
                  sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

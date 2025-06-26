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
 * The TCPOptions is a POJO class extends AviRestResource that used for creating
 * TCPOptions.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TCPOptions  {
    @JsonProperty("strip_sack")
    private Boolean stripSack = false;



    /**
     * This is the getter method this will return the attribute value.
     * Remove the sack tcp option from header.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return stripSack
     */
    public Boolean getStripSack() {
        return stripSack;
    }

    /**
     * This is the setter method to the attribute.
     * Remove the sack tcp option from header.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param stripSack set the stripSack.
     */
    public void setStripSack(Boolean  stripSack) {
        this.stripSack = stripSack;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      TCPOptions objTCPOptions = (TCPOptions) o;
      return   Objects.equals(this.stripSack, objTCPOptions.stripSack);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class TCPOptions {\n");
                  sb.append("    stripSack: ").append(toIndentedString(stripSack)).append("\n");
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

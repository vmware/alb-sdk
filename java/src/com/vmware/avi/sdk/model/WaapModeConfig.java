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
 * The WaapModeConfig is a POJO class extends AviRestResource that used for creating
 * WaapModeConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WaapModeConfig  {
    @JsonProperty("se_size")
    private String seSize;



    /**
     * This is the getter method this will return the attribute value.
     * Waap sizing tier for this se group.
     * Enum options - SE_SIZE_SMALL, SE_SIZE_MEDIUM, SE_SIZE_LARGE.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seSize
     */
    public String getSeSize() {
        return seSize;
    }

    /**
     * This is the setter method to the attribute.
     * Waap sizing tier for this se group.
     * Enum options - SE_SIZE_SMALL, SE_SIZE_MEDIUM, SE_SIZE_LARGE.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seSize set the seSize.
     */
    public void setSeSize(String  seSize) {
        this.seSize = seSize;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      WaapModeConfig objWaapModeConfig = (WaapModeConfig) o;
      return   Objects.equals(this.seSize, objWaapModeConfig.seSize);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WaapModeConfig {\n");
                  sb.append("    seSize: ").append(toIndentedString(seSize)).append("\n");
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

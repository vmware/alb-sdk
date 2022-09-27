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
 * The DebugTraceMallocTypes is a POJO class extends AviRestResource that used for creating
 * DebugTraceMallocTypes.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DebugTraceMallocTypes  {
    @JsonProperty("malloc_type_index")
    private Integer mallocTypeIndex = null;



    /**
     * This is the getter method this will return the attribute value.
     * Memory type to be traced for se_malloc and se_free.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mallocTypeIndex
     */
    public Integer getMallocTypeIndex() {
        return mallocTypeIndex;
    }

    /**
     * This is the setter method to the attribute.
     * Memory type to be traced for se_malloc and se_free.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mallocTypeIndex set the mallocTypeIndex.
     */
    public void setMallocTypeIndex(Integer  mallocTypeIndex) {
        this.mallocTypeIndex = mallocTypeIndex;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DebugTraceMallocTypes objDebugTraceMallocTypes = (DebugTraceMallocTypes) o;
      return   Objects.equals(this.mallocTypeIndex, objDebugTraceMallocTypes.mallocTypeIndex);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DebugTraceMallocTypes {\n");
                  sb.append("    mallocTypeIndex: ").append(toIndentedString(mallocTypeIndex)).append("\n");
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

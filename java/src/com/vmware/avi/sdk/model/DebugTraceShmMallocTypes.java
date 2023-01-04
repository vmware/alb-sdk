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
 * The DebugTraceShmMallocTypes is a POJO class extends AviRestResource that used for creating
 * DebugTraceShmMallocTypes.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DebugTraceShmMallocTypes  {
    @JsonProperty("shm_malloc_type_index")
    private Integer shmMallocTypeIndex = null;



    /**
     * This is the getter method this will return the attribute value.
     * Memory type to be traced for se_shmalloc and se_shmfree.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return shmMallocTypeIndex
     */
    public Integer getShmMallocTypeIndex() {
        return shmMallocTypeIndex;
    }

    /**
     * This is the setter method to the attribute.
     * Memory type to be traced for se_shmalloc and se_shmfree.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param shmMallocTypeIndex set the shmMallocTypeIndex.
     */
    public void setShmMallocTypeIndex(Integer  shmMallocTypeIndex) {
        this.shmMallocTypeIndex = shmMallocTypeIndex;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DebugTraceShmMallocTypes objDebugTraceShmMallocTypes = (DebugTraceShmMallocTypes) o;
      return   Objects.equals(this.shmMallocTypeIndex, objDebugTraceShmMallocTypes.shmMallocTypeIndex);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DebugTraceShmMallocTypes {\n");
                  sb.append("    shmMallocTypeIndex: ").append(toIndentedString(shmMallocTypeIndex)).append("\n");
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

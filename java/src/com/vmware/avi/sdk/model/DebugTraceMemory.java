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
 * The DebugTraceMemory is a POJO class extends AviRestResource that used for creating
 * DebugTraceMemory.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DebugTraceMemory  {
    @JsonProperty("trace_malloc_types")
    private List<DebugTraceMallocTypes> traceMallocTypes = null;

    @JsonProperty("trace_shm_malloc_types")
    private List<DebugTraceShmMallocTypes> traceShmMallocTypes = null;


    /**
     * This is the getter method this will return the attribute value.
     * Memory type to be traced for se_malloc and se_free.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return traceMallocTypes
     */
    public List<DebugTraceMallocTypes> getTraceMallocTypes() {
        return traceMallocTypes;
    }

    /**
     * This is the setter method. this will set the traceMallocTypes
     * Memory type to be traced for se_malloc and se_free.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return traceMallocTypes
     */
    public void setTraceMallocTypes(List<DebugTraceMallocTypes>  traceMallocTypes) {
        this.traceMallocTypes = traceMallocTypes;
    }

    /**
     * This is the setter method this will set the traceMallocTypes
     * Memory type to be traced for se_malloc and se_free.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return traceMallocTypes
     */
    public DebugTraceMemory addTraceMallocTypesItem(DebugTraceMallocTypes traceMallocTypesItem) {
      if (this.traceMallocTypes == null) {
        this.traceMallocTypes = new ArrayList<DebugTraceMallocTypes>();
      }
      this.traceMallocTypes.add(traceMallocTypesItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Memory type to be traced for se_shm_malloc and se_shm_free.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return traceShmMallocTypes
     */
    public List<DebugTraceShmMallocTypes> getTraceShmMallocTypes() {
        return traceShmMallocTypes;
    }

    /**
     * This is the setter method. this will set the traceShmMallocTypes
     * Memory type to be traced for se_shm_malloc and se_shm_free.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return traceShmMallocTypes
     */
    public void setTraceShmMallocTypes(List<DebugTraceShmMallocTypes>  traceShmMallocTypes) {
        this.traceShmMallocTypes = traceShmMallocTypes;
    }

    /**
     * This is the setter method this will set the traceShmMallocTypes
     * Memory type to be traced for se_shm_malloc and se_shm_free.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return traceShmMallocTypes
     */
    public DebugTraceMemory addTraceShmMallocTypesItem(DebugTraceShmMallocTypes traceShmMallocTypesItem) {
      if (this.traceShmMallocTypes == null) {
        this.traceShmMallocTypes = new ArrayList<DebugTraceShmMallocTypes>();
      }
      this.traceShmMallocTypes.add(traceShmMallocTypesItem);
      return this;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DebugTraceMemory objDebugTraceMemory = (DebugTraceMemory) o;
      return   Objects.equals(this.traceMallocTypes, objDebugTraceMemory.traceMallocTypes)&&
  Objects.equals(this.traceShmMallocTypes, objDebugTraceMemory.traceShmMallocTypes);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DebugTraceMemory {\n");
                  sb.append("    traceMallocTypes: ").append(toIndentedString(traceMallocTypes)).append("\n");
                        sb.append("    traceShmMallocTypes: ").append(toIndentedString(traceShmMallocTypes)).append("\n");
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

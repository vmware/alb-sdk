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
 * The NsxtT1Seg is a POJO class extends AviRestResource that used for creating
 * NsxtT1Seg.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NsxtT1Seg  {
    @JsonProperty("segment")
    private String segment;

    @JsonProperty("tier1")
    private String tier1;



    /**
     * This is the getter method this will return the attribute value.
     * Nsx-t segment.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return segment
     */
    public String getSegment() {
        return segment;
    }

    /**
     * This is the setter method to the attribute.
     * Nsx-t segment.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param segment set the segment.
     */
    public void setSegment(String  segment) {
        this.segment = segment;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Nsx-t tier1.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tier1
     */
    public String getTier1() {
        return tier1;
    }

    /**
     * This is the setter method to the attribute.
     * Nsx-t tier1.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tier1 set the tier1.
     */
    public void setTier1(String  tier1) {
        this.tier1 = tier1;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      NsxtT1Seg objNsxtT1Seg = (NsxtT1Seg) o;
      return   Objects.equals(this.tier1, objNsxtT1Seg.tier1)&&
  Objects.equals(this.segment, objNsxtT1Seg.segment);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class NsxtT1Seg {\n");
                  sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
                        sb.append("    tier1: ").append(toIndentedString(tier1)).append("\n");
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

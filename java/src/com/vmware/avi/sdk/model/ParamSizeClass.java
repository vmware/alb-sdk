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
 * The ParamSizeClass is a POJO class extends AviRestResource that used for creating
 * ParamSizeClass.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParamSizeClass  {
    @JsonProperty("hits")
    private Integer hits;

    @JsonProperty("len")
    private String len;

    @JsonProperty("timestamps")
    private List<Integer> timestamps;



    /**
     * This is the getter method this will return the attribute value.
     * Indicates the number of hits for this parameter size.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hits
     */
    public Integer getHits() {
        return hits;
    }

    /**
     * This is the setter method to the attribute.
     * Indicates the number of hits for this parameter size.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hits set the hits.
     */
    public void setHits(Integer  hits) {
        this.hits = hits;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Indicates the size of the parameter.
     * Enum options - EMPTY, SMALL, MEDIUM, LARGE, UNLIMITED.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return len
     */
    public String getLen() {
        return len;
    }

    /**
     * This is the setter method to the attribute.
     * Indicates the size of the parameter.
     * Enum options - EMPTY, SMALL, MEDIUM, LARGE, UNLIMITED.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param len set the len.
     */
    public void setLen(String  len) {
        this.len = len;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Timestamps representing the moments at which this parameter size was current.
     * Field introduced in 31.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return timestamps
     */
    public List<Integer> getTimestamps() {
        return timestamps;
    }

    /**
     * This is the setter method. this will set the timestamps
     * Timestamps representing the moments at which this parameter size was current.
     * Field introduced in 31.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return timestamps
     */
    public void setTimestamps(List<Integer>  timestamps) {
        this.timestamps = timestamps;
    }

    /**
     * This is the setter method this will set the timestamps
     * Timestamps representing the moments at which this parameter size was current.
     * Field introduced in 31.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return timestamps
     */
    public ParamSizeClass addTimestampsItem(Integer timestampsItem) {
      if (this.timestamps == null) {
        this.timestamps = new ArrayList<Integer>();
      }
      this.timestamps.add(timestampsItem);
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
      ParamSizeClass objParamSizeClass = (ParamSizeClass) o;
      return   Objects.equals(this.len, objParamSizeClass.len)&&
  Objects.equals(this.hits, objParamSizeClass.hits)&&
  Objects.equals(this.timestamps, objParamSizeClass.timestamps);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ParamSizeClass {\n");
                  sb.append("    hits: ").append(toIndentedString(hits)).append("\n");
                        sb.append("    len: ").append(toIndentedString(len)).append("\n");
                        sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
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

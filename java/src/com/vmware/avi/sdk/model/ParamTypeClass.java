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
 * The ParamTypeClass is a POJO class extends AviRestResource that used for creating
 * ParamTypeClass.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParamTypeClass  {
    @JsonProperty("hits")
    private Integer hits;

    @JsonProperty("timestamps")
    private List<Integer> timestamps;

    @JsonProperty("type")
    private String type;



    /**
     * This is the getter method this will return the attribute value.
     * Indicates the number of hits for this parameter type.
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
     * Indicates the number of hits for this parameter type.
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
     * Timestamps representing the moments at which this parameter type was current.
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
     * Timestamps representing the moments at which this parameter type was current.
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
     * Timestamps representing the moments at which this parameter type was current.
     * Field introduced in 31.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return timestamps
     */
    public ParamTypeClass addTimestampsItem(Integer timestampsItem) {
      if (this.timestamps == null) {
        this.timestamps = new ArrayList<Integer>();
      }
      this.timestamps.add(timestampsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Indicates the type of the parameter.
     * Enum options - PARAM_FLAG, PARAM_DIGITS, PARAM_HEXDIGITS, PARAM_WORD, PARAM_SAFE_TEXT, PARAM_SAFE_TEXT_MULTILINE, PARAM_TEXT,
     * PARAM_TEXT_MULTILINE, PARAM_ALL.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * Indicates the type of the parameter.
     * Enum options - PARAM_FLAG, PARAM_DIGITS, PARAM_HEXDIGITS, PARAM_WORD, PARAM_SAFE_TEXT, PARAM_SAFE_TEXT_MULTILINE, PARAM_TEXT,
     * PARAM_TEXT_MULTILINE, PARAM_ALL.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ParamTypeClass objParamTypeClass = (ParamTypeClass) o;
      return   Objects.equals(this.type, objParamTypeClass.type)&&
  Objects.equals(this.hits, objParamTypeClass.hits)&&
  Objects.equals(this.timestamps, objParamTypeClass.timestamps);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ParamTypeClass {\n");
                  sb.append("    hits: ").append(toIndentedString(hits)).append("\n");
                        sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

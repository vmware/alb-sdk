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
 * The HostAttributes is a POJO class extends AviRestResource that used for creating
 * HostAttributes.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HostAttributes  {
    @JsonProperty("attr_key")
    private String attrKey = null;

    @JsonProperty("attr_val")
    private String attrVal = null;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return attrKey
     */
    public String getAttrKey() {
        return attrKey;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param attrKey set the attrKey.
     */
    public void setAttrKey(String  attrKey) {
        this.attrKey = attrKey;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return attrVal
     */
    public String getAttrVal() {
        return attrVal;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param attrVal set the attrVal.
     */
    public void setAttrVal(String  attrVal) {
        this.attrVal = attrVal;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      HostAttributes objHostAttributes = (HostAttributes) o;
      return   Objects.equals(this.attrKey, objHostAttributes.attrKey)&&
  Objects.equals(this.attrVal, objHostAttributes.attrVal);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HostAttributes {\n");
                  sb.append("    attrKey: ").append(toIndentedString(attrKey)).append("\n");
                        sb.append("    attrVal: ").append(toIndentedString(attrVal)).append("\n");
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

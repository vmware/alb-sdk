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
 * The HeaderInfoInURI is a POJO class extends AviRestResource that used for creating
 * HeaderInfoInURI.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HeaderInfoInURI  {
    @JsonProperty("header_field_name")
    private String headerFieldName = null;

    @JsonProperty("value")
    private String value = null;



    /**
     * This is the getter method this will return the attribute value.
     * Header field name in hitted signature rule match_element.
     * Field introduced in 21.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return headerFieldName
     */
    public String getHeaderFieldName() {
        return headerFieldName;
    }

    /**
     * This is the setter method to the attribute.
     * Header field name in hitted signature rule match_element.
     * Field introduced in 21.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param headerFieldName set the headerFieldName.
     */
    public void setHeaderFieldName(String  headerFieldName) {
        this.headerFieldName = headerFieldName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Header field value in hitted signature rule match_element.
     * Field introduced in 21.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * This is the setter method to the attribute.
     * Header field value in hitted signature rule match_element.
     * Field introduced in 21.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param value set the value.
     */
    public void setValue(String  value) {
        this.value = value;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      HeaderInfoInURI objHeaderInfoInURI = (HeaderInfoInURI) o;
      return   Objects.equals(this.headerFieldName, objHeaderInfoInURI.headerFieldName)&&
  Objects.equals(this.value, objHeaderInfoInURI.value);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HeaderInfoInURI {\n");
                  sb.append("    headerFieldName: ").append(toIndentedString(headerFieldName)).append("\n");
                        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
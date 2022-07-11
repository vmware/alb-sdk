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
 * The SingleOptionalStringField is a POJO class extends AviRestResource that used for creating
 * SingleOptionalStringField.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SingleOptionalStringField  {
    @JsonProperty("test_string")
    private String testString = null;



    /**
     * This is the getter method this will return the attribute value.
     * Optional string field.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return testString
     */
    public String getTestString() {
        return testString;
    }

    /**
     * This is the setter method to the attribute.
     * Optional string field.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param testString set the testString.
     */
    public void setTestString(String  testString) {
        this.testString = testString;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SingleOptionalStringField objSingleOptionalStringField = (SingleOptionalStringField) o;
      return   Objects.equals(this.testString, objSingleOptionalStringField.testString);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SingleOptionalStringField {\n");
                  sb.append("    testString: ").append(toIndentedString(testString)).append("\n");
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

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
 * The Matches is a POJO class extends AviRestResource that used for creating
 * Matches.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Matches  {
    @JsonProperty("match_element")
    private String matchElement = null;

    @JsonProperty("match_value")
    private String matchValue = null;



    /**
     * This is the getter method this will return the attribute value.
     * Matches in signature rule.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return matchElement
     */
    public String getMatchElement() {
        return matchElement;
    }

    /**
     * This is the setter method to the attribute.
     * Matches in signature rule.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param matchElement set the matchElement.
     */
    public void setMatchElement(String  matchElement) {
        this.matchElement = matchElement;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Match value in signature rule.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return matchValue
     */
    public String getMatchValue() {
        return matchValue;
    }

    /**
     * This is the setter method to the attribute.
     * Match value in signature rule.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param matchValue set the matchValue.
     */
    public void setMatchValue(String  matchValue) {
        this.matchValue = matchValue;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      Matches objMatches = (Matches) o;
      return   Objects.equals(this.matchElement, objMatches.matchElement)&&
  Objects.equals(this.matchValue, objMatches.matchValue);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class Matches {\n");
                  sb.append("    matchElement: ").append(toIndentedString(matchElement)).append("\n");
                        sb.append("    matchValue: ").append(toIndentedString(matchValue)).append("\n");
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

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
 * The SearchReplacePair is a POJO class extends AviRestResource that used for creating
 * SearchReplacePair.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchReplacePair  {
    @JsonProperty("replacement_string")
    private ReplaceStringVar replacementString = null;

    @JsonProperty("search_string")
    private SearchStringVar searchString = null;



    /**
     * This is the getter method this will return the attribute value.
     * String to replace the searched value.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return replacementString
     */
    public ReplaceStringVar getReplacementString() {
        return replacementString;
    }

    /**
     * This is the setter method to the attribute.
     * String to replace the searched value.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param replacementString set the replacementString.
     */
    public void setReplacementString(ReplaceStringVar replacementString) {
        this.replacementString = replacementString;
    }

    /**
     * This is the getter method this will return the attribute value.
     * String to search for in the body.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return searchString
     */
    public SearchStringVar getSearchString() {
        return searchString;
    }

    /**
     * This is the setter method to the attribute.
     * String to search for in the body.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param searchString set the searchString.
     */
    public void setSearchString(SearchStringVar searchString) {
        this.searchString = searchString;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SearchReplacePair objSearchReplacePair = (SearchReplacePair) o;
      return   Objects.equals(this.searchString, objSearchReplacePair.searchString)&&
  Objects.equals(this.replacementString, objSearchReplacePair.replacementString);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SearchReplacePair {\n");
                  sb.append("    replacementString: ").append(toIndentedString(replacementString)).append("\n");
                        sb.append("    searchString: ").append(toIndentedString(searchString)).append("\n");
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

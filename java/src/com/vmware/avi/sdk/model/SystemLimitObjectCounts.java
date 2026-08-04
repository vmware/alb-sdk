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
 * The SystemLimitObjectCounts is a POJO class extends AviRestResource that used for creating
 * SystemLimitObjectCounts.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SystemLimitObjectCounts  {
    @JsonProperty("object_counts")
    private List<SystemLimitObjectCount> objectCounts;

    @JsonProperty("url")
    private String url = "url";


    /**
     * This is the getter method this will return the attribute value.
     * System limit count info for various system limits.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objectCounts
     */
    public List<SystemLimitObjectCount> getObjectCounts() {
        return objectCounts;
    }

    /**
     * This is the setter method. this will set the objectCounts
     * System limit count info for various system limits.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objectCounts
     */
    public void setObjectCounts(List<SystemLimitObjectCount>  objectCounts) {
        this.objectCounts = objectCounts;
    }

    /**
     * This is the setter method this will set the objectCounts
     * System limit count info for various system limits.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objectCounts
     */
    public SystemLimitObjectCounts addObjectCountsItem(SystemLimitObjectCount objectCountsItem) {
      if (this.objectCounts == null) {
        this.objectCounts = new ArrayList<SystemLimitObjectCount>();
      }
      this.objectCounts.add(objectCountsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Avi controller URL of the object.
     * @return url
     */
    public String getUrl() {
        return url;
    }

   /**
    * This is the setter method. this will set the url
    * Avi controller URL of the object.
    * @return url
    */
   public void setUrl(String  url) {
     this.url = url;
   }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SystemLimitObjectCounts objSystemLimitObjectCounts = (SystemLimitObjectCounts) o;
      return   Objects.equals(this.objectCounts, objSystemLimitObjectCounts.objectCounts);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SystemLimitObjectCounts {\n");
                  sb.append("    objectCounts: ").append(toIndentedString(objectCounts)).append("\n");
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

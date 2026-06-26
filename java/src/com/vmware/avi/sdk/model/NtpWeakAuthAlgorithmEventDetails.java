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
 * The NtpWeakAuthAlgorithmEventDetails is a POJO class extends AviRestResource that used for creating
 * NtpWeakAuthAlgorithmEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NtpWeakAuthAlgorithmEventDetails  {
    @JsonProperty("description")
    private String description;



    /**
     * This is the getter method this will return the attribute value.
     * Comma-separated list of key numbers using weak ntp auth algorithms (md5 or sha1).
     * Field introduced in 32.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Comma-separated list of key numbers using weak ntp auth algorithms (md5 or sha1).
     * Field introduced in 32.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      NtpWeakAuthAlgorithmEventDetails objNtpWeakAuthAlgorithmEventDetails = (NtpWeakAuthAlgorithmEventDetails) o;
      return   Objects.equals(this.description, objNtpWeakAuthAlgorithmEventDetails.description);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class NtpWeakAuthAlgorithmEventDetails {\n");
                  sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

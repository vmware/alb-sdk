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
 * The JWTValidationParams is a POJO class extends AviRestResource that used for creating
 * JWTValidationParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JWTValidationParams  {
    @JsonProperty("audience")
    private String audience = null;



    /**
     * This is the getter method this will return the attribute value.
     * Audience parameter used for validation using jwt token.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return audience
     */
    public String getAudience() {
        return audience;
    }

    /**
     * This is the setter method to the attribute.
     * Audience parameter used for validation using jwt token.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param audience set the audience.
     */
    public void setAudience(String  audience) {
        this.audience = audience;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      JWTValidationParams objJWTValidationParams = (JWTValidationParams) o;
      return   Objects.equals(this.audience, objJWTValidationParams.audience);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class JWTValidationParams {\n");
                  sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
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

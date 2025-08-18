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
 * The SSLKeyMldsaParams is a POJO class extends AviRestResource that used for creating
 * SSLKeyMldsaParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SSLKeyMldsaParams  {
    @JsonProperty("algorithm")
    private String algorithm = "SSL_KEY_MLDSA44";



    /**
     * This is the getter method this will return the attribute value.
     * Mldsa signature algorithm.
     * Enum options - SSL_KEY_MLDSA44, SSL_KEY_MLDSA65, SSL_KEY_MLDSA87.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SSL_KEY_MLDSA44".
     * @return algorithm
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * This is the setter method to the attribute.
     * Mldsa signature algorithm.
     * Enum options - SSL_KEY_MLDSA44, SSL_KEY_MLDSA65, SSL_KEY_MLDSA87.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SSL_KEY_MLDSA44".
     * @param algorithm set the algorithm.
     */
    public void setAlgorithm(String  algorithm) {
        this.algorithm = algorithm;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SSLKeyMldsaParams objSSLKeyMldsaParams = (SSLKeyMldsaParams) o;
      return   Objects.equals(this.algorithm, objSSLKeyMldsaParams.algorithm);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SSLKeyMldsaParams {\n");
                  sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
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

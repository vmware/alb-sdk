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
 * The SSLKeyRSAParams is a POJO class extends AviRestResource that used for creating
 * SSLKeyRSAParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SSLKeyRSAParams  {
    @JsonProperty("exponent")
    private Integer exponent = 65537;

    @JsonProperty("key_size")
    private String keySize = "SSL_KEY_2048_BITS";



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 65537.
     * @return exponent
     */
    public Integer getExponent() {
        return exponent;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 65537.
     * @param exponent set the exponent.
     */
    public void setExponent(Integer  exponent) {
        this.exponent = exponent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - SSL_KEY_1024_BITS, SSL_KEY_2048_BITS, SSL_KEY_3072_BITS, SSL_KEY_4096_BITS.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SSL_KEY_2048_BITS".
     * @return keySize
     */
    public String getKeySize() {
        return keySize;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - SSL_KEY_1024_BITS, SSL_KEY_2048_BITS, SSL_KEY_3072_BITS, SSL_KEY_4096_BITS.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SSL_KEY_2048_BITS".
     * @param keySize set the keySize.
     */
    public void setKeySize(String  keySize) {
        this.keySize = keySize;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SSLKeyRSAParams objSSLKeyRSAParams = (SSLKeyRSAParams) o;
      return   Objects.equals(this.keySize, objSSLKeyRSAParams.keySize)&&
  Objects.equals(this.exponent, objSSLKeyRSAParams.exponent);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SSLKeyRSAParams {\n");
                  sb.append("    exponent: ").append(toIndentedString(exponent)).append("\n");
                        sb.append("    keySize: ").append(toIndentedString(keySize)).append("\n");
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

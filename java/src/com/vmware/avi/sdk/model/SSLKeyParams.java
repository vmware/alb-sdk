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
 * The SSLKeyParams is a POJO class extends AviRestResource that used for creating
 * SSLKeyParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SSLKeyParams  {
    @JsonProperty("algorithm")
    private String algorithm = "SSL_KEY_ALGORITHM_RSA";

    @JsonProperty("ec_params")
    private SSLKeyECParams ecParams = null;

    @JsonProperty("rsa_params")
    private SSLKeyRSAParams rsaParams = null;



    /**
     * This is the getter method this will return the attribute value.
     * Enum options - SSL_KEY_ALGORITHM_RSA, SSL_KEY_ALGORITHM_EC.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SSL_KEY_ALGORITHM_RSA".
     * @return algorithm
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - SSL_KEY_ALGORITHM_RSA, SSL_KEY_ALGORITHM_EC.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SSL_KEY_ALGORITHM_RSA".
     * @param algorithm set the algorithm.
     */
    public void setAlgorithm(String  algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ecParams
     */
    public SSLKeyECParams getEcParams() {
        return ecParams;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ecParams set the ecParams.
     */
    public void setEcParams(SSLKeyECParams ecParams) {
        this.ecParams = ecParams;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rsaParams
     */
    public SSLKeyRSAParams getRsaParams() {
        return rsaParams;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param rsaParams set the rsaParams.
     */
    public void setRsaParams(SSLKeyRSAParams rsaParams) {
        this.rsaParams = rsaParams;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SSLKeyParams objSSLKeyParams = (SSLKeyParams) o;
      return   Objects.equals(this.algorithm, objSSLKeyParams.algorithm)&&
  Objects.equals(this.rsaParams, objSSLKeyParams.rsaParams)&&
  Objects.equals(this.ecParams, objSSLKeyParams.ecParams);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SSLKeyParams {\n");
                  sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
                        sb.append("    ecParams: ").append(toIndentedString(ecParams)).append("\n");
                        sb.append("    rsaParams: ").append(toIndentedString(rsaParams)).append("\n");
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

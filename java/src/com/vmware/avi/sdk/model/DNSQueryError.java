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
 * The DNSQueryError is a POJO class extends AviRestResource that used for creating
 * DNSQueryError.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DNSQueryError  {
    @JsonProperty("error")
    private String error = null;

    @JsonProperty("error_message")
    private String errorMessage = null;

    @JsonProperty("fqdn")
    private String fqdn = null;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return error
     */
    public String getError() {
        return error;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param error set the error.
     */
    public void setError(String  error) {
        this.error = error;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param errorMessage set the errorMessage.
     */
    public void setErrorMessage(String  errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fqdn
     */
    public String getFqdn() {
        return fqdn;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param fqdn set the fqdn.
     */
    public void setFqdn(String  fqdn) {
        this.fqdn = fqdn;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DNSQueryError objDNSQueryError = (DNSQueryError) o;
      return   Objects.equals(this.fqdn, objDNSQueryError.fqdn)&&
  Objects.equals(this.error, objDNSQueryError.error)&&
  Objects.equals(this.errorMessage, objDNSQueryError.errorMessage);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DNSQueryError {\n");
                  sb.append("    error: ").append(toIndentedString(error)).append("\n");
                        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
                        sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
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

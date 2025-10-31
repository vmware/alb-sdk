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
 * The ExpirationConstraint is a POJO class extends AviRestResource that used for creating
 * ExpirationConstraint.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExpirationConstraint  {
    @JsonProperty("password_expiration_days")
    private Integer passwordExpirationDays = 365;



    /**
     * This is the getter method this will return the attribute value.
     * Password expiry period in days.
     * Defaults to 365 days.
     * Allowed values are 30-730.
     * Special values are 0- no password expiry.
     * Field introduced in 32.1.1.
     * Unit is days.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 365.
     * @return passwordExpirationDays
     */
    public Integer getPasswordExpirationDays() {
        return passwordExpirationDays;
    }

    /**
     * This is the setter method to the attribute.
     * Password expiry period in days.
     * Defaults to 365 days.
     * Allowed values are 30-730.
     * Special values are 0- no password expiry.
     * Field introduced in 32.1.1.
     * Unit is days.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 365.
     * @param passwordExpirationDays set the passwordExpirationDays.
     */
    public void setPasswordExpirationDays(Integer  passwordExpirationDays) {
        this.passwordExpirationDays = passwordExpirationDays;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ExpirationConstraint objExpirationConstraint = (ExpirationConstraint) o;
      return   Objects.equals(this.passwordExpirationDays, objExpirationConstraint.passwordExpirationDays);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ExpirationConstraint {\n");
                  sb.append("    passwordExpirationDays: ").append(toIndentedString(passwordExpirationDays)).append("\n");
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

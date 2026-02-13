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
 * The SaasLicensingInfo is a POJO class extends AviRestResource that used for creating
 * SaasLicensingInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SaasLicensingInfo  {
    @JsonProperty("enable_notional_reserve")
    private Boolean enableNotionalReserve = true;



    /**
     * This is the getter method this will return the attribute value.
     * Enable relaxed reservation norm allowing up to 2x free units( normally constrained to free license units ) to be reserved by upcoming se’s.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return enableNotionalReserve
     */
    public Boolean getEnableNotionalReserve() {
        return enableNotionalReserve;
    }

    /**
     * This is the setter method to the attribute.
     * Enable relaxed reservation norm allowing up to 2x free units( normally constrained to free license units ) to be reserved by upcoming se’s.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param enableNotionalReserve set the enableNotionalReserve.
     */
    public void setEnableNotionalReserve(Boolean  enableNotionalReserve) {
        this.enableNotionalReserve = enableNotionalReserve;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SaasLicensingInfo objSaasLicensingInfo = (SaasLicensingInfo) o;
      return   Objects.equals(this.enableNotionalReserve, objSaasLicensingInfo.enableNotionalReserve);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SaasLicensingInfo {\n");
                  sb.append("    enableNotionalReserve: ").append(toIndentedString(enableNotionalReserve)).append("\n");
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

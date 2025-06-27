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
 * The TechSupportEvent is a POJO class extends AviRestResource that used for creating
 * TechSupportEvent.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TechSupportEvent  {
    @JsonProperty("tech_support_status")
    private TechSupportStatus techSupportStatus;

    @JsonProperty("tenant")
    private String tenant;



    /**
     * This is the getter method this will return the attribute value.
     * Techsupport status object.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return techSupportStatus
     */
    public TechSupportStatus getTechSupportStatus() {
        return techSupportStatus;
    }

    /**
     * This is the setter method to the attribute.
     * Techsupport status object.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param techSupportStatus set the techSupportStatus.
     */
    public void setTechSupportStatus(TechSupportStatus techSupportStatus) {
        this.techSupportStatus = techSupportStatus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenant under techsupport invoked.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenant
     */
    public String getTenant() {
        return tenant;
    }

    /**
     * This is the setter method to the attribute.
     * Tenant under techsupport invoked.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenant set the tenant.
     */
    public void setTenant(String  tenant) {
        this.tenant = tenant;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      TechSupportEvent objTechSupportEvent = (TechSupportEvent) o;
      return   Objects.equals(this.techSupportStatus, objTechSupportEvent.techSupportStatus)&&
  Objects.equals(this.tenant, objTechSupportEvent.tenant);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class TechSupportEvent {\n");
                  sb.append("    techSupportStatus: ").append(toIndentedString(techSupportStatus)).append("\n");
                        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
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

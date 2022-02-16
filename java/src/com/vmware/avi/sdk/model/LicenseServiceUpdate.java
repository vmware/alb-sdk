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
 * The LicenseServiceUpdate is a POJO class extends AviRestResource that used for creating
 * LicenseServiceUpdate.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LicenseServiceUpdate  {
    @JsonProperty("name")
    private String name = null;

    @JsonProperty("service_units")
    private OrgServiceUnits serviceUnits = null;



    /**
     * This is the getter method this will return the attribute value.
     * Name.
     * Field introduced in 21.1.4.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name.
     * Field introduced in 21.1.4.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Organization id.
     * Field introduced in 21.1.4.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceUnits
     */
    public OrgServiceUnits getServiceUnits() {
        return serviceUnits;
    }

    /**
     * This is the setter method to the attribute.
     * Organization id.
     * Field introduced in 21.1.4.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serviceUnits set the serviceUnits.
     */
    public void setServiceUnits(OrgServiceUnits serviceUnits) {
        this.serviceUnits = serviceUnits;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      LicenseServiceUpdate objLicenseServiceUpdate = (LicenseServiceUpdate) o;
      return   Objects.equals(this.name, objLicenseServiceUpdate.name)&&
  Objects.equals(this.serviceUnits, objLicenseServiceUpdate.serviceUnits);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LicenseServiceUpdate {\n");
                  sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    serviceUnits: ").append(toIndentedString(serviceUnits)).append("\n");
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

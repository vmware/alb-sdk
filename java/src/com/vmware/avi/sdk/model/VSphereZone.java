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
 * The VSphereZone is a POJO class extends AviRestResource that used for creating
 * VSphereZone.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VSphereZone  {
    @JsonProperty("vcenter_ref")
    private String vcenterRef;

    @JsonProperty("zone_name")
    private String zoneName;



    /**
     * This is the getter method this will return the attribute value.
     * The uuid of the vcenter server where the vsphere zone belongs.
     * It is a reference to an object of type vcenterserver.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterRef
     */
    public String getVcenterRef() {
        return vcenterRef;
    }

    /**
     * This is the setter method to the attribute.
     * The uuid of the vcenter server where the vsphere zone belongs.
     * It is a reference to an object of type vcenterserver.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterRef set the vcenterRef.
     */
    public void setVcenterRef(String  vcenterRef) {
        this.vcenterRef = vcenterRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the vsphere zone in vcenter.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return zoneName
     */
    public String getZoneName() {
        return zoneName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the vsphere zone in vcenter.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param zoneName set the zoneName.
     */
    public void setZoneName(String  zoneName) {
        this.zoneName = zoneName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VSphereZone objVSphereZone = (VSphereZone) o;
      return   Objects.equals(this.vcenterRef, objVSphereZone.vcenterRef)&&
  Objects.equals(this.zoneName, objVSphereZone.zoneName);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VSphereZone {\n");
                  sb.append("    vcenterRef: ").append(toIndentedString(vcenterRef)).append("\n");
                        sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
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

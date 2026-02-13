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
 * The VsphereStoragePolicy is a POJO class extends AviRestResource that used for creating
 * VsphereStoragePolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VsphereStoragePolicy  {
    @JsonProperty("vcenter_ref")
    private String vcenterRef;

    @JsonProperty("vsphere_storage_policy_id")
    private String vsphereStoragePolicyId;



    /**
     * This is the getter method this will return the attribute value.
     * Vcenter server configuration , applicable only for nsxt-cloud.
     * It is a reference to an object of type vcenterserver.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterRef
     */
    public String getVcenterRef() {
        return vcenterRef;
    }

    /**
     * This is the setter method to the attribute.
     * Vcenter server configuration , applicable only for nsxt-cloud.
     * It is a reference to an object of type vcenterserver.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterRef set the vcenterRef.
     */
    public void setVcenterRef(String  vcenterRef) {
        this.vcenterRef = vcenterRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vsphere vm storage policy uuid to be associated to the service engine.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsphereStoragePolicyId
     */
    public String getVsphereStoragePolicyId() {
        return vsphereStoragePolicyId;
    }

    /**
     * This is the setter method to the attribute.
     * Vsphere vm storage policy uuid to be associated to the service engine.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsphereStoragePolicyId set the vsphereStoragePolicyId.
     */
    public void setVsphereStoragePolicyId(String  vsphereStoragePolicyId) {
        this.vsphereStoragePolicyId = vsphereStoragePolicyId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VsphereStoragePolicy objVsphereStoragePolicy = (VsphereStoragePolicy) o;
      return   Objects.equals(this.vcenterRef, objVsphereStoragePolicy.vcenterRef)&&
  Objects.equals(this.vsphereStoragePolicyId, objVsphereStoragePolicy.vsphereStoragePolicyId);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VsphereStoragePolicy {\n");
                  sb.append("    vcenterRef: ").append(toIndentedString(vcenterRef)).append("\n");
                        sb.append("    vsphereStoragePolicyId: ").append(toIndentedString(vsphereStoragePolicyId)).append("\n");
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

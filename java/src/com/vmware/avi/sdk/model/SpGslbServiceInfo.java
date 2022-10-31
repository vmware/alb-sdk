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
 * The SpGslbServiceInfo is a POJO class extends AviRestResource that used for creating
 * SpGslbServiceInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SpGslbServiceInfo  {
    @JsonProperty("fqdns")
    private List<String> fqdns = null;

    @JsonProperty("gs_ref")
    private String gsRef = null;


    /**
     * This is the getter method this will return the attribute value.
     * Fqdns associated with the gslb service.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fqdns
     */
    public List<String> getFqdns() {
        return fqdns;
    }

    /**
     * This is the setter method. this will set the fqdns
     * Fqdns associated with the gslb service.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fqdns
     */
    public void setFqdns(List<String>  fqdns) {
        this.fqdns = fqdns;
    }

    /**
     * This is the setter method this will set the fqdns
     * Fqdns associated with the gslb service.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fqdns
     */
    public SpGslbServiceInfo addFqdnsItem(String fqdnsItem) {
      if (this.fqdns == null) {
        this.fqdns = new ArrayList<String>();
      }
      this.fqdns.add(fqdnsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Gslb service uuid associated with the site persistence pool.
     * It is a reference to an object of type gslbservice.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gsRef
     */
    public String getGsRef() {
        return gsRef;
    }

    /**
     * This is the setter method to the attribute.
     * Gslb service uuid associated with the site persistence pool.
     * It is a reference to an object of type gslbservice.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gsRef set the gsRef.
     */
    public void setGsRef(String  gsRef) {
        this.gsRef = gsRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SpGslbServiceInfo objSpGslbServiceInfo = (SpGslbServiceInfo) o;
      return   Objects.equals(this.gsRef, objSpGslbServiceInfo.gsRef)&&
  Objects.equals(this.fqdns, objSpGslbServiceInfo.fqdns);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SpGslbServiceInfo {\n");
                  sb.append("    fqdns: ").append(toIndentedString(fqdns)).append("\n");
                        sb.append("    gsRef: ").append(toIndentedString(gsRef)).append("\n");
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

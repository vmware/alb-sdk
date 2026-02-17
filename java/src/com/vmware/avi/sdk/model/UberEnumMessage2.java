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
 * The UberEnumMessage2 is a POJO class extends AviRestResource that used for creating
 * UberEnumMessage2.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UberEnumMessage2  {
    @JsonProperty("l")
    private List<Integer> l;

    @JsonProperty("v")
    private Integer v;


    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return l
     */
    public List<Integer> getL() {
        return l;
    }

    /**
     * This is the setter method. this will set the l
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return l
     */
    public void setL(List<Integer>  l) {
        this.l = l;
    }

    /**
     * This is the setter method this will set the l
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return l
     */
    public UberEnumMessage2 addLItem(Integer lItem) {
      if (this.l == null) {
        this.l = new ArrayList<Integer>();
      }
      this.l.add(lItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return v
     */
    public Integer getV() {
        return v;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param v set the v.
     */
    public void setV(Integer  v) {
        this.v = v;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      UberEnumMessage2 objUberEnumMessage2 = (UberEnumMessage2) o;
      return   Objects.equals(this.v, objUberEnumMessage2.v)&&
  Objects.equals(this.l, objUberEnumMessage2.l);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class UberEnumMessage2 {\n");
                  sb.append("    l: ").append(toIndentedString(l)).append("\n");
                        sb.append("    v: ").append(toIndentedString(v)).append("\n");
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

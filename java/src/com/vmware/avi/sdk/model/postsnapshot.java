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
 * The postsnapshot is a POJO class extends AviRestResource that used for creating
 * postsnapshot.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class postsnapshot  {
    @JsonProperty("gssnapshot")
    private FbGsInfo gssnapshot = null;

    @JsonProperty("poolsnapshot")
    private FbPoolInfo poolsnapshot = null;

    @JsonProperty("sesnapshot")
    private FbSeInfo sesnapshot = null;

    @JsonProperty("vssnapshot")
    private FbVsInfo vssnapshot = null;



    /**
     * This is the getter method this will return the attribute value.
     * Fb gs snapshot data.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gssnapshot
     */
    public FbGsInfo getGssnapshot() {
        return gssnapshot;
    }

    /**
     * This is the setter method to the attribute.
     * Fb gs snapshot data.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gssnapshot set the gssnapshot.
     */
    public void setGssnapshot(FbGsInfo gssnapshot) {
        this.gssnapshot = gssnapshot;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Fb pool snapshot data.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolsnapshot
     */
    public FbPoolInfo getPoolsnapshot() {
        return poolsnapshot;
    }

    /**
     * This is the setter method to the attribute.
     * Fb pool snapshot data.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolsnapshot set the poolsnapshot.
     */
    public void setPoolsnapshot(FbPoolInfo poolsnapshot) {
        this.poolsnapshot = poolsnapshot;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Fb se snapshot data.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sesnapshot
     */
    public FbSeInfo getSesnapshot() {
        return sesnapshot;
    }

    /**
     * This is the setter method to the attribute.
     * Fb se snapshot data.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sesnapshot set the sesnapshot.
     */
    public void setSesnapshot(FbSeInfo sesnapshot) {
        this.sesnapshot = sesnapshot;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Fb vs snapshot data.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vssnapshot
     */
    public FbVsInfo getVssnapshot() {
        return vssnapshot;
    }

    /**
     * This is the setter method to the attribute.
     * Fb vs snapshot data.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vssnapshot set the vssnapshot.
     */
    public void setVssnapshot(FbVsInfo vssnapshot) {
        this.vssnapshot = vssnapshot;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      postsnapshot objpostsnapshot = (postsnapshot) o;
      return   Objects.equals(this.vssnapshot, objpostsnapshot.vssnapshot)&&
  Objects.equals(this.sesnapshot, objpostsnapshot.sesnapshot)&&
  Objects.equals(this.poolsnapshot, objpostsnapshot.poolsnapshot)&&
  Objects.equals(this.gssnapshot, objpostsnapshot.gssnapshot);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class postsnapshot {\n");
                  sb.append("    gssnapshot: ").append(toIndentedString(gssnapshot)).append("\n");
                        sb.append("    poolsnapshot: ").append(toIndentedString(poolsnapshot)).append("\n");
                        sb.append("    sesnapshot: ").append(toIndentedString(sesnapshot)).append("\n");
                        sb.append("    vssnapshot: ").append(toIndentedString(vssnapshot)).append("\n");
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

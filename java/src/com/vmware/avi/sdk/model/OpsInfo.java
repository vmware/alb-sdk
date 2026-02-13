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
 * The OpsInfo is a POJO class extends AviRestResource that used for creating
 * OpsInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OpsInfo  {
    @JsonProperty("rrtoken")
    private List<String> rrtoken;


    /**
     * This is the getter method this will return the attribute value.
     * Current outstanding request-response token of the message to this site.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rrtoken
     */
    public List<String> getRrtoken() {
        return rrtoken;
    }

    /**
     * This is the setter method. this will set the rrtoken
     * Current outstanding request-response token of the message to this site.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rrtoken
     */
    public void setRrtoken(List<String>  rrtoken) {
        this.rrtoken = rrtoken;
    }

    /**
     * This is the setter method this will set the rrtoken
     * Current outstanding request-response token of the message to this site.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rrtoken
     */
    public OpsInfo addRrtokenItem(String rrtokenItem) {
      if (this.rrtoken == null) {
        this.rrtoken = new ArrayList<String>();
      }
      this.rrtoken.add(rrtokenItem);
      return this;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      OpsInfo objOpsInfo = (OpsInfo) o;
      return   Objects.equals(this.rrtoken, objOpsInfo.rrtoken);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OpsInfo {\n");
                  sb.append("    rrtoken: ").append(toIndentedString(rrtoken)).append("\n");
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

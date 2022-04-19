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
 * The WafPolicyCRSUpdate is a POJO class extends AviRestResource that used for creating
 * WafPolicyCRSUpdate.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WafPolicyCRSUpdate  {
    @JsonProperty("commit")
    private Boolean commit = false;

    @JsonProperty("waf_crs_ref")
    private String wafCrsRef = null;



    /**
     * This is the getter method this will return the attribute value.
     * Set this to true if you want to update the policy.
     * The default value of false will only analyse what would be changed if this flag would be set to true.
     * Field introduced in 22.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return commit
     */
    public Boolean getCommit() {
        return commit;
    }

    /**
     * This is the setter method to the attribute.
     * Set this to true if you want to update the policy.
     * The default value of false will only analyse what would be changed if this flag would be set to true.
     * Field introduced in 22.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param commit set the commit.
     */
    public void setCommit(Boolean  commit) {
        this.commit = commit;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Crs object to which this policy should be updated to.
     * To disable crs for this policy, the special crs object crs-version-not-applicable can be used.
     * It is a reference to an object of type wafcrs.
     * Field introduced in 22.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return wafCrsRef
     */
    public String getWafCrsRef() {
        return wafCrsRef;
    }

    /**
     * This is the setter method to the attribute.
     * Crs object to which this policy should be updated to.
     * To disable crs for this policy, the special crs object crs-version-not-applicable can be used.
     * It is a reference to an object of type wafcrs.
     * Field introduced in 22.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param wafCrsRef set the wafCrsRef.
     */
    public void setWafCrsRef(String  wafCrsRef) {
        this.wafCrsRef = wafCrsRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      WafPolicyCRSUpdate objWafPolicyCRSUpdate = (WafPolicyCRSUpdate) o;
      return   Objects.equals(this.wafCrsRef, objWafPolicyCRSUpdate.wafCrsRef)&&
  Objects.equals(this.commit, objWafPolicyCRSUpdate.commit);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WafPolicyCRSUpdate {\n");
                  sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
                        sb.append("    wafCrsRef: ").append(toIndentedString(wafCrsRef)).append("\n");
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

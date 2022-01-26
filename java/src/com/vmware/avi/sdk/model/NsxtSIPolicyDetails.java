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
 * The NsxtSIPolicyDetails is a POJO class extends AviRestResource that used for creating
 * NsxtSIPolicyDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NsxtSIPolicyDetails  {
    @JsonProperty("error_string")
    private String errorString = null;

    @JsonProperty("policy")
    private String policy = null;

    @JsonProperty("redirectTo")
    private List<String> redirectTo = null;

    @JsonProperty("scope")
    private String scope = null;

    @JsonProperty("segroup")
    private String segroup = null;

    @JsonProperty("tier1")
    private String tier1 = null;



    /**
     * This is the getter method this will return the attribute value.
     * Error message.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorString
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * This is the setter method to the attribute.
     * Error message.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param errorString set the errorString.
     */
    public void setErrorString(String  errorString) {
        this.errorString = errorString;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Redirectpolicy path.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return policy
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * This is the setter method to the attribute.
     * Redirectpolicy path.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param policy set the policy.
     */
    public void setPolicy(String  policy) {
        this.policy = policy;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Traffic is redirected to this endpoints.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return redirectTo
     */
    public List<String> getRedirectto() {
        return redirectTo;
    }

    /**
     * This is the setter method. this will set the redirectTo
     * Traffic is redirected to this endpoints.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return redirectTo
     */
    public void setRedirectto(List<String>  redirectTo) {
        this.redirectTo = redirectTo;
    }

    /**
     * This is the setter method this will set the redirectTo
     * Traffic is redirected to this endpoints.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return redirectTo
     */
    public NsxtSIPolicyDetails addRedirecttoItem(String redirectToItem) {
      if (this.redirectTo == null) {
        this.redirectTo = new ArrayList<String>();
      }
      this.redirectTo.add(redirectToItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Policy scope.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    /**
     * This is the setter method to the attribute.
     * Policy scope.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param scope set the scope.
     */
    public void setScope(String  scope) {
        this.scope = scope;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Serviceenginegroup name.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return segroup
     */
    public String getSegroup() {
        return segroup;
    }

    /**
     * This is the setter method to the attribute.
     * Serviceenginegroup name.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param segroup set the segroup.
     */
    public void setSegroup(String  segroup) {
        this.segroup = segroup;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tier1 path.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tier1
     */
    public String getTier1() {
        return tier1;
    }

    /**
     * This is the setter method to the attribute.
     * Tier1 path.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tier1 set the tier1.
     */
    public void setTier1(String  tier1) {
        this.tier1 = tier1;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      NsxtSIPolicyDetails objNsxtSIPolicyDetails = (NsxtSIPolicyDetails) o;
      return   Objects.equals(this.segroup, objNsxtSIPolicyDetails.segroup)&&
  Objects.equals(this.tier1, objNsxtSIPolicyDetails.tier1)&&
  Objects.equals(this.errorString, objNsxtSIPolicyDetails.errorString)&&
  Objects.equals(this.policy, objNsxtSIPolicyDetails.policy)&&
  Objects.equals(this.redirectTo, objNsxtSIPolicyDetails.redirectTo)&&
  Objects.equals(this.scope, objNsxtSIPolicyDetails.scope);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class NsxtSIPolicyDetails {\n");
                  sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
                        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
                        sb.append("    redirectTo: ").append(toIndentedString(redirectTo)).append("\n");
                        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
                        sb.append("    segroup: ").append(toIndentedString(segroup)).append("\n");
                        sb.append("    tier1: ").append(toIndentedString(tier1)).append("\n");
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

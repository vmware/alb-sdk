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
 * The OIDCConfig is a POJO class extends AviRestResource that used for creating
 * OIDCConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OIDCConfig  {
    @JsonProperty("oidc_enable")
    private Boolean oidcEnable = null;

    @JsonProperty("profile")
    private Boolean profile = true;

    @JsonProperty("userinfo")
    private Boolean userinfo = null;



    /**
     * This is the getter method this will return the attribute value.
     * Adds openid as one of the scopes enabling openid connect flow.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return oidcEnable
     */
    public Boolean getOidcEnable() {
        return oidcEnable;
    }

    /**
     * This is the setter method to the attribute.
     * Adds openid as one of the scopes enabling openid connect flow.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param oidcEnable set the oidcEnable.
     */
    public void setOidcEnable(Boolean  oidcEnable) {
        this.oidcEnable = oidcEnable;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Fetch profile information by enabling profile scope.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return profile
     */
    public Boolean getProfile() {
        return profile;
    }

    /**
     * This is the setter method to the attribute.
     * Fetch profile information by enabling profile scope.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param profile set the profile.
     */
    public void setProfile(Boolean  profile) {
        this.profile = profile;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Fetch profile information from userinfo endpoint.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return userinfo
     */
    public Boolean getUserinfo() {
        return userinfo;
    }

    /**
     * This is the setter method to the attribute.
     * Fetch profile information from userinfo endpoint.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param userinfo set the userinfo.
     */
    public void setUserinfo(Boolean  userinfo) {
        this.userinfo = userinfo;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      OIDCConfig objOIDCConfig = (OIDCConfig) o;
      return   Objects.equals(this.oidcEnable, objOIDCConfig.oidcEnable)&&
  Objects.equals(this.profile, objOIDCConfig.profile)&&
  Objects.equals(this.userinfo, objOIDCConfig.userinfo);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OIDCConfig {\n");
                  sb.append("    oidcEnable: ").append(toIndentedString(oidcEnable)).append("\n");
                        sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
                        sb.append("    userinfo: ").append(toIndentedString(userinfo)).append("\n");
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

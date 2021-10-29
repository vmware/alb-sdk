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
 * The OAuthSettings is a POJO class extends AviRestResource that used for creating
 * OAuthSettings.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OAuthSettings  {
    @JsonProperty("app_settings")
    private OAuthAppSettings appSettings = null;

    @JsonProperty("auth_profile_ref")
    private String authProfileRef = null;

    @JsonProperty("resource_server")
    private OAuthResourceServer resourceServer = null;



    /**
     * This is the getter method this will return the attribute value.
     * Application-specific oauth config.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return appSettings
     */
    public OAuthAppSettings getAppSettings() {
        return appSettings;
    }

    /**
     * This is the setter method to the attribute.
     * Application-specific oauth config.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param appSettings set the appSettings.
     */
    public void setAppSettings(OAuthAppSettings appSettings) {
        this.appSettings = appSettings;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Auth profile to use for validating users.
     * It is a reference to an object of type authprofile.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return authProfileRef
     */
    public String getAuthProfileRef() {
        return authProfileRef;
    }

    /**
     * This is the setter method to the attribute.
     * Auth profile to use for validating users.
     * It is a reference to an object of type authprofile.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param authProfileRef set the authProfileRef.
     */
    public void setAuthProfileRef(String  authProfileRef) {
        this.authProfileRef = authProfileRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Resource server oauth config.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return resourceServer
     */
    public OAuthResourceServer getResourceServer() {
        return resourceServer;
    }

    /**
     * This is the setter method to the attribute.
     * Resource server oauth config.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param resourceServer set the resourceServer.
     */
    public void setResourceServer(OAuthResourceServer resourceServer) {
        this.resourceServer = resourceServer;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      OAuthSettings objOAuthSettings = (OAuthSettings) o;
      return   Objects.equals(this.authProfileRef, objOAuthSettings.authProfileRef)&&
  Objects.equals(this.appSettings, objOAuthSettings.appSettings)&&
  Objects.equals(this.resourceServer, objOAuthSettings.resourceServer);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OAuthSettings {\n");
                  sb.append("    appSettings: ").append(toIndentedString(appSettings)).append("\n");
                        sb.append("    authProfileRef: ").append(toIndentedString(authProfileRef)).append("\n");
                        sb.append("    resourceServer: ").append(toIndentedString(resourceServer)).append("\n");
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

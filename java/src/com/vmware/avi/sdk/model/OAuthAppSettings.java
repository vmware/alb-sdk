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
 * The OAuthAppSettings is a POJO class extends AviRestResource that used for creating
 * OAuthAppSettings.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OAuthAppSettings  {
    @JsonProperty("client_id")
    private String clientId = null;

    @JsonProperty("client_secret")
    private String clientSecret = null;

    @JsonProperty("oidc_config")
    private OIDCConfig oidcConfig = null;

    @JsonProperty("scopes")
    private List<String> scopes = null;



    /**
     * This is the getter method this will return the attribute value.
     * Application specific identifier.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * This is the setter method to the attribute.
     * Application specific identifier.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientId set the clientId.
     */
    public void setClientId(String  clientId) {
        this.clientId = clientId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Application specific identifier secret.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientSecret
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * This is the setter method to the attribute.
     * Application specific identifier secret.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientSecret set the clientSecret.
     */
    public void setClientSecret(String  clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Openid connect specific configuration.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return oidcConfig
     */
    public OIDCConfig getOidcConfig() {
        return oidcConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Openid connect specific configuration.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param oidcConfig set the oidcConfig.
     */
    public void setOidcConfig(OIDCConfig oidcConfig) {
        this.oidcConfig = oidcConfig;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Scope specified to give limited access to the app.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return scopes
     */
    public List<String> getScopes() {
        return scopes;
    }

    /**
     * This is the setter method. this will set the scopes
     * Scope specified to give limited access to the app.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return scopes
     */
    public void setScopes(List<String>  scopes) {
        this.scopes = scopes;
    }

    /**
     * This is the setter method this will set the scopes
     * Scope specified to give limited access to the app.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return scopes
     */
    public OAuthAppSettings addScopesItem(String scopesItem) {
      if (this.scopes == null) {
        this.scopes = new ArrayList<String>();
      }
      this.scopes.add(scopesItem);
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
      OAuthAppSettings objOAuthAppSettings = (OAuthAppSettings) o;
      return   Objects.equals(this.scopes, objOAuthAppSettings.scopes)&&
  Objects.equals(this.oidcConfig, objOAuthAppSettings.oidcConfig)&&
  Objects.equals(this.clientId, objOAuthAppSettings.clientId)&&
  Objects.equals(this.clientSecret, objOAuthAppSettings.clientSecret);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OAuthAppSettings {\n");
                  sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
                        sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
                        sb.append("    oidcConfig: ").append(toIndentedString(oidcConfig)).append("\n");
                        sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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

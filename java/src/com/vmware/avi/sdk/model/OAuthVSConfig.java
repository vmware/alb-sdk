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
 * The OAuthVSConfig is a POJO class extends AviRestResource that used for creating
 * OAuthVSConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OAuthVSConfig  {
    @JsonProperty("cookie_name")
    private String cookieName = null;

    @JsonProperty("cookie_timeout")
    private Integer cookieTimeout = 60;

    @JsonProperty("key")
    private List<HttpCookiePersistenceKey> key = null;

    @JsonProperty("oauth_settings")
    private List<OAuthSettings> oauthSettings = null;

    @JsonProperty("redirect_uri")
    private String redirectUri = null;



    /**
     * This is the getter method this will return the attribute value.
     * Http cookie name for authorized session.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cookieName
     */
    public String getCookieName() {
        return cookieName;
    }

    /**
     * This is the setter method to the attribute.
     * Http cookie name for authorized session.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cookieName set the cookieName.
     */
    public void setCookieName(String  cookieName) {
        this.cookieName = cookieName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Http cookie timeout for authorized session.
     * Allowed values are 1-1440.
     * Field introduced in 21.1.3.
     * Unit is min.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @return cookieTimeout
     */
    public Integer getCookieTimeout() {
        return cookieTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Http cookie timeout for authorized session.
     * Allowed values are 1-1440.
     * Field introduced in 21.1.3.
     * Unit is min.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @param cookieTimeout set the cookieTimeout.
     */
    public void setCookieTimeout(Integer  cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Key to generate the cookie.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return key
     */
    public List<HttpCookiePersistenceKey> getKey() {
        return key;
    }

    /**
     * This is the setter method. this will set the key
     * Key to generate the cookie.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return key
     */
    public void setKey(List<HttpCookiePersistenceKey>  key) {
        this.key = key;
    }

    /**
     * This is the setter method this will set the key
     * Key to generate the cookie.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return key
     */
    public OAuthVSConfig addKeyItem(HttpCookiePersistenceKey keyItem) {
      if (this.key == null) {
        this.key = new ArrayList<HttpCookiePersistenceKey>();
      }
      this.key.add(keyItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Application and idp settings for oauth/oidc.
     * Field introduced in 21.1.3.
     * Maximum of 1 items allowed.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return oauthSettings
     */
    public List<OAuthSettings> getOauthSettings() {
        return oauthSettings;
    }

    /**
     * This is the setter method. this will set the oauthSettings
     * Application and idp settings for oauth/oidc.
     * Field introduced in 21.1.3.
     * Maximum of 1 items allowed.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return oauthSettings
     */
    public void setOauthSettings(List<OAuthSettings>  oauthSettings) {
        this.oauthSettings = oauthSettings;
    }

    /**
     * This is the setter method this will set the oauthSettings
     * Application and idp settings for oauth/oidc.
     * Field introduced in 21.1.3.
     * Maximum of 1 items allowed.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return oauthSettings
     */
    public OAuthVSConfig addOauthSettingsItem(OAuthSettings oauthSettingsItem) {
      if (this.oauthSettings == null) {
        this.oauthSettings = new ArrayList<OAuthSettings>();
      }
      this.oauthSettings.add(oauthSettingsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Redirect uri specified in the request to authorization server.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return redirectUri
     */
    public String getRedirectUri() {
        return redirectUri;
    }

    /**
     * This is the setter method to the attribute.
     * Redirect uri specified in the request to authorization server.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param redirectUri set the redirectUri.
     */
    public void setRedirectUri(String  redirectUri) {
        this.redirectUri = redirectUri;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      OAuthVSConfig objOAuthVSConfig = (OAuthVSConfig) o;
      return   Objects.equals(this.redirectUri, objOAuthVSConfig.redirectUri)&&
  Objects.equals(this.cookieName, objOAuthVSConfig.cookieName)&&
  Objects.equals(this.cookieTimeout, objOAuthVSConfig.cookieTimeout)&&
  Objects.equals(this.oauthSettings, objOAuthVSConfig.oauthSettings)&&
  Objects.equals(this.key, objOAuthVSConfig.key);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OAuthVSConfig {\n");
                  sb.append("    cookieName: ").append(toIndentedString(cookieName)).append("\n");
                        sb.append("    cookieTimeout: ").append(toIndentedString(cookieTimeout)).append("\n");
                        sb.append("    key: ").append(toIndentedString(key)).append("\n");
                        sb.append("    oauthSettings: ").append(toIndentedString(oauthSettings)).append("\n");
                        sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
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

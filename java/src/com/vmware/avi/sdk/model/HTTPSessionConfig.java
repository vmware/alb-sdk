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
 * The HTTPSessionConfig is a POJO class extends AviRestResource that used for creating
 * HTTPSessionConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HTTPSessionConfig  {
    @JsonProperty("session_cookie_httponly")
    private Boolean sessionCookieHttponly = true;

    @JsonProperty("session_cookie_name")
    private String sessionCookieName = "albsessid";

    @JsonProperty("session_cookie_samesite")
    private String sessionCookieSamesite = "SAMESITE_LAX";

    @JsonProperty("session_cookie_secure")
    private Boolean sessionCookieSecure = true;

    @JsonProperty("session_establishment_timeout")
    private Integer sessionEstablishmentTimeout = 300;

    @JsonProperty("session_idle_timeout")
    private Integer sessionIdleTimeout = 1800;

    @JsonProperty("session_maximum_timeout")
    private Integer sessionMaximumTimeout = 28800;



    /**
     * This is the getter method this will return the attribute value.
     * If set, http session cookie will use 'httponly' attribute.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return sessionCookieHttponly
     */
    public Boolean getSessionCookieHttponly() {
        return sessionCookieHttponly;
    }

    /**
     * This is the setter method to the attribute.
     * If set, http session cookie will use 'httponly' attribute.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param sessionCookieHttponly set the sessionCookieHttponly.
     */
    public void setSessionCookieHttponly(Boolean  sessionCookieHttponly) {
        this.sessionCookieHttponly = sessionCookieHttponly;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Http session cookie name to use.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "albsessid".
     * @return sessionCookieName
     */
    public String getSessionCookieName() {
        return sessionCookieName;
    }

    /**
     * This is the setter method to the attribute.
     * Http session cookie name to use.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "albsessid".
     * @param sessionCookieName set the sessionCookieName.
     */
    public void setSessionCookieName(String  sessionCookieName) {
        this.sessionCookieName = sessionCookieName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Http session cookie samesite attribute.
     * Enum options - SAMESITE_NONE, SAMESITE_LAX, SAMESITE_STRICT.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SAMESITE_LAX".
     * @return sessionCookieSamesite
     */
    public String getSessionCookieSamesite() {
        return sessionCookieSamesite;
    }

    /**
     * This is the setter method to the attribute.
     * Http session cookie samesite attribute.
     * Enum options - SAMESITE_NONE, SAMESITE_LAX, SAMESITE_STRICT.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SAMESITE_LAX".
     * @param sessionCookieSamesite set the sessionCookieSamesite.
     */
    public void setSessionCookieSamesite(String  sessionCookieSamesite) {
        this.sessionCookieSamesite = sessionCookieSamesite;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If set, http session cookie will use 'secure' attribute.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return sessionCookieSecure
     */
    public Boolean getSessionCookieSecure() {
        return sessionCookieSecure;
    }

    /**
     * This is the setter method to the attribute.
     * If set, http session cookie will use 'secure' attribute.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param sessionCookieSecure set the sessionCookieSecure.
     */
    public void setSessionCookieSecure(Boolean  sessionCookieSecure) {
        this.sessionCookieSecure = sessionCookieSecure;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum allowed time between creating a session and the client coming back.
     * Value in seconds.
     * Allowed values are 120-3600.
     * Field introduced in 30.2.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 300.
     * @return sessionEstablishmentTimeout
     */
    public Integer getSessionEstablishmentTimeout() {
        return sessionEstablishmentTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum allowed time between creating a session and the client coming back.
     * Value in seconds.
     * Allowed values are 120-3600.
     * Field introduced in 30.2.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 300.
     * @param sessionEstablishmentTimeout set the sessionEstablishmentTimeout.
     */
    public void setSessionEstablishmentTimeout(Integer  sessionEstablishmentTimeout) {
        this.sessionEstablishmentTimeout = sessionEstablishmentTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum allowed time to expire the session after establishment on client inactivity.
     * Value in seconds.
     * Allowed values are 120-604800.
     * Field introduced in 30.2.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1800.
     * @return sessionIdleTimeout
     */
    public Integer getSessionIdleTimeout() {
        return sessionIdleTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum allowed time to expire the session after establishment on client inactivity.
     * Value in seconds.
     * Allowed values are 120-604800.
     * Field introduced in 30.2.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1800.
     * @param sessionIdleTimeout set the sessionIdleTimeout.
     */
    public void setSessionIdleTimeout(Integer  sessionIdleTimeout) {
        this.sessionIdleTimeout = sessionIdleTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum allowed time to expire the session, even if it is still active.
     * Value in seconds.
     * Allowed values are 120-604800.
     * Field introduced in 30.2.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 28800.
     * @return sessionMaximumTimeout
     */
    public Integer getSessionMaximumTimeout() {
        return sessionMaximumTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum allowed time to expire the session, even if it is still active.
     * Value in seconds.
     * Allowed values are 120-604800.
     * Field introduced in 30.2.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 28800.
     * @param sessionMaximumTimeout set the sessionMaximumTimeout.
     */
    public void setSessionMaximumTimeout(Integer  sessionMaximumTimeout) {
        this.sessionMaximumTimeout = sessionMaximumTimeout;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      HTTPSessionConfig objHTTPSessionConfig = (HTTPSessionConfig) o;
      return   Objects.equals(this.sessionCookieName, objHTTPSessionConfig.sessionCookieName)&&
  Objects.equals(this.sessionCookieSamesite, objHTTPSessionConfig.sessionCookieSamesite)&&
  Objects.equals(this.sessionCookieSecure, objHTTPSessionConfig.sessionCookieSecure)&&
  Objects.equals(this.sessionCookieHttponly, objHTTPSessionConfig.sessionCookieHttponly)&&
  Objects.equals(this.sessionEstablishmentTimeout, objHTTPSessionConfig.sessionEstablishmentTimeout)&&
  Objects.equals(this.sessionIdleTimeout, objHTTPSessionConfig.sessionIdleTimeout)&&
  Objects.equals(this.sessionMaximumTimeout, objHTTPSessionConfig.sessionMaximumTimeout);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HTTPSessionConfig {\n");
                  sb.append("    sessionCookieHttponly: ").append(toIndentedString(sessionCookieHttponly)).append("\n");
                        sb.append("    sessionCookieName: ").append(toIndentedString(sessionCookieName)).append("\n");
                        sb.append("    sessionCookieSamesite: ").append(toIndentedString(sessionCookieSamesite)).append("\n");
                        sb.append("    sessionCookieSecure: ").append(toIndentedString(sessionCookieSecure)).append("\n");
                        sb.append("    sessionEstablishmentTimeout: ").append(toIndentedString(sessionEstablishmentTimeout)).append("\n");
                        sb.append("    sessionIdleTimeout: ").append(toIndentedString(sessionIdleTimeout)).append("\n");
                        sb.append("    sessionMaximumTimeout: ").append(toIndentedString(sessionMaximumTimeout)).append("\n");
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

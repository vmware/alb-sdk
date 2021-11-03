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
 * The OauthLog is a POJO class extends AviRestResource that used for creating
 * OauthLog.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OauthLog  {
    @JsonProperty("authn_rule_match")
    private AuthnRuleMatch authnRuleMatch = null;

    @JsonProperty("authz_rule_match")
    private AuthzRuleMatch authzRuleMatch = null;

    @JsonProperty("is_session_cookie_expired")
    private Boolean isSessionCookieExpired = null;

    @JsonProperty("jwks_subrequest")
    private OauthSubRequestLog jwksSubrequest = null;

    @JsonProperty("oauth_state")
    private String oauthState = null;

    @JsonProperty("state")
    private String state = null;

    @JsonProperty("token_exchange_subrequest")
    private OauthSubRequestLog tokenExchangeSubrequest = null;

    @JsonProperty("token_introspection_subrequest")
    private OauthSubRequestLog tokenIntrospectionSubrequest = null;

    @JsonProperty("token_refresh_subrequest")
    private OauthSubRequestLog tokenRefreshSubrequest = null;



    /**
     * This is the getter method this will return the attribute value.
     * Authentication policy rule match.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return authnRuleMatch
     */
    public AuthnRuleMatch getAuthnRuleMatch() {
        return authnRuleMatch;
    }

    /**
     * This is the setter method to the attribute.
     * Authentication policy rule match.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param authnRuleMatch set the authnRuleMatch.
     */
    public void setAuthnRuleMatch(AuthnRuleMatch authnRuleMatch) {
        this.authnRuleMatch = authnRuleMatch;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Authorization policy rule match.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return authzRuleMatch
     */
    public AuthzRuleMatch getAuthzRuleMatch() {
        return authzRuleMatch;
    }

    /**
     * This is the setter method to the attribute.
     * Authorization policy rule match.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param authzRuleMatch set the authzRuleMatch.
     */
    public void setAuthzRuleMatch(AuthzRuleMatch authzRuleMatch) {
        this.authzRuleMatch = authzRuleMatch;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Oauth sessioncookie expired.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return isSessionCookieExpired
     */
    public Boolean getIsSessionCookieExpired() {
        return isSessionCookieExpired;
    }

    /**
     * This is the setter method to the attribute.
     * Oauth sessioncookie expired.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param isSessionCookieExpired set the isSessionCookieExpired.
     */
    public void setIsSessionCookieExpired(Boolean  isSessionCookieExpired) {
        this.isSessionCookieExpired = isSessionCookieExpired;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Subrequest info related to fetching jwks keys from jwks uri endpoint.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return jwksSubrequest
     */
    public OauthSubRequestLog getJwksSubrequest() {
        return jwksSubrequest;
    }

    /**
     * This is the setter method to the attribute.
     * Subrequest info related to fetching jwks keys from jwks uri endpoint.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param jwksSubrequest set the jwksSubrequest.
     */
    public void setJwksSubrequest(OauthSubRequestLog jwksSubrequest) {
        this.jwksSubrequest = jwksSubrequest;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Oauth state.
     * Enum options - OAUTH_STATE_CLIENT_IDP_HANDSHAKE_REDIRECT, OAUTH_STATE_CLIENT_IDP_HANDSHAKE_FAIL, OAUTH_STATE_TOKEN_EXCHANGE_REQUEST,
     * OAUTH_STATE_TOKEN_EXCHANGE_RESPONSE, OAUTH_STATE_TOKEN_INTROSPECTION_REQUEST, OAUTH_STATE_TOKEN_INTROSPECTION_RESPONSE,
     * OAUTH_STATE_REFRESH_TOKEN_REQUEST, OAUTH_STATE_REFRESH_TOKEN_RESPONSE, OAUTH_STATE_JWKS_URI_REQUEST, OAUTH_STATE_JWKS_URI_RESPONSE,
     * OAUTH_STATE_USERINFO_REQUEST, OAUTH_STATE_USERINFO_RESPONSE.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return oauthState
     */
    public String getOauthState() {
        return oauthState;
    }

    /**
     * This is the setter method to the attribute.
     * Oauth state.
     * Enum options - OAUTH_STATE_CLIENT_IDP_HANDSHAKE_REDIRECT, OAUTH_STATE_CLIENT_IDP_HANDSHAKE_FAIL, OAUTH_STATE_TOKEN_EXCHANGE_REQUEST,
     * OAUTH_STATE_TOKEN_EXCHANGE_RESPONSE, OAUTH_STATE_TOKEN_INTROSPECTION_REQUEST, OAUTH_STATE_TOKEN_INTROSPECTION_RESPONSE,
     * OAUTH_STATE_REFRESH_TOKEN_REQUEST, OAUTH_STATE_REFRESH_TOKEN_RESPONSE, OAUTH_STATE_JWKS_URI_REQUEST, OAUTH_STATE_JWKS_URI_RESPONSE,
     * OAUTH_STATE_USERINFO_REQUEST, OAUTH_STATE_USERINFO_RESPONSE.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param oauthState set the oauthState.
     */
    public void setOauthState(String  oauthState) {
        this.oauthState = oauthState;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Oauth request state to avoid csrf atatcks.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * This is the setter method to the attribute.
     * Oauth request state to avoid csrf atatcks.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param state set the state.
     */
    public void setState(String  state) {
        this.state = state;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Subrequest info related to the code exchange flow.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tokenExchangeSubrequest
     */
    public OauthSubRequestLog getTokenExchangeSubrequest() {
        return tokenExchangeSubrequest;
    }

    /**
     * This is the setter method to the attribute.
     * Subrequest info related to the code exchange flow.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tokenExchangeSubrequest set the tokenExchangeSubrequest.
     */
    public void setTokenExchangeSubrequest(OauthSubRequestLog tokenExchangeSubrequest) {
        this.tokenExchangeSubrequest = tokenExchangeSubrequest;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Subrequest info related to token introspection.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tokenIntrospectionSubrequest
     */
    public OauthSubRequestLog getTokenIntrospectionSubrequest() {
        return tokenIntrospectionSubrequest;
    }

    /**
     * This is the setter method to the attribute.
     * Subrequest info related to token introspection.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tokenIntrospectionSubrequest set the tokenIntrospectionSubrequest.
     */
    public void setTokenIntrospectionSubrequest(OauthSubRequestLog tokenIntrospectionSubrequest) {
        this.tokenIntrospectionSubrequest = tokenIntrospectionSubrequest;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Subrequest info related to refresh access token flow.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tokenRefreshSubrequest
     */
    public OauthSubRequestLog getTokenRefreshSubrequest() {
        return tokenRefreshSubrequest;
    }

    /**
     * This is the setter method to the attribute.
     * Subrequest info related to refresh access token flow.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tokenRefreshSubrequest set the tokenRefreshSubrequest.
     */
    public void setTokenRefreshSubrequest(OauthSubRequestLog tokenRefreshSubrequest) {
        this.tokenRefreshSubrequest = tokenRefreshSubrequest;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      OauthLog objOauthLog = (OauthLog) o;
      return   Objects.equals(this.tokenExchangeSubrequest, objOauthLog.tokenExchangeSubrequest)&&
  Objects.equals(this.tokenIntrospectionSubrequest, objOauthLog.tokenIntrospectionSubrequest)&&
  Objects.equals(this.tokenRefreshSubrequest, objOauthLog.tokenRefreshSubrequest)&&
  Objects.equals(this.jwksSubrequest, objOauthLog.jwksSubrequest)&&
  Objects.equals(this.oauthState, objOauthLog.oauthState)&&
  Objects.equals(this.isSessionCookieExpired, objOauthLog.isSessionCookieExpired)&&
  Objects.equals(this.authnRuleMatch, objOauthLog.authnRuleMatch)&&
  Objects.equals(this.authzRuleMatch, objOauthLog.authzRuleMatch)&&
  Objects.equals(this.state, objOauthLog.state);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OauthLog {\n");
                  sb.append("    authnRuleMatch: ").append(toIndentedString(authnRuleMatch)).append("\n");
                        sb.append("    authzRuleMatch: ").append(toIndentedString(authzRuleMatch)).append("\n");
                        sb.append("    isSessionCookieExpired: ").append(toIndentedString(isSessionCookieExpired)).append("\n");
                        sb.append("    jwksSubrequest: ").append(toIndentedString(jwksSubrequest)).append("\n");
                        sb.append("    oauthState: ").append(toIndentedString(oauthState)).append("\n");
                        sb.append("    state: ").append(toIndentedString(state)).append("\n");
                        sb.append("    tokenExchangeSubrequest: ").append(toIndentedString(tokenExchangeSubrequest)).append("\n");
                        sb.append("    tokenIntrospectionSubrequest: ").append(toIndentedString(tokenIntrospectionSubrequest)).append("\n");
                        sb.append("    tokenRefreshSubrequest: ").append(toIndentedString(tokenRefreshSubrequest)).append("\n");
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

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
 * The OAuthProfile is a POJO class extends AviRestResource that used for creating
 * OAuthProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OAuthProfile  {
    @JsonProperty("authorization_endpoint")
    private String authorizationEndpoint = null;

    @JsonProperty("introspection_endpoint")
    private String introspectionEndpoint = null;

    @JsonProperty("issuer")
    private String issuer = null;

    @JsonProperty("jwks_timeout")
    private Integer jwksTimeout = null;

    @JsonProperty("jwks_uri")
    private String jwksUri = null;

    @JsonProperty("oauth_resp_buffer_sz")
    private Integer oauthRespBufferSz = 102400;

    @JsonProperty("pool_ref")
    private String poolRef = null;

    @JsonProperty("token_endpoint")
    private String tokenEndpoint = null;

    @JsonProperty("userinfo_endpoint")
    private String userinfoEndpoint = null;



    /**
     * This is the getter method this will return the attribute value.
     * Url of authorization server.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return authorizationEndpoint
     */
    public String getAuthorizationEndpoint() {
        return authorizationEndpoint;
    }

    /**
     * This is the setter method to the attribute.
     * Url of authorization server.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param authorizationEndpoint set the authorizationEndpoint.
     */
    public void setAuthorizationEndpoint(String  authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Url of token introspection server.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return introspectionEndpoint
     */
    public String getIntrospectionEndpoint() {
        return introspectionEndpoint;
    }

    /**
     * This is the setter method to the attribute.
     * Url of token introspection server.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param introspectionEndpoint set the introspectionEndpoint.
     */
    public void setIntrospectionEndpoint(String  introspectionEndpoint) {
        this.introspectionEndpoint = introspectionEndpoint;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uniquely identifiable name of the token issuer.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return issuer
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * This is the setter method to the attribute.
     * Uniquely identifiable name of the token issuer.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param issuer set the issuer.
     */
    public void setIssuer(String  issuer) {
        this.issuer = issuer;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Lifetime of the cached jwks keys.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return jwksTimeout
     */
    public Integer getJwksTimeout() {
        return jwksTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Lifetime of the cached jwks keys.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param jwksTimeout set the jwksTimeout.
     */
    public void setJwksTimeout(Integer  jwksTimeout) {
        this.jwksTimeout = jwksTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Jwks url of the endpoint that hosts the public keys that can be used to verify any jwt issued by the authorization server.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return jwksUri
     */
    public String getJwksUri() {
        return jwksUri;
    }

    /**
     * This is the setter method to the attribute.
     * Jwks url of the endpoint that hosts the public keys that can be used to verify any jwt issued by the authorization server.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param jwksUri set the jwksUri.
     */
    public void setJwksUri(String  jwksUri) {
        this.jwksUri = jwksUri;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Buffering size for the responses from the oauth enpoints.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as 102400.
     * @return oauthRespBufferSz
     */
    public Integer getOauthRespBufferSz() {
        return oauthRespBufferSz;
    }

    /**
     * This is the setter method to the attribute.
     * Buffering size for the responses from the oauth enpoints.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as 102400.
     * @param oauthRespBufferSz set the oauthRespBufferSz.
     */
    public void setOauthRespBufferSz(Integer  oauthRespBufferSz) {
        this.oauthRespBufferSz = oauthRespBufferSz;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Pool object to interface with authorization server endpoints.
     * It is a reference to an object of type pool.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolRef
     */
    public String getPoolRef() {
        return poolRef;
    }

    /**
     * This is the setter method to the attribute.
     * Pool object to interface with authorization server endpoints.
     * It is a reference to an object of type pool.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolRef set the poolRef.
     */
    public void setPoolRef(String  poolRef) {
        this.poolRef = poolRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Url of token exchange server.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tokenEndpoint
     */
    public String getTokenEndpoint() {
        return tokenEndpoint;
    }

    /**
     * This is the setter method to the attribute.
     * Url of token exchange server.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tokenEndpoint set the tokenEndpoint.
     */
    public void setTokenEndpoint(String  tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Url of the userinfo endpoint.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return userinfoEndpoint
     */
    public String getUserinfoEndpoint() {
        return userinfoEndpoint;
    }

    /**
     * This is the setter method to the attribute.
     * Url of the userinfo endpoint.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param userinfoEndpoint set the userinfoEndpoint.
     */
    public void setUserinfoEndpoint(String  userinfoEndpoint) {
        this.userinfoEndpoint = userinfoEndpoint;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      OAuthProfile objOAuthProfile = (OAuthProfile) o;
      return   Objects.equals(this.authorizationEndpoint, objOAuthProfile.authorizationEndpoint)&&
  Objects.equals(this.tokenEndpoint, objOAuthProfile.tokenEndpoint)&&
  Objects.equals(this.introspectionEndpoint, objOAuthProfile.introspectionEndpoint)&&
  Objects.equals(this.jwksUri, objOAuthProfile.jwksUri)&&
  Objects.equals(this.jwksTimeout, objOAuthProfile.jwksTimeout)&&
  Objects.equals(this.issuer, objOAuthProfile.issuer)&&
  Objects.equals(this.poolRef, objOAuthProfile.poolRef)&&
  Objects.equals(this.oauthRespBufferSz, objOAuthProfile.oauthRespBufferSz)&&
  Objects.equals(this.userinfoEndpoint, objOAuthProfile.userinfoEndpoint);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OAuthProfile {\n");
                  sb.append("    authorizationEndpoint: ").append(toIndentedString(authorizationEndpoint)).append("\n");
                        sb.append("    introspectionEndpoint: ").append(toIndentedString(introspectionEndpoint)).append("\n");
                        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
                        sb.append("    jwksTimeout: ").append(toIndentedString(jwksTimeout)).append("\n");
                        sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
                        sb.append("    oauthRespBufferSz: ").append(toIndentedString(oauthRespBufferSz)).append("\n");
                        sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
                        sb.append("    tokenEndpoint: ").append(toIndentedString(tokenEndpoint)).append("\n");
                        sb.append("    userinfoEndpoint: ").append(toIndentedString(userinfoEndpoint)).append("\n");
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

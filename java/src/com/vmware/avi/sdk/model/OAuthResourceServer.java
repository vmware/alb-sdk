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
 * The OAuthResourceServer is a POJO class extends AviRestResource that used for creating
 * OAuthResourceServer.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OAuthResourceServer  {
    @JsonProperty("access_type")
    private String accessType = "ACCESS_TOKEN_TYPE_JWT";

    @JsonProperty("jwt_params")
    private JWTValidationParams jwtParams = null;

    @JsonProperty("opaque_token_params")
    private OpaqueTokenValidationParams opaqueTokenParams = null;



    /**
     * This is the getter method this will return the attribute value.
     * Access token type.
     * Enum options - ACCESS_TOKEN_TYPE_JWT, ACCESS_TOKEN_TYPE_OPAQUE.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as "ACCESS_TOKEN_TYPE_JWT".
     * @return accessType
     */
    public String getAccessType() {
        return accessType;
    }

    /**
     * This is the setter method to the attribute.
     * Access token type.
     * Enum options - ACCESS_TOKEN_TYPE_JWT, ACCESS_TOKEN_TYPE_OPAQUE.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as "ACCESS_TOKEN_TYPE_JWT".
     * @param accessType set the accessType.
     */
    public void setAccessType(String  accessType) {
        this.accessType = accessType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Validation parameters to be used when access token type is jwt.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return jwtParams
     */
    public JWTValidationParams getJwtParams() {
        return jwtParams;
    }

    /**
     * This is the setter method to the attribute.
     * Validation parameters to be used when access token type is jwt.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param jwtParams set the jwtParams.
     */
    public void setJwtParams(JWTValidationParams jwtParams) {
        this.jwtParams = jwtParams;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Validation parameters to be used when access token type is opaque.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return opaqueTokenParams
     */
    public OpaqueTokenValidationParams getOpaqueTokenParams() {
        return opaqueTokenParams;
    }

    /**
     * This is the setter method to the attribute.
     * Validation parameters to be used when access token type is opaque.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param opaqueTokenParams set the opaqueTokenParams.
     */
    public void setOpaqueTokenParams(OpaqueTokenValidationParams opaqueTokenParams) {
        this.opaqueTokenParams = opaqueTokenParams;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      OAuthResourceServer objOAuthResourceServer = (OAuthResourceServer) o;
      return   Objects.equals(this.accessType, objOAuthResourceServer.accessType)&&
  Objects.equals(this.opaqueTokenParams, objOAuthResourceServer.opaqueTokenParams)&&
  Objects.equals(this.jwtParams, objOAuthResourceServer.jwtParams);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OAuthResourceServer {\n");
                  sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
                        sb.append("    jwtParams: ").append(toIndentedString(jwtParams)).append("\n");
                        sb.append("    opaqueTokenParams: ").append(toIndentedString(opaqueTokenParams)).append("\n");
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

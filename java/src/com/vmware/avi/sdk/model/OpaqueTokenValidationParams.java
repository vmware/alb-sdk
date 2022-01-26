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
 * The OpaqueTokenValidationParams is a POJO class extends AviRestResource that used for creating
 * OpaqueTokenValidationParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OpaqueTokenValidationParams  {
    @JsonProperty("server_id")
    private String serverId = null;

    @JsonProperty("server_secret")
    private String serverSecret = null;



    /**
     * This is the getter method this will return the attribute value.
     * Resource server specific identifier used to validate against introspection endpoint when access token is opaque.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * This is the setter method to the attribute.
     * Resource server specific identifier used to validate against introspection endpoint when access token is opaque.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverId set the serverId.
     */
    public void setServerId(String  serverId) {
        this.serverId = serverId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Resource server specific password/secret.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverSecret
     */
    public String getServerSecret() {
        return serverSecret;
    }

    /**
     * This is the setter method to the attribute.
     * Resource server specific password/secret.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverSecret set the serverSecret.
     */
    public void setServerSecret(String  serverSecret) {
        this.serverSecret = serverSecret;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      OpaqueTokenValidationParams objOpaqueTokenValidationParams = (OpaqueTokenValidationParams) o;
      return   Objects.equals(this.serverId, objOpaqueTokenValidationParams.serverId)&&
  Objects.equals(this.serverSecret, objOpaqueTokenValidationParams.serverSecret);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OpaqueTokenValidationParams {\n");
                  sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
                        sb.append("    serverSecret: ").append(toIndentedString(serverSecret)).append("\n");
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

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
 * The MsgLbApplicationServiceTransactionBindingProfile is a POJO class extends AviRestResource that used for creating
 * MsgLbApplicationServiceTransactionBindingProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MsgLbApplicationServiceTransactionBindingProfile  {
    @JsonProperty("session_unbind_on_response")
    private Boolean sessionUnbindOnResponse = false;

    @JsonProperty("session_unbind_timeout")
    private Integer sessionUnbindTimeout = 120000;



    /**
     * This is the getter method this will return the attribute value.
     * When true, a transactional session binding is freed as soon as its matching response is received.
     * When false, the binding persists as a route-cache entry and is cleaned up after session_unbind_timeout milliseconds of inactivity.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return sessionUnbindOnResponse
     */
    public Boolean getSessionUnbindOnResponse() {
        return sessionUnbindOnResponse;
    }

    /**
     * This is the setter method to the attribute.
     * When true, a transactional session binding is freed as soon as its matching response is received.
     * When false, the binding persists as a route-cache entry and is cleaned up after session_unbind_timeout milliseconds of inactivity.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param sessionUnbindOnResponse set the sessionUnbindOnResponse.
     */
    public void setSessionUnbindOnResponse(Boolean  sessionUnbindOnResponse) {
        this.sessionUnbindOnResponse = sessionUnbindOnResponse;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time in milliseconds a transactional session binding waits in idle state before it is torn down.
     * Default 120000 ms.
     * Allowed values are 1-3600000.
     * Field introduced in 32.1.5.
     * Unit is milliseconds.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 120000.
     * @return sessionUnbindTimeout
     */
    public Integer getSessionUnbindTimeout() {
        return sessionUnbindTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Time in milliseconds a transactional session binding waits in idle state before it is torn down.
     * Default 120000 ms.
     * Allowed values are 1-3600000.
     * Field introduced in 32.1.5.
     * Unit is milliseconds.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 120000.
     * @param sessionUnbindTimeout set the sessionUnbindTimeout.
     */
    public void setSessionUnbindTimeout(Integer  sessionUnbindTimeout) {
        this.sessionUnbindTimeout = sessionUnbindTimeout;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      MsgLbApplicationServiceTransactionBindingProfile objMsgLbApplicationServiceTransactionBindingProfile = (MsgLbApplicationServiceTransactionBindingProfile) o;
      return   Objects.equals(this.sessionUnbindTimeout, objMsgLbApplicationServiceTransactionBindingProfile.sessionUnbindTimeout)&&
  Objects.equals(this.sessionUnbindOnResponse, objMsgLbApplicationServiceTransactionBindingProfile.sessionUnbindOnResponse);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MsgLbApplicationServiceTransactionBindingProfile {\n");
                  sb.append("    sessionUnbindOnResponse: ").append(toIndentedString(sessionUnbindOnResponse)).append("\n");
                        sb.append("    sessionUnbindTimeout: ").append(toIndentedString(sessionUnbindTimeout)).append("\n");
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

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
 * The HealthMonitorSctp is a POJO class extends AviRestResource that used for creating
 * HealthMonitorSctp.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HealthMonitorSctp  {
    @JsonProperty("sctp_request")
    private String sctpRequest;

    @JsonProperty("sctp_response")
    private String sctpResponse;



    /**
     * This is the getter method this will return the attribute value.
     * Request data to send after completing the sctp handshake.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sctpRequest
     */
    public String getSctpRequest() {
        return sctpRequest;
    }

    /**
     * This is the setter method to the attribute.
     * Request data to send after completing the sctp handshake.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sctpRequest set the sctpRequest.
     */
    public void setSctpRequest(String  sctpRequest) {
        this.sctpRequest = sctpRequest;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Match for the desired keyword in the first 2kb of the server's sctp response.
     * If this field is left blank, no server response is required.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sctpResponse
     */
    public String getSctpResponse() {
        return sctpResponse;
    }

    /**
     * This is the setter method to the attribute.
     * Match for the desired keyword in the first 2kb of the server's sctp response.
     * If this field is left blank, no server response is required.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sctpResponse set the sctpResponse.
     */
    public void setSctpResponse(String  sctpResponse) {
        this.sctpResponse = sctpResponse;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      HealthMonitorSctp objHealthMonitorSctp = (HealthMonitorSctp) o;
      return   Objects.equals(this.sctpRequest, objHealthMonitorSctp.sctpRequest)&&
  Objects.equals(this.sctpResponse, objHealthMonitorSctp.sctpResponse);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HealthMonitorSctp {\n");
                  sb.append("    sctpRequest: ").append(toIndentedString(sctpRequest)).append("\n");
                        sb.append("    sctpResponse: ").append(toIndentedString(sctpResponse)).append("\n");
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

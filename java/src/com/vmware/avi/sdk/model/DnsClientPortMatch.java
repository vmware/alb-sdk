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
 * The DnsClientPortMatch is a POJO class extends AviRestResource that used for creating
 * DnsClientPortMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DnsClientPortMatch  {
    @JsonProperty("client_ports")
    private PortMatchGeneric clientPorts = null;



    /**
     * This is the getter method this will return the attribute value.
     * Port number to match against client port number in request.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientPorts
     */
    public PortMatchGeneric getClientPorts() {
        return clientPorts;
    }

    /**
     * This is the setter method to the attribute.
     * Port number to match against client port number in request.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientPorts set the clientPorts.
     */
    public void setClientPorts(PortMatchGeneric clientPorts) {
        this.clientPorts = clientPorts;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DnsClientPortMatch objDnsClientPortMatch = (DnsClientPortMatch) o;
      return   Objects.equals(this.clientPorts, objDnsClientPortMatch.clientPorts);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DnsClientPortMatch {\n");
                  sb.append("    clientPorts: ").append(toIndentedString(clientPorts)).append("\n");
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

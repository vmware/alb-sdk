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
 * The SCTPFastPathProfile is a POJO class extends AviRestResource that used for creating
 * SCTPFastPathProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SCTPFastPathProfile  {
    @JsonProperty("enable_init_chunk_protection")
    private Boolean enableInitChunkProtection = false;

    @JsonProperty("idle_timeout")
    private Integer idleTimeout = 0;



    /**
     * This is the getter method this will return the attribute value.
     * When enabled, avi will complete the 4-way handshake with the client before forwarding any packets to the server.
     * This will protect the server from init chunks flood and half open connections.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableInitChunkProtection
     */
    public Boolean getEnableInitChunkProtection() {
        return enableInitChunkProtection;
    }

    /**
     * This is the setter method to the attribute.
     * When enabled, avi will complete the 4-way handshake with the client before forwarding any packets to the server.
     * This will protect the server from init chunks flood and half open connections.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableInitChunkProtection set the enableInitChunkProtection.
     */
    public void setEnableInitChunkProtection(Boolean  enableInitChunkProtection) {
        this.enableInitChunkProtection = enableInitChunkProtection;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Sctp autoclose timeout.
     * 0 means autoclose deactivated.
     * Allowed values are 0-247483647.
     * Field introduced in 22.1.3.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return idleTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Sctp autoclose timeout.
     * 0 means autoclose deactivated.
     * Allowed values are 0-247483647.
     * Field introduced in 22.1.3.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param idleTimeout set the idleTimeout.
     */
    public void setIdleTimeout(Integer  idleTimeout) {
        this.idleTimeout = idleTimeout;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SCTPFastPathProfile objSCTPFastPathProfile = (SCTPFastPathProfile) o;
      return   Objects.equals(this.idleTimeout, objSCTPFastPathProfile.idleTimeout)&&
  Objects.equals(this.enableInitChunkProtection, objSCTPFastPathProfile.enableInitChunkProtection);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SCTPFastPathProfile {\n");
                  sb.append("    enableInitChunkProtection: ").append(toIndentedString(enableInitChunkProtection)).append("\n");
                        sb.append("    idleTimeout: ").append(toIndentedString(idleTimeout)).append("\n");
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

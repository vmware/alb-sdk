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
 * The MsgLbConnPoolConfig is a POJO class extends AviRestResource that used for creating
 * MsgLbConnPoolConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MsgLbConnPoolConfig  {
    @JsonProperty("idle_timeout_ms")
    private Integer idleTimeoutMs = 0;

    @JsonProperty("max_tcp_conn_per_server")
    private Integer maxTcpConnPerServer = 0;



    /**
     * This is the getter method this will return the attribute value.
     * Idle timeout for pooled server sockets used by l4 message-level lb.
     * Allowed values are 1000-86400000.
     * Special values are 0 - disable.
     * Field introduced in 32.1.5.
     * Unit is milliseconds.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return idleTimeoutMs
     */
    public Integer getIdleTimeoutMs() {
        return idleTimeoutMs;
    }

    /**
     * This is the setter method to the attribute.
     * Idle timeout for pooled server sockets used by l4 message-level lb.
     * Allowed values are 1000-86400000.
     * Special values are 0 - disable.
     * Field introduced in 32.1.5.
     * Unit is milliseconds.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param idleTimeoutMs set the idleTimeoutMs.
     */
    public void setIdleTimeoutMs(Integer  idleTimeoutMs) {
        this.idleTimeoutMs = idleTimeoutMs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Cap on concurrent server tcp connections per core for l4 message-level lb.
     * 0 = unlimited; valid limit range is 1-65535.
     * Allowed values are 0-65535.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return maxTcpConnPerServer
     */
    public Integer getMaxTcpConnPerServer() {
        return maxTcpConnPerServer;
    }

    /**
     * This is the setter method to the attribute.
     * Cap on concurrent server tcp connections per core for l4 message-level lb.
     * 0 = unlimited; valid limit range is 1-65535.
     * Allowed values are 0-65535.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param maxTcpConnPerServer set the maxTcpConnPerServer.
     */
    public void setMaxTcpConnPerServer(Integer  maxTcpConnPerServer) {
        this.maxTcpConnPerServer = maxTcpConnPerServer;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      MsgLbConnPoolConfig objMsgLbConnPoolConfig = (MsgLbConnPoolConfig) o;
      return   Objects.equals(this.maxTcpConnPerServer, objMsgLbConnPoolConfig.maxTcpConnPerServer)&&
  Objects.equals(this.idleTimeoutMs, objMsgLbConnPoolConfig.idleTimeoutMs);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MsgLbConnPoolConfig {\n");
                  sb.append("    idleTimeoutMs: ").append(toIndentedString(idleTimeoutMs)).append("\n");
                        sb.append("    maxTcpConnPerServer: ").append(toIndentedString(maxTcpConnPerServer)).append("\n");
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

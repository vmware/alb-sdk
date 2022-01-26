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
 * The HTTP2PoolProperties is a POJO class extends AviRestResource that used for creating
 * HTTP2PoolProperties.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HTTP2PoolProperties  {
    @JsonProperty("max_http2_control_frames_per_connection")
    private Integer maxHttp2ControlFramesPerConnection = 0;

    @JsonProperty("max_http2_header_field_size")
    private Integer maxHttp2HeaderFieldSize = 4096;



    /**
     * This is the getter method this will return the attribute value.
     * The max number of control frames that server can send over an http/2 connection.
     * '0' means unlimited.
     * Allowed values are 0-10000.
     * Special values are 0- unlimited control frames on a server side http/2 connection.
     * Field introduced in 21.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return maxHttp2ControlFramesPerConnection
     */
    public Integer getMaxHttp2ControlFramesPerConnection() {
        return maxHttp2ControlFramesPerConnection;
    }

    /**
     * This is the setter method to the attribute.
     * The max number of control frames that server can send over an http/2 connection.
     * '0' means unlimited.
     * Allowed values are 0-10000.
     * Special values are 0- unlimited control frames on a server side http/2 connection.
     * Field introduced in 21.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param maxHttp2ControlFramesPerConnection set the maxHttp2ControlFramesPerConnection.
     */
    public void setMaxHttp2ControlFramesPerConnection(Integer  maxHttp2ControlFramesPerConnection) {
        this.maxHttp2ControlFramesPerConnection = maxHttp2ControlFramesPerConnection;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The maximum size in bytes of the compressed request header field.
     * The limit applies equally to both name and value.
     * Allowed values are 1-8192.
     * Field introduced in 21.1.1.
     * Unit is bytes.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
     * @return maxHttp2HeaderFieldSize
     */
    public Integer getMaxHttp2HeaderFieldSize() {
        return maxHttp2HeaderFieldSize;
    }

    /**
     * This is the setter method to the attribute.
     * The maximum size in bytes of the compressed request header field.
     * The limit applies equally to both name and value.
     * Allowed values are 1-8192.
     * Field introduced in 21.1.1.
     * Unit is bytes.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
     * @param maxHttp2HeaderFieldSize set the maxHttp2HeaderFieldSize.
     */
    public void setMaxHttp2HeaderFieldSize(Integer  maxHttp2HeaderFieldSize) {
        this.maxHttp2HeaderFieldSize = maxHttp2HeaderFieldSize;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      HTTP2PoolProperties objHTTP2PoolProperties = (HTTP2PoolProperties) o;
      return   Objects.equals(this.maxHttp2ControlFramesPerConnection, objHTTP2PoolProperties.maxHttp2ControlFramesPerConnection)&&
  Objects.equals(this.maxHttp2HeaderFieldSize, objHTTP2PoolProperties.maxHttp2HeaderFieldSize);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HTTP2PoolProperties {\n");
                  sb.append("    maxHttp2ControlFramesPerConnection: ").append(toIndentedString(maxHttp2ControlFramesPerConnection)).append("\n");
                        sb.append("    maxHttp2HeaderFieldSize: ").append(toIndentedString(maxHttp2HeaderFieldSize)).append("\n");
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

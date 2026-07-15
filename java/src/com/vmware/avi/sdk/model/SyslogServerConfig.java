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
 * The SyslogServerConfig is a POJO class extends AviRestResource that used for creating
 * SyslogServerConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SyslogServerConfig  {
    @JsonProperty("format")
    private String format = "SYSLOG_LEGACY";

    @JsonProperty("port")
    private Integer port = 514;

    @JsonProperty("server")
    private IpAddr server;

    @JsonProperty("udp")
    private Boolean udp = true;



    /**
     * This is the getter method this will return the attribute value.
     * Syslog output format  syslog_legacy, syslog_rfc5424, syslog_json, or syslog_rfc5425_enhanced.
     * Enum options - SYSLOG_LEGACY, SYSLOG_RFC5424, SYSLOG_JSON, SYSLOG_RFC5425_ENHANCED.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SYSLOG_LEGACY".
     * @return format
     */
    public String getFormat() {
        return format;
    }

    /**
     * This is the setter method to the attribute.
     * Syslog output format  syslog_legacy, syslog_rfc5424, syslog_json, or syslog_rfc5425_enhanced.
     * Enum options - SYSLOG_LEGACY, SYSLOG_RFC5424, SYSLOG_JSON, SYSLOG_RFC5425_ENHANCED.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SYSLOG_LEGACY".
     * @param format set the format.
     */
    public void setFormat(String  format) {
        this.format = format;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The destination syslog server's service port.
     * Allowed values are 1-65535.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 514.
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    /**
     * This is the setter method to the attribute.
     * The destination syslog server's service port.
     * Allowed values are 1-65535.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 514.
     * @param port set the port.
     */
    public void setPort(Integer  port) {
        this.port = port;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ip address or fqdn of the syslog server.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return server
     */
    public IpAddr getServer() {
        return server;
    }

    /**
     * This is the setter method to the attribute.
     * Ip address or fqdn of the syslog server.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param server set the server.
     */
    public void setServer(IpAddr server) {
        this.server = server;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Udp transport (default true); set to false to use tcp.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return udp
     */
    public Boolean getUdp() {
        return udp;
    }

    /**
     * This is the setter method to the attribute.
     * Udp transport (default true); set to false to use tcp.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param udp set the udp.
     */
    public void setUdp(Boolean  udp) {
        this.udp = udp;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SyslogServerConfig objSyslogServerConfig = (SyslogServerConfig) o;
      return   Objects.equals(this.server, objSyslogServerConfig.server)&&
  Objects.equals(this.port, objSyslogServerConfig.port)&&
  Objects.equals(this.udp, objSyslogServerConfig.udp)&&
  Objects.equals(this.format, objSyslogServerConfig.format);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SyslogServerConfig {\n");
                  sb.append("    format: ").append(toIndentedString(format)).append("\n");
                        sb.append("    port: ").append(toIndentedString(port)).append("\n");
                        sb.append("    server: ").append(toIndentedString(server)).append("\n");
                        sb.append("    udp: ").append(toIndentedString(udp)).append("\n");
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

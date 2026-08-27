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
 * The AlertSyslogServer is a POJO class extends AviRestResource that used for creating
 * AlertSyslogServer.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertSyslogServer  {
    @JsonProperty("format")
    private String format = "SYSLOG_LEGACY";

    @JsonProperty("pkiprofile_ref")
    private String pkiprofileRef;

    @JsonProperty("syslog_server")
    private String syslogServer;

    @JsonProperty("syslog_server_port")
    private Integer syslogServerPort = 514;

    @JsonProperty("tls_config")
    private TlsConfig tlsConfig;

    @JsonProperty("tls_enable")
    private Boolean tlsEnable = false;

    @JsonProperty("udp")
    private Boolean udp = true;



    /**
     * This is the getter method this will return the attribute value.
     * Syslog output format - legacy, rfc 5424, json.
     * Enum options - SYSLOG_LEGACY, SYSLOG_RFC5424, SYSLOG_JSON, SYSLOG_RFC5425_ENHANCED.
     * Field introduced in 17.2.8.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SYSLOG_LEGACY".
     * @return format
     */
    public String getFormat() {
        return format;
    }

    /**
     * This is the setter method to the attribute.
     * Syslog output format - legacy, rfc 5424, json.
     * Enum options - SYSLOG_LEGACY, SYSLOG_RFC5424, SYSLOG_JSON, SYSLOG_RFC5425_ENHANCED.
     * Field introduced in 17.2.8.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SYSLOG_LEGACY".
     * @param format set the format.
     */
    public void setFormat(String  format) {
        this.format = format;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Select the pkiprofile containing a ca or list of ca chainswhich will validate the certificate of the syslog server.
     * When unset, systemconfiguration.truststore_pkiprofile_uuid is used instead.
     * It is a reference to an object of type pkiprofile.
     * Field introduced in 17.2.17, 18.2.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pkiprofileRef
     */
    public String getPkiprofileRef() {
        return pkiprofileRef;
    }

    /**
     * This is the setter method to the attribute.
     * Select the pkiprofile containing a ca or list of ca chainswhich will validate the certificate of the syslog server.
     * When unset, systemconfiguration.truststore_pkiprofile_uuid is used instead.
     * It is a reference to an object of type pkiprofile.
     * Field introduced in 17.2.17, 18.2.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param pkiprofileRef set the pkiprofileRef.
     */
    public void setPkiprofileRef(String  pkiprofileRef) {
        this.pkiprofileRef = pkiprofileRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The destination syslog server ip(v4/v6) address or fqdn.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return syslogServer
     */
    public String getSyslogServer() {
        return syslogServer;
    }

    /**
     * This is the setter method to the attribute.
     * The destination syslog server ip(v4/v6) address or fqdn.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param syslogServer set the syslogServer.
     */
    public void setSyslogServer(String  syslogServer) {
        this.syslogServer = syslogServer;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The destination syslog server's service port.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 514.
     * @return syslogServerPort
     */
    public Integer getSyslogServerPort() {
        return syslogServerPort;
    }

    /**
     * This is the setter method to the attribute.
     * The destination syslog server's service port.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 514.
     * @param syslogServerPort set the syslogServerPort.
     */
    public void setSyslogServerPort(Integer  syslogServerPort) {
        this.syslogServerPort = syslogServerPort;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tls mode and client certificate for the connection to this syslog server, effective only when tls_enable is set.
     * Supersedes ssl_key_and_certificate_uuid, anon_auth, and strict_cert_verify, which are deprecated in favor of this field.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tlsConfig
     */
    public TlsConfig getTlsConfig() {
        return tlsConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Tls mode and client certificate for the connection to this syslog server, effective only when tls_enable is set.
     * Supersedes ssl_key_and_certificate_uuid, anon_auth, and strict_cert_verify, which are deprecated in favor of this field.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tlsConfig set the tlsConfig.
     */
    public void setTlsConfig(TlsConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable tls to the syslog server.
     * Use tls_config to select the tls mode and client certificate.
     * Field introduced in 17.2.16, 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return tlsEnable
     */
    public Boolean getTlsEnable() {
        return tlsEnable;
    }

    /**
     * This is the setter method to the attribute.
     * Enable tls to the syslog server.
     * Use tls_config to select the tls mode and client certificate.
     * Field introduced in 17.2.16, 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param tlsEnable set the tlsEnable.
     */
    public void setTlsEnable(Boolean  tlsEnable) {
        this.tlsEnable = tlsEnable;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Network protocol to establish syslog session.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return udp
     */
    public Boolean getUdp() {
        return udp;
    }

    /**
     * This is the setter method to the attribute.
     * Network protocol to establish syslog session.
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
      AlertSyslogServer objAlertSyslogServer = (AlertSyslogServer) o;
      return   Objects.equals(this.syslogServer, objAlertSyslogServer.syslogServer)&&
  Objects.equals(this.syslogServerPort, objAlertSyslogServer.syslogServerPort)&&
  Objects.equals(this.udp, objAlertSyslogServer.udp)&&
  Objects.equals(this.format, objAlertSyslogServer.format)&&
  Objects.equals(this.tlsEnable, objAlertSyslogServer.tlsEnable)&&
  Objects.equals(this.pkiprofileRef, objAlertSyslogServer.pkiprofileRef)&&
  Objects.equals(this.tlsConfig, objAlertSyslogServer.tlsConfig);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AlertSyslogServer {\n");
                  sb.append("    format: ").append(toIndentedString(format)).append("\n");
                        sb.append("    pkiprofileRef: ").append(toIndentedString(pkiprofileRef)).append("\n");
                        sb.append("    syslogServer: ").append(toIndentedString(syslogServer)).append("\n");
                        sb.append("    syslogServerPort: ").append(toIndentedString(syslogServerPort)).append("\n");
                        sb.append("    tlsConfig: ").append(toIndentedString(tlsConfig)).append("\n");
                        sb.append("    tlsEnable: ").append(toIndentedString(tlsEnable)).append("\n");
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

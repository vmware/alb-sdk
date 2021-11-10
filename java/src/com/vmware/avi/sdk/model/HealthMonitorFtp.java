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
 * The HealthMonitorFtp is a POJO class extends AviRestResource that used for creating
 * HealthMonitorFtp.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HealthMonitorFtp  {
    @JsonProperty("filename")
    private String filename = null;

    @JsonProperty("mode")
    private String mode = "FTP_PASSIVE_MODE";

    @JsonProperty("ssl_attributes")
    private HealthMonitorSSLAttributes sslAttributes = null;



    /**
     * This is the getter method this will return the attribute value.
     * Filename to download with full path.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * This is the setter method to the attribute.
     * Filename to download with full path.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param filename set the filename.
     */
    public void setFilename(String  filename) {
        this.filename = filename;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ftp data transfer process mode.
     * Enum options - FTP_PASSIVE_MODE, FTP_PORT_MODE.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as "FTP_PASSIVE_MODE".
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * This is the setter method to the attribute.
     * Ftp data transfer process mode.
     * Enum options - FTP_PASSIVE_MODE, FTP_PORT_MODE.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as "FTP_PASSIVE_MODE".
     * @param mode set the mode.
     */
    public void setMode(String  mode) {
        this.mode = mode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ssl attributes for ftps monitor.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sslAttributes
     */
    public HealthMonitorSSLAttributes getSslAttributes() {
        return sslAttributes;
    }

    /**
     * This is the setter method to the attribute.
     * Ssl attributes for ftps monitor.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sslAttributes set the sslAttributes.
     */
    public void setSslAttributes(HealthMonitorSSLAttributes sslAttributes) {
        this.sslAttributes = sslAttributes;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      HealthMonitorFtp objHealthMonitorFtp = (HealthMonitorFtp) o;
      return   Objects.equals(this.filename, objHealthMonitorFtp.filename)&&
  Objects.equals(this.mode, objHealthMonitorFtp.mode)&&
  Objects.equals(this.sslAttributes, objHealthMonitorFtp.sslAttributes);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HealthMonitorFtp {\n");
                  sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
                        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
                        sb.append("    sslAttributes: ").append(toIndentedString(sslAttributes)).append("\n");
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

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
 * The TelemetryConfiguration is a POJO class extends AviRestResource that used for creating
 * TelemetryConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TelemetryConfiguration  {
    @JsonProperty("enable")
    private Boolean enable = true;

    @JsonProperty("url")
    private String url = "url";



    /**
     * This is the getter method this will return the attribute value.
     * Enables vmware customer experience improvement program ( ceip ).
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * This is the setter method to the attribute.
     * Enables vmware customer experience improvement program ( ceip ).
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param enable set the enable.
     */
    public void setEnable(Boolean  enable) {
        this.enable = enable;
    }
    /**
     * This is the getter method this will return the attribute value.
     * The fqdn or ip address of the telemetry server.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "https://telemetry.pulse.broadcom.com".
     * @return url
     */
    public String getUrl() {
        return url;
    }

   /**
    * This is the setter method. this will set the url
    * The fqdn or ip address of the telemetry server.
    * Field introduced in 31.1.1.
    * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
    * Default value when not specified in API or module is interpreted by Avi Controller as "https://telemetry.pulse.broadcom.com".
    * @return url
    */
   public void setUrl(String  url) {
     this.url = url;
   }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      TelemetryConfiguration objTelemetryConfiguration = (TelemetryConfiguration) o;
      return   Objects.equals(this.enable, objTelemetryConfiguration.enable);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class TelemetryConfiguration {\n");
                  sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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

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
 * The PulseServicesTenantConfig is a POJO class extends AviRestResource that used for creating
 * PulseServicesTenantConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PulseServicesTenantConfig  {
    @JsonProperty("heartbeat_interval")
    private Integer heartbeatInterval = null;

    @JsonProperty("license_escrow_interval")
    private Integer licenseEscrowInterval = null;

    @JsonProperty("token_refresh_interval")
    private Integer tokenRefreshInterval = null;



    /**
     * This is the getter method this will return the attribute value.
     * Heartbeat interval duration.
     * Field introduced in 30.2.1.
     * Unit is min.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return heartbeatInterval
     */
    public Integer getHeartbeatInterval() {
        return heartbeatInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Heartbeat interval duration.
     * Field introduced in 30.2.1.
     * Unit is min.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param heartbeatInterval set the heartbeatInterval.
     */
    public void setHeartbeatInterval(Integer  heartbeatInterval) {
        this.heartbeatInterval = heartbeatInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * License escrow interval duration.
     * Field introduced in 30.2.1.
     * Unit is min.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return licenseEscrowInterval
     */
    public Integer getLicenseEscrowInterval() {
        return licenseEscrowInterval;
    }

    /**
     * This is the setter method to the attribute.
     * License escrow interval duration.
     * Field introduced in 30.2.1.
     * Unit is min.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param licenseEscrowInterval set the licenseEscrowInterval.
     */
    public void setLicenseEscrowInterval(Integer  licenseEscrowInterval) {
        this.licenseEscrowInterval = licenseEscrowInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Token refresh interval duration.
     * Allowed values are 1-240.
     * Field introduced in 30.2.1.
     * Unit is min.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tokenRefreshInterval
     */
    public Integer getTokenRefreshInterval() {
        return tokenRefreshInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Token refresh interval duration.
     * Allowed values are 1-240.
     * Field introduced in 30.2.1.
     * Unit is min.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tokenRefreshInterval set the tokenRefreshInterval.
     */
    public void setTokenRefreshInterval(Integer  tokenRefreshInterval) {
        this.tokenRefreshInterval = tokenRefreshInterval;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      PulseServicesTenantConfig objPulseServicesTenantConfig = (PulseServicesTenantConfig) o;
      return   Objects.equals(this.heartbeatInterval, objPulseServicesTenantConfig.heartbeatInterval)&&
  Objects.equals(this.tokenRefreshInterval, objPulseServicesTenantConfig.tokenRefreshInterval)&&
  Objects.equals(this.licenseEscrowInterval, objPulseServicesTenantConfig.licenseEscrowInterval);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PulseServicesTenantConfig {\n");
                  sb.append("    heartbeatInterval: ").append(toIndentedString(heartbeatInterval)).append("\n");
                        sb.append("    licenseEscrowInterval: ").append(toIndentedString(licenseEscrowInterval)).append("\n");
                        sb.append("    tokenRefreshInterval: ").append(toIndentedString(tokenRefreshInterval)).append("\n");
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

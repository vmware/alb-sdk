/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */

package com.vmware.avi.sdk.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private Integer heartbeatInterval;

    @JsonIgnore
    private Integer licenseEscrowInterval;

    @JsonIgnore
    private Integer licenseExpiryInterval;

    @JsonIgnore
    private Integer licenseReconcileInterval;

    @JsonIgnore
    private Integer licenseRefreshInterval;

    @JsonIgnore
    private Integer licenseRenewalInterval;

    @JsonIgnore
    private Integer tokenRefreshInterval;



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
     * License expiry interval duration.
     * Allowed values are 1-1440.
     * Field introduced in 30.2.1.
     * Unit is min.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return licenseExpiryInterval
     */
    public Integer getLicenseExpiryInterval() {
        return licenseExpiryInterval;
    }

    /**
     * This is the setter method to the attribute.
     * License expiry interval duration.
     * Allowed values are 1-1440.
     * Field introduced in 30.2.1.
     * Unit is min.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param licenseExpiryInterval set the licenseExpiryInterval.
     */
    public void setLicenseExpiryInterval(Integer  licenseExpiryInterval) {
        this.licenseExpiryInterval = licenseExpiryInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * License reconcile interval duration.
     * Field introduced in 30.2.1.
     * Unit is min.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return licenseReconcileInterval
     */
    public Integer getLicenseReconcileInterval() {
        return licenseReconcileInterval;
    }

    /**
     * This is the setter method to the attribute.
     * License reconcile interval duration.
     * Field introduced in 30.2.1.
     * Unit is min.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param licenseReconcileInterval set the licenseReconcileInterval.
     */
    public void setLicenseReconcileInterval(Integer  licenseReconcileInterval) {
        this.licenseReconcileInterval = licenseReconcileInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * License refresh interval duration.
     * Field introduced in 30.2.1.
     * Unit is min.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return licenseRefreshInterval
     */
    public Integer getLicenseRefreshInterval() {
        return licenseRefreshInterval;
    }

    /**
     * This is the setter method to the attribute.
     * License refresh interval duration.
     * Field introduced in 30.2.1.
     * Unit is min.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param licenseRefreshInterval set the licenseRefreshInterval.
     */
    public void setLicenseRefreshInterval(Integer  licenseRefreshInterval) {
        this.licenseRefreshInterval = licenseRefreshInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * License renewal interval duration.
     * Allowed values are 1-1440.
     * Field introduced in 30.2.1.
     * Unit is min.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return licenseRenewalInterval
     */
    public Integer getLicenseRenewalInterval() {
        return licenseRenewalInterval;
    }

    /**
     * This is the setter method to the attribute.
     * License renewal interval duration.
     * Allowed values are 1-1440.
     * Field introduced in 30.2.1.
     * Unit is min.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param licenseRenewalInterval set the licenseRenewalInterval.
     */
    public void setLicenseRenewalInterval(Integer  licenseRenewalInterval) {
        this.licenseRenewalInterval = licenseRenewalInterval;
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
  Objects.equals(this.licenseEscrowInterval, objPulseServicesTenantConfig.licenseEscrowInterval)&&
  Objects.equals(this.licenseRefreshInterval, objPulseServicesTenantConfig.licenseRefreshInterval)&&
  Objects.equals(this.licenseExpiryInterval, objPulseServicesTenantConfig.licenseExpiryInterval)&&
  Objects.equals(this.licenseRenewalInterval, objPulseServicesTenantConfig.licenseRenewalInterval)&&
  Objects.equals(this.licenseReconcileInterval, objPulseServicesTenantConfig.licenseReconcileInterval);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PulseServicesTenantConfig {\n");
                  sb.append("    heartbeatInterval: ").append(toIndentedString(heartbeatInterval)).append("\n");
                        sb.append("    licenseEscrowInterval: ").append(toIndentedString(licenseEscrowInterval)).append("\n");
                        sb.append("    licenseExpiryInterval: ").append(toIndentedString(licenseExpiryInterval)).append("\n");
                        sb.append("    licenseReconcileInterval: ").append(toIndentedString(licenseReconcileInterval)).append("\n");
                        sb.append("    licenseRefreshInterval: ").append(toIndentedString(licenseRefreshInterval)).append("\n");
                        sb.append("    licenseRenewalInterval: ").append(toIndentedString(licenseRenewalInterval)).append("\n");
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

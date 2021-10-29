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
 * The PortalFeatureOptIn is a POJO class extends AviRestResource that used for creating
 * PortalFeatureOptIn.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PortalFeatureOptIn  {
    @JsonProperty("enable_appsignature_sync")
    private Boolean enableAppsignatureSync = false;

    @JsonProperty("enable_auto_case_creation_on_se_failure")
    private Boolean enableAutoCaseCreationOnSeFailure;

    @JsonProperty("enable_auto_case_creation_on_system_failure")
    private Boolean enableAutoCaseCreationOnSystemFailure;

    @JsonProperty("enable_auto_download_waf_signatures")
    private Boolean enableAutoDownloadWafSignatures;

    @JsonProperty("enable_ip_reputation")
    private Boolean enableIpReputation = false;

    @JsonProperty("enable_pulse_case_management")
    private Boolean enablePulseCaseManagement;

    @JsonProperty("enable_pulse_waf_management")
    private Boolean enablePulseWafManagement;

    @JsonProperty("enable_saas_licensing")
    private Boolean enableSaasLicensing = false;

    @JsonProperty("enable_user_agent_db_sync")
    private Boolean enableUserAgentDbSync = false;

    @JsonProperty("enable_waf_signatures_notifications")
    private Boolean enableWafSignaturesNotifications;



    /**
     * This is the getter method this will return the attribute value.
     * Enable to receive application specific signature updates.
     * Field introduced in 20.1.4.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableAppsignatureSync
     */
    public Boolean getEnableAppsignatureSync() {
        return enableAppsignatureSync;
    }

    /**
     * This is the setter method to the attribute.
     * Enable to receive application specific signature updates.
     * Field introduced in 20.1.4.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableAppsignatureSync set the enableAppsignatureSync.
     */
    public void setEnableAppsignatureSync(Boolean  enableAppsignatureSync) {
        this.enableAppsignatureSync = enableAppsignatureSync;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This field is deprecated.
     * Field deprecated in 21.1.1.
     * Field introduced in 20.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * @return enableAutoCaseCreationOnSeFailure
     */
    public Boolean getEnableAutoCaseCreationOnSeFailure() {
        return enableAutoCaseCreationOnSeFailure;
    }

    /**
     * This is the setter method to the attribute.
     * This field is deprecated.
     * Field deprecated in 21.1.1.
     * Field introduced in 20.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * @param enableAutoCaseCreationOnSeFailure set the enableAutoCaseCreationOnSeFailure.
     */
    public void setEnableAutoCaseCreationOnSeFailure(Boolean  enableAutoCaseCreationOnSeFailure) {
        this.enableAutoCaseCreationOnSeFailure = enableAutoCaseCreationOnSeFailure;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This field is deprecated.
     * Field deprecated in 21.1.1.
     * Field introduced in 20.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * @return enableAutoCaseCreationOnSystemFailure
     */
    public Boolean getEnableAutoCaseCreationOnSystemFailure() {
        return enableAutoCaseCreationOnSystemFailure;
    }

    /**
     * This is the setter method to the attribute.
     * This field is deprecated.
     * Field deprecated in 21.1.1.
     * Field introduced in 20.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * @param enableAutoCaseCreationOnSystemFailure set the enableAutoCaseCreationOnSystemFailure.
     */
    public void setEnableAutoCaseCreationOnSystemFailure(Boolean  enableAutoCaseCreationOnSystemFailure) {
        this.enableAutoCaseCreationOnSystemFailure = enableAutoCaseCreationOnSystemFailure;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This field is deprecated.
     * Field deprecated in 21.1.1.
     * Field introduced in 20.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * @return enableAutoDownloadWafSignatures
     */
    public Boolean getEnableAutoDownloadWafSignatures() {
        return enableAutoDownloadWafSignatures;
    }

    /**
     * This is the setter method to the attribute.
     * This field is deprecated.
     * Field deprecated in 21.1.1.
     * Field introduced in 20.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * @param enableAutoDownloadWafSignatures set the enableAutoDownloadWafSignatures.
     */
    public void setEnableAutoDownloadWafSignatures(Boolean  enableAutoDownloadWafSignatures) {
        this.enableAutoDownloadWafSignatures = enableAutoDownloadWafSignatures;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable to receive ip reputation updates.
     * Field introduced in 20.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableIpReputation
     */
    public Boolean getEnableIpReputation() {
        return enableIpReputation;
    }

    /**
     * This is the setter method to the attribute.
     * Enable to receive ip reputation updates.
     * Field introduced in 20.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableIpReputation set the enableIpReputation.
     */
    public void setEnableIpReputation(Boolean  enableIpReputation) {
        this.enableIpReputation = enableIpReputation;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable pulse case management.
     * Field introduced in 21.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * Special default for basic edition is false, essentials edition is false, enterprise is true.
     * @return enablePulseCaseManagement
     */
    public Boolean getEnablePulseCaseManagement() {
        return enablePulseCaseManagement;
    }

    /**
     * This is the setter method to the attribute.
     * Enable pulse case management.
     * Field introduced in 21.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * Special default for basic edition is false, essentials edition is false, enterprise is true.
     * @param enablePulseCaseManagement set the enablePulseCaseManagement.
     */
    public void setEnablePulseCaseManagement(Boolean  enablePulseCaseManagement) {
        this.enablePulseCaseManagement = enablePulseCaseManagement;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable to receive waf crs updates.
     * Field introduced in 21.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * Special default for basic edition is false, essentials edition is false, enterprise is true.
     * @return enablePulseWafManagement
     */
    public Boolean getEnablePulseWafManagement() {
        return enablePulseWafManagement;
    }

    /**
     * This is the setter method to the attribute.
     * Enable to receive waf crs updates.
     * Field introduced in 21.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * Special default for basic edition is false, essentials edition is false, enterprise is true.
     * @param enablePulseWafManagement set the enablePulseWafManagement.
     */
    public void setEnablePulseWafManagement(Boolean  enablePulseWafManagement) {
        this.enablePulseWafManagement = enablePulseWafManagement;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable saas licensing.
     * Field introduced in 21.1.3.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableSaasLicensing
     */
    public Boolean getEnableSaasLicensing() {
        return enableSaasLicensing;
    }

    /**
     * This is the setter method to the attribute.
     * Enable saas licensing.
     * Field introduced in 21.1.3.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableSaasLicensing set the enableSaasLicensing.
     */
    public void setEnableSaasLicensing(Boolean  enableSaasLicensing) {
        this.enableSaasLicensing = enableSaasLicensing;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable to receive bot management updates.
     * Field introduced in 21.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableUserAgentDbSync
     */
    public Boolean getEnableUserAgentDbSync() {
        return enableUserAgentDbSync;
    }

    /**
     * This is the setter method to the attribute.
     * Enable to receive bot management updates.
     * Field introduced in 21.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableUserAgentDbSync set the enableUserAgentDbSync.
     */
    public void setEnableUserAgentDbSync(Boolean  enableUserAgentDbSync) {
        this.enableUserAgentDbSync = enableUserAgentDbSync;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This field is deprecated.
     * Field deprecated in 21.1.1.
     * Field introduced in 20.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * Special default for basic edition is false, essentials edition is false.
     * @return enableWafSignaturesNotifications
     */
    public Boolean getEnableWafSignaturesNotifications() {
        return enableWafSignaturesNotifications;
    }

    /**
     * This is the setter method to the attribute.
     * This field is deprecated.
     * Field deprecated in 21.1.1.
     * Field introduced in 20.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * Special default for basic edition is false, essentials edition is false.
     * @param enableWafSignaturesNotifications set the enableWafSignaturesNotifications.
     */
    public void setEnableWafSignaturesNotifications(Boolean  enableWafSignaturesNotifications) {
        this.enableWafSignaturesNotifications = enableWafSignaturesNotifications;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      PortalFeatureOptIn objPortalFeatureOptIn = (PortalFeatureOptIn) o;
      return   Objects.equals(this.enableAutoDownloadWafSignatures, objPortalFeatureOptIn.enableAutoDownloadWafSignatures)&&
  Objects.equals(this.enableWafSignaturesNotifications, objPortalFeatureOptIn.enableWafSignaturesNotifications)&&
  Objects.equals(this.enableAutoCaseCreationOnSystemFailure, objPortalFeatureOptIn.enableAutoCaseCreationOnSystemFailure)&&
  Objects.equals(this.enableAutoCaseCreationOnSeFailure, objPortalFeatureOptIn.enableAutoCaseCreationOnSeFailure)&&
  Objects.equals(this.enableIpReputation, objPortalFeatureOptIn.enableIpReputation)&&
  Objects.equals(this.enableAppsignatureSync, objPortalFeatureOptIn.enableAppsignatureSync)&&
  Objects.equals(this.enableUserAgentDbSync, objPortalFeatureOptIn.enableUserAgentDbSync)&&
  Objects.equals(this.enablePulseWafManagement, objPortalFeatureOptIn.enablePulseWafManagement)&&
  Objects.equals(this.enablePulseCaseManagement, objPortalFeatureOptIn.enablePulseCaseManagement)&&
  Objects.equals(this.enableSaasLicensing, objPortalFeatureOptIn.enableSaasLicensing);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PortalFeatureOptIn {\n");
                  sb.append("    enableAppsignatureSync: ").append(toIndentedString(enableAppsignatureSync)).append("\n");
                        sb.append("    enableAutoCaseCreationOnSeFailure: ").append(toIndentedString(enableAutoCaseCreationOnSeFailure)).append("\n");
                        sb.append("    enableAutoCaseCreationOnSystemFailure: ").append(toIndentedString(enableAutoCaseCreationOnSystemFailure)).append("\n");
                        sb.append("    enableAutoDownloadWafSignatures: ").append(toIndentedString(enableAutoDownloadWafSignatures)).append("\n");
                        sb.append("    enableIpReputation: ").append(toIndentedString(enableIpReputation)).append("\n");
                        sb.append("    enablePulseCaseManagement: ").append(toIndentedString(enablePulseCaseManagement)).append("\n");
                        sb.append("    enablePulseWafManagement: ").append(toIndentedString(enablePulseWafManagement)).append("\n");
                        sb.append("    enableSaasLicensing: ").append(toIndentedString(enableSaasLicensing)).append("\n");
                        sb.append("    enableUserAgentDbSync: ").append(toIndentedString(enableUserAgentDbSync)).append("\n");
                        sb.append("    enableWafSignaturesNotifications: ").append(toIndentedString(enableWafSignaturesNotifications)).append("\n");
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

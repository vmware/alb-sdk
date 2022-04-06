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
 * The SystemConfiguration is a POJO class extends AviRestResource that used for creating
 * SystemConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SystemConfiguration extends AviRestResource  {
    @JsonProperty("admin_auth_configuration")
    private AdminAuthConfiguration adminAuthConfiguration = null;

    @JsonProperty("common_criteria_mode")
    private Boolean commonCriteriaMode = false;

    @JsonProperty("controller_analytics_policy")
    private ControllerAnalyticsPolicy controllerAnalyticsPolicy = null;

    @JsonProperty("default_license_tier")
    private String defaultLicenseTier;

    @JsonProperty("dns_configuration")
    private DNSConfiguration dnsConfiguration = null;

    @JsonProperty("dns_virtualservice_refs")
    private List<String> dnsVirtualserviceRefs = null;

    @JsonProperty("docker_mode")
    private Boolean dockerMode = false;

    @JsonProperty("email_configuration")
    private EmailConfiguration emailConfiguration = null;

    @JsonProperty("enable_cors")
    private Boolean enableCors = false;

    @JsonProperty("fips_mode")
    private Boolean fipsMode = false;

    @JsonProperty("global_tenant_config")
    private TenantConfiguration globalTenantConfig = null;

    @JsonProperty("linux_configuration")
    private LinuxConfiguration linuxConfiguration = null;

    @JsonProperty("mgmt_ip_access_control")
    private MgmtIpAccessControl mgmtIpAccessControl = null;

    @JsonProperty("ntp_configuration")
    private NTPConfiguration ntpConfiguration = null;

    @JsonProperty("portal_configuration")
    private PortalConfiguration portalConfiguration = null;

    @JsonProperty("proxy_configuration")
    private ProxyConfiguration proxyConfiguration = null;

    @JsonProperty("secure_channel_configuration")
    private SecureChannelConfiguration secureChannelConfiguration = null;

    @JsonProperty("snmp_configuration")
    private SnmpConfiguration snmpConfiguration = null;

    @JsonProperty("ssh_ciphers")
    private List<String> sshCiphers = null;

    @JsonProperty("ssh_hmacs")
    private List<String> sshHmacs = null;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid = null;

    @JsonProperty("welcome_workflow_complete")
    private Boolean welcomeWorkflowComplete = false;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return adminAuthConfiguration
     */
    public AdminAuthConfiguration getAdminAuthConfiguration() {
        return adminAuthConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param adminAuthConfiguration set the adminAuthConfiguration.
     */
    public void setAdminAuthConfiguration(AdminAuthConfiguration adminAuthConfiguration) {
        this.adminAuthConfiguration = adminAuthConfiguration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Common criteria mode's current state.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return commonCriteriaMode
     */
    public Boolean getCommonCriteriaMode() {
        return commonCriteriaMode;
    }

    /**
     * This is the setter method to the attribute.
     * Common criteria mode's current state.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param commonCriteriaMode set the commonCriteriaMode.
     */
    public void setCommonCriteriaMode(Boolean  commonCriteriaMode) {
        this.commonCriteriaMode = commonCriteriaMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Controller metrics event dynamic thresholds can be set here.
     * Controller_cpu_high and controller_mem_high evets can take configured dynamic thresholds.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return controllerAnalyticsPolicy
     */
    public ControllerAnalyticsPolicy getControllerAnalyticsPolicy() {
        return controllerAnalyticsPolicy;
    }

    /**
     * This is the setter method to the attribute.
     * Controller metrics event dynamic thresholds can be set here.
     * Controller_cpu_high and controller_mem_high evets can take configured dynamic thresholds.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param controllerAnalyticsPolicy set the controllerAnalyticsPolicy.
     */
    public void setControllerAnalyticsPolicy(ControllerAnalyticsPolicy controllerAnalyticsPolicy) {
        this.controllerAnalyticsPolicy = controllerAnalyticsPolicy;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Specifies the default license tier which would be used by new clouds.
     * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC, ESSENTIALS, ENTERPRISE_WITH_CLOUD_SERVICES.
     * Field introduced in 17.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Special default for essentials edition is essentials, basic edition is basic, enterprise is enterprise_with_cloud_services.
     * @return defaultLicenseTier
     */
    public String getDefaultLicenseTier() {
        return defaultLicenseTier;
    }

    /**
     * This is the setter method to the attribute.
     * Specifies the default license tier which would be used by new clouds.
     * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC, ESSENTIALS, ENTERPRISE_WITH_CLOUD_SERVICES.
     * Field introduced in 17.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Special default for essentials edition is essentials, basic edition is basic, enterprise is enterprise_with_cloud_services.
     * @param defaultLicenseTier set the defaultLicenseTier.
     */
    public void setDefaultLicenseTier(String  defaultLicenseTier) {
        this.defaultLicenseTier = defaultLicenseTier;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsConfiguration
     */
    public DNSConfiguration getDnsConfiguration() {
        return dnsConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dnsConfiguration set the dnsConfiguration.
     */
    public void setDnsConfiguration(DNSConfiguration dnsConfiguration) {
        this.dnsConfiguration = dnsConfiguration;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Dns virtualservices hosting fqdn records for applications across avi vantage.
     * If no virtualservices are provided, avi vantage will provide dns services for configured applications.
     * Switching back to avi vantage from dns virtualservices is not allowed.
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsVirtualserviceRefs
     */
    public List<String> getDnsVirtualserviceRefs() {
        return dnsVirtualserviceRefs;
    }

    /**
     * This is the setter method. this will set the dnsVirtualserviceRefs
     * Dns virtualservices hosting fqdn records for applications across avi vantage.
     * If no virtualservices are provided, avi vantage will provide dns services for configured applications.
     * Switching back to avi vantage from dns virtualservices is not allowed.
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsVirtualserviceRefs
     */
    public void setDnsVirtualserviceRefs(List<String>  dnsVirtualserviceRefs) {
        this.dnsVirtualserviceRefs = dnsVirtualserviceRefs;
    }

    /**
     * This is the setter method this will set the dnsVirtualserviceRefs
     * Dns virtualservices hosting fqdn records for applications across avi vantage.
     * If no virtualservices are provided, avi vantage will provide dns services for configured applications.
     * Switching back to avi vantage from dns virtualservices is not allowed.
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsVirtualserviceRefs
     */
    public SystemConfiguration addDnsVirtualserviceRefsItem(String dnsVirtualserviceRefsItem) {
      if (this.dnsVirtualserviceRefs == null) {
        this.dnsVirtualserviceRefs = new ArrayList<String>();
      }
      this.dnsVirtualserviceRefs.add(dnsVirtualserviceRefsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return dockerMode
     */
    public Boolean getDockerMode() {
        return dockerMode;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param dockerMode set the dockerMode.
     */
    public void setDockerMode(Boolean  dockerMode) {
        this.dockerMode = dockerMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return emailConfiguration
     */
    public EmailConfiguration getEmailConfiguration() {
        return emailConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param emailConfiguration set the emailConfiguration.
     */
    public void setEmailConfiguration(EmailConfiguration emailConfiguration) {
        this.emailConfiguration = emailConfiguration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable cors header.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableCors
     */
    public Boolean getEnableCors() {
        return enableCors;
    }

    /**
     * This is the setter method to the attribute.
     * Enable cors header.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableCors set the enableCors.
     */
    public void setEnableCors(Boolean  enableCors) {
        this.enableCors = enableCors;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Fips mode current state.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return fipsMode
     */
    public Boolean getFipsMode() {
        return fipsMode;
    }

    /**
     * This is the setter method to the attribute.
     * Fips mode current state.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param fipsMode set the fipsMode.
     */
    public void setFipsMode(Boolean  fipsMode) {
        this.fipsMode = fipsMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return globalTenantConfig
     */
    public TenantConfiguration getGlobalTenantConfig() {
        return globalTenantConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param globalTenantConfig set the globalTenantConfig.
     */
    public void setGlobalTenantConfig(TenantConfiguration globalTenantConfig) {
        this.globalTenantConfig = globalTenantConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return linuxConfiguration
     */
    public LinuxConfiguration getLinuxConfiguration() {
        return linuxConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param linuxConfiguration set the linuxConfiguration.
     */
    public void setLinuxConfiguration(LinuxConfiguration linuxConfiguration) {
        this.linuxConfiguration = linuxConfiguration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure ip access control for controller to restrict open access.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mgmtIpAccessControl
     */
    public MgmtIpAccessControl getMgmtIpAccessControl() {
        return mgmtIpAccessControl;
    }

    /**
     * This is the setter method to the attribute.
     * Configure ip access control for controller to restrict open access.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mgmtIpAccessControl set the mgmtIpAccessControl.
     */
    public void setMgmtIpAccessControl(MgmtIpAccessControl mgmtIpAccessControl) {
        this.mgmtIpAccessControl = mgmtIpAccessControl;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ntpConfiguration
     */
    public NTPConfiguration getNtpConfiguration() {
        return ntpConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ntpConfiguration set the ntpConfiguration.
     */
    public void setNtpConfiguration(NTPConfiguration ntpConfiguration) {
        this.ntpConfiguration = ntpConfiguration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return portalConfiguration
     */
    public PortalConfiguration getPortalConfiguration() {
        return portalConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param portalConfiguration set the portalConfiguration.
     */
    public void setPortalConfiguration(PortalConfiguration portalConfiguration) {
        this.portalConfiguration = portalConfiguration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return proxyConfiguration
     */
    public ProxyConfiguration getProxyConfiguration() {
        return proxyConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param proxyConfiguration set the proxyConfiguration.
     */
    public void setProxyConfiguration(ProxyConfiguration proxyConfiguration) {
        this.proxyConfiguration = proxyConfiguration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure secure channel properties.
     * Field introduced in 18.1.4, 18.2.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return secureChannelConfiguration
     */
    public SecureChannelConfiguration getSecureChannelConfiguration() {
        return secureChannelConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Configure secure channel properties.
     * Field introduced in 18.1.4, 18.2.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param secureChannelConfiguration set the secureChannelConfiguration.
     */
    public void setSecureChannelConfiguration(SecureChannelConfiguration secureChannelConfiguration) {
        this.secureChannelConfiguration = secureChannelConfiguration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return snmpConfiguration
     */
    public SnmpConfiguration getSnmpConfiguration() {
        return snmpConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param snmpConfiguration set the snmpConfiguration.
     */
    public void setSnmpConfiguration(SnmpConfiguration snmpConfiguration) {
        this.snmpConfiguration = snmpConfiguration;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed ciphers list for ssh to the management interface on the controller and service engines.
     * If this is not specified, all the default ciphers are allowed.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sshCiphers
     */
    public List<String> getSshCiphers() {
        return sshCiphers;
    }

    /**
     * This is the setter method. this will set the sshCiphers
     * Allowed ciphers list for ssh to the management interface on the controller and service engines.
     * If this is not specified, all the default ciphers are allowed.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sshCiphers
     */
    public void setSshCiphers(List<String>  sshCiphers) {
        this.sshCiphers = sshCiphers;
    }

    /**
     * This is the setter method this will set the sshCiphers
     * Allowed ciphers list for ssh to the management interface on the controller and service engines.
     * If this is not specified, all the default ciphers are allowed.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sshCiphers
     */
    public SystemConfiguration addSshCiphersItem(String sshCiphersItem) {
      if (this.sshCiphers == null) {
        this.sshCiphers = new ArrayList<String>();
      }
      this.sshCiphers.add(sshCiphersItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed hmac list for ssh to the management interface on the controller and service engines.
     * If this is not specified, all the default hmacs are allowed.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sshHmacs
     */
    public List<String> getSshHmacs() {
        return sshHmacs;
    }

    /**
     * This is the setter method. this will set the sshHmacs
     * Allowed hmac list for ssh to the management interface on the controller and service engines.
     * If this is not specified, all the default hmacs are allowed.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sshHmacs
     */
    public void setSshHmacs(List<String>  sshHmacs) {
        this.sshHmacs = sshHmacs;
    }

    /**
     * This is the setter method this will set the sshHmacs
     * Allowed hmac list for ssh to the management interface on the controller and service engines.
     * If this is not specified, all the default hmacs are allowed.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sshHmacs
     */
    public SystemConfiguration addSshHmacsItem(String sshHmacsItem) {
      if (this.sshHmacs == null) {
        this.sshHmacs = new ArrayList<String>();
      }
      this.sshHmacs.add(sshHmacsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Avi controller URL of the object.
     * @return url
     */
    public String getUrl() {
        return url;
    }

   /**
    * This is the setter method. this will set the url
    * Avi controller URL of the object.
    * @return url
    */
   public void setUrl(String  url) {
     this.url = url;
   }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This flag is set once the initial controller setup workflow is complete.
     * Field introduced in 18.2.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return welcomeWorkflowComplete
     */
    public Boolean getWelcomeWorkflowComplete() {
        return welcomeWorkflowComplete;
    }

    /**
     * This is the setter method to the attribute.
     * This flag is set once the initial controller setup workflow is complete.
     * Field introduced in 18.2.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param welcomeWorkflowComplete set the welcomeWorkflowComplete.
     */
    public void setWelcomeWorkflowComplete(Boolean  welcomeWorkflowComplete) {
        this.welcomeWorkflowComplete = welcomeWorkflowComplete;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SystemConfiguration objSystemConfiguration = (SystemConfiguration) o;
      return   Objects.equals(this.uuid, objSystemConfiguration.uuid)&&
  Objects.equals(this.dnsConfiguration, objSystemConfiguration.dnsConfiguration)&&
  Objects.equals(this.ntpConfiguration, objSystemConfiguration.ntpConfiguration)&&
  Objects.equals(this.portalConfiguration, objSystemConfiguration.portalConfiguration)&&
  Objects.equals(this.globalTenantConfig, objSystemConfiguration.globalTenantConfig)&&
  Objects.equals(this.emailConfiguration, objSystemConfiguration.emailConfiguration)&&
  Objects.equals(this.adminAuthConfiguration, objSystemConfiguration.adminAuthConfiguration)&&
  Objects.equals(this.dockerMode, objSystemConfiguration.dockerMode)&&
  Objects.equals(this.snmpConfiguration, objSystemConfiguration.snmpConfiguration)&&
  Objects.equals(this.linuxConfiguration, objSystemConfiguration.linuxConfiguration)&&
  Objects.equals(this.proxyConfiguration, objSystemConfiguration.proxyConfiguration)&&
  Objects.equals(this.mgmtIpAccessControl, objSystemConfiguration.mgmtIpAccessControl)&&
  Objects.equals(this.sshCiphers, objSystemConfiguration.sshCiphers)&&
  Objects.equals(this.sshHmacs, objSystemConfiguration.sshHmacs)&&
  Objects.equals(this.dnsVirtualserviceRefs, objSystemConfiguration.dnsVirtualserviceRefs)&&
  Objects.equals(this.defaultLicenseTier, objSystemConfiguration.defaultLicenseTier)&&
  Objects.equals(this.secureChannelConfiguration, objSystemConfiguration.secureChannelConfiguration)&&
  Objects.equals(this.welcomeWorkflowComplete, objSystemConfiguration.welcomeWorkflowComplete)&&
  Objects.equals(this.fipsMode, objSystemConfiguration.fipsMode)&&
  Objects.equals(this.enableCors, objSystemConfiguration.enableCors)&&
  Objects.equals(this.commonCriteriaMode, objSystemConfiguration.commonCriteriaMode)&&
  Objects.equals(this.controllerAnalyticsPolicy, objSystemConfiguration.controllerAnalyticsPolicy);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SystemConfiguration {\n");
                  sb.append("    adminAuthConfiguration: ").append(toIndentedString(adminAuthConfiguration)).append("\n");
                        sb.append("    commonCriteriaMode: ").append(toIndentedString(commonCriteriaMode)).append("\n");
                        sb.append("    controllerAnalyticsPolicy: ").append(toIndentedString(controllerAnalyticsPolicy)).append("\n");
                        sb.append("    defaultLicenseTier: ").append(toIndentedString(defaultLicenseTier)).append("\n");
                        sb.append("    dnsConfiguration: ").append(toIndentedString(dnsConfiguration)).append("\n");
                        sb.append("    dnsVirtualserviceRefs: ").append(toIndentedString(dnsVirtualserviceRefs)).append("\n");
                        sb.append("    dockerMode: ").append(toIndentedString(dockerMode)).append("\n");
                        sb.append("    emailConfiguration: ").append(toIndentedString(emailConfiguration)).append("\n");
                        sb.append("    enableCors: ").append(toIndentedString(enableCors)).append("\n");
                        sb.append("    fipsMode: ").append(toIndentedString(fipsMode)).append("\n");
                        sb.append("    globalTenantConfig: ").append(toIndentedString(globalTenantConfig)).append("\n");
                        sb.append("    linuxConfiguration: ").append(toIndentedString(linuxConfiguration)).append("\n");
                        sb.append("    mgmtIpAccessControl: ").append(toIndentedString(mgmtIpAccessControl)).append("\n");
                        sb.append("    ntpConfiguration: ").append(toIndentedString(ntpConfiguration)).append("\n");
                        sb.append("    portalConfiguration: ").append(toIndentedString(portalConfiguration)).append("\n");
                        sb.append("    proxyConfiguration: ").append(toIndentedString(proxyConfiguration)).append("\n");
                        sb.append("    secureChannelConfiguration: ").append(toIndentedString(secureChannelConfiguration)).append("\n");
                        sb.append("    snmpConfiguration: ").append(toIndentedString(snmpConfiguration)).append("\n");
                        sb.append("    sshCiphers: ").append(toIndentedString(sshCiphers)).append("\n");
                        sb.append("    sshHmacs: ").append(toIndentedString(sshHmacs)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    welcomeWorkflowComplete: ").append(toIndentedString(welcomeWorkflowComplete)).append("\n");
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

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
    private AdminAuthConfiguration adminAuthConfiguration;

    @JsonProperty("ai_assistant_enabled")
    private Boolean aiAssistantEnabled = false;

    @JsonProperty("allow_legacy_sha1_ntp_auth")
    private Boolean allowLegacySha1NtpAuth = false;

    @JsonProperty("allow_private_ips")
    private Boolean allowPrivateIps = false;

    @JsonIgnore
    private String aviEmailLoginPassword;

    @JsonProperty("certificate_security_policy")
    private CertificateSecurityPolicy certificateSecurityPolicy;

    @JsonProperty("common_criteria_mode")
    private Boolean commonCriteriaMode = false;

    @JsonProperty("controller_analytics_policy")
    private ControllerAnalyticsPolicy controllerAnalyticsPolicy;

    @JsonProperty("default_license_tier")
    private String defaultLicenseTier = "ENTERPRISE_WITH_CLOUD_SERVICES";

    @JsonProperty("dns_configuration")
    private DNSConfiguration dnsConfiguration;

    @JsonProperty("dns_virtualservice_refs")
    private List<String> dnsVirtualserviceRefs;

    @JsonProperty("docker_mode")
    private Boolean dockerMode = false;

    @JsonProperty("email_configuration")
    private EmailConfiguration emailConfiguration;

    @JsonProperty("enable_cors")
    private Boolean enableCors = false;

    @JsonProperty("enable_host_header_check")
    private Boolean enableHostHeaderCheck = false;

    @JsonProperty("enable_license_quota")
    private Boolean enableLicenseQuota = true;

    @JsonProperty("fips_mode")
    private Boolean fipsMode = false;

    @JsonProperty("global_tenant_config")
    private TenantConfiguration globalTenantConfig;

    @JsonProperty("gslb_client_cert_ref")
    private String gslbClientCertRef;

    @JsonProperty("host_key_algorithm_exclude")
    private String hostKeyAlgorithmExclude;

    @JsonProperty("kex_algorithm_exclude")
    private String kexAlgorithmExclude;

    @JsonProperty("legacy_ssl_support")
    private Boolean legacySslSupport = false;

    @JsonProperty("license_quota")
    private QuotaConfig licenseQuota;

    @JsonProperty("linux_configuration")
    private LinuxConfiguration linuxConfiguration;

    @JsonProperty("mgmt_ip_access_control")
    private MgmtIpAccessControl mgmtIpAccessControl;

    @JsonProperty("ntp_configuration")
    private NTPConfiguration ntpConfiguration;

    @JsonProperty("password_policy_managed_at_ops")
    private Boolean passwordPolicyManagedAtOps = false;

    @JsonProperty("portal_configuration")
    private PortalConfiguration portalConfiguration;

    @JsonProperty("proxy_configuration")
    private ProxyConfiguration proxyConfiguration;

    @JsonProperty("rekey_time_limit")
    private String rekeyTimeLimit = "none";

    @JsonProperty("rekey_volume_limit")
    private String rekeyVolumeLimit = "default";

    @JsonProperty("sddcmanager_fqdn")
    private String sddcmanagerFqdn;

    @JsonProperty("secure_channel_configuration")
    private SecureChannelConfiguration secureChannelConfiguration;

    @JsonProperty("service_auth_configurations")
    private List<ServiceAuthConfiguration> serviceAuthConfigurations;

    @JsonProperty("snmp_configuration")
    private SnmpConfiguration snmpConfiguration;

    @JsonProperty("ssh_ciphers")
    private List<String> sshCiphers;

    @JsonProperty("ssh_hmacs")
    private List<String> sshHmacs;

    @JsonProperty("sync_kex_host_to_se")
    private Boolean syncKexHostToSe = false;

    @JsonProperty("sync_syslog_to_se")
    private Boolean syncSyslogToSe = false;

    @JsonProperty("syslog_server_settings")
    private List<SyslogServerConfig> syslogServerSettings;

    @JsonProperty("telemetry_configuration")
    private TelemetryConfiguration telemetryConfiguration;

    @JsonProperty("trusted_host_profiles_refs")
    private List<String> trustedHostProfilesRefs;

    @JsonProperty("truststore_pkiprofile_ref")
    private String truststorePkiprofileRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("welcome_workflow_complete")
    private Boolean welcomeWorkflowComplete = false;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return adminAuthConfiguration
     */
    public AdminAuthConfiguration getAdminAuthConfiguration() {
        return adminAuthConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param adminAuthConfiguration set the adminAuthConfiguration.
     */
    public void setAdminAuthConfiguration(AdminAuthConfiguration adminAuthConfiguration) {
        this.adminAuthConfiguration = adminAuthConfiguration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable or disable ai assistant feature on the controller.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return aiAssistantEnabled
     */
    public Boolean getAiAssistantEnabled() {
        return aiAssistantEnabled;
    }

    /**
     * This is the setter method to the attribute.
     * Enable or disable ai assistant feature on the controller.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param aiAssistantEnabled set the aiAssistantEnabled.
     */
    public void setAiAssistantEnabled(Boolean  aiAssistantEnabled) {
        this.aiAssistantEnabled = aiAssistantEnabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allow ntp authentication using legacy md5 or sha1 algorithms.
     * When enabled, configuring md5 or sha1 ntp keys is permitted but a warning event is generated in the controller ui.
     * When disabled (default), only sha256 or stronger is accepted and configuring md5 or sha1 results in an api error.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return allowLegacySha1NtpAuth
     */
    public Boolean getAllowLegacySha1NtpAuth() {
        return allowLegacySha1NtpAuth;
    }

    /**
     * This is the setter method to the attribute.
     * Allow ntp authentication using legacy md5 or sha1 algorithms.
     * When enabled, configuring md5 or sha1 ntp keys is permitted but a warning event is generated in the controller ui.
     * When disabled (default), only sha256 or stronger is accepted and configuring md5 or sha1 results in an api error.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param allowLegacySha1NtpAuth set the allowLegacySha1NtpAuth.
     */
    public void setAllowLegacySha1NtpAuth(Boolean  allowLegacySha1NtpAuth) {
        this.allowLegacySha1NtpAuth = allowLegacySha1NtpAuth;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allow usage of private ips in crl server, saml metadata url.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return allowPrivateIps
     */
    public Boolean getAllowPrivateIps() {
        return allowPrivateIps;
    }

    /**
     * This is the setter method to the attribute.
     * Allow usage of private ips in crl server, saml metadata url.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param allowPrivateIps set the allowPrivateIps.
     */
    public void setAllowPrivateIps(Boolean  allowPrivateIps) {
        this.allowPrivateIps = allowPrivateIps;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Password for avi_email_login user.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return aviEmailLoginPassword
     */
    public String getAviEmailLoginPassword() {
        return aviEmailLoginPassword;
    }

    /**
     * This is the setter method to the attribute.
     * Password for avi_email_login user.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param aviEmailLoginPassword set the aviEmailLoginPassword.
     */
    public void setAviEmailLoginPassword(String  aviEmailLoginPassword) {
        this.aviEmailLoginPassword = aviEmailLoginPassword;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Certificate security policy for the system.
     * Field introduced in 32.2.1, 32.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return certificateSecurityPolicy
     */
    public CertificateSecurityPolicy getCertificateSecurityPolicy() {
        return certificateSecurityPolicy;
    }

    /**
     * This is the setter method to the attribute.
     * Certificate security policy for the system.
     * Field introduced in 32.2.1, 32.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param certificateSecurityPolicy set the certificateSecurityPolicy.
     */
    public void setCertificateSecurityPolicy(CertificateSecurityPolicy certificateSecurityPolicy) {
        this.certificateSecurityPolicy = certificateSecurityPolicy;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Common criteria mode's current state.
     * Field introduced in 20.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "ENTERPRISE_WITH_CLOUD_SERVICES".
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "ENTERPRISE_WITH_CLOUD_SERVICES".
     * @param defaultLicenseTier set the defaultLicenseTier.
     */
    public void setDefaultLicenseTier(String  defaultLicenseTier) {
        this.defaultLicenseTier = defaultLicenseTier;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsConfiguration
     */
    public DNSConfiguration getDnsConfiguration() {
        return dnsConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return dockerMode
     */
    public Boolean getDockerMode() {
        return dockerMode;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param dockerMode set the dockerMode.
     */
    public void setDockerMode(Boolean  dockerMode) {
        this.dockerMode = dockerMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return emailConfiguration
     */
    public EmailConfiguration getEmailConfiguration() {
        return emailConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableCors set the enableCors.
     */
    public void setEnableCors(Boolean  enableCors) {
        this.enableCors = enableCors;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Validates the host header against a list of trusted domains.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableHostHeaderCheck
     */
    public Boolean getEnableHostHeaderCheck() {
        return enableHostHeaderCheck;
    }

    /**
     * This is the setter method to the attribute.
     * Validates the host header against a list of trusted domains.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableHostHeaderCheck set the enableHostHeaderCheck.
     */
    public void setEnableHostHeaderCheck(Boolean  enableHostHeaderCheck) {
        this.enableHostHeaderCheck = enableHostHeaderCheck;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable license quota for the system.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return enableLicenseQuota
     */
    public Boolean getEnableLicenseQuota() {
        return enableLicenseQuota;
    }

    /**
     * This is the setter method to the attribute.
     * Enable license quota for the system.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param enableLicenseQuota set the enableLicenseQuota.
     */
    public void setEnableLicenseQuota(Boolean  enableLicenseQuota) {
        this.enableLicenseQuota = enableLicenseQuota;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Fips mode current state.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param fipsMode set the fipsMode.
     */
    public void setFipsMode(Boolean  fipsMode) {
        this.fipsMode = fipsMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return globalTenantConfig
     */
    public TenantConfiguration getGlobalTenantConfig() {
        return globalTenantConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param globalTenantConfig set the globalTenantConfig.
     */
    public void setGlobalTenantConfig(TenantConfiguration globalTenantConfig) {
        this.globalTenantConfig = globalTenantConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Client certificate for mutual tls authentication.
     * Required when tls_mode is tls_mode_mtls.
     * It is a reference to an object of type sslkeyandcertificate.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gslbClientCertRef
     */
    public String getGslbClientCertRef() {
        return gslbClientCertRef;
    }

    /**
     * This is the setter method to the attribute.
     * Client certificate for mutual tls authentication.
     * Required when tls_mode is tls_mode_mtls.
     * It is a reference to an object of type sslkeyandcertificate.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gslbClientCertRef set the gslbClientCertRef.
     */
    public void setGslbClientCertRef(String  gslbClientCertRef) {
        this.gslbClientCertRef = gslbClientCertRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Users can specify comma separated list of deprecated host key algorithm.if nothing is specified, all known algorithms provided by openssh will be
     * supported.this change could only apply on the controller node.
     * Field introduced in 22.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hostKeyAlgorithmExclude
     */
    public String getHostKeyAlgorithmExclude() {
        return hostKeyAlgorithmExclude;
    }

    /**
     * This is the setter method to the attribute.
     * Users can specify comma separated list of deprecated host key algorithm.if nothing is specified, all known algorithms provided by openssh will be
     * supported.this change could only apply on the controller node.
     * Field introduced in 22.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hostKeyAlgorithmExclude set the hostKeyAlgorithmExclude.
     */
    public void setHostKeyAlgorithmExclude(String  hostKeyAlgorithmExclude) {
        this.hostKeyAlgorithmExclude = hostKeyAlgorithmExclude;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Users can specify comma separated list of deprecated key exchange algorithm.if nothing is specified, all known algorithms provided by openssh
     * will be supported.this change could only apply on the controller node.
     * Field introduced in 22.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return kexAlgorithmExclude
     */
    public String getKexAlgorithmExclude() {
        return kexAlgorithmExclude;
    }

    /**
     * This is the setter method to the attribute.
     * Users can specify comma separated list of deprecated key exchange algorithm.if nothing is specified, all known algorithms provided by openssh
     * will be supported.this change could only apply on the controller node.
     * Field introduced in 22.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param kexAlgorithmExclude set the kexAlgorithmExclude.
     */
    public void setKexAlgorithmExclude(String  kexAlgorithmExclude) {
        this.kexAlgorithmExclude = kexAlgorithmExclude;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allow outgoing connections from controller to servers using tls 1.0/1.1.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return legacySslSupport
     */
    public Boolean getLegacySslSupport() {
        return legacySslSupport;
    }

    /**
     * This is the setter method to the attribute.
     * Allow outgoing connections from controller to servers using tls 1.0/1.1.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param legacySslSupport set the legacySslSupport.
     */
    public void setLegacySslSupport(Boolean  legacySslSupport) {
        this.legacySslSupport = legacySslSupport;
    }

    /**
     * This is the getter method this will return the attribute value.
     * License quota for the system.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return licenseQuota
     */
    public QuotaConfig getLicenseQuota() {
        return licenseQuota;
    }

    /**
     * This is the setter method to the attribute.
     * License quota for the system.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param licenseQuota set the licenseQuota.
     */
    public void setLicenseQuota(QuotaConfig licenseQuota) {
        this.licenseQuota = licenseQuota;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return linuxConfiguration
     */
    public LinuxConfiguration getLinuxConfiguration() {
        return linuxConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param linuxConfiguration set the linuxConfiguration.
     */
    public void setLinuxConfiguration(LinuxConfiguration linuxConfiguration) {
        this.linuxConfiguration = linuxConfiguration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure ip access control for controller to restrict open access.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mgmtIpAccessControl
     */
    public MgmtIpAccessControl getMgmtIpAccessControl() {
        return mgmtIpAccessControl;
    }

    /**
     * This is the setter method to the attribute.
     * Configure ip access control for controller to restrict open access.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mgmtIpAccessControl set the mgmtIpAccessControl.
     */
    public void setMgmtIpAccessControl(MgmtIpAccessControl mgmtIpAccessControl) {
        this.mgmtIpAccessControl = mgmtIpAccessControl;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ntpConfiguration
     */
    public NTPConfiguration getNtpConfiguration() {
        return ntpConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ntpConfiguration set the ntpConfiguration.
     */
    public void setNtpConfiguration(NTPConfiguration ntpConfiguration) {
        this.ntpConfiguration = ntpConfiguration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Indicates whether password policy fields are managed by vcf-ops.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return passwordPolicyManagedAtOps
     */
    public Boolean getPasswordPolicyManagedAtOps() {
        return passwordPolicyManagedAtOps;
    }

    /**
     * This is the setter method to the attribute.
     * Indicates whether password policy fields are managed by vcf-ops.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param passwordPolicyManagedAtOps set the passwordPolicyManagedAtOps.
     */
    public void setPasswordPolicyManagedAtOps(Boolean  passwordPolicyManagedAtOps) {
        this.passwordPolicyManagedAtOps = passwordPolicyManagedAtOps;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return portalConfiguration
     */
    public PortalConfiguration getPortalConfiguration() {
        return portalConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param portalConfiguration set the portalConfiguration.
     */
    public void setPortalConfiguration(PortalConfiguration portalConfiguration) {
        this.portalConfiguration = portalConfiguration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return proxyConfiguration
     */
    public ProxyConfiguration getProxyConfiguration() {
        return proxyConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param proxyConfiguration set the proxyConfiguration.
     */
    public void setProxyConfiguration(ProxyConfiguration proxyConfiguration) {
        this.proxyConfiguration = proxyConfiguration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Users can specify and update the time limit of rekeylimit in sshd_config.if nothing is specified, the default setting will be none.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "none".
     * @return rekeyTimeLimit
     */
    public String getRekeyTimeLimit() {
        return rekeyTimeLimit;
    }

    /**
     * This is the setter method to the attribute.
     * Users can specify and update the time limit of rekeylimit in sshd_config.if nothing is specified, the default setting will be none.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "none".
     * @param rekeyTimeLimit set the rekeyTimeLimit.
     */
    public void setRekeyTimeLimit(String  rekeyTimeLimit) {
        this.rekeyTimeLimit = rekeyTimeLimit;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Users can specify and update the size/volume limit of rekeylimit in sshd_config.if nothing is specified, the default setting will be default.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "default".
     * @return rekeyVolumeLimit
     */
    public String getRekeyVolumeLimit() {
        return rekeyVolumeLimit;
    }

    /**
     * This is the setter method to the attribute.
     * Users can specify and update the size/volume limit of rekeylimit in sshd_config.if nothing is specified, the default setting will be default.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "default".
     * @param rekeyVolumeLimit set the rekeyVolumeLimit.
     */
    public void setRekeyVolumeLimit(String  rekeyVolumeLimit) {
        this.rekeyVolumeLimit = rekeyVolumeLimit;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Fqdn of sddc manager in vcf responsible for management of this alb controller cluster.
     * Field introduced in 22.1.6,31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sddcmanagerFqdn
     */
    public String getSddcmanagerFqdn() {
        return sddcmanagerFqdn;
    }

    /**
     * This is the setter method to the attribute.
     * Fqdn of sddc manager in vcf responsible for management of this alb controller cluster.
     * Field introduced in 22.1.6,31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sddcmanagerFqdn set the sddcmanagerFqdn.
     */
    public void setSddcmanagerFqdn(String  sddcmanagerFqdn) {
        this.sddcmanagerFqdn = sddcmanagerFqdn;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure secure channel properties.
     * Field introduced in 18.1.4, 18.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param secureChannelConfiguration set the secureChannelConfiguration.
     */
    public void setSecureChannelConfiguration(SecureChannelConfiguration secureChannelConfiguration) {
        this.secureChannelConfiguration = secureChannelConfiguration;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Service auth configurations.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceAuthConfigurations
     */
    public List<ServiceAuthConfiguration> getServiceAuthConfigurations() {
        return serviceAuthConfigurations;
    }

    /**
     * This is the setter method. this will set the serviceAuthConfigurations
     * Service auth configurations.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceAuthConfigurations
     */
    public void setServiceAuthConfigurations(List<ServiceAuthConfiguration>  serviceAuthConfigurations) {
        this.serviceAuthConfigurations = serviceAuthConfigurations;
    }

    /**
     * This is the setter method this will set the serviceAuthConfigurations
     * Service auth configurations.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceAuthConfigurations
     */
    public SystemConfiguration addServiceAuthConfigurationsItem(ServiceAuthConfiguration serviceAuthConfigurationsItem) {
      if (this.serviceAuthConfigurations == null) {
        this.serviceAuthConfigurations = new ArrayList<ServiceAuthConfiguration>();
      }
      this.serviceAuthConfigurations.add(serviceAuthConfigurationsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return snmpConfiguration
     */
    public SnmpConfiguration getSnmpConfiguration() {
        return snmpConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Ability to sync the kexalgorithms & hostkeyalgorithms to ses.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return syncKexHostToSe
     */
    public Boolean getSyncKexHostToSe() {
        return syncKexHostToSe;
    }

    /**
     * This is the setter method to the attribute.
     * Ability to sync the kexalgorithms & hostkeyalgorithms to ses.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param syncKexHostToSe set the syncKexHostToSe.
     */
    public void setSyncKexHostToSe(Boolean  syncKexHostToSe) {
        this.syncKexHostToSe = syncKexHostToSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ability to sync the syslog server config to ses.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return syncSyslogToSe
     */
    public Boolean getSyncSyslogToSe() {
        return syncSyslogToSe;
    }

    /**
     * This is the setter method to the attribute.
     * Ability to sync the syslog server config to ses.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param syncSyslogToSe set the syncSyslogToSe.
     */
    public void setSyncSyslogToSe(Boolean  syncSyslogToSe) {
        this.syncSyslogToSe = syncSyslogToSe;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Syslog server destinations including address, port, transport protocol, and output format.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return syslogServerSettings
     */
    public List<SyslogServerConfig> getSyslogServerSettings() {
        return syslogServerSettings;
    }

    /**
     * This is the setter method. this will set the syslogServerSettings
     * Syslog server destinations including address, port, transport protocol, and output format.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return syslogServerSettings
     */
    public void setSyslogServerSettings(List<SyslogServerConfig>  syslogServerSettings) {
        this.syslogServerSettings = syslogServerSettings;
    }

    /**
     * This is the setter method this will set the syslogServerSettings
     * Syslog server destinations including address, port, transport protocol, and output format.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return syslogServerSettings
     */
    public SystemConfiguration addSyslogServerSettingsItem(SyslogServerConfig syslogServerSettingsItem) {
      if (this.syslogServerSettings == null) {
        this.syslogServerSettings = new ArrayList<SyslogServerConfig>();
      }
      this.syslogServerSettings.add(syslogServerSettingsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Telemetry configuration.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return telemetryConfiguration
     */
    public TelemetryConfiguration getTelemetryConfiguration() {
        return telemetryConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Telemetry configuration.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param telemetryConfiguration set the telemetryConfiguration.
     */
    public void setTelemetryConfiguration(TelemetryConfiguration telemetryConfiguration) {
        this.telemetryConfiguration = telemetryConfiguration;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Trusted host profiles for host header validation.
     * Only works when host_header_check is set to true.
     * It is a reference to an object of type trustedhostprofile.
     * Field introduced in 31.1.1.
     * Maximum of 20 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return trustedHostProfilesRefs
     */
    public List<String> getTrustedHostProfilesRefs() {
        return trustedHostProfilesRefs;
    }

    /**
     * This is the setter method. this will set the trustedHostProfilesRefs
     * Trusted host profiles for host header validation.
     * Only works when host_header_check is set to true.
     * It is a reference to an object of type trustedhostprofile.
     * Field introduced in 31.1.1.
     * Maximum of 20 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return trustedHostProfilesRefs
     */
    public void setTrustedHostProfilesRefs(List<String>  trustedHostProfilesRefs) {
        this.trustedHostProfilesRefs = trustedHostProfilesRefs;
    }

    /**
     * This is the setter method this will set the trustedHostProfilesRefs
     * Trusted host profiles for host header validation.
     * Only works when host_header_check is set to true.
     * It is a reference to an object of type trustedhostprofile.
     * Field introduced in 31.1.1.
     * Maximum of 20 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return trustedHostProfilesRefs
     */
    public SystemConfiguration addTrustedHostProfilesRefsItem(String trustedHostProfilesRefsItem) {
      if (this.trustedHostProfilesRefs == null) {
        this.trustedHostProfilesRefs = new ArrayList<String>();
      }
      this.trustedHostProfilesRefs.add(trustedHostProfilesRefsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reference to pkiprofile used for validating the ca certificates for external comminications from avi load balancer controller  this acts as trust
     * store for avi load balancer controller.
     * It is a reference to an object of type pkiprofile.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return truststorePkiprofileRef
     */
    public String getTruststorePkiprofileRef() {
        return truststorePkiprofileRef;
    }

    /**
     * This is the setter method to the attribute.
     * Reference to pkiprofile used for validating the ca certificates for external comminications from avi load balancer controller  this acts as trust
     * store for avi load balancer controller.
     * It is a reference to an object of type pkiprofile.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param truststorePkiprofileRef set the truststorePkiprofileRef.
     */
    public void setTruststorePkiprofileRef(String  truststorePkiprofileRef) {
        this.truststorePkiprofileRef = truststorePkiprofileRef;
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
  Objects.equals(this.controllerAnalyticsPolicy, objSystemConfiguration.controllerAnalyticsPolicy)&&
  Objects.equals(this.hostKeyAlgorithmExclude, objSystemConfiguration.hostKeyAlgorithmExclude)&&
  Objects.equals(this.kexAlgorithmExclude, objSystemConfiguration.kexAlgorithmExclude)&&
  Objects.equals(this.rekeyVolumeLimit, objSystemConfiguration.rekeyVolumeLimit)&&
  Objects.equals(this.rekeyTimeLimit, objSystemConfiguration.rekeyTimeLimit)&&
  Objects.equals(this.sddcmanagerFqdn, objSystemConfiguration.sddcmanagerFqdn)&&
  Objects.equals(this.enableHostHeaderCheck, objSystemConfiguration.enableHostHeaderCheck)&&
  Objects.equals(this.trustedHostProfilesRefs, objSystemConfiguration.trustedHostProfilesRefs)&&
  Objects.equals(this.telemetryConfiguration, objSystemConfiguration.telemetryConfiguration)&&
  Objects.equals(this.truststorePkiprofileRef, objSystemConfiguration.truststorePkiprofileRef)&&
  Objects.equals(this.legacySslSupport, objSystemConfiguration.legacySslSupport)&&
  Objects.equals(this.aviEmailLoginPassword, objSystemConfiguration.aviEmailLoginPassword)&&
  Objects.equals(this.syncKexHostToSe, objSystemConfiguration.syncKexHostToSe)&&
  Objects.equals(this.syncSyslogToSe, objSystemConfiguration.syncSyslogToSe)&&
  Objects.equals(this.licenseQuota, objSystemConfiguration.licenseQuota)&&
  Objects.equals(this.enableLicenseQuota, objSystemConfiguration.enableLicenseQuota)&&
  Objects.equals(this.serviceAuthConfigurations, objSystemConfiguration.serviceAuthConfigurations)&&
  Objects.equals(this.passwordPolicyManagedAtOps, objSystemConfiguration.passwordPolicyManagedAtOps)&&
  Objects.equals(this.aiAssistantEnabled, objSystemConfiguration.aiAssistantEnabled)&&
  Objects.equals(this.allowLegacySha1NtpAuth, objSystemConfiguration.allowLegacySha1NtpAuth)&&
  Objects.equals(this.certificateSecurityPolicy, objSystemConfiguration.certificateSecurityPolicy)&&
  Objects.equals(this.allowPrivateIps, objSystemConfiguration.allowPrivateIps)&&
  Objects.equals(this.syslogServerSettings, objSystemConfiguration.syslogServerSettings)&&
  Objects.equals(this.gslbClientCertRef, objSystemConfiguration.gslbClientCertRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SystemConfiguration {\n");
                  sb.append("    adminAuthConfiguration: ").append(toIndentedString(adminAuthConfiguration)).append("\n");
                        sb.append("    aiAssistantEnabled: ").append(toIndentedString(aiAssistantEnabled)).append("\n");
                        sb.append("    allowLegacySha1NtpAuth: ").append(toIndentedString(allowLegacySha1NtpAuth)).append("\n");
                        sb.append("    allowPrivateIps: ").append(toIndentedString(allowPrivateIps)).append("\n");
                        sb.append("    aviEmailLoginPassword: ").append(toIndentedString(aviEmailLoginPassword)).append("\n");
                        sb.append("    certificateSecurityPolicy: ").append(toIndentedString(certificateSecurityPolicy)).append("\n");
                        sb.append("    commonCriteriaMode: ").append(toIndentedString(commonCriteriaMode)).append("\n");
                        sb.append("    controllerAnalyticsPolicy: ").append(toIndentedString(controllerAnalyticsPolicy)).append("\n");
                        sb.append("    defaultLicenseTier: ").append(toIndentedString(defaultLicenseTier)).append("\n");
                        sb.append("    dnsConfiguration: ").append(toIndentedString(dnsConfiguration)).append("\n");
                        sb.append("    dnsVirtualserviceRefs: ").append(toIndentedString(dnsVirtualserviceRefs)).append("\n");
                        sb.append("    dockerMode: ").append(toIndentedString(dockerMode)).append("\n");
                        sb.append("    emailConfiguration: ").append(toIndentedString(emailConfiguration)).append("\n");
                        sb.append("    enableCors: ").append(toIndentedString(enableCors)).append("\n");
                        sb.append("    enableHostHeaderCheck: ").append(toIndentedString(enableHostHeaderCheck)).append("\n");
                        sb.append("    enableLicenseQuota: ").append(toIndentedString(enableLicenseQuota)).append("\n");
                        sb.append("    fipsMode: ").append(toIndentedString(fipsMode)).append("\n");
                        sb.append("    globalTenantConfig: ").append(toIndentedString(globalTenantConfig)).append("\n");
                        sb.append("    gslbClientCertRef: ").append(toIndentedString(gslbClientCertRef)).append("\n");
                        sb.append("    hostKeyAlgorithmExclude: ").append(toIndentedString(hostKeyAlgorithmExclude)).append("\n");
                        sb.append("    kexAlgorithmExclude: ").append(toIndentedString(kexAlgorithmExclude)).append("\n");
                        sb.append("    legacySslSupport: ").append(toIndentedString(legacySslSupport)).append("\n");
                        sb.append("    licenseQuota: ").append(toIndentedString(licenseQuota)).append("\n");
                        sb.append("    linuxConfiguration: ").append(toIndentedString(linuxConfiguration)).append("\n");
                        sb.append("    mgmtIpAccessControl: ").append(toIndentedString(mgmtIpAccessControl)).append("\n");
                        sb.append("    ntpConfiguration: ").append(toIndentedString(ntpConfiguration)).append("\n");
                        sb.append("    passwordPolicyManagedAtOps: ").append(toIndentedString(passwordPolicyManagedAtOps)).append("\n");
                        sb.append("    portalConfiguration: ").append(toIndentedString(portalConfiguration)).append("\n");
                        sb.append("    proxyConfiguration: ").append(toIndentedString(proxyConfiguration)).append("\n");
                        sb.append("    rekeyTimeLimit: ").append(toIndentedString(rekeyTimeLimit)).append("\n");
                        sb.append("    rekeyVolumeLimit: ").append(toIndentedString(rekeyVolumeLimit)).append("\n");
                        sb.append("    sddcmanagerFqdn: ").append(toIndentedString(sddcmanagerFqdn)).append("\n");
                        sb.append("    secureChannelConfiguration: ").append(toIndentedString(secureChannelConfiguration)).append("\n");
                        sb.append("    serviceAuthConfigurations: ").append(toIndentedString(serviceAuthConfigurations)).append("\n");
                        sb.append("    snmpConfiguration: ").append(toIndentedString(snmpConfiguration)).append("\n");
                        sb.append("    sshCiphers: ").append(toIndentedString(sshCiphers)).append("\n");
                        sb.append("    sshHmacs: ").append(toIndentedString(sshHmacs)).append("\n");
                        sb.append("    syncKexHostToSe: ").append(toIndentedString(syncKexHostToSe)).append("\n");
                        sb.append("    syncSyslogToSe: ").append(toIndentedString(syncSyslogToSe)).append("\n");
                        sb.append("    syslogServerSettings: ").append(toIndentedString(syslogServerSettings)).append("\n");
                        sb.append("    telemetryConfiguration: ").append(toIndentedString(telemetryConfiguration)).append("\n");
                        sb.append("    trustedHostProfilesRefs: ").append(toIndentedString(trustedHostProfilesRefs)).append("\n");
                        sb.append("    truststorePkiprofileRef: ").append(toIndentedString(truststorePkiprofileRef)).append("\n");
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

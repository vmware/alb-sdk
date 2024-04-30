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
 * The ALBServicesConfig is a POJO class extends AviRestResource that used for creating
 * ALBServicesConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ALBServicesConfig extends AviRestResource  {
    @JsonProperty("app_signature_config")
    private AppSignatureConfig appSignatureConfig;

    @JsonProperty("asset_contact")
    private ALBServicesUser assetContact;

    @JsonProperty("case_config")
    private CaseConfig caseConfig;

    @JsonProperty("feature_opt_in_status")
    private PortalFeatureOptIn featureOptInStatus;

    @JsonProperty("inventory_config")
    private InventoryConfiguration inventoryConfig;

    @JsonProperty("ip_reputation_config")
    private IpReputationConfig ipReputationConfig;

    @JsonProperty("mode")
    private String mode = "MYVMWARE";

    @JsonProperty("name")
    private String name;

    @JsonProperty("polling_interval")
    private Integer pollingInterval = 10;

    @JsonProperty("portal_url")
    private String portalUrl;

    @JsonProperty("saas_licensing_config")
    private SaasLicensingInfo saasLicensingConfig;

    @JsonProperty("session_config")
    private PulseServicesSessionConfig sessionConfig;

    @JsonProperty("split_proxy_configuration")
    private ProxyConfiguration splitProxyConfiguration;

    @JsonProperty("tenant_config")
    private PulseServicesTenantConfig tenantConfig;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("use_split_proxy")
    private Boolean useSplitProxy = false;

    @JsonProperty("use_tls")
    private Boolean useTls = true;

    @JsonProperty("user_agent_db_config")
    private UserAgentDBConfig userAgentDbConfig;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("waf_config")
    private WafCrsConfig wafConfig;



    /**
     * This is the getter method this will return the attribute value.
     * Default values for application signature sync.
     * Field introduced in 20.1.4.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return appSignatureConfig
     */
    public AppSignatureConfig getAppSignatureConfig() {
        return appSignatureConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Default values for application signature sync.
     * Field introduced in 20.1.4.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param appSignatureConfig set the appSignatureConfig.
     */
    public void setAppSignatureConfig(AppSignatureConfig appSignatureConfig) {
        this.appSignatureConfig = appSignatureConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Default contact for this controller cluster.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return assetContact
     */
    public ALBServicesUser getAssetContact() {
        return assetContact;
    }

    /**
     * This is the setter method to the attribute.
     * Default contact for this controller cluster.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param assetContact set the assetContact.
     */
    public void setAssetContact(ALBServicesUser assetContact) {
        this.assetContact = assetContact;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Default values for case management.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return caseConfig
     */
    public CaseConfig getCaseConfig() {
        return caseConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Default values for case management.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param caseConfig set the caseConfig.
     */
    public void setCaseConfig(CaseConfig caseConfig) {
        this.caseConfig = caseConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Features opt-in for pulse cloud services.
     * Field introduced in 20.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return featureOptInStatus
     */
    public PortalFeatureOptIn getFeatureOptInStatus() {
        return featureOptInStatus;
    }

    /**
     * This is the setter method to the attribute.
     * Features opt-in for pulse cloud services.
     * Field introduced in 20.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param featureOptInStatus set the featureOptInStatus.
     */
    public void setFeatureOptInStatus(PortalFeatureOptIn featureOptInStatus) {
        this.featureOptInStatus = featureOptInStatus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Inventory configurations for pulse cloud services.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return inventoryConfig
     */
    public InventoryConfiguration getInventoryConfig() {
        return inventoryConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Inventory configurations for pulse cloud services.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param inventoryConfig set the inventoryConfig.
     */
    public void setInventoryConfig(InventoryConfiguration inventoryConfig) {
        this.inventoryConfig = inventoryConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Default values to be used for ip reputation sync.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipReputationConfig
     */
    public IpReputationConfig getIpReputationConfig() {
        return ipReputationConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Default values to be used for ip reputation sync.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipReputationConfig set the ipReputationConfig.
     */
    public void setIpReputationConfig(IpReputationConfig ipReputationConfig) {
        this.ipReputationConfig = ipReputationConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Mode helps log collection and upload.
     * Enum options - MODE_UNKNOWN, SALESFORCE, SYSTEST, MYVMWARE, BROADCOM.
     * Field introduced in 20.1.2.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- salesforce,myvmware,systest), basic edition(allowed values-
     * salesforce,myvmware,systest), enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "MYVMWARE".
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * This is the setter method to the attribute.
     * Mode helps log collection and upload.
     * Enum options - MODE_UNKNOWN, SALESFORCE, SYSTEST, MYVMWARE, BROADCOM.
     * Field introduced in 20.1.2.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- salesforce,myvmware,systest), basic edition(allowed values-
     * salesforce,myvmware,systest), enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "MYVMWARE".
     * @param mode set the mode.
     */
    public void setMode(String  mode) {
        this.mode = mode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the albservicesconfig object.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the albservicesconfig object.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time interval in minutes.
     * Allowed values are 5-60.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return pollingInterval
     */
    public Integer getPollingInterval() {
        return pollingInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Time interval in minutes.
     * Allowed values are 5-60.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param pollingInterval set the pollingInterval.
     */
    public void setPollingInterval(Integer  pollingInterval) {
        this.pollingInterval = pollingInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The fqdn or ip address of the pulse cloud services.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return portalUrl
     */
    public String getPortalUrl() {
        return portalUrl;
    }

    /**
     * This is the setter method to the attribute.
     * The fqdn or ip address of the pulse cloud services.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param portalUrl set the portalUrl.
     */
    public void setPortalUrl(String  portalUrl) {
        this.portalUrl = portalUrl;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Saas licensing configuration.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return saasLicensingConfig
     */
    public SaasLicensingInfo getSaasLicensingConfig() {
        return saasLicensingConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Saas licensing configuration.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param saasLicensingConfig set the saasLicensingConfig.
     */
    public void setSaasLicensingConfig(SaasLicensingInfo saasLicensingConfig) {
        this.saasLicensingConfig = saasLicensingConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Session configuration data.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sessionConfig
     */
    public PulseServicesSessionConfig getSessionConfig() {
        return sessionConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Session configuration data.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sessionConfig set the sessionConfig.
     */
    public void setSessionConfig(PulseServicesSessionConfig sessionConfig) {
        this.sessionConfig = sessionConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Split proxy configuration to connect external pulse cloud services.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return splitProxyConfiguration
     */
    public ProxyConfiguration getSplitProxyConfiguration() {
        return splitProxyConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Split proxy configuration to connect external pulse cloud services.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param splitProxyConfiguration set the splitProxyConfiguration.
     */
    public void setSplitProxyConfiguration(ProxyConfiguration splitProxyConfiguration) {
        this.splitProxyConfiguration = splitProxyConfiguration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenant based configuration data.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantConfig
     */
    public PulseServicesTenantConfig getTenantConfig() {
        return tenantConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Tenant based configuration data.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantConfig set the tenantConfig.
     */
    public void setTenantConfig(PulseServicesTenantConfig tenantConfig) {
        this.tenantConfig = tenantConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenant uuid associated with the object.
     * It is a reference to an object of type tenant.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * Tenant uuid associated with the object.
     * It is a reference to an object of type tenant.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantRef set the tenantRef.
     */
    public void setTenantRef(String  tenantRef) {
        this.tenantRef = tenantRef;
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
     * By default, pulse cloud services uses proxy added in system configuration.
     * If it should use a separate proxy, set this flag to true and configure split proxy configuration.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return useSplitProxy
     */
    public Boolean getUseSplitProxy() {
        return useSplitProxy;
    }

    /**
     * This is the setter method to the attribute.
     * By default, pulse cloud services uses proxy added in system configuration.
     * If it should use a separate proxy, set this flag to true and configure split proxy configuration.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param useSplitProxy set the useSplitProxy.
     */
    public void setUseSplitProxy(Boolean  useSplitProxy) {
        this.useSplitProxy = useSplitProxy;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Secure the controller to pulse cloud services communication over tls.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return useTls
     */
    public Boolean getUseTls() {
        return useTls;
    }

    /**
     * This is the setter method to the attribute.
     * Secure the controller to pulse cloud services communication over tls.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param useTls set the useTls.
     */
    public void setUseTls(Boolean  useTls) {
        this.useTls = useTls;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Default values for user agent db service.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return userAgentDbConfig
     */
    public UserAgentDBConfig getUserAgentDbConfig() {
        return userAgentDbConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Default values for user agent db service.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param userAgentDbConfig set the userAgentDbConfig.
     */
    public void setUserAgentDbConfig(UserAgentDBConfig userAgentDbConfig) {
        this.userAgentDbConfig = userAgentDbConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Default values for waf management.
     * Field introduced in 21.1.1.
     * Allowed in essentials edition with any value, basic edition with any value, enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return wafConfig
     */
    public WafCrsConfig getWafConfig() {
        return wafConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Default values for waf management.
     * Field introduced in 21.1.1.
     * Allowed in essentials edition with any value, basic edition with any value, enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param wafConfig set the wafConfig.
     */
    public void setWafConfig(WafCrsConfig wafConfig) {
        this.wafConfig = wafConfig;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ALBServicesConfig objALBServicesConfig = (ALBServicesConfig) o;
      return   Objects.equals(this.uuid, objALBServicesConfig.uuid)&&
  Objects.equals(this.portalUrl, objALBServicesConfig.portalUrl)&&
  Objects.equals(this.pollingInterval, objALBServicesConfig.pollingInterval)&&
  Objects.equals(this.assetContact, objALBServicesConfig.assetContact)&&
  Objects.equals(this.featureOptInStatus, objALBServicesConfig.featureOptInStatus)&&
  Objects.equals(this.useSplitProxy, objALBServicesConfig.useSplitProxy)&&
  Objects.equals(this.splitProxyConfiguration, objALBServicesConfig.splitProxyConfiguration)&&
  Objects.equals(this.ipReputationConfig, objALBServicesConfig.ipReputationConfig)&&
  Objects.equals(this.useTls, objALBServicesConfig.useTls)&&
  Objects.equals(this.mode, objALBServicesConfig.mode)&&
  Objects.equals(this.appSignatureConfig, objALBServicesConfig.appSignatureConfig)&&
  Objects.equals(this.userAgentDbConfig, objALBServicesConfig.userAgentDbConfig)&&
  Objects.equals(this.wafConfig, objALBServicesConfig.wafConfig)&&
  Objects.equals(this.caseConfig, objALBServicesConfig.caseConfig)&&
  Objects.equals(this.saasLicensingConfig, objALBServicesConfig.saasLicensingConfig)&&
  Objects.equals(this.tenantRef, objALBServicesConfig.tenantRef)&&
  Objects.equals(this.name, objALBServicesConfig.name)&&
  Objects.equals(this.tenantConfig, objALBServicesConfig.tenantConfig)&&
  Objects.equals(this.sessionConfig, objALBServicesConfig.sessionConfig)&&
  Objects.equals(this.inventoryConfig, objALBServicesConfig.inventoryConfig);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ALBServicesConfig {\n");
                  sb.append("    appSignatureConfig: ").append(toIndentedString(appSignatureConfig)).append("\n");
                        sb.append("    assetContact: ").append(toIndentedString(assetContact)).append("\n");
                        sb.append("    caseConfig: ").append(toIndentedString(caseConfig)).append("\n");
                        sb.append("    featureOptInStatus: ").append(toIndentedString(featureOptInStatus)).append("\n");
                        sb.append("    inventoryConfig: ").append(toIndentedString(inventoryConfig)).append("\n");
                        sb.append("    ipReputationConfig: ").append(toIndentedString(ipReputationConfig)).append("\n");
                        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    pollingInterval: ").append(toIndentedString(pollingInterval)).append("\n");
                        sb.append("    portalUrl: ").append(toIndentedString(portalUrl)).append("\n");
                        sb.append("    saasLicensingConfig: ").append(toIndentedString(saasLicensingConfig)).append("\n");
                        sb.append("    sessionConfig: ").append(toIndentedString(sessionConfig)).append("\n");
                        sb.append("    splitProxyConfiguration: ").append(toIndentedString(splitProxyConfiguration)).append("\n");
                        sb.append("    tenantConfig: ").append(toIndentedString(tenantConfig)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                                    sb.append("    useSplitProxy: ").append(toIndentedString(useSplitProxy)).append("\n");
                        sb.append("    useTls: ").append(toIndentedString(useTls)).append("\n");
                        sb.append("    userAgentDbConfig: ").append(toIndentedString(userAgentDbConfig)).append("\n");
                        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    wafConfig: ").append(toIndentedString(wafConfig)).append("\n");
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

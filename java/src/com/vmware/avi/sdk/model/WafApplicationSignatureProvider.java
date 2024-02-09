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
 * The WafApplicationSignatureProvider is a POJO class extends AviRestResource that used for creating
 * WafApplicationSignatureProvider.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WafApplicationSignatureProvider extends AviRestResource  {
    @JsonProperty("available_applications")
    private List<WafApplicationSignatureAppVersion> availableApplications;

    @JsonProperty("filter_rules_on_import")
    private Boolean filterRulesOnImport = true;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ruleset_version")
    private String rulesetVersion;

    @JsonProperty("service_status")
    private WebApplicationSignatureServiceStatus serviceStatus;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;


    /**
     * This is the getter method this will return the attribute value.
     * Available application names and the ruleset version, when the rules for an application changed the last time.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * @return availableApplications
     */
    public List<WafApplicationSignatureAppVersion> getAvailableApplications() {
        return availableApplications;
    }

    /**
     * This is the setter method. this will set the availableApplications
     * Available application names and the ruleset version, when the rules for an application changed the last time.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * @return availableApplications
     */
    public void setAvailableApplications(List<WafApplicationSignatureAppVersion>  availableApplications) {
        this.availableApplications = availableApplications;
    }

    /**
     * This is the setter method this will set the availableApplications
     * Available application names and the ruleset version, when the rules for an application changed the last time.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * @return availableApplications
     */
    public WafApplicationSignatureProvider addAvailableApplicationsItem(WafApplicationSignatureAppVersion availableApplicationsItem) {
      if (this.availableApplications == null) {
        this.availableApplications = new ArrayList<WafApplicationSignatureAppVersion>();
      }
      this.availableApplications.add(availableApplicationsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If this is set to false, all provided rules are imported when updating this object.
     * If this is set to true, only newer rules are considered for import.
     * Newer rules are rules where the rule id is not in the range of 2,000,000 to 2,080,000 or where the rule has a tag with a cve from 2013 or newer.
     * All other rules are ignored on rule import.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return filterRulesOnImport
     */
    public Boolean getFilterRulesOnImport() {
        return filterRulesOnImport;
    }

    /**
     * This is the setter method to the attribute.
     * If this is set to false, all provided rules are imported when updating this object.
     * If this is set to true, only newer rules are considered for import.
     * Newer rules are rules where the rule id is not in the range of 2,000,000 to 2,080,000 or where the rule has a tag with a cve from 2013 or newer.
     * All other rules are ignored on rule import.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param filterRulesOnImport set the filterRulesOnImport.
     */
    public void setFilterRulesOnImport(Boolean  filterRulesOnImport) {
        this.filterRulesOnImport = filterRulesOnImport;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of application specific ruleset provider.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of application specific ruleset provider.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Version of signatures.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * @return rulesetVersion
     */
    public String getRulesetVersion() {
        return rulesetVersion;
    }

    /**
     * This is the setter method to the attribute.
     * Version of signatures.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * @param rulesetVersion set the rulesetVersion.
     */
    public void setRulesetVersion(String  rulesetVersion) {
        this.rulesetVersion = rulesetVersion;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If this object is managed by the application signatures update service, this field contain the status of this syncronization.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceStatus
     */
    public WebApplicationSignatureServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    /**
     * This is the setter method to the attribute.
     * If this object is managed by the application signatures update service, this field contain the status of this syncronization.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serviceStatus set the serviceStatus.
     */
    public void setServiceStatus(WebApplicationSignatureServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type tenant.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type tenant.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      WafApplicationSignatureProvider objWafApplicationSignatureProvider = (WafApplicationSignatureProvider) o;
      return   Objects.equals(this.uuid, objWafApplicationSignatureProvider.uuid)&&
  Objects.equals(this.name, objWafApplicationSignatureProvider.name)&&
  Objects.equals(this.tenantRef, objWafApplicationSignatureProvider.tenantRef)&&
  Objects.equals(this.rulesetVersion, objWafApplicationSignatureProvider.rulesetVersion)&&
  Objects.equals(this.availableApplications, objWafApplicationSignatureProvider.availableApplications)&&
  Objects.equals(this.serviceStatus, objWafApplicationSignatureProvider.serviceStatus)&&
  Objects.equals(this.filterRulesOnImport, objWafApplicationSignatureProvider.filterRulesOnImport);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WafApplicationSignatureProvider {\n");
                  sb.append("    availableApplications: ").append(toIndentedString(availableApplications)).append("\n");
                        sb.append("    filterRulesOnImport: ").append(toIndentedString(filterRulesOnImport)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    rulesetVersion: ").append(toIndentedString(rulesetVersion)).append("\n");
                        sb.append("    serviceStatus: ").append(toIndentedString(serviceStatus)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

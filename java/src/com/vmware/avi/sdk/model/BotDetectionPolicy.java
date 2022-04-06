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
 * The BotDetectionPolicy is a POJO class extends AviRestResource that used for creating
 * BotDetectionPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BotDetectionPolicy extends AviRestResource  {
    @JsonProperty("allow_list")
    private BotAllowList allowList = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("ip_location_detector")
    private BotConfigIPLocation ipLocationDetector = null;

    @JsonProperty("ip_reputation_detector")
    private BotConfigIPReputation ipReputationDetector = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("system_bot_mapping_ref")
    private String systemBotMappingRef = null;

    @JsonProperty("system_consolidator_ref")
    private String systemConsolidatorRef = null;

    @JsonProperty("tenant_ref")
    private String tenantRef = null;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("user_agent_detector")
    private BotConfigUserAgent userAgentDetector = null;

    @JsonProperty("user_bot_mapping_ref")
    private String userBotMappingRef = null;

    @JsonProperty("user_consolidator_ref")
    private String userConsolidatorRef = null;

    @JsonProperty("uuid")
    private String uuid = null;



    /**
     * This is the getter method this will return the attribute value.
     * Allow the user to skip botmanagement for selected requests.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return allowList
     */
    public BotAllowList getAllowList() {
        return allowList;
    }

    /**
     * This is the setter method to the attribute.
     * Allow the user to skip botmanagement for selected requests.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param allowList set the allowList.
     */
    public void setAllowList(BotAllowList allowList) {
        this.allowList = allowList;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Human-readable description of this bot detection policy.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Human-readable description of this bot detection policy.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The ip location configuration used in this policy.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipLocationDetector
     */
    public BotConfigIPLocation getIpLocationDetector() {
        return ipLocationDetector;
    }

    /**
     * This is the setter method to the attribute.
     * The ip location configuration used in this policy.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipLocationDetector set the ipLocationDetector.
     */
    public void setIpLocationDetector(BotConfigIPLocation ipLocationDetector) {
        this.ipLocationDetector = ipLocationDetector;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The ip reputation configuration used in this policy.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipReputationDetector
     */
    public BotConfigIPReputation getIpReputationDetector() {
        return ipReputationDetector;
    }

    /**
     * This is the setter method to the attribute.
     * The ip reputation configuration used in this policy.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipReputationDetector set the ipReputationDetector.
     */
    public void setIpReputationDetector(BotConfigIPReputation ipReputationDetector) {
        this.ipReputationDetector = ipReputationDetector;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The name of this bot detection policy.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * The name of this bot detection policy.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * System-defined rules for classification.
     * It is a reference to an object of type botmapping.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return systemBotMappingRef
     */
    public String getSystemBotMappingRef() {
        return systemBotMappingRef;
    }

    /**
     * This is the setter method to the attribute.
     * System-defined rules for classification.
     * It is a reference to an object of type botmapping.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param systemBotMappingRef set the systemBotMappingRef.
     */
    public void setSystemBotMappingRef(String  systemBotMappingRef) {
        this.systemBotMappingRef = systemBotMappingRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The installation provides an updated ruleset for consolidating the results of different decider phases.
     * It is a reference to an object of type botconfigconsolidator.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return systemConsolidatorRef
     */
    public String getSystemConsolidatorRef() {
        return systemConsolidatorRef;
    }

    /**
     * This is the setter method to the attribute.
     * The installation provides an updated ruleset for consolidating the results of different decider phases.
     * It is a reference to an object of type botconfigconsolidator.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param systemConsolidatorRef set the systemConsolidatorRef.
     */
    public void setSystemConsolidatorRef(String  systemConsolidatorRef) {
        this.systemConsolidatorRef = systemConsolidatorRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The unique identifier of the tenant to which this policy belongs.
     * It is a reference to an object of type tenant.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * The unique identifier of the tenant to which this policy belongs.
     * It is a reference to an object of type tenant.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
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
     * The user-agent configuration used in this policy.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return userAgentDetector
     */
    public BotConfigUserAgent getUserAgentDetector() {
        return userAgentDetector;
    }

    /**
     * This is the setter method to the attribute.
     * The user-agent configuration used in this policy.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param userAgentDetector set the userAgentDetector.
     */
    public void setUserAgentDetector(BotConfigUserAgent userAgentDetector) {
        this.userAgentDetector = userAgentDetector;
    }

    /**
     * This is the getter method this will return the attribute value.
     * User-defined rules for classification.
     * These are applied before the system classification rules.
     * If a rule matches, processing terminates and the system-defined rules will not run.
     * It is a reference to an object of type botmapping.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return userBotMappingRef
     */
    public String getUserBotMappingRef() {
        return userBotMappingRef;
    }

    /**
     * This is the setter method to the attribute.
     * User-defined rules for classification.
     * These are applied before the system classification rules.
     * If a rule matches, processing terminates and the system-defined rules will not run.
     * It is a reference to an object of type botmapping.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param userBotMappingRef set the userBotMappingRef.
     */
    public void setUserBotMappingRef(String  userBotMappingRef) {
        this.userBotMappingRef = userBotMappingRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The user-provided ruleset for consolidating the results of different decider phases.
     * This runs before the system consolidator.
     * If it successfully sets a consolidation, the system consolidator will not change it.
     * It is a reference to an object of type botconfigconsolidator.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return userConsolidatorRef
     */
    public String getUserConsolidatorRef() {
        return userConsolidatorRef;
    }

    /**
     * This is the setter method to the attribute.
     * The user-provided ruleset for consolidating the results of different decider phases.
     * This runs before the system consolidator.
     * If it successfully sets a consolidation, the system consolidator will not change it.
     * It is a reference to an object of type botconfigconsolidator.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param userConsolidatorRef set the userConsolidatorRef.
     */
    public void setUserConsolidatorRef(String  userConsolidatorRef) {
        this.userConsolidatorRef = userConsolidatorRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * A unique identifier to this bot detection policy.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * A unique identifier to this bot detection policy.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
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
      BotDetectionPolicy objBotDetectionPolicy = (BotDetectionPolicy) o;
      return   Objects.equals(this.uuid, objBotDetectionPolicy.uuid)&&
  Objects.equals(this.tenantRef, objBotDetectionPolicy.tenantRef)&&
  Objects.equals(this.name, objBotDetectionPolicy.name)&&
  Objects.equals(this.description, objBotDetectionPolicy.description)&&
  Objects.equals(this.allowList, objBotDetectionPolicy.allowList)&&
  Objects.equals(this.ipReputationDetector, objBotDetectionPolicy.ipReputationDetector)&&
  Objects.equals(this.ipLocationDetector, objBotDetectionPolicy.ipLocationDetector)&&
  Objects.equals(this.userAgentDetector, objBotDetectionPolicy.userAgentDetector)&&
  Objects.equals(this.userConsolidatorRef, objBotDetectionPolicy.userConsolidatorRef)&&
  Objects.equals(this.systemConsolidatorRef, objBotDetectionPolicy.systemConsolidatorRef)&&
  Objects.equals(this.userBotMappingRef, objBotDetectionPolicy.userBotMappingRef)&&
  Objects.equals(this.systemBotMappingRef, objBotDetectionPolicy.systemBotMappingRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BotDetectionPolicy {\n");
                  sb.append("    allowList: ").append(toIndentedString(allowList)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    ipLocationDetector: ").append(toIndentedString(ipLocationDetector)).append("\n");
                        sb.append("    ipReputationDetector: ").append(toIndentedString(ipReputationDetector)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    systemBotMappingRef: ").append(toIndentedString(systemBotMappingRef)).append("\n");
                        sb.append("    systemConsolidatorRef: ").append(toIndentedString(systemConsolidatorRef)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                                    sb.append("    userAgentDetector: ").append(toIndentedString(userAgentDetector)).append("\n");
                        sb.append("    userBotMappingRef: ").append(toIndentedString(userBotMappingRef)).append("\n");
                        sb.append("    userConsolidatorRef: ").append(toIndentedString(userConsolidatorRef)).append("\n");
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

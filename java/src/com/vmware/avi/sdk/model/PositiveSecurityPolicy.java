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
 * The PositiveSecurityPolicy is a POJO class extends AviRestResource that used for creating
 * PositiveSecurityPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PositiveSecurityPolicy extends AviRestResource  {
    @JsonProperty("description")
    private String description;

    @JsonProperty("enable_positive_security_rule_updates")
    private Boolean enablePositiveSecurityRuleUpdates = false;

    @JsonIgnore
    private Boolean enableRegexProgramming = false;

    @JsonProperty("name")
    private String name;

    @JsonProperty("positive_security_params")
    private PositiveSecurityParams positiveSecurityParams;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Details of the positive security configuration.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Details of the positive security configuration.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable positive security rule generation using the application learning data rules will be programmed in a dedicated learning group.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enablePositiveSecurityRuleUpdates
     */
    public Boolean getEnablePositiveSecurityRuleUpdates() {
        return enablePositiveSecurityRuleUpdates;
    }

    /**
     * This is the setter method to the attribute.
     * Enable positive security rule generation using the application learning data rules will be programmed in a dedicated learning group.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enablePositiveSecurityRuleUpdates set the enablePositiveSecurityRuleUpdates.
     */
    public void setEnablePositiveSecurityRuleUpdates(Boolean  enablePositiveSecurityRuleUpdates) {
        this.enablePositiveSecurityRuleUpdates = enablePositiveSecurityRuleUpdates;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable dynamic regex generation for positive security rules.
     * This is an experimental feature and shouldn't be used in production.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableRegexProgramming
     */
    public Boolean getEnableRegexProgramming() {
        return enableRegexProgramming;
    }

    /**
     * This is the setter method to the attribute.
     * Enable dynamic regex generation for positive security rules.
     * This is an experimental feature and shouldn't be used in production.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableRegexProgramming set the enableRegexProgramming.
     */
    public void setEnableRegexProgramming(Boolean  enableRegexProgramming) {
        this.enableRegexProgramming = enableRegexProgramming;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The name of the positivesecurity configuration.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * The name of the positivesecurity configuration.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Parameters for generating positive security rules.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return positiveSecurityParams
     */
    public PositiveSecurityParams getPositiveSecurityParams() {
        return positiveSecurityParams;
    }

    /**
     * This is the setter method to the attribute.
     * Parameters for generating positive security rules.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param positiveSecurityParams set the positiveSecurityParams.
     */
    public void setPositiveSecurityParams(PositiveSecurityParams positiveSecurityParams) {
        this.positiveSecurityParams = positiveSecurityParams;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Details of the tenant for positive security policy.
     * It is a reference to an object of type tenant.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * Details of the tenant for positive security policy.
     * It is a reference to an object of type tenant.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
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
     * Uuid of the positive security configuration.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the positive security configuration.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
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
      PositiveSecurityPolicy objPositiveSecurityPolicy = (PositiveSecurityPolicy) o;
      return   Objects.equals(this.uuid, objPositiveSecurityPolicy.uuid)&&
  Objects.equals(this.name, objPositiveSecurityPolicy.name)&&
  Objects.equals(this.description, objPositiveSecurityPolicy.description)&&
  Objects.equals(this.tenantRef, objPositiveSecurityPolicy.tenantRef)&&
  Objects.equals(this.enablePositiveSecurityRuleUpdates, objPositiveSecurityPolicy.enablePositiveSecurityRuleUpdates)&&
  Objects.equals(this.positiveSecurityParams, objPositiveSecurityPolicy.positiveSecurityParams)&&
  Objects.equals(this.enableRegexProgramming, objPositiveSecurityPolicy.enableRegexProgramming);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PositiveSecurityPolicy {\n");
                  sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    enablePositiveSecurityRuleUpdates: ").append(toIndentedString(enablePositiveSecurityRuleUpdates)).append("\n");
                        sb.append("    enableRegexProgramming: ").append(toIndentedString(enableRegexProgramming)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    positiveSecurityParams: ").append(toIndentedString(positiveSecurityParams)).append("\n");
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

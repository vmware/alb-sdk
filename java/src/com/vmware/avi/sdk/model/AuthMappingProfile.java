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
 * The AuthMappingProfile is a POJO class extends AviRestResource that used for creating
 * AuthMappingProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthMappingProfile extends AviRestResource  {
    @JsonProperty("allow_unlabelled_access")
    private Boolean allowUnlabelledAccess = true;

    @JsonProperty("description")
    private String description;

    @JsonProperty("dynamic_role_filters")
    private List<RoleFilter> dynamicRoleFilters;

    @JsonProperty("mapping_rules")
    private List<AuthMappingRule> mappingRules;

    @JsonProperty("name")
    private String name;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("type")
    private String type;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Allow access to unlabelled objects.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return allowUnlabelledAccess
     */
    public Boolean getAllowUnlabelledAccess() {
        return allowUnlabelledAccess;
    }

    /**
     * This is the setter method to the attribute.
     * Allow access to unlabelled objects.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param allowUnlabelledAccess set the allowUnlabelledAccess.
     */
    public void setAllowUnlabelledAccess(Boolean  allowUnlabelledAccess) {
        this.allowUnlabelledAccess = allowUnlabelledAccess;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Description for the authmappingprofile.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Description for the authmappingprofile.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Filters for granular object access control based on object labels.
     * Multiple filters are merged using the and operator.
     * If empty, all objects according to the privileges will be accessible to the user.
     * Field introduced in 32.1.1.
     * Maximum of 4 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dynamicRoleFilters
     */
    public List<RoleFilter> getDynamicRoleFilters() {
        return dynamicRoleFilters;
    }

    /**
     * This is the setter method. this will set the dynamicRoleFilters
     * Filters for granular object access control based on object labels.
     * Multiple filters are merged using the and operator.
     * If empty, all objects according to the privileges will be accessible to the user.
     * Field introduced in 32.1.1.
     * Maximum of 4 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dynamicRoleFilters
     */
    public void setDynamicRoleFilters(List<RoleFilter>  dynamicRoleFilters) {
        this.dynamicRoleFilters = dynamicRoleFilters;
    }

    /**
     * This is the setter method this will set the dynamicRoleFilters
     * Filters for granular object access control based on object labels.
     * Multiple filters are merged using the and operator.
     * If empty, all objects according to the privileges will be accessible to the user.
     * Field introduced in 32.1.1.
     * Maximum of 4 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dynamicRoleFilters
     */
    public AuthMappingProfile addDynamicRoleFiltersItem(RoleFilter dynamicRoleFiltersItem) {
      if (this.dynamicRoleFilters == null) {
        this.dynamicRoleFilters = new ArrayList<RoleFilter>();
      }
      this.dynamicRoleFilters.add(dynamicRoleFiltersItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Rules list for tenant or role mapping.
     * Field introduced in 22.1.1.
     * Minimum of 1 items required.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mappingRules
     */
    public List<AuthMappingRule> getMappingRules() {
        return mappingRules;
    }

    /**
     * This is the setter method. this will set the mappingRules
     * Rules list for tenant or role mapping.
     * Field introduced in 22.1.1.
     * Minimum of 1 items required.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mappingRules
     */
    public void setMappingRules(List<AuthMappingRule>  mappingRules) {
        this.mappingRules = mappingRules;
    }

    /**
     * This is the setter method this will set the mappingRules
     * Rules list for tenant or role mapping.
     * Field introduced in 22.1.1.
     * Minimum of 1 items required.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mappingRules
     */
    public AuthMappingProfile addMappingRulesItem(AuthMappingRule mappingRulesItem) {
      if (this.mappingRules == null) {
        this.mappingRules = new ArrayList<AuthMappingRule>();
      }
      this.mappingRules.add(mappingRulesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the authmappingprofile.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the authmappingprofile.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenant ref for the auth mapping profile.
     * It is a reference to an object of type tenant.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * Tenant ref for the auth mapping profile.
     * It is a reference to an object of type tenant.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantRef set the tenantRef.
     */
    public void setTenantRef(String  tenantRef) {
        this.tenantRef = tenantRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Type of the auth profile for which these rules can be linked.
     * Enum options - AUTH_PROFILE_LDAP, AUTH_PROFILE_TACACS_PLUS, AUTH_PROFILE_SAML, AUTH_PROFILE_PINGACCESS, AUTH_PROFILE_JWT, AUTH_PROFILE_OAUTH,
     * AUTH_PROFILE_CLIENT_CERT.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * Type of the auth profile for which these rules can be linked.
     * Enum options - AUTH_PROFILE_LDAP, AUTH_PROFILE_TACACS_PLUS, AUTH_PROFILE_SAML, AUTH_PROFILE_PINGACCESS, AUTH_PROFILE_JWT, AUTH_PROFILE_OAUTH,
     * AUTH_PROFILE_CLIENT_CERT.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
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
     * Uuid of the authmappingprofile.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the authmappingprofile.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
      AuthMappingProfile objAuthMappingProfile = (AuthMappingProfile) o;
      return   Objects.equals(this.uuid, objAuthMappingProfile.uuid)&&
  Objects.equals(this.name, objAuthMappingProfile.name)&&
  Objects.equals(this.type, objAuthMappingProfile.type)&&
  Objects.equals(this.mappingRules, objAuthMappingProfile.mappingRules)&&
  Objects.equals(this.description, objAuthMappingProfile.description)&&
  Objects.equals(this.tenantRef, objAuthMappingProfile.tenantRef)&&
  Objects.equals(this.allowUnlabelledAccess, objAuthMappingProfile.allowUnlabelledAccess)&&
  Objects.equals(this.dynamicRoleFilters, objAuthMappingProfile.dynamicRoleFilters);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AuthMappingProfile {\n");
                  sb.append("    allowUnlabelledAccess: ").append(toIndentedString(allowUnlabelledAccess)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    dynamicRoleFilters: ").append(toIndentedString(dynamicRoleFilters)).append("\n");
                        sb.append("    mappingRules: ").append(toIndentedString(mappingRules)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

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
 * The ApiRateLimitProfile is a POJO class extends AviRestResource that used for creating
 * ApiRateLimitProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiRateLimitProfile extends AviRestResource  {
    @JsonProperty("description")
    private String description;

    @JsonProperty("enabled")
    private Boolean enabled = true;

    @JsonProperty("name")
    private String name;

    @JsonProperty("rate_limit_configuration_refs")
    private List<String> rateLimitConfigurationRefs;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Description for the api rate limit profile.
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
     * Description for the api rate limit profile.
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
     * Activate/deactivate the api rate limit profile.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This is the setter method to the attribute.
     * Activate/deactivate the api rate limit profile.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param enabled set the enabled.
     */
    public void setEnabled(Boolean  enabled) {
        this.enabled = enabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the api rate limit profile.
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
     * Name of the api rate limit profile.
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
     * List of the rate limiter configuration uuids.
     * It is a reference to an object of type ratelimitconfiguration.
     * Field introduced in 31.2.1.
     * Minimum of 1 items required.
     * Maximum of 100 items allowed.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rateLimitConfigurationRefs
     */
    public List<String> getRateLimitConfigurationRefs() {
        return rateLimitConfigurationRefs;
    }

    /**
     * This is the setter method. this will set the rateLimitConfigurationRefs
     * List of the rate limiter configuration uuids.
     * It is a reference to an object of type ratelimitconfiguration.
     * Field introduced in 31.2.1.
     * Minimum of 1 items required.
     * Maximum of 100 items allowed.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rateLimitConfigurationRefs
     */
    public void setRateLimitConfigurationRefs(List<String>  rateLimitConfigurationRefs) {
        this.rateLimitConfigurationRefs = rateLimitConfigurationRefs;
    }

    /**
     * This is the setter method this will set the rateLimitConfigurationRefs
     * List of the rate limiter configuration uuids.
     * It is a reference to an object of type ratelimitconfiguration.
     * Field introduced in 31.2.1.
     * Minimum of 1 items required.
     * Maximum of 100 items allowed.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rateLimitConfigurationRefs
     */
    public ApiRateLimitProfile addRateLimitConfigurationRefsItem(String rateLimitConfigurationRefsItem) {
      if (this.rateLimitConfigurationRefs == null) {
        this.rateLimitConfigurationRefs = new ArrayList<String>();
      }
      this.rateLimitConfigurationRefs.add(rateLimitConfigurationRefsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenant ref for the api rate limit profile.
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
     * Tenant ref for the api rate limit profile.
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
     * Uuid of the api rate limit profile.
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
     * Uuid of the api rate limit profile.
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
      ApiRateLimitProfile objApiRateLimitProfile = (ApiRateLimitProfile) o;
      return   Objects.equals(this.uuid, objApiRateLimitProfile.uuid)&&
  Objects.equals(this.name, objApiRateLimitProfile.name)&&
  Objects.equals(this.rateLimitConfigurationRefs, objApiRateLimitProfile.rateLimitConfigurationRefs)&&
  Objects.equals(this.description, objApiRateLimitProfile.description)&&
  Objects.equals(this.tenantRef, objApiRateLimitProfile.tenantRef)&&
  Objects.equals(this.enabled, objApiRateLimitProfile.enabled);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApiRateLimitProfile {\n");
                  sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    rateLimitConfigurationRefs: ").append(toIndentedString(rateLimitConfigurationRefs)).append("\n");
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

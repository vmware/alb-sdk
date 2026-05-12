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
 * The LicenseInfo is a POJO class extends AviRestResource that used for creating
 * LicenseInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LicenseInfo extends AviRestResource  {
    @JsonProperty("last_updated")
    private Integer lastUpdated;

    @JsonProperty("se_group")
    private String seGroup;

    @JsonProperty("service_cores")
    private Float serviceCores;

    @JsonProperty("tenant_uuid")
    private String tenantUuid;

    @JsonProperty("tier")
    private String tier;

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Last updated time.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return lastUpdated
     */
    public Integer getLastUpdated() {
        return lastUpdated;
    }

    /**
     * This is the setter method to the attribute.
     * Last updated time.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param lastUpdated set the lastUpdated.
     */
    public void setLastUpdated(Integer  lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Se group for this license entry.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGroup
     */
    public String getSeGroup() {
        return seGroup;
    }

    /**
     * This is the setter method to the attribute.
     * Se group for this license entry.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seGroup set the seGroup.
     */
    public void setSeGroup(String  seGroup) {
        this.seGroup = seGroup;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Quantity of service cores.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceCores
     */
    public Float getServiceCores() {
        return serviceCores;
    }

    /**
     * This is the setter method to the attribute.
     * Quantity of service cores.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serviceCores set the serviceCores.
     */
    public void setServiceCores(Float  serviceCores) {
        this.serviceCores = serviceCores;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Specifies the license tier.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantUuid
     */
    public String getTenantUuid() {
        return tenantUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Specifies the license tier.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantUuid set the tenantUuid.
     */
    public void setTenantUuid(String  tenantUuid) {
        this.tenantUuid = tenantUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Specifies the license tier.
     * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC, ESSENTIALS, ENTERPRISE_WITH_CLOUD_SERVICES.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tier
     */
    public String getTier() {
        return tier;
    }

    /**
     * This is the setter method to the attribute.
     * Specifies the license tier.
     * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC, ESSENTIALS, ENTERPRISE_WITH_CLOUD_SERVICES.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tier set the tier.
     */
    public void setTier(String  tier) {
        this.tier = tier;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Identifier(license_id, se_uuid, cookie).
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Identifier(license_id, se_uuid, cookie).
     * Field introduced in 20.1.1.
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
      LicenseInfo objLicenseInfo = (LicenseInfo) o;
      return   Objects.equals(this.uuid, objLicenseInfo.uuid)&&
  Objects.equals(this.tenantUuid, objLicenseInfo.tenantUuid)&&
  Objects.equals(this.tier, objLicenseInfo.tier)&&
  Objects.equals(this.serviceCores, objLicenseInfo.serviceCores)&&
  Objects.equals(this.lastUpdated, objLicenseInfo.lastUpdated)&&
  Objects.equals(this.seGroup, objLicenseInfo.seGroup);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LicenseInfo {\n");
                  sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
                        sb.append("    seGroup: ").append(toIndentedString(seGroup)).append("\n");
                        sb.append("    serviceCores: ").append(toIndentedString(serviceCores)).append("\n");
                        sb.append("    tenantUuid: ").append(toIndentedString(tenantUuid)).append("\n");
                        sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
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

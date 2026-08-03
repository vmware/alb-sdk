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
 * The LicenseQuotaUsageDetails is a POJO class extends AviRestResource that used for creating
 * LicenseQuotaUsageDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LicenseQuotaUsageDetails  {
    @JsonProperty("tenant_quota_usage_infos")
    private List<TenantQuotaUsageInfo> tenantQuotaUsageInfos;

    @JsonProperty("url")
    private String url = "url";


    /**
     * This is the getter method this will return the attribute value.
     * License quota usage details for tenants.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantQuotaUsageInfos
     */
    public List<TenantQuotaUsageInfo> getTenantQuotaUsageInfos() {
        return tenantQuotaUsageInfos;
    }

    /**
     * This is the setter method. this will set the tenantQuotaUsageInfos
     * License quota usage details for tenants.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantQuotaUsageInfos
     */
    public void setTenantQuotaUsageInfos(List<TenantQuotaUsageInfo>  tenantQuotaUsageInfos) {
        this.tenantQuotaUsageInfos = tenantQuotaUsageInfos;
    }

    /**
     * This is the setter method this will set the tenantQuotaUsageInfos
     * License quota usage details for tenants.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantQuotaUsageInfos
     */
    public LicenseQuotaUsageDetails addTenantQuotaUsageInfosItem(TenantQuotaUsageInfo tenantQuotaUsageInfosItem) {
      if (this.tenantQuotaUsageInfos == null) {
        this.tenantQuotaUsageInfos = new ArrayList<TenantQuotaUsageInfo>();
      }
      this.tenantQuotaUsageInfos.add(tenantQuotaUsageInfosItem);
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


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      LicenseQuotaUsageDetails objLicenseQuotaUsageDetails = (LicenseQuotaUsageDetails) o;
      return   Objects.equals(this.tenantQuotaUsageInfos, objLicenseQuotaUsageDetails.tenantQuotaUsageInfos);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LicenseQuotaUsageDetails {\n");
                  sb.append("    tenantQuotaUsageInfos: ").append(toIndentedString(tenantQuotaUsageInfos)).append("\n");
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

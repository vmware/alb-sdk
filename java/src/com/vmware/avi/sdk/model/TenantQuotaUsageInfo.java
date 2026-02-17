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
 * The TenantQuotaUsageInfo is a POJO class extends AviRestResource that used for creating
 * TenantQuotaUsageInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TenantQuotaUsageInfo  {
    @JsonProperty("se_group_infos")
    private List<LicenseQuotaUsageInfo> seGroupInfos;

    @JsonProperty("tenant_info")
    private LicenseQuotaUsageInfo tenantInfo;


    /**
     * This is the getter method this will return the attribute value.
     * License quota usage per se group of the tenant.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGroupInfos
     */
    public List<LicenseQuotaUsageInfo> getSeGroupInfos() {
        return seGroupInfos;
    }

    /**
     * This is the setter method. this will set the seGroupInfos
     * License quota usage per se group of the tenant.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGroupInfos
     */
    public void setSeGroupInfos(List<LicenseQuotaUsageInfo>  seGroupInfos) {
        this.seGroupInfos = seGroupInfos;
    }

    /**
     * This is the setter method this will set the seGroupInfos
     * License quota usage per se group of the tenant.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGroupInfos
     */
    public TenantQuotaUsageInfo addSeGroupInfosItem(LicenseQuotaUsageInfo seGroupInfosItem) {
      if (this.seGroupInfos == null) {
        this.seGroupInfos = new ArrayList<LicenseQuotaUsageInfo>();
      }
      this.seGroupInfos.add(seGroupInfosItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * License quota usage per tenant.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantInfo
     */
    public LicenseQuotaUsageInfo getTenantInfo() {
        return tenantInfo;
    }

    /**
     * This is the setter method to the attribute.
     * License quota usage per tenant.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantInfo set the tenantInfo.
     */
    public void setTenantInfo(LicenseQuotaUsageInfo tenantInfo) {
        this.tenantInfo = tenantInfo;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      TenantQuotaUsageInfo objTenantQuotaUsageInfo = (TenantQuotaUsageInfo) o;
      return   Objects.equals(this.tenantInfo, objTenantQuotaUsageInfo.tenantInfo)&&
  Objects.equals(this.seGroupInfos, objTenantQuotaUsageInfo.seGroupInfos);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class TenantQuotaUsageInfo {\n");
                  sb.append("    seGroupInfos: ").append(toIndentedString(seGroupInfos)).append("\n");
                        sb.append("    tenantInfo: ").append(toIndentedString(tenantInfo)).append("\n");
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

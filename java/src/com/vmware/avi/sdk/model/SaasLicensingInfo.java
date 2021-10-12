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
 * The SaasLicensingInfo is a POJO class extends AviRestResource that used for creating
 * SaasLicensingInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SaasLicensingInfo  {
    @JsonProperty("cache_service_units")
    private Float cacheServiceUnits = 0.0f;

    @JsonProperty("category")
    private String category = "ALB_LICENSE_CATEGORY";

    @JsonProperty("max_service_units")
    private Float maxServiceUnits = 1000.0f;



    /**
     * This is the getter method this will return the attribute value.
     * Minimum service units that always remain checked out on controller.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
     * @return cacheServiceUnits
     */
    public Float getCacheServiceUnits() {
        return cacheServiceUnits;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum service units that always remain checked out on controller.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
     * @param cacheServiceUnits set the cacheServiceUnits.
     */
    public void setCacheServiceUnits(Float  cacheServiceUnits) {
        this.cacheServiceUnits = cacheServiceUnits;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Service category.
     * Enum options - ALB_THREAT_INTELLIGENCE_CATEGORY, ALB_SUPPORT_CATEGORY, ALB_LICENSE_CATEGORY.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as "ALB_LICENSE_CATEGORY".
     * @return category
     */
    public String getCategory() {
        return category;
    }

    /**
     * This is the setter method to the attribute.
     * Service category.
     * Enum options - ALB_THREAT_INTELLIGENCE_CATEGORY, ALB_SUPPORT_CATEGORY, ALB_LICENSE_CATEGORY.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as "ALB_LICENSE_CATEGORY".
     * @param category set the category.
     */
    public void setCategory(String  category) {
        this.category = category;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum service units that controller can check out.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000.0f.
     * @return maxServiceUnits
     */
    public Float getMaxServiceUnits() {
        return maxServiceUnits;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum service units that controller can check out.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000.0f.
     * @param maxServiceUnits set the maxServiceUnits.
     */
    public void setMaxServiceUnits(Float  maxServiceUnits) {
        this.maxServiceUnits = maxServiceUnits;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SaasLicensingInfo objSaasLicensingInfo = (SaasLicensingInfo) o;
      return   Objects.equals(this.cacheServiceUnits, objSaasLicensingInfo.cacheServiceUnits)&&
  Objects.equals(this.maxServiceUnits, objSaasLicensingInfo.maxServiceUnits)&&
  Objects.equals(this.category, objSaasLicensingInfo.category);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SaasLicensingInfo {\n");
                  sb.append("    cacheServiceUnits: ").append(toIndentedString(cacheServiceUnits)).append("\n");
                        sb.append("    category: ").append(toIndentedString(category)).append("\n");
                        sb.append("    maxServiceUnits: ").append(toIndentedString(maxServiceUnits)).append("\n");
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

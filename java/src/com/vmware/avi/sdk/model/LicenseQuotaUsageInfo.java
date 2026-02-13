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
 * The LicenseQuotaUsageInfo is a POJO class extends AviRestResource that used for creating
 * LicenseQuotaUsageInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LicenseQuotaUsageInfo extends AviRestResource  {
    @JsonProperty("consumed")
    private Float consumed;

    @JsonProperty("limit")
    private Integer limit;

    @JsonProperty("reserved")
    private Float reserved;

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * License cores consumed.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return consumed
     */
    public Float getConsumed() {
        return consumed;
    }

    /**
     * This is the setter method to the attribute.
     * License cores consumed.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param consumed set the consumed.
     */
    public void setConsumed(Float  consumed) {
        this.consumed = consumed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum license cores allowed to consume.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum license cores allowed to consume.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param limit set the limit.
     */
    public void setLimit(Integer  limit) {
        this.limit = limit;
    }

    /**
     * This is the getter method this will return the attribute value.
     * License cores reserved.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reserved
     */
    public Float getReserved() {
        return reserved;
    }

    /**
     * This is the setter method to the attribute.
     * License cores reserved.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reserved set the reserved.
     */
    public void setReserved(Float  reserved) {
        this.reserved = reserved;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid for reference.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid for reference.
     * Field introduced in 31.2.1.
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
      LicenseQuotaUsageInfo objLicenseQuotaUsageInfo = (LicenseQuotaUsageInfo) o;
      return   Objects.equals(this.uuid, objLicenseQuotaUsageInfo.uuid)&&
  Objects.equals(this.consumed, objLicenseQuotaUsageInfo.consumed)&&
  Objects.equals(this.reserved, objLicenseQuotaUsageInfo.reserved)&&
  Objects.equals(this.limit, objLicenseQuotaUsageInfo.limit);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LicenseQuotaUsageInfo {\n");
                  sb.append("    consumed: ").append(toIndentedString(consumed)).append("\n");
                        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
                        sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
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

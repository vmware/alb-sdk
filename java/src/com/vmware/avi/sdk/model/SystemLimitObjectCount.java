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
 * The SystemLimitObjectCount is a POJO class extends AviRestResource that used for creating
 * SystemLimitObjectCount.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SystemLimitObjectCount extends AviRestResource  {
    @JsonProperty("current_count")
    private Integer currentCount;

    @JsonProperty("limit")
    private String limit;

    @JsonProperty("limit_description")
    private String limitDescription;

    @JsonProperty("limit_name")
    private String limitName;

    @JsonProperty("name")
    private String name;

    @JsonProperty("recommended_max_limit")
    private Integer recommendedMaxLimit;

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Current value for the system limit.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return currentCount
     */
    public Integer getCurrentCount() {
        return currentCount;
    }

    /**
     * This is the setter method to the attribute.
     * Current value for the system limit.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param currentCount set the currentCount.
     */
    public void setCurrentCount(Integer  currentCount) {
        this.currentCount = currentCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum of the system limit.
     * Enum options - NUM_VIRTUALSERVICES, NUM_VIRTUALSERVICES_RT_METRICS, NUM_EW_VIRTUALSERVICES, NUM_SERVERS, NUM_SERVICEENGINES, NUM_VRFS,
     * NUM_CLOUDS, NUM_TENANTS, POOLS_PER_VS, POOLGROUPS_PER_VS, CERTIFICATES_PER_VS, POOLS_PER_POOLGROUP, RULES_PER_HTTPPOLICY, RULES_PER_NSP,
     * SERVERS_PER_POOL, ROUTES_PER_VRF, DEF_ROUTES_PER_VRF, SNI_CHILD_PER_PARENT_VS, IPS_PER_IPADDRGROUP, STRINGS_PER_STRINGGROUP...
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    /**
     * This is the setter method to the attribute.
     * Enum of the system limit.
     * Enum options - NUM_VIRTUALSERVICES, NUM_VIRTUALSERVICES_RT_METRICS, NUM_EW_VIRTUALSERVICES, NUM_SERVERS, NUM_SERVICEENGINES, NUM_VRFS,
     * NUM_CLOUDS, NUM_TENANTS, POOLS_PER_VS, POOLGROUPS_PER_VS, CERTIFICATES_PER_VS, POOLS_PER_POOLGROUP, RULES_PER_HTTPPOLICY, RULES_PER_NSP,
     * SERVERS_PER_POOL, ROUTES_PER_VRF, DEF_ROUTES_PER_VRF, SNI_CHILD_PER_PARENT_VS, IPS_PER_IPADDRGROUP, STRINGS_PER_STRINGGROUP...
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param limit set the limit.
     */
    public void setLimit(String  limit) {
        this.limit = limit;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Description of the system limit.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return limitDescription
     */
    public String getLimitDescription() {
        return limitDescription;
    }

    /**
     * This is the setter method to the attribute.
     * Description of the system limit.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param limitDescription set the limitDescription.
     */
    public void setLimitDescription(String  limitDescription) {
        this.limitDescription = limitDescription;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the system limit.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return limitName
     */
    public String getLimitName() {
        return limitName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the system limit.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param limitName set the limitName.
     */
    public void setLimitName(String  limitName) {
        this.limitName = limitName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the system limit object.
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
     * Name of the system limit object.
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
     * Recommended max limit value for the system limit.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return recommendedMaxLimit
     */
    public Integer getRecommendedMaxLimit() {
        return recommendedMaxLimit;
    }

    /**
     * This is the setter method to the attribute.
     * Recommended max limit value for the system limit.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param recommendedMaxLimit set the recommendedMaxLimit.
     */
    public void setRecommendedMaxLimit(Integer  recommendedMaxLimit) {
        this.recommendedMaxLimit = recommendedMaxLimit;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the system limit object.
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
     * Uuid of the system limit object.
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
      SystemLimitObjectCount objSystemLimitObjectCount = (SystemLimitObjectCount) o;
      return   Objects.equals(this.limit, objSystemLimitObjectCount.limit)&&
  Objects.equals(this.limitName, objSystemLimitObjectCount.limitName)&&
  Objects.equals(this.limitDescription, objSystemLimitObjectCount.limitDescription)&&
  Objects.equals(this.currentCount, objSystemLimitObjectCount.currentCount)&&
  Objects.equals(this.recommendedMaxLimit, objSystemLimitObjectCount.recommendedMaxLimit)&&
  Objects.equals(this.uuid, objSystemLimitObjectCount.uuid)&&
  Objects.equals(this.name, objSystemLimitObjectCount.name);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SystemLimitObjectCount {\n");
                  sb.append("    currentCount: ").append(toIndentedString(currentCount)).append("\n");
                        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
                        sb.append("    limitDescription: ").append(toIndentedString(limitDescription)).append("\n");
                        sb.append("    limitName: ").append(toIndentedString(limitName)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    recommendedMaxLimit: ").append(toIndentedString(recommendedMaxLimit)).append("\n");
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

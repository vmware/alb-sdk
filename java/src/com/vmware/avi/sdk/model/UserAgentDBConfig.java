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
 * The UserAgentDBConfig is a POJO class extends AviRestResource that used for creating
 * UserAgentDBConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserAgentDBConfig  {
    @JsonProperty("allowed_batch_size")
    private Integer allowedBatchSize = 500;

    @JsonProperty("category")
    private String category = "ALB_THREAT_INTELLIGENCE_CATEGORY";



    /**
     * This is the getter method this will return the attribute value.
     * Batch query limit.
     * Allowed values are 1-500.
     * Field introduced in 21.1.1.
     * Allowed in basic(allowed values- 500) edition, essentials(allowed values- 500) edition, enterprise edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 500.
     * @return allowedBatchSize
     */
    public Integer getAllowedBatchSize() {
        return allowedBatchSize;
    }

    /**
     * This is the setter method to the attribute.
     * Batch query limit.
     * Allowed values are 1-500.
     * Field introduced in 21.1.1.
     * Allowed in basic(allowed values- 500) edition, essentials(allowed values- 500) edition, enterprise edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 500.
     * @param allowedBatchSize set the allowedBatchSize.
     */
    public void setAllowedBatchSize(Integer  allowedBatchSize) {
        this.allowedBatchSize = allowedBatchSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Service category.
     * Enum options - ALB_THREAT_INTELLIGENCE_CATEGORY, ALB_SUPPORT_CATEGORY, ALB_LICENSE_CATEGORY.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as "ALB_THREAT_INTELLIGENCE_CATEGORY".
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
     * Default value when not specified in API or module is interpreted by Avi Controller as "ALB_THREAT_INTELLIGENCE_CATEGORY".
     * @param category set the category.
     */
    public void setCategory(String  category) {
        this.category = category;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      UserAgentDBConfig objUserAgentDBConfig = (UserAgentDBConfig) o;
      return   Objects.equals(this.allowedBatchSize, objUserAgentDBConfig.allowedBatchSize)&&
  Objects.equals(this.category, objUserAgentDBConfig.category);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class UserAgentDBConfig {\n");
                  sb.append("    allowedBatchSize: ").append(toIndentedString(allowedBatchSize)).append("\n");
                        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

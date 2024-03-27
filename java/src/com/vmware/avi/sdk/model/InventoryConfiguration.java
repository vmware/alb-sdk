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
 * The InventoryConfiguration is a POJO class extends AviRestResource that used for creating
 * InventoryConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InventoryConfiguration  {
    @JsonProperty("enable_search_info")
    private Boolean enableSearchInfo = false;



    /**
     * This is the getter method this will return the attribute value.
     * Names, ip's of vs, pool(poolgroup) servers would be searchable on cloud console.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableSearchInfo
     */
    public Boolean getEnableSearchInfo() {
        return enableSearchInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Names, ip's of vs, pool(poolgroup) servers would be searchable on cloud console.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableSearchInfo set the enableSearchInfo.
     */
    public void setEnableSearchInfo(Boolean  enableSearchInfo) {
        this.enableSearchInfo = enableSearchInfo;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      InventoryConfiguration objInventoryConfiguration = (InventoryConfiguration) o;
      return   Objects.equals(this.enableSearchInfo, objInventoryConfiguration.enableSearchInfo);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class InventoryConfiguration {\n");
                  sb.append("    enableSearchInfo: ").append(toIndentedString(enableSearchInfo)).append("\n");
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

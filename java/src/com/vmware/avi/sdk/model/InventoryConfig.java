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
 * The InventoryConfig is a POJO class extends AviRestResource that used for creating
 * InventoryConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InventoryConfig  {
    @JsonProperty("enable")
    private Boolean enable = true;

    @JsonProperty("enable_search_info")
    private Boolean enableSearchInfo = false;



    /**
     * This is the getter method this will return the attribute value.
     * Allow inventory stats to be regularly sent to pulse portal.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * This is the setter method to the attribute.
     * Allow inventory stats to be regularly sent to pulse portal.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param enable set the enable.
     */
    public void setEnable(Boolean  enable) {
        this.enable = enable;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Names, ip's of vs, pool(poolgroup) servers would be searchable on cloud console.
     * Field introduced in 22.1.6.
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
     * Field introduced in 22.1.6.
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
      InventoryConfig objInventoryConfig = (InventoryConfig) o;
      return   Objects.equals(this.enable, objInventoryConfig.enable)&&
  Objects.equals(this.enableSearchInfo, objInventoryConfig.enableSearchInfo);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class InventoryConfig {\n");
                  sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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

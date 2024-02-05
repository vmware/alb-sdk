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
 * The OperationsConfig is a POJO class extends AviRestResource that used for creating
 * OperationsConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OperationsConfig  {
    @JsonProperty("inventory_config")
    private InventoryConfig inventoryConfig;



    /**
     * This is the getter method this will return the attribute value.
     * Inventory op config.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return inventoryConfig
     */
    public InventoryConfig getInventoryConfig() {
        return inventoryConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Inventory op config.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param inventoryConfig set the inventoryConfig.
     */
    public void setInventoryConfig(InventoryConfig inventoryConfig) {
        this.inventoryConfig = inventoryConfig;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      OperationsConfig objOperationsConfig = (OperationsConfig) o;
      return   Objects.equals(this.inventoryConfig, objOperationsConfig.inventoryConfig);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OperationsConfig {\n");
                  sb.append("    inventoryConfig: ").append(toIndentedString(inventoryConfig)).append("\n");
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

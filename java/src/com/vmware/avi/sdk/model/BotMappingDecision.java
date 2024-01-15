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
 * The BotMappingDecision is a POJO class extends AviRestResource that used for creating
 * BotMappingDecision.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BotMappingDecision  {
    @JsonProperty("mapping_name")
    private String mappingName = null;

    @JsonProperty("mapping_rule_name")
    private String mappingRuleName = null;



    /**
     * This is the getter method this will return the attribute value.
     * The name of the bot mapping that made the decision.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mappingName
     */
    public String getMappingName() {
        return mappingName;
    }

    /**
     * This is the setter method to the attribute.
     * The name of the bot mapping that made the decision.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mappingName set the mappingName.
     */
    public void setMappingName(String  mappingName) {
        this.mappingName = mappingName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The name of the bot mapping rule that made the decision.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mappingRuleName
     */
    public String getMappingRuleName() {
        return mappingRuleName;
    }

    /**
     * This is the setter method to the attribute.
     * The name of the bot mapping rule that made the decision.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mappingRuleName set the mappingRuleName.
     */
    public void setMappingRuleName(String  mappingRuleName) {
        this.mappingRuleName = mappingRuleName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      BotMappingDecision objBotMappingDecision = (BotMappingDecision) o;
      return   Objects.equals(this.mappingName, objBotMappingDecision.mappingName)&&
  Objects.equals(this.mappingRuleName, objBotMappingDecision.mappingRuleName);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BotMappingDecision {\n");
                  sb.append("    mappingName: ").append(toIndentedString(mappingName)).append("\n");
                        sb.append("    mappingRuleName: ").append(toIndentedString(mappingRuleName)).append("\n");
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

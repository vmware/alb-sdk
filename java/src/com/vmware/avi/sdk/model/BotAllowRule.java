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
 * The BotAllowRule is a POJO class extends AviRestResource that used for creating
 * BotAllowRule.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BotAllowRule  {
    @JsonProperty("action")
    private String action = null;

    @JsonProperty("condition")
    private MatchTarget condition = null;

    @JsonProperty("index")
    private Integer index = null;

    @JsonProperty("name")
    private String name = null;



    /**
     * This is the getter method this will return the attribute value.
     * The action to take.
     * Enum options - BOT_ACTION_BYPASS, BOT_ACTION_CONTINUE.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return action
     */
    public String getAction() {
        return action;
    }

    /**
     * This is the setter method to the attribute.
     * The action to take.
     * Enum options - BOT_ACTION_BYPASS, BOT_ACTION_CONTINUE.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param action set the action.
     */
    public void setAction(String  action) {
        this.action = action;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The condition to match.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return condition
     */
    public MatchTarget getCondition() {
        return condition;
    }

    /**
     * This is the setter method to the attribute.
     * The condition to match.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param condition set the condition.
     */
    public void setCondition(MatchTarget condition) {
        this.condition = condition;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Rules are processed in order of this index field.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * This is the setter method to the attribute.
     * Rules are processed in order of this index field.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param index set the index.
     */
    public void setIndex(Integer  index) {
        this.index = index;
    }

    /**
     * This is the getter method this will return the attribute value.
     * A name describing the rule in a short form.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * A name describing the rule in a short form.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      BotAllowRule objBotAllowRule = (BotAllowRule) o;
      return   Objects.equals(this.index, objBotAllowRule.index)&&
  Objects.equals(this.name, objBotAllowRule.name)&&
  Objects.equals(this.condition, objBotAllowRule.condition)&&
  Objects.equals(this.action, objBotAllowRule.action);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BotAllowRule {\n");
                  sb.append("    action: ").append(toIndentedString(action)).append("\n");
                        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
                        sb.append("    index: ").append(toIndentedString(index)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

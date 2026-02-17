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
 * The ObjectRule is a POJO class extends AviRestResource that used for creating
 * ObjectRule.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObjectRule  {
    @JsonProperty("action")
    private RetentionAction action;

    @JsonProperty("limit")
    private Integer limit;

    @JsonProperty("model_name")
    private String modelName;



    /**
     * This is the getter method this will return the attribute value.
     * Action to trigger when policy conditions are met.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return action
     */
    public RetentionAction getAction() {
        return action;
    }

    /**
     * This is the setter method to the attribute.
     * Action to trigger when policy conditions are met.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param action set the action.
     */
    public void setAction(RetentionAction action) {
        this.action = action;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of objects allowed in the system.
     * When the limit exceeds, action is invoked for the oldest objects.
     * Allowed values are 1-100.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of objects allowed in the system.
     * When the limit exceeds, action is invoked for the oldest objects.
     * Allowed values are 1-100.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param limit set the limit.
     */
    public void setLimit(Integer  limit) {
        this.limit = limit;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the object model.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the object model.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param modelName set the modelName.
     */
    public void setModelName(String  modelName) {
        this.modelName = modelName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ObjectRule objObjectRule = (ObjectRule) o;
      return   Objects.equals(this.action, objObjectRule.action)&&
  Objects.equals(this.modelName, objObjectRule.modelName)&&
  Objects.equals(this.limit, objObjectRule.limit);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ObjectRule {\n");
                  sb.append("    action: ").append(toIndentedString(action)).append("\n");
                        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
                        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
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

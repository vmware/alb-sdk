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
 * The RetentionAction is a POJO class extends AviRestResource that used for creating
 * RetentionAction.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RetentionAction  {
    @JsonProperty("args")
    private List<ActionArgs> args;

    @JsonProperty("path")
    private String path;

    @JsonProperty("type")
    private String type;


    /**
     * This is the getter method this will return the attribute value.
     * Arguments for the action.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return args
     */
    public List<ActionArgs> getArgs() {
        return args;
    }

    /**
     * This is the setter method. this will set the args
     * Arguments for the action.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return args
     */
    public void setArgs(List<ActionArgs>  args) {
        this.args = args;
    }

    /**
     * This is the setter method this will set the args
     * Arguments for the action.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return args
     */
    public RetentionAction addArgsItem(ActionArgs argsItem) {
      if (this.args == null) {
        this.args = new ArrayList<ActionArgs>();
      }
      this.args.add(argsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Path to invoke for the action.
     * For example, for api action, this would be an api endpoint.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * This is the setter method to the attribute.
     * Path to invoke for the action.
     * For example, for api action, this would be an api endpoint.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param path set the path.
     */
    public void setPath(String  path) {
        this.path = path;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Type of action to perform such as api, rpc, script, etc.
     * Enum options - ACTION_API, ACTION_GRPC, ACTION_SCRIPT, ACTION_RPC.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * Type of action to perform such as api, rpc, script, etc.
     * Enum options - ACTION_API, ACTION_GRPC, ACTION_SCRIPT, ACTION_RPC.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      RetentionAction objRetentionAction = (RetentionAction) o;
      return   Objects.equals(this.type, objRetentionAction.type)&&
  Objects.equals(this.path, objRetentionAction.path)&&
  Objects.equals(this.args, objRetentionAction.args);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RetentionAction {\n");
                  sb.append("    args: ").append(toIndentedString(args)).append("\n");
                        sb.append("    path: ").append(toIndentedString(path)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

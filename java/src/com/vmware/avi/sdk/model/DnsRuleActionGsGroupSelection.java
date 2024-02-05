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
 * The DnsRuleActionGsGroupSelection is a POJO class extends AviRestResource that used for creating
 * DnsRuleActionGsGroupSelection.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DnsRuleActionGsGroupSelection  {
    @JsonProperty("group_name")
    private String groupName;



    /**
     * This is the getter method this will return the attribute value.
     * Gslb service group name.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This is the setter method to the attribute.
     * Gslb service group name.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param groupName set the groupName.
     */
    public void setGroupName(String  groupName) {
        this.groupName = groupName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DnsRuleActionGsGroupSelection objDnsRuleActionGsGroupSelection = (DnsRuleActionGsGroupSelection) o;
      return   Objects.equals(this.groupName, objDnsRuleActionGsGroupSelection.groupName);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DnsRuleActionGsGroupSelection {\n");
                  sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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

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
 * The RuleInfo is a POJO class extends AviRestResource that used for creating
 * RuleInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RuleInfo  {
    @JsonProperty("matches")
    private List<Matches> matches = null;

    @JsonProperty("rule_group_id")
    private String ruleGroupId = null;

    @JsonProperty("rule_id")
    private String ruleId = null;


    /**
     * This is the getter method this will return the attribute value.
     * Uri hitted signature rule matches.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return matches
     */
    public List<Matches> getMatches() {
        return matches;
    }

    /**
     * This is the setter method. this will set the matches
     * Uri hitted signature rule matches.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return matches
     */
    public void setMatches(List<Matches>  matches) {
        this.matches = matches;
    }

    /**
     * This is the setter method this will set the matches
     * Uri hitted signature rule matches.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return matches
     */
    public RuleInfo addMatchesItem(Matches matchesItem) {
      if (this.matches == null) {
        this.matches = new ArrayList<Matches>();
      }
      this.matches.add(matchesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uri hitted signature rule group id.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ruleGroupId
     */
    public String getRuleGroupId() {
        return ruleGroupId;
    }

    /**
     * This is the setter method to the attribute.
     * Uri hitted signature rule group id.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ruleGroupId set the ruleGroupId.
     */
    public void setRuleGroupId(String  ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uri hitted signature rule id.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * This is the setter method to the attribute.
     * Uri hitted signature rule id.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ruleId set the ruleId.
     */
    public void setRuleId(String  ruleId) {
        this.ruleId = ruleId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      RuleInfo objRuleInfo = (RuleInfo) o;
      return   Objects.equals(this.ruleId, objRuleInfo.ruleId)&&
  Objects.equals(this.ruleGroupId, objRuleInfo.ruleGroupId)&&
  Objects.equals(this.matches, objRuleInfo.matches);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RuleInfo {\n");
                  sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
                        sb.append("    ruleGroupId: ").append(toIndentedString(ruleGroupId)).append("\n");
                        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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

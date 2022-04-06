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
 * The WafRuleOverrides is a POJO class extends AviRestResource that used for creating
 * WafRuleOverrides.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WafRuleOverrides  {
    @JsonProperty("enable")
    private Boolean enable = null;

    @JsonProperty("exclude_list")
    private List<WafExcludeListEntry> excludeList = null;

    @JsonProperty("mode")
    private String mode = null;

    @JsonProperty("rule_id")
    private String ruleId = null;



    /**
     * This is the getter method this will return the attribute value.
     * Override the enable flag for this rule.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * This is the setter method to the attribute.
     * Override the enable flag for this rule.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param enable set the enable.
     */
    public void setEnable(Boolean  enable) {
        this.enable = enable;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Replace the exclude list for this rule.
     * Field introduced in 20.1.6.
     * Maximum of 64 items allowed.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return excludeList
     */
    public List<WafExcludeListEntry> getExcludeList() {
        return excludeList;
    }

    /**
     * This is the setter method. this will set the excludeList
     * Replace the exclude list for this rule.
     * Field introduced in 20.1.6.
     * Maximum of 64 items allowed.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return excludeList
     */
    public void setExcludeList(List<WafExcludeListEntry>  excludeList) {
        this.excludeList = excludeList;
    }

    /**
     * This is the setter method this will set the excludeList
     * Replace the exclude list for this rule.
     * Field introduced in 20.1.6.
     * Maximum of 64 items allowed.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return excludeList
     */
    public WafRuleOverrides addExcludeListItem(WafExcludeListEntry excludeListItem) {
      if (this.excludeList == null) {
        this.excludeList = new ArrayList<WafExcludeListEntry>();
      }
      this.excludeList.add(excludeListItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Override the waf mode for this rule.
     * Enum options - WAF_MODE_DETECTION_ONLY, WAF_MODE_ENFORCEMENT.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * This is the setter method to the attribute.
     * Override the waf mode for this rule.
     * Enum options - WAF_MODE_DETECTION_ONLY, WAF_MODE_ENFORCEMENT.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mode set the mode.
     */
    public void setMode(String  mode) {
        this.mode = mode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The rule_id of the rule where attributes are overridden.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * This is the setter method to the attribute.
     * The rule_id of the rule where attributes are overridden.
     * Field introduced in 20.1.6.
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
      WafRuleOverrides objWafRuleOverrides = (WafRuleOverrides) o;
      return   Objects.equals(this.ruleId, objWafRuleOverrides.ruleId)&&
  Objects.equals(this.enable, objWafRuleOverrides.enable)&&
  Objects.equals(this.mode, objWafRuleOverrides.mode)&&
  Objects.equals(this.excludeList, objWafRuleOverrides.excludeList);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WafRuleOverrides {\n");
                  sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
                        sb.append("    excludeList: ").append(toIndentedString(excludeList)).append("\n");
                        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

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
 * The WafRuleGroup is a POJO class extends AviRestResource that used for creating
 * WafRuleGroup.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WafRuleGroup  {
    @JsonProperty("enable")
    private Boolean enable = true;

    @JsonProperty("exclude_list")
    private List<WafExcludeListEntry> excludeList;

    @JsonProperty("index")
    private Integer index;

    @JsonProperty("name")
    private String name;

    @JsonProperty("rules")
    private List<WafRule> rules;



    /**
     * This is the getter method this will return the attribute value.
     * Enable or disable waf rule group.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * This is the setter method to the attribute.
     * Enable or disable waf rule group.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param enable set the enable.
     */
    public void setEnable(Boolean  enable) {
        this.enable = enable;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Exclude list for the waf rule group.
     * The fields in the exclude list entry are logically and'ed to deduce the exclusion criteria.
     * If there are multiple excludelist entries, it will be 'logical or' of them.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return excludeList
     */
    public List<WafExcludeListEntry> getExcludeList() {
        return excludeList;
    }

    /**
     * This is the setter method. this will set the excludeList
     * Exclude list for the waf rule group.
     * The fields in the exclude list entry are logically and'ed to deduce the exclusion criteria.
     * If there are multiple excludelist entries, it will be 'logical or' of them.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return excludeList
     */
    public void setExcludeList(List<WafExcludeListEntry>  excludeList) {
        this.excludeList = excludeList;
    }

    /**
     * This is the setter method this will set the excludeList
     * Exclude list for the waf rule group.
     * The fields in the exclude list entry are logically and'ed to deduce the exclusion criteria.
     * If there are multiple excludelist entries, it will be 'logical or' of them.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return excludeList
     */
    public WafRuleGroup addExcludeListItem(WafExcludeListEntry excludeListItem) {
      if (this.excludeList == null) {
        this.excludeList = new ArrayList<WafExcludeListEntry>();
      }
      this.excludeList.add(excludeListItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param index set the index.
     */
    public void setIndex(Integer  index) {
        this.index = index;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Rules as per modsec language.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public List<WafRule> getRules() {
        return rules;
    }

    /**
     * This is the setter method. this will set the rules
     * Rules as per modsec language.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public void setRules(List<WafRule>  rules) {
        this.rules = rules;
    }

    /**
     * This is the setter method this will set the rules
     * Rules as per modsec language.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public WafRuleGroup addRulesItem(WafRule rulesItem) {
      if (this.rules == null) {
        this.rules = new ArrayList<WafRule>();
      }
      this.rules.add(rulesItem);
      return this;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      WafRuleGroup objWafRuleGroup = (WafRuleGroup) o;
      return   Objects.equals(this.index, objWafRuleGroup.index)&&
  Objects.equals(this.name, objWafRuleGroup.name)&&
  Objects.equals(this.enable, objWafRuleGroup.enable)&&
  Objects.equals(this.rules, objWafRuleGroup.rules)&&
  Objects.equals(this.excludeList, objWafRuleGroup.excludeList);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WafRuleGroup {\n");
                  sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
                        sb.append("    excludeList: ").append(toIndentedString(excludeList)).append("\n");
                        sb.append("    index: ").append(toIndentedString(index)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

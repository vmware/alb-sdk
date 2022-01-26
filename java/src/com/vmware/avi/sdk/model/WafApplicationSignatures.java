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
 * The WafApplicationSignatures is a POJO class extends AviRestResource that used for creating
 * WafApplicationSignatures.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WafApplicationSignatures  {
    @JsonProperty("provider_ref")
    private String providerRef = null;

    @JsonProperty("rule_overrides")
    private List<WafRuleOverrides> ruleOverrides = null;

    @JsonProperty("rules")
    private List<WafRule> rules;

    @JsonProperty("ruleset_version")
    private String rulesetVersion;

    @JsonProperty("selected_applications")
    private List<String> selectedApplications = null;



    /**
     * This is the getter method this will return the attribute value.
     * The external provide for the rules.
     * It is a reference to an object of type wafapplicationsignatureprovider.
     * Field introduced in 20.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return providerRef
     */
    public String getProviderRef() {
        return providerRef;
    }

    /**
     * This is the setter method to the attribute.
     * The external provide for the rules.
     * It is a reference to an object of type wafapplicationsignatureprovider.
     * Field introduced in 20.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param providerRef set the providerRef.
     */
    public void setProviderRef(String  providerRef) {
        this.providerRef = providerRef;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Override attributes of application signature rules.
     * Field introduced in 20.1.6.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ruleOverrides
     */
    public List<WafRuleOverrides> getRuleOverrides() {
        return ruleOverrides;
    }

    /**
     * This is the setter method. this will set the ruleOverrides
     * Override attributes of application signature rules.
     * Field introduced in 20.1.6.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ruleOverrides
     */
    public void setRuleOverrides(List<WafRuleOverrides>  ruleOverrides) {
        this.ruleOverrides = ruleOverrides;
    }

    /**
     * This is the setter method this will set the ruleOverrides
     * Override attributes of application signature rules.
     * Field introduced in 20.1.6.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ruleOverrides
     */
    public WafApplicationSignatures addRuleOverridesItem(WafRuleOverrides ruleOverridesItem) {
      if (this.ruleOverrides == null) {
        this.ruleOverrides = new ArrayList<WafRuleOverrides>();
      }
      this.ruleOverrides.add(ruleOverridesItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * This entry is deprecated.
     * If you want to deactivate a certain rule, please use the rule_overrides field instead.
     * Field deprecated in 20.1.6.
     * Field introduced in 20.1.1.
     * @return rules
     */
    public List<WafRule> getRules() {
        return rules;
    }

    /**
     * This is the setter method. this will set the rules
     * This entry is deprecated.
     * If you want to deactivate a certain rule, please use the rule_overrides field instead.
     * Field deprecated in 20.1.6.
     * Field introduced in 20.1.1.
     * @return rules
     */
    public void setRules(List<WafRule>  rules) {
        this.rules = rules;
    }

    /**
     * This is the setter method this will set the rules
     * This entry is deprecated.
     * If you want to deactivate a certain rule, please use the rule_overrides field instead.
     * Field deprecated in 20.1.6.
     * Field introduced in 20.1.1.
     * @return rules
     */
    public WafApplicationSignatures addRulesItem(WafRule rulesItem) {
      if (this.rules == null) {
        this.rules = new ArrayList<WafRule>();
      }
      this.rules.add(rulesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The version in use of the provided ruleset.
     * Field introduced in 20.1.1.
     * @return rulesetVersion
     */
    public String getRulesetVersion() {
        return rulesetVersion;
    }

    /**
     * This is the setter method to the attribute.
     * The version in use of the provided ruleset.
     * Field introduced in 20.1.1.
     * @param rulesetVersion set the rulesetVersion.
     */
    public void setRulesetVersion(String  rulesetVersion) {
        this.rulesetVersion = rulesetVersion;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of applications for which we use the rules from the wafapplicationsignatureprovider.
     * Field introduced in 20.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return selectedApplications
     */
    public List<String> getSelectedApplications() {
        return selectedApplications;
    }

    /**
     * This is the setter method. this will set the selectedApplications
     * List of applications for which we use the rules from the wafapplicationsignatureprovider.
     * Field introduced in 20.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return selectedApplications
     */
    public void setSelectedApplications(List<String>  selectedApplications) {
        this.selectedApplications = selectedApplications;
    }

    /**
     * This is the setter method this will set the selectedApplications
     * List of applications for which we use the rules from the wafapplicationsignatureprovider.
     * Field introduced in 20.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return selectedApplications
     */
    public WafApplicationSignatures addSelectedApplicationsItem(String selectedApplicationsItem) {
      if (this.selectedApplications == null) {
        this.selectedApplications = new ArrayList<String>();
      }
      this.selectedApplications.add(selectedApplicationsItem);
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
      WafApplicationSignatures objWafApplicationSignatures = (WafApplicationSignatures) o;
      return   Objects.equals(this.providerRef, objWafApplicationSignatures.providerRef)&&
  Objects.equals(this.rulesetVersion, objWafApplicationSignatures.rulesetVersion)&&
  Objects.equals(this.selectedApplications, objWafApplicationSignatures.selectedApplications)&&
  Objects.equals(this.rules, objWafApplicationSignatures.rules)&&
  Objects.equals(this.ruleOverrides, objWafApplicationSignatures.ruleOverrides);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WafApplicationSignatures {\n");
                  sb.append("    providerRef: ").append(toIndentedString(providerRef)).append("\n");
                        sb.append("    ruleOverrides: ").append(toIndentedString(ruleOverrides)).append("\n");
                        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
                        sb.append("    rulesetVersion: ").append(toIndentedString(rulesetVersion)).append("\n");
                        sb.append("    selectedApplications: ").append(toIndentedString(selectedApplications)).append("\n");
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

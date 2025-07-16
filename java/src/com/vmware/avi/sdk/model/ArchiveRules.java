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
 * The ArchiveRules is a POJO class extends AviRestResource that used for creating
 * ArchiveRules.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArchiveRules  {
    @JsonProperty("rules")
    private List<ArchivePolicy> rules;


    /**
     * This is the getter method this will return the attribute value.
     * Archive policy for file path to have specific threshold.tech-support will skip collection of file if file size is greater than threshold.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public List<ArchivePolicy> getRules() {
        return rules;
    }

    /**
     * This is the setter method. this will set the rules
     * Archive policy for file path to have specific threshold.tech-support will skip collection of file if file size is greater than threshold.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public void setRules(List<ArchivePolicy>  rules) {
        this.rules = rules;
    }

    /**
     * This is the setter method this will set the rules
     * Archive policy for file path to have specific threshold.tech-support will skip collection of file if file size is greater than threshold.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public ArchiveRules addRulesItem(ArchivePolicy rulesItem) {
      if (this.rules == null) {
        this.rules = new ArrayList<ArchivePolicy>();
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
      ArchiveRules objArchiveRules = (ArchiveRules) o;
      return   Objects.equals(this.rules, objArchiveRules.rules);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ArchiveRules {\n");
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

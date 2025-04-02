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
 * The OmittedWafLogStats is a POJO class extends AviRestResource that used for creating
 * OmittedWafLogStats.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OmittedWafLogStats  {
    @JsonProperty("match_elements")
    private Integer matchElements = 0;

    @JsonProperty("rules")
    private Integer rules = 0;



    /**
     * This is the getter method this will return the attribute value.
     * The total count of omitted match element logs in all rules.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return matchElements
     */
    public Integer getMatchElements() {
        return matchElements;
    }

    /**
     * This is the setter method to the attribute.
     * The total count of omitted match element logs in all rules.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param matchElements set the matchElements.
     */
    public void setMatchElements(Integer  matchElements) {
        this.matchElements = matchElements;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The total count of omitted rule logs.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return rules
     */
    public Integer getRules() {
        return rules;
    }

    /**
     * This is the setter method to the attribute.
     * The total count of omitted rule logs.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param rules set the rules.
     */
    public void setRules(Integer  rules) {
        this.rules = rules;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      OmittedWafLogStats objOmittedWafLogStats = (OmittedWafLogStats) o;
      return   Objects.equals(this.rules, objOmittedWafLogStats.rules)&&
  Objects.equals(this.matchElements, objOmittedWafLogStats.matchElements);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OmittedWafLogStats {\n");
                  sb.append("    matchElements: ").append(toIndentedString(matchElements)).append("\n");
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

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
 * The VHMatch is a POJO class extends AviRestResource that used for creating
 * VHMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VHMatch  {
    @JsonProperty("host")
    private String host = null;

    @JsonProperty("rules")
    private List<VHMatchRule> rules = null;



    /**
     * This is the getter method this will return the attribute value.
     * Host/domain name match configuration.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return host
     */
    public String getHost() {
        return host;
    }

    /**
     * This is the setter method to the attribute.
     * Host/domain name match configuration.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param host set the host.
     */
    public void setHost(String  host) {
        this.host = host;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Add rules for selecting the virtual service.
     * At least one rule must be configured.
     * Field introduced in 22.1.3.
     * Minimum of 1 items required.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public List<VHMatchRule> getRules() {
        return rules;
    }

    /**
     * This is the setter method. this will set the rules
     * Add rules for selecting the virtual service.
     * At least one rule must be configured.
     * Field introduced in 22.1.3.
     * Minimum of 1 items required.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public void setRules(List<VHMatchRule>  rules) {
        this.rules = rules;
    }

    /**
     * This is the setter method this will set the rules
     * Add rules for selecting the virtual service.
     * At least one rule must be configured.
     * Field introduced in 22.1.3.
     * Minimum of 1 items required.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public VHMatch addRulesItem(VHMatchRule rulesItem) {
      if (this.rules == null) {
        this.rules = new ArrayList<VHMatchRule>();
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
      VHMatch objVHMatch = (VHMatch) o;
      return   Objects.equals(this.host, objVHMatch.host)&&
  Objects.equals(this.rules, objVHMatch.rules);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VHMatch {\n");
                  sb.append("    host: ").append(toIndentedString(host)).append("\n");
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

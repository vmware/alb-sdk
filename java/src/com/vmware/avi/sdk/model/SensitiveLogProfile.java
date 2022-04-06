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
 * The SensitiveLogProfile is a POJO class extends AviRestResource that used for creating
 * SensitiveLogProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SensitiveLogProfile  {
    @JsonProperty("header_field_rules")
    private List<SensitiveFieldRule> headerFieldRules = null;

    @JsonProperty("uri_query_field_rules")
    private List<SensitiveFieldRule> uriQueryFieldRules = null;

    @JsonProperty("waf_field_rules")
    private List<SensitiveFieldRule> wafFieldRules = null;


    /**
     * This is the getter method this will return the attribute value.
     * Match sensitive header fields in http application log.
     * Field introduced in 17.2.10, 18.1.2.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return headerFieldRules
     */
    public List<SensitiveFieldRule> getHeaderFieldRules() {
        return headerFieldRules;
    }

    /**
     * This is the setter method. this will set the headerFieldRules
     * Match sensitive header fields in http application log.
     * Field introduced in 17.2.10, 18.1.2.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return headerFieldRules
     */
    public void setHeaderFieldRules(List<SensitiveFieldRule>  headerFieldRules) {
        this.headerFieldRules = headerFieldRules;
    }

    /**
     * This is the setter method this will set the headerFieldRules
     * Match sensitive header fields in http application log.
     * Field introduced in 17.2.10, 18.1.2.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return headerFieldRules
     */
    public SensitiveLogProfile addHeaderFieldRulesItem(SensitiveFieldRule headerFieldRulesItem) {
      if (this.headerFieldRules == null) {
        this.headerFieldRules = new ArrayList<SensitiveFieldRule>();
      }
      this.headerFieldRules.add(headerFieldRulesItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Match sensitive uri query params in http application log.
     * Query params from the uri are extracted and checked for matching sensitive parameter names.
     * A successful match will mask the parameter values in accordance with this rule action.
     * Field introduced in 20.1.7, 21.1.2.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uriQueryFieldRules
     */
    public List<SensitiveFieldRule> getUriQueryFieldRules() {
        return uriQueryFieldRules;
    }

    /**
     * This is the setter method. this will set the uriQueryFieldRules
     * Match sensitive uri query params in http application log.
     * Query params from the uri are extracted and checked for matching sensitive parameter names.
     * A successful match will mask the parameter values in accordance with this rule action.
     * Field introduced in 20.1.7, 21.1.2.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uriQueryFieldRules
     */
    public void setUriQueryFieldRules(List<SensitiveFieldRule>  uriQueryFieldRules) {
        this.uriQueryFieldRules = uriQueryFieldRules;
    }

    /**
     * This is the setter method this will set the uriQueryFieldRules
     * Match sensitive uri query params in http application log.
     * Query params from the uri are extracted and checked for matching sensitive parameter names.
     * A successful match will mask the parameter values in accordance with this rule action.
     * Field introduced in 20.1.7, 21.1.2.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uriQueryFieldRules
     */
    public SensitiveLogProfile addUriQueryFieldRulesItem(SensitiveFieldRule uriQueryFieldRulesItem) {
      if (this.uriQueryFieldRules == null) {
        this.uriQueryFieldRules = new ArrayList<SensitiveFieldRule>();
      }
      this.uriQueryFieldRules.add(uriQueryFieldRulesItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Match sensitive waf log fields in http application log.
     * Field introduced in 17.2.13, 18.1.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return wafFieldRules
     */
    public List<SensitiveFieldRule> getWafFieldRules() {
        return wafFieldRules;
    }

    /**
     * This is the setter method. this will set the wafFieldRules
     * Match sensitive waf log fields in http application log.
     * Field introduced in 17.2.13, 18.1.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return wafFieldRules
     */
    public void setWafFieldRules(List<SensitiveFieldRule>  wafFieldRules) {
        this.wafFieldRules = wafFieldRules;
    }

    /**
     * This is the setter method this will set the wafFieldRules
     * Match sensitive waf log fields in http application log.
     * Field introduced in 17.2.13, 18.1.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return wafFieldRules
     */
    public SensitiveLogProfile addWafFieldRulesItem(SensitiveFieldRule wafFieldRulesItem) {
      if (this.wafFieldRules == null) {
        this.wafFieldRules = new ArrayList<SensitiveFieldRule>();
      }
      this.wafFieldRules.add(wafFieldRulesItem);
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
      SensitiveLogProfile objSensitiveLogProfile = (SensitiveLogProfile) o;
      return   Objects.equals(this.headerFieldRules, objSensitiveLogProfile.headerFieldRules)&&
  Objects.equals(this.wafFieldRules, objSensitiveLogProfile.wafFieldRules)&&
  Objects.equals(this.uriQueryFieldRules, objSensitiveLogProfile.uriQueryFieldRules);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SensitiveLogProfile {\n");
                  sb.append("    headerFieldRules: ").append(toIndentedString(headerFieldRules)).append("\n");
                        sb.append("    uriQueryFieldRules: ").append(toIndentedString(uriQueryFieldRules)).append("\n");
                        sb.append("    wafFieldRules: ").append(toIndentedString(wafFieldRules)).append("\n");
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

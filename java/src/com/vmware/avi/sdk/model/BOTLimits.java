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
 * The BOTLimits is a POJO class extends AviRestResource that used for creating
 * BOTLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BOTLimits  {
    @JsonProperty("allow_rules")
    private Integer allowRules = null;

    @JsonProperty("hdrs")
    private Integer hdrs = null;

    @JsonProperty("mapping_rules")
    private Integer mappingRules = null;



    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of rules to control which requests undergo bot detection.
     * Field introduced in 22.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return allowRules
     */
    public Integer getAllowRules() {
        return allowRules;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of rules to control which requests undergo bot detection.
     * Field introduced in 22.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param allowRules set the allowRules.
     */
    public void setAllowRules(Integer  allowRules) {
        this.allowRules = allowRules;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of configurable http header(s).
     * Field introduced in 22.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hdrs
     */
    public Integer getHdrs() {
        return hdrs;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of configurable http header(s).
     * Field introduced in 22.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hdrs set the hdrs.
     */
    public void setHdrs(Integer  hdrs) {
        this.hdrs = hdrs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of rules in a botmapping object.
     * Field introduced in 22.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mappingRules
     */
    public Integer getMappingRules() {
        return mappingRules;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of rules in a botmapping object.
     * Field introduced in 22.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mappingRules set the mappingRules.
     */
    public void setMappingRules(Integer  mappingRules) {
        this.mappingRules = mappingRules;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      BOTLimits objBOTLimits = (BOTLimits) o;
      return   Objects.equals(this.mappingRules, objBOTLimits.mappingRules)&&
  Objects.equals(this.allowRules, objBOTLimits.allowRules)&&
  Objects.equals(this.hdrs, objBOTLimits.hdrs);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BOTLimits {\n");
                  sb.append("    allowRules: ").append(toIndentedString(allowRules)).append("\n");
                        sb.append("    hdrs: ").append(toIndentedString(hdrs)).append("\n");
                        sb.append("    mappingRules: ").append(toIndentedString(mappingRules)).append("\n");
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

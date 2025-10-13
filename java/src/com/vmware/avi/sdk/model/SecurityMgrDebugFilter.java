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
 * The SecurityMgrDebugFilter is a POJO class extends AviRestResource that used for creating
 * SecurityMgrDebugFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SecurityMgrDebugFilter  {
    @JsonProperty("accumulate_http_methods")
    private List<String> accumulateHttpMethods;

    @JsonProperty("enable_adaptive_config")
    private Boolean enableAdaptiveConfig = true;

    @JsonProperty("entity_ref")
    private String entityRef;

    @JsonProperty("psm_programming_interval")
    private Integer psmProgrammingInterval = 5;

    @JsonProperty("psm_rule_id_multiplier")
    private Integer psmRuleIdMultiplier;


    /**
     * This is the getter method this will return the attribute value.
     * Http methods to accumulate for consolidated learning (e.g., get, post, put).
     * If empty, all methods are accumulated.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return accumulateHttpMethods
     */
    public List<String> getAccumulateHttpMethods() {
        return accumulateHttpMethods;
    }

    /**
     * This is the setter method. this will set the accumulateHttpMethods
     * Http methods to accumulate for consolidated learning (e.g., get, post, put).
     * If empty, all methods are accumulated.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return accumulateHttpMethods
     */
    public void setAccumulateHttpMethods(List<String>  accumulateHttpMethods) {
        this.accumulateHttpMethods = accumulateHttpMethods;
    }

    /**
     * This is the setter method this will set the accumulateHttpMethods
     * Http methods to accumulate for consolidated learning (e.g., get, post, put).
     * If empty, all methods are accumulated.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return accumulateHttpMethods
     */
    public SecurityMgrDebugFilter addAccumulateHttpMethodsItem(String accumulateHttpMethodsItem) {
      if (this.accumulateHttpMethods == null) {
        this.accumulateHttpMethods = new ArrayList<String>();
      }
      this.accumulateHttpMethods.add(accumulateHttpMethodsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Dynamically adapt configuration parameters for application learning feature.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return enableAdaptiveConfig
     */
    public Boolean getEnableAdaptiveConfig() {
        return enableAdaptiveConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Dynamically adapt configuration parameters for application learning feature.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param enableAdaptiveConfig set the enableAdaptiveConfig.
     */
    public void setEnableAdaptiveConfig(Boolean  enableAdaptiveConfig) {
        this.enableAdaptiveConfig = enableAdaptiveConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the entity.
     * It is a reference to an object of type virtualservice.
     * Field introduced in 18.2.6.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return entityRef
     */
    public String getEntityRef() {
        return entityRef;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the entity.
     * It is a reference to an object of type virtualservice.
     * Field introduced in 18.2.6.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param entityRef set the entityRef.
     */
    public void setEntityRef(String  entityRef) {
        this.entityRef = entityRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Dynamically update the interval for rule generation in psm programming.
     * Allowed values are 1-60.
     * Field introduced in 31.2.1.
     * Unit is min.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @return psmProgrammingInterval
     */
    public Integer getPsmProgrammingInterval() {
        return psmProgrammingInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Dynamically update the interval for rule generation in psm programming.
     * Allowed values are 1-60.
     * Field introduced in 31.2.1.
     * Unit is min.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @param psmProgrammingInterval set the psmProgrammingInterval.
     */
    public void setPsmProgrammingInterval(Integer  psmProgrammingInterval) {
        this.psmProgrammingInterval = psmProgrammingInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Dynamically update the multiplier for rule id generation in psm programming for learning feature.
     * Allowed values are 10-100000.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return psmRuleIdMultiplier
     */
    public Integer getPsmRuleIdMultiplier() {
        return psmRuleIdMultiplier;
    }

    /**
     * This is the setter method to the attribute.
     * Dynamically update the multiplier for rule id generation in psm programming for learning feature.
     * Allowed values are 10-100000.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param psmRuleIdMultiplier set the psmRuleIdMultiplier.
     */
    public void setPsmRuleIdMultiplier(Integer  psmRuleIdMultiplier) {
        this.psmRuleIdMultiplier = psmRuleIdMultiplier;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SecurityMgrDebugFilter objSecurityMgrDebugFilter = (SecurityMgrDebugFilter) o;
      return   Objects.equals(this.entityRef, objSecurityMgrDebugFilter.entityRef)&&
  Objects.equals(this.enableAdaptiveConfig, objSecurityMgrDebugFilter.enableAdaptiveConfig)&&
  Objects.equals(this.psmRuleIdMultiplier, objSecurityMgrDebugFilter.psmRuleIdMultiplier)&&
  Objects.equals(this.accumulateHttpMethods, objSecurityMgrDebugFilter.accumulateHttpMethods)&&
  Objects.equals(this.psmProgrammingInterval, objSecurityMgrDebugFilter.psmProgrammingInterval);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SecurityMgrDebugFilter {\n");
                  sb.append("    accumulateHttpMethods: ").append(toIndentedString(accumulateHttpMethods)).append("\n");
                        sb.append("    enableAdaptiveConfig: ").append(toIndentedString(enableAdaptiveConfig)).append("\n");
                        sb.append("    entityRef: ").append(toIndentedString(entityRef)).append("\n");
                        sb.append("    psmProgrammingInterval: ").append(toIndentedString(psmProgrammingInterval)).append("\n");
                        sb.append("    psmRuleIdMultiplier: ").append(toIndentedString(psmRuleIdMultiplier)).append("\n");
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

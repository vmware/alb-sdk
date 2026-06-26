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

    @JsonProperty("adaptive_sampler_config_cooldown")
    private Integer adaptiveSamplerConfigCooldown = 180;

    @JsonProperty("adaptive_sampler_tick_interval")
    private Integer adaptiveSamplerTickInterval = 1;

    @JsonProperty("api_path_markers")
    private List<String> apiPathMarkers;

    @JsonProperty("enable_adaptive_config")
    private Boolean enableAdaptiveConfig = true;

    @JsonProperty("enable_secmgr_api_endpoint_consolidation")
    private Boolean enableSecmgrApiEndpointConsolidation = true;

    @JsonProperty("entity_ref")
    private String entityRef;

    @JsonProperty("learning_db_cleanup_lookback_period")
    private Integer learningDbCleanupLookbackPeriod = 30;

    @JsonProperty("psm_programming_interval")
    private Integer psmProgrammingInterval = 5;

    @JsonProperty("psm_rule_id_multiplier")
    private Integer psmRuleIdMultiplier;

    @JsonProperty("secmgr_api_classification_task_periodicity")
    private Integer secmgrApiClassificationTaskPeriodicity = 360;

    @JsonProperty("secmgr_api_hits_population_interval")
    private Integer secmgrApiHitsPopulationInterval = 15;

    @JsonProperty("secmgr_waap_full_sync")
    private Boolean secmgrWaapFullSync = false;

    @JsonProperty("secmgr_waap_full_sync_vs_uuid")
    private String secmgrWaapFullSyncVsUuid;

    @JsonProperty("static_file_extensions")
    private List<String> staticFileExtensions;


    /**
     * This is the getter method this will return the attribute value.
     * Http methods to accumulate for consolidated learning (e.g., get, post, put).
     * If empty, all methods are accumulated.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Cooldown period between adaptive sampling configuration sends to prevent excessive updates.
     * Allowed values are 1-600.
     * Field introduced in 32.2.1.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 180.
     * @return adaptiveSamplerConfigCooldown
     */
    public Integer getAdaptiveSamplerConfigCooldown() {
        return adaptiveSamplerConfigCooldown;
    }

    /**
     * This is the setter method to the attribute.
     * Cooldown period between adaptive sampling configuration sends to prevent excessive updates.
     * Allowed values are 1-600.
     * Field introduced in 32.2.1.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 180.
     * @param adaptiveSamplerConfigCooldown set the adaptiveSamplerConfigCooldown.
     */
    public void setAdaptiveSamplerConfigCooldown(Integer  adaptiveSamplerConfigCooldown) {
        this.adaptiveSamplerConfigCooldown = adaptiveSamplerConfigCooldown;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Adaptive sampler tick interval for periodic sampling adjustments.
     * Allowed values are 1-3600.
     * Field introduced in 32.2.1.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return adaptiveSamplerTickInterval
     */
    public Integer getAdaptiveSamplerTickInterval() {
        return adaptiveSamplerTickInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Adaptive sampler tick interval for periodic sampling adjustments.
     * Allowed values are 1-3600.
     * Field introduced in 32.2.1.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param adaptiveSamplerTickInterval set the adaptiveSamplerTickInterval.
     */
    public void setAdaptiveSamplerTickInterval(Integer  adaptiveSamplerTickInterval) {
        this.adaptiveSamplerTickInterval = adaptiveSamplerTickInterval;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Custom api path markers for endpoint classification (e.g., /api/, /v1/, /graphql).
     * If not configured, uses default markers.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return apiPathMarkers
     */
    public List<String> getApiPathMarkers() {
        return apiPathMarkers;
    }

    /**
     * This is the setter method. this will set the apiPathMarkers
     * Custom api path markers for endpoint classification (e.g., /api/, /v1/, /graphql).
     * If not configured, uses default markers.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return apiPathMarkers
     */
    public void setApiPathMarkers(List<String>  apiPathMarkers) {
        this.apiPathMarkers = apiPathMarkers;
    }

    /**
     * This is the setter method this will set the apiPathMarkers
     * Custom api path markers for endpoint classification (e.g., /api/, /v1/, /graphql).
     * If not configured, uses default markers.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return apiPathMarkers
     */
    public SecurityMgrDebugFilter addApiPathMarkersItem(String apiPathMarkersItem) {
      if (this.apiPathMarkers == null) {
        this.apiPathMarkers = new ArrayList<String>();
      }
      this.apiPathMarkers.add(apiPathMarkersItem);
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
     * [internal] toggle api endpoint consolidation - applies to application insights, api protection, positive security.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return enableSecmgrApiEndpointConsolidation
     */
    public Boolean getEnableSecmgrApiEndpointConsolidation() {
        return enableSecmgrApiEndpointConsolidation;
    }

    /**
     * This is the setter method to the attribute.
     * [internal] toggle api endpoint consolidation - applies to application insights, api protection, positive security.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param enableSecmgrApiEndpointConsolidation set the enableSecmgrApiEndpointConsolidation.
     */
    public void setEnableSecmgrApiEndpointConsolidation(Boolean  enableSecmgrApiEndpointConsolidation) {
        this.enableSecmgrApiEndpointConsolidation = enableSecmgrApiEndpointConsolidation;
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
     * Lookback period for learning database cleanup.
     * Allowed values are 1-365.
     * Field introduced in 32.2.1.
     * Unit is days.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @return learningDbCleanupLookbackPeriod
     */
    public Integer getLearningDbCleanupLookbackPeriod() {
        return learningDbCleanupLookbackPeriod;
    }

    /**
     * This is the setter method to the attribute.
     * Lookback period for learning database cleanup.
     * Allowed values are 1-365.
     * Field introduced in 32.2.1.
     * Unit is days.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @param learningDbCleanupLookbackPeriod set the learningDbCleanupLookbackPeriod.
     */
    public void setLearningDbCleanupLookbackPeriod(Integer  learningDbCleanupLookbackPeriod) {
        this.learningDbCleanupLookbackPeriod = learningDbCleanupLookbackPeriod;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Dynamically update the interval for rule generation in psm programming.
     * Allowed values are 1-60.
     * Field introduced in 31.2.1.
     * Unit is min.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param psmRuleIdMultiplier set the psmRuleIdMultiplier.
     */
    public void setPsmRuleIdMultiplier(Integer  psmRuleIdMultiplier) {
        this.psmRuleIdMultiplier = psmRuleIdMultiplier;
    }

    /**
     * This is the getter method this will return the attribute value.
     * [internal] periodicity at which orphan/zombie/active api determination routine runs.
     * Allowed values are 1-10080.
     * Field introduced in 32.2.1.
     * Unit is min.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 360.
     * @return secmgrApiClassificationTaskPeriodicity
     */
    public Integer getSecmgrApiClassificationTaskPeriodicity() {
        return secmgrApiClassificationTaskPeriodicity;
    }

    /**
     * This is the setter method to the attribute.
     * [internal] periodicity at which orphan/zombie/active api determination routine runs.
     * Allowed values are 1-10080.
     * Field introduced in 32.2.1.
     * Unit is min.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 360.
     * @param secmgrApiClassificationTaskPeriodicity set the secmgrApiClassificationTaskPeriodicity.
     */
    public void setSecmgrApiClassificationTaskPeriodicity(Integer  secmgrApiClassificationTaskPeriodicity) {
        this.secmgrApiClassificationTaskPeriodicity = secmgrApiClassificationTaskPeriodicity;
    }

    /**
     * This is the getter method this will return the attribute value.
     * [internal] periodicity at which orphan/zombie/active api hits population routine runs.
     * Allowed values are 1-1440.
     * Field introduced in 32.2.1.
     * Unit is min.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 15.
     * @return secmgrApiHitsPopulationInterval
     */
    public Integer getSecmgrApiHitsPopulationInterval() {
        return secmgrApiHitsPopulationInterval;
    }

    /**
     * This is the setter method to the attribute.
     * [internal] periodicity at which orphan/zombie/active api hits population routine runs.
     * Allowed values are 1-1440.
     * Field introduced in 32.2.1.
     * Unit is min.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 15.
     * @param secmgrApiHitsPopulationInterval set the secmgrApiHitsPopulationInterval.
     */
    public void setSecmgrApiHitsPopulationInterval(Integer  secmgrApiHitsPopulationInterval) {
        this.secmgrApiHitsPopulationInterval = secmgrApiHitsPopulationInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Trigger full sync of api specification changes to learning database for all eligible vses.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return secmgrWaapFullSync
     */
    public Boolean getSecmgrWaapFullSync() {
        return secmgrWaapFullSync;
    }

    /**
     * This is the setter method to the attribute.
     * Trigger full sync of api specification changes to learning database for all eligible vses.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param secmgrWaapFullSync set the secmgrWaapFullSync.
     */
    public void setSecmgrWaapFullSync(Boolean  secmgrWaapFullSync) {
        this.secmgrWaapFullSync = secmgrWaapFullSync;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Trigger full sync for a specific vs uuid.
     * If set, only this vs will be processed.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return secmgrWaapFullSyncVsUuid
     */
    public String getSecmgrWaapFullSyncVsUuid() {
        return secmgrWaapFullSyncVsUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Trigger full sync for a specific vs uuid.
     * If set, only this vs will be processed.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param secmgrWaapFullSyncVsUuid set the secmgrWaapFullSyncVsUuid.
     */
    public void setSecmgrWaapFullSyncVsUuid(String  secmgrWaapFullSyncVsUuid) {
        this.secmgrWaapFullSyncVsUuid = secmgrWaapFullSyncVsUuid;
    }
    /**
     * This is the getter method this will return the attribute value.
     * File extensions considered as static non-api content (e.g., .html, .css, .js, .png).
     * If not configured, uses default extensions.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return staticFileExtensions
     */
    public List<String> getStaticFileExtensions() {
        return staticFileExtensions;
    }

    /**
     * This is the setter method. this will set the staticFileExtensions
     * File extensions considered as static non-api content (e.g., .html, .css, .js, .png).
     * If not configured, uses default extensions.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return staticFileExtensions
     */
    public void setStaticFileExtensions(List<String>  staticFileExtensions) {
        this.staticFileExtensions = staticFileExtensions;
    }

    /**
     * This is the setter method this will set the staticFileExtensions
     * File extensions considered as static non-api content (e.g., .html, .css, .js, .png).
     * If not configured, uses default extensions.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return staticFileExtensions
     */
    public SecurityMgrDebugFilter addStaticFileExtensionsItem(String staticFileExtensionsItem) {
      if (this.staticFileExtensions == null) {
        this.staticFileExtensions = new ArrayList<String>();
      }
      this.staticFileExtensions.add(staticFileExtensionsItem);
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
      SecurityMgrDebugFilter objSecurityMgrDebugFilter = (SecurityMgrDebugFilter) o;
      return   Objects.equals(this.entityRef, objSecurityMgrDebugFilter.entityRef)&&
  Objects.equals(this.enableAdaptiveConfig, objSecurityMgrDebugFilter.enableAdaptiveConfig)&&
  Objects.equals(this.psmRuleIdMultiplier, objSecurityMgrDebugFilter.psmRuleIdMultiplier)&&
  Objects.equals(this.accumulateHttpMethods, objSecurityMgrDebugFilter.accumulateHttpMethods)&&
  Objects.equals(this.psmProgrammingInterval, objSecurityMgrDebugFilter.psmProgrammingInterval)&&
  Objects.equals(this.secmgrApiClassificationTaskPeriodicity, objSecurityMgrDebugFilter.secmgrApiClassificationTaskPeriodicity)&&
  Objects.equals(this.adaptiveSamplerTickInterval, objSecurityMgrDebugFilter.adaptiveSamplerTickInterval)&&
  Objects.equals(this.adaptiveSamplerConfigCooldown, objSecurityMgrDebugFilter.adaptiveSamplerConfigCooldown)&&
  Objects.equals(this.enableSecmgrApiEndpointConsolidation, objSecurityMgrDebugFilter.enableSecmgrApiEndpointConsolidation)&&
  Objects.equals(this.secmgrWaapFullSync, objSecurityMgrDebugFilter.secmgrWaapFullSync)&&
  Objects.equals(this.secmgrWaapFullSyncVsUuid, objSecurityMgrDebugFilter.secmgrWaapFullSyncVsUuid)&&
  Objects.equals(this.apiPathMarkers, objSecurityMgrDebugFilter.apiPathMarkers)&&
  Objects.equals(this.staticFileExtensions, objSecurityMgrDebugFilter.staticFileExtensions)&&
  Objects.equals(this.learningDbCleanupLookbackPeriod, objSecurityMgrDebugFilter.learningDbCleanupLookbackPeriod)&&
  Objects.equals(this.secmgrApiHitsPopulationInterval, objSecurityMgrDebugFilter.secmgrApiHitsPopulationInterval);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SecurityMgrDebugFilter {\n");
                  sb.append("    accumulateHttpMethods: ").append(toIndentedString(accumulateHttpMethods)).append("\n");
                        sb.append("    adaptiveSamplerConfigCooldown: ").append(toIndentedString(adaptiveSamplerConfigCooldown)).append("\n");
                        sb.append("    adaptiveSamplerTickInterval: ").append(toIndentedString(adaptiveSamplerTickInterval)).append("\n");
                        sb.append("    apiPathMarkers: ").append(toIndentedString(apiPathMarkers)).append("\n");
                        sb.append("    enableAdaptiveConfig: ").append(toIndentedString(enableAdaptiveConfig)).append("\n");
                        sb.append("    enableSecmgrApiEndpointConsolidation: ").append(toIndentedString(enableSecmgrApiEndpointConsolidation)).append("\n");
                        sb.append("    entityRef: ").append(toIndentedString(entityRef)).append("\n");
                        sb.append("    learningDbCleanupLookbackPeriod: ").append(toIndentedString(learningDbCleanupLookbackPeriod)).append("\n");
                        sb.append("    psmProgrammingInterval: ").append(toIndentedString(psmProgrammingInterval)).append("\n");
                        sb.append("    psmRuleIdMultiplier: ").append(toIndentedString(psmRuleIdMultiplier)).append("\n");
                        sb.append("    secmgrApiClassificationTaskPeriodicity: ").append(toIndentedString(secmgrApiClassificationTaskPeriodicity)).append("\n");
                        sb.append("    secmgrApiHitsPopulationInterval: ").append(toIndentedString(secmgrApiHitsPopulationInterval)).append("\n");
                        sb.append("    secmgrWaapFullSync: ").append(toIndentedString(secmgrWaapFullSync)).append("\n");
                        sb.append("    secmgrWaapFullSyncVsUuid: ").append(toIndentedString(secmgrWaapFullSyncVsUuid)).append("\n");
                        sb.append("    staticFileExtensions: ").append(toIndentedString(staticFileExtensions)).append("\n");
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

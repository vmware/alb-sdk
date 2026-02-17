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
 * The WafPolicy is a POJO class extends AviRestResource that used for creating
 * WafPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WafPolicy extends AviRestResource  {
    @JsonProperty("allow_mode_delegation")
    private Boolean allowModeDelegation = true;

    @JsonProperty("allowlist")
    private WafPolicyAllowlist allowlist;

    @JsonProperty("application_signatures")
    private WafApplicationSignatures applicationSignatures;

    @JsonProperty("auto_update_crs")
    private Boolean autoUpdateCrs = false;

    @JsonProperty("bypass_static_extensions")
    private Boolean bypassStaticExtensions = true;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("crs_overrides")
    private List<WafRuleGroupOverrides> crsOverrides;

    @JsonProperty("description")
    private String description;

    @JsonProperty("enable_streaming")
    private Boolean enableStreaming = false;

    @JsonProperty("failure_mode")
    private String failureMode = "WAF_FAILURE_MODE_OPEN";

    @JsonProperty("fixed_sampling_rate")
    private Integer fixedSamplingRate = 1;

    @JsonProperty("geo_db_ref")
    private String geoDbRef;

    @JsonProperty("markers")
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("mode")
    private String mode = "WAF_MODE_DETECTION_ONLY";

    @JsonProperty("name")
    private String name;

    @JsonProperty("paranoia_level")
    private String paranoiaLevel = "WAF_PARANOIA_LEVEL_LOW";

    @JsonProperty("positive_security_model")
    private WafPositiveSecurityModel positiveSecurityModel;

    @JsonProperty("post_crs_groups")
    private List<WafRuleGroup> postCrsGroups;

    @JsonProperty("pre_crs_groups")
    private List<WafRuleGroup> preCrsGroups;

    @JsonProperty("sampling_mode")
    private String samplingMode = "WAF_SAMPLING_MODE_NO_SAMPLING";

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("use_evaluation_mode_on_crs_update")
    private Boolean useEvaluationModeOnCrsUpdate = true;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("waf_crs_ref")
    private String wafCrsRef;

    @JsonProperty("waf_profile_ref")
    private String wafProfileRef;



    /**
     * This is the getter method this will return the attribute value.
     * Allow rules to overwrite the policy mode.
     * This must be set if the policy mode is set to enforcement.
     * Field introduced in 18.1.5, 18.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return allowModeDelegation
     */
    public Boolean getAllowModeDelegation() {
        return allowModeDelegation;
    }

    /**
     * This is the setter method to the attribute.
     * Allow rules to overwrite the policy mode.
     * This must be set if the policy mode is set to enforcement.
     * Field introduced in 18.1.5, 18.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param allowModeDelegation set the allowModeDelegation.
     */
    public void setAllowModeDelegation(Boolean  allowModeDelegation) {
        this.allowModeDelegation = allowModeDelegation;
    }

    /**
     * This is the getter method this will return the attribute value.
     * A set of rules which describe conditions under which the request will bypass the waf.
     * This will be processed in the request header phase before any other waf related code.
     * Field introduced in 20.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return allowlist
     */
    public WafPolicyAllowlist getAllowlist() {
        return allowlist;
    }

    /**
     * This is the setter method to the attribute.
     * A set of rules which describe conditions under which the request will bypass the waf.
     * This will be processed in the request header phase before any other waf related code.
     * Field introduced in 20.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param allowlist set the allowlist.
     */
    public void setAllowlist(WafPolicyAllowlist allowlist) {
        this.allowlist = allowlist;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Application specific signatures.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return applicationSignatures
     */
    public WafApplicationSignatures getApplicationSignatures() {
        return applicationSignatures;
    }

    /**
     * This is the setter method to the attribute.
     * Application specific signatures.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param applicationSignatures set the applicationSignatures.
     */
    public void setApplicationSignatures(WafApplicationSignatures applicationSignatures) {
        this.applicationSignatures = applicationSignatures;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If this flag is set, the system will try to keep the crs version used in this policy up-to-date.
     * If a newer crs object is available on this controller, the system will issue the crs upgrade process for this waf policy.
     * It will not update polices if the current crs version is crs-version-not-applicable.
     * Field introduced in 22.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return autoUpdateCrs
     */
    public Boolean getAutoUpdateCrs() {
        return autoUpdateCrs;
    }

    /**
     * This is the setter method to the attribute.
     * If this flag is set, the system will try to keep the crs version used in this policy up-to-date.
     * If a newer crs object is available on this controller, the system will issue the crs upgrade process for this waf policy.
     * It will not update polices if the current crs version is crs-version-not-applicable.
     * Field introduced in 22.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param autoUpdateCrs set the autoUpdateCrs.
     */
    public void setAutoUpdateCrs(Boolean  autoUpdateCrs) {
        this.autoUpdateCrs = autoUpdateCrs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable the functionality to bypass waf for static file extensions.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return bypassStaticExtensions
     */
    public Boolean getBypassStaticExtensions() {
        return bypassStaticExtensions;
    }

    /**
     * This is the setter method to the attribute.
     * Enable the functionality to bypass waf for static file extensions.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param bypassStaticExtensions set the bypassStaticExtensions.
     */
    public void setBypassStaticExtensions(Boolean  bypassStaticExtensions) {
        this.bypassStaticExtensions = bypassStaticExtensions;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Creator name.
     * Field introduced in 17.2.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This is the setter method to the attribute.
     * Creator name.
     * Field introduced in 17.2.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param createdBy set the createdBy.
     */
    public void setCreatedBy(String  createdBy) {
        this.createdBy = createdBy;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Override attributes for crs rules.
     * Field introduced in 20.1.6.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return crsOverrides
     */
    public List<WafRuleGroupOverrides> getCrsOverrides() {
        return crsOverrides;
    }

    /**
     * This is the setter method. this will set the crsOverrides
     * Override attributes for crs rules.
     * Field introduced in 20.1.6.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return crsOverrides
     */
    public void setCrsOverrides(List<WafRuleGroupOverrides>  crsOverrides) {
        this.crsOverrides = crsOverrides;
    }

    /**
     * This is the setter method this will set the crsOverrides
     * Override attributes for crs rules.
     * Field introduced in 20.1.6.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return crsOverrides
     */
    public WafPolicy addCrsOverridesItem(WafRuleGroupOverrides crsOverridesItem) {
      if (this.crsOverrides == null) {
        this.crsOverrides = new ArrayList<WafRuleGroupOverrides>();
      }
      this.crsOverrides.add(crsOverridesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If this is set, waf will let requests be streamed to the backend servers.
     * If not set, requests and responses will be buffered up to the configured maximum values.
     * It can only be set if the wafpolicy is not set to enforcement mode.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableStreaming
     */
    public Boolean getEnableStreaming() {
        return enableStreaming;
    }

    /**
     * This is the setter method to the attribute.
     * If this is set, waf will let requests be streamed to the backend servers.
     * If not set, requests and responses will be buffered up to the configured maximum values.
     * It can only be set if the wafpolicy is not set to enforcement mode.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableStreaming set the enableStreaming.
     */
    public void setEnableStreaming(Boolean  enableStreaming) {
        this.enableStreaming = enableStreaming;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Waf policy failure mode.
     * This can be 'open' or 'closed'.
     * Enum options - WAF_FAILURE_MODE_OPEN, WAF_FAILURE_MODE_CLOSED.
     * Field introduced in 18.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "WAF_FAILURE_MODE_OPEN".
     * @return failureMode
     */
    public String getFailureMode() {
        return failureMode;
    }

    /**
     * This is the setter method to the attribute.
     * Waf policy failure mode.
     * This can be 'open' or 'closed'.
     * Enum options - WAF_FAILURE_MODE_OPEN, WAF_FAILURE_MODE_CLOSED.
     * Field introduced in 18.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "WAF_FAILURE_MODE_OPEN".
     * @param failureMode set the failureMode.
     */
    public void setFailureMode(String  failureMode) {
        this.failureMode = failureMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If sampling_mode is set to fixed_sampling, this value determines the percentage of requests choosen for waf processing.
     * Allowed values are 1-100.
     * Field introduced in 31.2.1.
     * Unit is percent.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return fixedSamplingRate
     */
    public Integer getFixedSamplingRate() {
        return fixedSamplingRate;
    }

    /**
     * This is the setter method to the attribute.
     * If sampling_mode is set to fixed_sampling, this value determines the percentage of requests choosen for waf processing.
     * Allowed values are 1-100.
     * Field introduced in 31.2.1.
     * Unit is percent.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param fixedSamplingRate set the fixedSamplingRate.
     */
    public void setFixedSamplingRate(Integer  fixedSamplingRate) {
        this.fixedSamplingRate = fixedSamplingRate;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Geo location mapping database used by this wafpolicy.
     * It is a reference to an object of type geodb.
     * Field introduced in 21.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return geoDbRef
     */
    public String getGeoDbRef() {
        return geoDbRef;
    }

    /**
     * This is the setter method to the attribute.
     * Geo location mapping database used by this wafpolicy.
     * It is a reference to an object of type geodb.
     * Field introduced in 21.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param geoDbRef set the geoDbRef.
     */
    public void setGeoDbRef(String  geoDbRef) {
        this.geoDbRef = geoDbRef;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of labels to be used for granular rbac.
     * Field introduced in 20.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public List<RoleFilterMatchLabel> getMarkers() {
        return markers;
    }

    /**
     * This is the setter method. this will set the markers
     * List of labels to be used for granular rbac.
     * Field introduced in 20.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public void setMarkers(List<RoleFilterMatchLabel>  markers) {
        this.markers = markers;
    }

    /**
     * This is the setter method this will set the markers
     * List of labels to be used for granular rbac.
     * Field introduced in 20.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public WafPolicy addMarkersItem(RoleFilterMatchLabel markersItem) {
      if (this.markers == null) {
        this.markers = new ArrayList<RoleFilterMatchLabel>();
      }
      this.markers.add(markersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Waf policy mode.
     * This can be either detection, enforcement or evaluation.
     * It can be overwritten by rules if allow_mode_delegation is set.
     * Enum options - WAF_MODE_DETECTION_ONLY, WAF_MODE_ENFORCEMENT, WAF_MODE_EVALUATION.
     * Field introduced in 17.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "WAF_MODE_DETECTION_ONLY".
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * This is the setter method to the attribute.
     * Waf policy mode.
     * This can be either detection, enforcement or evaluation.
     * It can be overwritten by rules if allow_mode_delegation is set.
     * Enum options - WAF_MODE_DETECTION_ONLY, WAF_MODE_ENFORCEMENT, WAF_MODE_EVALUATION.
     * Field introduced in 17.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "WAF_MODE_DETECTION_ONLY".
     * @param mode set the mode.
     */
    public void setMode(String  mode) {
        this.mode = mode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Waf ruleset paranoia  mode.
     * This is used to select rules based on the paranoia-level tag.
     * Enum options - WAF_PARANOIA_LEVEL_LOW, WAF_PARANOIA_LEVEL_MEDIUM, WAF_PARANOIA_LEVEL_HIGH, WAF_PARANOIA_LEVEL_EXTREME.
     * Field introduced in 17.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "WAF_PARANOIA_LEVEL_LOW".
     * @return paranoiaLevel
     */
    public String getParanoiaLevel() {
        return paranoiaLevel;
    }

    /**
     * This is the setter method to the attribute.
     * Waf ruleset paranoia  mode.
     * This is used to select rules based on the paranoia-level tag.
     * Enum options - WAF_PARANOIA_LEVEL_LOW, WAF_PARANOIA_LEVEL_MEDIUM, WAF_PARANOIA_LEVEL_HIGH, WAF_PARANOIA_LEVEL_EXTREME.
     * Field introduced in 17.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "WAF_PARANOIA_LEVEL_LOW".
     * @param paranoiaLevel set the paranoiaLevel.
     */
    public void setParanoiaLevel(String  paranoiaLevel) {
        this.paranoiaLevel = paranoiaLevel;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The positive security model.
     * This is used to describe how the request or parts of the request should look like.
     * It is executed in the request body phase of avi waf.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return positiveSecurityModel
     */
    public WafPositiveSecurityModel getPositiveSecurityModel() {
        return positiveSecurityModel;
    }

    /**
     * This is the setter method to the attribute.
     * The positive security model.
     * This is used to describe how the request or parts of the request should look like.
     * It is executed in the request body phase of avi waf.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param positiveSecurityModel set the positiveSecurityModel.
     */
    public void setPositiveSecurityModel(WafPositiveSecurityModel positiveSecurityModel) {
        this.positiveSecurityModel = positiveSecurityModel;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Waf rules are categorized in to groups based on their characterization.
     * These groups are created by the user and will be enforced after the crs groups.
     * Field introduced in 17.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return postCrsGroups
     */
    public List<WafRuleGroup> getPostCrsGroups() {
        return postCrsGroups;
    }

    /**
     * This is the setter method. this will set the postCrsGroups
     * Waf rules are categorized in to groups based on their characterization.
     * These groups are created by the user and will be enforced after the crs groups.
     * Field introduced in 17.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return postCrsGroups
     */
    public void setPostCrsGroups(List<WafRuleGroup>  postCrsGroups) {
        this.postCrsGroups = postCrsGroups;
    }

    /**
     * This is the setter method this will set the postCrsGroups
     * Waf rules are categorized in to groups based on their characterization.
     * These groups are created by the user and will be enforced after the crs groups.
     * Field introduced in 17.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return postCrsGroups
     */
    public WafPolicy addPostCrsGroupsItem(WafRuleGroup postCrsGroupsItem) {
      if (this.postCrsGroups == null) {
        this.postCrsGroups = new ArrayList<WafRuleGroup>();
      }
      this.postCrsGroups.add(postCrsGroupsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Waf rules are categorized in to groups based on their characterization.
     * These groups are created by the user and will be  enforced before the crs groups.
     * Field introduced in 17.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return preCrsGroups
     */
    public List<WafRuleGroup> getPreCrsGroups() {
        return preCrsGroups;
    }

    /**
     * This is the setter method. this will set the preCrsGroups
     * Waf rules are categorized in to groups based on their characterization.
     * These groups are created by the user and will be  enforced before the crs groups.
     * Field introduced in 17.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return preCrsGroups
     */
    public void setPreCrsGroups(List<WafRuleGroup>  preCrsGroups) {
        this.preCrsGroups = preCrsGroups;
    }

    /**
     * This is the setter method this will set the preCrsGroups
     * Waf rules are categorized in to groups based on their characterization.
     * These groups are created by the user and will be  enforced before the crs groups.
     * Field introduced in 17.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return preCrsGroups
     */
    public WafPolicy addPreCrsGroupsItem(WafRuleGroup preCrsGroupsItem) {
      if (this.preCrsGroups == null) {
        this.preCrsGroups = new ArrayList<WafRuleGroup>();
      }
      this.preCrsGroups.add(preCrsGroupsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If and how waf should use sampling to restrict the number of requests checked.
     * Enum options - WAF_SAMPLING_MODE_NO_SAMPLING, WAF_SAMPLING_MODE_ADAPTIVE_SAMPLING, WAF_SAMPLING_MODE_FIXED_SAMPLING.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "WAF_SAMPLING_MODE_NO_SAMPLING".
     * @return samplingMode
     */
    public String getSamplingMode() {
        return samplingMode;
    }

    /**
     * This is the setter method to the attribute.
     * If and how waf should use sampling to restrict the number of requests checked.
     * Enum options - WAF_SAMPLING_MODE_NO_SAMPLING, WAF_SAMPLING_MODE_ADAPTIVE_SAMPLING, WAF_SAMPLING_MODE_FIXED_SAMPLING.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "WAF_SAMPLING_MODE_NO_SAMPLING".
     * @param samplingMode set the samplingMode.
     */
    public void setSamplingMode(String  samplingMode) {
        this.samplingMode = samplingMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type tenant.
     * Field introduced in 17.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type tenant.
     * Field introduced in 17.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantRef set the tenantRef.
     */
    public void setTenantRef(String  tenantRef) {
        this.tenantRef = tenantRef;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Avi controller URL of the object.
     * @return url
     */
    public String getUrl() {
        return url;
    }

   /**
    * This is the setter method. this will set the url
    * Avi controller URL of the object.
    * @return url
    */
   public void setUrl(String  url) {
     this.url = url;
   }

    /**
     * This is the getter method this will return the attribute value.
     * While updating crs, the system will make sure that new rules are added in evaluation mode.
     * A crs update will set new rules into evaluation mode by adding crs_overrides for the new rules.
     * If this flag is not set or if the old crs object was empty, the new rules will be added without crs_overrides.
     * This option is used for the auto_update_crs workflow as well as for the ui based crs update workflow.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return useEvaluationModeOnCrsUpdate
     */
    public Boolean getUseEvaluationModeOnCrsUpdate() {
        return useEvaluationModeOnCrsUpdate;
    }

    /**
     * This is the setter method to the attribute.
     * While updating crs, the system will make sure that new rules are added in evaluation mode.
     * A crs update will set new rules into evaluation mode by adding crs_overrides for the new rules.
     * If this flag is not set or if the old crs object was empty, the new rules will be added without crs_overrides.
     * This option is used for the auto_update_crs workflow as well as for the ui based crs update workflow.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param useEvaluationModeOnCrsUpdate set the useEvaluationModeOnCrsUpdate.
     */
    public void setUseEvaluationModeOnCrsUpdate(Boolean  useEvaluationModeOnCrsUpdate) {
        this.useEvaluationModeOnCrsUpdate = useEvaluationModeOnCrsUpdate;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Waf core ruleset used for the crs part of this policy.
     * It is a reference to an object of type wafcrs.
     * Field introduced in 18.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return wafCrsRef
     */
    public String getWafCrsRef() {
        return wafCrsRef;
    }

    /**
     * This is the setter method to the attribute.
     * Waf core ruleset used for the crs part of this policy.
     * It is a reference to an object of type wafcrs.
     * Field introduced in 18.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param wafCrsRef set the wafCrsRef.
     */
    public void setWafCrsRef(String  wafCrsRef) {
        this.wafCrsRef = wafCrsRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Waf profile for waf policy.
     * It is a reference to an object of type wafprofile.
     * Field introduced in 17.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return wafProfileRef
     */
    public String getWafProfileRef() {
        return wafProfileRef;
    }

    /**
     * This is the setter method to the attribute.
     * Waf profile for waf policy.
     * It is a reference to an object of type wafprofile.
     * Field introduced in 17.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param wafProfileRef set the wafProfileRef.
     */
    public void setWafProfileRef(String  wafProfileRef) {
        this.wafProfileRef = wafProfileRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      WafPolicy objWafPolicy = (WafPolicy) o;
      return   Objects.equals(this.uuid, objWafPolicy.uuid)&&
  Objects.equals(this.name, objWafPolicy.name)&&
  Objects.equals(this.description, objWafPolicy.description)&&
  Objects.equals(this.tenantRef, objWafPolicy.tenantRef)&&
  Objects.equals(this.mode, objWafPolicy.mode)&&
  Objects.equals(this.wafProfileRef, objWafPolicy.wafProfileRef)&&
  Objects.equals(this.preCrsGroups, objWafPolicy.preCrsGroups)&&
  Objects.equals(this.postCrsGroups, objWafPolicy.postCrsGroups)&&
  Objects.equals(this.paranoiaLevel, objWafPolicy.paranoiaLevel)&&
  Objects.equals(this.createdBy, objWafPolicy.createdBy)&&
  Objects.equals(this.wafCrsRef, objWafPolicy.wafCrsRef)&&
  Objects.equals(this.failureMode, objWafPolicy.failureMode)&&
  Objects.equals(this.allowModeDelegation, objWafPolicy.allowModeDelegation)&&
  Objects.equals(this.positiveSecurityModel, objWafPolicy.positiveSecurityModel)&&
  Objects.equals(this.applicationSignatures, objWafPolicy.applicationSignatures)&&
  Objects.equals(this.allowlist, objWafPolicy.allowlist)&&
  Objects.equals(this.geoDbRef, objWafPolicy.geoDbRef)&&
  Objects.equals(this.markers, objWafPolicy.markers)&&
  Objects.equals(this.crsOverrides, objWafPolicy.crsOverrides)&&
  Objects.equals(this.bypassStaticExtensions, objWafPolicy.bypassStaticExtensions)&&
  Objects.equals(this.autoUpdateCrs, objWafPolicy.autoUpdateCrs)&&
  Objects.equals(this.useEvaluationModeOnCrsUpdate, objWafPolicy.useEvaluationModeOnCrsUpdate)&&
  Objects.equals(this.samplingMode, objWafPolicy.samplingMode)&&
  Objects.equals(this.fixedSamplingRate, objWafPolicy.fixedSamplingRate)&&
  Objects.equals(this.enableStreaming, objWafPolicy.enableStreaming);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WafPolicy {\n");
                  sb.append("    allowModeDelegation: ").append(toIndentedString(allowModeDelegation)).append("\n");
                        sb.append("    allowlist: ").append(toIndentedString(allowlist)).append("\n");
                        sb.append("    applicationSignatures: ").append(toIndentedString(applicationSignatures)).append("\n");
                        sb.append("    autoUpdateCrs: ").append(toIndentedString(autoUpdateCrs)).append("\n");
                        sb.append("    bypassStaticExtensions: ").append(toIndentedString(bypassStaticExtensions)).append("\n");
                        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
                        sb.append("    crsOverrides: ").append(toIndentedString(crsOverrides)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    enableStreaming: ").append(toIndentedString(enableStreaming)).append("\n");
                        sb.append("    failureMode: ").append(toIndentedString(failureMode)).append("\n");
                        sb.append("    fixedSamplingRate: ").append(toIndentedString(fixedSamplingRate)).append("\n");
                        sb.append("    geoDbRef: ").append(toIndentedString(geoDbRef)).append("\n");
                        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
                        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    paranoiaLevel: ").append(toIndentedString(paranoiaLevel)).append("\n");
                        sb.append("    positiveSecurityModel: ").append(toIndentedString(positiveSecurityModel)).append("\n");
                        sb.append("    postCrsGroups: ").append(toIndentedString(postCrsGroups)).append("\n");
                        sb.append("    preCrsGroups: ").append(toIndentedString(preCrsGroups)).append("\n");
                        sb.append("    samplingMode: ").append(toIndentedString(samplingMode)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                                    sb.append("    useEvaluationModeOnCrsUpdate: ").append(toIndentedString(useEvaluationModeOnCrsUpdate)).append("\n");
                        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    wafCrsRef: ").append(toIndentedString(wafCrsRef)).append("\n");
                        sb.append("    wafProfileRef: ").append(toIndentedString(wafProfileRef)).append("\n");
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

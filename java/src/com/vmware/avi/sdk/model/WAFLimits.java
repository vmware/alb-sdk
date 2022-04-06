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
 * The WAFLimits is a POJO class extends AviRestResource that used for creating
 * WAFLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WAFLimits  {
    @JsonProperty("num_allowed_content_types")
    private Integer numAllowedContentTypes = null;

    @JsonProperty("num_allowed_request_content_type_charsets")
    private Integer numAllowedRequestContentTypeCharsets = null;

    @JsonProperty("num_allowlist_policy_rules")
    private Integer numAllowlistPolicyRules = null;

    @JsonProperty("num_applications")
    private Integer numApplications = null;

    @JsonProperty("num_data_files")
    private Integer numDataFiles = null;

    @JsonProperty("num_pre_post_crs_groups")
    private Integer numPrePostCrsGroups = null;

    @JsonProperty("num_psm_groups")
    private Integer numPsmGroups = null;

    @JsonProperty("num_psm_match_elements")
    private Integer numPsmMatchElements = null;

    @JsonProperty("num_psm_match_rules_per_loc")
    private Integer numPsmMatchRulesPerLoc = null;

    @JsonProperty("num_psm_total_locations")
    private Integer numPsmTotalLocations = null;

    @JsonProperty("num_restricted_extensions")
    private Integer numRestrictedExtensions = null;

    @JsonProperty("num_restricted_headers")
    private Integer numRestrictedHeaders = null;

    @JsonProperty("num_rule_tags")
    private Integer numRuleTags = null;

    @JsonProperty("num_rules_per_rulegroup")
    private Integer numRulesPerRulegroup = null;

    @JsonProperty("num_static_extensions")
    private Integer numStaticExtensions = null;



    /**
     * This is the getter method this will return the attribute value.
     * Number of waf allowed content types.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numAllowedContentTypes
     */
    public Integer getNumAllowedContentTypes() {
        return numAllowedContentTypes;
    }

    /**
     * This is the setter method to the attribute.
     * Number of waf allowed content types.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numAllowedContentTypes set the numAllowedContentTypes.
     */
    public void setNumAllowedContentTypes(Integer  numAllowedContentTypes) {
        this.numAllowedContentTypes = numAllowedContentTypes;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of allowed request content type character sets in waf.
     * Field introduced in 22.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numAllowedRequestContentTypeCharsets
     */
    public Integer getNumAllowedRequestContentTypeCharsets() {
        return numAllowedRequestContentTypeCharsets;
    }

    /**
     * This is the setter method to the attribute.
     * Number of allowed request content type character sets in waf.
     * Field introduced in 22.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numAllowedRequestContentTypeCharsets set the numAllowedRequestContentTypeCharsets.
     */
    public void setNumAllowedRequestContentTypeCharsets(Integer  numAllowedRequestContentTypeCharsets) {
        this.numAllowedRequestContentTypeCharsets = numAllowedRequestContentTypeCharsets;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of rules used in waf allowlist policy.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numAllowlistPolicyRules
     */
    public Integer getNumAllowlistPolicyRules() {
        return numAllowlistPolicyRules;
    }

    /**
     * This is the setter method to the attribute.
     * Number of rules used in waf allowlist policy.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numAllowlistPolicyRules set the numAllowlistPolicyRules.
     */
    public void setNumAllowlistPolicyRules(Integer  numAllowlistPolicyRules) {
        this.numAllowlistPolicyRules = numAllowlistPolicyRules;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of applications for which we use rules from sig provider.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numApplications
     */
    public Integer getNumApplications() {
        return numApplications;
    }

    /**
     * This is the setter method to the attribute.
     * Number of applications for which we use rules from sig provider.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numApplications set the numApplications.
     */
    public void setNumApplications(Integer  numApplications) {
        this.numApplications = numApplications;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of datafiles used in waf.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numDataFiles
     */
    public Integer getNumDataFiles() {
        return numDataFiles;
    }

    /**
     * This is the setter method to the attribute.
     * Number of datafiles used in waf.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numDataFiles set the numDataFiles.
     */
    public void setNumDataFiles(Integer  numDataFiles) {
        this.numDataFiles = numDataFiles;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of pre, post crs groups.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numPrePostCrsGroups
     */
    public Integer getNumPrePostCrsGroups() {
        return numPrePostCrsGroups;
    }

    /**
     * This is the setter method to the attribute.
     * Number of pre, post crs groups.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numPrePostCrsGroups set the numPrePostCrsGroups.
     */
    public void setNumPrePostCrsGroups(Integer  numPrePostCrsGroups) {
        this.numPrePostCrsGroups = numPrePostCrsGroups;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of total psm groups in waf.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numPsmGroups
     */
    public Integer getNumPsmGroups() {
        return numPsmGroups;
    }

    /**
     * This is the setter method to the attribute.
     * Number of total psm groups in waf.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numPsmGroups set the numPsmGroups.
     */
    public void setNumPsmGroups(Integer  numPsmGroups) {
        this.numPsmGroups = numPsmGroups;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of match elements used in waf psm.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numPsmMatchElements
     */
    public Integer getNumPsmMatchElements() {
        return numPsmMatchElements;
    }

    /**
     * This is the setter method to the attribute.
     * Number of match elements used in waf psm.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numPsmMatchElements set the numPsmMatchElements.
     */
    public void setNumPsmMatchElements(Integer  numPsmMatchElements) {
        this.numPsmMatchElements = numPsmMatchElements;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of match rules per location.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numPsmMatchRulesPerLoc
     */
    public Integer getNumPsmMatchRulesPerLoc() {
        return numPsmMatchRulesPerLoc;
    }

    /**
     * This is the setter method to the attribute.
     * Number of match rules per location.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numPsmMatchRulesPerLoc set the numPsmMatchRulesPerLoc.
     */
    public void setNumPsmMatchRulesPerLoc(Integer  numPsmMatchRulesPerLoc) {
        this.numPsmMatchRulesPerLoc = numPsmMatchRulesPerLoc;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of locations used in waf psm.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numPsmTotalLocations
     */
    public Integer getNumPsmTotalLocations() {
        return numPsmTotalLocations;
    }

    /**
     * This is the setter method to the attribute.
     * Number of locations used in waf psm.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numPsmTotalLocations set the numPsmTotalLocations.
     */
    public void setNumPsmTotalLocations(Integer  numPsmTotalLocations) {
        this.numPsmTotalLocations = numPsmTotalLocations;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of restricted extensions in waf.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numRestrictedExtensions
     */
    public Integer getNumRestrictedExtensions() {
        return numRestrictedExtensions;
    }

    /**
     * This is the setter method to the attribute.
     * Number of restricted extensions in waf.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numRestrictedExtensions set the numRestrictedExtensions.
     */
    public void setNumRestrictedExtensions(Integer  numRestrictedExtensions) {
        this.numRestrictedExtensions = numRestrictedExtensions;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of restricted http headers in waf.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numRestrictedHeaders
     */
    public Integer getNumRestrictedHeaders() {
        return numRestrictedHeaders;
    }

    /**
     * This is the setter method to the attribute.
     * Number of restricted http headers in waf.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numRestrictedHeaders set the numRestrictedHeaders.
     */
    public void setNumRestrictedHeaders(Integer  numRestrictedHeaders) {
        this.numRestrictedHeaders = numRestrictedHeaders;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of tags for waf rule.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numRuleTags
     */
    public Integer getNumRuleTags() {
        return numRuleTags;
    }

    /**
     * This is the setter method to the attribute.
     * Number of tags for waf rule.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numRuleTags set the numRuleTags.
     */
    public void setNumRuleTags(Integer  numRuleTags) {
        this.numRuleTags = numRuleTags;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of rules as per modsec language.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numRulesPerRulegroup
     */
    public Integer getNumRulesPerRulegroup() {
        return numRulesPerRulegroup;
    }

    /**
     * This is the setter method to the attribute.
     * Number of rules as per modsec language.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numRulesPerRulegroup set the numRulesPerRulegroup.
     */
    public void setNumRulesPerRulegroup(Integer  numRulesPerRulegroup) {
        this.numRulesPerRulegroup = numRulesPerRulegroup;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of restricted static extensions in waf.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numStaticExtensions
     */
    public Integer getNumStaticExtensions() {
        return numStaticExtensions;
    }

    /**
     * This is the setter method to the attribute.
     * Number of restricted static extensions in waf.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numStaticExtensions set the numStaticExtensions.
     */
    public void setNumStaticExtensions(Integer  numStaticExtensions) {
        this.numStaticExtensions = numStaticExtensions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      WAFLimits objWAFLimits = (WAFLimits) o;
      return   Objects.equals(this.numAllowedContentTypes, objWAFLimits.numAllowedContentTypes)&&
  Objects.equals(this.numRestrictedExtensions, objWAFLimits.numRestrictedExtensions)&&
  Objects.equals(this.numRestrictedHeaders, objWAFLimits.numRestrictedHeaders)&&
  Objects.equals(this.numStaticExtensions, objWAFLimits.numStaticExtensions)&&
  Objects.equals(this.numDataFiles, objWAFLimits.numDataFiles)&&
  Objects.equals(this.numPsmMatchElements, objWAFLimits.numPsmMatchElements)&&
  Objects.equals(this.numPsmMatchRulesPerLoc, objWAFLimits.numPsmMatchRulesPerLoc)&&
  Objects.equals(this.numPsmTotalLocations, objWAFLimits.numPsmTotalLocations)&&
  Objects.equals(this.numPsmGroups, objWAFLimits.numPsmGroups)&&
  Objects.equals(this.numAllowlistPolicyRules, objWAFLimits.numAllowlistPolicyRules)&&
  Objects.equals(this.numApplications, objWAFLimits.numApplications)&&
  Objects.equals(this.numRulesPerRulegroup, objWAFLimits.numRulesPerRulegroup)&&
  Objects.equals(this.numRuleTags, objWAFLimits.numRuleTags)&&
  Objects.equals(this.numPrePostCrsGroups, objWAFLimits.numPrePostCrsGroups)&&
  Objects.equals(this.numAllowedRequestContentTypeCharsets, objWAFLimits.numAllowedRequestContentTypeCharsets);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WAFLimits {\n");
                  sb.append("    numAllowedContentTypes: ").append(toIndentedString(numAllowedContentTypes)).append("\n");
                        sb.append("    numAllowedRequestContentTypeCharsets: ").append(toIndentedString(numAllowedRequestContentTypeCharsets)).append("\n");
                        sb.append("    numAllowlistPolicyRules: ").append(toIndentedString(numAllowlistPolicyRules)).append("\n");
                        sb.append("    numApplications: ").append(toIndentedString(numApplications)).append("\n");
                        sb.append("    numDataFiles: ").append(toIndentedString(numDataFiles)).append("\n");
                        sb.append("    numPrePostCrsGroups: ").append(toIndentedString(numPrePostCrsGroups)).append("\n");
                        sb.append("    numPsmGroups: ").append(toIndentedString(numPsmGroups)).append("\n");
                        sb.append("    numPsmMatchElements: ").append(toIndentedString(numPsmMatchElements)).append("\n");
                        sb.append("    numPsmMatchRulesPerLoc: ").append(toIndentedString(numPsmMatchRulesPerLoc)).append("\n");
                        sb.append("    numPsmTotalLocations: ").append(toIndentedString(numPsmTotalLocations)).append("\n");
                        sb.append("    numRestrictedExtensions: ").append(toIndentedString(numRestrictedExtensions)).append("\n");
                        sb.append("    numRestrictedHeaders: ").append(toIndentedString(numRestrictedHeaders)).append("\n");
                        sb.append("    numRuleTags: ").append(toIndentedString(numRuleTags)).append("\n");
                        sb.append("    numRulesPerRulegroup: ").append(toIndentedString(numRulesPerRulegroup)).append("\n");
                        sb.append("    numStaticExtensions: ").append(toIndentedString(numStaticExtensions)).append("\n");
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

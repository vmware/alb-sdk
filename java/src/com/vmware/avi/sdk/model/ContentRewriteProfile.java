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
 * The ContentRewriteProfile is a POJO class extends AviRestResource that used for creating
 * ContentRewriteProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContentRewriteProfile  {
    @JsonProperty("req_match_replace_pair")
    private List<MatchReplacePair> reqMatchReplacePair;

    @JsonProperty("request_rewrite_enabled")
    private Boolean requestRewriteEnabled;

    @JsonProperty("response_rewrite_enabled")
    private Boolean responseRewriteEnabled;

    @JsonProperty("rewritable_content_ref")
    private String rewritableContentRef = null;

    @JsonProperty("rsp_match_replace_pair")
    private List<MatchReplacePair> rspMatchReplacePair;

    @JsonProperty("rsp_rewrite_rules")
    private List<RspContentRewriteRule> rspRewriteRules = null;


    /**
     * This is the getter method this will return the attribute value.
     * Strings to be matched and replaced with on the request body.
     * This should be configured when request_rewrite_enabled is set to true.
     * This is currently not supported.
     * Field deprecated in 21.1.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return reqMatchReplacePair
     */
    public List<MatchReplacePair> getReqMatchReplacePair() {
        return reqMatchReplacePair;
    }

    /**
     * This is the setter method. this will set the reqMatchReplacePair
     * Strings to be matched and replaced with on the request body.
     * This should be configured when request_rewrite_enabled is set to true.
     * This is currently not supported.
     * Field deprecated in 21.1.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return reqMatchReplacePair
     */
    public void setReqMatchReplacePair(List<MatchReplacePair>  reqMatchReplacePair) {
        this.reqMatchReplacePair = reqMatchReplacePair;
    }

    /**
     * This is the setter method this will set the reqMatchReplacePair
     * Strings to be matched and replaced with on the request body.
     * This should be configured when request_rewrite_enabled is set to true.
     * This is currently not supported.
     * Field deprecated in 21.1.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return reqMatchReplacePair
     */
    public ContentRewriteProfile addReqMatchReplacePairItem(MatchReplacePair reqMatchReplacePairItem) {
      if (this.reqMatchReplacePair == null) {
        this.reqMatchReplacePair = new ArrayList<MatchReplacePair>();
      }
      this.reqMatchReplacePair.add(reqMatchReplacePairItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable rewrite on request body.
     * This is not currently supported.
     * Field deprecated in 21.1.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return requestRewriteEnabled
     */
    public Boolean getRequestRewriteEnabled() {
        return requestRewriteEnabled;
    }

    /**
     * This is the setter method to the attribute.
     * Enable rewrite on request body.
     * This is not currently supported.
     * Field deprecated in 21.1.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param requestRewriteEnabled set the requestRewriteEnabled.
     */
    public void setRequestRewriteEnabled(Boolean  requestRewriteEnabled) {
        this.requestRewriteEnabled = requestRewriteEnabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable rewrite on response body.
     * Field deprecated in 21.1.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return responseRewriteEnabled
     */
    public Boolean getResponseRewriteEnabled() {
        return responseRewriteEnabled;
    }

    /**
     * This is the setter method to the attribute.
     * Enable rewrite on response body.
     * Field deprecated in 21.1.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param responseRewriteEnabled set the responseRewriteEnabled.
     */
    public void setResponseRewriteEnabled(Boolean  responseRewriteEnabled) {
        this.responseRewriteEnabled = responseRewriteEnabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Rewrite only content types listed in this string group.
     * Content types not present in this list are not rewritten.
     * It is a reference to an object of type stringgroup.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rewritableContentRef
     */
    public String getRewritableContentRef() {
        return rewritableContentRef;
    }

    /**
     * This is the setter method to the attribute.
     * Rewrite only content types listed in this string group.
     * Content types not present in this list are not rewritten.
     * It is a reference to an object of type stringgroup.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param rewritableContentRef set the rewritableContentRef.
     */
    public void setRewritableContentRef(String  rewritableContentRef) {
        this.rewritableContentRef = rewritableContentRef;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Strings to be matched and replaced with on the response body.
     * This should be configured when response_rewrite_enabled is set to true.
     * Field deprecated in 21.1.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return rspMatchReplacePair
     */
    public List<MatchReplacePair> getRspMatchReplacePair() {
        return rspMatchReplacePair;
    }

    /**
     * This is the setter method. this will set the rspMatchReplacePair
     * Strings to be matched and replaced with on the response body.
     * This should be configured when response_rewrite_enabled is set to true.
     * Field deprecated in 21.1.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return rspMatchReplacePair
     */
    public void setRspMatchReplacePair(List<MatchReplacePair>  rspMatchReplacePair) {
        this.rspMatchReplacePair = rspMatchReplacePair;
    }

    /**
     * This is the setter method this will set the rspMatchReplacePair
     * Strings to be matched and replaced with on the response body.
     * This should be configured when response_rewrite_enabled is set to true.
     * Field deprecated in 21.1.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return rspMatchReplacePair
     */
    public ContentRewriteProfile addRspMatchReplacePairItem(MatchReplacePair rspMatchReplacePairItem) {
      if (this.rspMatchReplacePair == null) {
        this.rspMatchReplacePair = new ArrayList<MatchReplacePair>();
      }
      this.rspMatchReplacePair.add(rspMatchReplacePairItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Content rewrite rules to be enabled on theresponse body.
     * Field introduced in 21.1.3.
     * Maximum of 1 items allowed.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rspRewriteRules
     */
    public List<RspContentRewriteRule> getRspRewriteRules() {
        return rspRewriteRules;
    }

    /**
     * This is the setter method. this will set the rspRewriteRules
     * Content rewrite rules to be enabled on theresponse body.
     * Field introduced in 21.1.3.
     * Maximum of 1 items allowed.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rspRewriteRules
     */
    public void setRspRewriteRules(List<RspContentRewriteRule>  rspRewriteRules) {
        this.rspRewriteRules = rspRewriteRules;
    }

    /**
     * This is the setter method this will set the rspRewriteRules
     * Content rewrite rules to be enabled on theresponse body.
     * Field introduced in 21.1.3.
     * Maximum of 1 items allowed.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rspRewriteRules
     */
    public ContentRewriteProfile addRspRewriteRulesItem(RspContentRewriteRule rspRewriteRulesItem) {
      if (this.rspRewriteRules == null) {
        this.rspRewriteRules = new ArrayList<RspContentRewriteRule>();
      }
      this.rspRewriteRules.add(rspRewriteRulesItem);
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
      ContentRewriteProfile objContentRewriteProfile = (ContentRewriteProfile) o;
      return   Objects.equals(this.rewritableContentRef, objContentRewriteProfile.rewritableContentRef)&&
  Objects.equals(this.requestRewriteEnabled, objContentRewriteProfile.requestRewriteEnabled)&&
  Objects.equals(this.responseRewriteEnabled, objContentRewriteProfile.responseRewriteEnabled)&&
  Objects.equals(this.reqMatchReplacePair, objContentRewriteProfile.reqMatchReplacePair)&&
  Objects.equals(this.rspMatchReplacePair, objContentRewriteProfile.rspMatchReplacePair)&&
  Objects.equals(this.rspRewriteRules, objContentRewriteProfile.rspRewriteRules);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ContentRewriteProfile {\n");
                  sb.append("    reqMatchReplacePair: ").append(toIndentedString(reqMatchReplacePair)).append("\n");
                        sb.append("    requestRewriteEnabled: ").append(toIndentedString(requestRewriteEnabled)).append("\n");
                        sb.append("    responseRewriteEnabled: ").append(toIndentedString(responseRewriteEnabled)).append("\n");
                        sb.append("    rewritableContentRef: ").append(toIndentedString(rewritableContentRef)).append("\n");
                        sb.append("    rspMatchReplacePair: ").append(toIndentedString(rspMatchReplacePair)).append("\n");
                        sb.append("    rspRewriteRules: ").append(toIndentedString(rspRewriteRules)).append("\n");
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

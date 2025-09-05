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
 * The AppLearningParams is a POJO class extends AviRestResource that used for creating
 * AppLearningParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppLearningParams  {
    @JsonProperty("enable_learn_from_bots")
    private Boolean enableLearnFromBots;

    @JsonProperty("enable_per_uri_learning")
    private Boolean enablePerUriLearning;

    @JsonProperty("learn_from_authenticated_clients_only")
    private Boolean learnFromAuthenticatedClientsOnly;

    @JsonProperty("learn_from_bots")
    private BotDetectionMatch learnFromBots;

    @JsonProperty("max_params")
    private Integer maxParams;

    @JsonProperty("max_uris")
    private Integer maxUris;

    @JsonProperty("min_hits_to_learn")
    private Integer minHitsToLearn;

    @JsonProperty("sampling_percent")
    private Integer samplingPercent;

    @JsonProperty("trusted_ipgroup_ref")
    private String trustedIpgroupRef;

    @JsonProperty("update_interval")
    private Integer updateInterval;



    /**
     * This is the getter method this will return the attribute value.
     * [deprecated] if this is set to true, waf will only learn from clients which match the learn_from_bots specification.
     * The settings learn_from_authenticated_requests and trusted_ip_groups always take precedence.
     * Field deprecated in 31.2.1.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * @return enableLearnFromBots
     */
    public Boolean getEnableLearnFromBots() {
        return enableLearnFromBots;
    }

    /**
     * This is the setter method to the attribute.
     * [deprecated] if this is set to true, waf will only learn from clients which match the learn_from_bots specification.
     * The settings learn_from_authenticated_requests and trusted_ip_groups always take precedence.
     * Field deprecated in 31.2.1.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * @param enableLearnFromBots set the enableLearnFromBots.
     */
    public void setEnableLearnFromBots(Boolean  enableLearnFromBots) {
        this.enableLearnFromBots = enableLearnFromBots;
    }

    /**
     * This is the getter method this will return the attribute value.
     * [deprecated] learn the params per uri path.
     * Field deprecated in 31.2.1.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return enablePerUriLearning
     */
    public Boolean getEnablePerUriLearning() {
        return enablePerUriLearning;
    }

    /**
     * This is the setter method to the attribute.
     * [deprecated] learn the params per uri path.
     * Field deprecated in 31.2.1.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param enablePerUriLearning set the enablePerUriLearning.
     */
    public void setEnablePerUriLearning(Boolean  enablePerUriLearning) {
        this.enablePerUriLearning = enablePerUriLearning;
    }

    /**
     * This is the getter method this will return the attribute value.
     * [deprecated] if true, learning will only be performed on requests from clients who have passed the authentication process configured in the
     * virtual service's auth profile.
     * Field deprecated in 31.2.1.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * @return learnFromAuthenticatedClientsOnly
     */
    public Boolean getLearnFromAuthenticatedClientsOnly() {
        return learnFromAuthenticatedClientsOnly;
    }

    /**
     * This is the setter method to the attribute.
     * [deprecated] if true, learning will only be performed on requests from clients who have passed the authentication process configured in the
     * virtual service's auth profile.
     * Field deprecated in 31.2.1.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * @param learnFromAuthenticatedClientsOnly set the learnFromAuthenticatedClientsOnly.
     */
    public void setLearnFromAuthenticatedClientsOnly(Boolean  learnFromAuthenticatedClientsOnly) {
        this.learnFromAuthenticatedClientsOnly = learnFromAuthenticatedClientsOnly;
    }

    /**
     * This is the getter method this will return the attribute value.
     * [deprecated] if bot detection is active for this virtual service, learning will only be performed on requests from clients within the configured
     * bot classification types.
     * Field deprecated in 31.2.1.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * @return learnFromBots
     */
    public BotDetectionMatch getLearnFromBots() {
        return learnFromBots;
    }

    /**
     * This is the setter method to the attribute.
     * [deprecated] if bot detection is active for this virtual service, learning will only be performed on requests from clients within the configured
     * bot classification types.
     * Field deprecated in 31.2.1.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * @param learnFromBots set the learnFromBots.
     */
    public void setLearnFromBots(BotDetectionMatch learnFromBots) {
        this.learnFromBots = learnFromBots;
    }

    /**
     * This is the getter method this will return the attribute value.
     * [deprecated] maximum number of params programmed for an application.
     * Allowed values are 10-1000.
     * Field deprecated in 31.2.1.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return maxParams
     */
    public Integer getMaxParams() {
        return maxParams;
    }

    /**
     * This is the setter method to the attribute.
     * [deprecated] maximum number of params programmed for an application.
     * Allowed values are 10-1000.
     * Field deprecated in 31.2.1.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param maxParams set the maxParams.
     */
    public void setMaxParams(Integer  maxParams) {
        this.maxParams = maxParams;
    }

    /**
     * This is the getter method this will return the attribute value.
     * [deprecated] maximum number of uri paths programmed for an application.
     * Allowed values are 10-10000.
     * Field deprecated in 31.2.1.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return maxUris
     */
    public Integer getMaxUris() {
        return maxUris;
    }

    /**
     * This is the setter method to the attribute.
     * [deprecated] maximum number of uri paths programmed for an application.
     * Allowed values are 10-10000.
     * Field deprecated in 31.2.1.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param maxUris set the maxUris.
     */
    public void setMaxUris(Integer  maxUris) {
        this.maxUris = maxUris;
    }

    /**
     * This is the getter method this will return the attribute value.
     * [deprecated] minimum number of occurances required for a param to qualify for learning.
     * Field deprecated in 31.2.1.
     * Field introduced in 18.2.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return minHitsToLearn
     */
    public Integer getMinHitsToLearn() {
        return minHitsToLearn;
    }

    /**
     * This is the setter method to the attribute.
     * [deprecated] minimum number of occurances required for a param to qualify for learning.
     * Field deprecated in 31.2.1.
     * Field introduced in 18.2.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param minHitsToLearn set the minHitsToLearn.
     */
    public void setMinHitsToLearn(Integer  minHitsToLearn) {
        this.minHitsToLearn = minHitsToLearn;
    }

    /**
     * This is the getter method this will return the attribute value.
     * [deprecated] percent of the requests subjected to application learning.
     * Allowed values are 1-100.
     * Field deprecated in 31.2.1.
     * Field introduced in 18.2.3.
     * Unit is percent.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return samplingPercent
     */
    public Integer getSamplingPercent() {
        return samplingPercent;
    }

    /**
     * This is the setter method to the attribute.
     * [deprecated] percent of the requests subjected to application learning.
     * Allowed values are 1-100.
     * Field deprecated in 31.2.1.
     * Field introduced in 18.2.3.
     * Unit is percent.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param samplingPercent set the samplingPercent.
     */
    public void setSamplingPercent(Integer  samplingPercent) {
        this.samplingPercent = samplingPercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * [deprecated] if configured, learning will only be performed on requests from client ips within the configured ip address group.
     * It is a reference to an object of type ipaddrgroup.
     * Field deprecated in 31.2.1.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * @return trustedIpgroupRef
     */
    public String getTrustedIpgroupRef() {
        return trustedIpgroupRef;
    }

    /**
     * This is the setter method to the attribute.
     * [deprecated] if configured, learning will only be performed on requests from client ips within the configured ip address group.
     * It is a reference to an object of type ipaddrgroup.
     * Field deprecated in 31.2.1.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * @param trustedIpgroupRef set the trustedIpgroupRef.
     */
    public void setTrustedIpgroupRef(String  trustedIpgroupRef) {
        this.trustedIpgroupRef = trustedIpgroupRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * [deprecated] frequency with which se publishes application learning data to controller.
     * Allowed values are 1-60.
     * Field deprecated in 31.2.1.
     * Field introduced in 18.2.3.
     * Unit is min.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return updateInterval
     */
    public Integer getUpdateInterval() {
        return updateInterval;
    }

    /**
     * This is the setter method to the attribute.
     * [deprecated] frequency with which se publishes application learning data to controller.
     * Allowed values are 1-60.
     * Field deprecated in 31.2.1.
     * Field introduced in 18.2.3.
     * Unit is min.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param updateInterval set the updateInterval.
     */
    public void setUpdateInterval(Integer  updateInterval) {
        this.updateInterval = updateInterval;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      AppLearningParams objAppLearningParams = (AppLearningParams) o;
      return   Objects.equals(this.samplingPercent, objAppLearningParams.samplingPercent)&&
  Objects.equals(this.updateInterval, objAppLearningParams.updateInterval)&&
  Objects.equals(this.maxUris, objAppLearningParams.maxUris)&&
  Objects.equals(this.maxParams, objAppLearningParams.maxParams)&&
  Objects.equals(this.enablePerUriLearning, objAppLearningParams.enablePerUriLearning)&&
  Objects.equals(this.minHitsToLearn, objAppLearningParams.minHitsToLearn)&&
  Objects.equals(this.learnFromAuthenticatedClientsOnly, objAppLearningParams.learnFromAuthenticatedClientsOnly)&&
  Objects.equals(this.trustedIpgroupRef, objAppLearningParams.trustedIpgroupRef)&&
  Objects.equals(this.learnFromBots, objAppLearningParams.learnFromBots)&&
  Objects.equals(this.enableLearnFromBots, objAppLearningParams.enableLearnFromBots);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AppLearningParams {\n");
                  sb.append("    enableLearnFromBots: ").append(toIndentedString(enableLearnFromBots)).append("\n");
                        sb.append("    enablePerUriLearning: ").append(toIndentedString(enablePerUriLearning)).append("\n");
                        sb.append("    learnFromAuthenticatedClientsOnly: ").append(toIndentedString(learnFromAuthenticatedClientsOnly)).append("\n");
                        sb.append("    learnFromBots: ").append(toIndentedString(learnFromBots)).append("\n");
                        sb.append("    maxParams: ").append(toIndentedString(maxParams)).append("\n");
                        sb.append("    maxUris: ").append(toIndentedString(maxUris)).append("\n");
                        sb.append("    minHitsToLearn: ").append(toIndentedString(minHitsToLearn)).append("\n");
                        sb.append("    samplingPercent: ").append(toIndentedString(samplingPercent)).append("\n");
                        sb.append("    trustedIpgroupRef: ").append(toIndentedString(trustedIpgroupRef)).append("\n");
                        sb.append("    updateInterval: ").append(toIndentedString(updateInterval)).append("\n");
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

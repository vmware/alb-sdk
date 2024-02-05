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
    @JsonProperty("enable_per_uri_learning")
    private Boolean enablePerUriLearning = true;

    @JsonProperty("learn_from_authenticated_clients_only")
    private Boolean learnFromAuthenticatedClientsOnly = false;

    @JsonProperty("learn_from_bots")
    private BotDetectionMatch learnFromBots;

    @JsonProperty("max_params")
    private Integer maxParams = 100;

    @JsonProperty("max_uris")
    private Integer maxUris = 500;

    @JsonProperty("min_hits_to_learn")
    private Integer minHitsToLearn = 10000;

    @JsonProperty("sampling_percent")
    private Integer samplingPercent = 1;

    @JsonProperty("trusted_ipgroup_ref")
    private String trustedIpgroupRef;

    @JsonProperty("update_interval")
    private Integer updateInterval = 30;



    /**
     * This is the getter method this will return the attribute value.
     * Learn the params per uri path.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return enablePerUriLearning
     */
    public Boolean getEnablePerUriLearning() {
        return enablePerUriLearning;
    }

    /**
     * This is the setter method to the attribute.
     * Learn the params per uri path.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param enablePerUriLearning set the enablePerUriLearning.
     */
    public void setEnablePerUriLearning(Boolean  enablePerUriLearning) {
        this.enablePerUriLearning = enablePerUriLearning;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If true, learning will only be performed on requests from clients who have passed the authentication process configured in the virtual service's
     * auth profile.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return learnFromAuthenticatedClientsOnly
     */
    public Boolean getLearnFromAuthenticatedClientsOnly() {
        return learnFromAuthenticatedClientsOnly;
    }

    /**
     * This is the setter method to the attribute.
     * If true, learning will only be performed on requests from clients who have passed the authentication process configured in the virtual service's
     * auth profile.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param learnFromAuthenticatedClientsOnly set the learnFromAuthenticatedClientsOnly.
     */
    public void setLearnFromAuthenticatedClientsOnly(Boolean  learnFromAuthenticatedClientsOnly) {
        this.learnFromAuthenticatedClientsOnly = learnFromAuthenticatedClientsOnly;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If bot detection is active for this virtual service, learning will only be performed on requests from clients within the configured bot
     * classification types.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return learnFromBots
     */
    public BotDetectionMatch getLearnFromBots() {
        return learnFromBots;
    }

    /**
     * This is the setter method to the attribute.
     * If bot detection is active for this virtual service, learning will only be performed on requests from clients within the configured bot
     * classification types.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param learnFromBots set the learnFromBots.
     */
    public void setLearnFromBots(BotDetectionMatch learnFromBots) {
        this.learnFromBots = learnFromBots;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of params programmed for an application.
     * Allowed values are 10-1000.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @return maxParams
     */
    public Integer getMaxParams() {
        return maxParams;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of params programmed for an application.
     * Allowed values are 10-1000.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @param maxParams set the maxParams.
     */
    public void setMaxParams(Integer  maxParams) {
        this.maxParams = maxParams;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of uri paths programmed for an application.
     * Allowed values are 10-10000.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 500.
     * @return maxUris
     */
    public Integer getMaxUris() {
        return maxUris;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of uri paths programmed for an application.
     * Allowed values are 10-10000.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 500.
     * @param maxUris set the maxUris.
     */
    public void setMaxUris(Integer  maxUris) {
        this.maxUris = maxUris;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum number of occurances required for a param to qualify for learning.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
     * @return minHitsToLearn
     */
    public Integer getMinHitsToLearn() {
        return minHitsToLearn;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum number of occurances required for a param to qualify for learning.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
     * @param minHitsToLearn set the minHitsToLearn.
     */
    public void setMinHitsToLearn(Integer  minHitsToLearn) {
        this.minHitsToLearn = minHitsToLearn;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Percent of the requests subjected to application learning.
     * Allowed values are 1-100.
     * Field introduced in 18.2.3.
     * Unit is percent.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return samplingPercent
     */
    public Integer getSamplingPercent() {
        return samplingPercent;
    }

    /**
     * This is the setter method to the attribute.
     * Percent of the requests subjected to application learning.
     * Allowed values are 1-100.
     * Field introduced in 18.2.3.
     * Unit is percent.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param samplingPercent set the samplingPercent.
     */
    public void setSamplingPercent(Integer  samplingPercent) {
        this.samplingPercent = samplingPercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If configured, learning will only be performed on requests from client ips within the configured ip address group.
     * It is a reference to an object of type ipaddrgroup.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return trustedIpgroupRef
     */
    public String getTrustedIpgroupRef() {
        return trustedIpgroupRef;
    }

    /**
     * This is the setter method to the attribute.
     * If configured, learning will only be performed on requests from client ips within the configured ip address group.
     * It is a reference to an object of type ipaddrgroup.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param trustedIpgroupRef set the trustedIpgroupRef.
     */
    public void setTrustedIpgroupRef(String  trustedIpgroupRef) {
        this.trustedIpgroupRef = trustedIpgroupRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Frequency with which se publishes application learning data to controller.
     * Allowed values are 1-60.
     * Field introduced in 18.2.3.
     * Unit is min.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @return updateInterval
     */
    public Integer getUpdateInterval() {
        return updateInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Frequency with which se publishes application learning data to controller.
     * Allowed values are 1-60.
     * Field introduced in 18.2.3.
     * Unit is min.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
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
  Objects.equals(this.learnFromBots, objAppLearningParams.learnFromBots);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AppLearningParams {\n");
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

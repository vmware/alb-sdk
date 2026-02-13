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
 * The ApplicationInsightsParams is a POJO class extends AviRestResource that used for creating
 * ApplicationInsightsParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationInsightsParams  {
    @JsonProperty("enable_learn_from_bots")
    private Boolean enableLearnFromBots = false;

    @JsonProperty("enable_per_uri_learning")
    private Boolean enablePerUriLearning = true;

    @JsonProperty("learn_from_authenticated_clients_only")
    private Boolean learnFromAuthenticatedClientsOnly = false;

    @JsonProperty("learn_from_bots")
    private BotDetectionMatch learnFromBots;

    @JsonProperty("learn_from_urls_without_args")
    private Boolean learnFromUrlsWithoutArgs = false;

    @JsonProperty("max_params")
    private Integer maxParams = 100;

    @JsonProperty("max_uris")
    private Integer maxUris = 500;

    @JsonProperty("trusted_ipgroup_ref")
    private String trustedIpgroupRef;



    /**
     * This is the getter method this will return the attribute value.
     * If set to true, limit application learning only from clients which match the learn_from_bots specification.
     * The settings learn_from_authenticated_clients_only and trusted_ip_groups always take precedence.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableLearnFromBots
     */
    public Boolean getEnableLearnFromBots() {
        return enableLearnFromBots;
    }

    /**
     * This is the setter method to the attribute.
     * If set to true, limit application learning only from clients which match the learn_from_bots specification.
     * The settings learn_from_authenticated_clients_only and trusted_ip_groups always take precedence.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableLearnFromBots set the enableLearnFromBots.
     */
    public void setEnableLearnFromBots(Boolean  enableLearnFromBots) {
        this.enableLearnFromBots = enableLearnFromBots;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If true, learns the params per uri path.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return enablePerUriLearning
     */
    public Boolean getEnablePerUriLearning() {
        return enablePerUriLearning;
    }

    /**
     * This is the setter method to the attribute.
     * If true, learns the params per uri path.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param enablePerUriLearning set the enablePerUriLearning.
     */
    public void setEnablePerUriLearning(Boolean  enablePerUriLearning) {
        this.enablePerUriLearning = enablePerUriLearning;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Limit application learning only from authenticated clients.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return learnFromAuthenticatedClientsOnly
     */
    public Boolean getLearnFromAuthenticatedClientsOnly() {
        return learnFromAuthenticatedClientsOnly;
    }

    /**
     * This is the setter method to the attribute.
     * Limit application learning only from authenticated clients.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param learnFromAuthenticatedClientsOnly set the learnFromAuthenticatedClientsOnly.
     */
    public void setLearnFromAuthenticatedClientsOnly(Boolean  learnFromAuthenticatedClientsOnly) {
        this.learnFromAuthenticatedClientsOnly = learnFromAuthenticatedClientsOnly;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If bot detection is active for this virtual service, learning will only be performed on application data from clients within the configured bot
     * classification types.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return learnFromBots
     */
    public BotDetectionMatch getLearnFromBots() {
        return learnFromBots;
    }

    /**
     * This is the setter method to the attribute.
     * If bot detection is active for this virtual service, learning will only be performed on application data from clients within the configured bot
     * classification types.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param learnFromBots set the learnFromBots.
     */
    public void setLearnFromBots(BotDetectionMatch learnFromBots) {
        this.learnFromBots = learnFromBots;
    }

    /**
     * This is the getter method this will return the attribute value.
     * When true, the waf includes argument-less uris in its learning process.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return learnFromUrlsWithoutArgs
     */
    public Boolean getLearnFromUrlsWithoutArgs() {
        return learnFromUrlsWithoutArgs;
    }

    /**
     * This is the setter method to the attribute.
     * When true, the waf includes argument-less uris in its learning process.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param learnFromUrlsWithoutArgs set the learnFromUrlsWithoutArgs.
     */
    public void setLearnFromUrlsWithoutArgs(Boolean  learnFromUrlsWithoutArgs) {
        this.learnFromUrlsWithoutArgs = learnFromUrlsWithoutArgs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of parameters per uri programmed for application insights.
     * Allowed values are 10-1000.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @return maxParams
     */
    public Integer getMaxParams() {
        return maxParams;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of parameters per uri programmed for application insights.
     * Allowed values are 10-1000.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @param maxParams set the maxParams.
     */
    public void setMaxParams(Integer  maxParams) {
        this.maxParams = maxParams;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of uris for application insights.
     * Allowed values are 10-10000.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 500.
     * @return maxUris
     */
    public Integer getMaxUris() {
        return maxUris;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of uris for application insights.
     * Allowed values are 10-10000.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 500.
     * @param maxUris set the maxUris.
     */
    public void setMaxUris(Integer  maxUris) {
        this.maxUris = maxUris;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Limits application learning from client ips within the configured ip address group.
     * It is a reference to an object of type ipaddrgroup.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return trustedIpgroupRef
     */
    public String getTrustedIpgroupRef() {
        return trustedIpgroupRef;
    }

    /**
     * This is the setter method to the attribute.
     * Limits application learning from client ips within the configured ip address group.
     * It is a reference to an object of type ipaddrgroup.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param trustedIpgroupRef set the trustedIpgroupRef.
     */
    public void setTrustedIpgroupRef(String  trustedIpgroupRef) {
        this.trustedIpgroupRef = trustedIpgroupRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApplicationInsightsParams objApplicationInsightsParams = (ApplicationInsightsParams) o;
      return   Objects.equals(this.enablePerUriLearning, objApplicationInsightsParams.enablePerUriLearning)&&
  Objects.equals(this.learnFromAuthenticatedClientsOnly, objApplicationInsightsParams.learnFromAuthenticatedClientsOnly)&&
  Objects.equals(this.trustedIpgroupRef, objApplicationInsightsParams.trustedIpgroupRef)&&
  Objects.equals(this.learnFromBots, objApplicationInsightsParams.learnFromBots)&&
  Objects.equals(this.enableLearnFromBots, objApplicationInsightsParams.enableLearnFromBots)&&
  Objects.equals(this.learnFromUrlsWithoutArgs, objApplicationInsightsParams.learnFromUrlsWithoutArgs)&&
  Objects.equals(this.maxUris, objApplicationInsightsParams.maxUris)&&
  Objects.equals(this.maxParams, objApplicationInsightsParams.maxParams);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApplicationInsightsParams {\n");
                  sb.append("    enableLearnFromBots: ").append(toIndentedString(enableLearnFromBots)).append("\n");
                        sb.append("    enablePerUriLearning: ").append(toIndentedString(enablePerUriLearning)).append("\n");
                        sb.append("    learnFromAuthenticatedClientsOnly: ").append(toIndentedString(learnFromAuthenticatedClientsOnly)).append("\n");
                        sb.append("    learnFromBots: ").append(toIndentedString(learnFromBots)).append("\n");
                        sb.append("    learnFromUrlsWithoutArgs: ").append(toIndentedString(learnFromUrlsWithoutArgs)).append("\n");
                        sb.append("    maxParams: ").append(toIndentedString(maxParams)).append("\n");
                        sb.append("    maxUris: ").append(toIndentedString(maxUris)).append("\n");
                        sb.append("    trustedIpgroupRef: ").append(toIndentedString(trustedIpgroupRef)).append("\n");
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

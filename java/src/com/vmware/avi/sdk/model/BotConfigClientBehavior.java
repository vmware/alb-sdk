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
 * The BotConfigClientBehavior is a POJO class extends AviRestResource that used for creating
 * BotConfigClientBehavior.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BotConfigClientBehavior  {
    @JsonProperty("bad_request_percent")
    private Integer badRequestPercent = 20;

    @JsonProperty("enabled")
    private Boolean enabled = true;

    @JsonProperty("minimum_requests")
    private Integer minimumRequests = 3;

    @JsonProperty("minimum_requests_with_referer")
    private Integer minimumRequestsWithReferer = 1;



    /**
     * This is the getter method this will return the attribute value.
     * Minimum percentage of bad requests for the client behavior component to identify as a bot.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.
     * @return badRequestPercent
     */
    public Integer getBadRequestPercent() {
        return badRequestPercent;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum percentage of bad requests for the client behavior component to identify as a bot.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.
     * @param badRequestPercent set the badRequestPercent.
     */
    public void setBadRequestPercent(Integer  badRequestPercent) {
        this.badRequestPercent = badRequestPercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Whether client behavior based bot detection is enabled.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This is the setter method to the attribute.
     * Whether client behavior based bot detection is enabled.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param enabled set the enabled.
     */
    public void setEnabled(Boolean  enabled) {
        this.enabled = enabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum requests for the client behavior component to make a decision.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3.
     * @return minimumRequests
     */
    public Integer getMinimumRequests() {
        return minimumRequests;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum requests for the client behavior component to make a decision.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3.
     * @param minimumRequests set the minimumRequests.
     */
    public void setMinimumRequests(Integer  minimumRequests) {
        this.minimumRequests = minimumRequests;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum requests with a referer for the client behavior component to not identify as a bot.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return minimumRequestsWithReferer
     */
    public Integer getMinimumRequestsWithReferer() {
        return minimumRequestsWithReferer;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum requests with a referer for the client behavior component to not identify as a bot.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param minimumRequestsWithReferer set the minimumRequestsWithReferer.
     */
    public void setMinimumRequestsWithReferer(Integer  minimumRequestsWithReferer) {
        this.minimumRequestsWithReferer = minimumRequestsWithReferer;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      BotConfigClientBehavior objBotConfigClientBehavior = (BotConfigClientBehavior) o;
      return   Objects.equals(this.enabled, objBotConfigClientBehavior.enabled)&&
  Objects.equals(this.minimumRequests, objBotConfigClientBehavior.minimumRequests)&&
  Objects.equals(this.minimumRequestsWithReferer, objBotConfigClientBehavior.minimumRequestsWithReferer)&&
  Objects.equals(this.badRequestPercent, objBotConfigClientBehavior.badRequestPercent);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BotConfigClientBehavior {\n");
                  sb.append("    badRequestPercent: ").append(toIndentedString(badRequestPercent)).append("\n");
                        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
                        sb.append("    minimumRequests: ").append(toIndentedString(minimumRequests)).append("\n");
                        sb.append("    minimumRequestsWithReferer: ").append(toIndentedString(minimumRequestsWithReferer)).append("\n");
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

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
 * The DnsRuleAction is a POJO class extends AviRestResource that used for creating
 * DnsRuleAction.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DnsRuleAction  {
    @JsonProperty("allow")
    private DnsRuleActionAllowDrop allow;

    @JsonProperty("dns_rate_limiter")
    private DnsRateLimiter dnsRateLimiter;

    @JsonProperty("gs_group_selection")
    private DnsRuleActionGsGroupSelection gsGroupSelection;

    @JsonProperty("gslb_site_selection")
    private DnsRuleActionGslbSiteSelection gslbSiteSelection;

    @JsonProperty("pool_switching")
    private DnsRuleActionPoolSwitching poolSwitching;

    @JsonProperty("response")
    private DnsRuleActionResponse response;



    /**
     * This is the getter method this will return the attribute value.
     * Allow or drop the dns query.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return allow
     */
    public DnsRuleActionAllowDrop getAllow() {
        return allow;
    }

    /**
     * This is the setter method to the attribute.
     * Allow or drop the dns query.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param allow set the allow.
     */
    public void setAllow(DnsRuleActionAllowDrop allow) {
        this.allow = allow;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Rate limits the dns requests.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsRateLimiter
     */
    public DnsRateLimiter getDnsRateLimiter() {
        return dnsRateLimiter;
    }

    /**
     * This is the setter method to the attribute.
     * Rate limits the dns requests.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dnsRateLimiter set the dnsRateLimiter.
     */
    public void setDnsRateLimiter(DnsRateLimiter dnsRateLimiter) {
        this.dnsRateLimiter = dnsRateLimiter;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Gslb service group to be selected.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gsGroupSelection
     */
    public DnsRuleActionGsGroupSelection getGsGroupSelection() {
        return gsGroupSelection;
    }

    /**
     * This is the setter method to the attribute.
     * Gslb service group to be selected.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gsGroupSelection set the gsGroupSelection.
     */
    public void setGsGroupSelection(DnsRuleActionGsGroupSelection gsGroupSelection) {
        this.gsGroupSelection = gsGroupSelection;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Select a specific gslb site for the dns query.
     * This action should be used only when gslb services have been configured for the dns virtual service.
     * Field introduced in 17.1.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gslbSiteSelection
     */
    public DnsRuleActionGslbSiteSelection getGslbSiteSelection() {
        return gslbSiteSelection;
    }

    /**
     * This is the setter method to the attribute.
     * Select a specific gslb site for the dns query.
     * This action should be used only when gslb services have been configured for the dns virtual service.
     * Field introduced in 17.1.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gslbSiteSelection set the gslbSiteSelection.
     */
    public void setGslbSiteSelection(DnsRuleActionGslbSiteSelection gslbSiteSelection) {
        this.gslbSiteSelection = gslbSiteSelection;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Select a pool or pool group for the passthrough dns query which cannot be served locally but could be served by upstream servers.
     * Field introduced in 18.1.3, 17.2.12.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolSwitching
     */
    public DnsRuleActionPoolSwitching getPoolSwitching() {
        return poolSwitching;
    }

    /**
     * This is the setter method to the attribute.
     * Select a pool or pool group for the passthrough dns query which cannot be served locally but could be served by upstream servers.
     * Field introduced in 18.1.3, 17.2.12.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolSwitching set the poolSwitching.
     */
    public void setPoolSwitching(DnsRuleActionPoolSwitching poolSwitching) {
        this.poolSwitching = poolSwitching;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Generate a response for the dns query.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return response
     */
    public DnsRuleActionResponse getResponse() {
        return response;
    }

    /**
     * This is the setter method to the attribute.
     * Generate a response for the dns query.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param response set the response.
     */
    public void setResponse(DnsRuleActionResponse response) {
        this.response = response;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DnsRuleAction objDnsRuleAction = (DnsRuleAction) o;
      return   Objects.equals(this.allow, objDnsRuleAction.allow)&&
  Objects.equals(this.response, objDnsRuleAction.response)&&
  Objects.equals(this.gslbSiteSelection, objDnsRuleAction.gslbSiteSelection)&&
  Objects.equals(this.poolSwitching, objDnsRuleAction.poolSwitching)&&
  Objects.equals(this.dnsRateLimiter, objDnsRuleAction.dnsRateLimiter)&&
  Objects.equals(this.gsGroupSelection, objDnsRuleAction.gsGroupSelection);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DnsRuleAction {\n");
                  sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
                        sb.append("    dnsRateLimiter: ").append(toIndentedString(dnsRateLimiter)).append("\n");
                        sb.append("    gsGroupSelection: ").append(toIndentedString(gsGroupSelection)).append("\n");
                        sb.append("    gslbSiteSelection: ").append(toIndentedString(gslbSiteSelection)).append("\n");
                        sb.append("    poolSwitching: ").append(toIndentedString(poolSwitching)).append("\n");
                        sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

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
 * The WafLog is a POJO class extends AviRestResource that used for creating
 * WafLog.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WafLog  {
    @JsonProperty("allowlist_configured")
    private Boolean allowlistConfigured = false;

    @JsonProperty("allowlist_logs")
    private List<WafAllowlistLog> allowlistLogs = null;

    @JsonProperty("allowlist_processed")
    private Boolean allowlistProcessed = false;

    @JsonProperty("application_rule_logs")
    private List<WafRuleLog> applicationRuleLogs = null;

    @JsonProperty("application_rules_configured")
    private Boolean applicationRulesConfigured = false;

    @JsonProperty("application_rules_processed")
    private Boolean applicationRulesProcessed = false;

    @JsonProperty("latency_request_body_phase")
    private Integer latencyRequestBodyPhase = null;

    @JsonProperty("latency_request_header_phase")
    private Integer latencyRequestHeaderPhase = null;

    @JsonProperty("latency_response_body_phase")
    private Integer latencyResponseBodyPhase = null;

    @JsonProperty("latency_response_header_phase")
    private Integer latencyResponseHeaderPhase = null;

    @JsonProperty("memory_allocated")
    private Integer memoryAllocated = null;

    @JsonProperty("omitted_app_rule_stats")
    private OmittedWafLogStats omittedAppRuleStats = null;

    @JsonProperty("omitted_signature_stats")
    private OmittedWafLogStats omittedSignatureStats = null;

    @JsonProperty("psm_configured")
    private Boolean psmConfigured = false;

    @JsonProperty("psm_logs")
    private List<WafPSMLog> psmLogs = null;

    @JsonProperty("psm_processed")
    private Boolean psmProcessed = false;

    @JsonProperty("rule_logs")
    private List<WafRuleLog> ruleLogs = null;

    @JsonProperty("rules_configured")
    private Boolean rulesConfigured = false;

    @JsonProperty("rules_processed")
    private Boolean rulesProcessed = false;

    @JsonProperty("status")
    private String status = null;



    /**
     * This is the getter method this will return the attribute value.
     * Set to true if there are allowlist rules in the policy.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return allowlistConfigured
     */
    public Boolean getAllowlistConfigured() {
        return allowlistConfigured;
    }

    /**
     * This is the setter method to the attribute.
     * Set to true if there are allowlist rules in the policy.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param allowlistConfigured set the allowlistConfigured.
     */
    public void setAllowlistConfigured(Boolean  allowlistConfigured) {
        this.allowlistConfigured = allowlistConfigured;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Log entries generated by waf allowlist rules.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return allowlistLogs
     */
    public List<WafAllowlistLog> getAllowlistLogs() {
        return allowlistLogs;
    }

    /**
     * This is the setter method. this will set the allowlistLogs
     * Log entries generated by waf allowlist rules.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return allowlistLogs
     */
    public void setAllowlistLogs(List<WafAllowlistLog>  allowlistLogs) {
        this.allowlistLogs = allowlistLogs;
    }

    /**
     * This is the setter method this will set the allowlistLogs
     * Log entries generated by waf allowlist rules.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return allowlistLogs
     */
    public WafLog addAllowlistLogsItem(WafAllowlistLog allowlistLogsItem) {
      if (this.allowlistLogs == null) {
        this.allowlistLogs = new ArrayList<WafAllowlistLog>();
      }
      this.allowlistLogs.add(allowlistLogsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Set to true if allowlist rules were processed.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return allowlistProcessed
     */
    public Boolean getAllowlistProcessed() {
        return allowlistProcessed;
    }

    /**
     * This is the setter method to the attribute.
     * Set to true if allowlist rules were processed.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param allowlistProcessed set the allowlistProcessed.
     */
    public void setAllowlistProcessed(Boolean  allowlistProcessed) {
        this.allowlistProcessed = allowlistProcessed;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Log entries generated by application specific signature rules.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return applicationRuleLogs
     */
    public List<WafRuleLog> getApplicationRuleLogs() {
        return applicationRuleLogs;
    }

    /**
     * This is the setter method. this will set the applicationRuleLogs
     * Log entries generated by application specific signature rules.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return applicationRuleLogs
     */
    public void setApplicationRuleLogs(List<WafRuleLog>  applicationRuleLogs) {
        this.applicationRuleLogs = applicationRuleLogs;
    }

    /**
     * This is the setter method this will set the applicationRuleLogs
     * Log entries generated by application specific signature rules.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return applicationRuleLogs
     */
    public WafLog addApplicationRuleLogsItem(WafRuleLog applicationRuleLogsItem) {
      if (this.applicationRuleLogs == null) {
        this.applicationRuleLogs = new ArrayList<WafRuleLog>();
      }
      this.applicationRuleLogs.add(applicationRuleLogsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Set to true if there are application specific signature rules in the policy.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return applicationRulesConfigured
     */
    public Boolean getApplicationRulesConfigured() {
        return applicationRulesConfigured;
    }

    /**
     * This is the setter method to the attribute.
     * Set to true if there are application specific signature rules in the policy.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param applicationRulesConfigured set the applicationRulesConfigured.
     */
    public void setApplicationRulesConfigured(Boolean  applicationRulesConfigured) {
        this.applicationRulesConfigured = applicationRulesConfigured;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Set to true if application specific signature rules were processed.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return applicationRulesProcessed
     */
    public Boolean getApplicationRulesProcessed() {
        return applicationRulesProcessed;
    }

    /**
     * This is the setter method to the attribute.
     * Set to true if application specific signature rules were processed.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param applicationRulesProcessed set the applicationRulesProcessed.
     */
    public void setApplicationRulesProcessed(Boolean  applicationRulesProcessed) {
        this.applicationRulesProcessed = applicationRulesProcessed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Latency (in microseconds) in waf request body phase.
     * Field introduced in 17.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return latencyRequestBodyPhase
     */
    public Integer getLatencyRequestBodyPhase() {
        return latencyRequestBodyPhase;
    }

    /**
     * This is the setter method to the attribute.
     * Latency (in microseconds) in waf request body phase.
     * Field introduced in 17.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param latencyRequestBodyPhase set the latencyRequestBodyPhase.
     */
    public void setLatencyRequestBodyPhase(Integer  latencyRequestBodyPhase) {
        this.latencyRequestBodyPhase = latencyRequestBodyPhase;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Latency (in microseconds) in waf request header phase.
     * Field introduced in 17.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return latencyRequestHeaderPhase
     */
    public Integer getLatencyRequestHeaderPhase() {
        return latencyRequestHeaderPhase;
    }

    /**
     * This is the setter method to the attribute.
     * Latency (in microseconds) in waf request header phase.
     * Field introduced in 17.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param latencyRequestHeaderPhase set the latencyRequestHeaderPhase.
     */
    public void setLatencyRequestHeaderPhase(Integer  latencyRequestHeaderPhase) {
        this.latencyRequestHeaderPhase = latencyRequestHeaderPhase;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Latency (in microseconds) in waf response body phase.
     * Field introduced in 17.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return latencyResponseBodyPhase
     */
    public Integer getLatencyResponseBodyPhase() {
        return latencyResponseBodyPhase;
    }

    /**
     * This is the setter method to the attribute.
     * Latency (in microseconds) in waf response body phase.
     * Field introduced in 17.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param latencyResponseBodyPhase set the latencyResponseBodyPhase.
     */
    public void setLatencyResponseBodyPhase(Integer  latencyResponseBodyPhase) {
        this.latencyResponseBodyPhase = latencyResponseBodyPhase;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Latency (in microseconds) in waf response header phase.
     * Field introduced in 17.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return latencyResponseHeaderPhase
     */
    public Integer getLatencyResponseHeaderPhase() {
        return latencyResponseHeaderPhase;
    }

    /**
     * This is the setter method to the attribute.
     * Latency (in microseconds) in waf response header phase.
     * Field introduced in 17.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param latencyResponseHeaderPhase set the latencyResponseHeaderPhase.
     */
    public void setLatencyResponseHeaderPhase(Integer  latencyResponseHeaderPhase) {
        this.latencyResponseHeaderPhase = latencyResponseHeaderPhase;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The total memory (in bytes) consumed by waf to process this request.
     * Field introduced in 22.1.1.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return memoryAllocated
     */
    public Integer getMemoryAllocated() {
        return memoryAllocated;
    }

    /**
     * This is the setter method to the attribute.
     * The total memory (in bytes) consumed by waf to process this request.
     * Field introduced in 22.1.1.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param memoryAllocated set the memoryAllocated.
     */
    public void setMemoryAllocated(Integer  memoryAllocated) {
        this.memoryAllocated = memoryAllocated;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Omitted application rule log stats.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return omittedAppRuleStats
     */
    public OmittedWafLogStats getOmittedAppRuleStats() {
        return omittedAppRuleStats;
    }

    /**
     * This is the setter method to the attribute.
     * Omitted application rule log stats.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param omittedAppRuleStats set the omittedAppRuleStats.
     */
    public void setOmittedAppRuleStats(OmittedWafLogStats omittedAppRuleStats) {
        this.omittedAppRuleStats = omittedAppRuleStats;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Omitted waf rule log stats.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return omittedSignatureStats
     */
    public OmittedWafLogStats getOmittedSignatureStats() {
        return omittedSignatureStats;
    }

    /**
     * This is the setter method to the attribute.
     * Omitted waf rule log stats.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param omittedSignatureStats set the omittedSignatureStats.
     */
    public void setOmittedSignatureStats(OmittedWafLogStats omittedSignatureStats) {
        this.omittedSignatureStats = omittedSignatureStats;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Set to true if there are positive security model rules in the policy.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return psmConfigured
     */
    public Boolean getPsmConfigured() {
        return psmConfigured;
    }

    /**
     * This is the setter method to the attribute.
     * Set to true if there are positive security model rules in the policy.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param psmConfigured set the psmConfigured.
     */
    public void setPsmConfigured(Boolean  psmConfigured) {
        this.psmConfigured = psmConfigured;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Log entries generated by waf positive security model.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return psmLogs
     */
    public List<WafPSMLog> getPsmLogs() {
        return psmLogs;
    }

    /**
     * This is the setter method. this will set the psmLogs
     * Log entries generated by waf positive security model.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return psmLogs
     */
    public void setPsmLogs(List<WafPSMLog>  psmLogs) {
        this.psmLogs = psmLogs;
    }

    /**
     * This is the setter method this will set the psmLogs
     * Log entries generated by waf positive security model.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return psmLogs
     */
    public WafLog addPsmLogsItem(WafPSMLog psmLogsItem) {
      if (this.psmLogs == null) {
        this.psmLogs = new ArrayList<WafPSMLog>();
      }
      this.psmLogs.add(psmLogsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Set to true if positive security model rules were processed.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return psmProcessed
     */
    public Boolean getPsmProcessed() {
        return psmProcessed;
    }

    /**
     * This is the setter method to the attribute.
     * Set to true if positive security model rules were processed.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param psmProcessed set the psmProcessed.
     */
    public void setPsmProcessed(Boolean  psmProcessed) {
        this.psmProcessed = psmProcessed;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ruleLogs
     */
    public List<WafRuleLog> getRuleLogs() {
        return ruleLogs;
    }

    /**
     * This is the setter method. this will set the ruleLogs
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ruleLogs
     */
    public void setRuleLogs(List<WafRuleLog>  ruleLogs) {
        this.ruleLogs = ruleLogs;
    }

    /**
     * This is the setter method this will set the ruleLogs
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ruleLogs
     */
    public WafLog addRuleLogsItem(WafRuleLog ruleLogsItem) {
      if (this.ruleLogs == null) {
        this.ruleLogs = new ArrayList<WafRuleLog>();
      }
      this.ruleLogs.add(ruleLogsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Set to true if there are modsecurity rules in the policy.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return rulesConfigured
     */
    public Boolean getRulesConfigured() {
        return rulesConfigured;
    }

    /**
     * This is the setter method to the attribute.
     * Set to true if there are modsecurity rules in the policy.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param rulesConfigured set the rulesConfigured.
     */
    public void setRulesConfigured(Boolean  rulesConfigured) {
        this.rulesConfigured = rulesConfigured;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Set to true if modsecurity rules were processed.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return rulesProcessed
     */
    public Boolean getRulesProcessed() {
        return rulesProcessed;
    }

    /**
     * This is the setter method to the attribute.
     * Set to true if modsecurity rules were processed.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param rulesProcessed set the rulesProcessed.
     */
    public void setRulesProcessed(Boolean  rulesProcessed) {
        this.rulesProcessed = rulesProcessed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Denotes whether waf is running in detection mode or enforcement mode, whether any rules matched the transaction, and whether transaction is
     * dropped by the waf module.
     * Enum options - NO_WAF, FLAGGED, PASSED, REJECTED, ALLOWLISTED, BYPASSED.
     * Field introduced in 17.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * This is the setter method to the attribute.
     * Denotes whether waf is running in detection mode or enforcement mode, whether any rules matched the transaction, and whether transaction is
     * dropped by the waf module.
     * Enum options - NO_WAF, FLAGGED, PASSED, REJECTED, ALLOWLISTED, BYPASSED.
     * Field introduced in 17.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param status set the status.
     */
    public void setStatus(String  status) {
        this.status = status;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      WafLog objWafLog = (WafLog) o;
      return   Objects.equals(this.ruleLogs, objWafLog.ruleLogs)&&
  Objects.equals(this.status, objWafLog.status)&&
  Objects.equals(this.latencyRequestHeaderPhase, objWafLog.latencyRequestHeaderPhase)&&
  Objects.equals(this.latencyRequestBodyPhase, objWafLog.latencyRequestBodyPhase)&&
  Objects.equals(this.latencyResponseHeaderPhase, objWafLog.latencyResponseHeaderPhase)&&
  Objects.equals(this.latencyResponseBodyPhase, objWafLog.latencyResponseBodyPhase)&&
  Objects.equals(this.rulesConfigured, objWafLog.rulesConfigured)&&
  Objects.equals(this.psmLogs, objWafLog.psmLogs)&&
  Objects.equals(this.psmConfigured, objWafLog.psmConfigured)&&
  Objects.equals(this.applicationRuleLogs, objWafLog.applicationRuleLogs)&&
  Objects.equals(this.applicationRulesConfigured, objWafLog.applicationRulesConfigured)&&
  Objects.equals(this.allowlistLogs, objWafLog.allowlistLogs)&&
  Objects.equals(this.allowlistConfigured, objWafLog.allowlistConfigured)&&
  Objects.equals(this.allowlistProcessed, objWafLog.allowlistProcessed)&&
  Objects.equals(this.rulesProcessed, objWafLog.rulesProcessed)&&
  Objects.equals(this.psmProcessed, objWafLog.psmProcessed)&&
  Objects.equals(this.applicationRulesProcessed, objWafLog.applicationRulesProcessed)&&
  Objects.equals(this.memoryAllocated, objWafLog.memoryAllocated)&&
  Objects.equals(this.omittedSignatureStats, objWafLog.omittedSignatureStats)&&
  Objects.equals(this.omittedAppRuleStats, objWafLog.omittedAppRuleStats);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WafLog {\n");
                  sb.append("    allowlistConfigured: ").append(toIndentedString(allowlistConfigured)).append("\n");
                        sb.append("    allowlistLogs: ").append(toIndentedString(allowlistLogs)).append("\n");
                        sb.append("    allowlistProcessed: ").append(toIndentedString(allowlistProcessed)).append("\n");
                        sb.append("    applicationRuleLogs: ").append(toIndentedString(applicationRuleLogs)).append("\n");
                        sb.append("    applicationRulesConfigured: ").append(toIndentedString(applicationRulesConfigured)).append("\n");
                        sb.append("    applicationRulesProcessed: ").append(toIndentedString(applicationRulesProcessed)).append("\n");
                        sb.append("    latencyRequestBodyPhase: ").append(toIndentedString(latencyRequestBodyPhase)).append("\n");
                        sb.append("    latencyRequestHeaderPhase: ").append(toIndentedString(latencyRequestHeaderPhase)).append("\n");
                        sb.append("    latencyResponseBodyPhase: ").append(toIndentedString(latencyResponseBodyPhase)).append("\n");
                        sb.append("    latencyResponseHeaderPhase: ").append(toIndentedString(latencyResponseHeaderPhase)).append("\n");
                        sb.append("    memoryAllocated: ").append(toIndentedString(memoryAllocated)).append("\n");
                        sb.append("    omittedAppRuleStats: ").append(toIndentedString(omittedAppRuleStats)).append("\n");
                        sb.append("    omittedSignatureStats: ").append(toIndentedString(omittedSignatureStats)).append("\n");
                        sb.append("    psmConfigured: ").append(toIndentedString(psmConfigured)).append("\n");
                        sb.append("    psmLogs: ").append(toIndentedString(psmLogs)).append("\n");
                        sb.append("    psmProcessed: ").append(toIndentedString(psmProcessed)).append("\n");
                        sb.append("    ruleLogs: ").append(toIndentedString(ruleLogs)).append("\n");
                        sb.append("    rulesConfigured: ").append(toIndentedString(rulesConfigured)).append("\n");
                        sb.append("    rulesProcessed: ").append(toIndentedString(rulesProcessed)).append("\n");
                        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

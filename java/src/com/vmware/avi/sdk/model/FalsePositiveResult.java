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
 * The FalsePositiveResult is a POJO class extends AviRestResource that used for creating
 * FalsePositiveResult.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FalsePositiveResult  {
    @JsonProperty("attack")
    private Boolean attack;

    @JsonProperty("confidence")
    private Float confidence;

    @JsonProperty("false_positive")
    private Boolean falsePositive;

    @JsonProperty("fp_result_header")
    private FalsePositiveResultHeader fpResultHeader;

    @JsonProperty("http_method")
    private String httpMethod;

    @JsonProperty("http_request_header_info")
    private HeaderInfoInURI httpRequestHeaderInfo;

    @JsonProperty("params_info")
    private ParamsInURI paramsInfo;

    @JsonProperty("rule_info")
    private RuleInfo ruleInfo;

    @JsonProperty("uri")
    private String uri;

    @JsonProperty("uri_result_mode")
    private String uriResultMode;



    /**
     * This is the getter method this will return the attribute value.
     * This flag indicates whether this result is identifying an attack.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return attack
     */
    public Boolean getAttack() {
        return attack;
    }

    /**
     * This is the setter method to the attribute.
     * This flag indicates whether this result is identifying an attack.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param attack set the attack.
     */
    public void setAttack(Boolean  attack) {
        this.attack = attack;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Confidence on false positive detection.
     * Allowed values are 0-100.
     * Field introduced in 21.1.1.
     * Unit is percent.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return confidence
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * This is the setter method to the attribute.
     * Confidence on false positive detection.
     * Allowed values are 0-100.
     * Field introduced in 21.1.1.
     * Unit is percent.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param confidence set the confidence.
     */
    public void setConfidence(Float  confidence) {
        this.confidence = confidence;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This flag indicates whether this result is identifying a false positive.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return falsePositive
     */
    public Boolean getFalsePositive() {
        return falsePositive;
    }

    /**
     * This is the setter method to the attribute.
     * This flag indicates whether this result is identifying a false positive.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param falsePositive set the falsePositive.
     */
    public void setFalsePositive(Boolean  falsePositive) {
        this.falsePositive = falsePositive;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Meta data for this false positive result.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fpResultHeader
     */
    public FalsePositiveResultHeader getFpResultHeader() {
        return fpResultHeader;
    }

    /**
     * This is the setter method to the attribute.
     * Meta data for this false positive result.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param fpResultHeader set the fpResultHeader.
     */
    public void setFpResultHeader(FalsePositiveResultHeader fpResultHeader) {
        this.fpResultHeader = fpResultHeader;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Http method for uris did false positive detection.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return httpMethod
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    /**
     * This is the setter method to the attribute.
     * Http method for uris did false positive detection.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param httpMethod set the httpMethod.
     */
    public void setHttpMethod(String  httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Http request header info if uri hit signature rule and match element is request_headers.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return httpRequestHeaderInfo
     */
    public HeaderInfoInURI getHttpRequestHeaderInfo() {
        return httpRequestHeaderInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Http request header info if uri hit signature rule and match element is request_headers.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param httpRequestHeaderInfo set the httpRequestHeaderInfo.
     */
    public void setHttpRequestHeaderInfo(HeaderInfoInURI httpRequestHeaderInfo) {
        this.httpRequestHeaderInfo = httpRequestHeaderInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Params info if uri hit signature rule and match element is args.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return paramsInfo
     */
    public ParamsInURI getParamsInfo() {
        return paramsInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Params info if uri hit signature rule and match element is args.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param paramsInfo set the paramsInfo.
     */
    public void setParamsInfo(ParamsInURI paramsInfo) {
        this.paramsInfo = paramsInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Signature rule info hitted by uri.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ruleInfo
     */
    public RuleInfo getRuleInfo() {
        return ruleInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Signature rule info hitted by uri.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ruleInfo set the ruleInfo.
     */
    public void setRuleInfo(RuleInfo ruleInfo) {
        this.ruleInfo = ruleInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uris did false positive detection.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * This is the setter method to the attribute.
     * Uris did false positive detection.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uri set the uri.
     */
    public void setUri(String  uri) {
        this.uri = uri;
    }

    /**
     * This is the getter method this will return the attribute value.
     * What failing mode that false positive detected as for current uri.
     * Enum options - ALWAYS_FAIL, SOMETIMES_FAIL, NOT_SURE.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uriResultMode
     */
    public String getUriResultMode() {
        return uriResultMode;
    }

    /**
     * This is the setter method to the attribute.
     * What failing mode that false positive detected as for current uri.
     * Enum options - ALWAYS_FAIL, SOMETIMES_FAIL, NOT_SURE.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uriResultMode set the uriResultMode.
     */
    public void setUriResultMode(String  uriResultMode) {
        this.uriResultMode = uriResultMode;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      FalsePositiveResult objFalsePositiveResult = (FalsePositiveResult) o;
      return   Objects.equals(this.fpResultHeader, objFalsePositiveResult.fpResultHeader)&&
  Objects.equals(this.falsePositive, objFalsePositiveResult.falsePositive)&&
  Objects.equals(this.attack, objFalsePositiveResult.attack)&&
  Objects.equals(this.uri, objFalsePositiveResult.uri)&&
  Objects.equals(this.paramsInfo, objFalsePositiveResult.paramsInfo)&&
  Objects.equals(this.ruleInfo, objFalsePositiveResult.ruleInfo)&&
  Objects.equals(this.confidence, objFalsePositiveResult.confidence)&&
  Objects.equals(this.httpRequestHeaderInfo, objFalsePositiveResult.httpRequestHeaderInfo)&&
  Objects.equals(this.httpMethod, objFalsePositiveResult.httpMethod)&&
  Objects.equals(this.uriResultMode, objFalsePositiveResult.uriResultMode);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FalsePositiveResult {\n");
                  sb.append("    attack: ").append(toIndentedString(attack)).append("\n");
                        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
                        sb.append("    falsePositive: ").append(toIndentedString(falsePositive)).append("\n");
                        sb.append("    fpResultHeader: ").append(toIndentedString(fpResultHeader)).append("\n");
                        sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
                        sb.append("    httpRequestHeaderInfo: ").append(toIndentedString(httpRequestHeaderInfo)).append("\n");
                        sb.append("    paramsInfo: ").append(toIndentedString(paramsInfo)).append("\n");
                        sb.append("    ruleInfo: ").append(toIndentedString(ruleInfo)).append("\n");
                        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
                        sb.append("    uriResultMode: ").append(toIndentedString(uriResultMode)).append("\n");
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

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
 * The RecommendationRequest is a POJO class extends AviRestResource that used for creating
 * RecommendationRequest.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RecommendationRequest  {
    @JsonProperty("match_element")
    private String matchElement = null;

    @JsonProperty("report_timestamp")
    private String reportTimestamp = null;

    @JsonProperty("request_id")
    private String requestId = null;

    @JsonProperty("rule_id")
    private String ruleId = null;

    @JsonProperty("type")
    private String type = null;



    /**
     * This is the getter method this will return the attribute value.
     * The match element for this a false positive should be mitigated.
     * If this is not gives, all match elements will be considered.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return matchElement
     */
    public String getMatchElement() {
        return matchElement;
    }

    /**
     * This is the setter method to the attribute.
     * The match element for this a false positive should be mitigated.
     * If this is not gives, all match elements will be considered.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param matchElement set the matchElement.
     */
    public void setMatchElement(String  matchElement) {
        this.matchElement = matchElement;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The report_timestamp field of the log entry.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reportTimestamp
     */
    public String getReportTimestamp() {
        return reportTimestamp;
    }

    /**
     * This is the setter method to the attribute.
     * The report_timestamp field of the log entry.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reportTimestamp set the reportTimestamp.
     */
    public void setReportTimestamp(String  reportTimestamp) {
        this.reportTimestamp = reportTimestamp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The request_id field of the log entry.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * This is the setter method to the attribute.
     * The request_id field of the log entry.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param requestId set the requestId.
     */
    public void setRequestId(String  requestId) {
        this.requestId = requestId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The rule id for which a false positive should be mitigated.
     * If this is not given, all rules will be considered.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * This is the setter method to the attribute.
     * The rule id for which a false positive should be mitigated.
     * If this is not given, all rules will be considered.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ruleId set the ruleId.
     */
    public void setRuleId(String  ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The type of the request, e.g.
     * Recommendation_request_false_positive.
     * Enum options - RECOMMENDATION_REQUEST_FALSE_POSITIVE.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * The type of the request, e.g.
     * Recommendation_request_false_positive.
     * Enum options - RECOMMENDATION_REQUEST_FALSE_POSITIVE.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      RecommendationRequest objRecommendationRequest = (RecommendationRequest) o;
      return   Objects.equals(this.type, objRecommendationRequest.type)&&
  Objects.equals(this.reportTimestamp, objRecommendationRequest.reportTimestamp)&&
  Objects.equals(this.requestId, objRecommendationRequest.requestId)&&
  Objects.equals(this.ruleId, objRecommendationRequest.ruleId)&&
  Objects.equals(this.matchElement, objRecommendationRequest.matchElement);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RecommendationRequest {\n");
                  sb.append("    matchElement: ").append(toIndentedString(matchElement)).append("\n");
                        sb.append("    reportTimestamp: ").append(toIndentedString(reportTimestamp)).append("\n");
                        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
                        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

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
 * The AdaptReplEventInfo is a POJO class extends AviRestResource that used for creating
 * AdaptReplEventInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdaptReplEventInfo  {
    @JsonProperty("obj_info")
    private ConfigVersionStatus objInfo = null;

    @JsonProperty("reason")
    private String reason = null;

    @JsonProperty("recommendation")
    private String recommendation = null;



    /**
     * This is the getter method this will return the attribute value.
     * Object config version info.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objInfo
     */
    public ConfigVersionStatus getObjInfo() {
        return objInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Object config version info.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param objInfo set the objInfo.
     */
    public void setObjInfo(ConfigVersionStatus objInfo) {
        this.objInfo = objInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reason for the replication issues.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * This is the setter method to the attribute.
     * Reason for the replication issues.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reason set the reason.
     */
    public void setReason(String  reason) {
        this.reason = reason;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Recommended way to resolve replication issue.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return recommendation
     */
    public String getRecommendation() {
        return recommendation;
    }

    /**
     * This is the setter method to the attribute.
     * Recommended way to resolve replication issue.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param recommendation set the recommendation.
     */
    public void setRecommendation(String  recommendation) {
        this.recommendation = recommendation;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      AdaptReplEventInfo objAdaptReplEventInfo = (AdaptReplEventInfo) o;
      return   Objects.equals(this.objInfo, objAdaptReplEventInfo.objInfo)&&
  Objects.equals(this.reason, objAdaptReplEventInfo.reason)&&
  Objects.equals(this.recommendation, objAdaptReplEventInfo.recommendation);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AdaptReplEventInfo {\n");
                  sb.append("    objInfo: ").append(toIndentedString(objInfo)).append("\n");
                        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
                        sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
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

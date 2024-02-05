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
 * The FalsePositiveResultHeader is a POJO class extends AviRestResource that used for creating
 * FalsePositiveResultHeader.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FalsePositiveResultHeader  {
    @JsonProperty("end_analysis_time")
    private String endAnalysisTime;

    @JsonProperty("first_data_received_time")
    private String firstDataReceivedTime;

    @JsonProperty("last_data_received_time")
    private String lastDataReceivedTime;

    @JsonProperty("start_analysis_time")
    private String startAnalysisTime;

    @JsonProperty("transactions_count")
    private Integer transactionsCount;



    /**
     * This is the getter method this will return the attribute value.
     * Time that analytics engine ends to analytics for this false positive result.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return endAnalysisTime
     */
    public String getEndAnalysisTime() {
        return endAnalysisTime;
    }

    /**
     * This is the setter method to the attribute.
     * Time that analytics engine ends to analytics for this false positive result.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param endAnalysisTime set the endAnalysisTime.
     */
    public void setEndAnalysisTime(String  endAnalysisTime) {
        this.endAnalysisTime = endAnalysisTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * First received data time that analytics engine uses to analysis for this false positive result.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return firstDataReceivedTime
     */
    public String getFirstDataReceivedTime() {
        return firstDataReceivedTime;
    }

    /**
     * This is the setter method to the attribute.
     * First received data time that analytics engine uses to analysis for this false positive result.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param firstDataReceivedTime set the firstDataReceivedTime.
     */
    public void setFirstDataReceivedTime(String  firstDataReceivedTime) {
        this.firstDataReceivedTime = firstDataReceivedTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Last received data time that analytics engine uses to analysis for this false positive result.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return lastDataReceivedTime
     */
    public String getLastDataReceivedTime() {
        return lastDataReceivedTime;
    }

    /**
     * This is the setter method to the attribute.
     * Last received data time that analytics engine uses to analysis for this false positive result.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param lastDataReceivedTime set the lastDataReceivedTime.
     */
    public void setLastDataReceivedTime(String  lastDataReceivedTime) {
        this.lastDataReceivedTime = lastDataReceivedTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time that analytics engine starts to analytics for this false positive result.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return startAnalysisTime
     */
    public String getStartAnalysisTime() {
        return startAnalysisTime;
    }

    /**
     * This is the setter method to the attribute.
     * Time that analytics engine starts to analytics for this false positive result.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param startAnalysisTime set the startAnalysisTime.
     */
    public void setStartAnalysisTime(String  startAnalysisTime) {
        this.startAnalysisTime = startAnalysisTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Total data amount analytics engine uses to analytics for this false positive result.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return transactionsCount
     */
    public Integer getTransactionsCount() {
        return transactionsCount;
    }

    /**
     * This is the setter method to the attribute.
     * Total data amount analytics engine uses to analytics for this false positive result.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param transactionsCount set the transactionsCount.
     */
    public void setTransactionsCount(Integer  transactionsCount) {
        this.transactionsCount = transactionsCount;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      FalsePositiveResultHeader objFalsePositiveResultHeader = (FalsePositiveResultHeader) o;
      return   Objects.equals(this.firstDataReceivedTime, objFalsePositiveResultHeader.firstDataReceivedTime)&&
  Objects.equals(this.lastDataReceivedTime, objFalsePositiveResultHeader.lastDataReceivedTime)&&
  Objects.equals(this.transactionsCount, objFalsePositiveResultHeader.transactionsCount)&&
  Objects.equals(this.startAnalysisTime, objFalsePositiveResultHeader.startAnalysisTime)&&
  Objects.equals(this.endAnalysisTime, objFalsePositiveResultHeader.endAnalysisTime);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FalsePositiveResultHeader {\n");
                  sb.append("    endAnalysisTime: ").append(toIndentedString(endAnalysisTime)).append("\n");
                        sb.append("    firstDataReceivedTime: ").append(toIndentedString(firstDataReceivedTime)).append("\n");
                        sb.append("    lastDataReceivedTime: ").append(toIndentedString(lastDataReceivedTime)).append("\n");
                        sb.append("    startAnalysisTime: ").append(toIndentedString(startAnalysisTime)).append("\n");
                        sb.append("    transactionsCount: ").append(toIndentedString(transactionsCount)).append("\n");
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

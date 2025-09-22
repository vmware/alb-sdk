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
 * The ReportDuration is a POJO class extends AviRestResource that used for creating
 * ReportDuration.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportDuration  {
    @JsonProperty("end_time")
    private TimeStamp endTime;

    @JsonProperty("period")
    private String period;

    @JsonProperty("start_time")
    private TimeStamp startTime;



    /**
     * This is the getter method this will return the attribute value.
     * The end timestamp of the report when period is custom.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return endTime
     */
    public TimeStamp getEndTime() {
        return endTime;
    }

    /**
     * This is the setter method to the attribute.
     * The end timestamp of the report when period is custom.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param endTime set the endTime.
     */
    public void setEndTime(TimeStamp endTime) {
        this.endTime = endTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The period for report generation.
     * Enum options - REPORT_PERIOD_LAST_24_HOURS, REPORT_PERIOD_LAST_7_DAYS, REPORT_PERIOD_LAST_30_DAYS.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    /**
     * This is the setter method to the attribute.
     * The period for report generation.
     * Enum options - REPORT_PERIOD_LAST_24_HOURS, REPORT_PERIOD_LAST_7_DAYS, REPORT_PERIOD_LAST_30_DAYS.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param period set the period.
     */
    public void setPeriod(String  period) {
        this.period = period;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The start timestamp of the report when period is custom.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return startTime
     */
    public TimeStamp getStartTime() {
        return startTime;
    }

    /**
     * This is the setter method to the attribute.
     * The start timestamp of the report when period is custom.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param startTime set the startTime.
     */
    public void setStartTime(TimeStamp startTime) {
        this.startTime = startTime;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ReportDuration objReportDuration = (ReportDuration) o;
      return   Objects.equals(this.period, objReportDuration.period)&&
  Objects.equals(this.startTime, objReportDuration.startTime)&&
  Objects.equals(this.endTime, objReportDuration.endTime);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReportDuration {\n");
                  sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
                        sb.append("    period: ").append(toIndentedString(period)).append("\n");
                        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

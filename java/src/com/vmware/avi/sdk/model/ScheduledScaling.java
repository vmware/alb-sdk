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
 * The ScheduledScaling is a POJO class extends AviRestResource that used for creating
 * ScheduledScaling.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScheduledScaling  {
    @JsonProperty("autoscaling_duration")
    private Integer autoscalingDuration = 1;

    @JsonProperty("cron_expression")
    private String cronExpression;

    @JsonProperty("desired_capacity")
    private Integer desiredCapacity;

    @JsonProperty("enable")
    private Boolean enable = true;

    @JsonProperty("end_date")
    private String endDate;

    @JsonProperty("schedule_max_step")
    private Integer scheduleMaxStep = 1;

    @JsonProperty("start_date")
    private String startDate;



    /**
     * This is the getter method this will return the attribute value.
     * Scheduled autoscale duration (in hours).
     * Allowed values are 1-24.
     * Field introduced in 21.1.1.
     * Unit is hours.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return autoscalingDuration
     */
    public Integer getAutoscalingDuration() {
        return autoscalingDuration;
    }

    /**
     * This is the setter method to the attribute.
     * Scheduled autoscale duration (in hours).
     * Allowed values are 1-24.
     * Field introduced in 21.1.1.
     * Unit is hours.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param autoscalingDuration set the autoscalingDuration.
     */
    public void setAutoscalingDuration(Integer  autoscalingDuration) {
        this.autoscalingDuration = autoscalingDuration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The cron expression describing desired time for the scheduled autoscale.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cronExpression
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * This is the setter method to the attribute.
     * The cron expression describing desired time for the scheduled autoscale.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cronExpression set the cronExpression.
     */
    public void setCronExpression(String  cronExpression) {
        this.cronExpression = cronExpression;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Desired number of servers during scheduled intervals, it may cause scale-in or scale-out based on the value.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return desiredCapacity
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }

    /**
     * This is the setter method to the attribute.
     * Desired number of servers during scheduled intervals, it may cause scale-in or scale-out based on the value.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param desiredCapacity set the desiredCapacity.
     */
    public void setDesiredCapacity(Integer  desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enables the scheduled autoscale.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * This is the setter method to the attribute.
     * Enables the scheduled autoscale.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param enable set the enable.
     */
    public void setEnable(Boolean  enable) {
        this.enable = enable;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Scheduled autoscale end date in iso8601 format, said day will be included in scheduled and have to be in future and greater than start date.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * This is the setter method to the attribute.
     * Scheduled autoscale end date in iso8601 format, said day will be included in scheduled and have to be in future and greater than start date.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param endDate set the endDate.
     */
    public void setEndDate(String  endDate) {
        this.endDate = endDate;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of simultaneous scale-in/out servers for scheduled autoscale.
     * If this value is 0, regular autoscale policy dictates this.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return scheduleMaxStep
     */
    public Integer getScheduleMaxStep() {
        return scheduleMaxStep;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of simultaneous scale-in/out servers for scheduled autoscale.
     * If this value is 0, regular autoscale policy dictates this.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param scheduleMaxStep set the scheduleMaxStep.
     */
    public void setScheduleMaxStep(Integer  scheduleMaxStep) {
        this.scheduleMaxStep = scheduleMaxStep;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Scheduled autoscale start date in iso8601 format, said day will be included in scheduled and have to be in future.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * This is the setter method to the attribute.
     * Scheduled autoscale start date in iso8601 format, said day will be included in scheduled and have to be in future.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param startDate set the startDate.
     */
    public void setStartDate(String  startDate) {
        this.startDate = startDate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ScheduledScaling objScheduledScaling = (ScheduledScaling) o;
      return   Objects.equals(this.enable, objScheduledScaling.enable)&&
  Objects.equals(this.desiredCapacity, objScheduledScaling.desiredCapacity)&&
  Objects.equals(this.cronExpression, objScheduledScaling.cronExpression)&&
  Objects.equals(this.startDate, objScheduledScaling.startDate)&&
  Objects.equals(this.endDate, objScheduledScaling.endDate)&&
  Objects.equals(this.autoscalingDuration, objScheduledScaling.autoscalingDuration)&&
  Objects.equals(this.scheduleMaxStep, objScheduledScaling.scheduleMaxStep);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ScheduledScaling {\n");
                  sb.append("    autoscalingDuration: ").append(toIndentedString(autoscalingDuration)).append("\n");
                        sb.append("    cronExpression: ").append(toIndentedString(cronExpression)).append("\n");
                        sb.append("    desiredCapacity: ").append(toIndentedString(desiredCapacity)).append("\n");
                        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
                        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
                        sb.append("    scheduleMaxStep: ").append(toIndentedString(scheduleMaxStep)).append("\n");
                        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

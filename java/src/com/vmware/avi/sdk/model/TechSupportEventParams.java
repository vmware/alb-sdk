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
 * The TechSupportEventParams is a POJO class extends AviRestResource that used for creating
 * TechSupportEventParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TechSupportEventParams  {
    @JsonProperty("collect_all_events")
    private Boolean collectAllEvents = false;

    @JsonProperty("days")
    private Integer days = 2;

    @JsonProperty("files")
    private Integer files = 8;



    /**
     * This is the getter method this will return the attribute value.
     * Collect all events agnostic of duration, days and files.this flag will have higher precedence over duration, files and daysif flag is false then
     * precedence given to duration passed while invocation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return collectAllEvents
     */
    public Boolean getCollectAllEvents() {
        return collectAllEvents;
    }

    /**
     * This is the setter method to the attribute.
     * Collect all events agnostic of duration, days and files.this flag will have higher precedence over duration, files and daysif flag is false then
     * precedence given to duration passed while invocation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param collectAllEvents set the collectAllEvents.
     */
    public void setCollectAllEvents(Boolean  collectAllEvents) {
        this.collectAllEvents = collectAllEvents;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Collect events for the specified number of past days.e.g.
     * User specified 3, collect events for past 3 days.if have 20 files with 3 days old then collect on basis of specified number of files.
     * Allowed values are 1-5.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2.
     * @return days
     */
    public Integer getDays() {
        return days;
    }

    /**
     * This is the setter method to the attribute.
     * Collect events for the specified number of past days.e.g.
     * User specified 3, collect events for past 3 days.if have 20 files with 3 days old then collect on basis of specified number of files.
     * Allowed values are 1-5.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2.
     * @param days set the days.
     */
    public void setDays(Integer  days) {
        this.days = days;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Collect events for the specified number of files.e.g.
     * User specified 5, collect atmost 5 events files.if have 10 files with 2 days old then collect only specified number of files.
     * Allowed values are 1-10.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @return files
     */
    public Integer getFiles() {
        return files;
    }

    /**
     * This is the setter method to the attribute.
     * Collect events for the specified number of files.e.g.
     * User specified 5, collect atmost 5 events files.if have 10 files with 2 days old then collect only specified number of files.
     * Allowed values are 1-10.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @param files set the files.
     */
    public void setFiles(Integer  files) {
        this.files = files;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      TechSupportEventParams objTechSupportEventParams = (TechSupportEventParams) o;
      return   Objects.equals(this.days, objTechSupportEventParams.days)&&
  Objects.equals(this.files, objTechSupportEventParams.files)&&
  Objects.equals(this.collectAllEvents, objTechSupportEventParams.collectAllEvents);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class TechSupportEventParams {\n");
                  sb.append("    collectAllEvents: ").append(toIndentedString(collectAllEvents)).append("\n");
                        sb.append("    days: ").append(toIndentedString(days)).append("\n");
                        sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

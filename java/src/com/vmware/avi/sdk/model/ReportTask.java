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
 * The ReportTask is a POJO class extends AviRestResource that used for creating
 * ReportTask.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportTask  {
    @JsonProperty("name")
    private String name;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("summary")
    private JournalSummary summary;

    @JsonProperty("task_journal_ref")
    private String taskJournalRef;



    /**
     * This is the getter method this will return the attribute value.
     * Name for the task journal.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name for the task journal.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reason in case of failure.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * This is the setter method to the attribute.
     * Reason in case of failure.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reason set the reason.
     */
    public void setReason(String  reason) {
        this.reason = reason;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Copy of journal summary for immediate visibility.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return summary
     */
    public JournalSummary getSummary() {
        return summary;
    }

    /**
     * This is the setter method to the attribute.
     * Copy of journal summary for immediate visibility.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param summary set the summary.
     */
    public void setSummary(JournalSummary summary) {
        this.summary = summary;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Journal reference for the task.
     * It is a reference to an object of type taskjournal.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return taskJournalRef
     */
    public String getTaskJournalRef() {
        return taskJournalRef;
    }

    /**
     * This is the setter method to the attribute.
     * Journal reference for the task.
     * It is a reference to an object of type taskjournal.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param taskJournalRef set the taskJournalRef.
     */
    public void setTaskJournalRef(String  taskJournalRef) {
        this.taskJournalRef = taskJournalRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ReportTask objReportTask = (ReportTask) o;
      return   Objects.equals(this.name, objReportTask.name)&&
  Objects.equals(this.reason, objReportTask.reason)&&
  Objects.equals(this.summary, objReportTask.summary)&&
  Objects.equals(this.taskJournalRef, objReportTask.taskJournalRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReportTask {\n");
                  sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
                        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
                        sb.append("    taskJournalRef: ").append(toIndentedString(taskJournalRef)).append("\n");
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

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
 * The JournalTask is a POJO class extends AviRestResource that used for creating
 * JournalTask.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JournalTask  {
    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("end_time")
    private String endTime;

    @JsonProperty("messages")
    private List<String> messages;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("task_description")
    private String taskDescription;

    @JsonProperty("task_name")
    private String taskName;



    /**
     * This is the getter method this will return the attribute value.
     * Time taken to complete task in seconds.
     * Field introduced in 31.1.1.
     * Unit is sec.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * This is the setter method to the attribute.
     * Time taken to complete task in seconds.
     * Field introduced in 31.1.1.
     * Unit is sec.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param duration set the duration.
     */
    public void setDuration(Integer  duration) {
        this.duration = duration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time at which execution of task was completed.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * This is the setter method to the attribute.
     * Time at which execution of task was completed.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param endTime set the endTime.
     */
    public void setEndTime(String  endTime) {
        this.endTime = endTime;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Details of executed task.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return messages
     */
    public List<String> getMessages() {
        return messages;
    }

    /**
     * This is the setter method. this will set the messages
     * Details of executed task.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return messages
     */
    public void setMessages(List<String>  messages) {
        this.messages = messages;
    }

    /**
     * This is the setter method this will set the messages
     * Details of executed task.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return messages
     */
    public JournalTask addMessagesItem(String messagesItem) {
      if (this.messages == null) {
        this.messages = new ArrayList<String>();
      }
      this.messages.add(messagesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reason for the status of the executed task.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * This is the setter method to the attribute.
     * Reason for the status of the executed task.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reason set the reason.
     */
    public void setReason(String  reason) {
        this.reason = reason;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time at which execution of task was started.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * This is the setter method to the attribute.
     * Time at which execution of task was started.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param startTime set the startTime.
     */
    public void setStartTime(String  startTime) {
        this.startTime = startTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Status of the executed task.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This is the setter method to the attribute.
     * Status of the executed task.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param status set the status.
     */
    public void setStatus(Boolean  status) {
        this.status = status;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Description of the executed task.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return taskDescription
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    /**
     * This is the setter method to the attribute.
     * Description of the executed task.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param taskDescription set the taskDescription.
     */
    public void setTaskDescription(String  taskDescription) {
        this.taskDescription = taskDescription;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the executed task.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the executed task.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param taskName set the taskName.
     */
    public void setTaskName(String  taskName) {
        this.taskName = taskName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      JournalTask objJournalTask = (JournalTask) o;
      return   Objects.equals(this.taskName, objJournalTask.taskName)&&
  Objects.equals(this.taskDescription, objJournalTask.taskDescription)&&
  Objects.equals(this.status, objJournalTask.status)&&
  Objects.equals(this.reason, objJournalTask.reason)&&
  Objects.equals(this.startTime, objJournalTask.startTime)&&
  Objects.equals(this.endTime, objJournalTask.endTime)&&
  Objects.equals(this.duration, objJournalTask.duration)&&
  Objects.equals(this.messages, objJournalTask.messages);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class JournalTask {\n");
                  sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
                        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
                        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
                        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
                        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
                        sb.append("    status: ").append(toIndentedString(status)).append("\n");
                        sb.append("    taskDescription: ").append(toIndentedString(taskDescription)).append("\n");
                        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
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

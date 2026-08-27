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
 * The TaskEventHistory is a POJO class extends AviRestResource that used for creating
 * TaskEventHistory.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskEventHistory  {
    @JsonProperty("spec_info")
    private String specInfo;

    @JsonProperty("state")
    private FileObjectState state;

    @JsonProperty("task_events")
    private List<TaskEventMap> taskEvents;

    @JsonProperty("version")
    private String version;



    /**
     * This is the getter method this will return the attribute value.
     * Api specification information captured at the time of processing.
     * Populated for open api specification file objects only.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return specInfo
     */
    public String getSpecInfo() {
        return specInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Api specification information captured at the time of processing.
     * Populated for open api specification file objects only.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param specInfo set the specInfo.
     */
    public void setSpecInfo(String  specInfo) {
        this.specInfo = specInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * State of the file object for the version specified.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return state
     */
    public FileObjectState getState() {
        return state;
    }

    /**
     * This is the setter method to the attribute.
     * State of the file object for the version specified.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param state set the state.
     */
    public void setState(FileObjectState state) {
        this.state = state;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Processing events for this version.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return taskEvents
     */
    public List<TaskEventMap> getTaskEvents() {
        return taskEvents;
    }

    /**
     * This is the setter method. this will set the taskEvents
     * Processing events for this version.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return taskEvents
     */
    public void setTaskEvents(List<TaskEventMap>  taskEvents) {
        this.taskEvents = taskEvents;
    }

    /**
     * This is the setter method this will set the taskEvents
     * Processing events for this version.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return taskEvents
     */
    public TaskEventHistory addTaskEventsItem(TaskEventMap taskEventsItem) {
      if (this.taskEvents == null) {
        this.taskEvents = new ArrayList<TaskEventMap>();
      }
      this.taskEvents.add(taskEventsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Version of the file object.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * This is the setter method to the attribute.
     * Version of the file object.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param version set the version.
     */
    public void setVersion(String  version) {
        this.version = version;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      TaskEventHistory objTaskEventHistory = (TaskEventHistory) o;
      return   Objects.equals(this.version, objTaskEventHistory.version)&&
  Objects.equals(this.state, objTaskEventHistory.state)&&
  Objects.equals(this.taskEvents, objTaskEventHistory.taskEvents)&&
  Objects.equals(this.specInfo, objTaskEventHistory.specInfo);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class TaskEventHistory {\n");
                  sb.append("    specInfo: ").append(toIndentedString(specInfo)).append("\n");
                        sb.append("    state: ").append(toIndentedString(state)).append("\n");
                        sb.append("    taskEvents: ").append(toIndentedString(taskEvents)).append("\n");
                        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

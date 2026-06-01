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
 * The ApiSpecGenerate is a POJO class extends AviRestResource that used for creating
 * ApiSpecGenerate.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiSpecGenerate extends AviRestResource  {
    @JsonProperty("completed_events")
    private Integer completedEvents;

    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("end_time")
    private String endTime;

    @JsonProperty("name")
    private String name;

    @JsonProperty("params")
    private ApiSpecGenerateParams params;

    @JsonProperty("path")
    private String path;

    @JsonProperty("progress")
    private Integer progress;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("state")
    private ApiSpecGenerateState state;

    @JsonProperty("task_events")
    private List<TaskEventMap> taskEvents;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("total_events")
    private Integer totalEvents;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Number of tasks completed.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return completedEvents
     */
    public Integer getCompletedEvents() {
        return completedEvents;
    }

    /**
     * This is the setter method to the attribute.
     * Number of tasks completed.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param completedEvents set the completedEvents.
     */
    public void setCompletedEvents(Integer  completedEvents) {
        this.completedEvents = completedEvents;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Spec generation duration in seconds.
     * Field introduced in 32.2.1.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * This is the setter method to the attribute.
     * Spec generation duration in seconds.
     * Field introduced in 32.2.1.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param duration set the duration.
     */
    public void setDuration(Integer  duration) {
        this.duration = duration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time the spec generation completed or failed.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * This is the setter method to the attribute.
     * Time the spec generation completed or failed.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param endTime set the endTime.
     */
    public void setEndTime(String  endTime) {
        this.endTime = endTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the spec generation object.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the spec generation object.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Parameters for the spec generation.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return params
     */
    public ApiSpecGenerateParams getParams() {
        return params;
    }

    /**
     * This is the setter method to the attribute.
     * Parameters for the spec generation.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param params set the params.
     */
    public void setParams(ApiSpecGenerateParams params) {
        this.params = params;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Path to the generated spec file.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * This is the setter method to the attribute.
     * Path to the generated spec file.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param path set the path.
     */
    public void setPath(String  path) {
        this.path = path;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Overall spec generation progress percentage.
     * Allowed values are 0-100.
     * Field introduced in 32.2.1.
     * Unit is percent.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    /**
     * This is the setter method to the attribute.
     * Overall spec generation progress percentage.
     * Allowed values are 0-100.
     * Field introduced in 32.2.1.
     * Unit is percent.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param progress set the progress.
     */
    public void setProgress(Integer  progress) {
        this.progress = progress;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time the spec generation started.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * This is the setter method to the attribute.
     * Time the spec generation started.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param startTime set the startTime.
     */
    public void setStartTime(String  startTime) {
        this.startTime = startTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Current lifecycle state of the spec generation.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return state
     */
    public ApiSpecGenerateState getState() {
        return state;
    }

    /**
     * This is the setter method to the attribute.
     * Current lifecycle state of the spec generation.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param state set the state.
     */
    public void setState(ApiSpecGenerateState state) {
        this.state = state;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Per-task status and event details.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return taskEvents
     */
    public List<TaskEventMap> getTaskEvents() {
        return taskEvents;
    }

    /**
     * This is the setter method. this will set the taskEvents
     * Per-task status and event details.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return taskEvents
     */
    public void setTaskEvents(List<TaskEventMap>  taskEvents) {
        this.taskEvents = taskEvents;
    }

    /**
     * This is the setter method this will set the taskEvents
     * Per-task status and event details.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return taskEvents
     */
    public ApiSpecGenerate addTaskEventsItem(TaskEventMap taskEventsItem) {
      if (this.taskEvents == null) {
        this.taskEvents = new ArrayList<TaskEventMap>();
      }
      this.taskEvents.add(taskEventsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type tenant.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type tenant.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantRef set the tenantRef.
     */
    public void setTenantRef(String  tenantRef) {
        this.tenantRef = tenantRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Total number of tasks.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return totalEvents
     */
    public Integer getTotalEvents() {
        return totalEvents;
    }

    /**
     * This is the setter method to the attribute.
     * Total number of tasks.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param totalEvents set the totalEvents.
     */
    public void setTotalEvents(Integer  totalEvents) {
        this.totalEvents = totalEvents;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Avi controller URL of the object.
     * @return url
     */
    public String getUrl() {
        return url;
    }

   /**
    * This is the setter method. this will set the url
    * Avi controller URL of the object.
    * @return url
    */
   public void setUrl(String  url) {
     this.url = url;
   }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the spec generation object.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the spec generation object.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApiSpecGenerate objApiSpecGenerate = (ApiSpecGenerate) o;
      return   Objects.equals(this.uuid, objApiSpecGenerate.uuid)&&
  Objects.equals(this.name, objApiSpecGenerate.name)&&
  Objects.equals(this.state, objApiSpecGenerate.state)&&
  Objects.equals(this.params, objApiSpecGenerate.params)&&
  Objects.equals(this.path, objApiSpecGenerate.path)&&
  Objects.equals(this.taskEvents, objApiSpecGenerate.taskEvents)&&
  Objects.equals(this.totalEvents, objApiSpecGenerate.totalEvents)&&
  Objects.equals(this.completedEvents, objApiSpecGenerate.completedEvents)&&
  Objects.equals(this.progress, objApiSpecGenerate.progress)&&
  Objects.equals(this.startTime, objApiSpecGenerate.startTime)&&
  Objects.equals(this.endTime, objApiSpecGenerate.endTime)&&
  Objects.equals(this.duration, objApiSpecGenerate.duration)&&
  Objects.equals(this.tenantRef, objApiSpecGenerate.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApiSpecGenerate {\n");
                  sb.append("    completedEvents: ").append(toIndentedString(completedEvents)).append("\n");
                        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
                        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    params: ").append(toIndentedString(params)).append("\n");
                        sb.append("    path: ").append(toIndentedString(path)).append("\n");
                        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
                        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
                        sb.append("    state: ").append(toIndentedString(state)).append("\n");
                        sb.append("    taskEvents: ").append(toIndentedString(taskEvents)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                        sb.append("    totalEvents: ").append(toIndentedString(totalEvents)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

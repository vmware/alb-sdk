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
 * The Report is a POJO class extends AviRestResource that used for creating
 * Report.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Report extends AviRestResource  {
    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("end_time")
    private String endTime;

    @JsonProperty("filename")
    private String filename;

    @JsonProperty("name")
    private String name;

    @JsonProperty("node")
    private String node;

    @JsonProperty("pre_check")
    private ReadinessCheckObj preCheck;

    @JsonProperty("progress")
    private Integer progress = 0;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("state")
    private ReportGenState state;

    @JsonProperty("tasks")
    private List<TaskEventMap> tasks;

    @JsonProperty("tasks_completed")
    private Integer tasksCompleted;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("total_tasks")
    private Integer totalTasks;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Time taken to complete report generation in seconds.
     * Field introduced in 31.2.1.
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
     * Time taken to complete report generation in seconds.
     * Field introduced in 31.2.1.
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
     * End time of the report generation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * This is the setter method to the attribute.
     * End time of the report generation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param endTime set the endTime.
     */
    public void setEndTime(String  endTime) {
        this.endTime = endTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the report artifact on reports repository.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the report artifact on reports repository.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param filename set the filename.
     */
    public void setFilename(String  filename) {
        this.filename = filename;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the report.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the report.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Cluster member node on which the report is processed.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return node
     */
    public String getNode() {
        return node;
    }

    /**
     * This is the setter method to the attribute.
     * Cluster member node on which the report is processed.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param node set the node.
     */
    public void setNode(String  node) {
        this.node = node;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Pre-check details for the report generation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return preCheck
     */
    public ReadinessCheckObj getPreCheck() {
        return preCheck;
    }

    /**
     * This is the setter method to the attribute.
     * Pre-check details for the report generation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param preCheck set the preCheck.
     */
    public void setPreCheck(ReadinessCheckObj preCheck) {
        this.preCheck = preCheck;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Percentage of tasks completed.
     * Allowed values are 0-100.
     * Field introduced in 31.2.1.
     * Unit is percent.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    /**
     * This is the setter method to the attribute.
     * Percentage of tasks completed.
     * Allowed values are 0-100.
     * Field introduced in 31.2.1.
     * Unit is percent.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param progress set the progress.
     */
    public void setProgress(Integer  progress) {
        this.progress = progress;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Start time of the report generation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * This is the setter method to the attribute.
     * Start time of the report generation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param startTime set the startTime.
     */
    public void setStartTime(String  startTime) {
        this.startTime = startTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * State of the report generation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return state
     */
    public ReportGenState getState() {
        return state;
    }

    /**
     * This is the setter method to the attribute.
     * State of the report generation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param state set the state.
     */
    public void setState(ReportGenState state) {
        this.state = state;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of tasks associated with the report generation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tasks
     */
    public List<TaskEventMap> getTasks() {
        return tasks;
    }

    /**
     * This is the setter method. this will set the tasks
     * List of tasks associated with the report generation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tasks
     */
    public void setTasks(List<TaskEventMap>  tasks) {
        this.tasks = tasks;
    }

    /**
     * This is the setter method this will set the tasks
     * List of tasks associated with the report generation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tasks
     */
    public Report addTasksItem(TaskEventMap tasksItem) {
      if (this.tasks == null) {
        this.tasks = new ArrayList<TaskEventMap>();
      }
      this.tasks.add(tasksItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * No.
     * Of tasks completed.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tasksCompleted
     */
    public Integer getTasksCompleted() {
        return tasksCompleted;
    }

    /**
     * This is the setter method to the attribute.
     * No.
     * Of tasks completed.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tasksCompleted set the tasksCompleted.
     */
    public void setTasksCompleted(Integer  tasksCompleted) {
        this.tasksCompleted = tasksCompleted;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenant uuid of the report generation.
     * It is a reference to an object of type tenant.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * Tenant uuid of the report generation.
     * It is a reference to an object of type tenant.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantRef set the tenantRef.
     */
    public void setTenantRef(String  tenantRef) {
        this.tenantRef = tenantRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Total no.
     * Of tasks.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return totalTasks
     */
    public Integer getTotalTasks() {
        return totalTasks;
    }

    /**
     * This is the setter method to the attribute.
     * Total no.
     * Of tasks.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param totalTasks set the totalTasks.
     */
    public void setTotalTasks(Integer  totalTasks) {
        this.totalTasks = totalTasks;
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
     * Uuid identifier for the report generation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid identifier for the report generation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
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
      Report objReport = (Report) o;
      return   Objects.equals(this.uuid, objReport.uuid)&&
  Objects.equals(this.name, objReport.name)&&
  Objects.equals(this.state, objReport.state)&&
  Objects.equals(this.node, objReport.node)&&
  Objects.equals(this.filename, objReport.filename)&&
  Objects.equals(this.startTime, objReport.startTime)&&
  Objects.equals(this.endTime, objReport.endTime)&&
  Objects.equals(this.duration, objReport.duration)&&
  Objects.equals(this.preCheck, objReport.preCheck)&&
  Objects.equals(this.tasks, objReport.tasks)&&
  Objects.equals(this.totalTasks, objReport.totalTasks)&&
  Objects.equals(this.tasksCompleted, objReport.tasksCompleted)&&
  Objects.equals(this.progress, objReport.progress)&&
  Objects.equals(this.tenantRef, objReport.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class Report {\n");
                  sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
                        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
                        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    node: ").append(toIndentedString(node)).append("\n");
                        sb.append("    preCheck: ").append(toIndentedString(preCheck)).append("\n");
                        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
                        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
                        sb.append("    state: ").append(toIndentedString(state)).append("\n");
                        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
                        sb.append("    tasksCompleted: ").append(toIndentedString(tasksCompleted)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                        sb.append("    totalTasks: ").append(toIndentedString(totalTasks)).append("\n");
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

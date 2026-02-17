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
 * The DryrunInfo is a POJO class extends AviRestResource that used for creating
 * DryrunInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DryrunInfo  {
    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("end_time")
    private String endTime;

    @JsonProperty("operation")
    private String operation;

    @JsonProperty("params")
    private UpgradeParams params;

    @JsonProperty("progress")
    private Integer progress = 0;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("state")
    private UpgradeOpsState state;

    @JsonProperty("tasks_completed")
    private Integer tasksCompleted;

    @JsonProperty("total_tasks")
    private Integer totalTasks;

    @JsonProperty("upgrade_events")
    private List<EventMap> upgradeEvents;

    @JsonProperty("worker")
    private String worker;



    /**
     * This is the getter method this will return the attribute value.
     * Duration of dry-run operation in seconds.
     * Field introduced in 31.1.1.
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
     * Duration of dry-run operation in seconds.
     * Field introduced in 31.1.1.
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
     * End time of dry-run operation.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * This is the setter method to the attribute.
     * End time of dry-run operation.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param endTime set the endTime.
     */
    public void setEndTime(String  endTime) {
        this.endTime = endTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Dryrun operations requested.
     * Enum options - UPGRADE, PATCH, ROLLBACK, ROLLBACKPATCH, SEGROUP_RESUME, EVAL_UPGRADE, EVAL_PATCH, EVAL_ROLLBACK, EVAL_ROLLBACKPATCH,
     * EVAL_SEGROUP_RESUME, EVAL_RESTORE, RESTORE, UPGRADE_DRYRUN.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * This is the setter method to the attribute.
     * Dryrun operations requested.
     * Enum options - UPGRADE, PATCH, ROLLBACK, ROLLBACKPATCH, SEGROUP_RESUME, EVAL_UPGRADE, EVAL_PATCH, EVAL_ROLLBACK, EVAL_ROLLBACKPATCH,
     * EVAL_SEGROUP_RESUME, EVAL_RESTORE, RESTORE, UPGRADE_DRYRUN.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param operation set the operation.
     */
    public void setOperation(String  operation) {
        this.operation = operation;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Parameters for performing the dry-run operation.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return params
     */
    public UpgradeParams getParams() {
        return params;
    }

    /**
     * This is the setter method to the attribute.
     * Parameters for performing the dry-run operation.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param params set the params.
     */
    public void setParams(UpgradeParams params) {
        this.params = params;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Dry-run operations progress which holds value between 0-100.
     * Allowed values are 0-100.
     * Field introduced in 31.1.1.
     * Unit is percent.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    /**
     * This is the setter method to the attribute.
     * Dry-run operations progress which holds value between 0-100.
     * Allowed values are 0-100.
     * Field introduced in 31.1.1.
     * Unit is percent.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param progress set the progress.
     */
    public void setProgress(Integer  progress) {
        this.progress = progress;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Start time of dry-run operation.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * This is the setter method to the attribute.
     * Start time of dry-run operation.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param startTime set the startTime.
     */
    public void setStartTime(String  startTime) {
        this.startTime = startTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Current status of the dry-run operation.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return state
     */
    public UpgradeOpsState getState() {
        return state;
    }

    /**
     * This is the setter method to the attribute.
     * Current status of the dry-run operation.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param state set the state.
     */
    public void setState(UpgradeOpsState state) {
        this.state = state;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Completed set of tasks in the upgrade operation.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tasksCompleted
     */
    public Integer getTasksCompleted() {
        return tasksCompleted;
    }

    /**
     * This is the setter method to the attribute.
     * Completed set of tasks in the upgrade operation.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tasksCompleted set the tasksCompleted.
     */
    public void setTasksCompleted(Integer  tasksCompleted) {
        this.tasksCompleted = tasksCompleted;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Total number of tasks in the upgrade operation.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return totalTasks
     */
    public Integer getTotalTasks() {
        return totalTasks;
    }

    /**
     * This is the setter method to the attribute.
     * Total number of tasks in the upgrade operation.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param totalTasks set the totalTasks.
     */
    public void setTotalTasks(Integer  totalTasks) {
        this.totalTasks = totalTasks;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Controller events for dry-run operation.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return upgradeEvents
     */
    public List<EventMap> getUpgradeEvents() {
        return upgradeEvents;
    }

    /**
     * This is the setter method. this will set the upgradeEvents
     * Controller events for dry-run operation.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return upgradeEvents
     */
    public void setUpgradeEvents(List<EventMap>  upgradeEvents) {
        this.upgradeEvents = upgradeEvents;
    }

    /**
     * This is the setter method this will set the upgradeEvents
     * Controller events for dry-run operation.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return upgradeEvents
     */
    public DryrunInfo addUpgradeEventsItem(EventMap upgradeEventsItem) {
      if (this.upgradeEvents == null) {
        this.upgradeEvents = new ArrayList<EventMap>();
      }
      this.upgradeEvents.add(upgradeEventsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Node on which the dry-run is performed.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return worker
     */
    public String getWorker() {
        return worker;
    }

    /**
     * This is the setter method to the attribute.
     * Node on which the dry-run is performed.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param worker set the worker.
     */
    public void setWorker(String  worker) {
        this.worker = worker;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DryrunInfo objDryrunInfo = (DryrunInfo) o;
      return   Objects.equals(this.state, objDryrunInfo.state)&&
  Objects.equals(this.operation, objDryrunInfo.operation)&&
  Objects.equals(this.params, objDryrunInfo.params)&&
  Objects.equals(this.worker, objDryrunInfo.worker)&&
  Objects.equals(this.startTime, objDryrunInfo.startTime)&&
  Objects.equals(this.endTime, objDryrunInfo.endTime)&&
  Objects.equals(this.duration, objDryrunInfo.duration)&&
  Objects.equals(this.totalTasks, objDryrunInfo.totalTasks)&&
  Objects.equals(this.tasksCompleted, objDryrunInfo.tasksCompleted)&&
  Objects.equals(this.progress, objDryrunInfo.progress)&&
  Objects.equals(this.upgradeEvents, objDryrunInfo.upgradeEvents);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DryrunInfo {\n");
                  sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
                        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
                        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
                        sb.append("    params: ").append(toIndentedString(params)).append("\n");
                        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
                        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
                        sb.append("    state: ").append(toIndentedString(state)).append("\n");
                        sb.append("    tasksCompleted: ").append(toIndentedString(tasksCompleted)).append("\n");
                        sb.append("    totalTasks: ").append(toIndentedString(totalTasks)).append("\n");
                        sb.append("    upgradeEvents: ").append(toIndentedString(upgradeEvents)).append("\n");
                        sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
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

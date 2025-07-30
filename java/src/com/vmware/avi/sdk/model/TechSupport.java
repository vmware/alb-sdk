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
 * The TechSupport is a POJO class extends AviRestResource that used for creating
 * TechSupport.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TechSupport extends AviRestResource  {
    @JsonProperty("case_number")
    private String caseNumber;

    @JsonProperty("description")
    private String description;

    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("end_time")
    private String endTime;

    @JsonProperty("errors")
    private List<String> errors;

    @JsonProperty("level")
    private String level;

    @JsonProperty("name")
    private String name;

    @JsonProperty("node")
    private String node;

    @JsonProperty("obj_name")
    private String objName;

    @JsonProperty("obj_uuid")
    private String objUuid;

    @JsonProperty("output")
    private String output;

    @JsonProperty("params")
    private TechSupportParams params;

    @JsonProperty("progress")
    private Integer progress = 0;

    @JsonProperty("size")
    private Float size;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("state")
    private TechSupportState state;

    @JsonProperty("tasks")
    private List<TechSupportEventMap> tasks;

    @JsonProperty("tasks_completed")
    private Integer tasksCompleted;

    @JsonProperty("techsupport_readiness")
    private ReadinessCheckObj techsupportReadiness;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("total_tasks")
    private Integer totalTasks;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("warnings")
    private List<String> warnings;



    /**
     * This is the getter method this will return the attribute value.
     * 'customer case number for which this techsupport is generated.
     * ''useful for connected portal and other use-cases.'.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return caseNumber
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * This is the setter method to the attribute.
     * 'customer case number for which this techsupport is generated.
     * ''useful for connected portal and other use-cases.'.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param caseNumber set the caseNumber.
     */
    public void setCaseNumber(String  caseNumber) {
        this.caseNumber = caseNumber;
    }

    /**
     * This is the getter method this will return the attribute value.
     * User provided description to capture additional details and context regarding the techsupport invocation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * User provided description to capture additional details and context regarding the techsupport invocation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Total time taken for techsupport collection.
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
     * Total time taken for techsupport collection.
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
     * End timestamp of techsupport collection.
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
     * End timestamp of techsupport collection.
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
     * Error logged during techsupport collection.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errors
     */
    public List<String> getErrors() {
        return errors;
    }

    /**
     * This is the setter method. this will set the errors
     * Error logged during techsupport collection.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errors
     */
    public void setErrors(List<String>  errors) {
        this.errors = errors;
    }

    /**
     * This is the setter method this will set the errors
     * Error logged during techsupport collection.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errors
     */
    public TechSupport addErrorsItem(String errorsItem) {
      if (this.errors == null) {
        this.errors = new ArrayList<String>();
      }
      this.errors.add(errorsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the techsupport level.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return level
     */
    public String getLevel() {
        return level;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the techsupport level.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param level set the level.
     */
    public void setLevel(String  level) {
        this.level = level;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of techsupport invocation.
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
     * Name of techsupport invocation.
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
     * Cluster member node on which the techsupport tarball bundle is saved.
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
     * Cluster member node on which the techsupport tarball bundle is saved.
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
     * Object name if one exists.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objName
     */
    public String getObjName() {
        return objName;
    }

    /**
     * This is the setter method to the attribute.
     * Object name if one exists.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param objName set the objName.
     */
    public void setObjName(String  objName) {
        this.objName = objName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Techsupport collection object uuid specified for different objects such as se/vs/pool etc.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objUuid
     */
    public String getObjUuid() {
        return objUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Techsupport collection object uuid specified for different objects such as se/vs/pool etc.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param objUuid set the objUuid.
     */
    public void setObjUuid(String  objUuid) {
        this.objUuid = objUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Techsupport collection output file path.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return output
     */
    public String getOutput() {
        return output;
    }

    /**
     * This is the setter method to the attribute.
     * Techsupport collection output file path.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param output set the output.
     */
    public void setOutput(String  output) {
        this.output = output;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Techsupport params associated with latest techsupport collection.
     * User passed params will have more preference.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return params
     */
    public TechSupportParams getParams() {
        return params;
    }

    /**
     * This is the setter method to the attribute.
     * Techsupport params associated with latest techsupport collection.
     * User passed params will have more preference.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param params set the params.
     */
    public void setParams(TechSupportParams params) {
        this.params = params;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Techsupport collection progress which holds value between 0-100.
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
     * Techsupport collection progress which holds value between 0-100.
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
     * Size of collected techsupport tarball.
     * Field introduced in 31.2.1.
     * Unit is mb.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return size
     */
    public Float getSize() {
        return size;
    }

    /**
     * This is the setter method to the attribute.
     * Size of collected techsupport tarball.
     * Field introduced in 31.2.1.
     * Unit is mb.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param size set the size.
     */
    public void setSize(Float  size) {
        this.size = size;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Start timestamp of techsupport collection.
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
     * Start timestamp of techsupport collection.
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
     * State of current/last techsupport invocation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return state
     */
    public TechSupportState getState() {
        return state;
    }

    /**
     * This is the setter method to the attribute.
     * State of current/last techsupport invocation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param state set the state.
     */
    public void setState(TechSupportState state) {
        this.state = state;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Events performed for techsupport collection.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tasks
     */
    public List<TechSupportEventMap> getTasks() {
        return tasks;
    }

    /**
     * This is the setter method. this will set the tasks
     * Events performed for techsupport collection.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tasks
     */
    public void setTasks(List<TechSupportEventMap>  tasks) {
        this.tasks = tasks;
    }

    /**
     * This is the setter method this will set the tasks
     * Events performed for techsupport collection.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tasks
     */
    public TechSupport addTasksItem(TechSupportEventMap tasksItem) {
      if (this.tasks == null) {
        this.tasks = new ArrayList<TechSupportEventMap>();
      }
      this.tasks.add(tasksItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Completed set of tasks in the techsupport collection.
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
     * Completed set of tasks in the techsupport collection.
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
     * Techsupport readiness checks execution details.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return techsupportReadiness
     */
    public ReadinessCheckObj getTechsupportReadiness() {
        return techsupportReadiness;
    }

    /**
     * This is the setter method to the attribute.
     * Techsupport readiness checks execution details.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param techsupportReadiness set the techsupportReadiness.
     */
    public void setTechsupportReadiness(ReadinessCheckObj techsupportReadiness) {
        this.techsupportReadiness = techsupportReadiness;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenant uuid associated with the techsupport.
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
     * Tenant uuid associated with the techsupport.
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
     * Total number of tasks in the techsupport collection.
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
     * Total number of tasks in the techsupport collection.
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
     * Uuid identifier for the techsupport invocation.
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
     * Uuid identifier for the techsupport invocation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Warning logged during techsupport collection.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return warnings
     */
    public List<String> getWarnings() {
        return warnings;
    }

    /**
     * This is the setter method. this will set the warnings
     * Warning logged during techsupport collection.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return warnings
     */
    public void setWarnings(List<String>  warnings) {
        this.warnings = warnings;
    }

    /**
     * This is the setter method this will set the warnings
     * Warning logged during techsupport collection.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return warnings
     */
    public TechSupport addWarningsItem(String warningsItem) {
      if (this.warnings == null) {
        this.warnings = new ArrayList<String>();
      }
      this.warnings.add(warningsItem);
      return this;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      TechSupport objTechSupport = (TechSupport) o;
      return   Objects.equals(this.uuid, objTechSupport.uuid)&&
  Objects.equals(this.name, objTechSupport.name)&&
  Objects.equals(this.state, objTechSupport.state)&&
  Objects.equals(this.level, objTechSupport.level)&&
  Objects.equals(this.objUuid, objTechSupport.objUuid)&&
  Objects.equals(this.objName, objTechSupport.objName)&&
  Objects.equals(this.tasks, objTechSupport.tasks)&&
  Objects.equals(this.totalTasks, objTechSupport.totalTasks)&&
  Objects.equals(this.tasksCompleted, objTechSupport.tasksCompleted)&&
  Objects.equals(this.progress, objTechSupport.progress)&&
  Objects.equals(this.errors, objTechSupport.errors)&&
  Objects.equals(this.warnings, objTechSupport.warnings)&&
  Objects.equals(this.caseNumber, objTechSupport.caseNumber)&&
  Objects.equals(this.description, objTechSupport.description)&&
  Objects.equals(this.node, objTechSupport.node)&&
  Objects.equals(this.techsupportReadiness, objTechSupport.techsupportReadiness)&&
  Objects.equals(this.startTime, objTechSupport.startTime)&&
  Objects.equals(this.endTime, objTechSupport.endTime)&&
  Objects.equals(this.duration, objTechSupport.duration)&&
  Objects.equals(this.params, objTechSupport.params)&&
  Objects.equals(this.output, objTechSupport.output)&&
  Objects.equals(this.size, objTechSupport.size)&&
  Objects.equals(this.tenantRef, objTechSupport.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class TechSupport {\n");
                  sb.append("    caseNumber: ").append(toIndentedString(caseNumber)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
                        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
                        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
                        sb.append("    level: ").append(toIndentedString(level)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    node: ").append(toIndentedString(node)).append("\n");
                        sb.append("    objName: ").append(toIndentedString(objName)).append("\n");
                        sb.append("    objUuid: ").append(toIndentedString(objUuid)).append("\n");
                        sb.append("    output: ").append(toIndentedString(output)).append("\n");
                        sb.append("    params: ").append(toIndentedString(params)).append("\n");
                        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
                        sb.append("    size: ").append(toIndentedString(size)).append("\n");
                        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
                        sb.append("    state: ").append(toIndentedString(state)).append("\n");
                        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
                        sb.append("    tasksCompleted: ").append(toIndentedString(tasksCompleted)).append("\n");
                        sb.append("    techsupportReadiness: ").append(toIndentedString(techsupportReadiness)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                        sb.append("    totalTasks: ").append(toIndentedString(totalTasks)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

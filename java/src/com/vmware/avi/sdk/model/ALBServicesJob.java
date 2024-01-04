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
 * The ALBServicesJob is a POJO class extends AviRestResource that used for creating
 * ALBServicesJob.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ALBServicesJob extends AviRestResource  {
    @JsonProperty("command")
    private String command = null;

    @JsonProperty("end_time")
    private TimeStamp endTime = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("params")
    private List<ALBServicesJobParam> params = null;

    @JsonProperty("pulse_job_id")
    private String pulseJobId = null;

    @JsonProperty("pulse_sync_status")
    private Boolean pulseSyncStatus = null;

    @JsonProperty("result")
    private String result = null;

    @JsonProperty("start_time")
    private TimeStamp startTime = null;

    @JsonProperty("status")
    private String status = "PENDING";

    @JsonProperty("status_update_time")
    private TimeStamp statusUpdateTime = null;

    @JsonProperty("tenant_ref")
    private String tenantRef = null;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid = null;



    /**
     * This is the getter method this will return the attribute value.
     * The command to be triggered by the albservicesjob.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return command
     */
    public String getCommand() {
        return command;
    }

    /**
     * This is the setter method to the attribute.
     * The command to be triggered by the albservicesjob.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param command set the command.
     */
    public void setCommand(String  command) {
        this.command = command;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The time at which the albservicesjob is ended.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return endTime
     */
    public TimeStamp getEndTime() {
        return endTime;
    }

    /**
     * This is the setter method to the attribute.
     * The time at which the albservicesjob is ended.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param endTime set the endTime.
     */
    public void setEndTime(TimeStamp endTime) {
        this.endTime = endTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The name of the albservicesjob.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * The name of the albservicesjob.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Job params.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return params
     */
    public List<ALBServicesJobParam> getParams() {
        return params;
    }

    /**
     * This is the setter method. this will set the params
     * Job params.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return params
     */
    public void setParams(List<ALBServicesJobParam>  params) {
        this.params = params;
    }

    /**
     * This is the setter method this will set the params
     * Job params.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return params
     */
    public ALBServicesJob addParamsItem(ALBServicesJobParam paramsItem) {
      if (this.params == null) {
        this.params = new ArrayList<ALBServicesJobParam>();
      }
      this.params.add(paramsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * A unique identifier for this job entry on the pulse portal.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pulseJobId
     */
    public String getPulseJobId() {
        return pulseJobId;
    }

    /**
     * This is the setter method to the attribute.
     * A unique identifier for this job entry on the pulse portal.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param pulseJobId set the pulseJobId.
     */
    public void setPulseJobId(String  pulseJobId) {
        this.pulseJobId = pulseJobId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Status of sync to pulse(result uploads/state updates).
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pulseSyncStatus
     */
    public Boolean getPulseSyncStatus() {
        return pulseSyncStatus;
    }

    /**
     * This is the setter method to the attribute.
     * Status of sync to pulse(result uploads/state updates).
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param pulseSyncStatus set the pulseSyncStatus.
     */
    public void setPulseSyncStatus(Boolean  pulseSyncStatus) {
        this.pulseSyncStatus = pulseSyncStatus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Job result.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return result
     */
    public String getResult() {
        return result;
    }

    /**
     * This is the setter method to the attribute.
     * Job result.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param result set the result.
     */
    public void setResult(String  result) {
        this.result = result;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The time at which the albservicesjob is started.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return startTime
     */
    public TimeStamp getStartTime() {
        return startTime;
    }

    /**
     * This is the setter method to the attribute.
     * The time at which the albservicesjob is started.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param startTime set the startTime.
     */
    public void setStartTime(TimeStamp startTime) {
        this.startTime = startTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The status of the albservicesjob.
     * Enum options - UNDETERMINED, PENDING, IN_PROGRESS, COMPLETED, FAILED, NOT_ENABLED.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "PENDING".
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * This is the setter method to the attribute.
     * The status of the albservicesjob.
     * Enum options - UNDETERMINED, PENDING, IN_PROGRESS, COMPLETED, FAILED, NOT_ENABLED.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "PENDING".
     * @param status set the status.
     */
    public void setStatus(String  status) {
        this.status = status;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time at which the status of albservicesjob updated.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return statusUpdateTime
     */
    public TimeStamp getStatusUpdateTime() {
        return statusUpdateTime;
    }

    /**
     * This is the setter method to the attribute.
     * Time at which the status of albservicesjob updated.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param statusUpdateTime set the statusUpdateTime.
     */
    public void setStatusUpdateTime(TimeStamp statusUpdateTime) {
        this.statusUpdateTime = statusUpdateTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The unique identifier of the tenant to which this albservicesjob belongs.
     * It is a reference to an object of type tenant.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * The unique identifier of the tenant to which this albservicesjob belongs.
     * It is a reference to an object of type tenant.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantRef set the tenantRef.
     */
    public void setTenantRef(String  tenantRef) {
        this.tenantRef = tenantRef;
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
     * A unique identifier for this albservicesjob entry.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * A unique identifier for this albservicesjob entry.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
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
      ALBServicesJob objALBServicesJob = (ALBServicesJob) o;
      return   Objects.equals(this.uuid, objALBServicesJob.uuid)&&
  Objects.equals(this.tenantRef, objALBServicesJob.tenantRef)&&
  Objects.equals(this.name, objALBServicesJob.name)&&
  Objects.equals(this.status, objALBServicesJob.status)&&
  Objects.equals(this.pulseJobId, objALBServicesJob.pulseJobId)&&
  Objects.equals(this.command, objALBServicesJob.command)&&
  Objects.equals(this.startTime, objALBServicesJob.startTime)&&
  Objects.equals(this.endTime, objALBServicesJob.endTime)&&
  Objects.equals(this.pulseSyncStatus, objALBServicesJob.pulseSyncStatus)&&
  Objects.equals(this.result, objALBServicesJob.result)&&
  Objects.equals(this.params, objALBServicesJob.params)&&
  Objects.equals(this.statusUpdateTime, objALBServicesJob.statusUpdateTime);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ALBServicesJob {\n");
                  sb.append("    command: ").append(toIndentedString(command)).append("\n");
                        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    params: ").append(toIndentedString(params)).append("\n");
                        sb.append("    pulseJobId: ").append(toIndentedString(pulseJobId)).append("\n");
                        sb.append("    pulseSyncStatus: ").append(toIndentedString(pulseSyncStatus)).append("\n");
                        sb.append("    result: ").append(toIndentedString(result)).append("\n");
                        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
                        sb.append("    status: ").append(toIndentedString(status)).append("\n");
                        sb.append("    statusUpdateTime: ").append(toIndentedString(statusUpdateTime)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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

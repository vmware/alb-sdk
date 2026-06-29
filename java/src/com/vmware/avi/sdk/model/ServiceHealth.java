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
 * The ServiceHealth is a POJO class extends AviRestResource that used for creating
 * ServiceHealth.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceHealth  {
    @JsonProperty("available")
    private Boolean available;

    @JsonProperty("controllerReason")
    private String controllerReason;

    @JsonProperty("id")
    private String id;

    @JsonProperty("last_updated_time")
    private TimeStamp lastUpdatedTime;

    @JsonProperty("name")
    private String name;

    @JsonProperty("operational")
    private Boolean operational = false;

    @JsonProperty("portalReason")
    private String portalReason;

    @JsonProperty("reason")
    private String reason = "SYSERR_SUCCESS";



    /**
     * This is the getter method this will return the attribute value.
     * Availability status of service.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return available
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * This is the setter method to the attribute.
     * Availability status of service.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param available set the available.
     */
    public void setAvailable(Boolean  available) {
        this.available = available;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Error message of failure if the service is unoperational, updated by controller.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return controllerReason
     */
    public String getControllerreason() {
        return controllerReason;
    }

    /**
     * This is the setter method to the attribute.
     * Error message of failure if the service is unoperational, updated by controller.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param controllerReason set the controllerReason.
     */
    public void setControllerreason(String  controllerReason) {
        this.controllerReason = controllerReason;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unique id for each service.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * This is the setter method to the attribute.
     * Unique id for each service.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param id set the id.
     */
    public void setId(String  id) {
        this.id = id;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timestamp of the last update on health of service.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return lastUpdatedTime
     */
    public TimeStamp getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * This is the setter method to the attribute.
     * Timestamp of the last update on health of service.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param lastUpdatedTime set the lastUpdatedTime.
     */
    public void setLastUpdatedTime(TimeStamp lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of service.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of service.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Operationality status of service.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return operational
     */
    public Boolean getOperational() {
        return operational;
    }

    /**
     * This is the setter method to the attribute.
     * Operationality status of service.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param operational set the operational.
     */
    public void setOperational(Boolean  operational) {
        this.operational = operational;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Error message of failure if the service is unavailable, updated by pulse cloud services.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return portalReason
     */
    public String getPortalreason() {
        return portalReason;
    }

    /**
     * This is the setter method to the attribute.
     * Error message of failure if the service is unavailable, updated by pulse cloud services.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param portalReason set the portalReason.
     */
    public void setPortalreason(String  portalReason) {
        this.portalReason = portalReason;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reason of failure if the service is unavailable.
     * Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO,
     * SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN,
     * SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_FAILED...
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SYSERR_SUCCESS".
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * This is the setter method to the attribute.
     * Reason of failure if the service is unavailable.
     * Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO,
     * SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN,
     * SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_FAILED...
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SYSERR_SUCCESS".
     * @param reason set the reason.
     */
    public void setReason(String  reason) {
        this.reason = reason;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ServiceHealth objServiceHealth = (ServiceHealth) o;
      return   Objects.equals(this.name, objServiceHealth.name)&&
  Objects.equals(this.available, objServiceHealth.available)&&
  Objects.equals(this.reason, objServiceHealth.reason)&&
  Objects.equals(this.lastUpdatedTime, objServiceHealth.lastUpdatedTime)&&
  Objects.equals(this.portalReason, objServiceHealth.portalReason)&&
  Objects.equals(this.operational, objServiceHealth.operational)&&
  Objects.equals(this.controllerReason, objServiceHealth.controllerReason)&&
  Objects.equals(this.id, objServiceHealth.id);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ServiceHealth {\n");
                  sb.append("    available: ").append(toIndentedString(available)).append("\n");
                        sb.append("    controllerReason: ").append(toIndentedString(controllerReason)).append("\n");
                        sb.append("    id: ").append(toIndentedString(id)).append("\n");
                        sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    operational: ").append(toIndentedString(operational)).append("\n");
                        sb.append("    portalReason: ").append(toIndentedString(portalReason)).append("\n");
                        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

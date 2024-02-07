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
 * The MustChecksInfo is a POJO class extends AviRestResource that used for creating
 * MustChecksInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MustChecksInfo  {
    @JsonProperty("check_code")
    private String checkCode = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("details")
    private List<String> details = null;

    @JsonProperty("duration")
    private Integer duration = null;

    @JsonProperty("end_time")
    private String endTime = null;

    @JsonProperty("error_details")
    private List<String> errorDetails = null;

    @JsonProperty("start_time")
    private String startTime = null;

    @JsonProperty("state")
    private String state = null;



    /**
     * This is the getter method this will return the attribute value.
     * Syserr status code of the must check.
     * Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO,
     * SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN,
     * SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_BAD_REQUEST...
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return checkCode
     */
    public String getCheckCode() {
        return checkCode;
    }

    /**
     * This is the setter method to the attribute.
     * Syserr status code of the must check.
     * Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO,
     * SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN,
     * SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_BAD_REQUEST...
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param checkCode set the checkCode.
     */
    public void setCheckCode(String  checkCode) {
        this.checkCode = checkCode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reason for must check failure.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Reason for must check failure.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Additional details of the must check.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return details
     */
    public List<String> getDetails() {
        return details;
    }

    /**
     * This is the setter method. this will set the details
     * Additional details of the must check.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return details
     */
    public void setDetails(List<String>  details) {
        this.details = details;
    }

    /**
     * This is the setter method this will set the details
     * Additional details of the must check.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return details
     */
    public MustChecksInfo addDetailsItem(String detailsItem) {
      if (this.details == null) {
        this.details = new ArrayList<String>();
      }
      this.details.add(detailsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time taken to complete must check in seconds.
     * Field introduced in 22.1.3.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * This is the setter method to the attribute.
     * Time taken to complete must check in seconds.
     * Field introduced in 22.1.3.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param duration set the duration.
     */
    public void setDuration(Integer  duration) {
        this.duration = duration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time at which execution of must check was completed.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * This is the setter method to the attribute.
     * Time at which execution of must check was completed.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param endTime set the endTime.
     */
    public void setEndTime(String  endTime) {
        this.endTime = endTime;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Error/failure details of the must check.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorDetails
     */
    public List<String> getErrorDetails() {
        return errorDetails;
    }

    /**
     * This is the setter method. this will set the errorDetails
     * Error/failure details of the must check.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorDetails
     */
    public void setErrorDetails(List<String>  errorDetails) {
        this.errorDetails = errorDetails;
    }

    /**
     * This is the setter method this will set the errorDetails
     * Error/failure details of the must check.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorDetails
     */
    public MustChecksInfo addErrorDetailsItem(String errorDetailsItem) {
      if (this.errorDetails == null) {
        this.errorDetails = new ArrayList<String>();
      }
      this.errorDetails.add(errorDetailsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time at which execution of must check was started.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * This is the setter method to the attribute.
     * Time at which execution of must check was started.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param startTime set the startTime.
     */
    public void setStartTime(String  startTime) {
        this.startTime = startTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The must check operations current fsm-state.
     * Enum options - UPGRADE_FSM_INIT, UPGRADE_FSM_STARTED, UPGRADE_FSM_WAITING, UPGRADE_FSM_IN_PROGRESS, UPGRADE_FSM_ENQUEUED, UPGRADE_FSM_ERROR,
     * UPGRADE_FSM_SUSPENDED, UPGRADE_FSM_ENQUEUE_FAILED, UPGRADE_FSM_PAUSED, UPGRADE_FSM_COMPLETED, UPGRADE_FSM_ABORT_IN_PROGRESS, UPGRADE_FSM_ABORTED,
     * UPGRADE_FSM_SE_UPGRADE_IN_PROGRESS, UPGRADE_FSM_CONTROLLER_COMPLETED, UPGRADE_FSM_DUMMY_3, UPGRADE_FSM_DUMMY_4, UPGRADE_FSM_DUMMY_5,
     * UPGRADE_PRE_CHECK_STARTED, UPGRADE_PRE_CHECK_IN_PROGRESS, UPGRADE_PRE_CHECK_SUCCESS...
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * This is the setter method to the attribute.
     * The must check operations current fsm-state.
     * Enum options - UPGRADE_FSM_INIT, UPGRADE_FSM_STARTED, UPGRADE_FSM_WAITING, UPGRADE_FSM_IN_PROGRESS, UPGRADE_FSM_ENQUEUED, UPGRADE_FSM_ERROR,
     * UPGRADE_FSM_SUSPENDED, UPGRADE_FSM_ENQUEUE_FAILED, UPGRADE_FSM_PAUSED, UPGRADE_FSM_COMPLETED, UPGRADE_FSM_ABORT_IN_PROGRESS, UPGRADE_FSM_ABORTED,
     * UPGRADE_FSM_SE_UPGRADE_IN_PROGRESS, UPGRADE_FSM_CONTROLLER_COMPLETED, UPGRADE_FSM_DUMMY_3, UPGRADE_FSM_DUMMY_4, UPGRADE_FSM_DUMMY_5,
     * UPGRADE_PRE_CHECK_STARTED, UPGRADE_PRE_CHECK_IN_PROGRESS, UPGRADE_PRE_CHECK_SUCCESS...
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param state set the state.
     */
    public void setState(String  state) {
        this.state = state;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      MustChecksInfo objMustChecksInfo = (MustChecksInfo) o;
      return   Objects.equals(this.checkCode, objMustChecksInfo.checkCode)&&
  Objects.equals(this.description, objMustChecksInfo.description)&&
  Objects.equals(this.details, objMustChecksInfo.details)&&
  Objects.equals(this.state, objMustChecksInfo.state)&&
  Objects.equals(this.startTime, objMustChecksInfo.startTime)&&
  Objects.equals(this.endTime, objMustChecksInfo.endTime)&&
  Objects.equals(this.duration, objMustChecksInfo.duration)&&
  Objects.equals(this.errorDetails, objMustChecksInfo.errorDetails);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MustChecksInfo {\n");
                  sb.append("    checkCode: ").append(toIndentedString(checkCode)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    details: ").append(toIndentedString(details)).append("\n");
                        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
                        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
                        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
                        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
                        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

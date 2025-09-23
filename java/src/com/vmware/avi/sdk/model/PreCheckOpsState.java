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
 * The PreCheckOpsState is a POJO class extends AviRestResource that used for creating
 * PreCheckOpsState.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PreCheckOpsState  {
    @JsonProperty("last_changed_time")
    private TimeStamp lastChangedTime;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("state")
    private String state;



    /**
     * This is the getter method this will return the attribute value.
     * The last time the state changed.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return lastChangedTime
     */
    public TimeStamp getLastChangedTime() {
        return lastChangedTime;
    }

    /**
     * This is the setter method to the attribute.
     * The last time the state changed.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param lastChangedTime set the lastChangedTime.
     */
    public void setLastChangedTime(TimeStamp lastChangedTime) {
        this.lastChangedTime = lastChangedTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reason for the pre-check state.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * This is the setter method to the attribute.
     * Reason for the pre-check state.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reason set the reason.
     */
    public void setReason(String  reason) {
        this.reason = reason;
    }

    /**
     * This is the getter method this will return the attribute value.
     * State of the report generation pre-checks.
     * Enum options - PRECHECK_FSM_STARTED, PRECHECK_FSM_IN_PROGRESS, PRECHECK_FSM_SUCCESS, PRECHECK_FSM_WARNING, PRECHECK_FSM_ERROR.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * This is the setter method to the attribute.
     * State of the report generation pre-checks.
     * Enum options - PRECHECK_FSM_STARTED, PRECHECK_FSM_IN_PROGRESS, PRECHECK_FSM_SUCCESS, PRECHECK_FSM_WARNING, PRECHECK_FSM_ERROR.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
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
      PreCheckOpsState objPreCheckOpsState = (PreCheckOpsState) o;
      return   Objects.equals(this.state, objPreCheckOpsState.state)&&
  Objects.equals(this.reason, objPreCheckOpsState.reason)&&
  Objects.equals(this.lastChangedTime, objPreCheckOpsState.lastChangedTime);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PreCheckOpsState {\n");
                  sb.append("    lastChangedTime: ").append(toIndentedString(lastChangedTime)).append("\n");
                        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

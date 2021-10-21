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
 * The ImageUploadOpsStatus is a POJO class extends AviRestResource that used for creating
 * ImageUploadOpsStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageUploadOpsStatus  {
    @JsonProperty("last_changed_time")
    private TimeStamp lastChangedTime = null;

    @JsonProperty("reason")
    private String reason = null;

    @JsonProperty("state")
    private String state = null;



    /**
     * This is the getter method this will return the attribute value.
     * The last time the state changed.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return lastChangedTime
     */
    public TimeStamp getLastChangedTime() {
        return lastChangedTime;
    }

    /**
     * This is the setter method to the attribute.
     * The last time the state changed.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param lastChangedTime set the lastChangedTime.
     */
    public void setLastChangedTime(TimeStamp lastChangedTime) {
        this.lastChangedTime = lastChangedTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Descriptive reason for the state of the image.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * This is the setter method to the attribute.
     * Descriptive reason for the state of the image.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reason set the reason.
     */
    public void setReason(String  reason) {
        this.reason = reason;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Current fsm-state of image upload operation.
     * Enum options - IMAGE_FSM_STARTED, IMAGE_FSM_IN_PROGRESS, IMAGE_FSM_COMPLETED, IMAGE_FSM_FAILED.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * This is the setter method to the attribute.
     * Current fsm-state of image upload operation.
     * Enum options - IMAGE_FSM_STARTED, IMAGE_FSM_IN_PROGRESS, IMAGE_FSM_COMPLETED, IMAGE_FSM_FAILED.
     * Field introduced in 21.1.3.
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
      ImageUploadOpsStatus objImageUploadOpsStatus = (ImageUploadOpsStatus) o;
      return   Objects.equals(this.state, objImageUploadOpsStatus.state)&&
  Objects.equals(this.reason, objImageUploadOpsStatus.reason)&&
  Objects.equals(this.lastChangedTime, objImageUploadOpsStatus.lastChangedTime);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ImageUploadOpsStatus {\n");
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

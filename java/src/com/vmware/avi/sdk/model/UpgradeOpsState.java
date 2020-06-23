/*
 * Avi avi_global_spec Object API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 20.1.1
 * Contact: support@avinetworks.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.avi.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.vmware.avi.sdk.model.TimeStamp;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * UpgradeOpsState
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class UpgradeOpsState {
  @JsonProperty("last_changed_time")
  private TimeStamp lastChangedTime = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("state")
  private String state = null;

  public UpgradeOpsState lastChangedTime(TimeStamp lastChangedTime) {
    this.lastChangedTime = lastChangedTime;
    return this;
  }

   /**
   * Get lastChangedTime
   * @return lastChangedTime
  **/
  @Schema(description = "")
  public TimeStamp getLastChangedTime() {
    return lastChangedTime;
  }

  public void setLastChangedTime(TimeStamp lastChangedTime) {
    this.lastChangedTime = lastChangedTime;
  }

  public UpgradeOpsState reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Descriptive reason for the state-change. Field introduced in 18.2.6.
   * @return reason
  **/
  @Schema(description = "Descriptive reason for the state-change. Field introduced in 18.2.6.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public UpgradeOpsState state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The upgrade operations current fsm-state. Enum options - UPGRADE_FSM_INIT, UPGRADE_FSM_STARTED, UPGRADE_FSM_WAITING, UPGRADE_FSM_IN_PROGRESS, UPGRADE_FSM_ENQUEUED, UPGRADE_FSM_ERROR, UPGRADE_FSM_SUSPENDED, UPGRADE_FSM_ENQUEUE_FAILED, UPGRADE_FSM_PAUSED, UPGRADE_FSM_COMPLETED, UPGRADE_FSM_ABORT_IN_PROGRESS, UPGRADE_FSM_ABORTED, UPGRADE_FSM_DUMMY_1, UPGRADE_FSM_DUMMY_2, UPGRADE_FSM_DUMMY_3, UPGRADE_FSM_DUMMY_4, UPGRADE_FSM_DUMMY_5. Field introduced in 18.2.6.
   * @return state
  **/
  @Schema(description = "The upgrade operations current fsm-state. Enum options - UPGRADE_FSM_INIT, UPGRADE_FSM_STARTED, UPGRADE_FSM_WAITING, UPGRADE_FSM_IN_PROGRESS, UPGRADE_FSM_ENQUEUED, UPGRADE_FSM_ERROR, UPGRADE_FSM_SUSPENDED, UPGRADE_FSM_ENQUEUE_FAILED, UPGRADE_FSM_PAUSED, UPGRADE_FSM_COMPLETED, UPGRADE_FSM_ABORT_IN_PROGRESS, UPGRADE_FSM_ABORTED, UPGRADE_FSM_DUMMY_1, UPGRADE_FSM_DUMMY_2, UPGRADE_FSM_DUMMY_3, UPGRADE_FSM_DUMMY_4, UPGRADE_FSM_DUMMY_5. Field introduced in 18.2.6.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
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
    UpgradeOpsState upgradeOpsState = (UpgradeOpsState) o;
    return Objects.equals(this.lastChangedTime, upgradeOpsState.lastChangedTime) &&
        Objects.equals(this.reason, upgradeOpsState.reason) &&
        Objects.equals(this.state, upgradeOpsState.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastChangedTime, reason, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeOpsState {\n");
    
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

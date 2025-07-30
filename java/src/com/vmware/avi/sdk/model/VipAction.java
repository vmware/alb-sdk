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
 * The VipAction is a POJO class extends AviRestResource that used for creating
 * VipAction.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VipAction  {
    @JsonProperty("action")
    private String action;

    @JsonProperty("from_se")
    private String fromSe;

    @JsonProperty("new_vcpus")
    private Integer newVcpus;

    @JsonProperty("se_list")
    private List<String> seList;

    @JsonProperty("status")
    private String status;

    @JsonProperty("timestamp")
    private Integer timestamp;

    @JsonProperty("to_new_se")
    private Boolean toNewSe;

    @JsonProperty("to_se")
    private String toSe;

    @JsonProperty("vip_id")
    private String vipId;

    @JsonProperty("vip_uuid")
    private String vipUuid;

    @JsonProperty("vs_uuid")
    private String vsUuid;

    @JsonProperty("waiting_for_sibling")
    private Boolean waitingForSibling = false;



    /**
     * This is the getter method this will return the attribute value.
     * Enum options - PLACEMENT_ORCHESTRATOR_VIP_MIGRATE, PLACEMENT_ORCHESTRATOR_VIP_SCALEOUT, PLACEMENT_ORCHESTRATOR_VIP_SCALEIN,
     * PLACEMENT_ORCHESTRATOR_VIP_FORCE_SCALEIN.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return action
     */
    public String getAction() {
        return action;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - PLACEMENT_ORCHESTRATOR_VIP_MIGRATE, PLACEMENT_ORCHESTRATOR_VIP_SCALEOUT, PLACEMENT_ORCHESTRATOR_VIP_SCALEIN,
     * PLACEMENT_ORCHESTRATOR_VIP_FORCE_SCALEIN.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param action set the action.
     */
    public void setAction(String  action) {
        this.action = action;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fromSe
     */
    public String getFromSe() {
        return fromSe;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param fromSe set the fromSe.
     */
    public void setFromSe(String  fromSe) {
        this.fromSe = fromSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return newVcpus
     */
    public Integer getNewVcpus() {
        return newVcpus;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param newVcpus set the newVcpus.
     */
    public void setNewVcpus(Integer  newVcpus) {
        this.newVcpus = newVcpus;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seList
     */
    public List<String> getSeList() {
        return seList;
    }

    /**
     * This is the setter method. this will set the seList
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seList
     */
    public void setSeList(List<String>  seList) {
        this.seList = seList;
    }

    /**
     * This is the setter method this will set the seList
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seList
     */
    public VipAction addSeListItem(String seListItem) {
      if (this.seList == null) {
        this.seList = new ArrayList<String>();
      }
      this.seList.add(seListItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param status set the status.
     */
    public void setStatus(String  status) {
        this.status = status;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return timestamp
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param timestamp set the timestamp.
     */
    public void setTimestamp(Integer  timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return toNewSe
     */
    public Boolean getToNewSe() {
        return toNewSe;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param toNewSe set the toNewSe.
     */
    public void setToNewSe(Boolean  toNewSe) {
        this.toNewSe = toNewSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return toSe
     */
    public String getToSe() {
        return toSe;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param toSe set the toSe.
     */
    public void setToSe(String  toSe) {
        this.toSe = toSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vipId
     */
    public String getVipId() {
        return vipId;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vipId set the vipId.
     */
    public void setVipId(String  vipId) {
        this.vipId = vipId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vipUuid
     */
    public String getVipUuid() {
        return vipUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vipUuid set the vipUuid.
     */
    public void setVipUuid(String  vipUuid) {
        this.vipUuid = vipUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsUuid
     */
    public String getVsUuid() {
        return vsUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsUuid set the vsUuid.
     */
    public void setVsUuid(String  vsUuid) {
        this.vsUuid = vsUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return waitingForSibling
     */
    public Boolean getWaitingForSibling() {
        return waitingForSibling;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param waitingForSibling set the waitingForSibling.
     */
    public void setWaitingForSibling(Boolean  waitingForSibling) {
        this.waitingForSibling = waitingForSibling;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VipAction objVipAction = (VipAction) o;
      return   Objects.equals(this.vsUuid, objVipAction.vsUuid)&&
  Objects.equals(this.vipUuid, objVipAction.vipUuid)&&
  Objects.equals(this.vipId, objVipAction.vipId)&&
  Objects.equals(this.action, objVipAction.action)&&
  Objects.equals(this.fromSe, objVipAction.fromSe)&&
  Objects.equals(this.status, objVipAction.status)&&
  Objects.equals(this.timestamp, objVipAction.timestamp)&&
  Objects.equals(this.toSe, objVipAction.toSe)&&
  Objects.equals(this.seList, objVipAction.seList)&&
  Objects.equals(this.waitingForSibling, objVipAction.waitingForSibling)&&
  Objects.equals(this.toNewSe, objVipAction.toNewSe)&&
  Objects.equals(this.newVcpus, objVipAction.newVcpus);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VipAction {\n");
                  sb.append("    action: ").append(toIndentedString(action)).append("\n");
                        sb.append("    fromSe: ").append(toIndentedString(fromSe)).append("\n");
                        sb.append("    newVcpus: ").append(toIndentedString(newVcpus)).append("\n");
                        sb.append("    seList: ").append(toIndentedString(seList)).append("\n");
                        sb.append("    status: ").append(toIndentedString(status)).append("\n");
                        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
                        sb.append("    toNewSe: ").append(toIndentedString(toNewSe)).append("\n");
                        sb.append("    toSe: ").append(toIndentedString(toSe)).append("\n");
                        sb.append("    vipId: ").append(toIndentedString(vipId)).append("\n");
                        sb.append("    vipUuid: ").append(toIndentedString(vipUuid)).append("\n");
                        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
                        sb.append("    waitingForSibling: ").append(toIndentedString(waitingForSibling)).append("\n");
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

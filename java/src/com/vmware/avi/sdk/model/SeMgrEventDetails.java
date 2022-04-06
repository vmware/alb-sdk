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
 * The SeMgrEventDetails is a POJO class extends AviRestResource that used for creating
 * SeMgrEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeMgrEventDetails  {
    @JsonProperty("cloud_name")
    private String cloudName = null;

    @JsonProperty("cloud_uuid")
    private String cloudUuid = null;

    @JsonProperty("enable_state")
    private String enableState = null;

    @JsonProperty("gcp_info")
    private GcpInfo gcpInfo = null;

    @JsonProperty("host_name")
    private String hostName = null;

    @JsonProperty("host_uuid")
    private String hostUuid = null;

    @JsonProperty("memory")
    private Integer memory = null;

    @JsonProperty("migrate_state")
    private String migrateState = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("new_mgmt_ip")
    private String newMgmtIp = null;

    @JsonProperty("new_mgmt_ip6")
    private String newMgmtIp6 = null;

    @JsonProperty("old_mgmt_ip")
    private String oldMgmtIp = null;

    @JsonProperty("old_mgmt_ip6")
    private String oldMgmtIp6 = null;

    @JsonProperty("reason")
    private String reason = null;

    @JsonProperty("se_grp_name")
    private String seGrpName = null;

    @JsonProperty("se_grp_uuid")
    private String seGrpUuid = null;

    @JsonProperty("vcpus")
    private Integer vcpus = null;

    @JsonProperty("vs_name")
    private List<String> vsName = null;

    @JsonProperty("vs_uuid")
    private List<String> vsUuid = null;

    @JsonProperty("vsphere_ha_enabled")
    private Boolean vsphereHaEnabled = null;

    @JsonProperty("vsphere_ha_inprogress")
    private Boolean vsphereHaInprogress = null;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudName
     */
    public String getCloudName() {
        return cloudName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudName set the cloudName.
     */
    public void setCloudName(String  cloudName) {
        this.cloudName = cloudName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudUuid
     */
    public String getCloudUuid() {
        return cloudUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudUuid set the cloudUuid.
     */
    public void setCloudUuid(String  cloudUuid) {
        this.cloudUuid = cloudUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return enableState
     */
    public String getEnableState() {
        return enableState;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param enableState set the enableState.
     */
    public void setEnableState(String  enableState) {
        this.enableState = enableState;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gcpInfo
     */
    public GcpInfo getGcpInfo() {
        return gcpInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gcpInfo set the gcpInfo.
     */
    public void setGcpInfo(GcpInfo gcpInfo) {
        this.gcpInfo = gcpInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hostName set the hostName.
     */
    public void setHostName(String  hostName) {
        this.hostName = hostName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hostUuid
     */
    public String getHostUuid() {
        return hostUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hostUuid set the hostUuid.
     */
    public void setHostUuid(String  hostUuid) {
        this.hostUuid = hostUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param memory set the memory.
     */
    public void setMemory(Integer  memory) {
        this.memory = memory;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return migrateState
     */
    public String getMigrateState() {
        return migrateState;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param migrateState set the migrateState.
     */
    public void setMigrateState(String  migrateState) {
        this.migrateState = migrateState;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return newMgmtIp
     */
    public String getNewMgmtIp() {
        return newMgmtIp;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param newMgmtIp set the newMgmtIp.
     */
    public void setNewMgmtIp(String  newMgmtIp) {
        this.newMgmtIp = newMgmtIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return newMgmtIp6
     */
    public String getNewMgmtIp6() {
        return newMgmtIp6;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param newMgmtIp6 set the newMgmtIp6.
     */
    public void setNewMgmtIp6(String  newMgmtIp6) {
        this.newMgmtIp6 = newMgmtIp6;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return oldMgmtIp
     */
    public String getOldMgmtIp() {
        return oldMgmtIp;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param oldMgmtIp set the oldMgmtIp.
     */
    public void setOldMgmtIp(String  oldMgmtIp) {
        this.oldMgmtIp = oldMgmtIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return oldMgmtIp6
     */
    public String getOldMgmtIp6() {
        return oldMgmtIp6;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param oldMgmtIp6 set the oldMgmtIp6.
     */
    public void setOldMgmtIp6(String  oldMgmtIp6) {
        this.oldMgmtIp6 = oldMgmtIp6;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reason set the reason.
     */
    public void setReason(String  reason) {
        this.reason = reason;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGrpName
     */
    public String getSeGrpName() {
        return seGrpName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seGrpName set the seGrpName.
     */
    public void setSeGrpName(String  seGrpName) {
        this.seGrpName = seGrpName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGrpUuid
     */
    public String getSeGrpUuid() {
        return seGrpUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seGrpUuid set the seGrpUuid.
     */
    public void setSeGrpUuid(String  seGrpUuid) {
        this.seGrpUuid = seGrpUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcpus
     */
    public Integer getVcpus() {
        return vcpus;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcpus set the vcpus.
     */
    public void setVcpus(Integer  vcpus) {
        this.vcpus = vcpus;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsName
     */
    public List<String> getVsName() {
        return vsName;
    }

    /**
     * This is the setter method. this will set the vsName
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsName
     */
    public void setVsName(List<String>  vsName) {
        this.vsName = vsName;
    }

    /**
     * This is the setter method this will set the vsName
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsName
     */
    public SeMgrEventDetails addVsNameItem(String vsNameItem) {
      if (this.vsName == null) {
        this.vsName = new ArrayList<String>();
      }
      this.vsName.add(vsNameItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsUuid
     */
    public List<String> getVsUuid() {
        return vsUuid;
    }

    /**
     * This is the setter method. this will set the vsUuid
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsUuid
     */
    public void setVsUuid(List<String>  vsUuid) {
        this.vsUuid = vsUuid;
    }

    /**
     * This is the setter method this will set the vsUuid
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsUuid
     */
    public SeMgrEventDetails addVsUuidItem(String vsUuidItem) {
      if (this.vsUuid == null) {
        this.vsUuid = new ArrayList<String>();
      }
      this.vsUuid.add(vsUuidItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vsphere ha on cluster enabled.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsphereHaEnabled
     */
    public Boolean getVsphereHaEnabled() {
        return vsphereHaEnabled;
    }

    /**
     * This is the setter method to the attribute.
     * Vsphere ha on cluster enabled.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsphereHaEnabled set the vsphereHaEnabled.
     */
    public void setVsphereHaEnabled(Boolean  vsphereHaEnabled) {
        this.vsphereHaEnabled = vsphereHaEnabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This flag is set to true when cloud connector has detected an esx host failure.
     * This flag is set to false when the se connects back to the controller, or when vsphere ha recovery timeout has occurred.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsphereHaInprogress
     */
    public Boolean getVsphereHaInprogress() {
        return vsphereHaInprogress;
    }

    /**
     * This is the setter method to the attribute.
     * This flag is set to true when cloud connector has detected an esx host failure.
     * This flag is set to false when the se connects back to the controller, or when vsphere ha recovery timeout has occurred.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsphereHaInprogress set the vsphereHaInprogress.
     */
    public void setVsphereHaInprogress(Boolean  vsphereHaInprogress) {
        this.vsphereHaInprogress = vsphereHaInprogress;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SeMgrEventDetails objSeMgrEventDetails = (SeMgrEventDetails) o;
      return   Objects.equals(this.name, objSeMgrEventDetails.name)&&
  Objects.equals(this.reason, objSeMgrEventDetails.reason)&&
  Objects.equals(this.hostUuid, objSeMgrEventDetails.hostUuid)&&
  Objects.equals(this.hostName, objSeMgrEventDetails.hostName)&&
  Objects.equals(this.vsUuid, objSeMgrEventDetails.vsUuid)&&
  Objects.equals(this.vsName, objSeMgrEventDetails.vsName)&&
  Objects.equals(this.vcpus, objSeMgrEventDetails.vcpus)&&
  Objects.equals(this.memory, objSeMgrEventDetails.memory)&&
  Objects.equals(this.seGrpUuid, objSeMgrEventDetails.seGrpUuid)&&
  Objects.equals(this.seGrpName, objSeMgrEventDetails.seGrpName)&&
  Objects.equals(this.cloudUuid, objSeMgrEventDetails.cloudUuid)&&
  Objects.equals(this.cloudName, objSeMgrEventDetails.cloudName)&&
  Objects.equals(this.enableState, objSeMgrEventDetails.enableState)&&
  Objects.equals(this.migrateState, objSeMgrEventDetails.migrateState)&&
  Objects.equals(this.gcpInfo, objSeMgrEventDetails.gcpInfo)&&
  Objects.equals(this.oldMgmtIp, objSeMgrEventDetails.oldMgmtIp)&&
  Objects.equals(this.newMgmtIp, objSeMgrEventDetails.newMgmtIp)&&
  Objects.equals(this.oldMgmtIp6, objSeMgrEventDetails.oldMgmtIp6)&&
  Objects.equals(this.newMgmtIp6, objSeMgrEventDetails.newMgmtIp6)&&
  Objects.equals(this.vsphereHaEnabled, objSeMgrEventDetails.vsphereHaEnabled)&&
  Objects.equals(this.vsphereHaInprogress, objSeMgrEventDetails.vsphereHaInprogress);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeMgrEventDetails {\n");
                  sb.append("    cloudName: ").append(toIndentedString(cloudName)).append("\n");
                        sb.append("    cloudUuid: ").append(toIndentedString(cloudUuid)).append("\n");
                        sb.append("    enableState: ").append(toIndentedString(enableState)).append("\n");
                        sb.append("    gcpInfo: ").append(toIndentedString(gcpInfo)).append("\n");
                        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
                        sb.append("    hostUuid: ").append(toIndentedString(hostUuid)).append("\n");
                        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
                        sb.append("    migrateState: ").append(toIndentedString(migrateState)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    newMgmtIp: ").append(toIndentedString(newMgmtIp)).append("\n");
                        sb.append("    newMgmtIp6: ").append(toIndentedString(newMgmtIp6)).append("\n");
                        sb.append("    oldMgmtIp: ").append(toIndentedString(oldMgmtIp)).append("\n");
                        sb.append("    oldMgmtIp6: ").append(toIndentedString(oldMgmtIp6)).append("\n");
                        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
                        sb.append("    seGrpName: ").append(toIndentedString(seGrpName)).append("\n");
                        sb.append("    seGrpUuid: ").append(toIndentedString(seGrpUuid)).append("\n");
                        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
                        sb.append("    vsName: ").append(toIndentedString(vsName)).append("\n");
                        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
                        sb.append("    vsphereHaEnabled: ").append(toIndentedString(vsphereHaEnabled)).append("\n");
                        sb.append("    vsphereHaInprogress: ").append(toIndentedString(vsphereHaInprogress)).append("\n");
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

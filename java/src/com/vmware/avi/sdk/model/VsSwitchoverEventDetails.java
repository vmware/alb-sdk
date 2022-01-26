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
 * The VsSwitchoverEventDetails is a POJO class extends AviRestResource that used for creating
 * VsSwitchoverEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VsSwitchoverEventDetails  {
    @JsonProperty("error_message")
    private String errorMessage = null;

    @JsonProperty("ip")
    private String ip = null;

    @JsonProperty("ip6")
    private String ip6 = null;

    @JsonProperty("rpc_status")
    private Integer rpcStatus = null;

    @JsonProperty("se_assigned")
    private List<VipSeAssigned> seAssigned = null;

    @JsonProperty("se_requested")
    private VirtualServiceResource seRequested = null;

    @JsonProperty("vs_uuid")
    private String vsUuid = null;



    /**
     * This is the getter method this will return the attribute value.
     * Error messages associated with this event.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * This is the setter method to the attribute.
     * Error messages associated with this event.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param errorMessage set the errorMessage.
     */
    public void setErrorMessage(String  errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vip ipv4 address.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * This is the setter method to the attribute.
     * Vip ipv4 address.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ip set the ip.
     */
    public void setIp(String  ip) {
        this.ip = ip;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vip ipv6 address.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ip6
     */
    public String getIp6() {
        return ip6;
    }

    /**
     * This is the setter method to the attribute.
     * Vip ipv6 address.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ip6 set the ip6.
     */
    public void setIp6(String  ip6) {
        this.ip6 = ip6;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Status of event.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rpcStatus
     */
    public Integer getRpcStatus() {
        return rpcStatus;
    }

    /**
     * This is the setter method to the attribute.
     * Status of event.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param rpcStatus set the rpcStatus.
     */
    public void setRpcStatus(Integer  rpcStatus) {
        this.rpcStatus = rpcStatus;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of serviceengine assigned to this virtual service.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seAssigned
     */
    public List<VipSeAssigned> getSeAssigned() {
        return seAssigned;
    }

    /**
     * This is the setter method. this will set the seAssigned
     * List of serviceengine assigned to this virtual service.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seAssigned
     */
    public void setSeAssigned(List<VipSeAssigned>  seAssigned) {
        this.seAssigned = seAssigned;
    }

    /**
     * This is the setter method this will set the seAssigned
     * List of serviceengine assigned to this virtual service.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seAssigned
     */
    public VsSwitchoverEventDetails addSeAssignedItem(VipSeAssigned seAssignedItem) {
      if (this.seAssigned == null) {
        this.seAssigned = new ArrayList<VipSeAssigned>();
      }
      this.seAssigned.add(seAssignedItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Resources requested/assigned to this virtual service.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seRequested
     */
    public VirtualServiceResource getSeRequested() {
        return seRequested;
    }

    /**
     * This is the setter method to the attribute.
     * Resources requested/assigned to this virtual service.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seRequested set the seRequested.
     */
    public void setSeRequested(VirtualServiceResource seRequested) {
        this.seRequested = seRequested;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Virtual service uuid.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsUuid
     */
    public String getVsUuid() {
        return vsUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Virtual service uuid.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsUuid set the vsUuid.
     */
    public void setVsUuid(String  vsUuid) {
        this.vsUuid = vsUuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VsSwitchoverEventDetails objVsSwitchoverEventDetails = (VsSwitchoverEventDetails) o;
      return   Objects.equals(this.vsUuid, objVsSwitchoverEventDetails.vsUuid)&&
  Objects.equals(this.seRequested, objVsSwitchoverEventDetails.seRequested)&&
  Objects.equals(this.seAssigned, objVsSwitchoverEventDetails.seAssigned)&&
  Objects.equals(this.rpcStatus, objVsSwitchoverEventDetails.rpcStatus)&&
  Objects.equals(this.errorMessage, objVsSwitchoverEventDetails.errorMessage)&&
  Objects.equals(this.ip, objVsSwitchoverEventDetails.ip)&&
  Objects.equals(this.ip6, objVsSwitchoverEventDetails.ip6);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VsSwitchoverEventDetails {\n");
                  sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
                        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
                        sb.append("    ip6: ").append(toIndentedString(ip6)).append("\n");
                        sb.append("    rpcStatus: ").append(toIndentedString(rpcStatus)).append("\n");
                        sb.append("    seAssigned: ").append(toIndentedString(seAssigned)).append("\n");
                        sb.append("    seRequested: ").append(toIndentedString(seRequested)).append("\n");
                        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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

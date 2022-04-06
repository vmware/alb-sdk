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
 * The VsAwaitingSeEventDetails is a POJO class extends AviRestResource that used for creating
 * VsAwaitingSeEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VsAwaitingSeEventDetails  {
    @JsonProperty("awaitingse_timeout")
    private Integer awaitingseTimeout = null;

    @JsonProperty("ip")
    private String ip = null;

    @JsonProperty("se_assigned")
    private List<VipSeAssigned> seAssigned = null;

    @JsonProperty("se_requested")
    private VirtualServiceResource seRequested = null;

    @JsonProperty("vs_uuid")
    private String vsUuid = null;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return awaitingseTimeout
     */
    public Integer getAwaitingseTimeout() {
        return awaitingseTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param awaitingseTimeout set the awaitingseTimeout.
     */
    public void setAwaitingseTimeout(Integer  awaitingseTimeout) {
        this.awaitingseTimeout = awaitingseTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ip set the ip.
     */
    public void setIp(String  ip) {
        this.ip = ip;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seAssigned
     */
    public List<VipSeAssigned> getSeAssigned() {
        return seAssigned;
    }

    /**
     * This is the setter method. this will set the seAssigned
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seAssigned
     */
    public void setSeAssigned(List<VipSeAssigned>  seAssigned) {
        this.seAssigned = seAssigned;
    }

    /**
     * This is the setter method this will set the seAssigned
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seAssigned
     */
    public VsAwaitingSeEventDetails addSeAssignedItem(VipSeAssigned seAssignedItem) {
      if (this.seAssigned == null) {
        this.seAssigned = new ArrayList<VipSeAssigned>();
      }
      this.seAssigned.add(seAssignedItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seRequested
     */
    public VirtualServiceResource getSeRequested() {
        return seRequested;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seRequested set the seRequested.
     */
    public void setSeRequested(VirtualServiceResource seRequested) {
        this.seRequested = seRequested;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsUuid
     */
    public String getVsUuid() {
        return vsUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
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
      VsAwaitingSeEventDetails objVsAwaitingSeEventDetails = (VsAwaitingSeEventDetails) o;
      return   Objects.equals(this.vsUuid, objVsAwaitingSeEventDetails.vsUuid)&&
  Objects.equals(this.seRequested, objVsAwaitingSeEventDetails.seRequested)&&
  Objects.equals(this.seAssigned, objVsAwaitingSeEventDetails.seAssigned)&&
  Objects.equals(this.awaitingseTimeout, objVsAwaitingSeEventDetails.awaitingseTimeout)&&
  Objects.equals(this.ip, objVsAwaitingSeEventDetails.ip);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VsAwaitingSeEventDetails {\n");
                  sb.append("    awaitingseTimeout: ").append(toIndentedString(awaitingseTimeout)).append("\n");
                        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

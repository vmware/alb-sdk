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
 * The SeNtpSynchronizationFailed is a POJO class extends AviRestResource that used for creating
 * SeNtpSynchronizationFailed.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeNtpSynchronizationFailed  {
    @JsonProperty("ntp_servers")
    private String ntpServers;

    @JsonProperty("se_name")
    private String seName;

    @JsonProperty("se_ref")
    private String seRef;



    /**
     * This is the getter method this will return the attribute value.
     * List of ntp servers.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ntpServers
     */
    public String getNtpServers() {
        return ntpServers;
    }

    /**
     * This is the setter method to the attribute.
     * List of ntp servers.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ntpServers set the ntpServers.
     */
    public void setNtpServers(String  ntpServers) {
        this.ntpServers = ntpServers;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the se reporting this event.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seName
     */
    public String getSeName() {
        return seName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the se reporting this event.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seName set the seName.
     */
    public void setSeName(String  seName) {
        this.seName = seName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the se responsible for this event.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seRef
     */
    public String getSeRef() {
        return seRef;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the se responsible for this event.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seRef set the seRef.
     */
    public void setSeRef(String  seRef) {
        this.seRef = seRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SeNtpSynchronizationFailed objSeNtpSynchronizationFailed = (SeNtpSynchronizationFailed) o;
      return   Objects.equals(this.seName, objSeNtpSynchronizationFailed.seName)&&
  Objects.equals(this.seRef, objSeNtpSynchronizationFailed.seRef)&&
  Objects.equals(this.ntpServers, objSeNtpSynchronizationFailed.ntpServers);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeNtpSynchronizationFailed {\n");
                  sb.append("    ntpServers: ").append(toIndentedString(ntpServers)).append("\n");
                        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
                        sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
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

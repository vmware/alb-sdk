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
 * The DebugServiceEngineObjSync is a POJO class extends AviRestResource that used for creating
 * DebugServiceEngineObjSync.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DebugServiceEngineObjSync  {
    @JsonProperty("log_level")
    private String logLevel = "LOG_LVL_INFO";

    @JsonProperty("publish_packet_drops")
    private Integer publishPacketDrops;



    /**
     * This is the getter method this will return the attribute value.
     * Objsync logging verbosity.
     * Enum options - LOG_LVL_ERROR, LOG_LVL_WARNING, LOG_LVL_INFO, LOG_LVL_DEBUG.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "LOG_LVL_INFO".
     * @return logLevel
     */
    public String getLogLevel() {
        return logLevel;
    }

    /**
     * This is the setter method to the attribute.
     * Objsync logging verbosity.
     * Enum options - LOG_LVL_ERROR, LOG_LVL_WARNING, LOG_LVL_INFO, LOG_LVL_DEBUG.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "LOG_LVL_INFO".
     * @param logLevel set the logLevel.
     */
    public void setLogLevel(String  logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Drop 1 packet in every n packets.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return publishPacketDrops
     */
    public Integer getPublishPacketDrops() {
        return publishPacketDrops;
    }

    /**
     * This is the setter method to the attribute.
     * Drop 1 packet in every n packets.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param publishPacketDrops set the publishPacketDrops.
     */
    public void setPublishPacketDrops(Integer  publishPacketDrops) {
        this.publishPacketDrops = publishPacketDrops;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DebugServiceEngineObjSync objDebugServiceEngineObjSync = (DebugServiceEngineObjSync) o;
      return   Objects.equals(this.publishPacketDrops, objDebugServiceEngineObjSync.publishPacketDrops)&&
  Objects.equals(this.logLevel, objDebugServiceEngineObjSync.logLevel);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DebugServiceEngineObjSync {\n");
                  sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
                        sb.append("    publishPacketDrops: ").append(toIndentedString(publishPacketDrops)).append("\n");
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

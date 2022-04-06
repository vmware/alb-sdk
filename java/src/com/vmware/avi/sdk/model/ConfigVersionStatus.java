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
 * The ConfigVersionStatus is a POJO class extends AviRestResource that used for creating
 * ConfigVersionStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConfigVersionStatus  {
    @JsonProperty("event_type")
    private String eventType = null;

    @JsonProperty("obj_name")
    private String objName = null;

    @JsonProperty("obj_uuid")
    private String objUuid = null;



    /**
     * This is the getter method this will return the attribute value.
     * Type of replication event.
     * Enum options - DNSVS, OBJECT_CONFIG_VERSION.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * This is the setter method to the attribute.
     * Type of replication event.
     * Enum options - DNSVS, OBJECT_CONFIG_VERSION.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param eventType set the eventType.
     */
    public void setEventType(String  eventType) {
        this.eventType = eventType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of config object.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objName
     */
    public String getObjName() {
        return objName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of config object.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param objName set the objName.
     */
    public void setObjName(String  objName) {
        this.objName = objName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of config object.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objUuid
     */
    public String getObjUuid() {
        return objUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of config object.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param objUuid set the objUuid.
     */
    public void setObjUuid(String  objUuid) {
        this.objUuid = objUuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ConfigVersionStatus objConfigVersionStatus = (ConfigVersionStatus) o;
      return   Objects.equals(this.objName, objConfigVersionStatus.objName)&&
  Objects.equals(this.objUuid, objConfigVersionStatus.objUuid)&&
  Objects.equals(this.eventType, objConfigVersionStatus.eventType);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ConfigVersionStatus {\n");
                  sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
                        sb.append("    objName: ").append(toIndentedString(objName)).append("\n");
                        sb.append("    objUuid: ").append(toIndentedString(objUuid)).append("\n");
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

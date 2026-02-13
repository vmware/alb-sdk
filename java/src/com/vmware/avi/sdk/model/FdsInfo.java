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
 * The FdsInfo is a POJO class extends AviRestResource that used for creating
 * FdsInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FdsInfo  {
    @JsonProperty("objects")
    private List<String> objects;

    @JsonProperty("timeline")
    private String timeline;


    /**
     * This is the getter method this will return the attribute value.
     * Captures the federated objects the site supports as per the controller version.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objects
     */
    public List<String> getObjects() {
        return objects;
    }

    /**
     * This is the setter method. this will set the objects
     * Captures the federated objects the site supports as per the controller version.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objects
     */
    public void setObjects(List<String>  objects) {
        this.objects = objects;
    }

    /**
     * This is the setter method this will set the objects
     * Captures the federated objects the site supports as per the controller version.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objects
     */
    public FdsInfo addObjectsItem(String objectsItem) {
      if (this.objects == null) {
        this.objects = new ArrayList<String>();
      }
      this.objects.add(objectsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Capture fds timeline the client is using.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return timeline
     */
    public String getTimeline() {
        return timeline;
    }

    /**
     * This is the setter method to the attribute.
     * Capture fds timeline the client is using.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param timeline set the timeline.
     */
    public void setTimeline(String  timeline) {
        this.timeline = timeline;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      FdsInfo objFdsInfo = (FdsInfo) o;
      return   Objects.equals(this.timeline, objFdsInfo.timeline)&&
  Objects.equals(this.objects, objFdsInfo.objects);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FdsInfo {\n");
                  sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
                        sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
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

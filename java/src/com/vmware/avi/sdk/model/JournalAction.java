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
 * The JournalAction is a POJO class extends AviRestResource that used for creating
 * JournalAction.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JournalAction  {
    @JsonProperty("objects")
    private List<JournalObject> objects;

    @JsonProperty("version")
    private String version;


    /**
     * This is the getter method this will return the attribute value.
     * Details of the process for each object type.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objects
     */
    public List<JournalObject> getObjects() {
        return objects;
    }

    /**
     * This is the setter method. this will set the objects
     * Details of the process for each object type.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objects
     */
    public void setObjects(List<JournalObject>  objects) {
        this.objects = objects;
    }

    /**
     * This is the setter method this will set the objects
     * Details of the process for each object type.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objects
     */
    public JournalAction addObjectsItem(JournalObject objectsItem) {
      if (this.objects == null) {
        this.objects = new ArrayList<JournalObject>();
      }
      this.objects.add(objectsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Migrated version.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * This is the setter method to the attribute.
     * Migrated version.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param version set the version.
     */
    public void setVersion(String  version) {
        this.version = version;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      JournalAction objJournalAction = (JournalAction) o;
      return   Objects.equals(this.version, objJournalAction.version)&&
  Objects.equals(this.objects, objJournalAction.objects);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class JournalAction {\n");
                  sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
                        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

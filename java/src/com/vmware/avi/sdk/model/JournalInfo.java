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
 * The JournalInfo is a POJO class extends AviRestResource that used for creating
 * JournalInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JournalInfo  {
    @JsonProperty("actions")
    private List<JournalAction> actions;

    @JsonProperty("total_objects")
    private Integer totalObjects;

    @JsonProperty("versions")
    private List<String> versions;


    /**
     * This is the getter method this will return the attribute value.
     * Details of run for each version.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return actions
     */
    public List<JournalAction> getActions() {
        return actions;
    }

    /**
     * This is the setter method. this will set the actions
     * Details of run for each version.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return actions
     */
    public void setActions(List<JournalAction>  actions) {
        this.actions = actions;
    }

    /**
     * This is the setter method this will set the actions
     * Details of run for each version.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return actions
     */
    public JournalInfo addActionsItem(JournalAction actionsItem) {
      if (this.actions == null) {
        this.actions = new ArrayList<JournalAction>();
      }
      this.actions.add(actionsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of objects to be processed.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return totalObjects
     */
    public Integer getTotalObjects() {
        return totalObjects;
    }

    /**
     * This is the setter method to the attribute.
     * Number of objects to be processed.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param totalObjects set the totalObjects.
     */
    public void setTotalObjects(Integer  totalObjects) {
        this.totalObjects = totalObjects;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of versions to be migrated.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return versions
     */
    public List<String> getVersions() {
        return versions;
    }

    /**
     * This is the setter method. this will set the versions
     * List of versions to be migrated.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return versions
     */
    public void setVersions(List<String>  versions) {
        this.versions = versions;
    }

    /**
     * This is the setter method this will set the versions
     * List of versions to be migrated.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return versions
     */
    public JournalInfo addVersionsItem(String versionsItem) {
      if (this.versions == null) {
        this.versions = new ArrayList<String>();
      }
      this.versions.add(versionsItem);
      return this;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      JournalInfo objJournalInfo = (JournalInfo) o;
      return   Objects.equals(this.totalObjects, objJournalInfo.totalObjects)&&
  Objects.equals(this.versions, objJournalInfo.versions)&&
  Objects.equals(this.actions, objJournalInfo.actions);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class JournalInfo {\n");
                  sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
                        sb.append("    totalObjects: ").append(toIndentedString(totalObjects)).append("\n");
                        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

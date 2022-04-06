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
 * The SeUpgradeEventDetails is a POJO class extends AviRestResource that used for creating
 * SeUpgradeEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeUpgradeEventDetails  {
    @JsonProperty("notes")
    private List<String> notes = null;

    @JsonProperty("num_vs")
    private Integer numVs = null;

    @JsonProperty("se_grp_uuid")
    private String seGrpUuid = null;

    @JsonProperty("se_uuid")
    private String seUuid = null;


    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return notes
     */
    public List<String> getNotes() {
        return notes;
    }

    /**
     * This is the setter method. this will set the notes
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return notes
     */
    public void setNotes(List<String>  notes) {
        this.notes = notes;
    }

    /**
     * This is the setter method this will set the notes
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return notes
     */
    public SeUpgradeEventDetails addNotesItem(String notesItem) {
      if (this.notes == null) {
        this.notes = new ArrayList<String>();
      }
      this.notes.add(notesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numVs
     */
    public Integer getNumVs() {
        return numVs;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numVs set the numVs.
     */
    public void setNumVs(Integer  numVs) {
        this.numVs = numVs;
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
     * @return seUuid
     */
    public String getSeUuid() {
        return seUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seUuid set the seUuid.
     */
    public void setSeUuid(String  seUuid) {
        this.seUuid = seUuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SeUpgradeEventDetails objSeUpgradeEventDetails = (SeUpgradeEventDetails) o;
      return   Objects.equals(this.seUuid, objSeUpgradeEventDetails.seUuid)&&
  Objects.equals(this.seGrpUuid, objSeUpgradeEventDetails.seGrpUuid)&&
  Objects.equals(this.numVs, objSeUpgradeEventDetails.numVs)&&
  Objects.equals(this.notes, objSeUpgradeEventDetails.notes);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeUpgradeEventDetails {\n");
                  sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
                        sb.append("    numVs: ").append(toIndentedString(numVs)).append("\n");
                        sb.append("    seGrpUuid: ").append(toIndentedString(seGrpUuid)).append("\n");
                        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
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

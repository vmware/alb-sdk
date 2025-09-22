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
 * The ReportSection is a POJO class extends AviRestResource that used for creating
 * ReportSection.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportSection  {
    @JsonProperty("id")
    private String id;

    @JsonProperty("sub_sections")
    private List<ReportSubSection> subSections;



    /**
     * This is the getter method this will return the attribute value.
     * The id of the section.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * This is the setter method to the attribute.
     * The id of the section.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param id set the id.
     */
    public void setId(String  id) {
        this.id = id;
    }
    /**
     * This is the getter method this will return the attribute value.
     * The sub sections of the section.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return subSections
     */
    public List<ReportSubSection> getSubSections() {
        return subSections;
    }

    /**
     * This is the setter method. this will set the subSections
     * The sub sections of the section.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return subSections
     */
    public void setSubSections(List<ReportSubSection>  subSections) {
        this.subSections = subSections;
    }

    /**
     * This is the setter method this will set the subSections
     * The sub sections of the section.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return subSections
     */
    public ReportSection addSubSectionsItem(ReportSubSection subSectionsItem) {
      if (this.subSections == null) {
        this.subSections = new ArrayList<ReportSubSection>();
      }
      this.subSections.add(subSectionsItem);
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
      ReportSection objReportSection = (ReportSection) o;
      return   Objects.equals(this.id, objReportSection.id)&&
  Objects.equals(this.subSections, objReportSection.subSections);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReportSection {\n");
                  sb.append("    id: ").append(toIndentedString(id)).append("\n");
                        sb.append("    subSections: ").append(toIndentedString(subSections)).append("\n");
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

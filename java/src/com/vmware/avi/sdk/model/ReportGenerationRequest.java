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
 * The ReportGenerationRequest is a POJO class extends AviRestResource that used for creating
 * ReportGenerationRequest.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportGenerationRequest  {
    @JsonProperty("duration")
    private ReportDuration duration;

    @JsonProperty("name")
    private String name;

    @JsonProperty("parameters")
    private List<ReportParameter> parameters;

    @JsonProperty("report")
    private String report;

    @JsonProperty("sections")
    private List<ReportSection> sections;



    /**
     * This is the getter method this will return the attribute value.
     * The duration of the report.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return duration
     */
    public ReportDuration getDuration() {
        return duration;
    }

    /**
     * This is the setter method to the attribute.
     * The duration of the report.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param duration set the duration.
     */
    public void setDuration(ReportDuration duration) {
        this.duration = duration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Custom name for the report.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Custom name for the report.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }
    /**
     * This is the getter method this will return the attribute value.
     * The parameters of the report.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return parameters
     */
    public List<ReportParameter> getParameters() {
        return parameters;
    }

    /**
     * This is the setter method. this will set the parameters
     * The parameters of the report.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return parameters
     */
    public void setParameters(List<ReportParameter>  parameters) {
        this.parameters = parameters;
    }

    /**
     * This is the setter method this will set the parameters
     * The parameters of the report.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return parameters
     */
    public ReportGenerationRequest addParametersItem(ReportParameter parametersItem) {
      if (this.parameters == null) {
        this.parameters = new ArrayList<ReportParameter>();
      }
      this.parameters.add(parametersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The report to be generated.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return report
     */
    public String getReport() {
        return report;
    }

    /**
     * This is the setter method to the attribute.
     * The report to be generated.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param report set the report.
     */
    public void setReport(String  report) {
        this.report = report;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Ids of specified sections are collected as part of the report.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sections
     */
    public List<ReportSection> getSections() {
        return sections;
    }

    /**
     * This is the setter method. this will set the sections
     * Ids of specified sections are collected as part of the report.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sections
     */
    public void setSections(List<ReportSection>  sections) {
        this.sections = sections;
    }

    /**
     * This is the setter method this will set the sections
     * Ids of specified sections are collected as part of the report.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sections
     */
    public ReportGenerationRequest addSectionsItem(ReportSection sectionsItem) {
      if (this.sections == null) {
        this.sections = new ArrayList<ReportSection>();
      }
      this.sections.add(sectionsItem);
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
      ReportGenerationRequest objReportGenerationRequest = (ReportGenerationRequest) o;
      return   Objects.equals(this.report, objReportGenerationRequest.report)&&
  Objects.equals(this.name, objReportGenerationRequest.name)&&
  Objects.equals(this.parameters, objReportGenerationRequest.parameters)&&
  Objects.equals(this.duration, objReportGenerationRequest.duration)&&
  Objects.equals(this.sections, objReportGenerationRequest.sections);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReportGenerationRequest {\n");
                  sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
                        sb.append("    report: ").append(toIndentedString(report)).append("\n");
                        sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
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

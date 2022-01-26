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
 * The SeVsDelFlowsDisrupted is a POJO class extends AviRestResource that used for creating
 * SeVsDelFlowsDisrupted.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeVsDelFlowsDisrupted  {
    @JsonProperty("deleted_vs_name")
    private String deletedVsName = null;

    @JsonProperty("num_vs_flows_disrupted")
    private Integer numVsFlowsDisrupted = null;

    @JsonProperty("reporting_se_name")
    private String reportingSeName = null;



    /**
     * This is the getter method this will return the attribute value.
     * Name of the vs which was deleted from the se.
     * It is a reference to an object of type virtualservice.
     * Field introduced in 22.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return deletedVsName
     */
    public String getDeletedVsName() {
        return deletedVsName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the vs which was deleted from the se.
     * It is a reference to an object of type virtualservice.
     * Field introduced in 22.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param deletedVsName set the deletedVsName.
     */
    public void setDeletedVsName(String  deletedVsName) {
        this.deletedVsName = deletedVsName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of vs flows disrupted when vs was deleted from the se.
     * Field introduced in 22.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numVsFlowsDisrupted
     */
    public Integer getNumVsFlowsDisrupted() {
        return numVsFlowsDisrupted;
    }

    /**
     * This is the setter method to the attribute.
     * Number of vs flows disrupted when vs was deleted from the se.
     * Field introduced in 22.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numVsFlowsDisrupted set the numVsFlowsDisrupted.
     */
    public void setNumVsFlowsDisrupted(Integer  numVsFlowsDisrupted) {
        this.numVsFlowsDisrupted = numVsFlowsDisrupted;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the se reporting this event.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 22.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reportingSeName
     */
    public String getReportingSeName() {
        return reportingSeName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the se reporting this event.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 22.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reportingSeName set the reportingSeName.
     */
    public void setReportingSeName(String  reportingSeName) {
        this.reportingSeName = reportingSeName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SeVsDelFlowsDisrupted objSeVsDelFlowsDisrupted = (SeVsDelFlowsDisrupted) o;
      return   Objects.equals(this.reportingSeName, objSeVsDelFlowsDisrupted.reportingSeName)&&
  Objects.equals(this.deletedVsName, objSeVsDelFlowsDisrupted.deletedVsName)&&
  Objects.equals(this.numVsFlowsDisrupted, objSeVsDelFlowsDisrupted.numVsFlowsDisrupted);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeVsDelFlowsDisrupted {\n");
                  sb.append("    deletedVsName: ").append(toIndentedString(deletedVsName)).append("\n");
                        sb.append("    numVsFlowsDisrupted: ").append(toIndentedString(numVsFlowsDisrupted)).append("\n");
                        sb.append("    reportingSeName: ").append(toIndentedString(reportingSeName)).append("\n");
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

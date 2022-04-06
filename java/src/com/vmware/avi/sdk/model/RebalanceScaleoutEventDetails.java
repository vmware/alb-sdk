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
 * The RebalanceScaleoutEventDetails is a POJO class extends AviRestResource that used for creating
 * RebalanceScaleoutEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RebalanceScaleoutEventDetails  {
    @JsonProperty("scaleout_params")
    private VsScaleoutParams scaleoutParams = null;

    @JsonProperty("vs_uuid")
    private String vsUuid = null;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return scaleoutParams
     */
    public VsScaleoutParams getScaleoutParams() {
        return scaleoutParams;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param scaleoutParams set the scaleoutParams.
     */
    public void setScaleoutParams(VsScaleoutParams scaleoutParams) {
        this.scaleoutParams = scaleoutParams;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsUuid
     */
    public String getVsUuid() {
        return vsUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsUuid set the vsUuid.
     */
    public void setVsUuid(String  vsUuid) {
        this.vsUuid = vsUuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      RebalanceScaleoutEventDetails objRebalanceScaleoutEventDetails = (RebalanceScaleoutEventDetails) o;
      return   Objects.equals(this.vsUuid, objRebalanceScaleoutEventDetails.vsUuid)&&
  Objects.equals(this.scaleoutParams, objRebalanceScaleoutEventDetails.scaleoutParams);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RebalanceScaleoutEventDetails {\n");
                  sb.append("    scaleoutParams: ").append(toIndentedString(scaleoutParams)).append("\n");
                        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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

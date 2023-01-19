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
 * The NsxtT1SegDetails is a POJO class extends AviRestResource that used for creating
 * NsxtT1SegDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NsxtT1SegDetails  {
    @JsonProperty("cc_id")
    private String ccId = null;

    @JsonProperty("error_string")
    private String errorString = null;

    @JsonProperty("t1seg")
    private List<NsxtT1Seg> t1seg = null;



    /**
     * This is the getter method this will return the attribute value.
     * Nsx-t cloud id.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ccId
     */
    public String getCcId() {
        return ccId;
    }

    /**
     * This is the setter method to the attribute.
     * Nsx-t cloud id.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ccId set the ccId.
     */
    public void setCcId(String  ccId) {
        this.ccId = ccId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Error message.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorString
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * This is the setter method to the attribute.
     * Error message.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param errorString set the errorString.
     */
    public void setErrorString(String  errorString) {
        this.errorString = errorString;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Nsx-t tier1(s) segment(s).
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return t1seg
     */
    public List<NsxtT1Seg> getT1Seg() {
        return t1seg;
    }

    /**
     * This is the setter method. this will set the t1seg
     * Nsx-t tier1(s) segment(s).
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return t1seg
     */
    public void setT1Seg(List<NsxtT1Seg>  t1seg) {
        this.t1seg = t1seg;
    }

    /**
     * This is the setter method this will set the t1seg
     * Nsx-t tier1(s) segment(s).
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return t1seg
     */
    public NsxtT1SegDetails addT1SegItem(NsxtT1Seg t1segItem) {
      if (this.t1seg == null) {
        this.t1seg = new ArrayList<NsxtT1Seg>();
      }
      this.t1seg.add(t1segItem);
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
      NsxtT1SegDetails objNsxtT1SegDetails = (NsxtT1SegDetails) o;
      return   Objects.equals(this.ccId, objNsxtT1SegDetails.ccId)&&
  Objects.equals(this.t1seg, objNsxtT1SegDetails.t1seg)&&
  Objects.equals(this.errorString, objNsxtT1SegDetails.errorString);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class NsxtT1SegDetails {\n");
                  sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
                        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
                        sb.append("    t1seg: ").append(toIndentedString(t1seg)).append("\n");
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

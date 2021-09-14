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
 * The VcenterImageDetails is a POJO class extends AviRestResource that used for creating
 * VcenterImageDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VcenterImageDetails  {
    @JsonProperty("cc_id")
    private String ccId = null;

    @JsonProperty("error_string")
    private String errorString = null;

    @JsonProperty("image_version")
    private String imageVersion = null;

    @JsonProperty("vc_url")
    private String vcUrl = null;



    /**
     * This is the getter method this will return the attribute value.
     * Cloud id.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ccId
     */
    public String getCcId() {
        return ccId;
    }

    /**
     * This is the setter method to the attribute.
     * Cloud id.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ccId set the ccId.
     */
    public void setCcId(String  ccId) {
        this.ccId = ccId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Error message.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorString
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * This is the setter method to the attribute.
     * Error message.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param errorString set the errorString.
     */
    public void setErrorString(String  errorString) {
        this.errorString = errorString;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Image version.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    /**
     * This is the setter method to the attribute.
     * Image version.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param imageVersion set the imageVersion.
     */
    public void setImageVersion(String  imageVersion) {
        this.imageVersion = imageVersion;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vcenter url.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcUrl
     */
    public String getVcUrl() {
        return vcUrl;
    }

    /**
     * This is the setter method to the attribute.
     * Vcenter url.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcUrl set the vcUrl.
     */
    public void setVcUrl(String  vcUrl) {
        this.vcUrl = vcUrl;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VcenterImageDetails objVcenterImageDetails = (VcenterImageDetails) o;
      return   Objects.equals(this.vcUrl, objVcenterImageDetails.vcUrl)&&
  Objects.equals(this.imageVersion, objVcenterImageDetails.imageVersion)&&
  Objects.equals(this.ccId, objVcenterImageDetails.ccId)&&
  Objects.equals(this.errorString, objVcenterImageDetails.errorString);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VcenterImageDetails {\n");
                  sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
                        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
                        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
                        sb.append("    vcUrl: ").append(toIndentedString(vcUrl)).append("\n");
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

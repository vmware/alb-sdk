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
 * The FileReferenceMapping is a POJO class extends AviRestResource that used for creating
 * FileReferenceMapping.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FileReferenceMapping  {
    @JsonProperty("file_path")
    private String filePath = null;

    @JsonProperty("reference")
    private String reference = null;



    /**
     * This is the getter method this will return the attribute value.
     * Absolute file path corresponding to the reference.
     * Supported parameters in file_path are {image_path}, {current_version} and {prev_version}.
     * For example, {image_path}/{prev_version}/se_nsxt.ova would resolve to /vol/pkgs/30.1.1-9000-20230714.075215/se_nsxt.ova.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * This is the setter method to the attribute.
     * Absolute file path corresponding to the reference.
     * Supported parameters in file_path are {image_path}, {current_version} and {prev_version}.
     * For example, {image_path}/{prev_version}/se_nsxt.ova would resolve to /vol/pkgs/30.1.1-9000-20230714.075215/se_nsxt.ova.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param filePath set the filePath.
     */
    public void setFilePath(String  filePath) {
        this.filePath = filePath;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Short named reference for file path.
     * For example, se_img.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * This is the setter method to the attribute.
     * Short named reference for file path.
     * For example, se_img.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reference set the reference.
     */
    public void setReference(String  reference) {
        this.reference = reference;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      FileReferenceMapping objFileReferenceMapping = (FileReferenceMapping) o;
      return   Objects.equals(this.reference, objFileReferenceMapping.reference)&&
  Objects.equals(this.filePath, objFileReferenceMapping.filePath);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FileReferenceMapping {\n");
                  sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
                        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

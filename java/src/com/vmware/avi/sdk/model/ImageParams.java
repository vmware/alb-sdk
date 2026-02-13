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
 * The ImageParams is a POJO class extends AviRestResource that used for creating
 * ImageParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageParams  {
    @JsonProperty("image_replication_timeout")
    private Integer imageReplicationTimeout = 600;

    @JsonProperty("max_image_size")
    private Integer maxImageSize = 10;



    /**
     * This is the getter method this will return the attribute value.
     * Maximum wait time to replicate image files from leader to followers.
     * Allowed values are 600-3600.
     * Field introduced in 31.1.1.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 600.
     * @return imageReplicationTimeout
     */
    public Integer getImageReplicationTimeout() {
        return imageReplicationTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum wait time to replicate image files from leader to followers.
     * Allowed values are 600-3600.
     * Field introduced in 31.1.1.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 600.
     * @param imageReplicationTimeout set the imageReplicationTimeout.
     */
    public void setImageReplicationTimeout(Integer  imageReplicationTimeout) {
        this.imageReplicationTimeout = imageReplicationTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum permitted size for image uploads.
     * Allowed values are 10-15.
     * Field introduced in 31.1.1.
     * Unit is gb.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return maxImageSize
     */
    public Integer getMaxImageSize() {
        return maxImageSize;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum permitted size for image uploads.
     * Allowed values are 10-15.
     * Field introduced in 31.1.1.
     * Unit is gb.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param maxImageSize set the maxImageSize.
     */
    public void setMaxImageSize(Integer  maxImageSize) {
        this.maxImageSize = maxImageSize;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ImageParams objImageParams = (ImageParams) o;
      return   Objects.equals(this.maxImageSize, objImageParams.maxImageSize)&&
  Objects.equals(this.imageReplicationTimeout, objImageParams.imageReplicationTimeout);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ImageParams {\n");
                  sb.append("    imageReplicationTimeout: ").append(toIndentedString(imageReplicationTimeout)).append("\n");
                        sb.append("    maxImageSize: ").append(toIndentedString(maxImageSize)).append("\n");
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

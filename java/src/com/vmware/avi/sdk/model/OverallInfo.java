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
 * The OverallInfo is a POJO class extends AviRestResource that used for creating
 * OverallInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OverallInfo  {
    @JsonProperty("available")
    private Integer available;

    @JsonProperty("free_percent")
    private String freePercent;

    @JsonProperty("mount_path")
    private String mountPath;

    @JsonProperty("path")
    private String path;

    @JsonProperty("size")
    private Integer size;

    @JsonProperty("used")
    private Integer used;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return available
     */
    public Integer getAvailable() {
        return available;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param available set the available.
     */
    public void setAvailable(Integer  available) {
        this.available = available;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return freePercent
     */
    public String getFreePercent() {
        return freePercent;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param freePercent set the freePercent.
     */
    public void setFreePercent(String  freePercent) {
        this.freePercent = freePercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Mount path for the disk filesystem.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mountPath
     */
    public String getMountPath() {
        return mountPath;
    }

    /**
     * This is the setter method to the attribute.
     * Mount path for the disk filesystem.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mountPath set the mountPath.
     */
    public void setMountPath(String  mountPath) {
        this.mountPath = mountPath;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param path set the path.
     */
    public void setPath(String  path) {
        this.path = path;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param size set the size.
     */
    public void setSize(Integer  size) {
        this.size = size;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param used set the used.
     */
    public void setUsed(Integer  used) {
        this.used = used;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      OverallInfo objOverallInfo = (OverallInfo) o;
      return   Objects.equals(this.path, objOverallInfo.path)&&
  Objects.equals(this.size, objOverallInfo.size)&&
  Objects.equals(this.used, objOverallInfo.used)&&
  Objects.equals(this.available, objOverallInfo.available)&&
  Objects.equals(this.freePercent, objOverallInfo.freePercent)&&
  Objects.equals(this.mountPath, objOverallInfo.mountPath);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OverallInfo {\n");
                  sb.append("    available: ").append(toIndentedString(available)).append("\n");
                        sb.append("    freePercent: ").append(toIndentedString(freePercent)).append("\n");
                        sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
                        sb.append("    path: ").append(toIndentedString(path)).append("\n");
                        sb.append("    size: ").append(toIndentedString(size)).append("\n");
                        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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

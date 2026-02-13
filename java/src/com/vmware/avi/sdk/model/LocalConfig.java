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
 * The LocalConfig is a POJO class extends AviRestResource that used for creating
 * LocalConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocalConfig  {
    @JsonProperty("vsgs_info")
    private List<VsgsOpsInfo> vsgsInfo;


    /**
     * This is the getter method this will return the attribute value.
     * Vsgs operational information.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsgsInfo
     */
    public List<VsgsOpsInfo> getVsgsInfo() {
        return vsgsInfo;
    }

    /**
     * This is the setter method. this will set the vsgsInfo
     * Vsgs operational information.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsgsInfo
     */
    public void setVsgsInfo(List<VsgsOpsInfo>  vsgsInfo) {
        this.vsgsInfo = vsgsInfo;
    }

    /**
     * This is the setter method this will set the vsgsInfo
     * Vsgs operational information.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsgsInfo
     */
    public LocalConfig addVsgsInfoItem(VsgsOpsInfo vsgsInfoItem) {
      if (this.vsgsInfo == null) {
        this.vsgsInfo = new ArrayList<VsgsOpsInfo>();
      }
      this.vsgsInfo.add(vsgsInfoItem);
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
      LocalConfig objLocalConfig = (LocalConfig) o;
      return   Objects.equals(this.vsgsInfo, objLocalConfig.vsgsInfo);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LocalConfig {\n");
                  sb.append("    vsgsInfo: ").append(toIndentedString(vsgsInfo)).append("\n");
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

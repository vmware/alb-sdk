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
 * The ParamsInURI is a POJO class extends AviRestResource that used for creating
 * ParamsInURI.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParamsInURI  {
    @JsonProperty("param_info")
    private List<ParamInURI> paramInfo = null;


    /**
     * This is the getter method this will return the attribute value.
     * Params info in hitted signature rule which has args match element.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return paramInfo
     */
    public List<ParamInURI> getParamInfo() {
        return paramInfo;
    }

    /**
     * This is the setter method. this will set the paramInfo
     * Params info in hitted signature rule which has args match element.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return paramInfo
     */
    public void setParamInfo(List<ParamInURI>  paramInfo) {
        this.paramInfo = paramInfo;
    }

    /**
     * This is the setter method this will set the paramInfo
     * Params info in hitted signature rule which has args match element.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return paramInfo
     */
    public ParamsInURI addParamInfoItem(ParamInURI paramInfoItem) {
      if (this.paramInfo == null) {
        this.paramInfo = new ArrayList<ParamInURI>();
      }
      this.paramInfo.add(paramInfoItem);
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
      ParamsInURI objParamsInURI = (ParamsInURI) o;
      return   Objects.equals(this.paramInfo, objParamsInURI.paramInfo);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ParamsInURI {\n");
                  sb.append("    paramInfo: ").append(toIndentedString(paramInfo)).append("\n");
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

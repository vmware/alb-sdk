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
 * The NsxtDFWTagSegmentPort is a POJO class extends AviRestResource that used for creating
 * NsxtDFWTagSegmentPort.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NsxtDFWTagSegmentPort  {
    @JsonProperty("error_string")
    private String errorString;

    @JsonProperty("path")
    private String path;

    @JsonProperty("vsuuids")
    private List<String> vsuuids;



    /**
     * This is the getter method this will return the attribute value.
     * Error message.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorString
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * This is the setter method to the attribute.
     * Error message.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param errorString set the errorString.
     */
    public void setErrorString(String  errorString) {
        this.errorString = errorString;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Nsx-t dfw segment port path.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * This is the setter method to the attribute.
     * Nsx-t dfw segment port path.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param path set the path.
     */
    public void setPath(String  path) {
        this.path = path;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Virtual services.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsuuids
     */
    public List<String> getVsuuids() {
        return vsuuids;
    }

    /**
     * This is the setter method. this will set the vsuuids
     * Virtual services.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsuuids
     */
    public void setVsuuids(List<String>  vsuuids) {
        this.vsuuids = vsuuids;
    }

    /**
     * This is the setter method this will set the vsuuids
     * Virtual services.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsuuids
     */
    public NsxtDFWTagSegmentPort addVsuuidsItem(String vsuuidsItem) {
      if (this.vsuuids == null) {
        this.vsuuids = new ArrayList<String>();
      }
      this.vsuuids.add(vsuuidsItem);
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
      NsxtDFWTagSegmentPort objNsxtDFWTagSegmentPort = (NsxtDFWTagSegmentPort) o;
      return   Objects.equals(this.path, objNsxtDFWTagSegmentPort.path)&&
  Objects.equals(this.errorString, objNsxtDFWTagSegmentPort.errorString)&&
  Objects.equals(this.vsuuids, objNsxtDFWTagSegmentPort.vsuuids);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class NsxtDFWTagSegmentPort {\n");
                  sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
                        sb.append("    path: ").append(toIndentedString(path)).append("\n");
                        sb.append("    vsuuids: ").append(toIndentedString(vsuuids)).append("\n");
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

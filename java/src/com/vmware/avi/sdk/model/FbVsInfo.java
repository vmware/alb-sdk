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
 * The FbVsInfo is a POJO class extends AviRestResource that used for creating
 * FbVsInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FbVsInfo  {
    @JsonProperty("oper_status")
    private OperationalStatus operStatus = null;



    /**
     * This is the getter method this will return the attribute value.
     * Fb snapshot data.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return operStatus
     */
    public OperationalStatus getOperStatus() {
        return operStatus;
    }

    /**
     * This is the setter method to the attribute.
     * Fb snapshot data.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param operStatus set the operStatus.
     */
    public void setOperStatus(OperationalStatus operStatus) {
        this.operStatus = operStatus;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      FbVsInfo objFbVsInfo = (FbVsInfo) o;
      return   Objects.equals(this.operStatus, objFbVsInfo.operStatus);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FbVsInfo {\n");
                  sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
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

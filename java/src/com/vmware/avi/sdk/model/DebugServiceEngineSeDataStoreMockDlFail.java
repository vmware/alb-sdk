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
 * The DebugServiceEngineSeDataStoreMockDlFail is a POJO class extends AviRestResource that used for creating
 * DebugServiceEngineSeDataStoreMockDlFail.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DebugServiceEngineSeDataStoreMockDlFail  {
    @JsonProperty("is_sedatastore_update_rpc")
    private Boolean isSedatastoreUpdateRpc;

    @JsonProperty("object_type")
    private String objectType;



    /**
     * This is the getter method this will return the attribute value.
     * Se datastore notification rpc type to be failed.
     * Set true for update and false for create.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return isSedatastoreUpdateRpc
     */
    public Boolean getIsSedatastoreUpdateRpc() {
        return isSedatastoreUpdateRpc;
    }

    /**
     * This is the setter method to the attribute.
     * Se datastore notification rpc type to be failed.
     * Set true for update and false for create.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param isSedatastoreUpdateRpc set the isSedatastoreUpdateRpc.
     */
    public void setIsSedatastoreUpdateRpc(Boolean  isSedatastoreUpdateRpc) {
        this.isSedatastoreUpdateRpc = isSedatastoreUpdateRpc;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Incoming stream response object type to be failed.
     * Eg  'virtualservicese', 'pool', 'fileobject', etc.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objectType
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * This is the setter method to the attribute.
     * Incoming stream response object type to be failed.
     * Eg  'virtualservicese', 'pool', 'fileobject', etc.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param objectType set the objectType.
     */
    public void setObjectType(String  objectType) {
        this.objectType = objectType;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DebugServiceEngineSeDataStoreMockDlFail objDebugServiceEngineSeDataStoreMockDlFail = (DebugServiceEngineSeDataStoreMockDlFail) o;
      return   Objects.equals(this.objectType, objDebugServiceEngineSeDataStoreMockDlFail.objectType)&&
  Objects.equals(this.isSedatastoreUpdateRpc, objDebugServiceEngineSeDataStoreMockDlFail.isSedatastoreUpdateRpc);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DebugServiceEngineSeDataStoreMockDlFail {\n");
                  sb.append("    isSedatastoreUpdateRpc: ").append(toIndentedString(isSedatastoreUpdateRpc)).append("\n");
                        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
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

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
 * The VcenterDatastore is a POJO class extends AviRestResource that used for creating
 * VcenterDatastore.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VcenterDatastore  {
    @JsonProperty("datastore_name")
    private String datastoreName;

    @JsonProperty("managed_object_id")
    private String managedObjectId;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return datastoreName
     */
    public String getDatastoreName() {
        return datastoreName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param datastoreName set the datastoreName.
     */
    public void setDatastoreName(String  datastoreName) {
        this.datastoreName = datastoreName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Will be used by default, if not set fallback to datastore_name.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return managedObjectId
     */
    public String getManagedObjectId() {
        return managedObjectId;
    }

    /**
     * This is the setter method to the attribute.
     * Will be used by default, if not set fallback to datastore_name.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param managedObjectId set the managedObjectId.
     */
    public void setManagedObjectId(String  managedObjectId) {
        this.managedObjectId = managedObjectId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VcenterDatastore objVcenterDatastore = (VcenterDatastore) o;
      return   Objects.equals(this.datastoreName, objVcenterDatastore.datastoreName)&&
  Objects.equals(this.managedObjectId, objVcenterDatastore.managedObjectId);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VcenterDatastore {\n");
                  sb.append("    datastoreName: ").append(toIndentedString(datastoreName)).append("\n");
                        sb.append("    managedObjectId: ").append(toIndentedString(managedObjectId)).append("\n");
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

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
 * The AZDatastore is a POJO class extends AviRestResource that used for creating
 * AZDatastore.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AZDatastore  {
    @JsonProperty("ds_ids")
    private List<String> dsIds;

    @JsonProperty("include")
    private Boolean include = false;

    @JsonProperty("vcenter_ref")
    private String vcenterRef;


    /**
     * This is the getter method this will return the attribute value.
     * List of managed object id of datastores.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dsIds
     */
    public List<String> getDsIds() {
        return dsIds;
    }

    /**
     * This is the setter method. this will set the dsIds
     * List of managed object id of datastores.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dsIds
     */
    public void setDsIds(List<String>  dsIds) {
        this.dsIds = dsIds;
    }

    /**
     * This is the setter method this will set the dsIds
     * List of managed object id of datastores.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dsIds
     */
    public AZDatastore addDsIdsItem(String dsIdsItem) {
      if (this.dsIds == null) {
        this.dsIds = new ArrayList<String>();
      }
      this.dsIds.add(dsIdsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Include or exclude the datastores from the list.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return include
     */
    public Boolean getInclude() {
        return include;
    }

    /**
     * This is the setter method to the attribute.
     * Include or exclude the datastores from the list.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param include set the include.
     */
    public void setInclude(Boolean  include) {
        this.include = include;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vcenter id of the datastores.
     * It is a reference to an object of type vcenterserver.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterRef
     */
    public String getVcenterRef() {
        return vcenterRef;
    }

    /**
     * This is the setter method to the attribute.
     * Vcenter id of the datastores.
     * It is a reference to an object of type vcenterserver.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterRef set the vcenterRef.
     */
    public void setVcenterRef(String  vcenterRef) {
        this.vcenterRef = vcenterRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      AZDatastore objAZDatastore = (AZDatastore) o;
      return   Objects.equals(this.dsIds, objAZDatastore.dsIds)&&
  Objects.equals(this.include, objAZDatastore.include)&&
  Objects.equals(this.vcenterRef, objAZDatastore.vcenterRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AZDatastore {\n");
                  sb.append("    dsIds: ").append(toIndentedString(dsIds)).append("\n");
                        sb.append("    include: ").append(toIndentedString(include)).append("\n");
                        sb.append("    vcenterRef: ").append(toIndentedString(vcenterRef)).append("\n");
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

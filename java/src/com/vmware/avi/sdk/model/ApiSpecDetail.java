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
 * The ApiSpecDetail is a POJO class extends AviRestResource that used for creating
 * ApiSpecDetail.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiSpecDetail  {
    @JsonProperty("path_refs")
    private List<String> pathRefs;

    @JsonProperty("schema_refs")
    private List<String> schemaRefs;

    @JsonProperty("spec_info")
    private ApiSpecInfo specInfo;


    /**
     * This is the getter method this will return the attribute value.
     * Api path uuids.
     * It is a reference to an object of type apipath.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return pathRefs
     */
    public List<String> getPathRefs() {
        return pathRefs;
    }

    /**
     * This is the setter method. this will set the pathRefs
     * Api path uuids.
     * It is a reference to an object of type apipath.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return pathRefs
     */
    public void setPathRefs(List<String>  pathRefs) {
        this.pathRefs = pathRefs;
    }

    /**
     * This is the setter method this will set the pathRefs
     * Api path uuids.
     * It is a reference to an object of type apipath.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return pathRefs
     */
    public ApiSpecDetail addPathRefsItem(String pathRefsItem) {
      if (this.pathRefs == null) {
        this.pathRefs = new ArrayList<String>();
      }
      this.pathRefs.add(pathRefsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Api schema uuids.
     * It is a reference to an object of type apischema.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return schemaRefs
     */
    public List<String> getSchemaRefs() {
        return schemaRefs;
    }

    /**
     * This is the setter method. this will set the schemaRefs
     * Api schema uuids.
     * It is a reference to an object of type apischema.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return schemaRefs
     */
    public void setSchemaRefs(List<String>  schemaRefs) {
        this.schemaRefs = schemaRefs;
    }

    /**
     * This is the setter method this will set the schemaRefs
     * Api schema uuids.
     * It is a reference to an object of type apischema.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return schemaRefs
     */
    public ApiSpecDetail addSchemaRefsItem(String schemaRefsItem) {
      if (this.schemaRefs == null) {
        this.schemaRefs = new ArrayList<String>();
      }
      this.schemaRefs.add(schemaRefsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Api specification information.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return specInfo
     */
    public ApiSpecInfo getSpecInfo() {
        return specInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Api specification information.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param specInfo set the specInfo.
     */
    public void setSpecInfo(ApiSpecInfo specInfo) {
        this.specInfo = specInfo;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApiSpecDetail objApiSpecDetail = (ApiSpecDetail) o;
      return   Objects.equals(this.specInfo, objApiSpecDetail.specInfo)&&
  Objects.equals(this.pathRefs, objApiSpecDetail.pathRefs)&&
  Objects.equals(this.schemaRefs, objApiSpecDetail.schemaRefs);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApiSpecDetail {\n");
                  sb.append("    pathRefs: ").append(toIndentedString(pathRefs)).append("\n");
                        sb.append("    schemaRefs: ").append(toIndentedString(schemaRefs)).append("\n");
                        sb.append("    specInfo: ").append(toIndentedString(specInfo)).append("\n");
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

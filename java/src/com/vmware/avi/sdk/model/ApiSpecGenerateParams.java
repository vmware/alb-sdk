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
 * The ApiSpecGenerateParams is a POJO class extends AviRestResource that used for creating
 * ApiSpecGenerateParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiSpecGenerateParams  {
    @JsonProperty("api_policy_ref")
    private String apiPolicyRef;

    @JsonProperty("file_object_ref")
    private String fileObjectRef;

    @JsonProperty("format")
    private String format = "API_SPEC_GENERATE_FORMAT_JSON";

    @JsonProperty("name")
    private String name;



    /**
     * This is the getter method this will return the attribute value.
     * Api policy to generate api spec from.
     * It is a reference to an object of type apipolicy.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return apiPolicyRef
     */
    public String getApiPolicyRef() {
        return apiPolicyRef;
    }

    /**
     * This is the setter method to the attribute.
     * Api policy to generate api spec from.
     * It is a reference to an object of type apipolicy.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param apiPolicyRef set the apiPolicyRef.
     */
    public void setApiPolicyRef(String  apiPolicyRef) {
        this.apiPolicyRef = apiPolicyRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * File object to generate api spec from.
     * It is a reference to an object of type fileobject.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fileObjectRef
     */
    public String getFileObjectRef() {
        return fileObjectRef;
    }

    /**
     * This is the setter method to the attribute.
     * File object to generate api spec from.
     * It is a reference to an object of type fileobject.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param fileObjectRef set the fileObjectRef.
     */
    public void setFileObjectRef(String  fileObjectRef) {
        this.fileObjectRef = fileObjectRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Output format  json (default) or yaml.
     * Enum options - API_SPEC_GENERATE_FORMAT_JSON, API_SPEC_GENERATE_FORMAT_YAML.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_SPEC_GENERATE_FORMAT_JSON".
     * @return format
     */
    public String getFormat() {
        return format;
    }

    /**
     * This is the setter method to the attribute.
     * Output format  json (default) or yaml.
     * Enum options - API_SPEC_GENERATE_FORMAT_JSON, API_SPEC_GENERATE_FORMAT_YAML.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_SPEC_GENERATE_FORMAT_JSON".
     * @param format set the format.
     */
    public void setFormat(String  format) {
        this.format = format;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name for the spec generation object.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name for the spec generation object.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApiSpecGenerateParams objApiSpecGenerateParams = (ApiSpecGenerateParams) o;
      return   Objects.equals(this.name, objApiSpecGenerateParams.name)&&
  Objects.equals(this.apiPolicyRef, objApiSpecGenerateParams.apiPolicyRef)&&
  Objects.equals(this.fileObjectRef, objApiSpecGenerateParams.fileObjectRef)&&
  Objects.equals(this.format, objApiSpecGenerateParams.format);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApiSpecGenerateParams {\n");
                  sb.append("    apiPolicyRef: ").append(toIndentedString(apiPolicyRef)).append("\n");
                        sb.append("    fileObjectRef: ").append(toIndentedString(fileObjectRef)).append("\n");
                        sb.append("    format: ").append(toIndentedString(format)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

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
 * The ApiContentTypeMapping is a POJO class extends AviRestResource that used for creating
 * ApiContentTypeMapping.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiContentTypeMapping  {
    @JsonProperty("content_type")
    private String contentType;

    @JsonProperty("schema")
    private ApiSimpleSchemaDescription schema;



    /**
     * This is the getter method this will return the attribute value.
     * The content type of the request/response.
     * This can be a pattern like application/json* for request.
     * For response, it is the content type of the response.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return contentType
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * This is the setter method to the attribute.
     * The content type of the request/response.
     * This can be a pattern like application/json* for request.
     * For response, it is the content type of the response.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param contentType set the contentType.
     */
    public void setContentType(String  contentType) {
        this.contentType = contentType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The schema for the request/response body.
     * Type must be schema_type_undefined (no validation) or schema_type_reference pointing to an apischema (object and array bodies are modeled as
     * references).
     * Other apischemadatatype values are not allowed for content type mappings.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return schema
     */
    public ApiSimpleSchemaDescription getSchema() {
        return schema;
    }

    /**
     * This is the setter method to the attribute.
     * The schema for the request/response body.
     * Type must be schema_type_undefined (no validation) or schema_type_reference pointing to an apischema (object and array bodies are modeled as
     * references).
     * Other apischemadatatype values are not allowed for content type mappings.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param schema set the schema.
     */
    public void setSchema(ApiSimpleSchemaDescription schema) {
        this.schema = schema;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApiContentTypeMapping objApiContentTypeMapping = (ApiContentTypeMapping) o;
      return   Objects.equals(this.contentType, objApiContentTypeMapping.contentType)&&
  Objects.equals(this.schema, objApiContentTypeMapping.schema);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApiContentTypeMapping {\n");
                  sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
                        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

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
 * The ApiObjectProperties is a POJO class extends AviRestResource that used for creating
 * ApiObjectProperties.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiObjectProperties  {
    @JsonProperty("access_mode")
    private String accessMode = "API_PROPERTY_ACCESS_READ_WRITE";

    @JsonProperty("deprecated")
    private Boolean deprecated;

    @JsonProperty("name")
    private String name;

    @JsonProperty("nullable")
    private Boolean nullable;

    @JsonProperty("required")
    private Boolean required;

    @JsonProperty("schema")
    private ApiSimpleSchemaDescription schema;



    /**
     * This is the getter method this will return the attribute value.
     * Access mode for this property.
     * Determines whether the property is read-write, read-only, or write-only.
     * Enum options - API_PROPERTY_ACCESS_READ_WRITE, API_PROPERTY_ACCESS_READ_ONLY, API_PROPERTY_ACCESS_WRITE_ONLY.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_PROPERTY_ACCESS_READ_WRITE".
     * @return accessMode
     */
    public String getAccessMode() {
        return accessMode;
    }

    /**
     * This is the setter method to the attribute.
     * Access mode for this property.
     * Determines whether the property is read-write, read-only, or write-only.
     * Enum options - API_PROPERTY_ACCESS_READ_WRITE, API_PROPERTY_ACCESS_READ_ONLY, API_PROPERTY_ACCESS_WRITE_ONLY.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_PROPERTY_ACCESS_READ_WRITE".
     * @param accessMode set the accessMode.
     */
    public void setAccessMode(String  accessMode) {
        this.accessMode = accessMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Marks this property as deprecated.
     * Requests containing this property are treated as a schema violation.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return deprecated
     */
    public Boolean getDeprecated() {
        return deprecated;
    }

    /**
     * This is the setter method to the attribute.
     * Marks this property as deprecated.
     * Requests containing this property are treated as a schema violation.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param deprecated set the deprecated.
     */
    public void setDeprecated(Boolean  deprecated) {
        this.deprecated = deprecated;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Property name.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Property name.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * When true, this property accepts a null value in addition to its declared type.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nullable
     */
    public Boolean getNullable() {
        return nullable;
    }

    /**
     * This is the setter method to the attribute.
     * When true, this property accepts a null value in addition to its declared type.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nullable set the nullable.
     */
    public void setNullable(Boolean  nullable) {
        this.nullable = nullable;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Marks this property as required within its parent object schema.
     * A request body object missing this property is treated as a violation.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    /**
     * This is the setter method to the attribute.
     * Marks this property as required within its parent object schema.
     * A request body object missing this property is treated as a violation.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param required set the required.
     */
    public void setRequired(Boolean  required) {
        this.required = required;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Schema description for this property, including type and validation rules.
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
     * Schema description for this property, including type and validation rules.
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
      ApiObjectProperties objApiObjectProperties = (ApiObjectProperties) o;
      return   Objects.equals(this.name, objApiObjectProperties.name)&&
  Objects.equals(this.schema, objApiObjectProperties.schema)&&
  Objects.equals(this.required, objApiObjectProperties.required)&&
  Objects.equals(this.accessMode, objApiObjectProperties.accessMode)&&
  Objects.equals(this.nullable, objApiObjectProperties.nullable)&&
  Objects.equals(this.deprecated, objApiObjectProperties.deprecated);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApiObjectProperties {\n");
                  sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
                        sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    nullable: ").append(toIndentedString(nullable)).append("\n");
                        sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

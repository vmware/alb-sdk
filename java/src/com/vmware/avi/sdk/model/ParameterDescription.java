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
 * The ParameterDescription is a POJO class extends AviRestResource that used for creating
 * ParameterDescription.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParameterDescription  {
    @JsonProperty("allow_empty_value")
    private Boolean allowEmptyValue = true;

    @JsonProperty("deprecated")
    private Boolean deprecated = false;

    @JsonProperty("name")
    private String name;

    @JsonProperty("required")
    private Boolean required = false;

    @JsonProperty("schema")
    private ApiSimpleSchemaDescription schema;



    /**
     * This is the getter method this will return the attribute value.
     * When false, a parameter present with an empty value (e.g.
     * ?foo=) is treated as a schema violation.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return allowEmptyValue
     */
    public Boolean getAllowEmptyValue() {
        return allowEmptyValue;
    }

    /**
     * This is the setter method to the attribute.
     * When false, a parameter present with an empty value (e.g.
     * ?foo=) is treated as a schema violation.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param allowEmptyValue set the allowEmptyValue.
     */
    public void setAllowEmptyValue(Boolean  allowEmptyValue) {
        this.allowEmptyValue = allowEmptyValue;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Marks this parameter as deprecated.
     * When a deprecated parameter is received in a request, it is treated as a schema violation and will be learned but not logged.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return deprecated
     */
    public Boolean getDeprecated() {
        return deprecated;
    }

    /**
     * This is the setter method to the attribute.
     * Marks this parameter as deprecated.
     * When a deprecated parameter is received in a request, it is treated as a schema violation and will be learned but not logged.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param deprecated set the deprecated.
     */
    public void setDeprecated(Boolean  deprecated) {
        this.deprecated = deprecated;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the parameter.
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
     * Name of the parameter.
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
     * Marks this parameter as mandatory.
     * A missing parameter is treated as a violation; enforcement depends on the missing-mandatory action configured for its location (query or header).
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    /**
     * This is the setter method to the attribute.
     * Marks this parameter as mandatory.
     * A missing parameter is treated as a violation; enforcement depends on the missing-mandatory action configured for its location (query or header).
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param required set the required.
     */
    public void setRequired(Boolean  required) {
        this.required = required;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Schema description for this parameter.
     * If the schema is not known, use schema_type_undefined.
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
     * Schema description for this parameter.
     * If the schema is not known, use schema_type_undefined.
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
      ParameterDescription objParameterDescription = (ParameterDescription) o;
      return   Objects.equals(this.name, objParameterDescription.name)&&
  Objects.equals(this.required, objParameterDescription.required)&&
  Objects.equals(this.deprecated, objParameterDescription.deprecated)&&
  Objects.equals(this.allowEmptyValue, objParameterDescription.allowEmptyValue)&&
  Objects.equals(this.schema, objParameterDescription.schema);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ParameterDescription {\n");
                  sb.append("    allowEmptyValue: ").append(toIndentedString(allowEmptyValue)).append("\n");
                        sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

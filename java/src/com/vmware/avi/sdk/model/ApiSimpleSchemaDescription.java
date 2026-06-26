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
 * The ApiSimpleSchemaDescription is a POJO class extends AviRestResource that used for creating
 * ApiSimpleSchemaDescription.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiSimpleSchemaDescription  {
    @JsonProperty("max_value")
    private Float maxValue;

    @JsonProperty("min_value")
    private Float minValue;

    @JsonProperty("schema_ref")
    private String schemaRef;

    @JsonProperty("string_enum_values")
    private List<String> stringEnumValues;

    @JsonProperty("string_format")
    private String stringFormat;

    @JsonProperty("string_max_length")
    private Integer stringMaxLength;

    @JsonProperty("string_min_length")
    private Integer stringMinLength;

    @JsonProperty("string_pattern")
    private String stringPattern;

    @JsonProperty("type")
    private String type;



    /**
     * This is the getter method this will return the attribute value.
     * Maximum allowed value for integer and number types (inclusive by default).
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return maxValue
     */
    public Float getMaxValue() {
        return maxValue;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum allowed value for integer and number types (inclusive by default).
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param maxValue set the maxValue.
     */
    public void setMaxValue(Float  maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum allowed value for integer and number types (inclusive by default).
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return minValue
     */
    public Float getMinValue() {
        return minValue;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum allowed value for integer and number types (inclusive by default).
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param minValue set the minValue.
     */
    public void setMinValue(Float  minValue) {
        this.minValue = minValue;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the referenced apischema object.
     * Used when type is schema_type_reference, equivalent to $ref in openapi.
     * It is a reference to an object of type apischema.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return schemaRef
     */
    public String getSchemaRef() {
        return schemaRef;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the referenced apischema object.
     * Used when type is schema_type_reference, equivalent to $ref in openapi.
     * It is a reference to an object of type apischema.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param schemaRef set the schemaRef.
     */
    public void setSchemaRef(String  schemaRef) {
        this.schemaRef = schemaRef;
    }
    /**
     * This is the getter method this will return the attribute value.
     * If set, this is a list of all possible values for this string.
     * Field introduced in 32.2.1.
     * Maximum of 256 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return stringEnumValues
     */
    public List<String> getStringEnumValues() {
        return stringEnumValues;
    }

    /**
     * This is the setter method. this will set the stringEnumValues
     * If set, this is a list of all possible values for this string.
     * Field introduced in 32.2.1.
     * Maximum of 256 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return stringEnumValues
     */
    public void setStringEnumValues(List<String>  stringEnumValues) {
        this.stringEnumValues = stringEnumValues;
    }

    /**
     * This is the setter method this will set the stringEnumValues
     * If set, this is a list of all possible values for this string.
     * Field introduced in 32.2.1.
     * Maximum of 256 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return stringEnumValues
     */
    public ApiSimpleSchemaDescription addStringEnumValuesItem(String stringEnumValuesItem) {
      if (this.stringEnumValues == null) {
        this.stringEnumValues = new ArrayList<String>();
      }
      this.stringEnumValues.add(stringEnumValuesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Predefined string formats (e.g., email, uri, uuid).
     * Enum options - API_STRING_FORMAT_NONE, API_STRING_FORMAT_ENUM, API_STRING_FORMAT_PATTERN, API_STRING_FORMAT_UUID, API_STRING_FORMAT_IPV4,
     * API_STRING_FORMAT_IPV6, API_STRING_FORMAT_URI, API_STRING_FORMAT_URL, API_STRING_FORMAT_DATE, API_STRING_FORMAT_DATE_TIME,
     * API_STRING_FORMAT_EMAIL, API_STRING_FORMAT_HOSTNAME, API_STRING_FORMAT_PASSWORD, API_STRING_FORMAT_BINARY, API_STRING_FORMAT_BYTE,
     * API_STRING_FORMAT_TIME, API_STRING_FORMAT_DURATION, API_STRING_FORMAT_URI_REFERENCE, API_STRING_FORMAT_URI_TEMPLATE,
     * API_STRING_FORMAT_JSON_POINTER...
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return stringFormat
     */
    public String getStringFormat() {
        return stringFormat;
    }

    /**
     * This is the setter method to the attribute.
     * Predefined string formats (e.g., email, uri, uuid).
     * Enum options - API_STRING_FORMAT_NONE, API_STRING_FORMAT_ENUM, API_STRING_FORMAT_PATTERN, API_STRING_FORMAT_UUID, API_STRING_FORMAT_IPV4,
     * API_STRING_FORMAT_IPV6, API_STRING_FORMAT_URI, API_STRING_FORMAT_URL, API_STRING_FORMAT_DATE, API_STRING_FORMAT_DATE_TIME,
     * API_STRING_FORMAT_EMAIL, API_STRING_FORMAT_HOSTNAME, API_STRING_FORMAT_PASSWORD, API_STRING_FORMAT_BINARY, API_STRING_FORMAT_BYTE,
     * API_STRING_FORMAT_TIME, API_STRING_FORMAT_DURATION, API_STRING_FORMAT_URI_REFERENCE, API_STRING_FORMAT_URI_TEMPLATE,
     * API_STRING_FORMAT_JSON_POINTER...
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param stringFormat set the stringFormat.
     */
    public void setStringFormat(String  stringFormat) {
        this.stringFormat = stringFormat;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum allowed length for string values.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return stringMaxLength
     */
    public Integer getStringMaxLength() {
        return stringMaxLength;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum allowed length for string values.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param stringMaxLength set the stringMaxLength.
     */
    public void setStringMaxLength(Integer  stringMaxLength) {
        this.stringMaxLength = stringMaxLength;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum allowed length for string values.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return stringMinLength
     */
    public Integer getStringMinLength() {
        return stringMinLength;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum allowed length for string values.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param stringMinLength set the stringMinLength.
     */
    public void setStringMinLength(Integer  stringMinLength) {
        this.stringMinLength = stringMinLength;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If set, this is a regular expression which must match the string.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return stringPattern
     */
    public String getStringPattern() {
        return stringPattern;
    }

    /**
     * This is the setter method to the attribute.
     * If set, this is a regular expression which must match the string.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param stringPattern set the stringPattern.
     */
    public void setStringPattern(String  stringPattern) {
        this.stringPattern = stringPattern;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The data type for this schema element.
     * Enum options - SCHEMA_TYPE_UNDEFINED, SCHEMA_TYPE_STRING, SCHEMA_TYPE_INTEGER, SCHEMA_TYPE_NUMBER, SCHEMA_TYPE_BOOLEAN, SCHEMA_TYPE_NULL,
     * SCHEMA_TYPE_ARRAY, SCHEMA_TYPE_OBJECT, SCHEMA_TYPE_REFERENCE, SCHEMA_TYPE_ONE_OF, SCHEMA_TYPE_ALL_OF, SCHEMA_TYPE_ANY_OF.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * The data type for this schema element.
     * Enum options - SCHEMA_TYPE_UNDEFINED, SCHEMA_TYPE_STRING, SCHEMA_TYPE_INTEGER, SCHEMA_TYPE_NUMBER, SCHEMA_TYPE_BOOLEAN, SCHEMA_TYPE_NULL,
     * SCHEMA_TYPE_ARRAY, SCHEMA_TYPE_OBJECT, SCHEMA_TYPE_REFERENCE, SCHEMA_TYPE_ONE_OF, SCHEMA_TYPE_ALL_OF, SCHEMA_TYPE_ANY_OF.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApiSimpleSchemaDescription objApiSimpleSchemaDescription = (ApiSimpleSchemaDescription) o;
      return   Objects.equals(this.type, objApiSimpleSchemaDescription.type)&&
  Objects.equals(this.stringMinLength, objApiSimpleSchemaDescription.stringMinLength)&&
  Objects.equals(this.stringMaxLength, objApiSimpleSchemaDescription.stringMaxLength)&&
  Objects.equals(this.stringFormat, objApiSimpleSchemaDescription.stringFormat)&&
  Objects.equals(this.stringEnumValues, objApiSimpleSchemaDescription.stringEnumValues)&&
  Objects.equals(this.stringPattern, objApiSimpleSchemaDescription.stringPattern)&&
  Objects.equals(this.minValue, objApiSimpleSchemaDescription.minValue)&&
  Objects.equals(this.maxValue, objApiSimpleSchemaDescription.maxValue)&&
  Objects.equals(this.schemaRef, objApiSimpleSchemaDescription.schemaRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApiSimpleSchemaDescription {\n");
                  sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
                        sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
                        sb.append("    schemaRef: ").append(toIndentedString(schemaRef)).append("\n");
                        sb.append("    stringEnumValues: ").append(toIndentedString(stringEnumValues)).append("\n");
                        sb.append("    stringFormat: ").append(toIndentedString(stringFormat)).append("\n");
                        sb.append("    stringMaxLength: ").append(toIndentedString(stringMaxLength)).append("\n");
                        sb.append("    stringMinLength: ").append(toIndentedString(stringMinLength)).append("\n");
                        sb.append("    stringPattern: ").append(toIndentedString(stringPattern)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

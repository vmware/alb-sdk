/*
 * Avi avi_global_spec Object API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 20.1.1
 * Contact: support@avinetworks.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.avi.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * AuthTacacsPlusAttributeValuePair
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class AuthTacacsPlusAttributeValuePair {
  @JsonProperty("mandatory")
  private Boolean mandatory = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  public AuthTacacsPlusAttributeValuePair mandatory(Boolean mandatory) {
    this.mandatory = mandatory;
    return this;
  }

   /**
   * mandatory.
   * @return mandatory
  **/
  @Schema(description = "mandatory.")
  public Boolean isMandatory() {
    return mandatory;
  }

  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }

  public AuthTacacsPlusAttributeValuePair name(String name) {
    this.name = name;
    return this;
  }

   /**
   * attribute name.
   * @return name
  **/
  @Schema(description = "attribute name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AuthTacacsPlusAttributeValuePair value(String value) {
    this.value = value;
    return this;
  }

   /**
   * attribute value.
   * @return value
  **/
  @Schema(description = "attribute value.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthTacacsPlusAttributeValuePair authTacacsPlusAttributeValuePair = (AuthTacacsPlusAttributeValuePair) o;
    return Objects.equals(this.mandatory, authTacacsPlusAttributeValuePair.mandatory) &&
        Objects.equals(this.name, authTacacsPlusAttributeValuePair.name) &&
        Objects.equals(this.value, authTacacsPlusAttributeValuePair.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandatory, name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthTacacsPlusAttributeValuePair {\n");
    
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

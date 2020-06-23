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
 * AlertTestSyslogSnmpParams
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class AlertTestSyslogSnmpParams {
  @JsonProperty("text")
  private String text = null;

  @JsonProperty("uuid")
  private String uuid = null;

  public AlertTestSyslogSnmpParams text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The contents of the Syslog message/SNMP Trap contents.
   * @return text
  **/
  @Schema(required = true, description = "The contents of the Syslog message/SNMP Trap contents.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public AlertTestSyslogSnmpParams uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @Schema(description = "Unique object identifier of the object.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertTestSyslogSnmpParams alertTestSyslogSnmpParams = (AlertTestSyslogSnmpParams) o;
    return Objects.equals(this.text, alertTestSyslogSnmpParams.text) &&
        Objects.equals(this.uuid, alertTestSyslogSnmpParams.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertTestSyslogSnmpParams {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

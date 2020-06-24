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
import com.vmware.avi.sdk.model.SSLClientRequestHeader;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * SSLClientCertificateAction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class SSLClientCertificateAction {
  @JsonProperty("close_connection")
  private Boolean closeConnection = null;

  @JsonProperty("headers")
  private List<SSLClientRequestHeader> headers = null;

  public SSLClientCertificateAction closeConnection(Boolean closeConnection) {
    this.closeConnection = closeConnection;
    return this;
  }

   /**
   * Placeholder for description of property close_connection of obj type SSLClientCertificateAction field type str  type boolean
   * @return closeConnection
  **/
  @Schema(description = "Placeholder for description of property close_connection of obj type SSLClientCertificateAction field type str  type boolean")
  public Boolean isCloseConnection() {
    return closeConnection;
  }

  public void setCloseConnection(Boolean closeConnection) {
    this.closeConnection = closeConnection;
  }

  public SSLClientCertificateAction headers(List<SSLClientRequestHeader> headers) {
    this.headers = headers;
    return this;
  }

  public SSLClientCertificateAction addHeadersItem(SSLClientRequestHeader headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<SSLClientRequestHeader>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Placeholder for description of property headers of obj type SSLClientCertificateAction field type str  type object
   * @return headers
  **/
  @Schema(description = "Placeholder for description of property headers of obj type SSLClientCertificateAction field type str  type object")
  public List<SSLClientRequestHeader> getHeaders() {
    return headers;
  }

  public void setHeaders(List<SSLClientRequestHeader> headers) {
    this.headers = headers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSLClientCertificateAction ssLClientCertificateAction = (SSLClientCertificateAction) o;
    return Objects.equals(this.closeConnection, ssLClientCertificateAction.closeConnection) &&
        Objects.equals(this.headers, ssLClientCertificateAction.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closeConnection, headers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSLClientCertificateAction {\n");
    
    sb.append("    closeConnection: ").append(toIndentedString(closeConnection)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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

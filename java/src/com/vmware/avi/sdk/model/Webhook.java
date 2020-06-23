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
 * Webhook
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class Webhook {
  @JsonProperty("_last_modified")
  private String _lastModified = null;

  @JsonProperty("callback_url")
  private String callbackUrl = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("verification_token")
  private String verificationToken = null;

   /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return _lastModified
  **/
  @Schema(description = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")
  public String getLastModified() {
    return _lastModified;
  }

  public Webhook callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Callback URL for the Webhook. Field introduced in 17.1.1.
   * @return callbackUrl
  **/
  @Schema(description = "Callback URL for the Webhook. Field introduced in 17.1.1.")
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  public Webhook description(String description) {
    this.description = description;
    return this;
  }

   /**
   *  Field introduced in 17.1.1.
   * @return description
  **/
  @Schema(description = " Field introduced in 17.1.1.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Webhook name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the webhook profile. Field introduced in 17.1.1.
   * @return name
  **/
  @Schema(required = true, description = "The name of the webhook profile. Field introduced in 17.1.1.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Webhook tenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
    return this;
  }

   /**
   *  It is a reference to an object of type Tenant. Field introduced in 17.1.1.
   * @return tenantRef
  **/
  @Schema(description = " It is a reference to an object of type Tenant. Field introduced in 17.1.1.")
  public String getTenantRef() {
    return tenantRef;
  }

  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

   /**
   * url
   * @return url
  **/
  @Schema(description = "url")
  public String getUrl() {
    return url;
  }

  public Webhook uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID of the webhook profile. Field introduced in 17.1.1.
   * @return uuid
  **/
  @Schema(description = "UUID of the webhook profile. Field introduced in 17.1.1.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Webhook verificationToken(String verificationToken) {
    this.verificationToken = verificationToken;
    return this;
  }

   /**
   * Verification token sent back with the callback asquery parameters. Field introduced in 17.1.1.
   * @return verificationToken
  **/
  @Schema(description = "Verification token sent back with the callback asquery parameters. Field introduced in 17.1.1.")
  public String getVerificationToken() {
    return verificationToken;
  }

  public void setVerificationToken(String verificationToken) {
    this.verificationToken = verificationToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this._lastModified, webhook._lastModified) &&
        Objects.equals(this.callbackUrl, webhook.callbackUrl) &&
        Objects.equals(this.description, webhook.description) &&
        Objects.equals(this.name, webhook.name) &&
        Objects.equals(this.tenantRef, webhook.tenantRef) &&
        Objects.equals(this.url, webhook.url) &&
        Objects.equals(this.uuid, webhook.uuid) &&
        Objects.equals(this.verificationToken, webhook.verificationToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_lastModified, callbackUrl, description, name, tenantRef, url, uuid, verificationToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    
    sb.append("    _lastModified: ").append(toIndentedString(_lastModified)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    verificationToken: ").append(toIndentedString(verificationToken)).append("\n");
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

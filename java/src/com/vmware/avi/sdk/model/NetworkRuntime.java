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
import com.vmware.avi.sdk.model.SubnetRuntime;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * NetworkRuntime
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class NetworkRuntime {
  @JsonProperty("_last_modified")
  private String _lastModified = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("se_uuid")
  private List<String> seUuid = null;

  @JsonProperty("subnet_runtime")
  private List<SubnetRuntime> subnetRuntime = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

   /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return _lastModified
  **/
  @Schema(description = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")
  public String getLastModified() {
    return _lastModified;
  }

  public NetworkRuntime name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the object.
   * @return name
  **/
  @Schema(required = true, description = "Name of the object.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NetworkRuntime seUuid(List<String> seUuid) {
    this.seUuid = seUuid;
    return this;
  }

  public NetworkRuntime addSeUuidItem(String seUuidItem) {
    if (this.seUuid == null) {
      this.seUuid = new ArrayList<String>();
    }
    this.seUuid.add(seUuidItem);
    return this;
  }

   /**
   * Unique object identifier of se.
   * @return seUuid
  **/
  @Schema(description = "Unique object identifier of se.")
  public List<String> getSeUuid() {
    return seUuid;
  }

  public void setSeUuid(List<String> seUuid) {
    this.seUuid = seUuid;
  }

  public NetworkRuntime subnetRuntime(List<SubnetRuntime> subnetRuntime) {
    this.subnetRuntime = subnetRuntime;
    return this;
  }

  public NetworkRuntime addSubnetRuntimeItem(SubnetRuntime subnetRuntimeItem) {
    if (this.subnetRuntime == null) {
      this.subnetRuntime = new ArrayList<SubnetRuntime>();
    }
    this.subnetRuntime.add(subnetRuntimeItem);
    return this;
  }

   /**
   * Placeholder for description of property subnet_runtime of obj type NetworkRuntime field type str  type object
   * @return subnetRuntime
  **/
  @Schema(description = "Placeholder for description of property subnet_runtime of obj type NetworkRuntime field type str  type object")
  public List<SubnetRuntime> getSubnetRuntime() {
    return subnetRuntime;
  }

  public void setSubnetRuntime(List<SubnetRuntime> subnetRuntime) {
    this.subnetRuntime = subnetRuntime;
  }

  public NetworkRuntime tenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
    return this;
  }

   /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @Schema(description = " It is a reference to an object of type Tenant.")
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

  public NetworkRuntime uuid(String uuid) {
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
    NetworkRuntime networkRuntime = (NetworkRuntime) o;
    return Objects.equals(this._lastModified, networkRuntime._lastModified) &&
        Objects.equals(this.name, networkRuntime.name) &&
        Objects.equals(this.seUuid, networkRuntime.seUuid) &&
        Objects.equals(this.subnetRuntime, networkRuntime.subnetRuntime) &&
        Objects.equals(this.tenantRef, networkRuntime.tenantRef) &&
        Objects.equals(this.url, networkRuntime.url) &&
        Objects.equals(this.uuid, networkRuntime.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_lastModified, name, seUuid, subnetRuntime, tenantRef, url, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkRuntime {\n");
    
    sb.append("    _lastModified: ").append(toIndentedString(_lastModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
    sb.append("    subnetRuntime: ").append(toIndentedString(subnetRuntime)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

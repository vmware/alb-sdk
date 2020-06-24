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
import com.vmware.avi.sdk.model.WafConfig;
import com.vmware.avi.sdk.model.WafDataFile;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * WafProfile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class WafProfile {
  @JsonProperty("_last_modified")
  private String _lastModified = null;

  @JsonProperty("config")
  private WafConfig config = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("files")
  private List<WafDataFile> files = null;

  @JsonProperty("name")
  private String name = null;

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

  public WafProfile config(WafConfig config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @Schema(required = true, description = "")
  public WafConfig getConfig() {
    return config;
  }

  public void setConfig(WafConfig config) {
    this.config = config;
  }

  public WafProfile description(String description) {
    this.description = description;
    return this;
  }

   /**
   *  Field introduced in 17.2.1.
   * @return description
  **/
  @Schema(description = " Field introduced in 17.2.1.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WafProfile files(List<WafDataFile> files) {
    this.files = files;
    return this;
  }

  public WafProfile addFilesItem(WafDataFile filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<WafDataFile>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * List of Data Files Used for WAF Rules. Field introduced in 17.2.1.
   * @return files
  **/
  @Schema(description = "List of Data Files Used for WAF Rules. Field introduced in 17.2.1.")
  public List<WafDataFile> getFiles() {
    return files;
  }

  public void setFiles(List<WafDataFile> files) {
    this.files = files;
  }

  public WafProfile name(String name) {
    this.name = name;
    return this;
  }

   /**
   *  Field introduced in 17.2.1.
   * @return name
  **/
  @Schema(required = true, description = " Field introduced in 17.2.1.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WafProfile tenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
    return this;
  }

   /**
   *  It is a reference to an object of type Tenant. Field introduced in 17.2.1.
   * @return tenantRef
  **/
  @Schema(description = " It is a reference to an object of type Tenant. Field introduced in 17.2.1.")
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

  public WafProfile uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   *  Field introduced in 17.2.1.
   * @return uuid
  **/
  @Schema(description = " Field introduced in 17.2.1.")
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
    WafProfile wafProfile = (WafProfile) o;
    return Objects.equals(this._lastModified, wafProfile._lastModified) &&
        Objects.equals(this.config, wafProfile.config) &&
        Objects.equals(this.description, wafProfile.description) &&
        Objects.equals(this.files, wafProfile.files) &&
        Objects.equals(this.name, wafProfile.name) &&
        Objects.equals(this.tenantRef, wafProfile.tenantRef) &&
        Objects.equals(this.url, wafProfile.url) &&
        Objects.equals(this.uuid, wafProfile.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_lastModified, config, description, files, name, tenantRef, url, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WafProfile {\n");
    
    sb.append("    _lastModified: ").append(toIndentedString(_lastModified)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

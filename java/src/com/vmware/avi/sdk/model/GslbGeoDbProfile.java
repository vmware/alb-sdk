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
import com.vmware.avi.sdk.model.GslbGeoDbEntry;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * GslbGeoDbProfile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class GslbGeoDbProfile {
  @JsonProperty("_last_modified")
  private String _lastModified = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("entries")
  private List<GslbGeoDbEntry> entries = null;

  @JsonProperty("is_federated")
  private Boolean isFederated = true;

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

  public GslbGeoDbProfile description(String description) {
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

  public GslbGeoDbProfile entries(List<GslbGeoDbEntry> entries) {
    this.entries = entries;
    return this;
  }

  public GslbGeoDbProfile addEntriesItem(GslbGeoDbEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<GslbGeoDbEntry>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * List of Geodb entries. An entry can either be a geodb file or an ip address group with geo properties. . Field introduced in 17.1.1.
   * @return entries
  **/
  @Schema(description = "List of Geodb entries. An entry can either be a geodb file or an ip address group with geo properties. . Field introduced in 17.1.1.")
  public List<GslbGeoDbEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<GslbGeoDbEntry> entries) {
    this.entries = entries;
  }

  public GslbGeoDbProfile isFederated(Boolean isFederated) {
    this.isFederated = isFederated;
    return this;
  }

   /**
   * This field indicates that this object is replicated across GSLB federation. Field introduced in 17.1.3.
   * @return isFederated
  **/
  @Schema(description = "This field indicates that this object is replicated across GSLB federation. Field introduced in 17.1.3.")
  public Boolean isIsFederated() {
    return isFederated;
  }

  public void setIsFederated(Boolean isFederated) {
    this.isFederated = isFederated;
  }

  public GslbGeoDbProfile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A user-friendly name for the geodb profile. Field introduced in 17.1.1.
   * @return name
  **/
  @Schema(required = true, description = "A user-friendly name for the geodb profile. Field introduced in 17.1.1.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GslbGeoDbProfile tenantRef(String tenantRef) {
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

  public GslbGeoDbProfile uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID of the geodb profile. Field introduced in 17.1.1.
   * @return uuid
  **/
  @Schema(description = "UUID of the geodb profile. Field introduced in 17.1.1.")
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
    GslbGeoDbProfile gslbGeoDbProfile = (GslbGeoDbProfile) o;
    return Objects.equals(this._lastModified, gslbGeoDbProfile._lastModified) &&
        Objects.equals(this.description, gslbGeoDbProfile.description) &&
        Objects.equals(this.entries, gslbGeoDbProfile.entries) &&
        Objects.equals(this.isFederated, gslbGeoDbProfile.isFederated) &&
        Objects.equals(this.name, gslbGeoDbProfile.name) &&
        Objects.equals(this.tenantRef, gslbGeoDbProfile.tenantRef) &&
        Objects.equals(this.url, gslbGeoDbProfile.url) &&
        Objects.equals(this.uuid, gslbGeoDbProfile.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_lastModified, description, entries, isFederated, name, tenantRef, url, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GslbGeoDbProfile {\n");
    
    sb.append("    _lastModified: ").append(toIndentedString(_lastModified)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
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

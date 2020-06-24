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
import com.vmware.avi.sdk.model.SnmpV3Configuration;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * SnmpConfiguration
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class SnmpConfiguration {
  @JsonProperty("community")
  private String community = null;

  @JsonProperty("large_trap_payload")
  private Boolean largeTrapPayload = null;

  @JsonProperty("snmp_v3_config")
  private SnmpV3Configuration snmpV3Config = null;

  @JsonProperty("sys_contact")
  private String sysContact = "support@avinetworks.com";

  @JsonProperty("sys_location")
  private String sysLocation = null;

  @JsonProperty("version")
  private String version = "SNMP_VER2";

  public SnmpConfiguration community(String community) {
    this.community = community;
    return this;
  }

   /**
   * Community string for SNMP v2c.
   * @return community
  **/
  @Schema(description = "Community string for SNMP v2c.")
  public String getCommunity() {
    return community;
  }

  public void setCommunity(String community) {
    this.community = community;
  }

  public SnmpConfiguration largeTrapPayload(Boolean largeTrapPayload) {
    this.largeTrapPayload = largeTrapPayload;
    return this;
  }

   /**
   * Support for 4096 bytes trap payload. Field introduced in 17.2.13,18.1.4,18.2.1.
   * @return largeTrapPayload
  **/
  @Schema(description = "Support for 4096 bytes trap payload. Field introduced in 17.2.13,18.1.4,18.2.1.")
  public Boolean isLargeTrapPayload() {
    return largeTrapPayload;
  }

  public void setLargeTrapPayload(Boolean largeTrapPayload) {
    this.largeTrapPayload = largeTrapPayload;
  }

  public SnmpConfiguration snmpV3Config(SnmpV3Configuration snmpV3Config) {
    this.snmpV3Config = snmpV3Config;
    return this;
  }

   /**
   * Get snmpV3Config
   * @return snmpV3Config
  **/
  @Schema(description = "")
  public SnmpV3Configuration getSnmpV3Config() {
    return snmpV3Config;
  }

  public void setSnmpV3Config(SnmpV3Configuration snmpV3Config) {
    this.snmpV3Config = snmpV3Config;
  }

  public SnmpConfiguration sysContact(String sysContact) {
    this.sysContact = sysContact;
    return this;
  }

   /**
   * Sets the sysContact in system MIB.
   * @return sysContact
  **/
  @Schema(description = "Sets the sysContact in system MIB.")
  public String getSysContact() {
    return sysContact;
  }

  public void setSysContact(String sysContact) {
    this.sysContact = sysContact;
  }

  public SnmpConfiguration sysLocation(String sysLocation) {
    this.sysLocation = sysLocation;
    return this;
  }

   /**
   * Sets the sysLocation in system MIB.
   * @return sysLocation
  **/
  @Schema(description = "Sets the sysLocation in system MIB.")
  public String getSysLocation() {
    return sysLocation;
  }

  public void setSysLocation(String sysLocation) {
    this.sysLocation = sysLocation;
  }

  public SnmpConfiguration version(String version) {
    this.version = version;
    return this;
  }

   /**
   * SNMP version support. V2 or V3. Enum options - SNMP_VER2, SNMP_VER3. Field introduced in 17.2.3.
   * @return version
  **/
  @Schema(description = "SNMP version support. V2 or V3. Enum options - SNMP_VER2, SNMP_VER3. Field introduced in 17.2.3.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnmpConfiguration snmpConfiguration = (SnmpConfiguration) o;
    return Objects.equals(this.community, snmpConfiguration.community) &&
        Objects.equals(this.largeTrapPayload, snmpConfiguration.largeTrapPayload) &&
        Objects.equals(this.snmpV3Config, snmpConfiguration.snmpV3Config) &&
        Objects.equals(this.sysContact, snmpConfiguration.sysContact) &&
        Objects.equals(this.sysLocation, snmpConfiguration.sysLocation) &&
        Objects.equals(this.version, snmpConfiguration.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(community, largeTrapPayload, snmpV3Config, sysContact, sysLocation, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnmpConfiguration {\n");
    
    sb.append("    community: ").append(toIndentedString(community)).append("\n");
    sb.append("    largeTrapPayload: ").append(toIndentedString(largeTrapPayload)).append("\n");
    sb.append("    snmpV3Config: ").append(toIndentedString(snmpV3Config)).append("\n");
    sb.append("    sysContact: ").append(toIndentedString(sysContact)).append("\n");
    sb.append("    sysLocation: ").append(toIndentedString(sysLocation)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

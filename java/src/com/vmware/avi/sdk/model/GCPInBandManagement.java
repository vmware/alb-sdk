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
 * GCPInBandManagement
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class GCPInBandManagement {
  @JsonProperty("vpc_network_name")
  private String vpcNetworkName = null;

  @JsonProperty("vpc_project_id")
  private String vpcProjectId = null;

  @JsonProperty("vpc_subnet_name")
  private String vpcSubnetName = null;

  public GCPInBandManagement vpcNetworkName(String vpcNetworkName) {
    this.vpcNetworkName = vpcNetworkName;
    return this;
  }

   /**
   * Service Engine Network Name. Field introduced in 18.2.2.
   * @return vpcNetworkName
  **/
  @Schema(required = true, description = "Service Engine Network Name. Field introduced in 18.2.2.")
  public String getVpcNetworkName() {
    return vpcNetworkName;
  }

  public void setVpcNetworkName(String vpcNetworkName) {
    this.vpcNetworkName = vpcNetworkName;
  }

  public GCPInBandManagement vpcProjectId(String vpcProjectId) {
    this.vpcProjectId = vpcProjectId;
    return this;
  }

   /**
   * Project ID of the Service Engine Network. By default, Service Engine Project ID will be used. Field introduced in 18.2.1.
   * @return vpcProjectId
  **/
  @Schema(description = "Project ID of the Service Engine Network. By default, Service Engine Project ID will be used. Field introduced in 18.2.1.")
  public String getVpcProjectId() {
    return vpcProjectId;
  }

  public void setVpcProjectId(String vpcProjectId) {
    this.vpcProjectId = vpcProjectId;
  }

  public GCPInBandManagement vpcSubnetName(String vpcSubnetName) {
    this.vpcSubnetName = vpcSubnetName;
    return this;
  }

   /**
   * Service Engine Network Subnet Name. Field introduced in 18.2.1.
   * @return vpcSubnetName
  **/
  @Schema(required = true, description = "Service Engine Network Subnet Name. Field introduced in 18.2.1.")
  public String getVpcSubnetName() {
    return vpcSubnetName;
  }

  public void setVpcSubnetName(String vpcSubnetName) {
    this.vpcSubnetName = vpcSubnetName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPInBandManagement gcPInBandManagement = (GCPInBandManagement) o;
    return Objects.equals(this.vpcNetworkName, gcPInBandManagement.vpcNetworkName) &&
        Objects.equals(this.vpcProjectId, gcPInBandManagement.vpcProjectId) &&
        Objects.equals(this.vpcSubnetName, gcPInBandManagement.vpcSubnetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpcNetworkName, vpcProjectId, vpcSubnetName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPInBandManagement {\n");
    
    sb.append("    vpcNetworkName: ").append(toIndentedString(vpcNetworkName)).append("\n");
    sb.append("    vpcProjectId: ").append(toIndentedString(vpcProjectId)).append("\n");
    sb.append("    vpcSubnetName: ").append(toIndentedString(vpcSubnetName)).append("\n");
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

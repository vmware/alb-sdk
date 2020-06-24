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
 * ServicePoolSelector
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class ServicePoolSelector {
  @JsonProperty("service_pool_group_ref")
  private String servicePoolGroupRef = null;

  @JsonProperty("service_pool_ref")
  private String servicePoolRef = null;

  @JsonProperty("service_port")
  private Integer servicePort = null;

  @JsonProperty("service_port_range_end")
  private Integer servicePortRangeEnd = null;

  @JsonProperty("service_protocol")
  private String serviceProtocol = null;

  public ServicePoolSelector servicePoolGroupRef(String servicePoolGroupRef) {
    this.servicePoolGroupRef = servicePoolGroupRef;
    return this;
  }

   /**
   *  It is a reference to an object of type PoolGroup.
   * @return servicePoolGroupRef
  **/
  @Schema(description = " It is a reference to an object of type PoolGroup.")
  public String getServicePoolGroupRef() {
    return servicePoolGroupRef;
  }

  public void setServicePoolGroupRef(String servicePoolGroupRef) {
    this.servicePoolGroupRef = servicePoolGroupRef;
  }

  public ServicePoolSelector servicePoolRef(String servicePoolRef) {
    this.servicePoolRef = servicePoolRef;
    return this;
  }

   /**
   *  It is a reference to an object of type Pool.
   * @return servicePoolRef
  **/
  @Schema(description = " It is a reference to an object of type Pool.")
  public String getServicePoolRef() {
    return servicePoolRef;
  }

  public void setServicePoolRef(String servicePoolRef) {
    this.servicePoolRef = servicePoolRef;
  }

  public ServicePoolSelector servicePort(Integer servicePort) {
    this.servicePort = servicePort;
    return this;
  }

   /**
   * Pool based destination port. Allowed values are 1-65535.
   * @return servicePort
  **/
  @Schema(required = true, description = "Pool based destination port. Allowed values are 1-65535.")
  public Integer getServicePort() {
    return servicePort;
  }

  public void setServicePort(Integer servicePort) {
    this.servicePort = servicePort;
  }

  public ServicePoolSelector servicePortRangeEnd(Integer servicePortRangeEnd) {
    this.servicePortRangeEnd = servicePortRangeEnd;
    return this;
  }

   /**
   * The end of the Service port number range. Allowed values are 1-65535. Special values are 0- &#x27;single port&#x27;. Field introduced in 17.2.4.
   * @return servicePortRangeEnd
  **/
  @Schema(description = "The end of the Service port number range. Allowed values are 1-65535. Special values are 0- 'single port'. Field introduced in 17.2.4.")
  public Integer getServicePortRangeEnd() {
    return servicePortRangeEnd;
  }

  public void setServicePortRangeEnd(Integer servicePortRangeEnd) {
    this.servicePortRangeEnd = servicePortRangeEnd;
  }

  public ServicePoolSelector serviceProtocol(String serviceProtocol) {
    this.serviceProtocol = serviceProtocol;
    return this;
  }

   /**
   * Destination protocol to match for the pool selection. If not specified, it will match any protocol. Enum options - PROTOCOL_TYPE_TCP_PROXY, PROTOCOL_TYPE_TCP_FAST_PATH, PROTOCOL_TYPE_UDP_FAST_PATH, PROTOCOL_TYPE_UDP_PROXY.
   * @return serviceProtocol
  **/
  @Schema(description = "Destination protocol to match for the pool selection. If not specified, it will match any protocol. Enum options - PROTOCOL_TYPE_TCP_PROXY, PROTOCOL_TYPE_TCP_FAST_PATH, PROTOCOL_TYPE_UDP_FAST_PATH, PROTOCOL_TYPE_UDP_PROXY.")
  public String getServiceProtocol() {
    return serviceProtocol;
  }

  public void setServiceProtocol(String serviceProtocol) {
    this.serviceProtocol = serviceProtocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicePoolSelector servicePoolSelector = (ServicePoolSelector) o;
    return Objects.equals(this.servicePoolGroupRef, servicePoolSelector.servicePoolGroupRef) &&
        Objects.equals(this.servicePoolRef, servicePoolSelector.servicePoolRef) &&
        Objects.equals(this.servicePort, servicePoolSelector.servicePort) &&
        Objects.equals(this.servicePortRangeEnd, servicePoolSelector.servicePortRangeEnd) &&
        Objects.equals(this.serviceProtocol, servicePoolSelector.serviceProtocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicePoolGroupRef, servicePoolRef, servicePort, servicePortRangeEnd, serviceProtocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicePoolSelector {\n");
    
    sb.append("    servicePoolGroupRef: ").append(toIndentedString(servicePoolGroupRef)).append("\n");
    sb.append("    servicePoolRef: ").append(toIndentedString(servicePoolRef)).append("\n");
    sb.append("    servicePort: ").append(toIndentedString(servicePort)).append("\n");
    sb.append("    servicePortRangeEnd: ").append(toIndentedString(servicePortRangeEnd)).append("\n");
    sb.append("    serviceProtocol: ").append(toIndentedString(serviceProtocol)).append("\n");
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

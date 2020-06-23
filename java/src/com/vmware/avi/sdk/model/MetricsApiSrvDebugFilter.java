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
 * MetricsApiSrvDebugFilter
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class MetricsApiSrvDebugFilter {
  @JsonProperty("entity_ref")
  private String entityRef = null;

  public MetricsApiSrvDebugFilter entityRef(String entityRef) {
    this.entityRef = entityRef;
    return this;
  }

   /**
   * uuid of the entity. It is a reference to an object of type Virtualservice. Field introduced in 18.2.3.
   * @return entityRef
  **/
  @Schema(description = "uuid of the entity. It is a reference to an object of type Virtualservice. Field introduced in 18.2.3.")
  public String getEntityRef() {
    return entityRef;
  }

  public void setEntityRef(String entityRef) {
    this.entityRef = entityRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricsApiSrvDebugFilter metricsApiSrvDebugFilter = (MetricsApiSrvDebugFilter) o;
    return Objects.equals(this.entityRef, metricsApiSrvDebugFilter.entityRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricsApiSrvDebugFilter {\n");
    
    sb.append("    entityRef: ").append(toIndentedString(entityRef)).append("\n");
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

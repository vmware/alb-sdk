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
import java.util.ArrayList;
import java.util.List;
/**
 * DebugVirtualServiceSeParams
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class DebugVirtualServiceSeParams {
  @JsonProperty("se_refs")
  private List<String> seRefs = null;

  public DebugVirtualServiceSeParams seRefs(List<String> seRefs) {
    this.seRefs = seRefs;
    return this;
  }

  public DebugVirtualServiceSeParams addSeRefsItem(String seRefsItem) {
    if (this.seRefs == null) {
      this.seRefs = new ArrayList<String>();
    }
    this.seRefs.add(seRefsItem);
    return this;
  }

   /**
   *  It is a reference to an object of type ServiceEngine.
   * @return seRefs
  **/
  @Schema(description = " It is a reference to an object of type ServiceEngine.")
  public List<String> getSeRefs() {
    return seRefs;
  }

  public void setSeRefs(List<String> seRefs) {
    this.seRefs = seRefs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugVirtualServiceSeParams debugVirtualServiceSeParams = (DebugVirtualServiceSeParams) o;
    return Objects.equals(this.seRefs, debugVirtualServiceSeParams.seRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seRefs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugVirtualServiceSeParams {\n");
    
    sb.append("    seRefs: ").append(toIndentedString(seRefs)).append("\n");
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

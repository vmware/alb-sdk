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
 * VsSwitchoverParams
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class VsSwitchoverParams {
  @JsonProperty("se_uuid")
  private String seUuid = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vip_id")
  private String vipId = null;

  public VsSwitchoverParams seUuid(String seUuid) {
    this.seUuid = seUuid;
    return this;
  }

   /**
   * Unique object identifier of se.
   * @return seUuid
  **/
  @Schema(description = "Unique object identifier of se.")
  public String getSeUuid() {
    return seUuid;
  }

  public void setSeUuid(String seUuid) {
    this.seUuid = seUuid;
  }

  public VsSwitchoverParams uuid(String uuid) {
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

  public VsSwitchoverParams vipId(String vipId) {
    this.vipId = vipId;
    return this;
  }

   /**
   *  Field introduced in 17.1.1.
   * @return vipId
  **/
  @Schema(required = true, description = " Field introduced in 17.1.1.")
  public String getVipId() {
    return vipId;
  }

  public void setVipId(String vipId) {
    this.vipId = vipId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VsSwitchoverParams vsSwitchoverParams = (VsSwitchoverParams) o;
    return Objects.equals(this.seUuid, vsSwitchoverParams.seUuid) &&
        Objects.equals(this.uuid, vsSwitchoverParams.uuid) &&
        Objects.equals(this.vipId, vsSwitchoverParams.vipId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seUuid, uuid, vipId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VsSwitchoverParams {\n");
    
    sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vipId: ").append(toIndentedString(vipId)).append("\n");
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

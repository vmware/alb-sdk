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
import com.vmware.avi.sdk.model.DosThresholdProfile;
import com.vmware.avi.sdk.model.RateLimiterProfile;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * DosRateLimitProfile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class DosRateLimitProfile {
  @JsonProperty("dos_profile")
  private DosThresholdProfile dosProfile = null;

  @JsonProperty("rl_profile")
  private RateLimiterProfile rlProfile = null;

  public DosRateLimitProfile dosProfile(DosThresholdProfile dosProfile) {
    this.dosProfile = dosProfile;
    return this;
  }

   /**
   * Get dosProfile
   * @return dosProfile
  **/
  @Schema(description = "")
  public DosThresholdProfile getDosProfile() {
    return dosProfile;
  }

  public void setDosProfile(DosThresholdProfile dosProfile) {
    this.dosProfile = dosProfile;
  }

  public DosRateLimitProfile rlProfile(RateLimiterProfile rlProfile) {
    this.rlProfile = rlProfile;
    return this;
  }

   /**
   * Get rlProfile
   * @return rlProfile
  **/
  @Schema(description = "")
  public RateLimiterProfile getRlProfile() {
    return rlProfile;
  }

  public void setRlProfile(RateLimiterProfile rlProfile) {
    this.rlProfile = rlProfile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DosRateLimitProfile dosRateLimitProfile = (DosRateLimitProfile) o;
    return Objects.equals(this.dosProfile, dosRateLimitProfile.dosProfile) &&
        Objects.equals(this.rlProfile, dosRateLimitProfile.rlProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dosProfile, rlProfile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DosRateLimitProfile {\n");
    
    sb.append("    dosProfile: ").append(toIndentedString(dosProfile)).append("\n");
    sb.append("    rlProfile: ").append(toIndentedString(rlProfile)).append("\n");
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

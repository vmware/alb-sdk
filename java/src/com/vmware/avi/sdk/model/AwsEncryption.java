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
 * AwsEncryption
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class AwsEncryption {
  @JsonProperty("master_key")
  private String masterKey = null;

  @JsonProperty("mode")
  private String mode = "AWS_ENCRYPTION_MODE_NONE";

  public AwsEncryption masterKey(String masterKey) {
    this.masterKey = masterKey;
    return this;
  }

   /**
   * AWS KMS ARN ID of the master key for encryption. Field introduced in 17.2.3.
   * @return masterKey
  **/
  @Schema(description = "AWS KMS ARN ID of the master key for encryption. Field introduced in 17.2.3.")
  public String getMasterKey() {
    return masterKey;
  }

  public void setMasterKey(String masterKey) {
    this.masterKey = masterKey;
  }

  public AwsEncryption mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * AWS encryption mode. Enum options - AWS_ENCRYPTION_MODE_NONE, AWS_ENCRYPTION_MODE_SSE_KMS. Field introduced in 17.2.3.
   * @return mode
  **/
  @Schema(description = "AWS encryption mode. Enum options - AWS_ENCRYPTION_MODE_NONE, AWS_ENCRYPTION_MODE_SSE_KMS. Field introduced in 17.2.3.")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEncryption awsEncryption = (AwsEncryption) o;
    return Objects.equals(this.masterKey, awsEncryption.masterKey) &&
        Objects.equals(this.mode, awsEncryption.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(masterKey, mode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEncryption {\n");
    
    sb.append("    masterKey: ").append(toIndentedString(masterKey)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

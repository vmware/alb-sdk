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
 * DnsRuleActionPoolSwitching
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class DnsRuleActionPoolSwitching {
  @JsonProperty("pool_group_ref")
  private String poolGroupRef = null;

  @JsonProperty("pool_ref")
  private String poolRef = null;

  public DnsRuleActionPoolSwitching poolGroupRef(String poolGroupRef) {
    this.poolGroupRef = poolGroupRef;
    return this;
  }

   /**
   * Reference of the pool group to serve the passthrough DNS query which cannot be served locally. It is a reference to an object of type PoolGroup. Field introduced in 18.1.3, 17.2.12.
   * @return poolGroupRef
  **/
  @Schema(description = "Reference of the pool group to serve the passthrough DNS query which cannot be served locally. It is a reference to an object of type PoolGroup. Field introduced in 18.1.3, 17.2.12.")
  public String getPoolGroupRef() {
    return poolGroupRef;
  }

  public void setPoolGroupRef(String poolGroupRef) {
    this.poolGroupRef = poolGroupRef;
  }

  public DnsRuleActionPoolSwitching poolRef(String poolRef) {
    this.poolRef = poolRef;
    return this;
  }

   /**
   * Reference of the pool to serve the passthrough DNS query which cannot be served locally. It is a reference to an object of type Pool. Field introduced in 18.1.3, 17.2.12.
   * @return poolRef
  **/
  @Schema(description = "Reference of the pool to serve the passthrough DNS query which cannot be served locally. It is a reference to an object of type Pool. Field introduced in 18.1.3, 17.2.12.")
  public String getPoolRef() {
    return poolRef;
  }

  public void setPoolRef(String poolRef) {
    this.poolRef = poolRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRuleActionPoolSwitching dnsRuleActionPoolSwitching = (DnsRuleActionPoolSwitching) o;
    return Objects.equals(this.poolGroupRef, dnsRuleActionPoolSwitching.poolGroupRef) &&
        Objects.equals(this.poolRef, dnsRuleActionPoolSwitching.poolRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poolGroupRef, poolRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRuleActionPoolSwitching {\n");
    
    sb.append("    poolGroupRef: ").append(toIndentedString(poolGroupRef)).append("\n");
    sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
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

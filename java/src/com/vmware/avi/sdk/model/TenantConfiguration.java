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
 * TenantConfiguration
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class TenantConfiguration {
  @JsonProperty("se_in_provider_context")
  private Boolean seInProviderContext = true;

  @JsonProperty("tenant_access_to_provider_se")
  private Boolean tenantAccessToProviderSe = true;

  @JsonProperty("tenant_vrf")
  private Boolean tenantVrf = null;

  public TenantConfiguration seInProviderContext(Boolean seInProviderContext) {
    this.seInProviderContext = seInProviderContext;
    return this;
  }

   /**
   * Controls the ownership of ServiceEngines. Service Engines can either be exclusively owned by each tenant or owned by the administrator and shared by all tenants. When ServiceEngines are owned by the administrator, each tenant can have either read access or no access to their Service Engines.
   * @return seInProviderContext
  **/
  @Schema(description = "Controls the ownership of ServiceEngines. Service Engines can either be exclusively owned by each tenant or owned by the administrator and shared by all tenants. When ServiceEngines are owned by the administrator, each tenant can have either read access or no access to their Service Engines.")
  public Boolean isSeInProviderContext() {
    return seInProviderContext;
  }

  public void setSeInProviderContext(Boolean seInProviderContext) {
    this.seInProviderContext = seInProviderContext;
  }

  public TenantConfiguration tenantAccessToProviderSe(Boolean tenantAccessToProviderSe) {
    this.tenantAccessToProviderSe = tenantAccessToProviderSe;
    return this;
  }

   /**
   * Placeholder for description of property tenant_access_to_provider_se of obj type TenantConfiguration field type str  type boolean
   * @return tenantAccessToProviderSe
  **/
  @Schema(description = "Placeholder for description of property tenant_access_to_provider_se of obj type TenantConfiguration field type str  type boolean")
  public Boolean isTenantAccessToProviderSe() {
    return tenantAccessToProviderSe;
  }

  public void setTenantAccessToProviderSe(Boolean tenantAccessToProviderSe) {
    this.tenantAccessToProviderSe = tenantAccessToProviderSe;
  }

  public TenantConfiguration tenantVrf(Boolean tenantVrf) {
    this.tenantVrf = tenantVrf;
    return this;
  }

   /**
   * When &#x27;Per Tenant IP Domain&#x27; is selected, each tenant gets its own routing domain that is not shared with any other tenant. When &#x27;Share IP Domain across all tenants&#x27; is selected, all tenants share the same routing domain.
   * @return tenantVrf
  **/
  @Schema(description = "When 'Per Tenant IP Domain' is selected, each tenant gets its own routing domain that is not shared with any other tenant. When 'Share IP Domain across all tenants' is selected, all tenants share the same routing domain.")
  public Boolean isTenantVrf() {
    return tenantVrf;
  }

  public void setTenantVrf(Boolean tenantVrf) {
    this.tenantVrf = tenantVrf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantConfiguration tenantConfiguration = (TenantConfiguration) o;
    return Objects.equals(this.seInProviderContext, tenantConfiguration.seInProviderContext) &&
        Objects.equals(this.tenantAccessToProviderSe, tenantConfiguration.tenantAccessToProviderSe) &&
        Objects.equals(this.tenantVrf, tenantConfiguration.tenantVrf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seInProviderContext, tenantAccessToProviderSe, tenantVrf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantConfiguration {\n");
    
    sb.append("    seInProviderContext: ").append(toIndentedString(seInProviderContext)).append("\n");
    sb.append("    tenantAccessToProviderSe: ").append(toIndentedString(tenantAccessToProviderSe)).append("\n");
    sb.append("    tenantVrf: ").append(toIndentedString(tenantVrf)).append("\n");
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

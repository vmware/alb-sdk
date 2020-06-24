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
 * GslbSiteDnsVs
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class GslbSiteDnsVs {
  @JsonProperty("dns_vs_uuid")
  private String dnsVsUuid = null;

  @JsonProperty("domain_names")
  private List<String> domainNames = null;

  public GslbSiteDnsVs dnsVsUuid(String dnsVsUuid) {
    this.dnsVsUuid = dnsVsUuid;
    return this;
  }

   /**
   * This field identifies the DNS VS uuid for this site. Field introduced in 17.2.3.
   * @return dnsVsUuid
  **/
  @Schema(required = true, description = "This field identifies the DNS VS uuid for this site. Field introduced in 17.2.3.")
  public String getDnsVsUuid() {
    return dnsVsUuid;
  }

  public void setDnsVsUuid(String dnsVsUuid) {
    this.dnsVsUuid = dnsVsUuid;
  }

  public GslbSiteDnsVs domainNames(List<String> domainNames) {
    this.domainNames = domainNames;
    return this;
  }

  public GslbSiteDnsVs addDomainNamesItem(String domainNamesItem) {
    if (this.domainNames == null) {
      this.domainNames = new ArrayList<String>();
    }
    this.domainNames.add(domainNamesItem);
    return this;
  }

   /**
   * This field identifies the subdomains that are hosted on the DNS VS. GslbService(s) whose FQDNs map to one of the subdomains will be hosted on this DNS VS. If no subdomains are configured, then the default behavior is to host all the GslbServices on this DNS VS. Field introduced in 17.2.3.
   * @return domainNames
  **/
  @Schema(description = "This field identifies the subdomains that are hosted on the DNS VS. GslbService(s) whose FQDNs map to one of the subdomains will be hosted on this DNS VS. If no subdomains are configured, then the default behavior is to host all the GslbServices on this DNS VS. Field introduced in 17.2.3.")
  public List<String> getDomainNames() {
    return domainNames;
  }

  public void setDomainNames(List<String> domainNames) {
    this.domainNames = domainNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GslbSiteDnsVs gslbSiteDnsVs = (GslbSiteDnsVs) o;
    return Objects.equals(this.dnsVsUuid, gslbSiteDnsVs.dnsVsUuid) &&
        Objects.equals(this.domainNames, gslbSiteDnsVs.domainNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsVsUuid, domainNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GslbSiteDnsVs {\n");
    
    sb.append("    dnsVsUuid: ").append(toIndentedString(dnsVsUuid)).append("\n");
    sb.append("    domainNames: ").append(toIndentedString(domainNames)).append("\n");
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

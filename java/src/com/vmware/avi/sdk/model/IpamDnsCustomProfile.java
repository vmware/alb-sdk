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
import com.vmware.avi.sdk.model.CustomParams;
import com.vmware.avi.sdk.model.IpAddrPrefix;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * IpamDnsCustomProfile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class IpamDnsCustomProfile {
  @JsonProperty("custom_ipam_dns_profile_ref")
  private String customIpamDnsProfileRef = null;

  @JsonProperty("dynamic_params")
  private List<CustomParams> dynamicParams = null;

  @JsonProperty("usable_domains")
  private List<String> usableDomains = null;

  @JsonProperty("usable_subnets")
  private List<IpAddrPrefix> usableSubnets = null;

  public IpamDnsCustomProfile customIpamDnsProfileRef(String customIpamDnsProfileRef) {
    this.customIpamDnsProfileRef = customIpamDnsProfileRef;
    return this;
  }

   /**
   *  It is a reference to an object of type CustomIpamDnsProfile. Field introduced in 17.1.1.
   * @return customIpamDnsProfileRef
  **/
  @Schema(description = " It is a reference to an object of type CustomIpamDnsProfile. Field introduced in 17.1.1.")
  public String getCustomIpamDnsProfileRef() {
    return customIpamDnsProfileRef;
  }

  public void setCustomIpamDnsProfileRef(String customIpamDnsProfileRef) {
    this.customIpamDnsProfileRef = customIpamDnsProfileRef;
  }

  public IpamDnsCustomProfile dynamicParams(List<CustomParams> dynamicParams) {
    this.dynamicParams = dynamicParams;
    return this;
  }

  public IpamDnsCustomProfile addDynamicParamsItem(CustomParams dynamicParamsItem) {
    if (this.dynamicParams == null) {
      this.dynamicParams = new ArrayList<CustomParams>();
    }
    this.dynamicParams.add(dynamicParamsItem);
    return this;
  }

   /**
   * Custom parameters that will passed to the IPAM/DNS provider including but not limited to provider credentials and API version. Field introduced in 17.1.1.
   * @return dynamicParams
  **/
  @Schema(description = "Custom parameters that will passed to the IPAM/DNS provider including but not limited to provider credentials and API version. Field introduced in 17.1.1.")
  public List<CustomParams> getDynamicParams() {
    return dynamicParams;
  }

  public void setDynamicParams(List<CustomParams> dynamicParams) {
    this.dynamicParams = dynamicParams;
  }

  public IpamDnsCustomProfile usableDomains(List<String> usableDomains) {
    this.usableDomains = usableDomains;
    return this;
  }

  public IpamDnsCustomProfile addUsableDomainsItem(String usableDomainsItem) {
    if (this.usableDomains == null) {
      this.usableDomains = new ArrayList<String>();
    }
    this.usableDomains.add(usableDomainsItem);
    return this;
  }

   /**
   * Usable domains. Field introduced in 17.2.2.
   * @return usableDomains
  **/
  @Schema(description = "Usable domains. Field introduced in 17.2.2.")
  public List<String> getUsableDomains() {
    return usableDomains;
  }

  public void setUsableDomains(List<String> usableDomains) {
    this.usableDomains = usableDomains;
  }

  public IpamDnsCustomProfile usableSubnets(List<IpAddrPrefix> usableSubnets) {
    this.usableSubnets = usableSubnets;
    return this;
  }

  public IpamDnsCustomProfile addUsableSubnetsItem(IpAddrPrefix usableSubnetsItem) {
    if (this.usableSubnets == null) {
      this.usableSubnets = new ArrayList<IpAddrPrefix>();
    }
    this.usableSubnets.add(usableSubnetsItem);
    return this;
  }

   /**
   * Usable subnets. Field introduced in 17.2.2.
   * @return usableSubnets
  **/
  @Schema(description = "Usable subnets. Field introduced in 17.2.2.")
  public List<IpAddrPrefix> getUsableSubnets() {
    return usableSubnets;
  }

  public void setUsableSubnets(List<IpAddrPrefix> usableSubnets) {
    this.usableSubnets = usableSubnets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpamDnsCustomProfile ipamDnsCustomProfile = (IpamDnsCustomProfile) o;
    return Objects.equals(this.customIpamDnsProfileRef, ipamDnsCustomProfile.customIpamDnsProfileRef) &&
        Objects.equals(this.dynamicParams, ipamDnsCustomProfile.dynamicParams) &&
        Objects.equals(this.usableDomains, ipamDnsCustomProfile.usableDomains) &&
        Objects.equals(this.usableSubnets, ipamDnsCustomProfile.usableSubnets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customIpamDnsProfileRef, dynamicParams, usableDomains, usableSubnets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpamDnsCustomProfile {\n");
    
    sb.append("    customIpamDnsProfileRef: ").append(toIndentedString(customIpamDnsProfileRef)).append("\n");
    sb.append("    dynamicParams: ").append(toIndentedString(dynamicParams)).append("\n");
    sb.append("    usableDomains: ").append(toIndentedString(usableDomains)).append("\n");
    sb.append("    usableSubnets: ").append(toIndentedString(usableSubnets)).append("\n");
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

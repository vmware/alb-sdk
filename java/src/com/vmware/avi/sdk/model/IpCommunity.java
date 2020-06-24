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
import com.vmware.avi.sdk.model.IpAddr;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * IpCommunity
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class IpCommunity {
  @JsonProperty("community")
  private List<String> community = null;

  @JsonProperty("ip_begin")
  private IpAddr ipBegin = null;

  @JsonProperty("ip_end")
  private IpAddr ipEnd = null;

  public IpCommunity community(List<String> community) {
    this.community = community;
    return this;
  }

  public IpCommunity addCommunityItem(String communityItem) {
    if (this.community == null) {
      this.community = new ArrayList<String>();
    }
    this.community.add(communityItem);
    return this;
  }

   /**
   * Community string either in aa nn format where aa, nn is within [1,65535] or local-AS|no-advertise|no-export|internet. Field introduced in 17.1.3.
   * @return community
  **/
  @Schema(description = "Community string either in aa nn format where aa, nn is within [1,65535] or local-AS|no-advertise|no-export|internet. Field introduced in 17.1.3.")
  public List<String> getCommunity() {
    return community;
  }

  public void setCommunity(List<String> community) {
    this.community = community;
  }

  public IpCommunity ipBegin(IpAddr ipBegin) {
    this.ipBegin = ipBegin;
    return this;
  }

   /**
   * Get ipBegin
   * @return ipBegin
  **/
  @Schema(required = true, description = "")
  public IpAddr getIpBegin() {
    return ipBegin;
  }

  public void setIpBegin(IpAddr ipBegin) {
    this.ipBegin = ipBegin;
  }

  public IpCommunity ipEnd(IpAddr ipEnd) {
    this.ipEnd = ipEnd;
    return this;
  }

   /**
   * Get ipEnd
   * @return ipEnd
  **/
  @Schema(description = "")
  public IpAddr getIpEnd() {
    return ipEnd;
  }

  public void setIpEnd(IpAddr ipEnd) {
    this.ipEnd = ipEnd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpCommunity ipCommunity = (IpCommunity) o;
    return Objects.equals(this.community, ipCommunity.community) &&
        Objects.equals(this.ipBegin, ipCommunity.ipBegin) &&
        Objects.equals(this.ipEnd, ipCommunity.ipEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(community, ipBegin, ipEnd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpCommunity {\n");
    
    sb.append("    community: ").append(toIndentedString(community)).append("\n");
    sb.append("    ipBegin: ").append(toIndentedString(ipBegin)).append("\n");
    sb.append("    ipEnd: ").append(toIndentedString(ipEnd)).append("\n");
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

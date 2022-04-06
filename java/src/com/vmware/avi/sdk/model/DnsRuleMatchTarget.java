/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */

package com.vmware.avi.sdk.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The DnsRuleMatchTarget is a POJO class extends AviRestResource that used for creating
 * DnsRuleMatchTarget.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DnsRuleMatchTarget  {
    @JsonProperty("client_ip")
    private IpAddrMatch clientIp;

    @JsonProperty("client_ip_address")
    private DnsClientIpMatch clientIpAddress = null;

    @JsonProperty("client_port_numbers")
    private DnsClientPortMatch clientPortNumbers = null;

    @JsonProperty("geo_location")
    private DnsGeoLocationMatch geoLocation = null;

    @JsonProperty("protocol")
    private DnsTransportProtocolMatch protocol = null;

    @JsonProperty("query_name")
    private DnsQueryNameMatch queryName = null;

    @JsonProperty("query_type")
    private DnsQueryTypeMatch queryType = null;



    /**
     * This is the getter method this will return the attribute value.
     * Ip addresses to match against client ip.
     * From 17.1.6 release onwards, ip addresses needs to be configured in the client_ip_address field of this message.
     * Field deprecated in 17.1.6,17.2.2.
     * Field introduced in 17.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return clientIp
     */
    public IpAddrMatch getClientIp() {
        return clientIp;
    }

    /**
     * This is the setter method to the attribute.
     * Ip addresses to match against client ip.
     * From 17.1.6 release onwards, ip addresses needs to be configured in the client_ip_address field of this message.
     * Field deprecated in 17.1.6,17.2.2.
     * Field introduced in 17.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param clientIp set the clientIp.
     */
    public void setClientIp(IpAddrMatch clientIp) {
        this.clientIp = clientIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ip addresses to match against client ip or the edns client subnet ip.
     * Field introduced in 17.1.6,17.2.2.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientIpAddress
     */
    public DnsClientIpMatch getClientIpAddress() {
        return clientIpAddress;
    }

    /**
     * This is the setter method to the attribute.
     * Ip addresses to match against client ip or the edns client subnet ip.
     * Field introduced in 17.1.6,17.2.2.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientIpAddress set the clientIpAddress.
     */
    public void setClientIpAddress(DnsClientIpMatch clientIpAddress) {
        this.clientIpAddress = clientIpAddress;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Port number to match against client port number.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientPortNumbers
     */
    public DnsClientPortMatch getClientPortNumbers() {
        return clientPortNumbers;
    }

    /**
     * This is the setter method to the attribute.
     * Port number to match against client port number.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientPortNumbers set the clientPortNumbers.
     */
    public void setClientPortNumbers(DnsClientPortMatch clientPortNumbers) {
        this.clientPortNumbers = clientPortNumbers;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Geographical location attribute to match against that of the client ip.
     * Field introduced in 17.1.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return geoLocation
     */
    public DnsGeoLocationMatch getGeoLocation() {
        return geoLocation;
    }

    /**
     * This is the setter method to the attribute.
     * Geographical location attribute to match against that of the client ip.
     * Field introduced in 17.1.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param geoLocation set the geoLocation.
     */
    public void setGeoLocation(DnsGeoLocationMatch geoLocation) {
        this.geoLocation = geoLocation;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Dns transport protocol match.
     * Field introduced in 17.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return protocol
     */
    public DnsTransportProtocolMatch getProtocol() {
        return protocol;
    }

    /**
     * This is the setter method to the attribute.
     * Dns transport protocol match.
     * Field introduced in 17.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param protocol set the protocol.
     */
    public void setProtocol(DnsTransportProtocolMatch protocol) {
        this.protocol = protocol;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Domain names to match against query name.
     * Field introduced in 17.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return queryName
     */
    public DnsQueryNameMatch getQueryName() {
        return queryName;
    }

    /**
     * This is the setter method to the attribute.
     * Domain names to match against query name.
     * Field introduced in 17.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param queryName set the queryName.
     */
    public void setQueryName(DnsQueryNameMatch queryName) {
        this.queryName = queryName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Dns query types to match against request query type.
     * Field introduced in 17.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return queryType
     */
    public DnsQueryTypeMatch getQueryType() {
        return queryType;
    }

    /**
     * This is the setter method to the attribute.
     * Dns query types to match against request query type.
     * Field introduced in 17.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param queryType set the queryType.
     */
    public void setQueryType(DnsQueryTypeMatch queryType) {
        this.queryType = queryType;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DnsRuleMatchTarget objDnsRuleMatchTarget = (DnsRuleMatchTarget) o;
      return   Objects.equals(this.clientIp, objDnsRuleMatchTarget.clientIp)&&
  Objects.equals(this.protocol, objDnsRuleMatchTarget.protocol)&&
  Objects.equals(this.queryName, objDnsRuleMatchTarget.queryName)&&
  Objects.equals(this.queryType, objDnsRuleMatchTarget.queryType)&&
  Objects.equals(this.geoLocation, objDnsRuleMatchTarget.geoLocation)&&
  Objects.equals(this.clientIpAddress, objDnsRuleMatchTarget.clientIpAddress)&&
  Objects.equals(this.clientPortNumbers, objDnsRuleMatchTarget.clientPortNumbers);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DnsRuleMatchTarget {\n");
                  sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
                        sb.append("    clientIpAddress: ").append(toIndentedString(clientIpAddress)).append("\n");
                        sb.append("    clientPortNumbers: ").append(toIndentedString(clientPortNumbers)).append("\n");
                        sb.append("    geoLocation: ").append(toIndentedString(geoLocation)).append("\n");
                        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
                        sb.append("    queryName: ").append(toIndentedString(queryName)).append("\n");
                        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
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

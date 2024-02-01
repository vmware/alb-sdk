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
 * The CaptureTCPFilter is a POJO class extends AviRestResource that used for creating
 * CaptureTCPFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CaptureTCPFilter  {
    @JsonProperty("dst_port_range")
    private DestinationPortAddr dstPortRange = null;

    @JsonProperty("eth_proto")
    private String ethProto = "ETH_TYPE_IPV4";

    @JsonProperty("host_ip")
    private DebugIpAddr hostIp = null;

    @JsonProperty("src_port_range")
    private SourcePortAddr srcPortRange = null;

    @JsonProperty("tcpflags")
    private List<CaptureTCP> tcpflags = null;



    /**
     * This is the getter method this will return the attribute value.
     * Destination port range filter.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dstPortRange
     */
    public DestinationPortAddr getDstPortRange() {
        return dstPortRange;
    }

    /**
     * This is the setter method to the attribute.
     * Destination port range filter.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dstPortRange set the dstPortRange.
     */
    public void setDstPortRange(DestinationPortAddr dstPortRange) {
        this.dstPortRange = dstPortRange;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ethernet proto filter.
     * Enum options - ETH_TYPE_IPV4.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "ETH_TYPE_IPV4".
     * @return ethProto
     */
    public String getEthProto() {
        return ethProto;
    }

    /**
     * This is the setter method to the attribute.
     * Ethernet proto filter.
     * Enum options - ETH_TYPE_IPV4.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "ETH_TYPE_IPV4".
     * @param ethProto set the ethProto.
     */
    public void setEthProto(String  ethProto) {
        this.ethProto = ethProto;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Per packet ip filter for service engine pcap.
     * Matches with source and destination address.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hostIp
     */
    public DebugIpAddr getHostIp() {
        return hostIp;
    }

    /**
     * This is the setter method to the attribute.
     * Per packet ip filter for service engine pcap.
     * Matches with source and destination address.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hostIp set the hostIp.
     */
    public void setHostIp(DebugIpAddr hostIp) {
        this.hostIp = hostIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Source port range filter.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return srcPortRange
     */
    public SourcePortAddr getSrcPortRange() {
        return srcPortRange;
    }

    /**
     * This is the setter method to the attribute.
     * Source port range filter.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param srcPortRange set the srcPortRange.
     */
    public void setSrcPortRange(SourcePortAddr srcPortRange) {
        this.srcPortRange = srcPortRange;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Tcp flags filter.
     * Or'ed internally and and'ed amongst each other.
     * Field introduced in 30.2.1.
     * Maximum of 4 items allowed.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tcpflags
     */
    public List<CaptureTCP> getTcpflags() {
        return tcpflags;
    }

    /**
     * This is the setter method. this will set the tcpflags
     * Tcp flags filter.
     * Or'ed internally and and'ed amongst each other.
     * Field introduced in 30.2.1.
     * Maximum of 4 items allowed.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tcpflags
     */
    public void setTcpflags(List<CaptureTCP>  tcpflags) {
        this.tcpflags = tcpflags;
    }

    /**
     * This is the setter method this will set the tcpflags
     * Tcp flags filter.
     * Or'ed internally and and'ed amongst each other.
     * Field introduced in 30.2.1.
     * Maximum of 4 items allowed.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tcpflags
     */
    public CaptureTCPFilter addTcpflagsItem(CaptureTCP tcpflagsItem) {
      if (this.tcpflags == null) {
        this.tcpflags = new ArrayList<CaptureTCP>();
      }
      this.tcpflags.add(tcpflagsItem);
      return this;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      CaptureTCPFilter objCaptureTCPFilter = (CaptureTCPFilter) o;
      return   Objects.equals(this.tcpflags, objCaptureTCPFilter.tcpflags)&&
  Objects.equals(this.hostIp, objCaptureTCPFilter.hostIp)&&
  Objects.equals(this.ethProto, objCaptureTCPFilter.ethProto)&&
  Objects.equals(this.srcPortRange, objCaptureTCPFilter.srcPortRange)&&
  Objects.equals(this.dstPortRange, objCaptureTCPFilter.dstPortRange);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CaptureTCPFilter {\n");
                  sb.append("    dstPortRange: ").append(toIndentedString(dstPortRange)).append("\n");
                        sb.append("    ethProto: ").append(toIndentedString(ethProto)).append("\n");
                        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
                        sb.append("    srcPortRange: ").append(toIndentedString(srcPortRange)).append("\n");
                        sb.append("    tcpflags: ").append(toIndentedString(tcpflags)).append("\n");
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

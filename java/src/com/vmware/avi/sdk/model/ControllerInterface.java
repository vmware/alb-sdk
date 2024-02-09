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
 * The ControllerInterface is a POJO class extends AviRestResource that used for creating
 * ControllerInterface.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ControllerInterface  {
    @JsonProperty("gateway")
    private IpAddr gateway;

    @JsonProperty("gateway6")
    private IpAddr gateway6;

    @JsonProperty("if_name")
    private String ifName;

    @JsonProperty("ip")
    private IpAddrPrefix ip;

    @JsonProperty("ip6")
    private IpAddrPrefix ip6;

    @JsonProperty("labels")
    private List<String> labels;

    @JsonProperty("mac_address")
    private String macAddress;

    @JsonProperty("mode")
    private String mode;

    @JsonProperty("mode6")
    private String mode6;

    @JsonProperty("public_ip_or_name")
    private IpAddr publicIpOrName;

    @JsonProperty("v4_enabled")
    private Boolean v4Enabled;

    @JsonProperty("v6_enabled")
    private Boolean v6Enabled;



    /**
     * This is the getter method this will return the attribute value.
     * Ipv4 default gateway of the interface.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gateway
     */
    public IpAddr getGateway() {
        return gateway;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv4 default gateway of the interface.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gateway set the gateway.
     */
    public void setGateway(IpAddr gateway) {
        this.gateway = gateway;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ipv6 default gateway of the interface.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gateway6
     */
    public IpAddr getGateway6() {
        return gateway6;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv6 default gateway of the interface.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gateway6 set the gateway6.
     */
    public void setGateway6(IpAddr gateway6) {
        this.gateway6 = gateway6;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Interface name.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ifName
     */
    public String getIfName() {
        return ifName;
    }

    /**
     * This is the setter method to the attribute.
     * Interface name.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ifName set the ifName.
     */
    public void setIfName(String  ifName) {
        this.ifName = ifName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ipv4 prefix of the interface.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ip
     */
    public IpAddrPrefix getIp() {
        return ip;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv4 prefix of the interface.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ip set the ip.
     */
    public void setIp(IpAddrPrefix ip) {
        this.ip = ip;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ipv6 prefix of the interface.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ip6
     */
    public IpAddrPrefix getIp6() {
        return ip6;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv6 prefix of the interface.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ip6 set the ip6.
     */
    public void setIp6(IpAddrPrefix ip6) {
        this.ip6 = ip6;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Interface label like mgmt, secure channel or hsm.
     * Enum options - MGMT, SE_SECURE_CHANNEL, HSM.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    /**
     * This is the setter method. this will set the labels
     * Interface label like mgmt, secure channel or hsm.
     * Enum options - MGMT, SE_SECURE_CHANNEL, HSM.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return labels
     */
    public void setLabels(List<String>  labels) {
        this.labels = labels;
    }

    /**
     * This is the setter method this will set the labels
     * Interface label like mgmt, secure channel or hsm.
     * Enum options - MGMT, SE_SECURE_CHANNEL, HSM.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return labels
     */
    public ControllerInterface addLabelsItem(String labelsItem) {
      if (this.labels == null) {
        this.labels = new ArrayList<String>();
      }
      this.labels.add(labelsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Mac address of interface.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return macAddress
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * This is the setter method to the attribute.
     * Mac address of interface.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param macAddress set the macAddress.
     */
    public void setMacAddress(String  macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ipv4 address mode dhcp/static.
     * Enum options - DHCP, STATIC, VIP, DOCKER_HOST.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv4 address mode dhcp/static.
     * Enum options - DHCP, STATIC, VIP, DOCKER_HOST.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mode set the mode.
     */
    public void setMode(String  mode) {
        this.mode = mode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ipv6 address mode static.
     * Enum options - DHCP, STATIC, VIP, DOCKER_HOST.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mode6
     */
    public String getMode6() {
        return mode6;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv6 address mode static.
     * Enum options - DHCP, STATIC, VIP, DOCKER_HOST.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mode6 set the mode6.
     */
    public void setMode6(String  mode6) {
        this.mode6 = mode6;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Public ip of interface.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return publicIpOrName
     */
    public IpAddr getPublicIpOrName() {
        return publicIpOrName;
    }

    /**
     * This is the setter method to the attribute.
     * Public ip of interface.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param publicIpOrName set the publicIpOrName.
     */
    public void setPublicIpOrName(IpAddr publicIpOrName) {
        this.publicIpOrName = publicIpOrName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable v4 ip on this interface.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return v4Enabled
     */
    public Boolean getV4Enabled() {
        return v4Enabled;
    }

    /**
     * This is the setter method to the attribute.
     * Enable v4 ip on this interface.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param v4Enabled set the v4Enabled.
     */
    public void setV4Enabled(Boolean  v4Enabled) {
        this.v4Enabled = v4Enabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable v6 ip on this interface.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return v6Enabled
     */
    public Boolean getV6Enabled() {
        return v6Enabled;
    }

    /**
     * This is the setter method to the attribute.
     * Enable v6 ip on this interface.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param v6Enabled set the v6Enabled.
     */
    public void setV6Enabled(Boolean  v6Enabled) {
        this.v6Enabled = v6Enabled;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ControllerInterface objControllerInterface = (ControllerInterface) o;
      return   Objects.equals(this.ifName, objControllerInterface.ifName)&&
  Objects.equals(this.macAddress, objControllerInterface.macAddress)&&
  Objects.equals(this.mode, objControllerInterface.mode)&&
  Objects.equals(this.ip, objControllerInterface.ip)&&
  Objects.equals(this.gateway, objControllerInterface.gateway)&&
  Objects.equals(this.labels, objControllerInterface.labels)&&
  Objects.equals(this.publicIpOrName, objControllerInterface.publicIpOrName)&&
  Objects.equals(this.mode6, objControllerInterface.mode6)&&
  Objects.equals(this.ip6, objControllerInterface.ip6)&&
  Objects.equals(this.gateway6, objControllerInterface.gateway6)&&
  Objects.equals(this.v4Enabled, objControllerInterface.v4Enabled)&&
  Objects.equals(this.v6Enabled, objControllerInterface.v6Enabled);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ControllerInterface {\n");
                  sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
                        sb.append("    gateway6: ").append(toIndentedString(gateway6)).append("\n");
                        sb.append("    ifName: ").append(toIndentedString(ifName)).append("\n");
                        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
                        sb.append("    ip6: ").append(toIndentedString(ip6)).append("\n");
                        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
                        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
                        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
                        sb.append("    mode6: ").append(toIndentedString(mode6)).append("\n");
                        sb.append("    publicIpOrName: ").append(toIndentedString(publicIpOrName)).append("\n");
                        sb.append("    v4Enabled: ").append(toIndentedString(v4Enabled)).append("\n");
                        sb.append("    v6Enabled: ").append(toIndentedString(v6Enabled)).append("\n");
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

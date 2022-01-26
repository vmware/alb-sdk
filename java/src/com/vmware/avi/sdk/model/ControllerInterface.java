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
    private IpAddr gateway = null;

    @JsonProperty("if_name")
    private String ifName = null;

    @JsonProperty("ip")
    private IpAddrPrefix ip = null;

    @JsonProperty("labels")
    private List<String> labels = null;

    @JsonProperty("mac_address")
    private String macAddress = null;

    @JsonProperty("mode")
    private String mode = null;

    @JsonProperty("public_ip_or_name")
    private IpAddr publicIpOrName = null;



    /**
     * This is the getter method this will return the attribute value.
     * Default gateway of the mgmt interface.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gateway
     */
    public IpAddr getGateway() {
        return gateway;
    }

    /**
     * This is the setter method to the attribute.
     * Default gateway of the mgmt interface.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gateway set the gateway.
     */
    public void setGateway(IpAddr gateway) {
        this.gateway = gateway;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Interface name.
     * Field introduced in 21.1.3.
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
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ifName set the ifName.
     */
    public void setIfName(String  ifName) {
        this.ifName = ifName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ip address of the interface.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ip
     */
    public IpAddrPrefix getIp() {
        return ip;
    }

    /**
     * This is the setter method to the attribute.
     * Ip address of the interface.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ip set the ip.
     */
    public void setIp(IpAddrPrefix ip) {
        this.ip = ip;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Interface label like mgmt, secure channel or hsm.
     * Enum options - MGMT, SE_SECURE_CHANNEL, HSM.
     * Field introduced in 21.1.3.
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
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param macAddress set the macAddress.
     */
    public void setMacAddress(String  macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ip address mode dhcp/static.
     * Enum options - DHCP, STATIC, VIP, DOCKER_HOST.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * This is the setter method to the attribute.
     * Ip address mode dhcp/static.
     * Enum options - DHCP, STATIC, VIP, DOCKER_HOST.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mode set the mode.
     */
    public void setMode(String  mode) {
        this.mode = mode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Public ip of interface.
     * Field introduced in 21.1.3.
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
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param publicIpOrName set the publicIpOrName.
     */
    public void setPublicIpOrName(IpAddr publicIpOrName) {
        this.publicIpOrName = publicIpOrName;
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
  Objects.equals(this.publicIpOrName, objControllerInterface.publicIpOrName);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ControllerInterface {\n");
                  sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
                        sb.append("    ifName: ").append(toIndentedString(ifName)).append("\n");
                        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
                        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
                        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
                        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
                        sb.append("    publicIpOrName: ").append(toIndentedString(publicIpOrName)).append("\n");
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

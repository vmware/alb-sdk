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
 * The OpenStackVnicChange is a POJO class extends AviRestResource that used for creating
 * OpenStackVnicChange.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OpenStackVnicChange  {
    @JsonProperty("error_string")
    private String errorString = null;

    @JsonProperty("mac_addrs")
    private List<String> macAddrs = null;

    @JsonProperty("networks")
    private List<String> networks = null;

    @JsonProperty("se_vm_uuid")
    private String seVmUuid = null;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorString
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param errorString set the errorString.
     */
    public void setErrorString(String  errorString) {
        this.errorString = errorString;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return macAddrs
     */
    public List<String> getMacAddrs() {
        return macAddrs;
    }

    /**
     * This is the setter method. this will set the macAddrs
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return macAddrs
     */
    public void setMacAddrs(List<String>  macAddrs) {
        this.macAddrs = macAddrs;
    }

    /**
     * This is the setter method this will set the macAddrs
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return macAddrs
     */
    public OpenStackVnicChange addMacAddrsItem(String macAddrsItem) {
      if (this.macAddrs == null) {
        this.macAddrs = new ArrayList<String>();
      }
      this.macAddrs.add(macAddrsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networks
     */
    public List<String> getNetworks() {
        return networks;
    }

    /**
     * This is the setter method. this will set the networks
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networks
     */
    public void setNetworks(List<String>  networks) {
        this.networks = networks;
    }

    /**
     * This is the setter method this will set the networks
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networks
     */
    public OpenStackVnicChange addNetworksItem(String networksItem) {
      if (this.networks == null) {
        this.networks = new ArrayList<String>();
      }
      this.networks.add(networksItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seVmUuid
     */
    public String getSeVmUuid() {
        return seVmUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seVmUuid set the seVmUuid.
     */
    public void setSeVmUuid(String  seVmUuid) {
        this.seVmUuid = seVmUuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      OpenStackVnicChange objOpenStackVnicChange = (OpenStackVnicChange) o;
      return   Objects.equals(this.seVmUuid, objOpenStackVnicChange.seVmUuid)&&
  Objects.equals(this.networks, objOpenStackVnicChange.networks)&&
  Objects.equals(this.macAddrs, objOpenStackVnicChange.macAddrs)&&
  Objects.equals(this.errorString, objOpenStackVnicChange.errorString);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OpenStackVnicChange {\n");
                  sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
                        sb.append("    macAddrs: ").append(toIndentedString(macAddrs)).append("\n");
                        sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
                        sb.append("    seVmUuid: ").append(toIndentedString(seVmUuid)).append("\n");
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

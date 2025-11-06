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
 * The RemoteController is a POJO class extends AviRestResource that used for creating
 * RemoteController.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoteController  {
    @JsonProperty("address")
    private String address;

    @JsonProperty("enabled")
    private Boolean enabled = false;

    @JsonProperty("password")
    private String password;

    @JsonProperty("tenant")
    private String tenant;

    @JsonProperty("username")
    private String username;



    /**
     * This is the getter method this will return the attribute value.
     * Remote controller address.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * This is the setter method to the attribute.
     * Remote controller address.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param address set the address.
     */
    public void setAddress(String  address) {
        this.address = address;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable remote controller request.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This is the setter method to the attribute.
     * Enable remote controller request.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enabled set the enabled.
     */
    public void setEnabled(Boolean  enabled) {
        this.enabled = enabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Remote controller password.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * This is the setter method to the attribute.
     * Remote controller password.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param password set the password.
     */
    public void setPassword(String  password) {
        this.password = password;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Remote controller tenant name.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenant
     */
    public String getTenant() {
        return tenant;
    }

    /**
     * This is the setter method to the attribute.
     * Remote controller tenant name.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenant set the tenant.
     */
    public void setTenant(String  tenant) {
        this.tenant = tenant;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Remote controller username.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * This is the setter method to the attribute.
     * Remote controller username.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param username set the username.
     */
    public void setUsername(String  username) {
        this.username = username;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      RemoteController objRemoteController = (RemoteController) o;
      return   Objects.equals(this.enabled, objRemoteController.enabled)&&
  Objects.equals(this.address, objRemoteController.address)&&
  Objects.equals(this.username, objRemoteController.username)&&
  Objects.equals(this.password, objRemoteController.password)&&
  Objects.equals(this.tenant, objRemoteController.tenant);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RemoteController {\n");
                  sb.append("    address: ").append(toIndentedString(address)).append("\n");
                        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
                        sb.append("    password: ").append(toIndentedString(password)).append("\n");
                        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
                        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

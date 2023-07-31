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
 * The AdminAuthConfiguration is a POJO class extends AviRestResource that used for creating
 * AdminAuthConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdminAuthConfiguration  {
    @JsonProperty("allow_local_user_login")
    private Boolean allowLocalUserLogin = true;

    @JsonProperty("remote_auth_configurations")
    private List<RemoteAuthConfiguration> remoteAuthConfigurations = null;

    @JsonProperty("service_auth_configurations")
    private List<ServiceAuthConfiguration> serviceAuthConfigurations = null;



    /**
     * This is the getter method this will return the attribute value.
     * Allow any user created locally to login with local credentials.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return allowLocalUserLogin
     */
    public Boolean getAllowLocalUserLogin() {
        return allowLocalUserLogin;
    }

    /**
     * This is the setter method to the attribute.
     * Allow any user created locally to login with local credentials.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param allowLocalUserLogin set the allowLocalUserLogin.
     */
    public void setAllowLocalUserLogin(Boolean  allowLocalUserLogin) {
        this.allowLocalUserLogin = allowLocalUserLogin;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Remote auth configurations.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return remoteAuthConfigurations
     */
    public List<RemoteAuthConfiguration> getRemoteAuthConfigurations() {
        return remoteAuthConfigurations;
    }

    /**
     * This is the setter method. this will set the remoteAuthConfigurations
     * Remote auth configurations.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return remoteAuthConfigurations
     */
    public void setRemoteAuthConfigurations(List<RemoteAuthConfiguration>  remoteAuthConfigurations) {
        this.remoteAuthConfigurations = remoteAuthConfigurations;
    }

    /**
     * This is the setter method this will set the remoteAuthConfigurations
     * Remote auth configurations.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return remoteAuthConfigurations
     */
    public AdminAuthConfiguration addRemoteAuthConfigurationsItem(RemoteAuthConfiguration remoteAuthConfigurationsItem) {
      if (this.remoteAuthConfigurations == null) {
        this.remoteAuthConfigurations = new ArrayList<RemoteAuthConfiguration>();
      }
      this.remoteAuthConfigurations.add(remoteAuthConfigurationsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Service auth configurations.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceAuthConfigurations
     */
    public List<ServiceAuthConfiguration> getServiceAuthConfigurations() {
        return serviceAuthConfigurations;
    }

    /**
     * This is the setter method. this will set the serviceAuthConfigurations
     * Service auth configurations.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceAuthConfigurations
     */
    public void setServiceAuthConfigurations(List<ServiceAuthConfiguration>  serviceAuthConfigurations) {
        this.serviceAuthConfigurations = serviceAuthConfigurations;
    }

    /**
     * This is the setter method this will set the serviceAuthConfigurations
     * Service auth configurations.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceAuthConfigurations
     */
    public AdminAuthConfiguration addServiceAuthConfigurationsItem(ServiceAuthConfiguration serviceAuthConfigurationsItem) {
      if (this.serviceAuthConfigurations == null) {
        this.serviceAuthConfigurations = new ArrayList<ServiceAuthConfiguration>();
      }
      this.serviceAuthConfigurations.add(serviceAuthConfigurationsItem);
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
      AdminAuthConfiguration objAdminAuthConfiguration = (AdminAuthConfiguration) o;
      return   Objects.equals(this.allowLocalUserLogin, objAdminAuthConfiguration.allowLocalUserLogin)&&
  Objects.equals(this.remoteAuthConfigurations, objAdminAuthConfiguration.remoteAuthConfigurations)&&
  Objects.equals(this.serviceAuthConfigurations, objAdminAuthConfiguration.serviceAuthConfigurations);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AdminAuthConfiguration {\n");
                  sb.append("    allowLocalUserLogin: ").append(toIndentedString(allowLocalUserLogin)).append("\n");
                        sb.append("    remoteAuthConfigurations: ").append(toIndentedString(remoteAuthConfigurations)).append("\n");
                        sb.append("    serviceAuthConfigurations: ").append(toIndentedString(serviceAuthConfigurations)).append("\n");
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

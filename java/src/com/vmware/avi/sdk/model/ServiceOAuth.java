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
 * The ServiceOAuth is a POJO class extends AviRestResource that used for creating
 * ServiceOAuth.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceOAuth  {
    @JsonProperty("authorization_endpoint")
    private String authorizationEndpoint;

    @JsonProperty("client_id")
    private String clientId;

    @JsonProperty("org_id")
    private String orgId;

    @JsonProperty("service_id")
    private String serviceId;

    @JsonProperty("service_name")
    private String serviceName;



    /**
     * This is the getter method this will return the attribute value.
     * Url of authorization server.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return authorizationEndpoint
     */
    public String getAuthorizationEndpoint() {
        return authorizationEndpoint;
    }

    /**
     * This is the setter method to the attribute.
     * Url of authorization server.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param authorizationEndpoint set the authorizationEndpoint.
     */
    public void setAuthorizationEndpoint(String  authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Application specific identifier for service auth.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * This is the setter method to the attribute.
     * Application specific identifier for service auth.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientId set the clientId.
     */
    public void setClientId(String  clientId) {
        this.clientId = clientId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Organization id for service oauth(required for csp).
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return orgId
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * This is the setter method to the attribute.
     * Organization id for service oauth(required for csp).
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param orgId set the orgId.
     */
    public void setOrgId(String  orgId) {
        this.orgId = orgId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid value of the service(required for csp).
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid value of the service(required for csp).
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serviceId set the serviceId.
     */
    public void setServiceId(String  serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the service(required for csp).
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the service(required for csp).
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serviceName set the serviceName.
     */
    public void setServiceName(String  serviceName) {
        this.serviceName = serviceName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ServiceOAuth objServiceOAuth = (ServiceOAuth) o;
      return   Objects.equals(this.authorizationEndpoint, objServiceOAuth.authorizationEndpoint)&&
  Objects.equals(this.orgId, objServiceOAuth.orgId)&&
  Objects.equals(this.serviceId, objServiceOAuth.serviceId)&&
  Objects.equals(this.serviceName, objServiceOAuth.serviceName)&&
  Objects.equals(this.clientId, objServiceOAuth.clientId);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ServiceOAuth {\n");
                  sb.append("    authorizationEndpoint: ").append(toIndentedString(authorizationEndpoint)).append("\n");
                        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
                        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
                        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
                        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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

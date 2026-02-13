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
 * The ManagementServiceAccessGrantEventDetails is a POJO class extends AviRestResource that used for creating
 * ManagementServiceAccessGrantEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ManagementServiceAccessGrantEventDetails  {
    @JsonProperty("access_grant_name")
    private String accessGrantName;

    @JsonProperty("cc_id")
    private String ccId;

    @JsonProperty("error_string")
    private String errorString;

    @JsonProperty("management_service_name")
    private String managementServiceName;

    @JsonProperty("namespace")
    private String namespace;

    @JsonProperty("vcenter_url")
    private String vcenterUrl;



    /**
     * This is the getter method this will return the attribute value.
     * Name of the access grant authorizing vm access to avi controller.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return accessGrantName
     */
    public String getAccessGrantName() {
        return accessGrantName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the access grant authorizing vm access to avi controller.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param accessGrantName set the accessGrantName.
     */
    public void setAccessGrantName(String  accessGrantName) {
        this.accessGrantName = accessGrantName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Cloud uuid associated with the nsx-t cloud configuration.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ccId
     */
    public String getCcId() {
        return ccId;
    }

    /**
     * This is the setter method to the attribute.
     * Cloud uuid associated with the nsx-t cloud configuration.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ccId set the ccId.
     */
    public void setCcId(String  ccId) {
        this.ccId = ccId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Error message describing the failure reason (empty on success).
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorString
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * This is the setter method to the attribute.
     * Error message describing the failure reason (empty on success).
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param errorString set the errorString.
     */
    public void setErrorString(String  errorString) {
        this.errorString = errorString;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the management service exposing the avi controller endpoint.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return managementServiceName
     */
    public String getManagementServiceName() {
        return managementServiceName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the management service exposing the avi controller endpoint.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param managementServiceName set the managementServiceName.
     */
    public void setManagementServiceName(String  managementServiceName) {
        this.managementServiceName = managementServiceName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vsphere namespace for which access to avi controller is granted.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * This is the setter method to the attribute.
     * Vsphere namespace for which access to avi controller is granted.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param namespace set the namespace.
     */
    public void setNamespace(String  namespace) {
        this.namespace = namespace;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vcenter url used for the api operation.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterUrl
     */
    public String getVcenterUrl() {
        return vcenterUrl;
    }

    /**
     * This is the setter method to the attribute.
     * Vcenter url used for the api operation.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterUrl set the vcenterUrl.
     */
    public void setVcenterUrl(String  vcenterUrl) {
        this.vcenterUrl = vcenterUrl;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ManagementServiceAccessGrantEventDetails objManagementServiceAccessGrantEventDetails = (ManagementServiceAccessGrantEventDetails) o;
      return   Objects.equals(this.ccId, objManagementServiceAccessGrantEventDetails.ccId)&&
  Objects.equals(this.accessGrantName, objManagementServiceAccessGrantEventDetails.accessGrantName)&&
  Objects.equals(this.namespace, objManagementServiceAccessGrantEventDetails.namespace)&&
  Objects.equals(this.managementServiceName, objManagementServiceAccessGrantEventDetails.managementServiceName)&&
  Objects.equals(this.vcenterUrl, objManagementServiceAccessGrantEventDetails.vcenterUrl)&&
  Objects.equals(this.errorString, objManagementServiceAccessGrantEventDetails.errorString);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ManagementServiceAccessGrantEventDetails {\n");
                  sb.append("    accessGrantName: ").append(toIndentedString(accessGrantName)).append("\n");
                        sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
                        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
                        sb.append("    managementServiceName: ").append(toIndentedString(managementServiceName)).append("\n");
                        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
                        sb.append("    vcenterUrl: ").append(toIndentedString(vcenterUrl)).append("\n");
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

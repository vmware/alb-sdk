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
 * The ManagementServiceEventDetails is a POJO class extends AviRestResource that used for creating
 * ManagementServiceEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ManagementServiceEventDetails  {
    @JsonProperty("cc_id")
    private String ccId;

    @JsonProperty("error_string")
    private String errorString;

    @JsonProperty("management_service_name")
    private String managementServiceName;

    @JsonProperty("supervisor_id")
    private String supervisorId;

    @JsonProperty("vcenter_url")
    private String vcenterUrl;



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
     * Supervisor cluster identifier where the management service is configured.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return supervisorId
     */
    public String getSupervisorId() {
        return supervisorId;
    }

    /**
     * This is the setter method to the attribute.
     * Supervisor cluster identifier where the management service is configured.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param supervisorId set the supervisorId.
     */
    public void setSupervisorId(String  supervisorId) {
        this.supervisorId = supervisorId;
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
      ManagementServiceEventDetails objManagementServiceEventDetails = (ManagementServiceEventDetails) o;
      return   Objects.equals(this.ccId, objManagementServiceEventDetails.ccId)&&
  Objects.equals(this.managementServiceName, objManagementServiceEventDetails.managementServiceName)&&
  Objects.equals(this.supervisorId, objManagementServiceEventDetails.supervisorId)&&
  Objects.equals(this.vcenterUrl, objManagementServiceEventDetails.vcenterUrl)&&
  Objects.equals(this.errorString, objManagementServiceEventDetails.errorString);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ManagementServiceEventDetails {\n");
                  sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
                        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
                        sb.append("    managementServiceName: ").append(toIndentedString(managementServiceName)).append("\n");
                        sb.append("    supervisorId: ").append(toIndentedString(supervisorId)).append("\n");
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

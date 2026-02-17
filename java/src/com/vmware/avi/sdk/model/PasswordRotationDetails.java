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
 * The PasswordRotationDetails is a POJO class extends AviRestResource that used for creating
 * PasswordRotationDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PasswordRotationDetails extends AviRestResource  {
    @JsonProperty("credential_type")
    private String credentialType;

    @JsonProperty("error_string")
    private String errorString;

    @JsonProperty("name")
    private String name;

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Type of credential (nsx-t or vcenter).
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return credentialType
     */
    public String getCredentialType() {
        return credentialType;
    }

    /**
     * This is the setter method to the attribute.
     * Type of credential (nsx-t or vcenter).
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param credentialType set the credentialType.
     */
    public void setCredentialType(String  credentialType) {
        this.credentialType = credentialType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Error message if rotation failed.
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
     * Error message if rotation failed.
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
     * Name of the cloudconnectoruser.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the cloudconnectoruser.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the cloudconnectoruser.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the cloudconnectoruser.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      PasswordRotationDetails objPasswordRotationDetails = (PasswordRotationDetails) o;
      return   Objects.equals(this.name, objPasswordRotationDetails.name)&&
  Objects.equals(this.uuid, objPasswordRotationDetails.uuid)&&
  Objects.equals(this.errorString, objPasswordRotationDetails.errorString)&&
  Objects.equals(this.credentialType, objPasswordRotationDetails.credentialType);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PasswordRotationDetails {\n");
                  sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
                        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

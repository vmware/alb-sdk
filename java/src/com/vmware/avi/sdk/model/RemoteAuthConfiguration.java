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
 * The RemoteAuthConfiguration is a POJO class extends AviRestResource that used for creating
 * RemoteAuthConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoteAuthConfiguration  {
    @JsonProperty("auth_mapping_profile_ref")
    private String authMappingProfileRef = null;

    @JsonProperty("auth_profile_ref")
    private String authProfileRef = null;

    @JsonProperty("index")
    private Integer index = null;



    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the authmappingprofile(set of auth mapping rules) to be assigned to a user on successful match.
     * It is a reference to an object of type authmappingprofile.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return authMappingProfileRef
     */
    public String getAuthMappingProfileRef() {
        return authMappingProfileRef;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the authmappingprofile(set of auth mapping rules) to be assigned to a user on successful match.
     * It is a reference to an object of type authmappingprofile.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param authMappingProfileRef set the authMappingProfileRef.
     */
    public void setAuthMappingProfileRef(String  authMappingProfileRef) {
        this.authMappingProfileRef = authMappingProfileRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the auth profile.
     * It is a reference to an object of type authprofile.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return authProfileRef
     */
    public String getAuthProfileRef() {
        return authProfileRef;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the auth profile.
     * It is a reference to an object of type authprofile.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param authProfileRef set the authProfileRef.
     */
    public void setAuthProfileRef(String  authProfileRef) {
        this.authProfileRef = authProfileRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Index used for maintaining order of remoteauthconfiguration.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * This is the setter method to the attribute.
     * Index used for maintaining order of remoteauthconfiguration.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param index set the index.
     */
    public void setIndex(Integer  index) {
        this.index = index;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      RemoteAuthConfiguration objRemoteAuthConfiguration = (RemoteAuthConfiguration) o;
      return   Objects.equals(this.index, objRemoteAuthConfiguration.index)&&
  Objects.equals(this.authProfileRef, objRemoteAuthConfiguration.authProfileRef)&&
  Objects.equals(this.authMappingProfileRef, objRemoteAuthConfiguration.authMappingProfileRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RemoteAuthConfiguration {\n");
                  sb.append("    authMappingProfileRef: ").append(toIndentedString(authMappingProfileRef)).append("\n");
                        sb.append("    authProfileRef: ").append(toIndentedString(authProfileRef)).append("\n");
                        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

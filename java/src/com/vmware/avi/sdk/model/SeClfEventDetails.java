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
 * The SeClfEventDetails is a POJO class extends AviRestResource that used for creating
 * SeClfEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeClfEventDetails  {
    @JsonProperty("clf_pool")
    private String clfPool;

    @JsonProperty("clf_profile")
    private String clfProfile;

    @JsonProperty("server")
    private SeHmEventServerDetails server;



    /**
     * This is the getter method this will return the attribute value.
     * Name of the clf pool.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clfPool
     */
    public String getClfPool() {
        return clfPool;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the clf pool.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clfPool set the clfPool.
     */
    public void setClfPool(String  clfPool) {
        this.clfPool = clfPool;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the clfprofile that owns the clf pool.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clfProfile
     */
    public String getClfProfile() {
        return clfProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the clfprofile that owns the clf pool.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clfProfile set the clfProfile.
     */
    public void setClfProfile(String  clfProfile) {
        this.clfProfile = clfProfile;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Clf server (collector) details.
     * For pool events, the last server that changed state, if any.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return server
     */
    public SeHmEventServerDetails getServer() {
        return server;
    }

    /**
     * This is the setter method to the attribute.
     * Clf server (collector) details.
     * For pool events, the last server that changed state, if any.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param server set the server.
     */
    public void setServer(SeHmEventServerDetails server) {
        this.server = server;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SeClfEventDetails objSeClfEventDetails = (SeClfEventDetails) o;
      return   Objects.equals(this.clfProfile, objSeClfEventDetails.clfProfile)&&
  Objects.equals(this.clfPool, objSeClfEventDetails.clfPool)&&
  Objects.equals(this.server, objSeClfEventDetails.server);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeClfEventDetails {\n");
                  sb.append("    clfPool: ").append(toIndentedString(clfPool)).append("\n");
                        sb.append("    clfProfile: ").append(toIndentedString(clfProfile)).append("\n");
                        sb.append("    server: ").append(toIndentedString(server)).append("\n");
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

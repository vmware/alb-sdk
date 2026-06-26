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
 * The ApiServerInfo is a POJO class extends AviRestResource that used for creating
 * ApiServerInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiServerInfo  {
    @JsonProperty("path_prefix")
    private String pathPrefix;

    @JsonProperty("servers")
    private List<ApiSpecServer> servers;



    /**
     * This is the getter method this will return the attribute value.
     * Common url path prefix derived from server urls.
     * Automatically populated by pbresolve from the path sections of servers[].url.
     * All server urls must share the same path section.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return pathPrefix
     */
    public String getPathPrefix() {
        return pathPrefix;
    }

    /**
     * This is the setter method to the attribute.
     * Common url path prefix derived from server urls.
     * Automatically populated by pbresolve from the path sections of servers[].url.
     * All server urls must share the same path section.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param pathPrefix set the pathPrefix.
     */
    public void setPathPrefix(String  pathPrefix) {
        this.pathPrefix = pathPrefix;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of servers that define the scope of this api policy.
     * A request that does not match any server url is considered outside this policy's scope and is treated as non-api traffic.
     * In evh deployments, each server url is used to generate a vhmatch entry that selects the correct child vs by matching the request hostname and
     * path prefix.
     * Field introduced in 32.2.1.
     * Maximum of 100 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return servers
     */
    public List<ApiSpecServer> getServers() {
        return servers;
    }

    /**
     * This is the setter method. this will set the servers
     * List of servers that define the scope of this api policy.
     * A request that does not match any server url is considered outside this policy's scope and is treated as non-api traffic.
     * In evh deployments, each server url is used to generate a vhmatch entry that selects the correct child vs by matching the request hostname and
     * path prefix.
     * Field introduced in 32.2.1.
     * Maximum of 100 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return servers
     */
    public void setServers(List<ApiSpecServer>  servers) {
        this.servers = servers;
    }

    /**
     * This is the setter method this will set the servers
     * List of servers that define the scope of this api policy.
     * A request that does not match any server url is considered outside this policy's scope and is treated as non-api traffic.
     * In evh deployments, each server url is used to generate a vhmatch entry that selects the correct child vs by matching the request hostname and
     * path prefix.
     * Field introduced in 32.2.1.
     * Maximum of 100 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return servers
     */
    public ApiServerInfo addServersItem(ApiSpecServer serversItem) {
      if (this.servers == null) {
        this.servers = new ArrayList<ApiSpecServer>();
      }
      this.servers.add(serversItem);
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
      ApiServerInfo objApiServerInfo = (ApiServerInfo) o;
      return   Objects.equals(this.servers, objApiServerInfo.servers)&&
  Objects.equals(this.pathPrefix, objApiServerInfo.pathPrefix);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApiServerInfo {\n");
                  sb.append("    pathPrefix: ").append(toIndentedString(pathPrefix)).append("\n");
                        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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

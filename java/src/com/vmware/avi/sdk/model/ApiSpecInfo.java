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
 * The ApiSpecInfo is a POJO class extends AviRestResource that used for creating
 * ApiSpecInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiSpecInfo  {
    @JsonProperty("component_schema_count")
    private Integer componentSchemaCount;

    @JsonProperty("description")
    private String description;

    @JsonProperty("inline_schema_count")
    private Integer inlineSchemaCount;

    @JsonProperty("oas_version")
    private String oasVersion;

    @JsonProperty("path_count")
    private Integer pathCount;

    @JsonProperty("servers")
    private List<ApiSpecServer> servers;

    @JsonProperty("title")
    private String title;

    @JsonProperty("version")
    private String version;



    /**
     * This is the getter method this will return the attribute value.
     * Number of schemas defined in the components/schemas section of the openapi document.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return componentSchemaCount
     */
    public Integer getComponentSchemaCount() {
        return componentSchemaCount;
    }

    /**
     * This is the setter method to the attribute.
     * Number of schemas defined in the components/schemas section of the openapi document.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param componentSchemaCount set the componentSchemaCount.
     */
    public void setComponentSchemaCount(Integer  componentSchemaCount) {
        this.componentSchemaCount = componentSchemaCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Description of the openapi document from the info object.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Description of the openapi document from the info object.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of complex inline schemas promoted to top-level apischema objects during import.
     * Schemas are promoted when they contain object properties, array constraints, or composite types (oneof/anyof/allof).
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return inlineSchemaCount
     */
    public Integer getInlineSchemaCount() {
        return inlineSchemaCount;
    }

    /**
     * This is the setter method to the attribute.
     * Number of complex inline schemas promoted to top-level apischema objects during import.
     * Schemas are promoted when they contain object properties, array constraints, or composite types (oneof/anyof/allof).
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param inlineSchemaCount set the inlineSchemaCount.
     */
    public void setInlineSchemaCount(Integer  inlineSchemaCount) {
        this.inlineSchemaCount = inlineSchemaCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Openapi specification version.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return oasVersion
     */
    public String getOasVersion() {
        return oasVersion;
    }

    /**
     * This is the setter method to the attribute.
     * Openapi specification version.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param oasVersion set the oasVersion.
     */
    public void setOasVersion(String  oasVersion) {
        this.oasVersion = oasVersion;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of paths in the openapi document.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return pathCount
     */
    public Integer getPathCount() {
        return pathCount;
    }

    /**
     * This is the setter method to the attribute.
     * Number of paths in the openapi document.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param pathCount set the pathCount.
     */
    public void setPathCount(Integer  pathCount) {
        this.pathCount = pathCount;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of server urls extracted from the openapi document's servers section.
     * Field introduced in 32.1.4.
     * Maximum of 100 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return servers
     */
    public List<ApiSpecServer> getServers() {
        return servers;
    }

    /**
     * This is the setter method. this will set the servers
     * List of server urls extracted from the openapi document's servers section.
     * Field introduced in 32.1.4.
     * Maximum of 100 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return servers
     */
    public void setServers(List<ApiSpecServer>  servers) {
        this.servers = servers;
    }

    /**
     * This is the setter method this will set the servers
     * List of server urls extracted from the openapi document's servers section.
     * Field introduced in 32.1.4.
     * Maximum of 100 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return servers
     */
    public ApiSpecInfo addServersItem(ApiSpecServer serversItem) {
      if (this.servers == null) {
        this.servers = new ArrayList<ApiSpecServer>();
      }
      this.servers.add(serversItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Title of the openapi document.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * This is the setter method to the attribute.
     * Title of the openapi document.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param title set the title.
     */
    public void setTitle(String  title) {
        this.title = title;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Version of the openapi document, which is distinct from the openapi specification version (oas_version).
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * This is the setter method to the attribute.
     * Version of the openapi document, which is distinct from the openapi specification version (oas_version).
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param version set the version.
     */
    public void setVersion(String  version) {
        this.version = version;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApiSpecInfo objApiSpecInfo = (ApiSpecInfo) o;
      return   Objects.equals(this.oasVersion, objApiSpecInfo.oasVersion)&&
  Objects.equals(this.title, objApiSpecInfo.title)&&
  Objects.equals(this.version, objApiSpecInfo.version)&&
  Objects.equals(this.servers, objApiSpecInfo.servers)&&
  Objects.equals(this.pathCount, objApiSpecInfo.pathCount)&&
  Objects.equals(this.inlineSchemaCount, objApiSpecInfo.inlineSchemaCount)&&
  Objects.equals(this.componentSchemaCount, objApiSpecInfo.componentSchemaCount)&&
  Objects.equals(this.description, objApiSpecInfo.description);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApiSpecInfo {\n");
                  sb.append("    componentSchemaCount: ").append(toIndentedString(componentSchemaCount)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    inlineSchemaCount: ").append(toIndentedString(inlineSchemaCount)).append("\n");
                        sb.append("    oasVersion: ").append(toIndentedString(oasVersion)).append("\n");
                        sb.append("    pathCount: ").append(toIndentedString(pathCount)).append("\n");
                        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
                        sb.append("    title: ").append(toIndentedString(title)).append("\n");
                        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

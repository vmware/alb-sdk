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
 * The JWTProtectedResourceConfig is a POJO class extends AviRestResource that used for creating
 * JWTProtectedResourceConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JWTProtectedResourceConfig  {
    @JsonProperty("authorization_servers")
    private List<String> authorizationServers;

    @JsonProperty("enable_protected_resource_metadata")
    private Boolean enableProtectedResourceMetadata = false;

    @JsonProperty("metadata_url_path")
    private String metadataUrlPath = "/.well-known/oauth-protected-resource";

    @JsonProperty("resource_documentation")
    private String resourceDocumentation;

    @JsonProperty("supported_scopes")
    private List<String> supportedScopes;


    /**
     * This is the getter method this will return the attribute value.
     * List of authorization server issuer urls that can issue tokens for this protected resource.
     * Field introduced in 32.1.1.
     * Maximum of 1 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return authorizationServers
     */
    public List<String> getAuthorizationServers() {
        return authorizationServers;
    }

    /**
     * This is the setter method. this will set the authorizationServers
     * List of authorization server issuer urls that can issue tokens for this protected resource.
     * Field introduced in 32.1.1.
     * Maximum of 1 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return authorizationServers
     */
    public void setAuthorizationServers(List<String>  authorizationServers) {
        this.authorizationServers = authorizationServers;
    }

    /**
     * This is the setter method this will set the authorizationServers
     * List of authorization server issuer urls that can issue tokens for this protected resource.
     * Field introduced in 32.1.1.
     * Maximum of 1 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return authorizationServers
     */
    public JWTProtectedResourceConfig addAuthorizationServersItem(String authorizationServersItem) {
      if (this.authorizationServers == null) {
        this.authorizationServers = new ArrayList<String>();
      }
      this.authorizationServers.add(authorizationServersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable oauth 2.0 protected resource metadata (rfc 9728) support.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableProtectedResourceMetadata
     */
    public Boolean getEnableProtectedResourceMetadata() {
        return enableProtectedResourceMetadata;
    }

    /**
     * This is the setter method to the attribute.
     * Enable oauth 2.0 protected resource metadata (rfc 9728) support.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableProtectedResourceMetadata set the enableProtectedResourceMetadata.
     */
    public void setEnableProtectedResourceMetadata(Boolean  enableProtectedResourceMetadata) {
        this.enableProtectedResourceMetadata = enableProtectedResourceMetadata;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Url path where oauth 2.0 protected resource metadata is published.
     * This is relative to the virtual service.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "/.well-known/oauth-protected-resource".
     * @return metadataUrlPath
     */
    public String getMetadataUrlPath() {
        return metadataUrlPath;
    }

    /**
     * This is the setter method to the attribute.
     * Url path where oauth 2.0 protected resource metadata is published.
     * This is relative to the virtual service.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "/.well-known/oauth-protected-resource".
     * @param metadataUrlPath set the metadataUrlPath.
     */
    public void setMetadataUrlPath(String  metadataUrlPath) {
        this.metadataUrlPath = metadataUrlPath;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Url of documentation for this protected resource.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return resourceDocumentation
     */
    public String getResourceDocumentation() {
        return resourceDocumentation;
    }

    /**
     * This is the setter method to the attribute.
     * Url of documentation for this protected resource.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param resourceDocumentation set the resourceDocumentation.
     */
    public void setResourceDocumentation(String  resourceDocumentation) {
        this.resourceDocumentation = resourceDocumentation;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of oauth 2.0 scopes supported by this protected resource.
     * Field introduced in 32.1.1.
     * Maximum of 20 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return supportedScopes
     */
    public List<String> getSupportedScopes() {
        return supportedScopes;
    }

    /**
     * This is the setter method. this will set the supportedScopes
     * List of oauth 2.0 scopes supported by this protected resource.
     * Field introduced in 32.1.1.
     * Maximum of 20 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return supportedScopes
     */
    public void setSupportedScopes(List<String>  supportedScopes) {
        this.supportedScopes = supportedScopes;
    }

    /**
     * This is the setter method this will set the supportedScopes
     * List of oauth 2.0 scopes supported by this protected resource.
     * Field introduced in 32.1.1.
     * Maximum of 20 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return supportedScopes
     */
    public JWTProtectedResourceConfig addSupportedScopesItem(String supportedScopesItem) {
      if (this.supportedScopes == null) {
        this.supportedScopes = new ArrayList<String>();
      }
      this.supportedScopes.add(supportedScopesItem);
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
      JWTProtectedResourceConfig objJWTProtectedResourceConfig = (JWTProtectedResourceConfig) o;
      return   Objects.equals(this.enableProtectedResourceMetadata, objJWTProtectedResourceConfig.enableProtectedResourceMetadata)&&
  Objects.equals(this.metadataUrlPath, objJWTProtectedResourceConfig.metadataUrlPath)&&
  Objects.equals(this.authorizationServers, objJWTProtectedResourceConfig.authorizationServers)&&
  Objects.equals(this.supportedScopes, objJWTProtectedResourceConfig.supportedScopes)&&
  Objects.equals(this.resourceDocumentation, objJWTProtectedResourceConfig.resourceDocumentation);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class JWTProtectedResourceConfig {\n");
                  sb.append("    authorizationServers: ").append(toIndentedString(authorizationServers)).append("\n");
                        sb.append("    enableProtectedResourceMetadata: ").append(toIndentedString(enableProtectedResourceMetadata)).append("\n");
                        sb.append("    metadataUrlPath: ").append(toIndentedString(metadataUrlPath)).append("\n");
                        sb.append("    resourceDocumentation: ").append(toIndentedString(resourceDocumentation)).append("\n");
                        sb.append("    supportedScopes: ").append(toIndentedString(supportedScopes)).append("\n");
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

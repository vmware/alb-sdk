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
 * The ApiPath is a POJO class extends AviRestResource that used for creating
 * ApiPath.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiPath extends AviRestResource  {
    @JsonProperty("description")
    private String description;

    @JsonProperty("endpoints")
    private List<ApiEndpoint> endpoints;

    @JsonProperty("name")
    private String name;

    @JsonProperty("path_template")
    private String pathTemplate;

    @JsonProperty("source")
    private String source;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("unknown_http_method_action")
    private String unknownHttpMethodAction = "API_ACTION_INHERIT_FROM_API_POLICY";

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Description of this api path.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Description of this api path.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of api endpoints for this path.
     * Field introduced in 32.1.4.
     * Maximum of 10 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return endpoints
     */
    public List<ApiEndpoint> getEndpoints() {
        return endpoints;
    }

    /**
     * This is the setter method. this will set the endpoints
     * List of api endpoints for this path.
     * Field introduced in 32.1.4.
     * Maximum of 10 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return endpoints
     */
    public void setEndpoints(List<ApiEndpoint>  endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * This is the setter method this will set the endpoints
     * List of api endpoints for this path.
     * Field introduced in 32.1.4.
     * Maximum of 10 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return endpoints
     */
    public ApiPath addEndpointsItem(ApiEndpoint endpointsItem) {
      if (this.endpoints == null) {
        this.endpoints = new ArrayList<ApiEndpoint>();
      }
      this.endpoints.add(endpointsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of this object, unique per tenant.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of this object, unique per tenant.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The uri path template for the object.
     * Parameters can be defined in curly braces, for example /pet/{pet_id}.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pathTemplate
     */
    public String getPathTemplate() {
        return pathTemplate;
    }

    /**
     * This is the setter method to the attribute.
     * The uri path template for the object.
     * Parameters can be defined in curly braces, for example /pet/{pet_id}.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param pathTemplate set the pathTemplate.
     */
    public void setPathTemplate(String  pathTemplate) {
        this.pathTemplate = pathTemplate;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Indicates whether this path was user-defined or imported from an openapi specification file.
     * Enum options - SOURCE_USER_DEFINED, SOURCE_API_SPEC, SOURCE_DISCOVERED.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * This is the setter method to the attribute.
     * Indicates whether this path was user-defined or imported from an openapi specification file.
     * Enum options - SOURCE_USER_DEFINED, SOURCE_API_SPEC, SOURCE_DISCOVERED.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param source set the source.
     */
    public void setSource(String  source) {
        this.source = source;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type tenant.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type tenant.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantRef set the tenantRef.
     */
    public void setTenantRef(String  tenantRef) {
        this.tenantRef = tenantRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Action to take when a request matches this path but uses an http method not defined for this path.
     * Overrides the policy-level unknown_http_method_action when not inherit.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_INHERIT_FROM_API_POLICY".
     * @return unknownHttpMethodAction
     */
    public String getUnknownHttpMethodAction() {
        return unknownHttpMethodAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action to take when a request matches this path but uses an http method not defined for this path.
     * Overrides the policy-level unknown_http_method_action when not inherit.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_INHERIT_FROM_API_POLICY".
     * @param unknownHttpMethodAction set the unknownHttpMethodAction.
     */
    public void setUnknownHttpMethodAction(String  unknownHttpMethodAction) {
        this.unknownHttpMethodAction = unknownHttpMethodAction;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Avi controller URL of the object.
     * @return url
     */
    public String getUrl() {
        return url;
    }

   /**
    * This is the setter method. this will set the url
    * Avi controller URL of the object.
    * @return url
    */
   public void setUrl(String  url) {
     this.url = url;
   }

    /**
     * This is the getter method this will return the attribute value.
     * The object uuid.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * The object uuid.
     * Field introduced in 32.1.4.
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
      ApiPath objApiPath = (ApiPath) o;
      return   Objects.equals(this.uuid, objApiPath.uuid)&&
  Objects.equals(this.name, objApiPath.name)&&
  Objects.equals(this.description, objApiPath.description)&&
  Objects.equals(this.source, objApiPath.source)&&
  Objects.equals(this.pathTemplate, objApiPath.pathTemplate)&&
  Objects.equals(this.endpoints, objApiPath.endpoints)&&
  Objects.equals(this.unknownHttpMethodAction, objApiPath.unknownHttpMethodAction)&&
  Objects.equals(this.tenantRef, objApiPath.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApiPath {\n");
                  sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    pathTemplate: ").append(toIndentedString(pathTemplate)).append("\n");
                        sb.append("    source: ").append(toIndentedString(source)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                        sb.append("    unknownHttpMethodAction: ").append(toIndentedString(unknownHttpMethodAction)).append("\n");
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
